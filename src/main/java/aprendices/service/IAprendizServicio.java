package aprendices.service;

import aprendices.model.Aprendiz;

import java.util.List;


public interface IAprendizServicio{

    public List<Aprendiz> findApredices();
    public Aprendiz findAprendiz(Integer id);
    public void saveAprendiz(Aprendiz aprendiz);
    public void deleteAprendiz(Integer id);

}

