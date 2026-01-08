import java.sql.*;
public class DeleteStudent {
    public static void DeleteStudent(int roll_no) {
        String sql= "Delete from stud_1 WHERE roll_no=?";

        try(Connection conn= App2.getConnection();
        PreparedStatement stmt= conn.prepareStatement(sql))
        {
            stmt.setInt(1,roll_no);
            int row= stmt.executeUpdate();
            System.out.println(row + " student deleted successfully.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
