package addepar;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Table {

    public boolean isTransactionStarted = false;
    Map<String, Map<String, String>> originalTable = new HashMap<>();
    Map<String, Map<String, String>> changedTable = new HashMap<>();


    List<String> createActions = new ArrayList<>();
    List<String> deleteActions = new ArrayList<>();
    ////////////////////////////////////////
    // Data operations

    public void createRow(String rowName) {
        createActions.add(rowName);
    }

    public void deleteRow(String rowName) {
        deleteActions.add(rowName);
    }

    public void updateCell(String rowName, String columnName, String newVal) {
        Map<String, String> changedRow = new HashMap<>();
        changedRow.put(columnName, newVal);
        changedTable.put(rowName, changedRow);

    }
    public void showTable() {

    }

    ////////////////////////////////////////
    // Transaction operations.

    public void beginTransaction() {
        isTransactionStarted = true;
    }

    public void commitTransaction() {
        for(String rowName : createActions){
            originalTable.put(rowName, null);
        }

        for(String rowName : deleteActions){
            originalTable.remove(rowName);
        }

        Set<String> keys = changedTable.keySet();

    }

    public void rollbackTransaction() {

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

        table.commitTransaction();
        table.showTable();
    }
}
