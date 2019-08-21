package com.tom.ppm.services;

import com.tom.ppm.domain.Project;
import com.tom.ppm.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;


    public Project saveOrUpdateProject(Project project){

        return projectRepo.save(project);
    }
}
