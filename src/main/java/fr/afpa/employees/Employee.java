package fr.afpa.employees;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

import java.time.LocalDate;

class Employee
{
	/**
	 * Matricule de l'employé
	 */
	private String registrationNumber;


	// TODO compléter les attributs comme présenté dans le PDF
	private String lastName;
	private String firstName;
	private double salary;
	private final int socialRate = 30;
	private LocalDate birthDate;

	// TODO compléter le constructeur de la classe
	public Employee(String registrationNumber, String lastName, String firstName, double salary, LocalDate birthDate) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.birthDate = birthDate;
	}

	// TODO implémenter les setters et getters de la classe (permet d'accéder aux attributs privés)
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) throws Exception {
		this.registrationNumber = registrationNumber;
	}

	// TODO ajouter les getters et les setters

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSocialRate() {
		return socialRate;
	}

	public String getFullName()
	{
		return this.lastName + " " + this.firstName;
	}

	public double netSalary()
	{
		return this.salary - this.salary * this.socialRate /100;
	}

	public int daysBeforeBirthday(LocalDate date)
	{
		int dayEmployee = this.birthDate.getDayOfYear();
		int dayNow = date.getDayOfYear();
		if (dayEmployee < dayNow)
		{
			dayEmployee +=365;
		}
		return dayEmployee - dayNow;
	}

	// TODO implémenter la méthode "toString()" qui renvoie une chaîne de caractère qui représente un objet de la classe employé
	// plus d'information sur la méthode "toString()" -> https://codegym.cc/fr/groups/posts/fr.986.mthode-java-tostring
	@Override
	public String toString() {
		return "Registration number : " + registrationNumber +
				" Last Name : " + lastName +
				" First Name : " + firstName +
				" Salary : " + salary +
				" Social Rate : " + socialRate +
				" BirthDate : " + birthDate;
	}
}
