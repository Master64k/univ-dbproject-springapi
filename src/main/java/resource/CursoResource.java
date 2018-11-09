package br.com.faculdade.resorce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faculdade.model.Curso;
import br.com.faculdade.repositori.CursoRepositori;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

	@Autowired
	private CursoRepositori cursoRepositori;
	
	@GetMapping
	public ResponseEntity<?> listar() {
		
		List<Curso> cursos = cursoRepositori.findAll(); 
		
		return !cursos.isEmpty() 
				? ResponseEntity.ok(cursos) 
						: ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> porCodigo(@PathVariable Integer codigo) {
		
		Curso curso = cursoRepositori.findOne(codigo); 
		
		return (curso != null) 
				? ResponseEntity.ok(curso) 
						: ResponseEntity.notFound().build();
	}

}
