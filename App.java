import java.sql.*;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;


 class App2{
    private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root";   // change if different
    private static final String PASSWORD = "root"; // change to your MySQL password

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // CreateStudent.insertStudent("jhon", 121, 90);
        // CreateStudent.insertStudent("Gayatri Patil",20,80);
        // CreateStudent.insertStudent("Komal Swami",28,99);
        // CreateStudent.insertStudent("Vaishnavi Pillai",75,70);
        // System.out.println("Hello, World!");
        // ReadStudent.getAllStudent();
        // UpdateStudent.UpdateStudent(1, 80);
        // UpdateStudent.UpdateStudent(11, 85);
        DeleteStudent.DeleteStudent(121);
    }
}
