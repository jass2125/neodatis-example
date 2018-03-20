/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since Mar 19, 2018 4:25:26 PM
 */
public class ClassRoom implements Serializable {

    private Professor professor;
    private List<Student> listStudents;
    private String disciplina;

    public ClassRoom(Professor professor, String discipline) {
        this.professor = professor;
        this.disciplina = discipline;
        this.listStudents = new ArrayList<>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void addStudent(Student student) {
        this.listStudents.add(student);
    }

    public void removeStudent(Student student) {
        this.listStudents.remove(student);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.professor);
        hash = 97 * hash + Objects.hashCode(this.disciplina);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClassRoom other = (ClassRoom) obj;
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        return Objects.equals(this.professor, other.professor);
    }

    @Override
    public String toString() {
        return "Turma{" + "professor=" + professor + ", listStudents=" + listStudents + ", disciplina=" + disciplina + '}';
    }

}