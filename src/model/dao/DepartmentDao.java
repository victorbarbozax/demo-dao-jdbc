package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//operação por inserir no banco de dados este objeto que ao enviar como parametro de entrada
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer	 obj);
	//operação responsavel por pegar esse id e consultar no banco de dados o objeto com esse id se existir vai retornar
    Department findById(Integer id); 
    //retornar todos os departamentos
    List<Department> findall();
    
    
	
	
	
	
	
	
	 
}
