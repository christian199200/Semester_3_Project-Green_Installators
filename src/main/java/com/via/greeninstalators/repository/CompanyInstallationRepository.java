package com.via.greeninstalators.repository;

import com.via.greeninstalators.model.CompanyInstallation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyInstallationRepository extends JpaRepository<CompanyInstallation, CompanyInstallation> {

    List<CompanyInstallation> findByCompanyCode(String companyCode);

    List<CompanyInstallation> findByType(String type);

    @Query("SELECT ci FROM CompanyInstallation ci WHERE ci.companyCode = :companyCode")
    List<CompanyInstallation> getInstallationsByCompanyCode(@Param("companyCode") String companyCode);

    @Query("SELECT ci FROM CompanyInstallation ci WHERE ci.type = :type")
    List<CompanyInstallation> getInstallationsByType(@Param("type") String type);
}
