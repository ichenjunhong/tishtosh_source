package com.zego.zegoavkit2.mediarecorder;

import com.zego.zegoavkit2.entities.ZegoPublishStreamQuality;

public interface IZegoMediaRecordCallback2 extends IZegoMediaRecordCallbackBase {
    void onRecordStatusUpdate(ZegoMediaRecordChannelIndex zegoMediaRecordChannelIndex, String str, long j, long j2, ZegoPublishStreamQuality zegoPublishStreamQuality);
}
