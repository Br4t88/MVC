package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product  {
    private int products_id;
    private String name;

    public Product() throws SQLException, ClassNotFoundException {
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Connection conn = DriverManager.getConnection(
           // "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");


    public void  delete () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");
            Statement st = conn.createStatement();
            st.execute("delete from products where products_id=" + products_id);
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
                st.execute("insert into products (name) values ('" + name + "')");

            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }


            }

    public void  update () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/shop", "root", "arsenalfcfan");
            Statement st = conn.createStatement();
            st.execute("update products set name='" + name + "' where products_id="+ products_id + ";");


        } catch (SQLException exception) {
            exception.printStackTrace();
        }




        }
    }

