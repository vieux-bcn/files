package com.example.JPASpringBootH2mm;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,String> {

    
}

