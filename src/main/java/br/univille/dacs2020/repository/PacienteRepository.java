package br.univille.dacs2020.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dacs2020.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findAllByDataNascimento(Date dataNascimento);
}