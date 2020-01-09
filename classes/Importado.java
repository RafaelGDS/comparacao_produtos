package classes;

public class Importado extends Produto{

	private float taxas;

	public Importado(String nome, float preco, float taxas) {
		super(nome, preco);
		this.taxas = taxas;
	}

	public float getTaxas() {
		return taxas;
	}

	public void setTaxas(float taxas) {
		this.taxas = taxas;
	}
	
	public float total() {
		return getPreco() + taxas;
	}
	
	@Override
	public String etiqueta() {
		return getNome()
				+ " VALOR DO PRODUTO R$ "
				+ String.format("%.2f", getPreco())
				+ " PREÇO TOTAL R$ "
				+ String.format("%.2f", total());
	}
}
