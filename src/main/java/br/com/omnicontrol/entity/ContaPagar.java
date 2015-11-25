package br.com.omnicontrol.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue ;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="contapagar")
@Table(name="contapagar")
public class ContaPagar {
	
	@GeneratedValue
	@Id
	@Column(name="IDCONTAPAGAR")
	private Long idContaPagar;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATAVENCIMENTO")
	private Date dataVencimento;

	@Column(name="TIPOCONTA")
	private String tipoConta;
	
	@Column(name = "VALORPARCELA", nullable = true)
	private double valorParcela;
	
	@Column(name="REPETIRPARA", nullable = true)// quantidade de meses a repetir(contas fixas) 
	private String repetirPara;
	
	@JoinColumn(name="IDCENTROCUSTO", referencedColumnName="IDCENTROCUSTO", nullable = false) // lembrar de mudar para true
    @ManyToOne
    private CentroCusto centroCusto;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdContaPagar() {
		return idContaPagar;
	}

	public void setIdContaPagar(Long idContaPagar) {
		this.idContaPagar = idContaPagar;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String getRepetirPara() {
		return repetirPara;
	}

	public void setRepetirPara(String repetirPara) {
		this.repetirPara = repetirPara;
	}

	public CentroCusto getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(CentroCusto centroCusto) {
		this.centroCusto = centroCusto;
	}

}
