package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.engine.AudioSink;
import com.p683ss.avframework.engine.VideoSink;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt */
public abstract class IGameEngineExt implements IGameEngine {

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$GameAudioConsumer */
    public static class GameAudioConsumer extends AudioSink {
        public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        }

        public void onNoData() {
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$GameVideoConsumer */
    public static class GameVideoConsumer extends VideoSink {
        public void OnDiscardedFrame() {
        }

        public void onFrame(VideoFrame videoFrame) {
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngineExt$GameVideoSink */
    public abstract class GameVideoSink extends VideoSink {
        public abstract void onVideoFrame(int i, VideoFrame videoFrame, int i2);

        public abstract void onVideoFrame(int i, VideoMixerTexture videoMixerTexture, ByteBuffer byteBuffer);

        public GameVideoSink() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract String getVersion();

    public abstract GameVideoSink getVideoSink();

    public abstract void release();

    public abstract void setGameCallback(GameVideoConsumer gameVideoConsumer, GameAudioConsumer gameAudioConsumer);

    public abstract void setInteractEngine(InteractEngine interactEngine);

    public abstract void setupLogServer(LiveStreamGameLogService liveStreamGameLogService);
}
