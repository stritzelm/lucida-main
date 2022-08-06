package com.lucida.model.form;

import com.lucida.view.FixedCostsReportTableView;
import com.lucida.view.MilesCountReportTableView;
import com.lucida.view.VariableCostsReportTableView;

public class FinancialSimulatorConfigForm {
    MilesCountReportTableView milesCountReportTableView;
    PerformanceAssumptionsViewForm performanceAssumptionsViewForm;
    FixedCostsReportTableView fixedCostsReportTableView;
    VariableCostsReportTableView variableCostsReportTableView;


    public FinancialSimulatorConfigForm() {}


    public MilesCountReportTableView getMilesCountReportTableView() {
        return milesCountReportTableView;
    }
    public void setMilesCountReportTableView(MilesCountReportTableView milesCountReportTableView) {
        this.milesCountReportTableView = milesCountReportTableView;
    }

    public PerformanceAssumptionsViewForm getPerformanceAssumptionsViewForm() {
        return performanceAssumptionsViewForm;
    }
    public void setPerformanceAssumptionsViewForm(PerformanceAssumptionsViewForm performanceAssumptionsViewForm) {
        this.performanceAssumptionsViewForm = performanceAssumptionsViewForm;
    }

    public FixedCostsReportTableView getFixedCostsReportTableView() {
        return fixedCostsReportTableView;
    }
    public void setFixedCostsReportTableView(FixedCostsReportTableView fixedCostsReportTableView) {
        this.fixedCostsReportTableView = fixedCostsReportTableView;
    }

    public VariableCostsReportTableView getVariableCostsReportTableView() {
        return variableCostsReportTableView;
    }
    public void setVariableCostsReportTableView(VariableCostsReportTableView variableCostsReportTableView) {
        this.variableCostsReportTableView = variableCostsReportTableView;
    }
}
