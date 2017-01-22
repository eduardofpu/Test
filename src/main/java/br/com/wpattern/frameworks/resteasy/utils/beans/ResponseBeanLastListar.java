package br.com.wpattern.frameworks.resteasy.utils.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseBeanLastListar  extends BaseBean{


	private static final long serialVersionUID = 1L;

	private String nomes;

	public ResponseBeanLastListar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseBeanLastListar(List<String> nomes) {
		super();
		for( String l : nomes){

			this.nomes = l.concat(" :  Last name registered successfully!");

			System.out.println(l);

		}


	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}





}
