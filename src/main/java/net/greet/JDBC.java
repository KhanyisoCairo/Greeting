package net.greet;

import java.sql.*;

public class JDBC implements Greeting {
    Connection conn;

    public JDBC() {
        this.conn = connectDB();
    }

    public static void main(String args[]) {
    }

    public static Connection connectDB() {

        try {
            Class.forName("org.h2.Driver");
            final String jdbcURL = "jdbc:h2:file:./target/greetings";
            Connection conn = DriverManager.getConnection(jdbcURL, "sa", "");
            return conn;

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public void addData(String name) {
        try {
            final String SQL = "insert into users (name, counter) values (?, ?)";

            PreparedStatement addDataPreparedStatement = conn.prepareStatement(SQL);
            addDataPreparedStatement.setString(1, name);
            addDataPreparedStatement.setInt(2, 1);
            addDataPreparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getData() {
        try {
            final String SQL = "SELECT * FROM users";

            PreparedStatement addDataPreparedStatement = conn.prepareStatement(SQL);
            ResultSet rs = addDataPreparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String greet(String name, String language) {
        return null;
    }

    @Override
    public int counter() {
        try {
            final String SQL = "SELECT * FROM users where name=?";

            PreparedStatement addDataPreparedStatement = conn.prepareStatement(SQL);
            addDataPreparedStatement.setInt(1, 1);
            ResultSet rs = addDataPreparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("counter"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String greeted() {
        try {
            final String SQL = "SELECT * FROM users";

            PreparedStatement addDataPreparedStatement = conn.prepareStatement(SQL);
            ResultSet rs = addDataPreparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String greeted(String name) {
        try {
            final String SQL = "SELECT * FROM users where name=?";

            PreparedStatement addDataPreparedStatement = conn.prepareStatement(SQL);
            addDataPreparedStatement.setString(1, name);
            ResultSet rs = addDataPreparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("counter"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String clear() {
        return null;
    }


}
