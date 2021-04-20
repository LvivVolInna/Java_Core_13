package hw13;

public class Deputy extends Person implements Comparable<Deputy>{
	
	private String surname;
	private String name;
	private int age;
	private boolean bribe;
	private int bribeSize;
	
	
public Deputy(double weight, double height, String surname, String name, int age, boolean bribe) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribe = bribe;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isBribe() {
		return bribe;
	}


	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}


	public int getBribeSize() {
		return bribeSize;
	}


	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}
	
	public void getBribe (int size) {
		if (bribe) {
			if(size > 5000) {
				System.out.println("Поліція обіцяє ув'язнити депутата " + this.surname);
				this.bribeSize += size;
			}else {
			this.bribeSize += size;
			}
		} else {
			System.out.println("Депутат " + this.surname + " не бере хабаря");
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		if (age != other.age)
			return false;
		if (bribe != other.bribe)
			return false;
		if (bribeSize != other.bribeSize)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribe=" + bribe + ", bribeSize="
				+ bribeSize + "]";
	}


	@Override
	public int compareTo(Deputy o) {
		if (this.bribeSize > o.getBribeSize()) {
			return 1;
		}
		else if (this.bribeSize < o.getBribeSize()) {
			return -1;
		}
		else
			return 0;
	}

	
	

}
