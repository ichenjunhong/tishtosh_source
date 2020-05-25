package com.bytedance.vcloud.abrmodule;

public class DefaultNetSpeedPredictor implements INetSpeedPredictor {
    private long mHandle;

    private native long _create(int i);

    private native float _getSpeed(long j);

    private native void _release(long j);

    private native void _setIntValue(long j, int i, int i2);

    private native void _update(long j, ISpeedRecord iSpeedRecord);

    public void release() {
        if (this.mHandle != 0) {
            _release(this.mHandle);
        }
    }

    public float getSpeed() {
        if (this.mHandle == 0) {
            return -1.0f;
        }
        return _getSpeed(this.mHandle);
    }

    public void update(ISpeedRecord iSpeedRecord) {
        if (this.mHandle != 0) {
            _update(this.mHandle, iSpeedRecord);
        }
    }

    public DefaultNetSpeedPredictor(int i) {
        ABRJniLoader.loadLibrary();
        if (ABRJniLoader.isLibraryLoaded) {
            this.mHandle = _create(i);
            _setIntValue(this.mHandle, 0, ABRConfig.getLogLevel());
        }
    }
}
