package CRUD;

import java.sql.PreparedStatement;
import java.util.List;
import Models.Squad;
import Services.DatabaseConnect;

public class SquadCrud implements GeneralizedCrud<Squad> {

	@Override
	public void create(Squad squad) {
		// TODO Auto-generated method stub
		DatabaseConnect conn=new DatabaseConnect();
		// TODO Auto-generated method stub
		String sql="INSERT INTO squad (squad_id,name,abbreviation,description,squad_leader,platoon_id,manpower) VALUES (?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
		 stmt.setInt(1,squad.getSquadId() );
	        stmt.setString(2, squad.getName());
	        stmt.setString(3, squad.getAbbreviation());
	        stmt.setString(4, squad.getDescription());
	        stmt.setString(5, squad.getSquadLeader());
	        stmt.setInt(6, squad.getPlatoonId());
	        stmt.setInt(7, squad.getManpower());
	   ;
	        stmt.executeUpdate(); 
	        System.out.print("Models.Squad Created!");
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.print("Error creating squad, check status");
	}
		
	}

	@Override
	public void update(Squad squad) {
		// TODO Auto-generated method stub
        DatabaseConnect connection = new DatabaseConnect();
        String sql="UPDATE squad SET name=?,description=?, abbreviation=?, squad_leader=?, platoon_id=?, manpower=? WHERE squad_id=?";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){


            stmt.setString(1,squad.getName() );
            stmt.setString(2, squad.getDescription());
            stmt.setString(3, squad.getAbbreviation());
            stmt.setString(4, squad.getSquadLeader());
            stmt.setInt(5, squad.getPlatoonId());
            stmt.setInt(6, squad.getManpower());





            stmt.executeUpdate();
            System.out.print("squad updated!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error updating squad, check status");
        }
	}



	@Override
	public void delete(Squad squad) {
		// TODO Auto-generated method stub
        DatabaseConnect conn=new DatabaseConnect();
        String sql="DELETE FROM squad WHERE squad_id=?";
        try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
            stmt.setInt(1, squad.getSquadId());


            stmt.executeUpdate();
            System.out.print("squad deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error deleting squad, check status");
        }
	}

	@Override
	public List<Squad> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
