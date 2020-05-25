package com.p683ss.avframework.livestreamv2;

import com.p683ss.avframework.engine.AudioSink;
import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.AudioFrameAvailableSink */
public class AudioFrameAvailableSink extends AudioSink {
    private final Object mFence = new Object();
    private List<IAudioFrameAvailableListener> mListeners = new ArrayList();
    private List<IAudioFrameAvailableListener> mListenersToBeAdded = new ArrayList();
    private List<IAudioFrameAvailableListener> mListenersToBeRemoved = new ArrayList();

    public void onNoData() {
    }

    public void addListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mFence) {
            this.mListenersToBeRemoved.remove(iAudioFrameAvailableListener);
            if (!this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeAdded.contains(iAudioFrameAvailableListener)) {
                this.mListenersToBeAdded.add(iAudioFrameAvailableListener);
            }
        }
    }

    public void removeListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mFence) {
            this.mListenersToBeAdded.remove(iAudioFrameAvailableListener);
            if (this.mListeners.contains(iAudioFrameAvailableListener) && !this.mListenersToBeRemoved.contains(iAudioFrameAvailableListener)) {
                this.mListenersToBeRemoved.add(iAudioFrameAvailableListener);
            }
        }
    }

    public void onData(Buffer buffer, int i, int i2, int i3, long j) {
        synchronized (this.mFence) {
            if (!this.mListenersToBeAdded.isEmpty()) {
                this.mListeners.addAll(this.mListenersToBeAdded);
                this.mListenersToBeAdded.clear();
            }
            if (!this.mListenersToBeRemoved.isEmpty()) {
                this.mListeners.removeAll(this.mListenersToBeRemoved);
                this.mListenersToBeRemoved.clear();
            }
        }
        for (IAudioFrameAvailableListener iAudioFrameAvailableListener : this.mListeners) {
            if (iAudioFrameAvailableListener != null) {
                buffer.position(0);
                iAudioFrameAvailableListener.onAudioFrameAvailable(buffer, i, i2, i3, j);
            }
        }
    }
}
