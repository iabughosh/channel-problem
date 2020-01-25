package org.acme;

import io.smallrye.reactive.messaging.annotations.Channel;
import io.smallrye.reactive.messaging.annotations.Emitter;
import javax.inject.Inject;

public class ExampleModel {

    public String msg;

    @Inject 
    @Channel("hello") 
    public Emitter<String> ownerCreatedChannel;

    public ExampleModel() {
        super();
    }

    public void hello() { 
        this.ownerCreatedChannel.send(this.msg);
    }
}
