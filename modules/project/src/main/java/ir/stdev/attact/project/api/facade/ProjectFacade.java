package ir.stdev.attact.project.api.facade;

import ir.stdev.attact.project.api.dto.CreateProjectRequest;
import ir.stdev.attact.project.api.dto.CreateProjectResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

public interface ProjectFacade {
    String PATH = "/project";

    @PostMapping(value = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
    CreateProjectResponse createProject(CreateProjectRequest request);
}
