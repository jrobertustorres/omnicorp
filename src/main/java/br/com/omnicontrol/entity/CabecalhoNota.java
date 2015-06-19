package br.com.omnicontrol.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "cabecalhonota")
@Table(name = "cabecalhonota")
public class CabecalhoNota {

	@GeneratedValue
	@Id
	@Column(name = "IDCABECALHONOTA")
	private Long idCabecalhoNota;
	@Column(name = "STATUS", nullable = true)
	private String status;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "DATAMOVIMENTACAO")
	private Date dataMovimentacao;

	@JoinColumn(name = "IDTIPOOPERACAO", referencedColumnName = "IDTIPOOPERACAO", nullable = false)
	@ManyToOne
	private TipoOperacao tipoOperacao;

	@JoinColumn(name = "IDCENTROCUSTO", referencedColumnName = "IDCENTROCUSTO", nullable = false)
	@ManyToOne
	private CentroCusto centroCusto;

	@JoinColumn(name = "IDTIPONEGOCIACAO", referencedColumnName = "IDTIPONEGOCIACAO", nullable = true)
	@ManyToOne
	private TipoNegociacao tipoNegociacao;

	@JoinColumn(name = "IDFORNECEDOR", referencedColumnName = "IDFORNECEDOR", nullable = true)
	@ManyToOne
	private Fornecedor fornecedor;

	@JsonManagedReference 
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDCABECALHONOTA")
	private Set<ItemNota> itemNotas;

	public CabecalhoNota() {
	}

	public Long getIdCabecalhoNota() {
		return idCabecalhoNota;
	}

	public void setIdCabecalhoNota(Long idCabecalhoNota) {
		this.idCabecalhoNota = idCabecalhoNota;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public CentroCusto getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(CentroCusto centroCusto) {
		this.centroCusto = centroCusto;
	}

	public TipoNegociacao getTipoNegociacao() {
		return tipoNegociacao;
	}

	public void setTipoNegociacao(TipoNegociacao tipoNegociacao) {
		this.tipoNegociacao = tipoNegociacao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Set<ItemNota> getItemNotas() {
		return itemNotas;
	}

	public void setItemNotas(Set<ItemNota> itemNotas) {
		this.itemNotas = itemNotas;
	}

}
