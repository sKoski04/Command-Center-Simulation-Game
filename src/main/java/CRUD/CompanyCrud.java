package CRUD;

import Models.Company;
import Services.DatabaseConnect;

import java.sql.PreparedStatement;
import java.util.List;

public class CompanyCrud implements GeneralizedCrud <Company> {
    @Override
    public void create(Company company) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="INSERT INTO company (company_id,name,abbreviation,description,company_commander,battalion_id) VALUES (?,?,?,?,?,?)";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){
            stmt.setInt(1, company.getCompanyId());
            stmt.setString(2, company.getName());
            stmt.setString(3, company.getAbbreviation());
            stmt.setString(4, company.getDescription());
            stmt.setString(5,company.getCompany_commander());
            stmt.setInt(6,company.getBattalionId());




            stmt.executeUpdate();
            System.out.println("company created!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error creating company, check status");
        }
    }

    @Override
    public void update(Company company) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="UPDATE company SET name=?,description=?, abbreviation=?, company_commander=? WHERE company_id=? ";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){


         stmt.setString(1, company.getName());
         stmt.setString(2, company.getDescription());
         stmt.setString(3, company.getAbbreviation());
         stmt.setString(4, company.getCompany_commander());

         stmt.setInt(5,company.getCompanyId());







            stmt.executeUpdate();
            System.out.print("company updated!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error updating company, check status");
        }
    }

    @Override
    public void delete(Company company) {
        DatabaseConnect conn=new DatabaseConnect();
        String sql="DELETE FROM company WHERE company_id=?";
        try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
            stmt.setInt(1, company.getCompanyId());


            stmt.executeUpdate();
            System.out.print("company deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error deleting company, check status");
        }
    }

    @Override
    public List getAll() {
        return List.of();
    }
}
