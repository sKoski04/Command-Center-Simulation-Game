package Models;

public class Soldier {
	private int badgeNumber;
	private String name;
	private int age;
	private String gender;
	private String callsign;
	private String role;
	private boolean status;
	private int squadId;
	private String rank;
	//constructor 
	public Soldier(int badgeNumber, String name,int age,String gender,String callsign,String role,boolean status,int squadId,String rank) {
		    this.badgeNumber = badgeNumber;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.callsign = callsign;
	        this.role = role;
	        this.status = true;
	        this.squadId = squadId;
	        this.rank = rank;
	};
//getters 
	public int getBadgeNumber() {
		return this.badgeNumber;
	}
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getGender() {
		return this.gender;
	}
	public String getCallsign() {
		return this.callsign;
	}
	public String getRole() {
		return this.role;
	}
	public boolean getStatus() {
		return this.status;
	}
	public int getSquadId() {
		return this.squadId;
	}
	public String getRank() {
		return this.rank;
	}
}
