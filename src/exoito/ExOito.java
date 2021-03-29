/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoito;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ExOito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //8. Faça um programa que calcule e imprima a área de um círculo.
        Scanner teclado = new Scanner(System.in);//ele vai entender 
        double raio, diametro, area;
        System.out.println("Digite o raio do circulo: ");
        raio = teclado.nextDouble();
        diametro = raio*2;
        area = (3.1416)*(raio*raio);
        System.out.println("A area do circulo é de : "+area);
        
        
    }
    
}
