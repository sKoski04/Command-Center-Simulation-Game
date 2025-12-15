package CRUD;

import Models.Battalion;
import Connections.DatabaseConnect;

import java.sql.PreparedStatement;
import java.util.List;

public class BattalionCrud implements GeneralizedCrud<Battalion> {

    @Override
    public void create(Battalion battalion) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="INSERT INTO battalion (battalion_id,name,abbreviation,description,battalion_commander,brigade_id) VALUES (?,?,?,?,?,?)";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){
            stmt.setInt(1, battalion.getBattalionId());
            stmt.setString(2, battalion.getName());
            stmt.setString(3, battalion.getAbbreviation());
            stmt.setString(4, battalion.getDescription());
            stmt.setString(5, battalion.getBattalionCommander());
            stmt.setInt(6, battalion.getBrigadeId());




            stmt.executeUpdate();
            System.out.println("battalion created!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error creating battalion, check status");
        }
    }

    @Override
    public void update(Battalion battalion) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="UPDATE battalion SET name=?,description=?, abbreviation=?, battalion_commander=? WHERE battalion_id=? ";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){


            stmt.setString(1, battalion.getName());
            stmt.setString(2, battalion.getDescription());
            stmt.setString(3, battalion.getAbbreviation());
            stmt.setString(4, battalion.getBattalionCommander());
            stmt.setInt(5, battalion.getBattalionId());






            stmt.executeUpdate();
            System.out.print("battalion updated!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error updating battalion, check status");
        }
    }

    @Override
    public void delete(Battalion battalion) {
        DatabaseConnect conn=new DatabaseConnect();
        String sql="DELETE FROM battalion WHERE battalion_id=?";
        try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
            stmt.setInt(1, battalion.getBattalionId());


            stmt.executeUpdate();
            System.out.print("battalion deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error deleting battalion, check status");
        }
    }

    @Override
    public List<Battalion> getAll() {
        return List.of();
    }
}
