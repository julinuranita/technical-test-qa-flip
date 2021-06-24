import java.sql.*;
import java.util.ArrayList;

public class DBConnection {

    public static Connection DatabaseConnection() throws SQLException {
        String host = "localhost";
        String port = "3306";
        String user = "root";
        String password = "password";

        Connection con = DriverManager.getConnection("jdbc:mysql://"+host+ ":" +port+"/transaction",user,password);
        return con;
    }

    public static ArrayList<String> getDataDB(String query){
       ArrayList<String> DataDB = new ArrayList<>();

        try{
            Connection con = DatabaseConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            int column = rs.getMetaData().getColumnCount();

            rs.first();
            for (int i = 0; i < column; i++){
                DataDB.add(rs.getString(i));
            }
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }

        return DataDB;
    }
}