package br.com.omnicontrol.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue ;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="cargo")
@Table(name="cargo")
public class Cargo {
	
	@GeneratedValue //gerar o id de forma incremental
	@Id // diz que o campo abaixo eh um id
	@Column(name="IDCARGO")
	private Long idCargo;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATACADASTRO")
	private Date dataCadastro;
	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
