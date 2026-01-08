import java.sql.*;
public class ReadStudent{
    public static void getAllStudent() {
        String sql="Select * from stud_1";
        try( Connection conn= App2.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery(sql))
        {
            while (rs.next())
            {
                System.out.println(rs.getString("name")+ " | "+rs.getInt("roll_no")+" | "+ rs.getInt("marks"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}