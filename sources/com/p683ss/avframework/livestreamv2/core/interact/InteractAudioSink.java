package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.IInputAudioStream;
import com.p683ss.avframework.livestreamv2.core.IAudioDeviceControl.IAudioTrack;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.audio.AudioSink;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractAudioSink */
class InteractAudioSink implements AudioSink {
    private IAudioTrack mAudioRender;
    private final int mChannel;
    private IInputAudioStream mOutAudioStream;
    private final int mSample;

    public boolean autoPlay() {
        return false;
    }

    public int getBitWidth() {
        return 16;
    }

    public int getChannelCount() {
        return this.mChannel;
    }

    public int getIntervalMs() {
        return 10;
    }

    /* access modifiers changed from: 0000 */
    public IInputAudioStream getOutAudioStream() {
        return this.mOutAudioStream;
    }

    public int getSampleRate() {
        return this.mSample;
    }

    /* access modifiers changed from: 0000 */
    public void release() {
        synchronized (this) {
            if (this.mOutAudioStream != null) {
                this.mOutAudioStream.stop();
                this.mOutAudioStream.release();
                this.mOutAudioStream = null;
            }
        }
        this.mAudioRender = null;
    }

    InteractAudioSink(InteractEngineBuilder interactEngineBuilder, IAudioTrack iAudioTrack) {
        if (interactEngineBuilder.isClientMixer()) {
            this.mOutAudioStream = interactEngineBuilder.getLiveCore().createInputAudioStream();
            this.mOutAudioStream.start();
            interactEngineBuilder.getLiveCore().startAudioPlayer();
        } else if (interactEngineBuilder.isUsingLiveCoreCapture()) {
            interactEngineBuilder.getLiveCore().startAudioPlayer();
        }
        this.mChannel = interactEngineBuilder.getLiveCoreBuilder().getAudioChannel();
        this.mSample = interactEngineBuilder.getLiveCoreBuilder().getAudioSampleHZ();
        this.mAudioRender = iAudioTrack;
    }

    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3 = byteBuffer;
        byteBuffer.position(0);
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            allocateDirect.position(0);
            allocateDirect.put(byteBuffer);
            byteBuffer2 = allocateDirect;
        } else {
            byteBuffer2 = byteBuffer3;
        }
        long j2 = j * 1000;
        if (this.mAudioRender != null) {
            this.mAudioRender.onData(byteBuffer2, i2, i3, i, j2 * 1000);
        }
        if (this.mOutAudioStream != null) {
            synchronized (this) {
                IInputAudioStream iInputAudioStream = this.mOutAudioStream;
                AVLog.logToIODevice2(4, "InteractAudioSink", "onPlaybackAudioFrame", null, "Client.java:onPlaybackAudioFrame", 10000);
                if (iInputAudioStream != null) {
                    iInputAudioStream.pushAudioFrame(byteBuffer, i2, i3, 16, i * i3, j2);
                }
            }
        }
    }
}
