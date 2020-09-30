package net.greet;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.fail;

public class people {

    final String DATABASE_URL = "";

    public Connection getConnection() throws Exception {
        // TODO - add a username of "sa" and a blank password ""
        // TODO - if the db is created via default flyway config the username will be "sa" with a blank password
        // you can change this by removing the user element containing sa in the pom.xml file
        // if not be sure to delete the *.db files in your target folder before running mvn flyway:migrate the first time
        // and be sure the set the username to "sa" password blank ""
        // if your remove the user element from the pom.xml file you are use a username of "" and a password of ""
        Connection conn = DriverManager.getConnection(DATABASE_URL, "cairo", "cairo123");
        return conn;
    }

    public void addDataToFruitTableViaMigration() {

        try {

            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery ("select count(*) as fruit_count from fruit");

            if (rs.next()) {
                // mmm... how many rows was actually added in the V2__add_fruit.sql migration file
                assertEquals(3, rs.getInt("fruit_count"));
            }

            // todo - add a V2__add_fruit.sql file in the src/main/db/migration folder
            // todo - add a create table script in there to create a fruit table

            /*
                insert into fruit (name, price) values ('red apple', 4.75);
                insert into fruit (name, price) values ('green apple', 2.64);
                insert into fruit (name, price) values ('banana', 3.15);
                insert into fruit (name, price) values ('lemon', 5.75);
             */

            // todo - run the migration using the in your project root folder using:
            // mvn flyway:migrate

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
