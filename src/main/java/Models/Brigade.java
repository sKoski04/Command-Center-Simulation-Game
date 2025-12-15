package Models;

public class Brigade {
    private int brigadeId;
    private String name;
    private String description;
    private String abbreviation;
    private String brigade_commander;
    private int branchId;

    public Brigade(int brigadeId, String name, String description, String abbreviation, int branchId) {
        this.brigadeId = brigadeId;
        this.name = name;
        this.description = description;
        this.abbreviation = abbreviation;
        this.branchId = branchId;

    }
    public int getBrigadeId() {
        return brigadeId;
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
    public String getBrigade_commander() {
        return brigade_commander;
    }
    public int getBranchId() {
        return branchId;
    }


}
