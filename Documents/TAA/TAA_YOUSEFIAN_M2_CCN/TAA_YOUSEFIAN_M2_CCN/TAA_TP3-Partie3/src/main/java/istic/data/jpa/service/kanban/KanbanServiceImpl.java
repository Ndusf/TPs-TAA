package istic.data.jpa.service.kanban;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import istic.data.jpa.domain.Kanban;

@Service("KanbanService")
@Transactional
public class KanbanServiceImpl implements IkanbanService{

	@Autowired
	private KanbanDao kanbanDao;
	
	@Override
	public List<Kanban> findAllByName(String nom) {
		return kanbanDao.findAllByName(nom);
	}

	@Override
	public void deleteByNom(String nom) {
		kanbanDao.deleteByNom(nom);
		
	}

	public Kanban save(Kanban kanbanRequest) {
		return kanbanDao.save(kanbanRequest);
	}

	public boolean checkIfIdExists(long id) {
		return kanbanDao.existsById(id);
	}

	public Kanban updatekanban(Kanban kanban) {
		return kanbanDao.save(kanban);
	}

}
