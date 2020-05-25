package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.avframework.engine.AudioDeviceModule;
import com.p683ss.avframework.engine.AudioDeviceModule.AudioRenderSink;
import com.p683ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack;
import com.p683ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceControl */
public class AudioDeviceControl implements IAudioDeviceControl {
    public AudioDeviceModule mAudioDeviceModule;
    private List<AudioLayer> mLayers = new ArrayList();

    /* renamed from: com.ss.avframework.livestreamv2.core.AudioDeviceControl$AudioLayer */
    class AudioLayer implements IAudioTrack {
        private AudioMixerDescription mAudioMixerDescription;
        private AudioRenderSink mAudioRenderSink;
        private int mChannel;
        private final String mName;
        private int mSampleHz;
        public int mTrackId = this.mAudioRenderSink.getRenderTrackId();

        public int getChannel() {
            return this.mChannel;
        }

        public int getSampleHz() {
            return this.mSampleHz;
        }

        public String name() {
            return this.mName;
        }

        public float getVolume() {
            return this.mAudioMixerDescription.volumeCoeff;
        }

        public boolean isEnableAGC() {
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isEnableAGC();
            }
            return false;
        }

        public boolean isMute() {
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                return audioRenderSink.isMute();
            }
            return true;
        }

        public void dispose() {
            AudioDeviceControl.this.removeTrack(name());
            if (this.mAudioRenderSink != null) {
                this.mAudioRenderSink.release();
                this.mAudioRenderSink = null;
            }
        }

        public boolean setMute(boolean z) {
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setMute(z);
            }
            return true;
        }

        public void setVolume(float f) {
            this.mAudioMixerDescription.volumeCoeff = f;
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setVolume(f);
            }
        }

        public void enableAGC(boolean z, boolean z2) {
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.setEnableAGC(z, z2);
            }
        }

        public void onData(ByteBuffer byteBuffer, int i, long j) {
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i, this.mSampleHz, this.mChannel, j / 1000000);
            }
        }

        public void onData(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
            AudioRenderSink audioRenderSink = this.mAudioRenderSink;
            if (audioRenderSink != null) {
                audioRenderSink.onData(byteBuffer, i3, i, i2, j / 1000000);
            }
        }

        public AudioLayer(String str, int i, int i2, int i3, AudioRenderSink audioRenderSink) {
            this.mAudioRenderSink = audioRenderSink;
            this.mName = str;
            this.mAudioMixerDescription = AudioDeviceControl.this.mAudioDeviceModule.getRenderMixer().getDescription(this.mTrackId);
            this.mSampleHz = i;
            this.mChannel = i2;
        }
    }

    public IAudioTrack[] getTracks() {
        return null;
    }

    public float getVolume() {
        return 0.0f;
    }

    public void setVolume(float f) {
    }

    public boolean isEnableAEC() {
        return this.mAudioDeviceModule.isEnableBuiltInAEC();
    }

    public boolean isEnableEcho() {
        return this.mAudioDeviceModule.isEchoMode();
    }

    /* access modifiers changed from: protected */
    public void release() {
        synchronized (this.mLayers) {
            for (AudioLayer dispose : this.mLayers) {
                dispose.dispose();
            }
            this.mLayers.clear();
        }
    }

    public boolean enableAEC(boolean z) {
        this.mAudioDeviceModule.enableBuiltInAEC(z);
        return true;
    }

    public boolean enableEcho(boolean z) {
        this.mAudioDeviceModule.enableEchoMode(z);
        return true;
    }

    public IAudioTrack getTrack(String str) {
        return findTrack(str);
    }

    public AudioDeviceControl(AudioDeviceModule audioDeviceModule) {
        this.mAudioDeviceModule = audioDeviceModule;
    }

    private void addTrack(AudioLayer audioLayer) {
        synchronized (this.mLayers) {
            this.mLayers.add(audioLayer);
        }
    }

    public void setOriginTriggering(String str) {
        AudioLayer findTrack = findTrack(str);
        if (findTrack != null) {
            this.mAudioDeviceModule.getRenderMixer().setOriginTrackIndex(findTrack.mTrackId);
        }
    }

    private AudioLayer findTrack(String str) {
        synchronized (this.mLayers) {
            for (AudioLayer audioLayer : this.mLayers) {
                if (audioLayer.name().equals(str)) {
                    return audioLayer;
                }
            }
            return null;
        }
    }

    public void removeTrack(String str) {
        synchronized (this.mLayers) {
            for (AudioLayer name : this.mLayers) {
                if (name.name().equals(str)) {
                    this.mLayers.remove(str);
                }
            }
        }
    }

    public IAudioTrack createTrack(String str, int i, int i2, int i3) {
        if (findTrack(str) != null || str == null) {
            return null;
        }
        AudioLayer audioLayer = new AudioLayer(str, i, i2, i3, this.mAudioDeviceModule.createRenderSink());
        addTrack(audioLayer);
        return audioLayer;
    }
}
