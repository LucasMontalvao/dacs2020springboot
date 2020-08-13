package br.univille.dacs2020.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.univille.dacs2020.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findAllByDataNascimento(Date dataNascimento);

    @Query("SELECT p FROM Paciente p WHERE p.nome LIKE %?1%")
    List<Paciente> findAllByNomeIgnoreCase(String keyword);
}