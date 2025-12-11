import CRUD.CompanyCrud;
import CRUD.PlatoonCrud;
import CRUD.SoldierCrud;
import CRUD.SquadCrud;
import Models.Company;
import Models.Platoon;
import Models.Soldier;
import Models.Squad;
import Models.Company;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SoldierCrud crud=new SoldierCrud();
    SquadCrud crud2=new SquadCrud();
    PlatoonCrud platoonCrud=new PlatoonCrud();
    CompanyCrud companyCrud=new CompanyCrud();

    Squad squad=new Squad(3, "squad1", "sq1", "description", "squad commander", 1, 4);
    Soldier testSoldier=new Soldier(1010, "Matias petäistö", 34, "Male", "Solttukönsikäs", "Machinegun", true, 0, "General");
    Soldier testSoldier2=new Soldier(1010, "Matias petäistö", 34, "Male", "Solttukönsikäs", "Machinegun", true, 0, "Sergeant");
    Platoon testPlatoon=new Platoon(2,"1st jaeger platoon","1JP","test commander","test commander",1);
        Company company=new Company(2,"test","test","test",1);


companyCrud.delete(company);

  



	}

}
