package com.lucida.service;

import com.lucida.model.form.FixedCostsTableEntryForm;
import com.lucida.model.form.PerformanceAssumptionsViewForm;
import com.lucida.model.form.VariableCostsTableEntryForm;
import com.lucida.view.FixedCostsReportTableView;
import com.lucida.view.MilesCountReportTableView;
import com.lucida.view.VariableCostsReportTableView;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FinancialSimulatorViewService {

    public MilesCountReportTableView initDay0Miles() {
        MilesCountReportTableView milesCountView = new MilesCountReportTableView();
        milesCountView.setMonthlyMiles(0);
        milesCountView.setAnnualMiles(0);
        return milesCountView;
    }

    public PerformanceAssumptionsViewForm initDay0PerformanceAssumptionsForm() {
        PerformanceAssumptionsViewForm form = new PerformanceAssumptionsViewForm();
        form.setPaidMilesPerWeek(0);
        form.setUnpaidMilesPerWeek(0);
        form.setFuelMileage(0);
        form.setFuelCostPerGallon(0.00F);
        form.setWeeksWorkedPerYear(0);
        return form;
    }

    public FixedCostsReportTableView initDay0FixedCostsReportView() {
        List<FixedCostsTableEntryForm> tableEntries = initDay0FixedCostEntries();
        return initViewWithFixedCostsEntryForms(tableEntries);
    }

    private List<FixedCostsTableEntryForm> initDay0FixedCostEntries() {
        String[] fixedCostCategories = new String[] { "Truck Payment", "Trailer Payment", "Collision/Comp Insurance", "Bobtail Insurance",
                "Cargo Insurance", "Health Insurance", "Licenses", "Permits", "Communications"};
        List<FixedCostsTableEntryForm> forms = new LinkedList<>();
        for (String category: fixedCostCategories)
        {
            FixedCostsTableEntryForm form = new FixedCostsTableEntryForm();
            form.setCategory(category);
            form.setCostPerMile(0.00F);
            form.setMonthlyTotal(0.00F);
            form.setAnnualTotal(0.00F);
            forms.add(form);
        }
        return forms;
    }

    public VariableCostsReportTableView initDay0VariableCostsReportTableView() {
        List<VariableCostsTableEntryForm> tableEntries = initDay0VariableCostEntries();
        return initViewWithVariableCostsEntryForms(tableEntries);
    }

    private List<VariableCostsTableEntryForm> initDay0VariableCostEntries() {
        String[] variableCostCategories = new String[] { "Tractor Fuel", "Trailer Fuel", "Repairs", "Preventative Maintenance",
                "Maintenance Supplies", "Tires", "Lodging", "Tolls", "Scales", "Meals", "Work Compensation", "Taxes", "Misc Expenses",
                "Driver's Wage & Expensees"};
        List<VariableCostsTableEntryForm> forms = new LinkedList<>();
        for (String category: variableCostCategories)
        {
            VariableCostsTableEntryForm form = new VariableCostsTableEntryForm();
            form.setCategory(category);
            form.setCostPerMile(0.00F);
            form.setMonthlyTotal(0.00F);
            form.setAnnualTotal(0.00F);
            forms.add(form);
        }
        return forms;
    }

    private FixedCostsReportTableView initViewWithFixedCostsEntryForms(List<FixedCostsTableEntryForm> forms) {
        FixedCostsReportTableView view = new FixedCostsReportTableView();
        view.setTableEntries(forms);
        view.setAnnualFixedExpenseTotal("0.00");
        view.setMonthlyFixedExpenseTotal("0.00");
        view.setFixedExpensesTotalCostPerMile("0.00");
        return view;
    }

    private VariableCostsReportTableView initViewWithVariableCostsEntryForms(List<VariableCostsTableEntryForm> forms) {
        VariableCostsReportTableView view = new VariableCostsReportTableView();
        view.setTableEntries(forms);
        view.setAnnualVariableExpenseTotal("0.00");
        view.setMonthlyVariableExpenseTotal("0.00");
        view.setVariableExpensesTotalCostPerMile("0.00");
        return view;
    }
}
