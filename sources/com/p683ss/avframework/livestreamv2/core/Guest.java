package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.controller.GuestController;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;

/* renamed from: com.ss.avframework.livestreamv2.core.Guest */
public class Guest extends Client {
    private GuestController mGuestController;

    public boolean isGuest() {
        return true;
    }

    public synchronized void dispose() {
        if (this.mGuestController != null) {
            this.mGuestController = null;
        }
        super.dispose();
    }

    public void pause() {
        if (this.mGuestController != null) {
            this.mGuestController.pause();
        }
    }

    public void resume() {
        if (this.mGuestController != null) {
            this.mGuestController.resume();
        }
    }

    public void start() {
        if (this.mGuestController != null) {
            this.mGuestController.start();
        }
        super.start();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (this.mGuestController != null) {
            this.mGuestController.end();
            this.mGuestController = null;
        }
        super.stop();
        super.dispose();
        super.finalize();
    }

    public synchronized void stop() {
        if (this.mGuestController != null) {
            this.mGuestController.end();
        }
        super.stop();
    }

    public void adjustPlaybackSignalVolume(int i) {
        if (this.mGuestController != null) {
            this.mGuestController.adjustPlaybackSignalVolume(i);
        }
    }

    public void adjustRecordingSignalVolume(int i) {
        if (this.mGuestController != null) {
            this.mGuestController.adjustRecordingSignalVolume(i);
        }
    }

    public void enableAudioVolumeIndication(int i) {
        if (this.mGuestController != null) {
            this.mGuestController.enableAudioVolumeIndication(i);
        }
    }

    public void enableLocalAudio(boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.enableLocalAudio(z);
        }
    }

    public void muteAllRemoteAudioStreams(boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.muteAllRemoteAudioStreams(z);
        }
    }

    public void switchAudio(boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.switchAudio(z);
        }
    }

    public void muteRemoteAudioStream(String str, boolean z) {
        if (this.mGuestController != null) {
            this.mGuestController.muteRemoteAudioStream(str, z);
        }
    }

    public Guest(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine) {
        super(interactConfig, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, interactEngine);
        GuestController guestController = new GuestController(interactConfig, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory);
        this.mGuestController = guestController;
        this.mGuestController.addQualityCallback(this);
        this.mGuestController.addStateCallback(this);
        this.mGuestController.addUserCallback(this);
        this.mGuestController.addStreamCallback(this);
    }
}
