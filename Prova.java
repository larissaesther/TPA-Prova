import java.util.Scanner;
public class Prova {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, a[];
		double preco = 0 , media = 0, maior = 0, resposta;
        final int TAM = 5;
        a = new int[TAM];
        for(i = 0; i<TAM; i++) {
            System.out.println("Digite o preço do "+(i+1)+ "º produto:");
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
        System.out.println("A soma dos produtos é R$ " + preco);
        System.out.println("A media dos produtos é R$ " + media);
        System.out.println("O maior valor é R$ " + maior);
        do {
        	if (preco<=150) {
    			System.out.println("Você vai conseguir comprar todos os produtos!");
    		}else {
    			System.out.println("Você não vai conseguir comprar =(");
    		}
    		System.out.println("Deseja continuar? 1- SIM 2- Não");
    		resposta = in.nextInt();
    		i++;
    	}while(resposta!=2);
			}
	}
}


		  
	//Uma dona de casa precisa comprar 5 produtos do mercado mas não sabe se o dinheiro que ela tem é suficiente. Para isso, terá que ler o preço dos 5 produtos e informar:

//- A soma total do preço dos produtos
//- A média do preço dos 5 produtos
//- O preço do produto mais caro 

//Sabendo que a dona de casa dispõe de 150 reais, ao final, informar se ela vai conseguir comprar todos os produtos ou não via mensagem	

	


