package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.controller.AnchorController;
import com.p683ss.video.rtc.interact.controller.AnchorController.StreamMixer;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.TalkingState;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.core.Anchor */
public class Anchor extends Client {
    private AnchorController mAnchorController;
    public StreamMixer mExternalMixer;

    /* renamed from: com.ss.avframework.livestreamv2.core.Anchor$RegionEx */
    public static class RegionEx extends Region {
        private float mVolumeCoeff = 1.0f;

        public float getVolumeCoeff() {
            return this.mVolumeCoeff;
        }

        public RegionEx volumeCoeff(float f) {
            this.mVolumeCoeff = f;
            return this;
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.Anchor$StreamMixerInternal */
    class StreamMixerInternal implements StreamMixer {
        private StreamMixerInternal() {
        }

        public MixStreamInfo mixStream(int i, int i2, String str, List<String> list, List<TalkingState> list2) {
            if (Anchor.this.mExternalMixer == null) {
                return null;
            }
            MixStreamInfo mixStream = Anchor.this.mExternalMixer.mixStream(i, i2, str, list, list2);
            if (!Anchor.this.mConfig.isEnableMixStream()) {
                return mixStream;
            }
            Anchor.this.mixStream(mixStream);
            return mixStream;
        }
    }

    public boolean isGuest() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void mixStream(MixStreamInfo mixStreamInfo) {
    }

    public void dispose() {
        if (this.mAnchorController != null) {
            this.mAnchorController = null;
        }
        super.dispose();
    }

    public void invalidateSei() {
        if (this.mAnchorController != null) {
            this.mAnchorController.invalidateSei();
        }
    }

    public void pause() {
        if (this.mAnchorController != null) {
            this.mAnchorController.pause();
        }
    }

    public void resume() {
        if (this.mAnchorController != null) {
            this.mAnchorController.resume();
        }
    }

    public void start() {
        if (this.mAnchorController != null) {
            this.mAnchorController.start();
        }
        super.start();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mAnchorController != null) {
            this.mAnchorController.end();
            this.mAnchorController = null;
        }
        super.stop();
        super.dispose();
        super.finalize();
    }

    public void stop() {
        if (this.mAnchorController != null) {
            this.mAnchorController.end();
        }
        super.stop();
        if (this.mAnchorController != null && this.mConfig.isEnableMixStream()) {
            this.mAnchorController.getMixStreamInfo(new Anchor$$Lambda$0(this));
        }
    }

    public void adjustPlaybackSignalVolume(int i) {
        if (this.mAnchorController != null) {
            this.mAnchorController.adjustPlaybackSignalVolume(i);
        }
    }

    public void adjustRecordingSignalVolume(int i) {
        if (this.mAnchorController != null) {
            this.mAnchorController.adjustRecordingSignalVolume(i);
        }
    }

    public void enableAudioVolumeIndication(int i) {
        if (this.mAnchorController != null) {
            this.mAnchorController.enableAudioVolumeIndication(i);
        }
    }

    public void enableLocalAudio(boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.enableLocalAudio(z);
        }
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.muteAllRemoteAudioStreams(z);
        }
    }

    public void switchAudio(boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.switchAudio(z);
        }
    }

    public void muteRemoteAudioStream(String str, boolean z) {
        if (this.mAnchorController != null) {
            this.mAnchorController.muteRemoteAudioStream(str, z);
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ MixStreamInfo lambda$stop$0$Anchor(int i, int i2, String str, List list, List list2) {
        if (this.mExternalMixer != null) {
            mixStream(this.mExternalMixer.mixStream(i, i2, str, new ArrayList(), list2));
        }
        return null;
    }

    public Anchor(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine) {
        super(interactConfig, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, interactEngine);
        this.mExternalMixer = interactConfig.getStreamMixer();
        AnchorController anchorController = new AnchorController(interactConfig, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, new StreamMixerInternal());
        this.mAnchorController = anchorController;
        this.mAnchorController.addQualityCallback(this);
        this.mAnchorController.addStateCallback(this);
        this.mAnchorController.addUserCallback(this);
        this.mAnchorController.addStreamCallback(this);
    }
}
