package br.com.wpattern.frameworks.resteasy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.log4j.Logger;

import br.com.wpattern.frameworks.resteasy.utils.arquivo.ArquivoTxt;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestBeanCadastrarUsuario;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBeanCadastrarUsuario;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBeanLastListar;
import br.com.wpattern.frameworks.resteasy.utils.beans.responseBeanListaCompleta;
import br.com.wpattern.frameworks.resteasy.utils.interfaces.IMathRestService;



@Named
public class MathServices implements IMathRestService {

	ArquivoTxt txt = new ArquivoTxt();
	List<String> listas = new ArrayList<>();

	private Logger logger = Logger.getLogger(this.getClass());

	public MathServices() {
		this.logger.info("Math service started.");
	}



	@Override
	public ResponseBeanCadastrarUsuario  cadastrar(RequestBeanCadastrarUsuario requestBeanCadastrarUsuario) throws IOException {

		String nome = requestBeanCadastrarUsuario.getNome();
		txt.modoDeAbertura(nome);

		return new ResponseBeanCadastrarUsuario(nome);
	}



	@Override
	public ResponseBeanLastListar listar() throws IOException {

		return new ResponseBeanLastListar(txt.leituraArquivoTxt(listas));

	}


	@Override
	public responseBeanListaCompleta listaCompleta() throws IOException {

		return new responseBeanListaCompleta(txt.leituraArquivoTxt(listas));
	}

}
