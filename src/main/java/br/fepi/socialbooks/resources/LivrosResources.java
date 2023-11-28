package br.fepi.socialbooks.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.socialbooks.model.Livro;

@RestController
public class LivrosResources {

	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		Livro l1 = new Livro("A arte da guerra");
		l1.setAutor("Sun Tzu");

		Livro l2 = new Livro("Mini hábitos");

		Livro[] livros = { l1, l2 };
		return Arrays.asList(livros);
	}

}
