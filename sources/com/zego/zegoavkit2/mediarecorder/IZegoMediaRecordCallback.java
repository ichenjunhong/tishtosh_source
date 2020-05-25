package com.zego.zegoavkit2.mediarecorder;

public interface IZegoMediaRecordCallback extends IZegoMediaRecordCallbackBase {
    void onRecordStatusUpdate(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str, long j, long j2);
}
