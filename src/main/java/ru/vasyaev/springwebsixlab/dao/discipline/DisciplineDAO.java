package ru.vasyaev.springwebsixlab.dao.discipline;

import ru.vasyaev.springwebsixlab.entity.Discipline;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplineDAO {
List<Discipline> getAllDiscipline();
Discipline saveDiscipline(Discipline discipline);
Discipline putDiscipline(Discipline discipline,int id);
Discipline getDiscipline(int id);
void deleteDiscipline(int id);

}
