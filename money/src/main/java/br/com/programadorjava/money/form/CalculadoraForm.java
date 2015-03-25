package br.com.programadorjava.money.form;

import org.apache.struts.action.ActionForm;

public class CalculadoraForm extends ActionForm {
	private static final long serialVersionUID = 8197600785899626675L;
	
	private double pv; //valor financiado
	private double i; //taxa mensal
	private int n; //nº de meses
	private double pmt; //prestação
	private String cmd;
	
	public double getPv() {
		return pv;
	}

	public void setPv(double pv) {
		this.pv = pv;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getPmt() {
		return pmt;
	}

	public void setPmt(double pmt) {
		this.pmt = pmt;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
}
