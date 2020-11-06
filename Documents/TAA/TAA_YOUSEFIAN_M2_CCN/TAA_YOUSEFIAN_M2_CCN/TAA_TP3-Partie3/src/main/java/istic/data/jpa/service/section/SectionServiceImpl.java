package istic.data.jpa.service.section;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import istic.data.jpa.domain.Section;

@Service("sectionservice")
public class SectionServiceImpl implements ISectionService{
	
	@Autowired
	private SectionDao sectionDao;
	
	@Override
	public List<Section> getAllSections() {
		return sectionDao.findAll();
	}

}
