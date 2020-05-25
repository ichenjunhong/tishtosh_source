package com.bytedance.android.livesdk.live.model;

import com.google.gson.p1076a.C17952c;

public class Camera2AB {
    @C17952c(mo34828a = "camera_hw_level")
    private int cameraHWLevel;
    @C17952c(mo34828a = "camera_type")
    private int cameraType = 1;

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public Camera2AB() {
    }

    public void setCameraHWLevel(int i) {
        this.cameraHWLevel = i;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public Camera2AB(int i, int i2) {
        this.cameraType = i;
        this.cameraHWLevel = i2;
    }
}
