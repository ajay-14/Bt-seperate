package com.bugtracking.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracking.project.entities.Project;

@Repository("rs")
public interface IProjectRepository extends JpaRepository<Project, Long>{

}
