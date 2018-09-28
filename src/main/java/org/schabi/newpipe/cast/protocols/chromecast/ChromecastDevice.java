package org.schabi.newpipe.cast.protocols.chromecast;

import org.schabi.newpipe.cast.Device;
import su.litvak.chromecast.api.v2.ChromeCast;

public class ChromecastDevice extends Device {
    private ChromeCast chromecastDevice;

    public ChromecastDevice(String location) {
        super(location);
        this.chromecastDevice = new ChromeCast(location);
    }

    ChromecastDevice(ChromeCast chromecast) {
        super(chromecast.getAddress());
        this.chromecastDevice = chromecast;
    }

    public String getName() {
        return this.chromecastDevice.getName();
    }
}
