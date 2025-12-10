import java.sql.PreparedStatement;
import java.util.List;

public class PlatoonCrud implements GeneralizedCrud <Platoon> {
    @Override
    public void create(Platoon platoon) {
DatabaseConnect connection = new DatabaseConnect();
        String sql="INSERT INTO platoon (platoon_id,name,description,abbreviation,platoon_commander,company_id) VALUES (?,?,?,?,?,?)";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){
            stmt.setInt(1, platoon.getId());
            stmt.setString(2, platoon.getName());
            stmt.setString(3, platoon.getDescription());
            stmt.setString(4,platoon.getAbbreviation());
            stmt.setString(5,platoon.getPlatoon_commander());
            stmt.setInt(6,platoon.getCompany_id());

            stmt.executeUpdate();
            System.out.println("platoon created!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error creating platoon, check status");
        }
    }

    @Override
    public void update(Platoon platoon) {
        DatabaseConnect connection = new DatabaseConnect();
        String sql="UPDATE platoon SET name=?,description=?, abbreviation=?, platoon_commander=?, company_id=? WHERE platoon_id=? ";
        try(PreparedStatement stmt=connection.getConnection().prepareStatement(sql)){


            stmt.setString(1,platoon.getName() );
            stmt.setString(2,platoon.getDescription());
            stmt.setString(3,platoon.getAbbreviation());
            stmt.setString(4,platoon.getPlatoon_commander());
            stmt.setInt(5,platoon.getCompany_id());
            stmt.setInt(6,platoon.getId());



            stmt.executeUpdate();
            System.out.print("Platoon updated!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error updating platoon, check status");
        }

    }

    @Override
    public void delete(Platoon platoon) {
        DatabaseConnect conn=new DatabaseConnect();
        String sql="DELETE FROM platoon WHERE platoon_id=?";
        try(PreparedStatement stmt=conn.getConnection().prepareStatement(sql)){
            stmt.setInt(1, platoon.getId());


            stmt.executeUpdate();
            System.out.print("platoon deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error deleting platoon, check status");
        }
    }

    @Override
    public List<Platoon> getAll() {
        return List.of();
    }
}
