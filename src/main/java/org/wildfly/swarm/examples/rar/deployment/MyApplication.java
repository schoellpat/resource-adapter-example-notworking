/*******************************************************************************
 * Copyright 2017 PATRONAS Financial Systems GmbH. All rights reserved.
 ******************************************************************************/
package org.wildfly.swarm.examples.rar.deployment;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Stateless
@Path("/")
public class MyApplication extends Application {

  @EJB
  private FileIOBean bean;

  @GET
  public String doGet() {
    bean.getConnectionFactory();
    return "Works!";
  }

}
