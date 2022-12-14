/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletimescolar;

import java.util.Scanner;

public class DadosBoletim {
    public String nomealuno;
    public float notahtml,notacss,notajs,notaphp,notajava,media;
    
    Scanner ler = new Scanner(System.in);

        public void calcularMedias(){
               media = (notahtml+notacss+notajs+notaphp+notajava)/5;
}
    public void exibirResultado(){
        System.out.println("Informar nome do aluno: ");
        nomealuno = ler.nextLine();
        System.out.println("Informar nota HTML: ");
        notahtml = ler.nextFloat();
        System.out.println("Informar nota CSS: ");
        notacss = ler.nextFloat();
        System.out.println("Informar nota JS: ");
        notajs = ler.nextFloat();
        System.out.println("Informar nota PHP: ");
        notaphp = ler.nextFloat();
        System.out.println("Informar nota JAVA: ");
        notajava = ler.nextFloat();
        ler.close();
       
        
       }
    
    public void statusAluno(){
  if(media>=5){
    System.out.println("Aprovado");
               }
  else{
    System.out.println("Reprovado");
    
                }
}
    
}