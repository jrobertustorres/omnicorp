package br.com.omnicontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="produto")
@Table(name="produto")
public class Produto {
	
	@GeneratedValue
	@Id
	@Column(name="IDPRODUTO")
	private Long idProduto;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="ESTOQUE")
	private int estoque;
	@Column(name="ESTOQUEMINIMO")
	private int estoqueMinimo;
	@Column(name="ESTOQUEMAXIMO")
	private int estoqueMaximo;
	@Column(name="CUSTOMEDIO")
	private double custoMedio; //mais precisao, mais casas decimais
	@Column(name="ESTOQUERESERVADO")
	private int estoqueReservado;
	@Column(name="UNIDADE")
	private String unidade;
	
	@JoinColumn(name="IDGRUPOPRODUTO", referencedColumnName="IDGRUPOPRODUTO", nullable = false) // lembrar de mudar para true
    @ManyToOne
    private GrupoProduto grupoProduto;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public double getCustoMedio() {
		return custoMedio;
	}

	public void setCustoMedio(double custoMedio) {
		this.custoMedio = custoMedio;
	}

	public int getEstoqueReservado() {
		return estoqueReservado;
	}

	public void setEstoqueReservado(int estoqueReservado) {
		this.estoqueReservado = estoqueReservado;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public GrupoProduto getGrupoProduto() {
		return grupoProduto;
	}

	public void setGrupoProduto(GrupoProduto grupoProduto) {
		this.grupoProduto = grupoProduto;
	}
}
