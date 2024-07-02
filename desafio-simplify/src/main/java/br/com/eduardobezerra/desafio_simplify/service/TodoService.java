package br.com.eduardobezerra.desafio_simplify.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.eduardobezerra.desafio_simplify.entity.Todo;
import br.com.eduardobezerra.desafio_simplify.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by(Sort.Order.desc("prioridade")).and(Sort.by(Sort.Order.asc("nome")));
        return todoRepository.findAll(sort);
    } 

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    } 

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    } 
}
