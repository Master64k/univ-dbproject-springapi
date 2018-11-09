package br.com.master64k.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.master64k.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
