package org.wildfly.swarm.examples.jsf.shrinkwrap;

import javax.enterprise.inject.Model;

/**
 * @author Ken Finnigan
 */
@Model
public class Message {
    public String say() {
        return "Hello from JSF";
    }
}
