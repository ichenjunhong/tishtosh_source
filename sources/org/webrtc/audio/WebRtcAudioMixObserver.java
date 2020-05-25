package org.webrtc.audio;

import com.bytedance.realx.base.RXLogging;

public class WebRtcAudioMixObserver {
    private final AudioMixObserver audioMixObserver;

    public void onAudioLoopbackFinish() {
        RXLogging.m25467d("WebRtcAudioMixObserver", "onAudioLoopbackFinish... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioLoopbackFinish();
        }
    }

    public void onAudioLoopbackStart() {
        RXLogging.m25467d("WebRtcAudioMixObserver", "onAudioLoopbackStart... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioLoopbackStart();
        }
    }

    public void onAudioMixingFinish() {
        RXLogging.m25467d("WebRtcAudioMixObserver", "onAudioMixingFinish... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioMixingFinish();
        }
    }

    public WebRtcAudioMixObserver(AudioMixObserver audioMixObserver2) {
        this.audioMixObserver = audioMixObserver2;
    }

    public void onAudioEffectFinish(int i) {
        RXLogging.m25467d("WebRtcAudioMixObserver", "onAudioEffectFinish... ");
        if (this.audioMixObserver != null) {
            this.audioMixObserver.onAudioEffectFinish(i);
        }
    }
}
