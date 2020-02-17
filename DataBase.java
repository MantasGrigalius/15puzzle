import java.sql.*;

public class DataBase {
    static Connection conn = null;
    public static void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String DB_URL = "jdbc:mysql://localhost/15puzzle";
        String USER = "root";
        String PASS = "vadeivos";
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }
    private void getfromdb() throws Exception {
        Statement ps = conn.createStatement();
        ResultSet rez = ps.executeQuery("SELECT * FROM highscore");

        while (rez.next()) {
            int Playerid = rez.getInt("Playerid");
            String Playername = rez.getString(2);
            int Score = rez.getInt("Score");
            System.out.println(Playerid + " " + Playername + " " + Score);
        }
        rez.close();
        ps.close();
    }

    public static void disconnect() throws Exception {
        conn.close();
    }
    public static void inserttodb(String vardas) throws Exception {
        String query = ("INSERT INTO highscore(Playername, Score)") + " values (?, ?)";;

        PreparedStatement preparedStmt = DataBase.conn.prepareStatement(query);
        preparedStmt.setString (1, vardas);
        preparedStmt.setInt(2, Frame.Score);
        preparedStmt.execute();
    }
}
