package com.tom.ppm.services;

import com.tom.ppm.domain.Project;
import com.tom.ppm.exceptions.ProjectIdException;
import com.tom.ppm.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public Project saveOrUpdateProject(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepo.save(project);
        }catch (Exception ex){
            throw new ProjectIdException("Project Id'"+project.getProjectIdentifier().toUpperCase()+"' already exists");
        }
    }
}
