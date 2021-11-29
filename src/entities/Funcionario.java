package entities;

public class Funcionario {
	
	private int id;
	private String name;
	private double salary;
	
	public void cadFuncionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Funcionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void aumento(double percent) {
		salary = salary + salary*percent/100;
	}
	
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+String.format("%.2f", salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
