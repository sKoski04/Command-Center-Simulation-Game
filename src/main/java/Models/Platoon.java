package Models;

public class Platoon  {
    private int id;
    private String  name;
    private String description;
    private String abbreviation;
    private String Platoon_commander;
    private int company_id;

    public Platoon(int id, String name, String description, String abbreviation, String Platoon_commander, int company_id) {
        this.id = id;
        this.name=name;
        this.description=description;
        this.abbreviation=abbreviation;
        this.Platoon_commander=Platoon_commander;
        this.company_id=company_id;

    }
    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public String getPlatoon_commander() {
        return Platoon_commander;
    }
    public int getCompany_id() {
        return company_id;
    }

}
