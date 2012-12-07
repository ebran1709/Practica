package Clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class QA_Imp extends Person implements AvanticaCollaborators {
	private double salaryHour;
	private Date beginDate;
	private short month;

	/**
	 * @return the salaryHour
	 */
	public double getSalaryHour() {
		return salaryHour;
	}

	/**
	 * @param salaryHour
	 *            the salaryHour to set
	 */
	public void setSalaryHour(double salaryHour) {
		this.salaryHour = salaryHour;
	}

	/**
	 * @return the beginDate
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * @param beginDate
	 *            the beginDate to set
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * @return the month
	 */
	public short getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            the month to set
	 */
	public void setMonth(short month) {
		this.month = month;
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
		beginDate.setMonth(beginDate.getMonth() + month);
		int dias = DateDifferent(beginDate, date);
		int hours = dias * 8;
		int a;
		return hours * salaryHour;
		
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
