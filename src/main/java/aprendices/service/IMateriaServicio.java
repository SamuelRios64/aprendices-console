package aprendices.service;

import aprendices.model.Materia;

import java.util.List;

public interface IMateriaServicio {
    public List<Materia> findMaterias();
    public Materia findMateria(Integer id);
    public void saveMateria(Materia materia);
    public void deleteMateria(Integer id);
}
