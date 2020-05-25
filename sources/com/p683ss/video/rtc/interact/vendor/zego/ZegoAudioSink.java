package com.p683ss.video.rtc.interact.vendor.zego;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.video.rtc.interact.audio.AudioSink;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.audio.PcmPlayer;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.zego.zegoavkit2.audiodevice.ZegoExternalAudioDevice;
import com.zego.zegoavkit2.entities.ZegoAudioFrame;
import java.nio.ByteBuffer;

/* renamed from: com.ss.video.rtc.interact.vendor.zego.ZegoAudioSink */
public class ZegoAudioSink {
    private boolean bPlay;
    public boolean inited;
    private AudioSink mAudioSink;
    private AudioSinkFactory mAudioSinkFactory;
    private int mChannelCount;
    public long mFetchCount;
    private ZegoAudioFrame mFrame;
    public int mIntervalMs;
    private PcmPlayer mPlayer;
    private int mSampleRate;
    public long mStartTimeMs;
    public boolean started;
    private Thread thread;

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
            ZegoExternalAudioDevice.startRender();
            this.started = true;
            this.thread = new Thread(new Runnable() {
                public void run() {
                    while (ZegoAudioSink.this.inited && ZegoAudioSink.this.started) {
                        if (ZegoAudioSink.this.mStartTimeMs == 0) {
                            ZegoAudioSink.this.mStartTimeMs = System.currentTimeMillis();
                        }
                        ZegoAudioSink.this.FetchAudioFrame(ZegoAudioSink.this.mStartTimeMs + (ZegoAudioSink.this.mFetchCount * ((long) ZegoAudioSink.this.mIntervalMs)));
                        ZegoAudioSink.this.mFetchCount++;
                        long currentTimeMillis = (ZegoAudioSink.this.mStartTimeMs + (ZegoAudioSink.this.mFetchCount * ((long) ZegoAudioSink.this.mIntervalMs))) - System.currentTimeMillis();
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
            ZegoExternalAudioDevice.stopRender();
            if (this.mPlayer != null) {
                this.mPlayer.release();
                this.mPlayer = null;
            }
        }
    }

    public ZegoAudioSink(AudioSinkFactory audioSinkFactory) {
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

    public void FetchAudioFrame(long j) {
        if (this.mFrame == null) {
            this.mFrame = new ZegoAudioFrame();
            this.mFrame.frameType = 4097;
            this.mFrame.samples = (this.mIntervalMs * this.mSampleRate) / 1000;
            this.mFrame.bytesPerSample = this.mChannelCount * 2;
            this.mFrame.channels = this.mChannelCount;
            this.mFrame.sampleRate = this.mSampleRate;
            this.mFrame.timeStamp = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            this.mFrame.configLen = 0;
            this.mFrame.bufLen = this.mFrame.samples * this.mFrame.bytesPerSample;
            this.mFrame.buffer = ByteBuffer.allocateDirect(this.mFrame.bufLen);
        }
        this.mFrame.buffer.clear();
        if (!ZegoExternalAudioDevice.onPlaybackAudioFrame(this.mFrame)) {
            LogUtil.m110874w("ZegoAudioSink", "ZegoExternalAudioDevice.onPlaybackAudioFrame returns falseZegoAudioSink  10000");
        }
        if (this.mAudioSink != null) {
            this.mAudioSink.onPlaybackAudioFrame(this.mFrame.buffer, this.mFrame.samples, this.mSampleRate, this.mFrame.channels, j);
        }
        if (this.bPlay) {
            this.mFrame.buffer.position(0);
            this.mFrame.buffer.limit(this.mFrame.bufLen);
            if (this.mPlayer == null) {
                this.mPlayer = new PcmPlayer(this.mSampleRate, this.mChannelCount);
            }
            if (this.mPlayer.isInited()) {
                this.mPlayer.playPcmData(this.mFrame.buffer);
            }
        }
    }

    public ZegoAudioSink(int i, int i2, int i3) {
        this.mSampleRate = i;
        this.mChannelCount = i2;
        this.mIntervalMs = i3;
        this.bPlay = true;
        this.inited = true;
    }
}
