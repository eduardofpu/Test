package br.com.wpattern.frameworks.resteasy.utils.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class responseBeanListaCompleta extends BaseBean{


	private static final long serialVersionUID = 1L;

	private String listfull ;

	public responseBeanListaCompleta() {
		super();

		// TODO Auto-generated constructor stub
	}

	public responseBeanListaCompleta(List<String> listfull) {
		super();
		this.listfull = listfull.toString();

	}

	public String getListfull() {
		return listfull;
	}

	public void setListfull(String listfull) {
		this.listfull = listfull;
	}




}
