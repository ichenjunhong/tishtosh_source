package com.bytedance.realx.video.camera;

import com.bytedance.realx.base.RXLogging;
import java.util.ArrayList;
import org.webrtc.Camera1Enumerator;

public class RXVideoCameraInfo {
    private ArrayList<DeviceInfo> deviceInfos = new ArrayList<>();

    public class DeviceInfo {
        int cameraId;
        String name;

        public DeviceInfo() {
        }
    }

    public int getDeviceNumbers() {
        return this.deviceInfos.size();
    }

    RXVideoCameraInfo() {
        String[] deviceNames;
        RXLogging.m25467d("RXVideoCameraInfo", "RXVideoCameraInfo Created...");
        try {
            Camera1Enumerator camera1Enumerator = new Camera1Enumerator(true);
            for (String str : camera1Enumerator.getDeviceNames()) {
                DeviceInfo deviceInfo = new DeviceInfo();
                deviceInfo.name = str;
                if (camera1Enumerator.isFrontFacing(str)) {
                    deviceInfo.cameraId = 0;
                } else if (camera1Enumerator.isBackFacing(str)) {
                    deviceInfo.cameraId = 1;
                } else {
                    deviceInfo.cameraId = 2;
                }
                this.deviceInfos.add(deviceInfo);
            }
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Create VideoCapture failed : ");
            sb.append(e.getMessage());
            RXLogging.m25467d("RXVideoCameraInfo", sb.toString());
        }
    }

    public int getCameraId(int i) {
        if (i >= this.deviceInfos.size()) {
            return 3;
        }
        return ((DeviceInfo) this.deviceInfos.get(i)).cameraId;
    }

    public String getDeviceName(int i) {
        if (i >= this.deviceInfos.size()) {
            return null;
        }
        return ((DeviceInfo) this.deviceInfos.get(i)).name;
    }
}
