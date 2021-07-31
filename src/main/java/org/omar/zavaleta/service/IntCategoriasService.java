package org.omar.zavaleta.service;

import java.util.List;

import org.omar.zavaleta.model.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IntCategoriasService {
	public List<Categoria> obtenerTodas();
	public Categoria buscarPorId(Integer idCategoria);
	public void guardar(Categoria categoria);
	public void eliminar(Integer idCategoria);
	public Page <Categoria>buscarTodas(Pageable page);

}
