package istic.data.jpa.service.kanban;

import java.util.List;

import istic.data.jpa.domain.Kanban;

public interface IkanbanService {
	
	public List<Kanban> findAllByName(String nom);
    public void deleteByNom(String nom);
	
}
