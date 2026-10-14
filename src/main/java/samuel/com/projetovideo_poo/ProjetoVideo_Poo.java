/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.com.projetovideo_poo;

/**
 *
 * @author Samuel
 */
public class ProjetoVideo_Poo {

    public static void main(String[] args) {
        
        Video v[] = new Video [3];
        
        v[0] = new Video("Aula 1 de POO ");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video ("Aula 3 de Abstração");
        
        Usuario u[] = new Usuario[2];
        
        u[0] = new Usuario ("Samuel",29,"M", "sam" );
        u[1] = new Usuario ("Jessica",27, "F","Jess");
        
        Visualizacao vis[]= new Visualizacao [5];
        
        vis[0] = new Visualizacao(u[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(u[0],v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        
        /*System.out.println("VIDEOS\n---------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Usuarios\n-----------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());*/
        
       
        
        
    }
}
