package istic.data.jpa.service.section;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import istic.data.jpa.domain.Section;

@Transactional
public interface SectionDao extends JpaRepository<Section,Long> {

}
