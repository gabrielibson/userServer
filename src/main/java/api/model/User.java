package api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="nome", nullable=false)
	private String name;
	
	@Column(name="dataNascimento", nullable=false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	
	@Column(name="sexo", nullable=false)
	private String gender;

	@Column(name="emailPrincipal", nullable=false)
	private String emailPrincipal;

	@Column(name="emailSecundario", nullable=false)
	private String emailSecundario;
	
	@Column(name="telefone", nullable=false)
	private String telefone;
	
	@Column(name="funcao", nullable=false)
	private String funcao;

	@Column(name="cargo", nullable=false)
	private String cargo;

	@Column(name="lotacao", nullable=false)
	private String lotacao;

	@Column(name="endereco", nullable=false)
	private String endereco;

	@Column(name="afiliado", nullable=false)
	private boolean afiliado;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public String getEmailPrincipal() {
		return emailPrincipal;
	}

	public void setEmailPrincipal(String emailPrincipal) {
		this.emailPrincipal = emailPrincipal;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmailSecundario() {
		return emailSecundario;
	}

	public void setEmailSecundario(String emailSecundario) {
		this.emailSecundario = emailSecundario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public boolean isAfiliado() {
		return afiliado;
	}

	public void setAfiliado(boolean afiliado) {
		this.afiliado = afiliado;
	}
	

}
