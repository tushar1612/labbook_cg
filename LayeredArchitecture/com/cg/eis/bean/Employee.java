package LayeredArchitecture.com.cg.eis.bean;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private String designation;
	private String insuranceScheme;

	public Employee() {

	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		// this.designation = designation;
		// this.insuranceScheme = insuranceScheme;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation() {
		if (this.salary > 5000 && this.salary < 20000) {
			this.designation = "Scheme C";
		} else if (this.salary >= 20000 && this.salary < 40000) {
			this.designation = "Scheme B";
		} else if (this.salary >= 40000) {
			this.designation = "Scheme A";
		} else if (this.salary <= 5000) {
			this.designation = "No Scheme";
		}
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme() {
		if (this.salary > 5000 && this.salary < 20000) {
			this.insuranceScheme = "Scheme C";
		} else if (this.salary >= 20000 && this.salary < 40000) {
			this.insuranceScheme = "Scheme B";
		} else if (this.salary >= 40000) {
			this.insuranceScheme = "Scheme A";
		} else if (this.salary <= 5000) {
			this.insuranceScheme = "No Scheme";
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((insuranceScheme == null) ? 0 : insuranceScheme.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (insuranceScheme == null) {
			if (other.insuranceScheme != null)
				return false;
		} else if (!insuranceScheme.equals(other.insuranceScheme))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

}
