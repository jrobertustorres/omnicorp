package br.com.omnicontrol.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "empresa")
@Table(name = "empresa")
public class Empresa {

	@GeneratedValue
	@Id
	@Column(name = "IDEMPRESA")
	private Long idEmpresa;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "CNPJ")
	private String cnpj;
	@Column(name = "TELEFONE")
	private String telefone;
	@Column(name = "ENDERECO")
	private String endereco;
	@Column(name = "NUMERO")
	private String numero;
	@Column(name = "BAIRRO")
	private String bairro;
	@Column(name = "CIDADE")
	private String cidade;

	public Empresa() {

	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
