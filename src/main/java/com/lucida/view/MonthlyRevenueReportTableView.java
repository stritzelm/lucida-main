package com.lucida.view;

public class MonthlyRevenueReportTableView {
    // Properties
    private float revenuePerMile;
    private float costPerMile;
    private float profitPerMile;
    private float fixedCostPerDay;
    private float totalMonthlyIncome;
    private float totalAnnualIncome;

    private float monthlyMiles;
    private float annualMiles;

    // Constructor
    MonthlyRevenueReportTableView() {}

    // Getters & Setters
    public float getRevenuePerMile() {
        return revenuePerMile;
    }
    public void setRevenuePerMile(float revenuePerMile) {
        this.revenuePerMile = revenuePerMile;
    }

    public float getCostPerMile() {
        return costPerMile;
    }
    public void setCostPerMile(float costPerMile) {
        this.costPerMile = costPerMile;
    }

    public float getFixedCostPerDay() {
        return fixedCostPerDay;
    }
    public void setFixedCostPerDay(float fixedCostPerDay) {
        this.fixedCostPerDay = fixedCostPerDay;
    }

    public float getProfitPerMile() {
        return profitPerMile;
    }
    public void setProfitPerMile(float profitPerMile) {
        this.profitPerMile = profitPerMile;
    }

    public float getTotalAnnualIncome() {
        return totalAnnualIncome;
    }
    public void setTotalAnnualIncome(float totalAnnualIncome) {
        this.totalAnnualIncome = totalAnnualIncome;
    }

    public float getTotalMonthlyIncome() {
        return totalMonthlyIncome;
    }
    public void setTotalMonthlyIncome(float totalMonthlyIncome) {
        this.totalMonthlyIncome = totalMonthlyIncome;
    }

    public float getAnnualMiles() {
        return annualMiles;
    }
    public void setAnnualMiles(float annualMiles) {
        this.annualMiles = annualMiles;
    }

    public float getMonthlyMiles() {
        return monthlyMiles;
    }
    public void setMonthlyMiles(float monthlyMiles) {
        this.monthlyMiles = monthlyMiles;
    }
}
