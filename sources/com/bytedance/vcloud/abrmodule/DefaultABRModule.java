package com.bytedance.vcloud.abrmodule;

import java.util.Map;

public class DefaultABRModule implements IABRModule {
    private long mHandle;

    private native long _create(int i);

    private native ABRResult _getNextSegmentBitrate(long j);

    private native ABRResult _getStartupBitrate(long j);

    private native void _release(long j);

    private native void _setDataSource(long j, IInitParams iInitParams, IPlayStateSupplier iPlayStateSupplier);

    private native void _setInfoListener(long j, IABRInfoListener iABRInfoListener);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setMediaInfo(long j, Map<String, IVideoStream> map, Map<String, IAudioStream> map2);

    private native void _start(long j);

    private native void _stop(long j);

    public void release() {
        if (this.mHandle != 0) {
            _release(this.mHandle);
        }
    }

    public void start() {
        if (this.mHandle != 0) {
            _start(this.mHandle);
        }
    }

    public void stop() {
        if (this.mHandle != 0) {
            _stop(this.mHandle);
        }
    }

    public ABRResult getNextSegmentBitrate() {
        if (this.mHandle == 0) {
            return null;
        }
        return _getNextSegmentBitrate(this.mHandle);
    }

    public ABRResult getStartupBitrate() {
        if (this.mHandle == 0) {
            return null;
        }
        return _getStartupBitrate(this.mHandle);
    }

    public void setInfoListener(IABRInfoListener iABRInfoListener) {
        if (this.mHandle != 0) {
            _setInfoListener(this.mHandle, iABRInfoListener);
        }
    }

    public DefaultABRModule(int i) {
        ABRJniLoader.loadLibrary();
        if (ABRJniLoader.isLibraryLoaded) {
            this.mHandle = _create(i);
            _setIntValue(this.mHandle, 0, ABRConfig.getLogLevel());
        }
    }

    public void init(IInitParams iInitParams, IPlayStateSupplier iPlayStateSupplier) {
        if (this.mHandle != 0) {
            _setDataSource(this.mHandle, iInitParams, iPlayStateSupplier);
        }
    }

    public void setMediaInfo(Map<String, IVideoStream> map, Map<String, IAudioStream> map2) {
        if (this.mHandle != 0) {
            _setMediaInfo(this.mHandle, map, map2);
        }
    }
}
