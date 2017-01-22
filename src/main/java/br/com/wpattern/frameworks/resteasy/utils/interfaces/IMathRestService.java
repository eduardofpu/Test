package br.com.wpattern.frameworks.resteasy.utils.interfaces;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.wpattern.frameworks.resteasy.utils.ServiceName;
import br.com.wpattern.frameworks.resteasy.utils.beans.RequestBeanCadastrarUsuario;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBeanCadastrarUsuario;
import br.com.wpattern.frameworks.resteasy.utils.beans.ResponseBeanLastListar;
import br.com.wpattern.frameworks.resteasy.utils.beans.responseBeanListaCompleta;


@Path(ServiceName.MATH_SERVICE)
@Produces(MediaType.APPLICATION_JSON)//Content-Type:application/json
@Consumes(MediaType.APPLICATION_JSON)//Content-Type:application/json
public interface IMathRestService {

	@POST
	@Path("/cadastrar")
	public ResponseBeanCadastrarUsuario cadastrar(RequestBeanCadastrarUsuario requestBeanCadastrarUsuario) throws IOException;

	@POST
	@Path("/listar")
	public ResponseBeanLastListar listar() throws IOException;


	@POST
	@Path("/listacompleta")
	public responseBeanListaCompleta listaCompleta() throws IOException;





}
