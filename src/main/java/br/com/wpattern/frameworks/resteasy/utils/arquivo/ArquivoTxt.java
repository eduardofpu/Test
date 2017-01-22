package br.com.wpattern.frameworks.resteasy.utils.arquivo;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTxt {

	Path Txt= Paths.get("D:/nomes.txt");

	public void modoDeAbertura(String nome) throws IOException{

		String conteudo = "";
		OpenOption modoAbertura = Files.exists(Txt)? APPEND : CREATE;
		Files.write(Txt,conteudo.getBytes(),modoAbertura);

		List<String> Lista = new ArrayList<>();
		Lista.add(nome);
		Files.write(Txt, Lista, Charset.defaultCharset(), StandardOpenOption.APPEND);
	}

	public List<String> leituraArquivoTxt(List<String> Lines) throws IOException{

		Lines = Files.readAllLines(Txt, Charset.defaultCharset());
		List<String> listas = new ArrayList<>();
		for (String l: Lines) {
			System.out.println(l);
			listas.add(l);
		}
		return Lines;
	}

}
