package br.com.wpattern.frameworks.resteasy.utils.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseBeanCadastrarUsuario extends BaseBean{


	private static final long serialVersionUID = 1L;

	private String usuarios;

	public ResponseBeanCadastrarUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseBeanCadastrarUsuario(String usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public String getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}



}
