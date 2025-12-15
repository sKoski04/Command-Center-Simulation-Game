package CRUD;

import Models.Branch;
import Connections.DatabaseConnect;

import java.sql.PreparedStatement;
import java.util.List;

public class BranchCrud implements GeneralizedCrud<Branch>{

    @Override
    public void create(Branch branch) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="INSERT INTO branch (branch_id,name,abbreviation,description,branch_commander,headquarters_location) VALUES (?,?,?,?,?,?)";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){
        stmt.setInt(1,branch.getBranchId());
        stmt.setString(2,branch.getName());
        stmt.setString(3,branch.getAbbreviation());
        stmt.setString(4,branch.getDescription());
        stmt.setString(5,branch.getBranchCommander());
        stmt.setString(6,branch.getHeadquarterLocation());







            stmt.executeUpdate();
            System.out.println("branch created!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error creating branch, check status");
        }
    }

    @Override
    public void update(Branch branch) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="UPDATE branch SET name=?,description=?, abbreviation=?, branch_commander=? WHERE branch_id=? ";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){


           stmt.setString(1,branch.getName());
           stmt.setString(2,branch.getDescription());
           stmt.setString(3,branch.getAbbreviation());
           stmt.setInt(4,branch.getBranchId());
           stmt.setInt(5,branch.getBranchId());







            stmt.executeUpdate();
            System.out.print("branch updated!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error updating branch, check status");
        }
    }

    @Override
    public void delete(Branch branch) {
        DatabaseConnect conn=new DatabaseConnect();
        String sql="DELETE FROM branch WHERE branch_id=?";
        try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
            stmt.setInt(1,branch.getBranchId());


            stmt.executeUpdate();
            System.out.print("branch deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error deleting branch, check status");
        }
    }

    @Override
    public List<Branch> getAll() {
        return List.of();
    }
}
