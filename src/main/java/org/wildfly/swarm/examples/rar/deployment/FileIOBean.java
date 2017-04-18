package org.wildfly.swarm.examples.rar.deployment;

import javax.annotation.Resource;
import javax.annotation.Resource.AuthenticationType;
import javax.ejb.Stateless;
import javax.ws.rs.core.Application;

import org.xadisk.connector.outbound.XADiskConnectionFactory;

@Stateless
public class FileIOBean extends Application {

  @Resource(name = "ra/XADiskConnectionFactory", type = org.xadisk.connector.outbound.XADiskConnectionFactory.class, authenticationType = AuthenticationType.CONTAINER, mappedName = "java:global/XADiskCF")
  private XADiskConnectionFactory _xaDiskConnectionFactory;

  public XADiskConnectionFactory getConnectionFactory() {
    return _xaDiskConnectionFactory;
  }

}
