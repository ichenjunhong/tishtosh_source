package com.bytedance.vcloud.abrmodule;

public class InitParams implements IInitParams {
    public float getProbeInterval() {
        return 1.5f;
    }

    public long getStartTime() {
        return 10;
    }

    public int getTrackType() {
        return 0;
    }
}
