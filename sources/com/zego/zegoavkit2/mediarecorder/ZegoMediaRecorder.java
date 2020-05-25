package com.zego.zegoavkit2.mediarecorder;

import android.os.Handler;
import android.os.Looper;
import com.zego.zegoavkit2.entities.ZegoPublishStreamQuality;

public class ZegoMediaRecorder implements IZegoMediaRecordCallback2 {
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private volatile IZegoMediaRecordCallbackBase mZegoMediaRecordCallback;

    public void setZegoMediaRecordCallback(IZegoMediaRecordCallback2 iZegoMediaRecordCallback2) {
        setZegoMediaRecordCallbackBase(iZegoMediaRecordCallback2);
    }

    public void setZegoMediaRecordCallback(IZegoMediaRecordCallback iZegoMediaRecordCallback) {
        setZegoMediaRecordCallbackBase(iZegoMediaRecordCallback);
    }

    public boolean stopRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        ZegoMediaRecordJNI.stopRecord(zegoMediaRecordChannelIndex.value());
        return true;
    }

    private void setZegoMediaRecordCallbackBase(IZegoMediaRecordCallbackBase iZegoMediaRecordCallbackBase) {
        this.mZegoMediaRecordCallback = iZegoMediaRecordCallbackBase;
        if (iZegoMediaRecordCallbackBase != null) {
            ZegoMediaRecordJNI.setCallback(this);
            ZegoMediaRecordJNI.setMediaRecordCallback(true);
            return;
        }
        ZegoMediaRecordJNI.setCallback(null);
        ZegoMediaRecordJNI.setMediaRecordCallback(false);
    }

    public void onMediaRecord(int i, ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str) {
        final IZegoMediaRecordCallbackBase iZegoMediaRecordCallbackBase = this.mZegoMediaRecordCallback;
        if (iZegoMediaRecordCallbackBase != null) {
            Handler handler = this.mHandler;
            final int i2 = i;
            final ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex2 = zegoMediaRecordChannelIndex;
            final String str2 = str;
            C524551 r0 = new Runnable() {
                public void run() {
                    iZegoMediaRecordCallbackBase.onMediaRecord(i2, zegoMediaRecordChannelIndex2, str2);
                }
            };
            handler.post(r0);
        }
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecord(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str);
    }

    public void onRecordStatusUpdate(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str, long j, long j2, ZegoPublishStreamQuality zegoPublishStreamQuality) {
        final IZegoMediaRecordCallbackBase iZegoMediaRecordCallbackBase = this.mZegoMediaRecordCallback;
        if (iZegoMediaRecordCallbackBase != null) {
            Handler handler = this.mHandler;
            final ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex2 = zegoMediaRecordChannelIndex;
            final String str2 = str;
            final long j3 = j;
            final long j4 = j2;
            final ZegoPublishStreamQuality zegoPublishStreamQuality2 = zegoPublishStreamQuality;
            C524562 r0 = new Runnable() {
                public void run() {
                    if (iZegoMediaRecordCallbackBase instanceof IZegoMediaRecordCallback) {
                        ((IZegoMediaRecordCallback) iZegoMediaRecordCallbackBase).onRecordStatusUpdate(zegoMediaRecordChannelIndex2, str2, j3, j4);
                        return;
                    }
                    if (iZegoMediaRecordCallbackBase instanceof IZegoMediaRecordCallback2) {
                        ((IZegoMediaRecordCallback2) iZegoMediaRecordCallbackBase).onRecordStatusUpdate(zegoMediaRecordChannelIndex2, str2, j3, j4, zegoPublishStreamQuality2);
                    }
                }
            };
            handler.post(r0);
        }
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str, boolean z, int i) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecordEx(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str, z, i, ZegoMediaRecordFormat.FLV.value(), false);
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str, boolean z, int i, ZegoMediaRecordFormat zegoMediaRecordFormat) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecordEx(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str, z, i, zegoMediaRecordFormat.value(), false);
    }

    public boolean startRecord(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, ZegoMediaRecordType zegoMediaRecordType, String str, boolean z, int i, ZegoMediaRecordFormat zegoMediaRecordFormat, boolean z2) {
        if (zegoMediaRecordChannelIndex == null) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return ZegoMediaRecordJNI.startRecordEx(zegoMediaRecordChannelIndex.value(), zegoMediaRecordType.value(), str, z, i, zegoMediaRecordFormat.value(), z2);
    }
}
