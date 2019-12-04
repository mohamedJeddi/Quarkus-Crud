package org.acme.service.impl;

import org.acme.Domain.MemberPortal;
import org.acme.repository.MemberPortalRepository;
import org.acme.service.MemberPortalService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@ApplicationScoped
public class MemberPortalServiceImpl implements MemberPortalService {

    @Inject
    MemberPortalRepository memberPortalRepository;

    @Override
    public MemberPortal createMember(MemberPortal memberPortal) {
        return memberPortalRepository.save(memberPortal);
    }

    @Override
    public MemberPortal updateMember(MemberPortal memberPortal) {
        return memberPortalRepository.saveAndFlush(memberPortal);
    }

    @Override
    public void deleteMember(MemberPortal memberPortal) {
        memberPortalRepository.deleteById(memberPortal.getId());
    }

    @Override
    public List<MemberPortal> getAllMember() {
        return memberPortalRepository.findAll();
    }

    @Override
    public MemberPortal getMemberById(Long id) {
        return memberPortalRepository.findById(id).get();
    }
}
