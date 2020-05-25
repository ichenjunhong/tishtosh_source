package org.webrtc.audio;

import com.bytedance.realx.base.RXLogging;

class WebRtcAudioDeviceObserver {
    private final AudioDeviceObserver audioDeviceObserver;

    public void onAudioDevicePlayoutStart() {
        RXLogging.m25467d("WebRtcAudioDeviceObserver", "onAudioDevicePlayoutStart... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDevicePlayoutStart();
        }
    }

    public void onAudioDevicePlayoutStop() {
        RXLogging.m25467d("WebRtcAudioDeviceObserver", "onAudioDevicePlayoutStop... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDevicePlayoutStop();
        }
    }

    public void onAudioDeviceRecordStart() {
        RXLogging.m25467d("WebRtcAudioDeviceObserver", "onAudioDeviceRecordStart... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDeviceRecordStart();
        }
    }

    public void onAudioDeviceRecordStop() {
        RXLogging.m25467d("WebRtcAudioDeviceObserver", "onAudioDeviceRecordStop... ");
        if (this.audioDeviceObserver != null) {
            this.audioDeviceObserver.onAudioDeviceRecordStop();
        }
    }

    public WebRtcAudioDeviceObserver(AudioDeviceObserver audioDeviceObserver2) {
        this.audioDeviceObserver = audioDeviceObserver2;
    }
}
