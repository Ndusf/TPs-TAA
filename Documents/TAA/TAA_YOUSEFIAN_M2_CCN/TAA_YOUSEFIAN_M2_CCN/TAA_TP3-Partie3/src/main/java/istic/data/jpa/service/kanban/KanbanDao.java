package istic.data.jpa.service.kanban;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import istic.data.jpa.domain.Kanban;

@Repository
public interface KanbanDao extends JpaRepository<Kanban, Long>{

   @Query("select n from Kanban as n where n.nom = :nom")
   public List<Kanban> findAllByName(@Param("nom") String nom);
   
	public void deleteByNom(String nom);
}