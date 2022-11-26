/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pushthemonsterintothedungeon;

/**
 *
 * @author Rober
 */
public class PushTheMonsterIntoTheDungeon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Monster m1 = new Monster("ciccio", 10, 5);
        Monster m2 = new Monster("franco", 20, 2);
        
        m1.subisci(m2.attacca());
        m2.subisci(m1.attacca());
        m1.subisci(m2.attacca());
        m2.subisci(m1.attacca());
        m1.subisci(m2.attacca());
        m2.subisci(m1.attacca());
    }
    
}
