package br.com.eduardobezerra.desafio_simplify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eduardobezerra.desafio_simplify.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
