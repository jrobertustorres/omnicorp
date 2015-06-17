package br.com.omnicontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="centrocusto")
@Table(name="centrocusto")
public class CentroCusto {
	
	@GeneratedValue
	@Id
	@Column(name="IDCENTROCUSTO")
	private Long idCentroCusto;
	@Column(name="DESCRICAO")
	private String descricao;

	public Long getIdCentroCusto() {
		return idCentroCusto;
	}

	public void setIdCentroCusto(Long idCentroCusto) {
		this.idCentroCusto = idCentroCusto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
