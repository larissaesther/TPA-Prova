import java.util.Scanner;
public class Prova {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, a[];
		double preco = 0 , media = 0, maior = 0, resposta;
        final int TAM = 5;
        a = new int[TAM];
        for(i = 0; i<TAM; i++) {
            System.out.println("Digite o pre�o do "+(i+1)+ "� produto:");
            a[i] = in.nextInt();
         }
        preco =  a[0]+a[0];
        preco = preco + a[1];
        preco = preco + a[2];
        preco = preco + a[3];
        preco = preco + a[4];
        for (i = 0; i < TAM; i++) {
        	media = preco/5;
        }
        for (i = 0; i < TAM;) {
        	if (a[i] > maior) {
        		maior = a[i];
        }
        System.out.println("A soma dos produtos � R$ " + preco);
        System.out.println("A media dos produtos � R$ " + media);
        System.out.println("O maior valor � R$ " + maior);
        do {
        	if (preco<=150) {
    			System.out.println("Voc� vai conseguir comprar todos os produtos!");
    		}else {
    			System.out.println("Voc� n�o vai conseguir comprar =(");
    		}
    		System.out.println("Deseja continuar? 1- SIM 2- N�o");
    		resposta = in.nextInt();
    		i++;
    	}while(resposta!=2);
			}
	}
}


		  
	//Uma dona de casa precisa comprar 5 produtos do mercado mas n�o sabe se o dinheiro que ela tem � suficiente. Para isso, ter� que ler o pre�o dos 5 produtos e informar:

//- A soma total do pre�o dos produtos
//- A m�dia do pre�o dos 5 produtos
//- O pre�o do produto mais caro 

//Sabendo que a dona de casa disp�e de 150 reais, ao final, informar se ela vai conseguir comprar todos os produtos ou n�o via mensagem	

	


