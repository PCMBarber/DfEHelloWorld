package main;

public class Trainee {
	
	private String name;
	private boolean bad;
	private String course;
	
	public Trainee(String name, boolean bad) {
		this.name = name;
		this.bad = bad;
	}
	
	public Trainee(boolean bad, String course) {
		this.name = "Default";
		this.bad = bad;
		this.course = course;
	}

	public void printTrainee(String message) {
		System.out.println("Name: "+ name + " Bad Trainee? " + bad + " "+ message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBad() {
		return bad;
	}

	public void setBad(boolean bad) {
		if(name.equals("Alex")) {
			this.bad = false;
		} else {
			this.bad = bad;
		}
	}
	
}
