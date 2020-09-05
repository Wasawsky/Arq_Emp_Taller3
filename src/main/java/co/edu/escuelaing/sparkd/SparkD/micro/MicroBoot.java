
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD.micro;

import java.sql.Connection;
import java.util.List;

import co.edu.escuelaing.sparkd.database.DBConnection;
import co.edu.escuelaing.sparkd.database.Pedido;

/**
 *
 * @author mjbc_
 */
public class MicroBoot {
    @RequestMapping("/aca")
    static public String index() {
            return "Greetings from Spring Boot!";
    }

    @RequestMapping("/report")
    static public String report() {
        
        Connection con = DBConnection.getConnection();
        List<Pedido> peds = DBConnection.makeSearch(con);
        for(Pedido p: peds){
                System.out.println(p.toString());
        }

        String outputLine = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Menu de Pedidos</h1>\n"
                + ""
                + "<table border =\"1\">\n"
                + "<tr>\n"
                + "<th>Restaurante</th>\n"
                + "<th>Plato</th>\n"
                + "<th>Precio</th>\n"
                + "<th>Mesa</th>\n"
                + "</tr>\n";

        for(Pedido p: peds){
                outputLine+="<tr>\n"
                + "<td>"+p.getRestaurante()+"</td>\n"
                + "<td>"+p.getPlato()+"</td>\n"
                + "<td>"+p.getPrecio()+"</td>\n"
                + "<td>"+p.getMesa()+"</td>\n"
                + "</tr>\n";
        }

        outputLine+="</table>\n"
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
}

