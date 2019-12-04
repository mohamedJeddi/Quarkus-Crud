package org.acme.service;

import org.acme.Domain.MemberPortal;

import java.util.List;

public interface MemberPortalService {

    MemberPortal createMember(MemberPortal memberPortal);
    MemberPortal updateMember(MemberPortal memberPortal);
    void deleteMember(MemberPortal memberPortal);
    List<MemberPortal> getAllMember();
    MemberPortal getMemberById(Long id);

}
