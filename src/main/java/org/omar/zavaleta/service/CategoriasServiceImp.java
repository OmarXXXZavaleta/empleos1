package org.omar.zavaleta.service;

import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;

import org.omar.zavaleta.model.Categoria;
import org.omar.zavaleta.model.Vacante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoriasServiceImp implements IntCategoriasService{
	private List<Categoria> lista= null;
	
	public CategoriasServiceImp(){
		lista = new LinkedList<Categoria>();
		try {
			
			Categoria c1 = new Categoria();
			c1.setId(1);
			c1.setNombre("Ventas");
			c1.setDescripcion("Relacionado con ventas");
			lista.add(c1);
			
			
			Categoria c2 = new Categoria();
			c2.setId(2);
			c2.setNombre("Contabilidad");
			c2.setDescripcion("Relacionado con numeros");
			lista.add(c2);
			
			Categoria c3 = new Categoria();
			c3.setId(3);
			c3.setNombre("Transporte");
			c3.setDescripcion("Relacionado con transporte publico");
			lista.add(c3);
			
			Categoria c4 = new Categoria();
			c4.setId(4);
			c4.setNombre("Informatica");
			c4.setDescripcion("Relacionado con computadoras");
			lista.add(c4);
			
			Categoria c5 = new Categoria();
			c5.setId(5);
			c5.setNombre("Construccion");
			c5.setDescripcion("Relacionado con construcciones");
			lista.add(c5);
			
			
		}catch(DateTimeParseException ex){
			System.out.println("Error: "+ex.getMessage());
		}
		
	}

	@Override
	public List<Categoria> obtenerTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
		for(Categoria categoria:lista) {
			if( categoria.getId()==idCategoria) {
				return categoria;
			}
		}
		return null;
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		lista.add(categoria);
		
	}

	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}


