package aprendices.service;

import aprendices.model.Materia;
import aprendices.repository.AprendizRepository;
import aprendices.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MateriaServicio implements IMateriaServicio{
    @Autowired
    MateriaRepository materiaRepository;

    @Override
    public List<Materia> findMaterias() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia findMateria(Integer id) {
        return materiaRepository.findById(id).orElse(null);
    }

    @Override
    public void saveMateria(Materia materia) {

    }

    @Override
    public void deleteMateria(Integer id) {

    }
}
