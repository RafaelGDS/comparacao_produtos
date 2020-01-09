package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Importado;
import classes.Produto;
import classes.Usado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Quantas pesquisas deseja fazer? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("PRODUTO #" + i);
			System.out.print("Produto novo, importado ou usado? (n/i/u)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço do produto: ");
			float preco = sc.nextFloat();
			
			if(ch == 'n') {
				lista.add(new Produto(nome, preco));
			}
			else if(ch == 'u') {
				System.out.print("Digite a data que adquiriu o produto (xx/xx/xxxx): ");
				Date data = sdf.parse(sc.next());			
				lista.add(new Usado(nome, preco, data));
			}
			else {
				System.out.print("Digite as taxas pagas: ");
				float taxas = sc.nextFloat();
				lista.add(new Importado(nome, preco, taxas));
			}
			
			}
			System.out.println();
			System.out.println("ETIQUETAS");
			for(Produto prod : lista) {
			System.out.println(prod.etiqueta());
		}
		sc.close();	
	}
		
}
