package Clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Dev_Imp extends Person implements AvanticaCollaborators {
	private double daySalary;
	private Date endDate;
	private short remainingDays;

	/**
	 * @return the daySalary
	 */
	public double getDaySalary() {
		return daySalary;
	}

	/**
	 * @param daySalary
	 *            the daySalary to set
	 */
	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the remainingDays
	 */
	public short getRemainingDays() {
		return remainingDays;
	}

	/**
	 * @param remainingDays
	 *            the remainingDays to set
	 */
	public void setRemainingDays(short remainingDays) {
		this.remainingDays = remainingDays;
	}

	public static synchronized int DateDifferent(Date BegDate, Date endDate) {

		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String strBegDate = df.format(BegDate);
		try {
			BegDate = df.parse(strBegDate);
		} catch (ParseException ex) {
		}

		String strEndDate = df.format(endDate);
		try {
			endDate = df.parse(strEndDate);
		} catch (ParseException ex) {
		}

		long BegDateMs = BegDate.getTime();
		long endDateMs = endDate.getTime();
		long diferencia = endDateMs - BegDateMs;
		double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
		return ((int) dias);
	}

	@Override
	public double CalculateCost(Date date) {
		int diference = DateDifferent(endDate, date);
		return diference * daySalary;
	}

	@Override
	public double CalculateSalary() {

		return this.hours * this.salary;
	}

	@Override
	public void ShowInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Age: " + this.age);

	}

}
