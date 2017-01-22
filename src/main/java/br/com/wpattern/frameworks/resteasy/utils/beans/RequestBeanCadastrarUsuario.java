package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestBeanCadastrarUsuario extends BaseBean{

	private static final long serialVersionUID = 1L;


	private String nome;


	public RequestBeanCadastrarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RequestBeanCadastrarUsuario(String nome) {
		super();
		this.nome = nome;

	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


}
