import java.sql.SQLException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SoldierCrud crud=new SoldierCrud();
    SquadCrud crud2=new SquadCrud();
    Squad squad=new Squad(2, "squad1", "sq1", "description", "squad commander", 1, 4);
    Soldier testSoldier=new Soldier(1010, "Matias petäistö", 34, "Male", "Solttukönsikäs", "Machinegun", true, 0, "General");
    Soldier testSoldier2=new Soldier(1010, "Matias petäistö", 34, "Male", "Solttukönsikäs", "Machinegun", true, 0, "Sergeant");
   
  
    crud2.create(squad);
       
	}

}
