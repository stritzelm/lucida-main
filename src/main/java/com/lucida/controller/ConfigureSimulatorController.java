package com.lucida.controller;

import com.lucida.model.form.FinancialSimulatorConfigForm;
import com.lucida.model.form.PerformanceAssumptionsViewForm;
import com.lucida.service.FinancialSimulatorViewService;
import com.lucida.view.FixedCostsReportTableView;
import com.lucida.view.MilesCountReportTableView;
import com.lucida.view.VariableCostsReportTableView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConfigureSimulatorController
{

	@Autowired
	FinancialSimulatorViewService financialSimulatorViewService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayFinancialSimulatorForm(Model model) {
		MilesCountReportTableView milesCount = financialSimulatorViewService.initDay0Miles();
		PerformanceAssumptionsViewForm performanceAssumptionsForm = financialSimulatorViewService.initDay0PerformanceAssumptionsForm();
		FixedCostsReportTableView fixedCostsForm = financialSimulatorViewService.initDay0FixedCostsReportView();
		VariableCostsReportTableView variableCostsForm  = financialSimulatorViewService.initDay0VariableCostsReportTableView();

		FinancialSimulatorConfigForm form = new FinancialSimulatorConfigForm();
		form.setMilesCountReportTableView(milesCount);
		form.setPerformanceAssumptionsViewForm(performanceAssumptionsForm);
		form.setFixedCostsReportTableView(fixedCostsForm);
		form.setVariableCostsReportTableView(variableCostsForm);

		model.addAttribute("simulationConfigForm", form);
		return "configureSimulator";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String submitFinancialSimulatorForm(Model model) {

		return "configureSimulator";
	}

	private MilesCountReportTableView initDay0Miles() {
		MilesCountReportTableView milesCountView = new MilesCountReportTableView();
		milesCountView.setMonthlyMiles(0);
		milesCountView.setAnnualMiles(0);
		return milesCountView;
	}
}