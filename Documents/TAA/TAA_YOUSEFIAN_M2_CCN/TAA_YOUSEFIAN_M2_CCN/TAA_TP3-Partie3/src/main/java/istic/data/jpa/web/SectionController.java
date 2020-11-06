package istic.data.jpa.web;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import istic.data.jpa.domain.Section;
import istic.data.jpa.service.section.SectionDTO;
import istic.data.jpa.service.section.SectionServiceImpl;

@RestController
@RequestMapping("/rest/section/api")
@Api(value = "Kanban Section Rest Controller")
public class SectionController {
	
	@Autowired
	private SectionServiceImpl sectionService;
	
	@GetMapping("/allSection")
	@ApiOperation(value="List all Kanban categories of the Tableau", response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Ok: successfully listed"),
			@ApiResponse(code = 204, message = "No Content: no result founded"),
	})
	public ResponseEntity<List<SectionDTO>> getAllKanbanSection(){
		List<Section> sections = sectionService.getAllSections();
		if(!CollectionUtils.isEmpty(sections)) {
			sections.removeAll(Collections.singleton(null));
			List<SectionDTO> sectionDTOs = sections.stream().map(section -> {
				return mapSectionToSectionDTO(section);
			}).collect(Collectors.toList());
			return new ResponseEntity<List<SectionDTO>>(sectionDTOs, HttpStatus.OK);
		}
		return new ResponseEntity<List<SectionDTO>>(HttpStatus.NO_CONTENT);
	}
	
	/**
	 * Transforme un Section en SectionDTO
	 * 
	 * @param section
	 * @return
	 */
	private SectionDTO mapSectionToSectionDTO(Section section) {
		ModelMapper mapper = new ModelMapper();
		SectionDTO sectionDTO = mapper.map(section, SectionDTO.class);
		return sectionDTO;
	}

}
