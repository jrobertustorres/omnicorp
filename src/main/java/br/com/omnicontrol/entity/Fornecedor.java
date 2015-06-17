package br.com.omnicontrol.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="fornecedor")
@Table(name="fornecedor")
public class Fornecedor {

	@GeneratedValue
	@Id
	@Column(name="IDFORNECEDOR")
	private Long idFornecedor;
	@Column(name="NOME")
	private String nome;
	@Column(name="CNPJ")
	private String cnpj;
	@Column(name="TELEFONE")
	private String telefone;
	@Column(name="ENDERECO")
	private String endereco;
	@Column(name="BAIRRO")
	private String bairro;
	@Column(name="CIDADE")
	private String cidade;
	@Temporal(TemporalType.DATE)
	@Column(name="DATACADASTRO")
	private Date dataCadastro;
	public Long getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
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
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
}
