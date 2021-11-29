package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be added? ");
		int num = sc.nextInt();
		sc.nextLine();

		int id;
		String name;
		double salary;
		
		List<Funcionario> listFunc = new ArrayList<>();
		
		for (int i=1; i<=num; i++) {
			System.out.println();
			System.out.println("Employee #" + i +":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			listFunc.add(new Funcionario(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idNum = sc.nextInt();
		sc.nextLine();
		
		Funcionario emp = listFunc.stream().filter(x -> x.getId() == idNum).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.aumento(percentage);
		}
		 
		// Minha solucao
		/*
		boolean flag = false;
		for (Funcionario x: listFunc) {
			if (id == x.getId()) {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				x.aumento(percent);
				flag=true;
			}
		}
		
		if (!flag) {
			System.out.println("This id does not exist!");
		}
		*/
		
		
		
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario x: listFunc) {
			System.out.println(x.toString());
		}
		
		sc.close();
	}

}
