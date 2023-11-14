package ru.vasyaev.springwebsixlab.service.discipline;

import ru.vasyaev.springwebsixlab.entity.Discipline;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisciplineService {
    List<Discipline> getAllDiscipline();
    Discipline getDiscipline(int id);
    Discipline putDiscipline(Discipline discipline,int id);
    Discipline saveDiscipline(Discipline discipline);
    void deleteDiscipline(int id);
}
