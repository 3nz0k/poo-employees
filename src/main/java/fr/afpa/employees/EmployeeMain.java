package fr.afpa.employees;

import java.time.LocalDate;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// TODO instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22", "LAST", "Loji", 1200, LocalDate.parse("2003-03-04"));
		Employee employee2 = new Employee("YBUHBDS", "Maedsq", "Ohuyi", 1678, LocalDate.parse("1992-12-31"));
		Employee employee3 = new Employee("dsqdsqdz", "Dsdqzd", "Juyyd", 9278, LocalDate.parse("1932-06-12"));
		Employee employee4 = new Employee("dzdsdf", "BHyud", "Dgrd", 4356, LocalDate.parse("1979-09-28"));


		LocalDate date = LocalDate.now();
		// TODO afficher les informations des employés avec System.out.println
		System.out.println(date);
		System.out.println(employee1);
		System.out.println(employee1.netSalary());
		System.out.println(employee2.daysBeforeBirthday(date));
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
	}
}

