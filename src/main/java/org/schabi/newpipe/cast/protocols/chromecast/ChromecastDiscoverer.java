package org.schabi.newpipe.cast.protocols.chromecast;

import org.schabi.newpipe.cast.Device;
import org.schabi.newpipe.cast.Discoverer;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import su.litvak.chromecast.api.v2.ChromeCasts;
import su.litvak.chromecast.api.v2.ChromeCast;

public class ChromecastDiscoverer extends Discoverer {

    public ChromecastDiscoverer() throws IOException {
        ChromeCasts.startDiscovery();
    }

    public List<Device> discoverDevices() throws IOException, InterruptedException, ExecutionException {
        List<Device> foundDevices = new ArrayList<>();

        for(ChromeCast chromecast : ChromeCasts.get()) {
            foundDevices.add(new ChromecastDevice(chromecast));
        }

        return foundDevices;
    }

    @Override
    public void finalize() throws IOException {
        ChromeCasts.stopDiscovery();
    }
}
