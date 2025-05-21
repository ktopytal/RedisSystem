package org.pieszku.redis.packet;

import org.pieszku.redis.utilities.RedisUtilities;

import java.io.Serializable;

public class Packet implements Serializable {


    public void send(String channel){
        RedisUtilities.getInstance().publish(channel, this);
    }
}
