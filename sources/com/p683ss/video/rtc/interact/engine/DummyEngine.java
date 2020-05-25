package com.p683ss.video.rtc.interact.engine;

import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.callback.EngineCallback;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.ArrayList;

/* renamed from: com.ss.video.rtc.interact.engine.DummyEngine */
public class DummyEngine extends Engine {
    private EngineCallback mEngineCallback;

    public void adjustPlaybackSignalVolume(int i) {
    }

    public void adjustRecordingSignalVolume(int i) {
    }

    public void enableAudio() {
    }

    public void enableAudioVolumeIndication(int i) {
    }

    public void enableLocalAudio(boolean z) {
    }

    /* access modifiers changed from: protected */
    public String getVendor() {
        return "dummy";
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoRenderFpsReport() {
        return null;
    }

    public void mixStream(MixStreamInfo mixStreamInfo, boolean z) {
    }

    public void muteAllRemoteAudioStreams(boolean z) {
    }

    public void muteRemoteAudioStream(String str, boolean z) {
    }

    public void pause() {
    }

    public void resume() {
    }

    public void stop() {
    }

    public void switchAudio(boolean z) {
    }

    public void init() {
        if (this.mEngineCallback != null) {
            this.mEngineCallback.onInitFailed(-1, "Current is dummy engine.");
        }
    }

    public void start() {
        if (this.mEngineCallback != null) {
            this.mEngineCallback.onStartFailed(-1, "Current is dummy engine.");
        }
    }

    DummyEngine(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, EngineCallback engineCallback) {
        super(config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, engineCallback);
        this.mEngineCallback = engineCallback;
    }
}
