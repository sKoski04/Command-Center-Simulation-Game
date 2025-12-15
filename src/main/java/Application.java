import CRUD.*;
import Models.*;
import Models.Company;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SoldierCrud crud=new SoldierCrud();
    SquadCrud crud2=new SquadCrud();
    PlatoonCrud platoonCrud=new PlatoonCrud();
    CompanyCrud companyCrud=new CompanyCrud();
    BattalionCrud battalionCrud=new BattalionCrud();
    BrigadeCrud brigadeCrud=new BrigadeCrud();
    BranchCrud branchCrud=new BranchCrud();


    Battalion testBattalion=new Battalion(2,"test","test","test",1);
    Squad squad=new Squad(3, "squad1", "sq1", "description", "squad commander", 1, 4);
    Soldier testSoldier=new Soldier(1010, "Matias petäistö", 34, "Male", "Solttukönsikäs", "Machinegun", true, 0, "General");
    Soldier testSoldier2=new Soldier(1010, "Matias petäistö", 34, "Male", "Solttukönsikäs", "Machinegun", true, 0, "Sergeant");
    Platoon testPlatoon=new Platoon(2,"1st jaeger platoon","1JP","test commander","test commander",1);
        Company company=new Company(2,"test","test","test",1);
        Brigade brigade=new Brigade(2,"test","test","test",1);
        Branch branch=new Branch(2,"test","test","test","helsinki","test");
branchCrud.create(branch);

  



	}

}
