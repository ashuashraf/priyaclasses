package com.org.employeeapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.org.employeeapi.model.Language;

public interface LanguageRepository extends CrudRepository<Language, String>{

	 public List<Language>  findByEmployeeId(String employeeId);

}
