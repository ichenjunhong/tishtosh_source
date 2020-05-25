package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.p683ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack;
import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.video.rtc.interact.audio.AudioSink;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioSinkFactory */
class InteractAudioSinkFactory implements AudioSinkFactory {
    private IAudioTrack mAudioRender;
    private InteractAudioSink mAudioSink;
    private final InteractEngineBuilder mBuilder;
    private final InteractEngine mEngine;

    /* access modifiers changed from: 0000 */
    public InteractAudioSink getAudioSink() {
        return this.mAudioSink;
    }

    public AudioSink create() {
        this.mAudioSink = new InteractAudioSink(this.mBuilder, this.mAudioRender);
        return this.mAudioSink;
    }

    /* access modifiers changed from: 0000 */
    public String getAudioRenderName() {
        if (this.mAudioRender != null) {
            return this.mAudioRender.name();
        }
        return "";
    }

    public void release() {
        if (this.mAudioRender != null) {
            this.mAudioRender.dispose();
            this.mAudioRender = null;
        }
    }

    public void destroy(AudioSink audioSink) {
        if (audioSink == null) {
            throw new IllegalStateException("InteractAudioSink bug on destroy");
        } else if (this.mAudioSink != null) {
            this.mAudioSink.release();
            this.mAudioSink = null;
        }
    }

    public InteractAudioSinkFactory(InteractEngineBuilder interactEngineBuilder, InteractEngine interactEngine) {
        this.mBuilder = interactEngineBuilder;
        this.mEngine = interactEngine;
        IAudioDeviceControl audioDeviceControl = interactEngineBuilder.getLiveCore().getAudioDeviceControl();
        if (audioDeviceControl != null) {
            this.mAudioRender = audioDeviceControl.createTrack(InteractEngine.AUDIO_LAYER_NAME, interactEngineBuilder.getLiveCoreBuilder().getAudioSampleHZ(), interactEngineBuilder.getLiveCoreBuilder().getAudioChannel(), 16);
            this.mAudioRender.setVolume(1.0f);
        }
    }
}
