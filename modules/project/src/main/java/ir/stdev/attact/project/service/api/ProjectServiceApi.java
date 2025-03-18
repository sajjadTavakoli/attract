package ir.stdev.attact.project.service.api;

import ir.stdev.attact.project.api.dto.CreateProjectRequest;
import ir.stdev.attact.project.api.dto.CreateProjectResponse;

public interface ProjectServiceApi {

    CreateProjectResponse createProject(CreateProjectRequest request);

}
