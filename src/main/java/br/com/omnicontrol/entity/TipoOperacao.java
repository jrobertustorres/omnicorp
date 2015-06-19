package br.com.omnicontrol.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="tipooperacao")
@Table(name="tipooperacao")
public class TipoOperacao {
	
	@GeneratedValue
	@Id
	@Column(name="IDTIPOOPERACAO")
	private Long idTipoOperacao;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="TIPOMOVIMENTO")
	private String tipoMovimento;
	@Column(name="ATUALIZACAOESTOQUE")
	private String atualizacaoEstoque;
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="DATAALTERACAO")
	private Date dataAlteracao;
	@Temporal(TemporalType.DATE)
	@Column(name="DATACADASTRO")
	private Date dataCadastro;
	public Long getIdTipoOperacao() {
		return idTipoOperacao;
	}
	public void setIdTipoOperacao(Long idTipoOperacao) {
		this.idTipoOperacao = idTipoOperacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipoMovimento() {
		return tipoMovimento;
	}
	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}
	public String getAtualizacaoEstoque() {
		return atualizacaoEstoque;
	}
	public void setAtualizacaoEstoque(String atualizacaoEstoque) {
		this.atualizacaoEstoque = atualizacaoEstoque;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
