/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pushthemonsterintothedungeon;

/**
 *
 * @author Rober
 */
public class Monster {
    
    private String nome;
    private Integer puntiFerita;
    private Integer danno;

    public Monster(String nome, Integer puntiFerita, Integer danno) {
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
    }
    
    public Integer attacca(){
        return danno;
    }
    
    public void subisci(Integer danno) throws Exception{
        if(danno < puntiFerita)
            puntiFerita -= danno;
        else
            throw new Exception("The monster " + nome + " is dead");
    }
    
}
