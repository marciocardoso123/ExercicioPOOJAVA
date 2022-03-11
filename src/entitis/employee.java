package entitis;

public class employee {

	public String name;
	public double glossSalary;
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax;
	}
	public void IncreseSalary(double percentage) {
		glossSalary += glossSalary * percentage /100.0;
	}
	public String toString(){
		return name +", $" + String.format("%.2f", netSalary());
	}
}
