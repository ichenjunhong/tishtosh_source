package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.avframework.livestreamv2.IInputAudioStream;
import com.p683ss.avframework.livestreamv2.IInputVideoStream;
import com.p683ss.avframework.livestreamv2.core.Anchor;
import com.p683ss.avframework.livestreamv2.core.Anchor.RegionEx;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.LiveCore;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.mixer.AudioMixer.AudioMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.AnchorInternal */
class AnchorInternal extends Anchor {
    private InteractEngineBuilder mBuilder;
    private ClientFactory mClientFactory;
    private boolean mDispose;

    public void dispose() {
        if (this.mClientFactory.removeClient(this)) {
            superDispose();
        }
    }

    public void pause() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.pause();
            }
        });
    }

    public void resume() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.resume();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void superDispose() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.dispose();
            }
        });
    }

    public void clearSei() {
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (liveCore != null) {
            liveCore.addSeiField("app_data", null, -1);
            liveCore.addSeiField("canvas", null, -1);
            liveCore.addSeiField("source", null, -1);
        }
    }

    public void start() {
        this.mClientFactory.start(this);
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.start();
            }
        });
    }

    public void stop() {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.stop();
                if (AnchorInternal.this.mConfig.isClientMixStream()) {
                    AnchorInternal.this.clearSei();
                }
            }
        });
        this.mClientFactory.stop(this);
    }

    private String getVendorString() {
        switch (this.mConfig.getVendor()) {
            case AGORA:
                return "agora";
            case ZEGO:
                return "zego";
            case BYTE:
                return "byte";
            default:
                return "unknown";
        }
    }

    public void adjustPlaybackSignalVolume(final int i) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.adjustPlaybackSignalVolume(i);
            }
        });
    }

    public void adjustRecordingSignalVolume(final int i) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.adjustRecordingSignalVolume(i);
            }
        });
    }

    public void enableAudioVolumeIndication(final int i) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.enableAudioVolumeIndication(i);
            }
        });
    }

    public void muteAllRemoteAudioStreams(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.muteAllRemoteAudioStreams(z);
            }
        });
    }

    public void switchAudio(final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.switchAudio(z);
            }
        });
    }

    private void composeSei(JSONObject jSONObject) {
        String str;
        try {
            LiveCore liveCore = this.mBuilder.getLiveCore();
            if (liveCore != null) {
                if (this.mConfig.getMixStreamConfig() != null) {
                    liveCore.addSeiField("canvas", new JSONObject().put("w", this.mConfig.getMixStreamConfig().getVideoWidth()).put("h", this.mConfig.getMixStreamConfig().getVideoHeight()).put("bgnd", this.mConfig.getMixStreamConfig().getBackgroundColorString()), -1);
                }
                String str2 = "app_data";
                if (jSONObject != null) {
                    str = jSONObject.toString();
                } else {
                    str = null;
                }
                liveCore.addSeiField(str2, str, -1);
                StringBuilder sb = new StringBuilder("LiveCore_Android_MixStream_");
                sb.append(getVendorString());
                liveCore.addSeiField("source", sb.toString(), -1);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: mixStream */
    public void lambda$mixStream$0$AnchorInternal(MixStreamInfo mixStreamInfo) {
        String str;
        int i;
        int i2;
        if (Thread.currentThread() != this.mBuilder.getWorkThreadHandler().getLooper().getThread()) {
            this.mBuilder.getWorkThreadHandler().post(new AnchorInternal$$Lambda$0(this, mixStreamInfo));
            return;
        }
        LiveCore liveCore = this.mBuilder.getLiveCore();
        if (this.mConfig.isClientMixStream() && liveCore != null && mixStreamInfo != null) {
            List<Region> regions = mixStreamInfo.getRegions();
            if (regions == null || regions.size() == 0) {
                String str2 = "AnchorInternal";
                StringBuilder sb = new StringBuilder("regions is ");
                if (regions == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                } else {
                    str = "empty";
                }
                sb.append(str);
                AVLog.ioe(str2, sb.toString());
                return;
            }
            composeSei(mixStreamInfo.getAppData());
            IInputVideoStream iInputVideoStream = null;
            IInputAudioStream iInputAudioStream = null;
            boolean z = false;
            int i3 = 0;
            for (Region region : regions) {
                boolean z2 = true;
                if (region.getInteractId().equals(this.mConfig.getInteractId().toString())) {
                    IInputVideoStream originInputVideoStream = liveCore.getOriginInputVideoStream();
                    iInputAudioStream = liveCore.getOriginInputAudioStream();
                    iInputVideoStream = originInputVideoStream;
                    z = true;
                } else {
                    InteractVideoSink videoSink = ((InteractVideoSinkFactory) this.mVideoSinkFactory).getVideoSink(region.getInteractId());
                    if (videoSink != null) {
                        iInputVideoStream = videoSink.getOutVideoStream();
                    }
                    InteractAudioSink audioSink = ((InteractAudioSinkFactory) this.mAudioSinkFactory).getAudioSink();
                    if (audioSink != null) {
                        iInputAudioStream = audioSink.getOutAudioStream();
                    }
                    z2 = false;
                }
                if (iInputVideoStream != null) {
                    VideoMixerDescription mixerDescription = iInputVideoStream.getMixerDescription();
                    if (mixerDescription != null) {
                        mixerDescription.left = (float) region.getX();
                        mixerDescription.top = (float) region.getY();
                        mixerDescription.right = mixerDescription.left + ((float) region.getWidth());
                        mixerDescription.bottom = mixerDescription.top + ((float) region.getHeight());
                        if (z2) {
                            i = i3;
                            i2 = 0;
                        } else {
                            i2 = i3 + 1;
                            i = i2;
                        }
                        mixerDescription.zOrder = i2;
                        mixerDescription.setMode(2);
                        iInputVideoStream.setMixerDescription(mixerDescription);
                        i3 = i;
                    }
                }
                if (iInputAudioStream != null && (region instanceof RegionEx)) {
                    AudioMixerDescription mixerDescription2 = iInputAudioStream.getMixerDescription();
                    if (mixerDescription2 != null) {
                        mixerDescription2.volumeCoeff = ((RegionEx) region).getVolumeCoeff();
                        iInputAudioStream.setMixerDescription(mixerDescription2);
                    }
                }
            }
            if (!z) {
                AVLog.ioe("AnchorInternal", "Didn't find my region.");
            }
        }
    }

    public void muteRemoteAudioStream(final String str, final boolean z) {
        this.mBuilder.getWorkThreadHandler().post(new Runnable() {
            public void run() {
                AnchorInternal.super.muteRemoteAudioStream(str, z);
            }
        });
    }

    public void onUserJoined(String str, int i) {
        this.mClientFactory.onUserJoin(this, str);
        super.onUserJoined(str, i);
    }

    public void onUserLeaved(String str, int i) {
        this.mClientFactory.onUserLeaved(this, str);
        super.onUserLeaved(str, i);
    }

    public void onLogMonitor(String str, JSONObject jSONObject) {
        super.onLogMonitor(str, jSONObject);
        if (this.mClientFactory.mLogMonitor != null) {
            this.mClientFactory.mLogMonitor.onLogMonitor(str, jSONObject);
        }
    }

    public AnchorInternal(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory, InteractEngine interactEngine, ClientFactory clientFactory) {
        super(interactConfig, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, interactEngine);
        this.mBuilder = interactEngine.getBuilder();
        this.mClientFactory = clientFactory;
    }
}
