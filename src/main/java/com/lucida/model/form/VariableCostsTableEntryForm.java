package com.lucida.model.form;

public class VariableCostsTableEntryForm {

    private String category;
    private float costPerMile;
    private float monthlyTotal;
    private float annualTotal;

    public VariableCostsTableEntryForm() { }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public float getCostPerMile() {
        return costPerMile;
    }
    public void setCostPerMile(float costPerMile) {
        this.costPerMile = costPerMile;
    }

    public float getMonthlyTotal() {
        return monthlyTotal;
    }
    public void setMonthlyTotal(float monthlyTotal) {
        this.monthlyTotal = monthlyTotal;
    }

    public float getAnnualTotal() {
        return annualTotal;
    }
    public void setAnnualTotal(float annualTotal) {
        this.annualTotal = annualTotal;
    }

}
