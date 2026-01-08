import java.sql.*;
public class UpdateStudent {
    public static void UpdateStudent( int roll_no, int new_marks){

    String sql = "UPDATE stud_1 SET marks = ? WHERE roll_no = ?"; 

    try (Connection conn=App2.getConnection();
        PreparedStatement stmt= conn.prepareStatement(sql))
        {
            stmt.setInt(1, new_marks);
            stmt.setInt(2,roll_no);
            int row= stmt.executeUpdate();
            System.out.println("Student updated successfully.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   }
}
