package com.p683ss.video.rtc.interact.controller;

import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.TalkingState;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.video.rtc.interact.controller.AnchorController */
public class AnchorController extends BaseController {
    private boolean autoUpdateSei;
    public StreamMixer mStreamMixer;

    /* renamed from: com.ss.video.rtc.interact.controller.AnchorController$StreamMixer */
    public interface StreamMixer {
        MixStreamInfo mixStream(int i, int i2, String str, List<String> list, List<TalkingState> list2);
    }

    public void invalidateSei() {
        mixStream();
    }

    private void mixStream() {
        if (this.mConfig != null && this.mConfig.isEnableMixStream()) {
            this.mMainThreadHandler.post(new Runnable() {
                public void run() {
                    if (AnchorController.this.mState == State.STARTED) {
                        AnchorController.this.mEngine.mixStream(AnchorController.this.getMixStreamInfo(AnchorController.this.mStreamMixer));
                    }
                }
            });
        }
    }

    public void setAutoUpdateSei(boolean z) {
        this.autoUpdateSei = z;
    }

    public void onStartSuccess(int i) {
        super.onStartSuccess(i);
        if (this.mEngine != null) {
            this.mEngine.setMixStreamer(this.mStreamMixer);
        }
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public MixStreamInfo getMixStreamInfo(StreamMixer streamMixer) {
        String str;
        LinkedList linkedList = new LinkedList();
        for (String str2 : this.mEngine.getGuestList()) {
            linkedList.add(str2.toString());
        }
        if (streamMixer == null) {
            return null;
        }
        int outputWidth = this.mEngine.getOutputWidth();
        int outputHeight = this.mEngine.getOutputHeight();
        if (this.mEngine.getAnchor() == null) {
            str = "";
        } else {
            str = this.mEngine.getAnchor().toString();
        }
        return streamMixer.mixStream(outputWidth, outputHeight, str, linkedList, this.mEngine.getTalkingStateList());
    }

    public synchronized void muteRemoteAudioStream(String str, boolean z) {
        super.muteRemoteAudioStream(str, z);
        mixStream();
    }

    public void onUserJoined(String str, int i) {
        super.onUserJoined(str, i);
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public void onUserLeaved(String str, int i) {
        super.onUserLeaved(str, i);
        if (this.autoUpdateSei) {
            mixStream();
        }
    }

    public AnchorController(Config config, VideoClientFactory videoClientFactory, StreamMixer streamMixer) {
        this(config, videoClientFactory, null, null, null, streamMixer);
    }

    public AnchorController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, StreamMixer streamMixer) {
        super(config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory);
        this.autoUpdateSei = true;
        this.mStreamMixer = streamMixer;
    }
}
