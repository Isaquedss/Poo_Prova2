package br.edu.iftm.rpg;

public class Luta {

    private Jogador jogador;
    private Inimigo inimigo;

    public void lutar(Jogador jogador, Inimigo inimigo){
        if (jogador.getVidaB() <= 0){
            System.out.println("O jogador esta morto");
        }else{
            inimigo.setVida(inimigo.getVida() - jogador.getDanoB());
        }
        if (inimigo.getVida() <= 0){
            System.out.println("O inimigo esta morto");
        }else{
            jogador.setVidaB(jogador.getVidaB() - inimigo.getDano());
            
        }   
      
    }
    
    
}
