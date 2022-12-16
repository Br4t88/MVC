package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Buyer {
    private int buyers_id;
    private String name;

    public Buyer() throws SQLException, ClassNotFoundException {
    }

    public int getBuyers_id() {
        return buyers_id;
    }

    public void setBuyers_id(int buyers_id) {
        this.buyers_id = buyers_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Connection conn = DriverManager.getConnection(
        //    "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");



    public void delete() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");
            Statement st = conn.createStatement();
            st.execute("delete from buyers where buyers_id=" + buyers_id);


        } catch (SQLException exception) {
            exception.printStackTrace();
        }



        }


    public void insert () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");
            if (name !=null && !(name.isEmpty())){
                Statement st = conn.createStatement();
                st.execute("insert into buyers(name) values ('" + name + "')");

            }


        } catch (SQLException exception) {
            exception.printStackTrace();
        }


        }


    public void update() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");
            Statement st = conn.createStatement();
            st.execute("update buyers set name='" + name + "' where buyers_id="+ buyers_id + ";");

        } catch (SQLException exception) {
            exception.printStackTrace();
        }



    }
}
