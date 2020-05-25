package com.p683ss.avframework.livestreamv2.audioeffect;

import com.p683ss.avframework.engine.AudioProcessor;
import com.p683ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor */
public abstract class AudioEffectProcessor extends AudioProcessor {

    /* renamed from: com.ss.avframework.livestreamv2.audioeffect.AudioEffectProcessor$Callback */
    public interface Callback {
        void onProgress(long j);

        void start();

        void stop();
    }

    public void getScoreInfo(double[] dArr) {
    }

    public TEBundle getStreamInfo() {
        return null;
    }

    public void pause() {
    }

    public void resume() {
    }

    public void seekSingScoring() {
    }

    public abstract void setAudioEq(Object obj);

    public abstract void setAudioReverb(Object obj);

    public abstract void setBGMMusic(String str);

    public abstract void setBGMMusic(String str, long j);

    public abstract void setBGMProgressListener(Callback callback);

    public abstract void setBGMVolume(float f);

    public abstract void setDRCEnable(boolean z);

    public abstract void setEchoMode(boolean z);

    public abstract void setLoopEnable(boolean z);

    public abstract void setMixerEnable(boolean z);

    public abstract void setMusicPitch(int i);

    public abstract void setOriginEnable(boolean z);

    public int setScoringSources(String str, int[] iArr) {
        return -1;
    }

    public abstract void setVoiceVolume(float f);
}
