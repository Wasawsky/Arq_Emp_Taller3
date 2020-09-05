package co.edu.escuelaing.sparkd.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static String url = "jdbc:mysql://remotemysql.com:3306/SrHWO0wWd4";
    private static String user = "SrHWO0wWd4";
    private static String pass = "69Q1ah2NoD";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con= DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Error1");
            e.printStackTrace();
        }
        return con;
    }

    public static List<Pedido> makeSearch(Connection con) {
        ArrayList<Pedido> menu = new ArrayList<>();
        
        try {
            String query = "select * from Menu";
            PreparedStatement pst = con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            //System.out.println(rs);
            //System.out.println("query");

            while (rs.next()) {
                String restaurante = rs.getString("Restaurante");
                String plato = rs.getString("Plato");
                String precio = rs.getString("Precio");
                Integer mesa = rs.getInt("Mesa");
                Pedido ped = new Pedido(restaurante, plato, precio, mesa);
                menu.add(ped);
                //System.out.print(ped.toString());
                //System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("Error2");
            e.printStackTrace();
        }
        return menu;
    }

    public static void main(String[] args) {
        Connection con = getConnection();
        makeSearch(con);
    }
}
