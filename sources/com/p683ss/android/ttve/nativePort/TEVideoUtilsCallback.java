package com.p683ss.android.ttve.nativePort;

import com.p683ss.android.vesdk.C50753r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.ss.android.ttve.nativePort.TEVideoUtilsCallback */
public class TEVideoUtilsCallback {
    private C50753r listener;

    public void setListener(Object obj) {
        this.listener = (C50753r) obj;
    }

    public static ByteBuffer allocateFrame(int i, int i2) {
        return ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.LITTLE_ENDIAN);
    }

    public boolean onFrameAvailable(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (this.listener == null || !this.listener.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (!(obj instanceof TEVideoUtilsCallback)) {
            return false;
        }
        TEVideoUtilsCallback tEVideoUtilsCallback = (TEVideoUtilsCallback) obj;
        if (tEVideoUtilsCallback == null || tEVideoUtilsCallback.listener == null || !tEVideoUtilsCallback.listener.processFrame(byteBuffer, i, i2, i3)) {
            return false;
        }
        return true;
    }

    public static boolean onFrameAvailable2(Object obj, byte[] bArr, int i, int i2, int i3) {
        if (!(obj instanceof TEVideoUtilsCallback)) {
            return false;
        }
        TEVideoUtilsCallback tEVideoUtilsCallback = (TEVideoUtilsCallback) obj;
        if (tEVideoUtilsCallback == null || tEVideoUtilsCallback.listener == null || !tEVideoUtilsCallback.listener.processFrame(ByteBuffer.wrap(bArr), i, i2, i3)) {
            return false;
        }
        return true;
    }
}
