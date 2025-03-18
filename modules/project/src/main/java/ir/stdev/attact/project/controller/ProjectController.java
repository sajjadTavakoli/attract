package ir.stdev.attact.project.controller;

import ir.stdev.attact.project.api.dto.CreateProjectRequest;
import ir.stdev.attact.project.api.dto.CreateProjectResponse;
import ir.stdev.attact.project.api.facade.ProjectFacade;
import ir.stdev.attact.project.service.api.ProjectServiceApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = ProjectFacade.PATH)
public class ProjectController implements ProjectFacade {

    private final ProjectServiceApi projectServiceApi;

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        //TODO check request Validation
        return projectServiceApi.createProject(request);
    }
}
