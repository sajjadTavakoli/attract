package ir.stdev.attact.project.persistence.mapper;

import ir.stdev.attact.project.persistence.entity.ProjectEntity;
import ir.stdev.attact.project.service.dto.ProjectDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectPersistenceMapper {
    ProjectEntity toEntity (ProjectDTO projectDTO);
    ProjectDTO toDTO(ProjectEntity projectEntity);
}
