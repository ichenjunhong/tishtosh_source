package com.p683ss.video.rtc.engine.handler;

import com.p683ss.video.rtc.engine.RtcEngineImpl.C51644RtcEngineImpl;
import com.p683ss.video.rtc.engine.utils.LogUtil;
import org.webrtc.audio.AudioDeviceObserver;

/* renamed from: com.ss.video.rtc.engine.handler.EngineAudioDeviceEventHandler */
public class EngineAudioDeviceEventHandler implements AudioDeviceObserver {
    public void onAudioDevicePlayoutStart() {
        LogUtil.m110867i("EngineAudioDeviceEventHandler", "onAudioDevicePlayoutStart...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C51644RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDevicePlayoutStart();
        }
    }

    public void onAudioDevicePlayoutStop() {
        LogUtil.m110867i("EngineAudioDeviceEventHandler", "onAudioDevicePlayoutStop...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C51644RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDevicePlayoutStop();
        }
    }

    public void onAudioDeviceRecordStart() {
        LogUtil.m110867i("EngineAudioDeviceEventHandler", "onAudioDeviceRecordStart...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C51644RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDeviceRecordStart();
        }
    }

    public void onAudioDeviceRecordStop() {
        LogUtil.m110867i("EngineAudioDeviceEventHandler", "onAudioDeviceRecordStop...");
        IRtcEngineAudioDeviceEventHandler rtcEngineAudioDeviceEventHandler = C51644RtcEngineImpl.getRtcEngineAudioDeviceEventHandler();
        if (rtcEngineAudioDeviceEventHandler != null) {
            rtcEngineAudioDeviceEventHandler.onAudioDeviceRecordStop();
        }
    }
}
