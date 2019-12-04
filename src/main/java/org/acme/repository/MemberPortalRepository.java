package org.acme.repository;

import org.acme.Domain.MemberPortal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberPortalRepository extends JpaRepository<MemberPortal, Long> {
}
