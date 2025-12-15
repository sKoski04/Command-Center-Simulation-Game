package Models;

public class Branch {
    private int branchId;
    private String name;
    private String description;
    private String abbreviation;
    private String headquarterLocation;
    private String branchCommander;

    public Branch(int branchId, String name, String description, String abbreviation, String headquarterLocation, String branchCommander) {
        this.branchId = branchId;
        this.name = name;
        this.description = description;
        this.abbreviation = abbreviation;
        this.headquarterLocation = headquarterLocation;
        this.branchCommander = branchCommander;

    }
    public int getBranchId() {
        return branchId;
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
   public String getHeadquarterLocation() {
        return headquarterLocation;
   }
   public String getBranchCommander() {
        return branchCommander;
   }

}

