package br.edu.iftm.rpg;

public class Jogador {
    private int vidaB ;
    private String nomeB;
    private int danoB;


    public Jogador(String nome, int vida, int dano ){
        this.nomeB = nome;
        this.vidaB = vida;
        this.danoB = dano;

    }

    public void atacar(){
        System.out.println("O Jogador " + nomeB  + " atacou o inimigo e causou " + danoB + " de dano");
       
    }

    public void perderVida(){
        if (vidaB <=0 ){
            System.out.println("O Jogador " + nomeB + " é nub e morreu");
        }else{
            System.out.println("O jogador " + nomeB + " está com a vida em  " + vidaB + "%");
        }
    }

    public void apresentar(){
        System.out.print("O jogador " + getNomeB());
        System.out.print(" possui um dano de ataque de " + getDanoB());
        System.out.println(" e possui uma vida total de " + getVidaB() + "%");
    }

    public String getNomeB(){
        return nomeB;
    }
    
    public int getVidaB(){
        return vidaB;
    }
    
    public int getDanoB(){
        return danoB;
    }

    public void setNomeB(String nomeB){
        this.nomeB = nomeB;
    }

    public void setVidaB(int vidaB){
        this.vidaB = vidaB;
    }

    public void setDanoB(int danoB){
        this.danoB = danoB;
    }


}
