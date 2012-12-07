package Clases;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		QA_Imp qaImp = new QA_Imp();
		Dev_Imp devImp = new Dev_Imp();
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		PositionEnum positionEnum = null;

		int opcion;
		String date;
		String date2;
		Date fecha = null;
		Date fecha2 = null;

		System.out.println("1- QA");
		System.out.println("2- DEV");

		System.out.print("Escoja el departamento: ");
		opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.print("Nombre: ");
			qaImp.setName(entrada.next());

			System.out.print("Id: ");
			qaImp.setId(entrada.next());

			System.out.print("Age: ");
			qaImp.setAge(entrada.nextShort());

			System.out.print("Horas trabajadas: ");
			qaImp.setHours(entrada.nextInt());

			System.out.print("Meses: ");
			qaImp.setMonth(entrada.nextShort());

			System.out.print("Salario por hora: ");
			qaImp.setSalaryHour(entrada.nextInt());

			System.out.print("Fecha Inicio: ");
			date = entrada.next();
			try {
				fecha = format.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			qaImp.setBeginDate(fecha);

			System.out.print("Fecha parametro: ");
			date2 = entrada.next();
			try {
				fecha2 = format.parse(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("INFO: ");
			System.out.println(positionEnum.QA_I.Name());
			
			qaImp.ShowInfo();

			System.out.println("Salario es:" + qaImp.CalculateSalary());

			System.out.println("Costo es: " + qaImp.CalculateCost(fecha2));

			break;

		case 2:
			System.out.print("Nombre: ");
			devImp.setName(entrada.next());

			System.out.print("Id: ");
			devImp.setId(entrada.next());

			System.out.print("Age: ");
			devImp.setAge(entrada.nextShort());

			System.out.print("Horas trabajadas: ");
			devImp.setHours(entrada.nextInt());

			System.out.print("Salario por hora: ");
			devImp.setSalary(entrada.nextInt());
			
			System.out.print("Fecha parametro: ");
			date2 = entrada.next();
			try {
				fecha2 = format.parse(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("INFO: ");
			System.out.println(positionEnum.SE_III.Name());
			devImp.ShowInfo();

			System.out.println("Salario es:" + devImp.CalculateSalary());
			
			System.out.println("Costo es: " + devImp.CalculateCost(fecha2));
			break;
		}
	}

}
