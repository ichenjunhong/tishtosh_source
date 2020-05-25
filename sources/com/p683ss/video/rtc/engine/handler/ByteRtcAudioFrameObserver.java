package com.p683ss.video.rtc.engine.handler;

import com.p683ss.video.rtc.engine.IAudioFrameObserver;
import com.p683ss.video.rtc.engine.RtcEngineImpl.C51644RtcEngineImpl;
import com.p683ss.video.rtc.engine.utils.ByteAudioFrame;

/* renamed from: com.ss.video.rtc.engine.handler.ByteRtcAudioFrameObserver */
public class ByteRtcAudioFrameObserver {
    /* access modifiers changed from: 0000 */
    public void onMixedAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver = C51644RtcEngineImpl.getAudioFrameObserver();
        if (audioFrameObserver != null) {
            ByteAudioFrame byteAudioFrame = new ByteAudioFrame(bArr, i, i2, i3, i4);
            audioFrameObserver.onMixedAudioFrame(byteAudioFrame);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onPlaybackAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver = C51644RtcEngineImpl.getAudioFrameObserver();
        if (audioFrameObserver != null) {
            ByteAudioFrame byteAudioFrame = new ByteAudioFrame(bArr, i, i2, i3, i4);
            audioFrameObserver.onPlaybackAudioFrame(byteAudioFrame);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onRecordAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver = C51644RtcEngineImpl.getAudioFrameObserver();
        if (audioFrameObserver != null) {
            ByteAudioFrame byteAudioFrame = new ByteAudioFrame(bArr, i, i2, i3, i4);
            audioFrameObserver.onRecordAudioFrame(byteAudioFrame);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onPlaybackAudioFrameBeforeMixing(String str, byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver = C51644RtcEngineImpl.getAudioFrameObserver();
        if (audioFrameObserver != null) {
            ByteAudioFrame byteAudioFrame = new ByteAudioFrame(bArr, i, i2, i3, i4);
            audioFrameObserver.onPlaybackAudioFrameBeforeMixing(str, byteAudioFrame);
        }
    }
}
