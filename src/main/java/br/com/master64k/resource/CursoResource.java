package br.com.master64k.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.master64k.model.Curso;
import br.com.master64k.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public ResponseEntity<?> listar() {
		
		List<Curso> cursos = cursoRepository.findAll(); 
		
		return !cursos.isEmpty() 
				? ResponseEntity.ok(cursos) 
						: ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<?> porCodigo(@PathVariable Integer codigo) {
		
		Curso curso = cursoRepository.findOne(codigo); 
		
		return (curso != null) 
				? ResponseEntity.ok(curso) 
						: ResponseEntity.notFound().build();
	}

}
