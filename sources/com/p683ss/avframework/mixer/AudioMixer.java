package com.p683ss.avframework.mixer;

import com.p683ss.avframework.engine.AudioSink;
import com.p683ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.mixer.AudioMixer */
public class AudioMixer extends NativeMixer {

    /* renamed from: com.ss.avframework.mixer.AudioMixer$AudioMixerDescription */
    public static class AudioMixerDescription {
        public float volumeCoeff;

        public float getColumeCoeff() {
            return this.volumeCoeff;
        }

        public AudioMixerDescription() {
            this.volumeCoeff = 1.0f;
        }

        public AudioMixerDescription(float f) {
            this.volumeCoeff = f;
        }
    }

    private native void nativeAddAudioSink(long j, AudioSink audioSink);

    private native void nativeAudioMixerRelease(long j);

    private native void nativeRemoveAudioSink(long j, AudioSink audioSink);

    public void finalize() throws Throwable {
        release();
    }

    public boolean isAudioMixer() {
        return true;
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeAudioMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
    }

    public AudioMixer(long j) {
        setNativeObj(j);
    }

    public void addAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeAddAudioSink(this.mNativeObj, audioSink);
        }
    }

    public int createTrack(AudioMixerDescription audioMixerDescription) {
        return super.nativeCreateTrack(audioMixerDescription);
    }

    public AudioMixerDescription getDescription(int i) {
        return (AudioMixerDescription) super.nativeGetDescription(i);
    }

    public void removeAudioSink(AudioSink audioSink) {
        if (audioSink != null) {
            nativeRemoveAudioSink(this.mNativeObj, audioSink);
        }
    }

    public void updateDescription(int i, AudioMixerDescription audioMixerDescription) {
        super.nativeUpdateDescription(i, audioMixerDescription);
    }
}
