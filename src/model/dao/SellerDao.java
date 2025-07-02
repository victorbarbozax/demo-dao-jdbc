package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	    //operação por inserir no banco de dados este objeto que ao enviar como parametro de entrada
		void insert(Seller obj);
		void update(Seller obj);
		void deleteById(Integer	 obj);
		//operação responsavel por pegar esse id e consultar no banco de dados o objeto com esse id se existir vai retornar
	    Seller findById(Integer id); 
	    //retornar todos os departamentos
	    List<Seller> findByDepartment(Department department);
		List<Seller> findall();
	    
	    
}
