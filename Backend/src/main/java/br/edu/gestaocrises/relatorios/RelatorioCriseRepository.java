package br.edu.gestaocrises.relatorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioCriseRepository extends JpaRepository<RelatorioCrise, Long> {
}
