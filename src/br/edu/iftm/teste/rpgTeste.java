package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class rpgTeste {
    public static void main(String[] args)throws Exception{
        System.out.println("A luta do Ano");
        Inimigo inimigo = new Inimigo("Mancoso", 100, 12);
        Inimigo inimigoB = new Inimigo("Paulada", 100, 25);
        Jogador jogador = new Jogador("Pedrada", 200, 28);
        Luta lutinha = new Luta();
        
        jogador.apresentar();
        inimigo.apresentar();
        inimigoB.apresentar();
        inimigo.atacar();
        jogador.atacar();
        inimigoB.atacar();
        lutinha.lutar(jogador, inimigo);
        lutinha.lutar(jogador, inimigoB);
        inimigo.perderVida();
        jogador.perderVida();
        inimigoB.perderVida();

        System.out.println();

        inimigo.atacar();
        jogador.atacar();
        inimigoB.atacar();
        lutinha.lutar(jogador, inimigo);
        lutinha.lutar(jogador, inimigoB);
        inimigo.perderVida();
        jogador.perderVida();
        inimigoB.perderVida();

        System.out.println();

        inimigo.atacar();
        jogador.atacar();
        inimigoB.atacar();
        lutinha.lutar(jogador, inimigo);
        lutinha.lutar(jogador, inimigoB);
        inimigo.perderVida();
        jogador.perderVida();
        inimigoB.perderVida();

        System.out.println();

        inimigo.atacar();
        jogador.atacar();
        inimigoB.atacar();
        lutinha.lutar(jogador, inimigo);
        lutinha.lutar(jogador, inimigoB);
        inimigo.perderVida();
        jogador.perderVida();
        inimigoB.perderVida();

       

      


    
        




    }
    
}
