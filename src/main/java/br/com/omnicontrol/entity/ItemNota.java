package br.com.omnicontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="itemnota")
@Table(name="itemnota")
public class ItemNota {
	
	@GeneratedValue
	@Id
	@Column(name="IDITEMNOTA")
	private Long idItemNota;
	@Column(name="QUANTIDADE", nullable = false)
	private int quantidade;	
	@Column(name="VALORUNITARIO", nullable = false)
	private double valorUnitario;
	@Column(name="VALORTOTAL", nullable = true)
	private double valorTotal;

	@JoinColumn(name="IDPRODUTO", referencedColumnName="IDPRODUTO", nullable = false)
    @ManyToOne
    private Produto produto;

	@JoinColumn(name="IDCABECALHONOTA", referencedColumnName="IDCABECALHONOTA", nullable = false)
    @ManyToOne
    private CabecalhoNota cabecalhoNota;

	public ItemNota() {
	}

	public Long getIdItemNota() {
		return idItemNota;
	}

	public void setIdItemNota(Long idItemNota) {
		this.idItemNota = idItemNota;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public CabecalhoNota getCabecalhoNota() {
		return cabecalhoNota;
	}

	public void setCabecalhoNota(CabecalhoNota cabecalhoNota) {
		this.cabecalhoNota = cabecalhoNota;
	}
}
