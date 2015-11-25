package br.com.omnicontrol.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="funcionario")
@Table(name="funcionario")
public class Funcionario {
	
	@GeneratedValue
	@Id
	@Column(name="IDFUNCIONARIO")
	private Long idFuncionario;
	@Column(name="NOME", nullable = false)
	private String nome;
	@Column(name="CPF", nullable = false)
	private String cpf;
	@Column(name="RG")
	private String rg;
	@Column(name="EMAIL", nullable = false)
	private String email;
	@Column(name="TELEFONE", nullable = false)
	private String telefone;

	@Column(name="SENHA", nullable = false)
	private String senha;
	@Column(name="BAIXAREQUISICAO")
	private boolean baixaRequisicao;

	@Temporal(TemporalType.DATE)
	@Column(name="DATACADASTRO")
	private Date dataCadastro;
	
	@JoinColumn(name="IDEMPRESA", referencedColumnName="IDEMPRESA", nullable = false) 
    @ManyToOne
    private Empresa empresa;
	
	@JoinColumn(name="IDCARGO", referencedColumnName="IDCARGO", nullable = false)
    @ManyToOne
    private Cargo cargo;
	
	@JoinColumn(name="IDCENTROCUSTO", referencedColumnName="IDCENTROCUSTO", nullable = false)
	@ManyToOne
	private CentroCusto centroCusto;

	public Funcionario() {
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isBaixaRequisicao() {
		return baixaRequisicao;
	}

	public void setBaixaRequisicao(boolean baixaRequisicao) {
		this.baixaRequisicao = baixaRequisicao;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public CentroCusto getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(CentroCusto centroCusto) {
		this.centroCusto = centroCusto;
	}
}
