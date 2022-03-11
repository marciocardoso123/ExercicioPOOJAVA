package principal;

import java.util.Locale;
import java.util.Scanner;

import entitis.employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		employee emp = new employee();
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Enter name: ");
		emp.name = leia.next();
		
		System.out.println("Enter gloss salary: ");
		emp.glossSalary = leia.nextDouble();
		
		System.out.println("Enter Tax");
		emp.tax = leia.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.println("Which percetage to increase salary? ");
		double percentage = leia.nextDouble();
		emp.IncreseSalary(percentage);
		System.out.println();
		System.out.println("Update data: " + emp);
		leia.close();
		
		
	}

}
