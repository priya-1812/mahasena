/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasena;
import java.util.Scanner;
public class Mahasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int i,a=0,b=0;
        int M=in.nextInt();
        for(i=0;i<N;i++)
        {
            
            if(N%2==0)
            {
               M++;
            }
            else
            {
               N++; 
            }
        }
        if(M>N)
        {
            System.out.println("READY FOR BATTLE");
        }
        else
        {
            System.out.println("NOT READY");
        }
        
    }
    
}
