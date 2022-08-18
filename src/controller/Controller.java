package controller;

public class Controller {

	public Controller() {
		super();
	}
	public int Somatorio(int qtde) {
		int soma=0;
		
		if  (qtde<1) {
			return 0;
		}
		else {
		soma = qtde + Somatorio(qtde - 1);
		}
	 return soma;
	}
}
