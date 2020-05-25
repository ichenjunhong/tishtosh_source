package com.p683ss.video.rtc.interact.controller;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.p683ss.video.rtc.interact.audio.AudioClientFactory;
import com.p683ss.video.rtc.interact.audio.AudioSinkFactory;
import com.p683ss.video.rtc.interact.callback.EngineCallback;
import com.p683ss.video.rtc.interact.callback.QualityCallback;
import com.p683ss.video.rtc.interact.callback.StateCallback;
import com.p683ss.video.rtc.interact.callback.StreamCallback;
import com.p683ss.video.rtc.interact.callback.UserCallback;
import com.p683ss.video.rtc.interact.engine.Engine;
import com.p683ss.video.rtc.interact.engine.EngineFactory;
import com.p683ss.video.rtc.interact.model.Config;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoClientFactory;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.video.rtc.interact.controller.BaseController */
public abstract class BaseController implements Callback, EngineCallback {
    protected Config mConfig;
    private boolean mEnableLocalAudio = true;
    private boolean mEnableLocalAudioShouldCall;
    Engine mEngine;
    private long mLastStreamDelayCallbackTime;
    Handler mMainThreadHandler;
    public List<QualityCallback> mQualityCallbacks = new ArrayList();
    volatile State mState;
    public List<StateCallback> mStateCallbacks = new ArrayList();
    private List<StreamCallback> mStreamCallbacks = new ArrayList();
    public List<UserCallback> mUserCallbacks = new ArrayList();

    /* renamed from: com.ss.video.rtc.interact.controller.BaseController$State */
    enum State {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        STARTING,
        STARTED,
        STOPPING,
        DESTROYING
    }

    public boolean handleMessage(Message message) {
        return false;
    }

    public void onConnectionInterrupted() {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (QualityCallback onConnectionInterrupted : BaseController.this.mQualityCallbacks) {
                    onConnectionInterrupted.onConnectionInterrupted();
                }
            }
        });
    }

    public void onConnectionLost() {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (QualityCallback onConnectionLost : BaseController.this.mQualityCallbacks) {
                    onConnectionLost.onConnectionLost();
                }
            }
        });
    }

    public void onStreamPublishSucceed() {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (QualityCallback onStreamPublishSucceed : BaseController.this.mQualityCallbacks) {
                    onStreamPublishSucceed.onStreamPublishSucceed();
                }
            }
        });
    }

    public void pause() {
        if (this.mEngine != null) {
            this.mEngine.pause();
        }
    }

    public void resume() {
        if (this.mEngine != null) {
            this.mEngine.resume();
        }
    }

    public synchronized void release() {
        this.mUserCallbacks.clear();
        this.mStateCallbacks.clear();
        this.mQualityCallbacks.clear();
        this.mStreamCallbacks.clear();
    }

    public synchronized void onDestroySuccess() {
        if (this.mState != State.DESTROYING) {
            StringBuilder sb = new StringBuilder("receive onDestroySuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.IDLE;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndSuccess : BaseController.this.mStateCallbacks) {
                    onEndSuccess.onEndSuccess();
                }
            }
        });
    }

    public synchronized void onStopSuccess() {
        if (this.mState != State.STOPPING) {
            StringBuilder sb = new StringBuilder("receive onStopSuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.DESTROYING;
        this.mEngine.destroy();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void end() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.p683ss.video.rtc.interact.controller.BaseController.C5168431.f128971x880f0f81     // Catch:{ all -> 0x0037 }
            com.ss.video.rtc.interact.controller.BaseController$State r1 = r2.mState     // Catch:{ all -> 0x0037 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0037 }
            r0 = r0[r1]     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 == r1) goto L_0x002b
            r1 = 3
            if (r0 == r1) goto L_0x0020
            switch(r0) {
                case 5: goto L_0x0020;
                case 6: goto L_0x0015;
                case 7: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x0037 }
        L_0x0014:
            goto L_0x001e
        L_0x0015:
            com.ss.video.rtc.interact.controller.BaseController$State r0 = com.p683ss.video.rtc.interact.controller.BaseController.State.STOPPING     // Catch:{ all -> 0x0037 }
            r2.mState = r0     // Catch:{ all -> 0x0037 }
            com.ss.video.rtc.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0037 }
            r0.stop()     // Catch:{ all -> 0x0037 }
        L_0x001e:
            monitor-exit(r2)
            return
        L_0x0020:
            com.ss.video.rtc.interact.controller.BaseController$State r0 = com.p683ss.video.rtc.interact.controller.BaseController.State.DESTROYING     // Catch:{ all -> 0x0037 }
            r2.mState = r0     // Catch:{ all -> 0x0037 }
            com.ss.video.rtc.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0037 }
            r0.destroy()     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x002b:
            android.os.Handler r0 = r2.mMainThreadHandler     // Catch:{ all -> 0x0037 }
            com.ss.video.rtc.interact.controller.BaseController$2 r1 = new com.ss.video.rtc.interact.controller.BaseController$2     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            r0.post(r1)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.controller.BaseController.end():void");
    }

    public synchronized void onInitSuccess() {
        if (this.mState != State.INITIALIZING) {
            StringBuilder sb = new StringBuilder("receive onInitSuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.STARTING;
        this.mEngine.enableAudio();
        if (this.mEnableLocalAudioShouldCall && !this.mConfig.isClientMixStream()) {
            this.mEngine.enableLocalAudio(this.mEnableLocalAudio);
            this.mEnableLocalAudioShouldCall = false;
        }
        this.mEngine.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void start() {
        /*
            r2 = this;
            monitor-enter(r2)
            int[] r0 = com.p683ss.video.rtc.interact.controller.BaseController.C5168431.f128971x880f0f81     // Catch:{ all -> 0x0034 }
            com.ss.video.rtc.interact.controller.BaseController$State r1 = r2.mState     // Catch:{ all -> 0x0034 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0034 }
            r0 = r0[r1]     // Catch:{ all -> 0x0034 }
            switch(r0) {
                case 1: goto L_0x0027;
                case 2: goto L_0x0027;
                case 3: goto L_0x001c;
                case 4: goto L_0x001c;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x000f;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x0034 }
        L_0x000e:
            goto L_0x0032
        L_0x000f:
            android.os.Handler r0 = r2.mMainThreadHandler     // Catch:{ all -> 0x0034 }
            com.ss.video.rtc.interact.controller.BaseController$1 r1 = new com.ss.video.rtc.interact.controller.BaseController$1     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            r0.post(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0032
        L_0x001a:
            monitor-exit(r2)
            return
        L_0x001c:
            com.ss.video.rtc.interact.controller.BaseController$State r0 = com.p683ss.video.rtc.interact.controller.BaseController.State.STARTING     // Catch:{ all -> 0x0034 }
            r2.mState = r0     // Catch:{ all -> 0x0034 }
            com.ss.video.rtc.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0034 }
            r0.start()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0027:
            com.ss.video.rtc.interact.controller.BaseController$State r0 = com.p683ss.video.rtc.interact.controller.BaseController.State.INITIALIZING     // Catch:{ all -> 0x0034 }
            r2.mState = r0     // Catch:{ all -> 0x0034 }
            com.ss.video.rtc.interact.engine.Engine r0 = r2.mEngine     // Catch:{ all -> 0x0034 }
            r0.init()     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return
        L_0x0032:
            monitor-exit(r2)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.controller.BaseController.start():void");
    }

    public void onError(final String str) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onError : BaseController.this.mStateCallbacks) {
                    onError.onError(str);
                }
            }
        });
    }

    public void onReconnected(final int i) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (QualityCallback onReconnected : BaseController.this.mQualityCallbacks) {
                    onReconnected.onReconnected(i);
                }
            }
        });
    }

    public void onWarn(final String str) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onWarn : BaseController.this.mStateCallbacks) {
                    onWarn.onWarn(str);
                }
            }
        });
    }

    public synchronized void removeQualityCallback(QualityCallback qualityCallback) {
        this.mQualityCallbacks.remove(qualityCallback);
    }

    public synchronized void removeStateCallback(StateCallback stateCallback) {
        this.mStateCallbacks.remove(stateCallback);
    }

    public synchronized void removeStreamCallback(StreamCallback streamCallback) {
        this.mStreamCallbacks.remove(streamCallback);
    }

    public synchronized void removeUserCallback(UserCallback userCallback) {
        this.mUserCallbacks.remove(userCallback);
    }

    public synchronized void addQualityCallback(QualityCallback qualityCallback) {
        if (qualityCallback != null) {
            if (!this.mQualityCallbacks.contains(qualityCallback)) {
                this.mQualityCallbacks.add(qualityCallback);
            }
        }
    }

    public synchronized void addStateCallback(StateCallback stateCallback) {
        if (stateCallback != null) {
            if (!this.mStateCallbacks.contains(stateCallback)) {
                this.mStateCallbacks.add(stateCallback);
            }
        }
    }

    public synchronized void addStreamCallback(StreamCallback streamCallback) {
        if (streamCallback != null) {
            if (!this.mStreamCallbacks.contains(streamCallback)) {
                this.mStreamCallbacks.add(streamCallback);
            }
        }
    }

    public synchronized void addUserCallback(UserCallback userCallback) {
        if (userCallback != null) {
            if (!this.mUserCallbacks.contains(userCallback)) {
                this.mUserCallbacks.add(userCallback);
            }
        }
    }

    public synchronized void adjustPlaybackSignalVolume(int i) {
        if (this.mState == State.STARTED) {
            this.mEngine.adjustPlaybackSignalVolume(i);
        }
    }

    public synchronized void adjustRecordingSignalVolume(int i) {
        if (this.mState == State.STARTED) {
            this.mEngine.adjustRecordingSignalVolume(i);
        }
    }

    public synchronized void enableAudioVolumeIndication(int i) {
        if (this.mState == State.STARTED) {
            this.mEngine.enableAudioVolumeIndication(i);
        }
    }

    public synchronized void enableLocalAudio(boolean z) {
        if (this.mState != State.STARTED) {
            this.mEnableLocalAudio = z;
            this.mEnableLocalAudioShouldCall = true;
            return;
        }
        this.mEngine.enableLocalAudio(z);
    }

    public synchronized void muteAllRemoteAudioStreams(boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.muteAllRemoteAudioStreams(z);
        }
    }

    public void onPublishStreamRetrySuccess(String str) {
        for (StreamCallback onPublishStreamRetrySuccess : this.mStreamCallbacks) {
            onPublishStreamRetrySuccess.onPublishStreamRetrySuccess(str);
        }
    }

    public void onPublishStreamTempDisconnect(String str) {
        for (StreamCallback onPublishStreamTempDisconnect : this.mStreamCallbacks) {
            onPublishStreamTempDisconnect.onPublishStreamTempDisconnect(str);
        }
    }

    public void onPullStreamRetrySuccess(String str) {
        for (StreamCallback onPullStreamRetrySuccess : this.mStreamCallbacks) {
            onPullStreamRetrySuccess.onPullStreamRetrySuccess(str);
        }
    }

    public void onPullStreamTempDisconnect(String str) {
        for (StreamCallback onPullStreamTempDisconnect : this.mStreamCallbacks) {
            onPullStreamTempDisconnect.onPullStreamTempDisconnect(str);
        }
    }

    public void onStreamDelay(final int i) {
        if (System.currentTimeMillis() - this.mLastStreamDelayCallbackTime >= 10000) {
            this.mLastStreamDelayCallbackTime = System.currentTimeMillis();
            this.mMainThreadHandler.post(new Runnable() {
                public void run() {
                    for (QualityCallback onStreamDelay : BaseController.this.mQualityCallbacks) {
                        onStreamDelay.onStreamDelay(i);
                    }
                }
            });
        }
    }

    public synchronized void switchAudio(boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.switchAudio(z);
        }
    }

    public void onFirstLocalAudioFrame(final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onFirstLocalAudioFrame callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstLocalAudioFrame : BaseController.this.mUserCallbacks) {
                    onFirstLocalAudioFrame.onFirstLocalAudioFrame(i);
                }
            }
        });
    }

    public synchronized void onStartSuccess(final int i) {
        if (this.mState != State.STARTING) {
            StringBuilder sb = new StringBuilder("receive onStartSuccess callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.STARTED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartSuccess : BaseController.this.mStateCallbacks) {
                    onStartSuccess.onStartSuccess(i);
                }
            }
        });
    }

    public void onLogReport(final String str, final JSONObject jSONObject) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (QualityCallback onLogMonitor : BaseController.this.mQualityCallbacks) {
                    onLogMonitor.onLogMonitor(str, jSONObject);
                }
            }
        });
    }

    public void onPushStreamQuality(long j, long j2) {
        Handler handler = this.mMainThreadHandler;
        final long j3 = j;
        final long j4 = j2;
        C5167725 r1 = new Runnable() {
            public void run() {
                for (QualityCallback onPushStreamQuality : BaseController.this.mQualityCallbacks) {
                    onPushStreamQuality.onPushStreamQuality(j3, j4);
                }
            }
        };
        handler.post(r1);
    }

    public void onUserEnableAudio(final String str, final boolean z) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserEnableAudio : BaseController.this.mUserCallbacks) {
                    onUserEnableAudio.onUserEnableAudio(str, z);
                }
            }
        });
    }

    public void onUserEnableLocalAudio(final String str, final boolean z) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserEnableLocalAudio : BaseController.this.mUserCallbacks) {
                    onUserEnableLocalAudio.onUserEnableLocalAudio(str, z);
                }
            }
        });
    }

    public void onUserEnableLocalVideo(final String str, final boolean z) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserEnableLocalVideo : BaseController.this.mUserCallbacks) {
                    onUserEnableLocalVideo.onUserEnableLocalVideo(str, z);
                }
            }
        });
    }

    public void onUserEnableVideo(final String str, final boolean z) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserEnableVideo : BaseController.this.mUserCallbacks) {
                    onUserEnableVideo.onUserEnableVideo(str, z);
                }
            }
        });
    }

    public void onUserMuteAudio(final String str, final boolean z) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserMuteAudio : BaseController.this.mUserCallbacks) {
                    onUserMuteAudio.onUserMuteAudio(str, z);
                }
            }
        });
    }

    public synchronized void muteRemoteAudioStream(String str, boolean z) {
        if (this.mState == State.STARTED) {
            this.mEngine.muteRemoteAudioStream(str, z);
        }
    }

    public synchronized void onDestroyFailed(final int i, final String str) {
        if (this.mState != State.DESTROYING) {
            StringBuilder sb = new StringBuilder("receive onDestroyFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.INITIALIZED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndFailed : BaseController.this.mStateCallbacks) {
                    onEndFailed.onEndFailed(i, str);
                }
            }
        });
    }

    public void onFirstRemoteAudioFrame(final String str, final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onFirstRemoteAudioFrame callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstRemoteAudioFrame : BaseController.this.mUserCallbacks) {
                    onFirstRemoteAudioFrame.onFirstRemoteAudioFrame(str, i);
                }
            }
        });
    }

    public synchronized void onInitFailed(final int i, final String str) {
        if (this.mState != State.INITIALIZING) {
            StringBuilder sb = new StringBuilder("receive onInitFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.IDLE;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartFailed : BaseController.this.mStateCallbacks) {
                    onStartFailed.onStartFailed(i, str);
                }
            }
        });
    }

    public synchronized void onStartFailed(final int i, final String str) {
        if (this.mState != State.STARTING) {
            StringBuilder sb = new StringBuilder("receive onStartFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.INITIALIZED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onStartFailed : BaseController.this.mStateCallbacks) {
                    onStartFailed.onStartFailed(i, str);
                }
            }
        });
    }

    public synchronized void onStopFailed(final int i, final String str) {
        if (this.mState != State.STOPPING) {
            StringBuilder sb = new StringBuilder("receive onStopFailed callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mState = State.STARTED;
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (StateCallback onEndFailed : BaseController.this.mStateCallbacks) {
                    onEndFailed.onEndFailed(i, str);
                }
            }
        });
    }

    public void onTalkStateUpdated(final String[] strArr, final boolean[] zArr) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onSelfVolumeUpdated callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onTalkStateUpdated : BaseController.this.mUserCallbacks) {
                    onTalkStateUpdated.onTalkStateUpdated(strArr, zArr);
                }
            }
        });
    }

    public void onUserJoined(final String str, final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onUserJoined callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserJoined : BaseController.this.mUserCallbacks) {
                    onUserJoined.onUserJoined(str, i);
                }
            }
        });
    }

    public synchronized void onUserLeaved(final String str, final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onUserLeaved callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onUserLeaved : BaseController.this.mUserCallbacks) {
                    onUserLeaved.onUserLeaved(str, i);
                }
            }
        });
    }

    public void onNetworkQuality(final String str, final int i, final int i2) {
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (QualityCallback onNetworkQuality : BaseController.this.mQualityCallbacks) {
                    onNetworkQuality.onNetworkQuality(str, i, i2);
                }
            }
        });
    }

    public void onAudioVolumeIndication(final String[] strArr, final int[] iArr, final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onAudioVolumeIndication callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onAudioVolumeIndication : BaseController.this.mUserCallbacks) {
                    onAudioVolumeIndication.onAudioVolumeIndication(strArr, iArr, i);
                }
            }
        });
    }

    public void onFirstRemoteVideoFrame(final String str, final View view, final int i) {
        if (this.mState != State.STARTED) {
            StringBuilder sb = new StringBuilder("receive onFirstRemoteVideoFrame callback, but state is ");
            sb.append(this.mState.name());
            LogUtil.m110874w("BaseController", sb.toString());
            return;
        }
        this.mMainThreadHandler.post(new Runnable() {
            public void run() {
                for (UserCallback onFirstRemoteVideoFrame : BaseController.this.mUserCallbacks) {
                    onFirstRemoteVideoFrame.onFirstRemoteVideoFrame(str, view, i);
                }
            }
        });
    }

    BaseController(Config config, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, VideoSinkFactory videoSinkFactory, AudioSinkFactory audioSinkFactory) {
        Handler handler;
        switch (config.getVendor()) {
            case AGORA:
            case ZEGO:
            case BYTE:
                this.mEngine = EngineFactory.create(config.getVendor(), config, videoClientFactory, audioClientFactory, videoSinkFactory, audioSinkFactory, this);
                this.mConfig = config;
                this.mState = State.IDLE;
                if (config.getHandler() != null) {
                    handler = config.getHandler();
                } else {
                    handler = new Handler(Looper.getMainLooper(), this);
                }
                this.mMainThreadHandler = handler;
                return;
            default:
                throw new RuntimeException("unknown vendor");
        }
    }
}
