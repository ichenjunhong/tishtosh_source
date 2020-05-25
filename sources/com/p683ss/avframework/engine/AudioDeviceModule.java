package com.p683ss.avframework.engine;

import android.content.Context;
import android.media.AudioManager;
import android.util.AndroidRuntimeException;
import com.p683ss.avframework.capture.audio.AudioCapturer;
import com.p683ss.avframework.mixer.AudioMixer;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.JNINamespace;
import com.p683ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.nio.Buffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.AudioDeviceModule */
public class AudioDeviceModule extends NativeObject {
    private static AudioManager sAudioManager;
    private AudioMixer mAudioMixer;
    private WeakReference<AudioCapturer> mExtAudioCapture;
    public final Observer mObserver;

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$AudioRenderSink */
    public static class AudioRenderSink extends AudioSink {
        public void onNoData() {
        }

        public int getRenderTrackId() {
            return AudioDeviceModule.nativeRenderSinkTrackId(this.mNativeObj);
        }

        public boolean isEnableAGC() {
            return AudioDeviceModule.nativeRenderSinkisEnableAgc(this.mNativeObj);
        }

        public boolean isMute() {
            return AudioDeviceModule.nativeRenderSinkIsMute(this.mNativeObj);
        }

        public synchronized void release() {
            AudioDeviceModule.nativeRenderSinkRelease(this.mNativeObj);
            setNativeObj(0);
        }

        public AudioRenderSink(long j) {
            setNativeObj(j);
        }

        public void setMute(boolean z) {
            AudioDeviceModule.nativeRenderSinkSetMute(this.mNativeObj, z);
        }

        public void setVolume(float f) {
            AudioDeviceModule.nativeRenderSinkSetVolume(this.mNativeObj, f);
        }

        public void setEnableAGC(boolean z, boolean z2) {
            AudioDeviceModule.nativeRenderSinkEnableAgc(this.mNativeObj, z, z2);
        }

        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
            AudioDeviceModule.nativeRenderSinkData(this.mNativeObj, buffer, i, i2, i3, j);
        }
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$InteralAudioMixer */
    class InteralAudioMixer extends AudioMixer {
        public void setOriginTrackIndex(int i) {
        }

        public boolean enable() {
            return super.enable();
        }

        public void setEnable(boolean z) {
            super.setEnable(z);
            AudioDeviceModule.this.mObserver.onADMInfo(4, enable() ? 1 : 0, 0);
        }

        public InteralAudioMixer(long j) {
            super(j);
        }
    }

    /* renamed from: com.ss.avframework.engine.AudioDeviceModule$Observer */
    public interface Observer {
        void onADMInfo(int i, int i2, long j);
    }

    private native long nativeCreate(AudioPlayer audioPlayer, AudioCapturer audioCapturer);

    private native long nativeCreateRenderSink();

    private native void nativeEnableBuiltInAEC(boolean z);

    private native void nativeEnableEchoMode(boolean z);

    private native TEBundle nativeGetParameter();

    private native long nativeGetRenderMixer();

    private native boolean nativeIsEchoMode();

    private native boolean nativeIsEnableBuiltInAEC();

    private native boolean nativeIsExternalRecording();

    private native boolean nativeIsPlayer();

    private native boolean nativeIsRecoding();

    private native void nativeRelease();

    public static native void nativeRenderSinkData(long j, Buffer buffer, int i, int i2, int i3, long j2);

    public static native void nativeRenderSinkEnableAgc(long j, boolean z, boolean z2);

    public static native boolean nativeRenderSinkIsMute(long j);

    public static native void nativeRenderSinkRelease(long j);

    public static native void nativeRenderSinkSetMute(long j, boolean z);

    public static native void nativeRenderSinkSetVolume(long j, float f);

    public static native int nativeRenderSinkTrackId(long j);

    public static native boolean nativeRenderSinkisEnableAgc(long j);

    private native void nativeSetExternalRecording(boolean z);

    private native void nativeSetParameter(TEBundle tEBundle);

    private native void nativeSetRecordingCallback(AudioSink audioSink);

    private native int nativeStartPlayer();

    private native int nativeStartRecording();

    private native int nativeStopPlayer();

    private native int nativeStopRecording();

    private native void nativeUpdateOriginTrackIndex(int i);

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public boolean isEchoMode() {
        return nativeIsEchoMode();
    }

    public boolean isEnableBuiltInAEC() {
        return nativeIsEnableBuiltInAEC();
    }

    public boolean isExternalRecording() {
        return nativeIsExternalRecording();
    }

    public boolean isPlayer() {
        return nativeIsPlayer();
    }

    public boolean isRecording() {
        return nativeIsRecoding();
    }

    public int startPlayer() {
        return nativeStartPlayer();
    }

    public int startRecording() {
        return nativeStartRecording();
    }

    public int stopPlayer() {
        return nativeStopPlayer();
    }

    public int stopRecording() {
        return nativeStopRecording();
    }

    public static int getMode() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.getMode();
        }
        return 0;
    }

    public static boolean isMicMute() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isMicrophoneMute();
        }
        return true;
    }

    public static boolean isSpeakerphoneOn() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isSpeakerphoneOn();
        }
        return false;
    }

    public AudioRenderSink createRenderSink() {
        return new AudioRenderSink(nativeCreateRenderSink());
    }

    public synchronized AudioMixer getRenderMixer() {
        if (this.mAudioMixer == null) {
            this.mAudioMixer = new InteralAudioMixer(nativeGetRenderMixer());
        }
        return this.mAudioMixer;
    }

    public synchronized void release() {
        String str = "AudioDeviceModule";
        StringBuilder sb = new StringBuilder("release ADM ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        if (this.mAudioMixer != null) {
            this.mAudioMixer.release();
            this.mAudioMixer = null;
        }
        nativeRelease();
        setNativeObj(0);
    }

    private void updateOriginTrackIndex(int i) {
        nativeUpdateOriginTrackIndex(i);
    }

    public void setExternalRecording(boolean z) {
        nativeSetExternalRecording(z);
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public void setRecordingCallack(AudioSink audioSink) {
        nativeSetRecordingCallback(audioSink);
    }

    public static void setMicMute(boolean z) {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            audioManager.setMicrophoneMute(z);
        }
    }

    public static void setSpeakerphoneOn(boolean z) {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(z);
        }
    }

    public void enableBuiltInAEC(boolean z) {
        nativeEnableBuiltInAEC(z);
        this.mObserver.onADMInfo(2, isEnableBuiltInAEC() ? 1 : 0, 0);
    }

    public void enableEchoMode(boolean z) {
        nativeEnableEchoMode(z);
        this.mObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0);
    }

    public void setMicVolume(float f) {
        AudioCapturer audioCapturer = (AudioCapturer) this.mExtAudioCapture.get();
        if (audioCapturer != null) {
            audioCapturer.setVolume((double) f);
        }
    }

    public static void setMode(int i) {
        StringBuilder sb = new StringBuilder("Setup mode ");
        sb.append(i);
        AVLog.iod("AudioDeviceModule", sb.toString());
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            audioManager.setMode(i);
        }
    }

    public AudioDeviceModule(Observer observer, Context context) {
        this(null, null, observer, context);
    }

    public void setExternalRecording(boolean z, AudioCapturer audioCapturer) {
        nativeSetExternalRecording(z);
        if (audioCapturer != null) {
            this.mExtAudioCapture = new WeakReference<>(audioCapturer);
        }
    }

    public AudioDeviceModule(AudioCapturer audioCapturer, Observer observer, Context context) {
        this(null, audioCapturer, observer, context);
    }

    public AudioDeviceModule(AudioPlayer audioPlayer, AudioCapturer audioCapturer, Observer observer, Context context) {
        setNativeObj(nativeCreate(audioPlayer, audioCapturer));
        AudioManager audioManager = null;
        this.mExtAudioCapture = new WeakReference<>(null);
        if (audioPlayer == null) {
            if (context != null) {
                audioManager = (AudioManager) context.getSystemService("audio");
            }
            sAudioManager = audioManager;
            if (observer == null) {
                observer = new Observer() {
                    public void onADMInfo(int i, int i2, long j) {
                    }
                };
            }
            this.mObserver = observer;
            updateOriginTrackIndex(-10);
            return;
        }
        throw new AndroidRuntimeException("to support at later version");
    }
}
