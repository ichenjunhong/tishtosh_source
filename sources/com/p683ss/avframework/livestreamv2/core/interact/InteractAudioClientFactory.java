package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.core.InteractEngine;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.audio.AudioClient;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioClientFactory */
class InteractAudioClientFactory implements AudioClientFactory {
    InteractEngine mEngine;

    public AudioClient create() {
        AVLog.m110007d("InteractAudioClientFactory", "Create audio client ");
        Builder liveCoreBuilder = this.mEngine.getBuilder().getLiveCoreBuilder();
        if (liveCoreBuilder == null) {
            return null;
        }
        InteractAudioClient interactAudioClient = new InteractAudioClient(liveCoreBuilder.getAudioChannel(), liveCoreBuilder.getAudioSampleHZ());
        this.mEngine.addAudioFrameAvailableListener(interactAudioClient);
        return interactAudioClient;
    }

    public InteractAudioClientFactory(InteractEngine interactEngine) {
        this.mEngine = interactEngine;
    }

    public void destroy(AudioClient audioClient) {
        AVLog.m110007d("InteractAudioClientFactory", "Destroy audio client ");
        this.mEngine.removeAudioFrameAvailableListener((InteractAudioClient) audioClient);
    }
}
