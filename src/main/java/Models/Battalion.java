package Models;

public class Battalion {
    private int battalionId;
    private String name;
    private String abbreviation;
    private String description;
    private String battalionCommander;
    private int brigadeId;

    public Battalion(int battalionId, String name, String abbreviation, String description, int brigadeId) {
        this.battalionId = battalionId;
        this.name = name;
        this.abbreviation = abbreviation;
        this.description = description;
        this.brigadeId = brigadeId;


    }
    public int getBattalionId() {
        return battalionId;
    }
    public String getName() {
       return this.name;
    }
    public String getAbbreviation() {
        return this.abbreviation;
    }
    public String getDescription() {
        return this.description;
    }
    public String getBattalionCommander() {
        return this.battalionCommander;
    }
    public int getBrigadeId() {
        return this.brigadeId;
    }

}
