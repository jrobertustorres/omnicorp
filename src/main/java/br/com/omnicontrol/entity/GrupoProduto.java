package br.com.omnicontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="grupoproduto")
@Table(name="grupoproduto")
public class GrupoProduto {

	@GeneratedValue
	@Id
	@Column(name="IDGRUPOPRODUTO")
	private Long idGrupoProduto;
	@Column(name="DESCRICAO")
	private String descricao;

	public Long getIdGrupoProduto() {
		return idGrupoProduto;
	}

	public void setIdGrupoProduto(Long idGrupoProduto) {
		this.idGrupoProduto = idGrupoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
