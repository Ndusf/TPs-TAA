package istic.data.jpa.web;


import java.awt.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import istic.data.jpa.domain.Kanban;
import istic.data.jpa.service.kanban.KanbanDTO;
import istic.data.jpa.service.kanban.KanbanDao;
import istic.data.jpa.service.kanban.KanbanServiceImpl;
import istic.data.jpa.service.section.SectionDTO;


@RestController
public class KanbanController {
	
public static final Logger LOGGER = LoggerFactory.getLogger(KanbanController.class);

@Autowired
private KanbanServiceImpl kanbanService;

@Autowired
private KanbanDao kanbandao;

@GetMapping("/kanban/{id}")
@ApiOperation(value = "Add a new Kanban in the Tableau", response = KanbanDTO.class)
@ApiResponses(value = { @ApiResponse(code = 409, message = "Conflict: the kanban already exist"),
		@ApiResponse(code = 201, message = "Created: the kanban is successfully inserted"),
		@ApiResponse(code = 304, message = "Not Modified: the kanban is unsuccessfully inserted") })
public KanbanDTO getKanbanById(@PathVariable("id") Long kanbanId)  {
    return kanbandao.findById(kanbanId).isPresent() ? mapKanbanToKanbanDTO(kanbandao.findById(kanbanId).get()) : null;
}

@PostMapping("/addKanban")
@ApiOperation(value = "Add a new Kanban in the Tableau", response = KanbanDTO.class)
@ApiResponses(value = { @ApiResponse(code = 409, message = "Conflict: the kanban already exist"),
		@ApiResponse(code = 201, message = "Created: the kanban is successfully inserted"),
		@ApiResponse(code = 304, message = "Not Modified: the kanban is unsuccessfully inserted") })
public ResponseEntity<KanbanDTO> createNewKanban(@RequestBody KanbanDTO kanbanDTORequest) {
/*	List<Kanban> existingKanban = kanbanService.findAllByName(kanbanDTORequest.getNom());
	if (existingKanban != null ) {
		return new ResponseEntity<KanbanDTO>(HttpStatus.CONFLICT);
	}*/
	Kanban kanbanRequest = mapKanbanDTOKanban(kanbanDTORequest);
	Kanban kanban = kanbanService.save(kanbanRequest);
	if (kanban != null) {
		KanbanDTO kanbanDTO = mapKanbanToKanbanDTO(kanban);
		return new ResponseEntity<KanbanDTO>(kanbanDTO, HttpStatus.CREATED);
	}
	return new ResponseEntity<KanbanDTO>(HttpStatus.NOT_MODIFIED);

}

private KanbanDTO mapKanbanToKanbanDTO(Kanban kanban) {
	  ModelMapper mapper = new ModelMapper();
		KanbanDTO kanbanDTO = mapper.map(kanban, KanbanDTO.class);
		if (kanban.getSections() != null) {
			SectionDTO section = new SectionDTO();
			kanbanDTO.setSection(section);
		}
		return kanbanDTO;
}
private Kanban mapKanbanDTOKanban(KanbanDTO kanbanDTO) {
	ModelMapper mapper = new ModelMapper();
	//SectionDTO section = new SectionDTO();
	Kanban kanban = mapper.map(kanbanDTO, Kanban.class);
	return kanban;
}


@PutMapping("/updateKanban")
@ApiOperation(value = "Update/Modify an existing Kanban in the Tableau", response = KanbanDTO.class)
@ApiResponses(value = { @ApiResponse(code = 404, message = "Not Found : the name does not exist"),
		@ApiResponse(code = 200, message = "Ok: the kanban is successfully updated"),
		@ApiResponse(code = 304, message = "Not Modified: the kanban is unsuccessfully updated") })
public ResponseEntity<KanbanDTO> updateKanban(@RequestBody KanbanDTO kanbanDTORequest) {
	if (!kanbanService.checkIfIdExists(kanbanDTORequest.getId())) {
		return new ResponseEntity<KanbanDTO>(HttpStatus.NOT_FOUND);
	}
	Kanban kanbanRequest = mapKanbanDTOKanban(kanbanDTORequest);
	Kanban kanban = kanbanService.updatekanban(kanbanRequest);
	if (kanban != null) {
		KanbanDTO kanbanDTO = mapKanbanToKanbanDTO(kanban);
		return new ResponseEntity<KanbanDTO>(kanbanDTO, HttpStatus.OK);
	}
	return new ResponseEntity<KanbanDTO>(HttpStatus.NOT_MODIFIED);
}

@DeleteMapping("/deletekanban/{kanbanNom}")
@ApiOperation(value = "Delete a kanban in the Tableau, if the kanabn does not exist, nothing is done", response = String.class)
@ApiResponse(code = 204, message = "No Content: Kanban sucessfully deleted")
public ResponseEntity<String> deleteKanban(@PathVariable String nom) {
	kanbanService.deleteByNom(nom);
	return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
}


}