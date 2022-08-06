package com.lucida.model.form;

public class PerformanceAssumptionsViewForm {
    // Properties
    int paidMilesPerWeek;
    int unpaidMilesPerWeek;
    int fuelMileage;
    float fuelCostPerGallon;
    int weeksWorkedPerYear;

    // Constructor
    public PerformanceAssumptionsViewForm() { }

    // Get/Set
    public int getPaidMilesPerWeek() {
        return paidMilesPerWeek;
    }
    public void setPaidMilesPerWeek(int paidMilesPerWeek) {
        this.paidMilesPerWeek = paidMilesPerWeek;
    }

    public int getUnpaidMilesPerWeek() {
        return unpaidMilesPerWeek;
    }
    public void setUnpaidMilesPerWeek(int unpaidMilesPerWeek) {
        this.unpaidMilesPerWeek = unpaidMilesPerWeek;
    }

    public float getFuelCostPerGallon() {
        return fuelCostPerGallon;
    }
    public void setFuelCostPerGallon(float fuelCostPerGallon) {
        this.fuelCostPerGallon = fuelCostPerGallon;
    }

    public int getFuelMileage() {
        return fuelMileage;
    }
    public void setFuelMileage(int fuelMileage) {
        this.fuelMileage = fuelMileage;
    }

    public int getWeeksWorkedPerYear() {
        return weeksWorkedPerYear;
    }
    public void setWeeksWorkedPerYear(int weeksWorkedPerYear) {
        this.weeksWorkedPerYear = weeksWorkedPerYear;
    }
}
