package com.gql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gql.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
