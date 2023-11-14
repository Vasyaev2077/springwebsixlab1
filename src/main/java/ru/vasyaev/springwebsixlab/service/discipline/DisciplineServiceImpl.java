package ru.vasyaev.springwebsixlab.service.discipline;

import ru.vasyaev.springwebsixlab.dao.discipline.DisciplineDAO;
import ru.vasyaev.springwebsixlab.entity.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DisciplineServiceImpl implements DisciplineService {
    private final DisciplineDAO disciplineDAO;
    @Autowired
    public DisciplineServiceImpl(DisciplineDAO disciplineDAO) {
        this.disciplineDAO = disciplineDAO;
    }

    @Override
    public List<Discipline> getAllDiscipline() {
        return disciplineDAO.getAllDiscipline();
    }

    @Override
    public Discipline getDiscipline(int id) {
        return disciplineDAO.getDiscipline(id);
    }

    @Override
    public Discipline putDiscipline(Discipline discipline,int id) {
        return disciplineDAO.putDiscipline(discipline,id);
    }

    @Override
    public Discipline saveDiscipline(Discipline discipline) {
        return disciplineDAO.saveDiscipline(discipline);
    }


    @Override
    public void deleteDiscipline(int id) {
        disciplineDAO.deleteDiscipline(id);
    }
}
