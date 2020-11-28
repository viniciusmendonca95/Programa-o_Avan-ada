package br.unit.web.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import br.unit.web.api.entity.ContaCorrente;

@Repository
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {
	
	@Query("select c from ContaCorrente c where c.numero = :numero")
    ContaCorrente findByNumero(@Param("numero") Integer numero);
}
