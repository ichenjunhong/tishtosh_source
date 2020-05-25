package com.bytedance.bdlocation.client;

import com.bytedance.bdlocation.client.BDLocationClient.Callback;

public class LocationRequest {
    private final Callback callback;
    private final LocationOption option;

    public Callback getCallback() {
        return this.callback;
    }

    public LocationOption getOption() {
        return this.option;
    }

    public LocationRequest(LocationOption locationOption, Callback callback2) {
        this.option = locationOption;
        this.callback = callback2;
    }
}
