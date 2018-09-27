package org.schabi.newpipe.cast.protocols.chromecast;

import org.schabi.newpipe.cast.Device;
import org.schabi.newpipe.cast.Discoverer;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import su.litvak.chromecast.api.v2.ChromeCasts;
import su.litvak.chromecast.api.v2.ChromeCast;

public class ChromecastDiscoverer extends Discoverer {
    public List<Device> discoverDevices() throws IOException, InterruptedException, ExecutionException {
        ChromeCasts.startDiscovery();
        ChromeCasts.get();


    }
}
