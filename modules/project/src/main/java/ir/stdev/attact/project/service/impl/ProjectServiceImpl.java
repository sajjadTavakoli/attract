package ir.stdev.attact.project.service.impl;

import ir.stdev.attact.project.api.dto.CreateProjectRequest;
import ir.stdev.attact.project.api.dto.CreateProjectResponse;
import ir.stdev.attact.project.persistence.entity.ProjectEntity;
import ir.stdev.attact.project.persistence.mapper.ProjectPersistenceMapper;
import ir.stdev.attact.project.persistence.repository.ProjectRepository;
import ir.stdev.attact.project.service.api.ProjectServiceApi;
import ir.stdev.attact.project.service.mapper.ProjectServiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectServiceApi {

    private final ProjectServiceMapper serviceMapper;
    private final ProjectPersistenceMapper persistenceMapper;
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectServiceMapper serviceMapper, ProjectPersistenceMapper persistenceMapper , ProjectRepository projectRepository) {
        this.serviceMapper = serviceMapper;
        this.persistenceMapper = persistenceMapper;
        this.projectRepository = projectRepository;
    }

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        ProjectEntity projectEntity = projectRepository.save(persistenceMapper.toEntity(serviceMapper.requestToDTO(request)));
        return serviceMapper.dtoToResponse(persistenceMapper.toDTO(projectEntity));
    }
}
