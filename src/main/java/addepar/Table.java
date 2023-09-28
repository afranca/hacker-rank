package addepar;

import java.util.*;


public class Table {

    public boolean isTransactionStarted = false;
    Map<String, Map<String, String>> originalTable = new HashMap<>();
    Map<String, Map<String, String>> tempTable = new HashMap<>();

    List<Action> actions = new ArrayList<>();

    //List<String> createActions = new ArrayList<>();
    //List<String> deleteActions = new ArrayList<>();
    ////////////////////////////////////////
    // Data operations

    public void createRow(String rowName) {
        //createActions.add(rowName);
        if (isTransactionStarted){
            tempTable.put(rowName, new HashMap<String, String>());
            actions.add(new Action("create",rowName));
        } else {
            originalTable.put(rowName, new HashMap<String, String>());
        }
    }

    public void deleteRow(String rowName) {
        //deleteActions.add(rowName);
        if (isTransactionStarted){
            tempTable.remove(rowName);
            actions.add(new Action("delete",rowName));
        } else {
            originalTable.remove(rowName);
        }

    }

    public void updateCell(String rowName, String columnName, String newVal) {
        //System.out.println("** updating **");
        Map<String, String> changedRow = new HashMap<>();
        changedRow.put(columnName, newVal);
        if (isTransactionStarted){
            tempTable.put(rowName, changedRow);
            actions.add(new Action("update",rowName, columnName, newVal));
        } else {
            originalTable.put(rowName, changedRow);
        }
    }

    public void showTable() {
        String status ;
        Map<String, Map<String, String>> tableToShow;
        if (isTransactionStarted){
            tableToShow = tempTable;
            status = "Uncommitted";
        } else {
            tableToShow = originalTable;
            status = "Committed";
        }

        System.out.print("Table ("+status+"): ");
        for (Map.Entry<String, Map<String, String>> row : tableToShow.entrySet()) {
            String rowName = row.getKey();
            Map<String, String> columnNames = row.getValue();
            System.out.print(rowName + ": ");
            for (Map.Entry<String, String> column : columnNames.entrySet()) {
                System.out.print("(" + column.getKey() + ", " + column.getValue() + ") ");
            }
            System.out.println();
        }

    }

    ////////////////////////////////////////
    // Transaction operations.

    public void beginTransaction() {
        isTransactionStarted = true;
    }

    public void commitTransaction() {
        for(Action action : actions){
            if (action.name.equalsIgnoreCase("create")){
                originalTable.put(action.rowName, new HashMap<String, String>());
            } else if (action.name.equalsIgnoreCase("delete")){
                originalTable.remove(action.rowName);
            } else {
                Map<String, String> row = originalTable.get(action.rowName);
                row.put(action.columnName, action.value);
            }
        }
        isTransactionStarted = false;
    }

    public void rollbackTransaction() {
        isTransactionStarted = false;
        tempTable.clear();
    }

    public static void main(String args[] ) throws Exception {
        // You can add test cases or operations in the main method.
        Table table = new Table();
        table.createRow("Row1");
        table.updateCell("Row1", "Column1", "Value1");
        table.showTable();

        table.beginTransaction();
        table.updateCell("Row1", "Column2", "Value2");
        table.showTable();
        table.updateCell("Row1", "Column1", "Value3");
        table.showTable();
        table.updateCell("Row1", "Column1", "Value5");
        table.showTable();
        table.commitTransaction();

        table.showTable();
    }
}

class Action {

    public String name;
    public String rowName;
    public String columnName;
    public String value;

    public Action (String actionName, String rowName){
        this.name = actionName;
        this.rowName = rowName;
    }

    public Action (String actionName, String rowName, String columnName, String value){
        this.name = actionName;
        this.rowName = rowName;
        this.columnName = columnName;
        this.value = value;
    }
}