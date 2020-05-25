package com.p683ss.video.rtc.interact.vendor.bytertc;

import com.p683ss.video.rtc.engine.RtcEngine;
import com.p683ss.video.rtc.interact.audio.AudioSink;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.audio.PcmPlayer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteAudioSink */
public class ByteAudioSink {
    private boolean bBufferCleared;
    private boolean bPlay;
    public boolean inited;
    private AudioSink mAudioSink;
    private AudioSinkFactory mAudioSinkFactory;
    private byte[] mBuffer;
    private int mChannelCount = 1;
    private RtcEngine mEngine;
    public long mFetchCount;
    public int mIntervalMs = 10;
    private PcmPlayer mPlayer;
    private int mSampleRate = 16000;
    public long mStartTimeMs;
    private boolean sdkStarted;
    public boolean started;
    private Thread thread;

    public void onAudioDevicePlayoutStart() {
        this.sdkStarted = true;
    }

    public void onAudioDevicePlayoutStop() {
        this.sdkStarted = false;
    }

    public void release() {
        this.inited = false;
        this.started = false;
        if (this.thread != null) {
            try {
                this.thread.join(300);
            } catch (InterruptedException unused) {
            }
            this.thread = null;
        }
        if (this.mAudioSinkFactory != null && this.mAudioSink != null) {
            this.mAudioSinkFactory.destroy(this.mAudioSink);
            this.mAudioSink = null;
        }
    }

    public void start() {
        if (this.inited && !this.started) {
            this.started = true;
            this.thread = new Thread(new Runnable() {
                public void run() {
                    while (ByteAudioSink.this.inited && ByteAudioSink.this.started) {
                        if (ByteAudioSink.this.mStartTimeMs == 0) {
                            ByteAudioSink.this.mStartTimeMs = System.currentTimeMillis();
                        }
                        ByteAudioSink.this.FetchAudioFrame(ByteAudioSink.this.mStartTimeMs + (ByteAudioSink.this.mFetchCount * ((long) ByteAudioSink.this.mIntervalMs)));
                        ByteAudioSink.this.mFetchCount++;
                        long currentTimeMillis = (ByteAudioSink.this.mStartTimeMs + (ByteAudioSink.this.mFetchCount * ((long) ByteAudioSink.this.mIntervalMs))) - System.currentTimeMillis();
                        if (currentTimeMillis > 0) {
                            try {
                                Thread.sleep(currentTimeMillis);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            });
            this.thread.setName("ZegoFetchAudioThread");
            this.thread.start();
        }
    }

    public void stop() {
        if (this.inited && this.started) {
            this.started = false;
            try {
                this.thread.join(300);
            } catch (InterruptedException unused) {
            }
            this.thread = null;
            if (this.mPlayer != null) {
                this.mPlayer.release();
                this.mPlayer = null;
            }
        }
    }

    public void FetchAudioFrame(long j) {
        int i = (this.mSampleRate * this.mIntervalMs) / 1000;
        int i2 = this.mChannelCount * i * 2;
        if (this.mBuffer == null || this.mBuffer.length < i2) {
            this.mBuffer = new byte[i2];
            this.bBufferCleared = true;
        }
        if (this.sdkStarted) {
            this.mEngine.pullExternalAudioFrame(this.mBuffer, i);
            this.bBufferCleared = false;
        } else if (!this.bBufferCleared) {
            Arrays.fill(this.mBuffer, 0);
            this.bBufferCleared = true;
        }
        if (this.mAudioSink != null) {
            this.mAudioSink.onPlaybackAudioFrame(ByteBuffer.wrap(this.mBuffer), i, this.mSampleRate, this.mChannelCount, j);
        }
        if (this.bPlay) {
            if (this.mPlayer == null) {
                this.mPlayer = new PcmPlayer(this.mSampleRate, this.mChannelCount);
            }
            if (this.mPlayer.isInited()) {
                this.mPlayer.playPcmData(this.mBuffer, 0, i2);
            }
        }
    }

    public ByteAudioSink(AudioSinkFactory audioSinkFactory, RtcEngine rtcEngine) {
        this.mEngine = rtcEngine;
        this.mAudioSinkFactory = audioSinkFactory;
        this.mAudioSink = this.mAudioSinkFactory.create();
        if (this.mAudioSink != null) {
            this.mSampleRate = this.mAudioSink.getSampleRate();
            this.mChannelCount = this.mAudioSink.getChannelCount();
            this.mIntervalMs = this.mAudioSink.getIntervalMs();
            this.bPlay = this.mAudioSink.autoPlay();
            this.inited = true;
        }
    }

    public ByteAudioSink(RtcEngine rtcEngine, int i, int i2, int i3) {
        this.mEngine = rtcEngine;
        this.mSampleRate = i;
        this.mChannelCount = i2;
        this.mIntervalMs = i3;
        this.bPlay = true;
        this.inited = true;
    }
}
