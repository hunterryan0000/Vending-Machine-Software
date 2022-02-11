package com.techelevator.App;

import com.techelevator.SalesReport.InventoryReport;
import com.techelevator.SalesReport.LogReport;
import com.techelevator.SalesReport.SalesReport;

public class VendoMatic600 {
    private String name;
    private SalesReport salesReport;
    private LogReport logReport;
    private InventoryReport inventoryReport;

    public VendoMatic600 (String name){
        this.name = name;
        this.salesReport = new SalesReport();
        this.logReport = new LogReport();
        this.inventoryReport = new InventoryReport();
    }

    public String getName(){
        return name;
    }


}
