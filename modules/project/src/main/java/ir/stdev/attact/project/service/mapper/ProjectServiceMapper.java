package ir.stdev.attact.project.service.mapper;

import ir.stdev.attact.project.api.dto.CreateProjectRequest;
import ir.stdev.attact.project.api.dto.CreateProjectResponse;
import ir.stdev.attact.project.service.dto.ProjectDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectServiceMapper {
    ProjectDTO requestToDTO(CreateProjectRequest request);
    CreateProjectResponse dtoToResponse(ProjectDTO dto);
}
