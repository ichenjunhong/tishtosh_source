package com.p683ss.ttvideoengine.utils;

import android.os.SystemClock;

/* renamed from: com.ss.ttvideoengine.utils.PlayDuration */
public class PlayDuration {
    private int STATE_PLAYING = 1;
    private int STATE_STOPING = 2;
    private int mPlayedDuration;
    private long mStartPlayTime;
    private int mState = this.STATE_STOPING;

    public void clear() {
        this.mPlayedDuration = 0;
        if (this.mState == this.STATE_PLAYING) {
            this.mStartPlayTime = SystemClock.elapsedRealtime();
        }
    }

    public void reset() {
        this.mState = this.STATE_STOPING;
        this.mPlayedDuration = 0;
        this.mStartPlayTime = 0;
    }

    public int getPlayedDuration() {
        if (this.mState == this.STATE_PLAYING) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.mStartPlayTime);
            if (i >= 0) {
                this.mPlayedDuration += i;
            }
            this.mStartPlayTime = elapsedRealtime;
        }
        return this.mPlayedDuration;
    }

    public void start() {
        if (this.mState == this.STATE_STOPING) {
            this.mState = this.STATE_PLAYING;
            this.mStartPlayTime = SystemClock.elapsedRealtime();
        }
    }

    public void stop() {
        if (this.mState == this.STATE_PLAYING) {
            this.mState = this.STATE_STOPING;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.mStartPlayTime);
            if (elapsedRealtime >= 0) {
                this.mPlayedDuration += elapsedRealtime;
            }
        }
    }
}
