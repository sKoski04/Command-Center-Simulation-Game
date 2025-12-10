package CRUD;

import java.sql.PreparedStatement;
import java.util.List;
import Models.Soldier;
import Services.DatabaseConnect;
public class SoldierCrud implements GeneralizedCrud<Soldier> {

	@Override
	public void create(Soldier soldier) {
		DatabaseConnect conn=new DatabaseConnect();
		// TODO Auto-generated method stub
		String sql="INSERT INTO soldier (Badge_number,Name,Age,Gender,Call_sign,Role,Status,Squad_id,Rank) VALUES (?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
		 stmt.setInt(1, soldier.getBadgeNumber());
	        stmt.setString(2, soldier.getName());
	        stmt.setInt(3, soldier.getAge());
	        stmt.setString(4, soldier.getGender());
	        stmt.setString(5, soldier.getCallsign());
	        stmt.setString(6, soldier.getRole());
	        stmt.setBoolean(7, soldier.getStatus());
	        stmt.setInt(8, soldier.getSquadId());
	        stmt.setString(9, soldier.getRank());
	        stmt.executeUpdate(); 
	        System.out.print("Models.Soldier Created!");
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.print("Error creating soldier, check status");
	}
	}
	@Override
	public void update(Soldier soldier) {
		// TODO Auto-generated method stub
		DatabaseConnect conn=new DatabaseConnect();
		String sql="UPDATE soldier SET Age=?, Call_sign=?,Role=?, Status=?, Squad_id=?, Rank=? WHERE Badge_number=? ";
		try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
			
		  
		        stmt.setInt(1, soldier.getAge());
		        stmt.setString(2, soldier.getCallsign());
		        stmt.setString(3, soldier.getRole());
		        stmt.setBoolean(4, soldier.getStatus());
		        stmt.setInt(5, soldier.getSquadId());
		        stmt.setString(6, soldier.getRank());
		        stmt.setInt(7, soldier.getBadgeNumber());


		        stmt.executeUpdate();



		        System.out.print("Models.Soldier updated!");
		    } catch (Exception e) {
		        e.printStackTrace();
		        System.out.print("Error updating soldier, check status");
		}
		
	}

	@Override
	public void delete(Soldier soldier) {
		// TODO Auto-generated method stub
		DatabaseConnect conn=new DatabaseConnect();
		String sql="DELETE FROM soldier WHERE Badge_number=?";
		try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
			stmt.setInt(1, soldier.getBadgeNumber());
		  
		   
		        stmt.executeUpdate(); 
		        System.out.print("Models.Soldier deleted!");
		    } catch (Exception e) {
		        e.printStackTrace();
		        System.out.print("Error deleting soldier, check status");
		}
		
		
	}

	@Override
	public List <Soldier> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
