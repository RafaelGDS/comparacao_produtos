package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usado extends Produto{

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date adquiriuEm;

	public Usado(String nome, float preco, Date adquiriuEm) {
		super(nome, preco);
		this.adquiriuEm = adquiriuEm;
	}

	public Date getAdquiriuEm() {
		return adquiriuEm;
	}

	public void setAdquiriuEm(Date adquiriuEm) {
		this.adquiriuEm = adquiriuEm;
	}
	
	@Override
	public String etiqueta() {
		return getNome()
				+ " PREÇO DO PRODUTO R$ "
				+ String.format("%.2f", getPreco())
				+ " DATA QUE ADQUIRIU O PRODUTO: "
				+ sdf.format(adquiriuEm);
	}
}
