package org.schabi.newpipe.cast.protocols.chromecast;

import org.schabi.newpipe.cast.CastingProtocol;
import org.schabi.newpipe.cast.Discoverer;

import java.io.IOException;

public class ChromecastProtocol extends CastingProtocol {
    public ChromecastProtocol(int id, String name) {
        super(id, name);
    }

    public Discoverer getDiscoverer() {
        try {
            return new ChromecastDiscoverer();
        } catch (IOException e) {
            //idk
            return null;
        }
    }
}
