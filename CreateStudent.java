import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateStudent {
    public static void insertStudent(String name, int roll_no, int marks) {
        String sql = "INSERT INTO stud_1(name, roll_no, marks) VALUES (?, ?, ?)";

        try (Connection conn = App2.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, roll_no);
            stmt.setInt(3, marks);

            int rows = stmt.executeUpdate();
            System.out.println(rows + " student inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}