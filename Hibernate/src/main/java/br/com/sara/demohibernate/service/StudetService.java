package br.com.sara.demohibernate.service;

import br.com.sara.demohibernate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudetService {

    @Autowired
    private StudentRepository studentRepository;


}
