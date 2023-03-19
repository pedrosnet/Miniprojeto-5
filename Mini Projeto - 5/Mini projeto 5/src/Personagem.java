public class Personagem {

    String nome;
    int energia;

    Personagem(String nome, int energia){
        this.nome = nome;
        this.energia = 100;
    }

    void alterarEnergia(int alteracao){
        this.energia = this.energia + alteracao;

        if (alteracao > 0) {
            System.out.println( nome +" realizou uma ação e ganhou " + alteracao + " pontos de energia");
        } else if (alteracao < 0) {
            System.out.println( nome + " realizou uma ação e perdeu " + alteracao + " pontos de energia");
        } else {
			System.out.println("");
		}

        if(this.energia > 100){
            this.energia = 100;
			System.out.println( nome + "energia maximizada! Continue lutando!");
        } else if(this.energia < 0){
            this.energia = 0;
            System.out.println(nome + "sem energia! Tente outra vez, não desista!");
            System.exit(1);
        }

    }
}