/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendario;

/**
 *
 * @author juliet
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodCalendario m=new MetodCalendario(31,12,2020);
        
        System.out.println(m.GiornoSettimana());
        System.out.println(m.GiornoSuccessivo());
    }
    
}
