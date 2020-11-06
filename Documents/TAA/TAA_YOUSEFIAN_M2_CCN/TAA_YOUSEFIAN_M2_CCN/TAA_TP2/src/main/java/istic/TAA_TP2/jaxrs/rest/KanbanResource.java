package istic.TAA_TP2.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Parameter;
import istic.TAA_TP2.Jpa.DAO.KanbanDao;
import istic.TAA_TP2.Jpa.Metier.Kanban;
import istic.TAA_TP2.jaxrs.domain.Pet;

@Path("/kanban")
@Produces({"application/json"})
public class KanbanResource {
	
	 KanbanDao kanbandao = new KanbanDao();
	
	
	@GET
	@Produces({"application/json"})
	@Path("/{id}")
	public Kanban getKanbanById(@PathParam("id") Long id)  {
		return this.kanbandao.findOne(id);
	}
	
	
	  @POST
	  @Consumes("application/json")
	  public Response addKanban(Kanban kanban) {
	    // add Kanban
		 kanbandao.save(kanban);
	    return Response.ok().entity("SUCCESS").build();
	  }
	  
	  @DELETE
	  @Consumes("application/json")
	  public Response removeKanban(Kanban kanban) {
	    // add Kanban
		 kanbandao.delete(kanban);
	    return Response.ok().entity("SUCCESS").build();
	  }

}
