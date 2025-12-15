package CRUD;

import Models.Brigade;
import Connections.DatabaseConnect;

import java.sql.PreparedStatement;
import java.util.List;

public class BrigadeCrud implements GeneralizedCrud<Brigade>{
    @Override
    public void create(Brigade brigade) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="INSERT INTO brigade (brigade_id,name,abbreviation,description,brigade_commander,branch_id) VALUES (?,?,?,?,?,?)";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){
            stmt.setInt(1, brigade.getBrigadeId());
            stmt.setString(2, brigade.getName());
            stmt.setString(3, brigade.getAbbreviation());
            stmt.setString(4, brigade.getDescription());
            stmt.setString(5, brigade.getBrigade_commander());
            stmt.setInt(6, brigade.getBranchId());






            stmt.executeUpdate();
            System.out.println("briggade created!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error creating brigade, check status");
        }
    }

    @Override
    public void update(Brigade brigade) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="UPDATE brigade SET name=?,description=?, abbreviation=?, brigade_commander=? WHERE brigade_id=? ";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){


            stmt.setString(1, brigade.getName());
            stmt.setString(2, brigade.getDescription());
            stmt.setString(3, brigade.getAbbreviation());
            stmt.setString(4, brigade.getBrigade_commander());
            stmt.setInt(5, brigade.getBrigadeId());







            stmt.executeUpdate();
            System.out.print("brigade updated!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error updating brigade, check status");
        }
    }

    @Override
    public void delete(Brigade brigade) {
        DatabaseConnect conn=new DatabaseConnect();
        String sql="DELETE FROM brigade WHERE brigade_id=?";
        try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
            stmt.setInt(1,brigade.getBrigadeId());


            stmt.executeUpdate();
            System.out.print("brigade deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error deleting brigade, check status");
        }
    }

    @Override
    public List<Brigade> getAll() {
        return List.of();
    }
}
