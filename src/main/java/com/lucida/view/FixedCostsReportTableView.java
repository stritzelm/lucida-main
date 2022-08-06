package com.lucida.view;


import com.lucida.model.form.FixedCostsTableEntryForm;

import java.util.List;

public class FixedCostsReportTableView {
    private List<FixedCostsTableEntryForm> tableEntries;
    private String monthlyFixedExpenseTotal;
    private String annualFixedExpenseTotal;
    private String fixedExpensesTotalCostPerMile;

    public FixedCostsReportTableView() { }

    public List<FixedCostsTableEntryForm> getTableEntries() {
        return tableEntries;
    }
    public void setTableEntries(List<FixedCostsTableEntryForm> tableEntries) {
        this.tableEntries = tableEntries;
    }

    public String getMonthlyFixedExpenseTotal() {
        return monthlyFixedExpenseTotal;
    }
    public void setMonthlyFixedExpenseTotal(String monthlyFixedExpenseTotal) {
        this.monthlyFixedExpenseTotal = monthlyFixedExpenseTotal;
    }

    public String getAnnualFixedExpenseTotal() {
        return annualFixedExpenseTotal;
    }
    public void setAnnualFixedExpenseTotal(String annualFixedExpenseTotal) {
        this.annualFixedExpenseTotal = annualFixedExpenseTotal;
    }

    public String getFixedExpensesTotalCostPerMile() {
        return fixedExpensesTotalCostPerMile;
    }
    public void setFixedExpensesTotalCostPerMile(String fixedExpensesTotalCostPerMile) {
        this.fixedExpensesTotalCostPerMile = fixedExpensesTotalCostPerMile;
    }
}
