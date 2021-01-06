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
public class MetodCalendario {
    private int gg;
    private int mm;
    private int aaaa;
    private int[] giorni = {31,28,31,30,31,30,31,31,30,31,30,31};

    public MetodCalendario(int gg, int mm, int aaaa) {
        this.gg = gg;
        this.mm = mm-1;
        this.aaaa = aaaa;
        if(aaaa%400==0 || (aaaa%4==0 && aaaa%100!=0)){
        giorni[1]=29;
        }
    }

    
    public String GiornoSettimana(){
        int t=0;
        String nome="";
        for(int i=0;i<mm;i++){
            t+=giorni[i];
        }
        t+=gg;
        
        double x = aaaa + java.lang.Math.floor((aaaa - 1)/4)- java.lang.Math.floor((aaaa - 1)/100) + java.lang.Math.floor((aaaa - 1)/400) + t;
        x=x%7;
        if(x==0)
            nome="sabato";
        if(x==1)
            nome="domenica";
        if(x==2)
            nome="lunedi";
        if(x==3)
            nome="martedi";
        if(x==4)
            nome="mercoledi";
        if(x==5)
            nome="giovedi";
        if(x==6)
            nome="vernerdi";
        return nome;
    }
    
   
    public String GiornoSuccessivo(){
        String data="";
        if(gg==31 && mm==11){
        data=1+"/"+1+"/"+(aaaa+1);
        }else{
        int t=0, i=0, j=0;
        for(j=0;j<mm;j++){
            t+=giorni[j];
        }
        t+=gg+1;
        
        
        for(i=0;t>0;i++){
        t-=giorni[i];
        }
        t+=giorni[i-1];
        data=t+"/"+i+"/"+aaaa;
        }
        return data;
    }
   
}
