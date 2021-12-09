package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

        @Bean
        public Board createBoard() {
            return new Board(createTaskList(), createTaskList(), createTaskList());
        }

        @Bean
        @Scope("prototype")
        public TaskList createTaskList() {
            return new TaskList(new ArrayList<>());
        }
    }

