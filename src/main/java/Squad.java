
public class Squad {
private int squadId;
private String name;
private String abbrevation;
private String description;
private String squadLeader;
private int platoonId;
private int manpower;

public Squad(int squadId, String name,String abbrevation,String description,String squadLeader,int platoonId,int manpower) {
	this.squadId=squadId;
	this.name=name;
	this.abbrevation=abbrevation;
	this.description=description;
	this.squadLeader=squadLeader;
	this.platoonId=platoonId;
	this.manpower=manpower;
	
}
public int getSquadId() {
	return this.squadId;
}
public String getName() {
	return this.name;
	
}
public String getAbbrevation() {
	return this.abbrevation;
	
}
public String getDescription() {
	return this.description;
	
}
public String getSquadLeader() {
	return this.squadLeader;
}
public int getPlatoonId() {
	return this.platoonId;
}
public int getManpower() {
	return this.manpower;
	
}
}
