package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sales {

    private int id;
    private int buyers_id;
    private int products_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyers_id() {
        return buyers_id;
    }

    public void setBuyers_id(int buyers_id) {
        this.buyers_id = buyers_id;
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public void update() throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/shop", "root", "arsenalfcfan")) {
            Statement st = conn.createStatement();
            st.execute("delete from products where products_id=" + products_id+";");


        } catch (SQLException exception) {
            sb.append(exception.getMessage());
        }
    }
}
