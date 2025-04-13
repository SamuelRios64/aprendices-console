package aprendices.service;

import aprendices.model.Nota;
import aprendices.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface INotaServicio {
    public List<Nota> findNotas();
    public Nota findNota(Integer id);
    public void saveNota(Nota nota);
    public void deleteNota(Integer nota);

}
