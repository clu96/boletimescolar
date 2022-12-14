/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletimescolar;

public class BoletimEscolar {

    public static void main(String[] args) {
       DadosBoletim resultadomedia = new DadosBoletim();
       resultadomedia.exibirResultado();
       resultadomedia.calcularMedias();
       System.out.println("O aluno(a) "+resultadomedia.nomealuno+" ,sua media final e: "+resultadomedia.media);
       resultadomedia.statusAluno();
       
    }
    
}
