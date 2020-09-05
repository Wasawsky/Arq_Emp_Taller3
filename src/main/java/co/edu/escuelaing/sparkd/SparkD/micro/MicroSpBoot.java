/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD.micro;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mjbc_
 */
public class MicroSpBoot {
    
    
    public static void main(String[] args){
        String[] arg = {"co.edu.escuelaing.sparkd.SparkD.micro.MicroBoot"};
        //args = String[] a = {"co.edu.escuelaing.sparkd.SparkD.micro.MicroBoot"};
        args = arg;
        try {
            MicroS iocServer = new MicroS();
            System.out.println(args[0]);
            iocServer.start(args);
            HttpServer server = new HttpServer(iocServer);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
