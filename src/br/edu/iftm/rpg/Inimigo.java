package br.edu.iftm.rpg;

public class Inimigo {
    private String nome;
    private int vida;
    private int dano;

    public Inimigo(String nome, int vida, int dano ){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar() {   
        System.out.println("O Inimigo " + nome  + " atacou o jogador e causou " + dano + " de dano");
    }

    public void perderVida(){
        if (vida <=0 ){
            System.out.println("O Inimigo " + nome + " é nub e morreu");
        }else{
            System.out.println("O Inimigo " + nome + " está com a vida em  " + vida + "%");
        }
    }

    public void apresentar(){
        System.out.print("O Inimigo " + getNome());
        System.out.print(" possui um dano de ataque de " + getDano());
        System.out.println(" e possui uma vida total de " + getVida() + "%");
    }
   

    public String getNome(){
        return nome;
    }

    public int getVida(){
        return vida;
    }

    public int getDano(){
        return dano;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void setDano(int dano){
        this.dano = dano;
    }


}
    

