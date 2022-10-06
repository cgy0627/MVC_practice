package model.domain;

public class Player {
	private String name;
	private int age;
	private String division;
	private String opponent;
	
	public Player() {}
	
	public Player(String name, String division, int age) {
		this.name = name;
		this.division = division;
		if(age >= 20) {
			this.age = age;
		}
		else {
			System.out.println("나이 20살 이상만 게임에 참여가 가능합니다. 다시 확인해 주세요.");
		}
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
		if(age >= 20) {
			this.age = age;
		}
		else {
			System.out.println("나이 20살 이상만 게임에 참여가 가능합니다. 다시 확인해 주세요.");
		}
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
}
