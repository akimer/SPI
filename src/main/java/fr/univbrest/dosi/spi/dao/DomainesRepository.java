package fr.univbrest.dosi.spi.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.univbrest.dosi.spi.bean.CgRefCodes;

@RepositoryRestResource(collectionResourceRel = "domaines", path = "domaines")
/**
 * @author LAKRAA
 * 			interface permettant de recuperer la liste des domaines par rvDomain²
 */
public interface DomainesRepository extends PagingAndSortingRepository<CgRefCodes, BigDecimal> {

	CgRefCodes findByIdCgrc(@Param("idCgrc") BigDecimal idCgrc);

	List<CgRefCodes> findByRvDomain(@Param("rvDomain") String rvDomain);

}
