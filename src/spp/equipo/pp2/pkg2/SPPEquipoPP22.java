/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipo.pp2.pkg2;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPEquipoPP22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Este programa evaluara si los arreglos son iguales");
        Scanner kb=new Scanner(System.in);
        int b;       
        System.out.println("Introduzca el largo y ancho de su arrgeglo");
        b=pedirDato();
        int [][] matrixa=new int[b][b];
        int [][] matrixb=new int[b][b];
        System.out.println("Intrpduzca los datos de su primer arreglo");
        matrixa= matrix(b);
        System.out.println("Introduzca los datos de su segundo arreglo");
        matrixb= matrix(b);
        evaluar(matrixa,matrixb);
    }
public static int pedirDato (){
    Scanner kb= new Scanner(System.in);
    boolean flag;
    int n=0;
        do{
        System.out.println("Introduzca un numero entero");
        try{
           n=kb.nextInt();
           flag=false;        
        }catch(Exception er){
            System.out.println("Intentelo de nuevo");
            flag=true;
            kb.nextLine();
        }        
    }while (flag);
            return n;
}
public static int [][] matrix(int b){
 int [][]matrix=new int [b][b];
    for (int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix.length;j++)
        {
            matrix[i][j]=pedirDato();
        }  
        }
        return matrix;
}  
public static void evaluar(int[][]matrixa,int [][]matrixb){
int x=0;
    for (int i=0;i<matrixa.length;i++){
        for (int j=0;j<matrixa.length;j++){
            
            x=matrixa[i][j]-matrixb[i][j]; 
            if (x==0){
            }else{
                System.out.println("Sus arreglos son diferentes");
                x=2;
                break;
            }
} 
}
if(x==0){
    System.out.println("Sus arreglos son iguales");
}else{
}     
}
}

    

