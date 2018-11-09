package br.com.faculdade.repositori;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.faculdade.model.Curso;

public interface CursoRepositori extends JpaRepository<Curso, Integer>{

}
