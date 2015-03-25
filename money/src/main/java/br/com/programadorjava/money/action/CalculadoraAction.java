package br.com.programadorjava.money.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.programadorjava.money.form.CalculadoraForm;

public class CalculadoraAction extends Action {

	public static final String CALCULATE = "calc";
	public static final String RESET = "reset";
	public static final String CALC_FORM = "calculadoraForm";
	public static final String CALC_FWD = "calculoPrestacao";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CalculadoraForm calcForm = (CalculadoraForm) form;
		String cmd = calcForm.getCmd();

		if (CALCULATE.equalsIgnoreCase(cmd)) {
			if (calcForm.getPv() > 0) {
				this.calculaPMT(calcForm);
			}

		} else if (RESET.equalsIgnoreCase(cmd)) {
			form = new CalculadoraForm();
			request.setAttribute(CALC_FORM, form);
		}

		return mapping.findForward(CALC_FWD);
	}

	private void calculaPMT(CalculadoraForm c) {
		double pv = c.getPv();
		double i = c.getI() / 100;
		int n = c.getN();
		// pmt = pv * i * ((1 + i)^n) / ((1 + i)^n) - 1
		double pmt = pv * (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
		c.setPmt(pmt);
	}
}
