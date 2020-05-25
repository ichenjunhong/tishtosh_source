package com.p683ss.avframework.livestreamv2.core.interact;

import android.os.Handler;
import com.p683ss.avframework.livestreamv2.core.Guest;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.GuestInternal */
class GuestInternal extends Guest {
    private ClientFactory mFactory;
    private final Handler mWorkThreadHandler;

    public void pause() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.pause();
            }
        });
    }

    public void resume() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.resume();
            }
        });
    }

    public void start() {
        this.mFactory.start(this);
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.start();
            }
        });
    }

    public void stop() {
        this.mFactory.stop(this);
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.stop();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void superDispose() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.dispose();
            }
        });
    }

    public synchronized void dispose() {
        if (this.mFactory.removeClient(this)) {
            superDispose();
        }
    }

    public void adjustPlaybackSignalVolume(final int i) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.adjustPlaybackSignalVolume(i);
            }
        });
    }

    public void adjustRecordingSignalVolume(final int i) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.adjustRecordingSignalVolume(i);
            }
        });
    }

    public void enableAudioVolumeIndication(final int i) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.enableAudioVolumeIndication(i);
            }
        });
    }

    public void muteAllRemoteAudioStreams(final boolean z) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.muteAllRemoteAudioStreams(z);
            }
        });
    }

    public void switchAudio(final boolean z) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.switchAudio(z);
            }
        });
    }

    public void muteRemoteAudioStream(final String str, final boolean z) {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                GuestInternal.super.muteRemoteAudioStream(str, z);
            }
        });
    }

    public void onUserJoined(String str, int i) {
        this.mFactory.onUserJoin(this, str);
        super.onUserJoined(str, i);
    }

    public void onUserLeaved(String str, int i) {
        this.mFactory.onUserLeaved(this, str);
        super.onUserLeaved(str, i);
    }

    public void onLogMonitor(String str, JSONObject jSONObject) {
        ClientFactory clientFactory = this.mFactory;
        if (!(clientFactory == null || clientFactory.mLogMonitor == null)) {
            this.mFactory.mLogMonitor.onLogMonitor(str, jSONObject);
        }
        super.onLogMonitor(str, jSONObject);
    }

    public GuestInternal(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine, ClientFactory clientFactory) {
        super(interactConfig, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, interactEngine);
        this.mWorkThreadHandler = interactEngine.getBuilder().getWorkThreadHandler();
        this.mFactory = clientFactory;
    }
}
