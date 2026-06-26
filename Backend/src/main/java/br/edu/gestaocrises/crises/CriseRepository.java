package br.edu.gestaocrises.crises;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CriseRepository extends JpaRepository<Crise, Long> {
}
