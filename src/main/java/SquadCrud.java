import java.sql.PreparedStatement;
import java.util.List;

public class SquadCrud implements GeneralizedCrud <Squad> {

	@Override
	public void create(Squad squad) {
		// TODO Auto-generated method stub
		DatabaseConnect conn=new DatabaseConnect();
		// TODO Auto-generated method stub
		String sql="INSERT INTO squad (squad_id,name,abbrevation,description,squad_leader,platoon_id,manpower) VALUES (?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
		 stmt.setInt(1,squad.getSquadId() );
	        stmt.setString(2, squad.getName());
	        stmt.setString(3, squad.getAbbrevation());
	        stmt.setString(4, squad.getDescription());
	        stmt.setString(5, squad.getSquadLeader());
	        stmt.setInt(6, squad.getPlatoonId());
	        stmt.setInt(7, squad.getManpower());
	   ;
	        stmt.executeUpdate(); 
	        System.out.print("Squad Created!");
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.print("Error creating squad, check status");
	}
		
	}

	@Override
	public void update(Squad squad) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(Squad obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Squad> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
