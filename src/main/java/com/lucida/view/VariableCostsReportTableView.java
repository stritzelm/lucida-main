package com.lucida.view;

import com.lucida.model.form.VariableCostsTableEntryForm;

import java.util.List;

public class VariableCostsReportTableView {
    private List<VariableCostsTableEntryForm> tableEntries;
    private String monthlyVariableExpenseTotal;
    private String annualVariableExpenseTotal;
    private String variableExpensesTotalCostPerMile;

    public VariableCostsReportTableView() { }

    public List<VariableCostsTableEntryForm> getTableEntries() {
        return tableEntries;
    }
    public void setTableEntries(List<VariableCostsTableEntryForm> tableEntries) {
        this.tableEntries = tableEntries;
    }

    public String getMonthlyVariableExpenseTotal() {
        return monthlyVariableExpenseTotal;
    }
    public void setMonthlyVariableExpenseTotal(String monthlyVariableExpenseTotal) {
        this.monthlyVariableExpenseTotal = monthlyVariableExpenseTotal;
    }

    public String getAnnualVariableExpenseTotal() {
        return annualVariableExpenseTotal;
    }
    public void setAnnualVariableExpenseTotal(String annualVariableExpenseTotal) {
        this.annualVariableExpenseTotal = annualVariableExpenseTotal;
    }

    public String getVariableExpensesTotalCostPerMile() {
        return variableExpensesTotalCostPerMile;
    }
    public void setVariableExpensesTotalCostPerMile(String variableExpensesTotalCostPerMile) {
        this.variableExpensesTotalCostPerMile = variableExpensesTotalCostPerMile;
    }
}
