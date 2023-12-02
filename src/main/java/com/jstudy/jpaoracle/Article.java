package com.jstudy.jpaoracle;

import jakarta.persistence.*;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "article_seqgenerator")
    @SequenceGenerator(name="article_seq_generator",sequenceName = "ARTICLE_SEQUENCE", allocationSize = 1)
    private Long id;

}
