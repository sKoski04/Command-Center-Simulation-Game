package Models;

public class Company {
    private int companyId;
    private String name;
    private String abbreviation;
    private String description;
    private String company_commander;
    private int battalion_id;

  public Company(int companyId, String name, String abbreviation, String description, int battalion_id) {

      this.companyId = companyId;
      this.name = name;
      this.abbreviation = abbreviation;
      this.description = description;
      this.battalion_id = battalion_id;

  }
  public int getCompanyId() {
      return companyId;
  }
  public String getName() {
      return name;
  }
  public String getAbbreviation() {
      return abbreviation;
  }
  public String getDescription() {
      return description;
  }
  public String getCompany_commander() {
      return company_commander;
  }
  public int getBattalionId() {
      return battalion_id;
  }
}
