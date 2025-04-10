package aprendices.service;

import aprendices.model.Aprendiz;
import aprendices.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AprendizServicio implements IAprendizServicio{

    @Autowired
    AprendizRepository aprendizRepository;

    @Override
    public List<Aprendiz> findApredices() {
        return aprendizRepository.findAll();
    }

    @Override
    public Aprendiz findAprendiz(Integer id) {
        return aprendizRepository.findById(id).orElse(null);
    }

    @Override
    public void saveAprendiz(Aprendiz aprendiz) {
        aprendizRepository.save(aprendiz);
    }

    @Override
    public void deleteAprendiz(Integer id) {
        aprendizRepository.deleteById(id);
    }
}
