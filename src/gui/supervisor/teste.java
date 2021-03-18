/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.supervisor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class teste {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String hora = "15:30";
        String segundos = ":00";
        String horaCompleta = hora.concat(segundos);
        
        System.out.println("HORA CONCAT: " + horaCompleta);
        
        Date hrData = new Date();
        hrData = sdf.parse(horaCompleta);
        
        System.out.println("HORAS: " + sdf.format(hrData));
    }
}
