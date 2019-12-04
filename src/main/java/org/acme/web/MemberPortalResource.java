package org.acme.web;

import io.quarkus.panache.common.Sort;
import org.acme.Domain.MemberPortal;
import org.acme.service.MemberPortalService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/member")
@Produces("application/json")
@Consumes("application/json")
public class MemberPortalResource {

    @Inject
    MemberPortalService memberPortalService;

    @GET
    public List<MemberPortal> getMembers() {
        return memberPortalService.getAllMember();
    }

    @GET
    @Path("{id}")
    public MemberPortal getSingleMember(@PathParam Long id) {
        MemberPortal memberPortal = memberPortalService.getMemberById(id);
        if (memberPortal == null) {
            throw new WebApplicationException("MemberPortal with id of " + id + " does not exist.", 404);
        }
        return memberPortal;
    }

    @POST
    public Response create(MemberPortal memberPortal) {
        if (memberPortal.getId() != null) {
            throw new WebApplicationException("Id was invalidly set on request.", 422);
        }
        MemberPortal newMember = memberPortalService.createMember(memberPortal);
        return Response.ok(newMember).status(201).build();
    }

    @PUT
    @PathParam("{id}")
    public Response update(@PathParam Long id, MemberPortal memberPortal){
        if (memberPortal.getId() == null) {
            throw new WebApplicationException("Id was invalidly set on request.", 422);
        }

        MemberPortal updateMember = memberPortalService.updateMember(memberPortal);


        return Response.ok(updateMember).status(201).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam Long id) {
        MemberPortal memberPortal = memberPortalService.getMemberById(id);
        if (memberPortal == null) {
            throw new WebApplicationException("MemberPortal with id of " + id + " does not exist.", 404);
        }
        memberPortalService.deleteMember(memberPortal);
        return Response.status(204).build();
    }



}
