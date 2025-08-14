package atividadePoo;

import java.util.ArrayList;
import java.util.Scanner;

public class PenDrive {
	String nome;
	double capacidadeGB = 128;
	ArrayList<String> arquivos = new ArrayList<String>();
	boolean estaConectado;

	Scanner scan = new Scanner(System.in);

	//Função para adicionar arquivos ao pendrive 
	public void adicionaArquivo(String nomeAux, double memoriaAux) {
		//verifica se o pen drive está conectado
		if (estaConectado == true) {
			//verifica se há espaço de armazenamento no pen drive
			if(memoriaAux <= capacidadeGB) {
				//concatena o nome e o tamanho do arquivo em uma string separada por virgula
				String arquivoFormat= nomeAux.concat("," + String.valueOf(memoriaAux));
				//adiciona a string concatenada ao arraylist e atualiza a capacidade de armazenamento
				arquivos.add(arquivoFormat);
				capacidadeGB -= memoriaAux;
				System.out.println("Arquivo criado com sucesso!");
			}else{
				System.out.println("Memoria Insuficiente!");
			}
		} else {
			System.out.println("Erro!, o pen drive não está conectado!");
		}
	}

	//função para conectar o pen drive
	public void conectar() {
		if (estaConectado == true) {
			System.out.println("O penDrive ja está Conectado!");
		}else{
			estaConectado = true;
			System.out.println("Pen Drive conectado");
		}
	}

	//função para desconectar o pen drive
	public void desconectar() {
		if(estaConectado == true){
		estaConectado = false;
		System.out.println("Pen Drive desconectado");
		}else{
			System.out.println("O pen drive não estava conectado");
		}
	}

	//função para visualizar os arquivos armazenados no pen drive
	public void visualizarArquivos() {
		System.out.println("Arquivos no pendrive: ");
		//for each que varre o array list arquivos
		for(String arquivo: arquivos) {
			//separa o nome do arquivo e o tamanho e retira a virgula
			String[] partes = arquivo.split(",");
			System.out.println(partes[0] +" " + partes[1] + " Gb");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCapacidadeGB() {
		return capacidadeGB;
	}

	public void setCapacidadeGB(double capacidadeGB) {
		this.capacidadeGB = capacidadeGB;
	}

	public ArrayList<String> getArquivos() {
		return arquivos;
	}

	public void setArquivos(ArrayList<String> arquivos) {
		this.arquivos = arquivos;
	}

	public boolean isEstaConectado() {
		return estaConectado;
	}

	public void setEstaConectado(boolean estaConectado) {
		this.estaConectado = estaConectado;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	
}
