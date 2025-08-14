package atividadePoo;

import java.util.Scanner;

public class TestePenDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//instancia o objeto pendrive
		PenDrive penDrive = new PenDrive();
		
		int opcao = -1;
			
		try {
			while(opcao != 0) {
				System.out.println("========================================");
				System.out.println("1. Conectar Pen-Drive");
				System.out.println("2. Criar novo Arquivo");
				System.out.println("3. Arquivos do Pen Drive");
				System.out.println("4. Desconetar Pen Drive");
				System.out.println("====================================");
				opcao = scan.nextInt();
				
										
				switch (opcao) {	
				case 1:
					penDrive.conectar();
					opcao = -1;
					break;
			 	case 2:
					penDrive.adicionaArquivo();
					break;
					
			 	case 3:
					penDrive.visualizarArquivos();
					break;
					
			 	case 4:
					penDrive.desconectar();
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

		scan.close();
	}
}
