package imagemMatrizes;

import java.util.Scanner;
public class ImagemMatrizes 
{

	public static void main(String[] args) 
	{
		Scanner read =  new Scanner(System.in);
		int i = 0,j = 0,m[][] = new int[16][16];

		for(i=0;i<16;i++)
		{	
			System.out.printf("Digite (0) para Branco: \nDigite (1) para Preto: \nDigite (2) para Vermelho: \nDigite (3) para Bege: \n\n");

			for(j=0;j<16;j++)
			{
				System.out.printf("m [%d][%d] = ",i,j); //exibe as posicoes da matriz onde sera gravado o valor digitado
				m [i][j] = read.nextInt();				//grava valor na posicao da matriz
				if(m[i][j] > 3)							//se valor digitado for maior que 3
				{
					System.out.println("INVÁLIDO");		//exibe mensagem invalido
					j = j-1;							// subtrai 1 da variavel 'j'
				}
			}
		}

		System.out.printf("\n");
		System.out.printf("\n");
		for(i=0;i<16;i++)
		{
			for(j=0;j<16;j++)
			{
				System.out.printf("%d",m[i][j]);		//exibe valores da matriz
			}

			System.out.printf("\n");
		}
	}	
}



