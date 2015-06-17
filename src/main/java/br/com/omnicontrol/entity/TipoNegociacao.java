package br.com.omnicontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="tiponegociacao")
@Table(name="tiponegociacao")
public class TipoNegociacao {
	
	@GeneratedValue
	@Id
	@Column(name="IDGRUPOPRODUTO")
	private Long idTipoNegociacao;
	@Column(name="DESCRICAO")
	private String descricao;

	public Long getIdTipoNegociacao() {
		return idTipoNegociacao;
	}

	public void setIdTipoNegociacao(Long idTipoNegociacao) {
		this.idTipoNegociacao = idTipoNegociacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
