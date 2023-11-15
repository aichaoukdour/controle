package com.example.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Article;
import com.example.entities.Categorie;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}