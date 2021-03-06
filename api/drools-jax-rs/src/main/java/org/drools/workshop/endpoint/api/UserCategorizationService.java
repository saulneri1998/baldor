/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop.endpoint.api;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.drools.workshop.model.User;
import org.drools.workshop.model.Problema;
import org.drools.workshop.model.Respuesta;

/**
 *
 * 
 */
@Path("usuarios")
public interface UserCategorizationService {
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/registrar")
    public User registrarUsuario(@NotNull User user);

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/responder")
    public User responderPregunta(@NotNull Respuesta respuesta);
        
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/ejercicio")
    public Problema elegirProblema(@NotNull User user);

}
