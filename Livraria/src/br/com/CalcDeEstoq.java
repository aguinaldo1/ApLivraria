package br.com;

public class CalcDeEstoq {

	public static void main(String[] args) {
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;

		double soma = livroJava8+livroTDD;
		
		System.out.println("O total em estoque é: " + soma);
		
		if (soma < 150){
			System.out.print("o estoque esta muito abaixo");
		}else{
			System.out.println("o estoque esta bom");
		}
	}

}
