package com.p683ss.avframework.livestreamv2.core.interact;

import android.util.AndroidRuntimeException;
import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.audio.AudioCallback;
import com.p683ss.video.rtc.interact.audio.AudioClient;
import java.nio.Buffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioClient */
class InteractAudioClient implements IAudioFrameAvailableListener, AudioClient {
    private AudioCallback mAudioCallback;
    private int mChannel;
    private long mLastLogTime;
    private int mSampleHz;
    private boolean mStart;

    public int getBitWidth() {
        return 16;
    }

    public void start() {
        this.mStart = true;
    }

    public void stop() {
        this.mStart = false;
    }

    public int getChannelCount() {
        int i;
        synchronized (this) {
            i = this.mChannel;
        }
        return i;
    }

    public int getSampleRate() {
        int i;
        synchronized (this) {
            i = this.mSampleHz;
        }
        return i;
    }

    public void release() {
        synchronized (this) {
            this.mAudioCallback = null;
        }
    }

    public void prepare(AudioCallback audioCallback) {
        this.mAudioCallback = audioCallback;
    }

    public InteractAudioClient(int i, int i2) {
        this.mChannel = i;
        this.mSampleHz = i2;
    }

    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        synchronized (this) {
            if (this.mStart && this.mAudioCallback != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.mLastLogTime > 10000) {
                    StringBuilder sb = new StringBuilder("Input interact audio frame: sample_rate ");
                    sb.append(i2);
                    sb.append(", channel ");
                    sb.append(i3);
                    AVLog.ioi("InteractAudioClient", sb.toString());
                    this.mLastLogTime = currentTimeMillis;
                }
                if (getChannelCount() == i3 && getSampleRate() == i2) {
                    this.mAudioCallback.updateAudioFrame(buffer, i, j);
                } else {
                    throw new AndroidRuntimeException("Interact client BUG!");
                }
            }
        }
    }
}
