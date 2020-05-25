package com.p683ss.avframework.livestreamv2.core;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import android.view.View;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.effect.EffectWrapper.AlgorithmResult;
import com.p683ss.avframework.effect.IVideoEffectProcessor;
import com.p683ss.avframework.effect.VideoEffectUtilsWrapper;
import com.p683ss.avframework.engine.AudioDeviceModule;
import com.p683ss.avframework.engine.AudioDeviceModule.Observer;
import com.p683ss.avframework.engine.VideoSink;
import com.p683ss.avframework.engine.VsyncModule;
import com.p683ss.avframework.livestreamv2.IInputAudioStream;
import com.p683ss.avframework.livestreamv2.IInputVideoStream;
import com.p683ss.avframework.livestreamv2.ILiveStream;
import com.p683ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import com.p683ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamDataListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamErrorListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ILiveStreamInfoListener;
import com.p683ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.LiveStream;
import com.p683ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p683ss.avframework.livestreamv2.LiveStreamOption;
import com.p683ss.avframework.livestreamv2.LiveStreamReport;
import com.p683ss.avframework.livestreamv2.RenderView;
import com.p683ss.avframework.livestreamv2.TextureFrameAvailableSink;
import com.p683ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.p683ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p683ss.avframework.livestreamv2.core.EffectCameraWrapper.FrameListener;
import com.p683ss.avframework.livestreamv2.core.IGameEngineExt.GameVideoSink;
import com.p683ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt;
import com.p683ss.avframework.livestreamv2.core.InteractEngine.SEIListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder;
import com.p683ss.avframework.livestreamv2.core.LiveCore.Builder.ILogMonitor;
import com.p683ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.avframework.livestreamv2.core.LiveCore.RtcExtraDataListener;
import com.p683ss.avframework.livestreamv2.core.interact.InteractEngineBuilder;
import com.p683ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p683ss.avframework.livestreamv2.filter.IFilterManager;
import com.p683ss.avframework.livestreamv2.log.LiveStreamLogService;
import com.p683ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p683ss.avframework.livestreamv2.utils.TimerTaskUtils;
import com.p683ss.avframework.mixer.VideoMixer;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import com.p683ss.avframework.opengl.GLThread;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.MiscUtils;
import com.p683ss.avframework.utils.TEBundle;
import com.p683ss.p2549c.p2550a.p2551a.p2554b.C51201e;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.LiveCoreImpl */
class LiveCoreImpl extends LiveCore implements Observer, IAudioFrameAvailableListener, ITextureFrameAvailableListener {
    private IAudioDeviceControl mAudioDeviceControl;
    protected final AudioDeviceModule mAudioDeviceModule;
    private List<IAudioFrameAvailableListener> mAudioFrameListeners = new ArrayList();
    private final Object mAudioFrameListenersFence = new Object();
    public boolean mCameraFirstReport = true;
    public ILayerExt mCameraStreamLayer;
    private VideoSink mCameraVideoSink;
    private EffectCameraWrapper mEffectCameraWrapper;
    protected ILiveStreamErrorListener mErrorListener;
    private IGameEngineExt mGameEngine;
    public GameVideoSink mGameVideoConsumer;
    protected ILiveStreamInfoListener mInfoListener;
    private InteractEngine mInteractEngine;
    private InteractEngineBuilder mInteractEngineBuilder;
    private ILayerControlExt mLayerControl;
    protected ILiveStream mLiveStream;
    private boolean mPushedOnce;
    protected RenderView mRenderView;
    protected RtcExtraDataListener mRtcExtraDataListener;
    private boolean mSingleViewMode = false;
    private long mStartTimeMs;
    private List<ITextureFrameAvailableListener> mTextureFrameListeners = new ArrayList();
    private final Object mTextureFrameListenersFence = new Object();
    private boolean mUsingEffectCamera;
    protected Handler mVideoCaptureHandler;
    protected GLThread mVideoCaptureThread;
    protected HandlerThread mWorkThread;
    protected Handler mWorkThreadHandler;

    public AudioDeviceModule getADM() {
        return this.mAudioDeviceModule;
    }

    public IAudioDeviceControl getAudioDeviceControl() {
        return this.mAudioDeviceControl;
    }

    public ILayerControl getLayerControl() {
        return this.mLayerControl;
    }

    private void stopReportNetworkQuality() {
        TimerTaskUtils.removeTask("ReportNetworkQuality");
    }

    public IFilterManager getFilterMgr() {
        return getVideoFilterMgr();
    }

    public void startCaptureSource() {
        startAudioCapture();
        startVideoCapture();
    }

    public void stopCaptureSource() {
        stopAudioCapture();
        stopVideoCapture();
    }

    private void startReportNetworkQuality() {
        TimerTaskUtils.addTask(new LiveCoreImpl$$Lambda$0(this), 2000, "ReportNetworkQuality");
    }

    public boolean audioMute() {
        if (this.mLiveStream == null || !this.mLiveStream.audioMute()) {
            return false;
        }
        return true;
    }

    public IInputAudioStream createInputAudioStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.createInputAudioStream();
    }

    public IInputVideoStream createInputVideoStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.createInputVideoStream();
    }

    public IAudioFilterManager getAudioFilterMgr() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getAudioFilterMgr();
    }

    public LiveStreamOption getOption() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getOption();
    }

    public IInputAudioStream getOriginInputAudioStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getOriginInputAudioStream();
    }

    public IInputVideoStream getOriginInputVideoStream() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getOriginInputVideoStream();
    }

    public boolean getPreviewFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        return false;
    }

    public IRecorderManager getRecorderMgr() {
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getRecorderMgr();
    }

    public List<String> getUrls() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getUrls();
        }
        return null;
    }

    public String getVersion() {
        if (this.mLiveStream == null) {
            return "";
        }
        return this.mLiveStream.getVersion();
    }

    public VsyncModule getVsyncModule() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getEncodeStreamVsyncModule();
        }
        return null;
    }

    public void startAudioCapture() {
        if (this.mLiveStream != null) {
            this.mLiveStream.startAudioCapture();
            this.mInteractEngineBuilder.setStatusLiveStreamIsAudioCaptured(true);
        }
    }

    public int startAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int startPlayer = LiveCoreImpl.this.mAudioDeviceModule.startPlayer();
                    if (startPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, startPlayer, new Exception("ADM startPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(18, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    public void startInternalAudioCapture() {
        if (this.mLiveStream != null) {
            this.mLiveStream.startAudioCapture();
        }
    }

    public void stopAudioCapture() {
        if (this.mLiveStream != null) {
            this.mLiveStream.stopAudioCapture();
            this.mInteractEngineBuilder.setStatusLiveStreamIsAudioCaptured(false);
        }
    }

    public int stopAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                if (LiveCoreImpl.this.mAudioDeviceModule != null) {
                    int stopPlayer = LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
                    if (stopPlayer != 0) {
                        if (LiveCoreImpl.this.mErrorListener != null) {
                            LiveCoreImpl.this.mErrorListener.onError(8, stopPlayer, new Exception("ADM stopPlayer error"));
                        }
                    } else if (LiveCoreImpl.this.mInfoListener != null) {
                        LiveCoreImpl.this.mInfoListener.onInfo(19, 0, 0);
                    }
                }
            }
        });
        return 0;
    }

    public void stopInternal() {
        if (this.mLiveStream != null) {
            this.mLiveStream.stop();
        }
    }

    public void stopInternalAudioCapture() {
        if (this.mLiveStream != null) {
            this.mLiveStream.stopAudioCapture();
        }
    }

    private void syncInteractParams() {
        if (this.mLiveStream != null) {
            ((LiveStream) this.mLiveStream).setVideoMixBgColor(this.mInteractEngineBuilder.getMixBackgroundColor());
        }
    }

    public void cameraFirstNotify() {
        if (this.mInfoListener != null) {
            this.mInfoListener.onInfo(25, getBuilder().getVideoCaptureDevice(), 0);
        }
    }

    public IGameEngine getGameEngine() {
        if (this.mGameEngine == null) {
            createGameEngine(getBuilder(), this.mAudioDeviceModule, getFilterMgr());
        }
        return this.mGameEngine;
    }

    public IVideoCapturerControl getVideoCapturerControl() {
        if (this.mUsingEffectCamera) {
            return this.mEffectCameraWrapper;
        }
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getVideoCapturerControl();
    }

    public IFilterManager getVideoFilterMgr() {
        if (this.mUsingEffectCamera) {
            return this.mEffectCameraWrapper;
        }
        if (this.mLiveStream == null) {
            return null;
        }
        return this.mLiveStream.getVideoFilterMgr();
    }

    public void pause() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.stopCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.pause();
        }
        if (this.mInteractEngine != null) {
            this.mInteractEngine.pause();
        }
    }

    public void resume() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.startCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.resume();
        }
        if (this.mInteractEngine != null) {
            this.mInteractEngine.resume();
        }
    }

    public void startVideoCapture() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.startCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.startVideoCapture();
        }
    }

    public void stop() {
        if (this.mLiveStream != null) {
            this.mLiveStream.stop();
            this.mInteractEngineBuilder.setStatusLiveStreamIsPushed(false);
        }
        stopReportNetworkQuality();
    }

    public void stopVideoCapture() {
        if (this.mUsingEffectCamera && this.mEffectCameraWrapper != null) {
            this.mEffectCameraWrapper.stopCapture();
        }
        if (this.mLiveStream != null) {
            this.mLiveStream.stopVideoCapture();
        }
    }

    /* access modifiers changed from: protected */
    public Builder getInternalBuilder() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return (Builder) liveStream.getLiveStreamBuilder();
        }
        AVLog.ioe("LiveCoreImpl", "getInternalBuilder() while LiveStream is null", new AndroidRuntimeException("getInternalBuilder() while LiveStream is null"));
        return new Builder();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$startReportNetworkQuality$0$LiveCoreImpl() {
        if (!this.mInteractEngine.isInteracting()) {
            LiveStreamReport liveStreamReport = new LiveStreamReport();
            getLiveStreamInfo(liveStreamReport);
            int videoFps = getBuilder().getVideoFps();
            int videoTransportRealFps = (int) liveStreamReport.getVideoTransportRealFps();
            int i = 3;
            int i2 = (videoFps * 2) / 3;
            if (videoTransportRealFps > i2) {
                i = 1;
            } else if (i2 >= videoTransportRealFps && videoTransportRealFps > (videoFps * 1) / 3) {
                i = 2;
            }
            if (this.mInfoListener != null) {
                this.mInfoListener.onInfo(BaseNotice.HASHTAG, 1, i);
            }
        }
    }

    private void configCameraLayer() {
        String uuid = MiscUtils.getUUID("cam");
        this.mCameraStreamLayer = this.mLayerControl.createLayerExt(uuid, null, getBuilder().getVideoCaptureWidth(), getBuilder().getVideoCaptureHeight(), 2);
        this.mLayerControl.setLocalOrigin(uuid);
        VideoMixerDescription FILL = VideoMixerDescription.FILL();
        FILL.setMode(2);
        this.mCameraStreamLayer.updateDescription(FILL);
        this.mCameraStreamLayer.setEnable(true);
        this.mCameraVideoSink = new VideoSink() {
            public void OnDiscardedFrame() {
            }

            public void onFrame(VideoFrame videoFrame) {
                if (LiveCoreImpl.this.mCameraFirstReport) {
                    LiveCoreImpl.this.cameraFirstNotify();
                    LiveCoreImpl.this.mCameraFirstReport = false;
                }
                LiveCoreImpl.this.mCameraStreamLayer.renderFrame(videoFrame);
                if (LiveCoreImpl.this.mGameVideoConsumer != null) {
                    LiveCoreImpl.this.mGameVideoConsumer.onVideoFrame(0, videoFrame, 2);
                }
            }
        };
        this.mLiveStream.setRenderSink(this.mCameraVideoSink);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:40|41|42|43|44|(2:46|(2:48|(1:50)))|51|52) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00e6 */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r7.postLiveCoreLog(r0)     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.InteractEngine r1 = r7.mInteractEngine     // Catch:{ all -> 0x0142 }
            r2 = 0
            if (r1 == 0) goto L_0x0014
            com.ss.avframework.livestreamv2.core.InteractEngine r1 = r7.mInteractEngine     // Catch:{ all -> 0x0142 }
            r1.setSEIProcessor(r2)     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.InteractEngine r1 = r7.mInteractEngine     // Catch:{ all -> 0x0142 }
            r1.dispose()     // Catch:{ all -> 0x0142 }
        L_0x0014:
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r1 = r7.mEffectCameraWrapper     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0024
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r1 = r7.mEffectCameraWrapper     // Catch:{ all -> 0x0142 }
            r1.stopCapture()     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.EffectCameraWrapper r1 = r7.mEffectCameraWrapper     // Catch:{ all -> 0x0142 }
            r1.release()     // Catch:{ all -> 0x0142 }
            r7.mEffectCameraWrapper = r2     // Catch:{ all -> 0x0142 }
        L_0x0024:
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0037
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            r1.setAudioFrameAvailableListener(r2)     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            r1.setTextureFrameAvailableListener(r2)     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            r1.setRenderSink(r2)     // Catch:{ all -> 0x0142 }
        L_0x0037:
            java.lang.Object r1 = r7.mTextureFrameListenersFence     // Catch:{ all -> 0x0142 }
            monitor-enter(r1)     // Catch:{ all -> 0x0142 }
            java.util.List<com.ss.avframework.livestreamv2.ILiveStream$ITextureFrameAvailableListener> r3 = r7.mTextureFrameListeners     // Catch:{ all -> 0x013f }
            r3.clear()     // Catch:{ all -> 0x013f }
            monitor-exit(r1)     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r7.mAudioFrameListenersFence     // Catch:{ all -> 0x0142 }
            monitor-enter(r1)     // Catch:{ all -> 0x0142 }
            java.util.List<com.ss.avframework.livestreamv2.ILiveStream$IAudioFrameAvailableListener> r3 = r7.mAudioFrameListeners     // Catch:{ all -> 0x013c }
            r3.clear()     // Catch:{ all -> 0x013c }
            monitor-exit(r1)     // Catch:{ all -> 0x013c }
            r7.stopAudioCapture()     // Catch:{ all -> 0x0142 }
            r7.stopVideoCapture()     // Catch:{ all -> 0x0142 }
            r7.stopAudioPlayer()     // Catch:{ all -> 0x0142 }
            android.os.Handler r1 = r7.mWorkThreadHandler     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$4 r3 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$4     // Catch:{ all -> 0x0142 }
            r3.<init>()     // Catch:{ all -> 0x0142 }
            r1.post(r3)     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.RenderView r1 = r7.mRenderView     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0069
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0069
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            r1.setRenderSink(r2)     // Catch:{ all -> 0x0142 }
        L_0x0069:
            com.ss.avframework.livestreamv2.core.IGameEngineExt r1 = r7.mGameEngine     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0076
            r7.mGameVideoConsumer = r2     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.IGameEngineExt r1 = r7.mGameEngine     // Catch:{ all -> 0x0142 }
            r1.release()     // Catch:{ all -> 0x0142 }
            r7.mGameEngine = r2     // Catch:{ all -> 0x0142 }
        L_0x0076:
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0084
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            r1.stop()     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.ILiveStream r1 = r7.mLiveStream     // Catch:{ all -> 0x0142 }
            r1.release()     // Catch:{ all -> 0x0142 }
        L_0x0084:
            com.ss.avframework.livestreamv2.RenderView r1 = r7.mRenderView     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x008f
            com.ss.avframework.livestreamv2.RenderView r1 = r7.mRenderView     // Catch:{ all -> 0x0142 }
            r1.release()     // Catch:{ all -> 0x0142 }
            r7.mRenderView = r2     // Catch:{ all -> 0x0142 }
        L_0x008f:
            java.lang.Object r1 = new java.lang.Object     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            r3 = 1
            boolean[] r4 = new boolean[r3]     // Catch:{ all -> 0x0142 }
            r4[r0] = r3     // Catch:{ all -> 0x0142 }
            monitor-enter(r1)     // Catch:{ all -> 0x0142 }
            android.os.Handler r3 = r7.mWorkThreadHandler     // Catch:{ all -> 0x0139 }
            com.ss.avframework.livestreamv2.core.LiveCoreImpl$5 r5 = new com.ss.avframework.livestreamv2.core.LiveCoreImpl$5     // Catch:{ all -> 0x0139 }
            r5.<init>(r1, r4)     // Catch:{ all -> 0x0139 }
            r3.post(r5)     // Catch:{ all -> 0x0139 }
            r5 = 500(0x1f4, double:2.47E-321)
            r1.wait(r5)     // Catch:{ InterruptedException -> 0x00c0 }
            boolean r0 = r4[r0]     // Catch:{ InterruptedException -> 0x00c0 }
            if (r0 == 0) goto L_0x00c0
            android.os.Handler r0 = r7.mWorkThreadHandler     // Catch:{ InterruptedException -> 0x00c0 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ InterruptedException -> 0x00c0 }
            if (r0 == 0) goto L_0x00c0
            java.lang.Thread r0 = r0.getThread()     // Catch:{ InterruptedException -> 0x00c0 }
            if (r0 == 0) goto L_0x00c0
            java.lang.String r3 = "LiveCoreImpl"
            com.p683ss.avframework.livestreamv2.LiveStream.dumpJavaThreadStackIfNeed(r0, r3)     // Catch:{ InterruptedException -> 0x00c0 }
        L_0x00c0:
            monitor-exit(r1)     // Catch:{ all -> 0x0139 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0142 }
            r1 = 18
            if (r0 < r1) goto L_0x00f2
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00d7
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ Throwable -> 0x00d1 }
            r0.quitSafely()     // Catch:{ Throwable -> 0x00d1 }
            goto L_0x00dc
        L_0x00d1:
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x0142 }
            r0.quit()     // Catch:{ all -> 0x0142 }
            goto L_0x00dc
        L_0x00d7:
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x0142 }
            r0.quit()     // Catch:{ all -> 0x0142 }
        L_0x00dc:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00ec
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ Throwable -> 0x00e6 }
            r0.quitSafely()     // Catch:{ Throwable -> 0x00e6 }
            goto L_0x0104
        L_0x00e6:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x0142 }
            r0.quit()     // Catch:{ all -> 0x0142 }
            goto L_0x0104
        L_0x00ec:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x0142 }
            r0.quit()     // Catch:{ all -> 0x0142 }
            goto L_0x0104
        L_0x00f2:
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x00fb
            android.os.HandlerThread r0 = r7.mWorkThread     // Catch:{ all -> 0x0142 }
            r0.quit()     // Catch:{ all -> 0x0142 }
        L_0x00fb:
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0104
            com.ss.avframework.opengl.GLThread r0 = r7.mVideoCaptureThread     // Catch:{ all -> 0x0142 }
            r0.quit()     // Catch:{ all -> 0x0142 }
        L_0x0104:
            com.ss.avframework.livestreamv2.core.IAudioDeviceControl r0 = r7.mAudioDeviceControl     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0111
            com.ss.avframework.livestreamv2.core.IAudioDeviceControl r0 = r7.mAudioDeviceControl     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.AudioDeviceControl r0 = (com.p683ss.avframework.livestreamv2.core.AudioDeviceControl) r0     // Catch:{ all -> 0x0142 }
            r0.release()     // Catch:{ all -> 0x0142 }
            r7.mAudioDeviceControl = r2     // Catch:{ all -> 0x0142 }
        L_0x0111:
            com.ss.avframework.livestreamv2.core.ILayerControlExt r0 = r7.mLayerControl     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x011e
            com.ss.avframework.livestreamv2.core.ILayerControlExt r0 = r7.mLayerControl     // Catch:{ all -> 0x0142 }
            com.ss.avframework.livestreamv2.core.LayerControl r0 = (com.p683ss.avframework.livestreamv2.core.LayerControl) r0     // Catch:{ all -> 0x0142 }
            r0.release()     // Catch:{ all -> 0x0142 }
            r7.mLayerControl = r2     // Catch:{ all -> 0x0142 }
        L_0x011e:
            com.ss.avframework.engine.VideoSink r0 = r7.mCameraVideoSink     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0129
            com.ss.avframework.engine.VideoSink r0 = r7.mCameraVideoSink     // Catch:{ all -> 0x0142 }
            r0.release()     // Catch:{ all -> 0x0142 }
            r7.mCameraVideoSink = r2     // Catch:{ all -> 0x0142 }
        L_0x0129:
            r7.mWorkThread = r2     // Catch:{ all -> 0x0142 }
            r7.mVideoCaptureThread = r2     // Catch:{ all -> 0x0142 }
            r7.mInfoListener = r2     // Catch:{ all -> 0x0142 }
            r7.mErrorListener = r2     // Catch:{ all -> 0x0142 }
            r7.mRtcExtraDataListener = r2     // Catch:{ all -> 0x0142 }
            r7.mLiveStream = r2     // Catch:{ all -> 0x0142 }
            r7.mWarningListener = r2     // Catch:{ all -> 0x0142 }
            monitor-exit(r7)
            return
        L_0x0139:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0139 }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x013c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013c }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x013f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.core.LiveCoreImpl.release():void");
    }

    public void setRtcExtraDataListener(RtcExtraDataListener rtcExtraDataListener) {
        this.mRtcExtraDataListener = rtcExtraDataListener;
    }

    public void setPreviewFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
        }
    }

    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getLiveStreamInfo(liveStreamReport);
        }
        return false;
    }

    public boolean getPreviewMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        return false;
    }

    public boolean isEnableMixer(boolean z) {
        if (this.mLiveStream == null || !this.mLiveStream.isEnableMixer(z)) {
            return false;
        }
        return true;
    }

    public boolean isMirror(boolean z) {
        if (this.mLiveStream == null || !this.mLiveStream.isMirror(z)) {
            return false;
        }
        return true;
    }

    public void removeAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            this.mAudioFrameListeners.remove(iAudioFrameAvailableListener);
        }
    }

    public int sendSeiMsg(String str) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.sendSeiMsg(str);
    }

    public void setAudioMute(boolean z) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setAudioMute(z);
        }
    }

    public void setBackGroundPhotoPath(Object obj) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setBackGroundPhotoPath(obj);
        }
    }

    public void setDataListener(ILiveStreamDataListener iLiveStreamDataListener) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setDataListener(iLiveStreamDataListener);
        }
    }

    public void setDns(C51201e eVar) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setDns(eVar);
        }
    }

    public void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener) {
        this.mInfoListener = iLiveStreamInfoListener;
        if (this.mLiveStream != null) {
            this.mLiveStream.setInfoListener(iLiveStreamInfoListener);
        }
    }

    public void setOption(LiveStreamOption liveStreamOption) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setOption(liveStreamOption);
        }
    }

    public void setScreenIntent(Intent intent) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setScreenIntent(intent);
        }
    }

    public void setTimeInterval(int i) {
        if (this.mLiveStream != null) {
            this.mLiveStream.setTimeInterval(i);
        }
    }

    /* access modifiers changed from: protected */
    public void setupTextureFrameAvailableListener(TextureFrameAvailableSink textureFrameAvailableSink) {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            liveStream.setupTextureFrameAvailableListener(textureFrameAvailableSink);
        }
    }

    public void startInternal(List<String> list) {
        if (this.mLiveStream != null) {
            this.mLiveStream.start(list);
        }
    }

    public void switchAudioCapture(int i) {
        if (this.mLiveStream != null) {
            this.mLiveStream.switchAudioCapture(i);
        }
    }

    public void addAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            if (!this.mAudioFrameListeners.contains(iAudioFrameAvailableListener)) {
                this.mAudioFrameListeners.add(iAudioFrameAvailableListener);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void createLogServer(LiveStreamBuilder liveStreamBuilder) {
        LiveStreamLogService liveStreamLogService = new LiveStreamLogService((LiveStream) this.mLiveStream, liveStreamBuilder.getLogUploader(), liveStreamBuilder.getUploadLogInterval());
        liveStreamLogService.setProjectKey(liveStreamBuilder.mProjectKey);
        ((LiveStream) this.mLiveStream).setupLogServer(liveStreamLogService);
    }

    public void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
        if (this.mLiveStream != null) {
            this.mLiveStream.setErrorListener(new ILiveStreamErrorListener() {
                public void onError(int i, int i2, Exception exc) {
                    StringBuilder sb = new StringBuilder("code1:");
                    sb.append(i);
                    sb.append(", code2:");
                    sb.append(i2);
                    AVLog.logKibana(6, "LiveCoreImpl", sb.toString(), exc);
                    if (LiveCoreImpl.this.mErrorListener != null) {
                        LiveCoreImpl.this.mErrorListener.onError(i, i2, exc);
                    }
                }
            });
        }
    }

    public void setRenderSink(VideoSink videoSink) {
        if (this.mUsingEffectCamera) {
            throw new AndroidRuntimeException("Unsupport operation.");
        } else if (this.mLiveStream != null) {
            this.mLiveStream.setRenderSink(videoSink);
        }
    }

    public void switchAudioMode(int i) {
        ((LiveStream) this.mLiveStream).setAudioRecordMode(i);
        this.mLiveStream.switchAudioCapture(((LiveStream) this.mLiveStream).getLiveStreamBuilder().getAudioCaptureDevice());
    }

    public void addTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        synchronized (this.mTextureFrameListenersFence) {
            if (iTextureFrameAvailableListener != null) {
                try {
                    if (!this.mTextureFrameListeners.contains(iTextureFrameAvailableListener)) {
                        if (this.mTextureFrameListeners.isEmpty()) {
                            IFilterManager videoFilterMgr = getVideoFilterMgr();
                            if (videoFilterMgr != null) {
                                videoFilterMgr.forceOutput2DTex(true);
                            }
                        }
                        this.mTextureFrameListeners.add(iTextureFrameAvailableListener);
                    }
                } finally {
                }
            }
        }
    }

    public void removeTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        synchronized (this.mTextureFrameListenersFence) {
            if (iTextureFrameAvailableListener != null) {
                try {
                    this.mTextureFrameListeners.remove(iTextureFrameAvailableListener);
                    if (this.mTextureFrameListeners.isEmpty()) {
                        IFilterManager videoFilterMgr = getVideoFilterMgr();
                        if (videoFilterMgr != null) {
                            videoFilterMgr.forceOutput2DTex(false);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void setDisplay(View view) {
        if (!this.mUsingEffectCamera) {
            ((LayerControl) this.mLayerControl).setDisplay(view);
            if (this.mCameraStreamLayer == null) {
                configCameraLayer();
            }
        } else if (this.mEffectCameraWrapper != null) {
            if (view instanceof SurfaceView) {
                this.mEffectCameraWrapper.setSurface((SurfaceView) view);
                return;
            }
            throw new AndroidRuntimeException("Effect cam unsupport textureView");
        }
    }

    public void start(String str) {
        this.mPushedOnce = true;
        if (!this.mInteractEngine.isInteracting() || this.mInteractEngineBuilder.isClientMixer()) {
            if (this.mLiveStream != null) {
                this.mLiveStream.start(str);
                this.mInteractEngineBuilder.setStatusLiveStreamIsPushed(true);
            }
            startReportNetworkQuality();
        }
    }

    private void initLogFile(Context context) {
        AVLog.initLogFile(context, 10485760);
        AVLog.ioi("LiveCoreImpl", "SDK version: 6.7.0.20/release");
        StringBuilder sb = new StringBuilder("Android OS: ");
        sb.append(VERSION.SDK_INT);
        sb.append("(");
        sb.append(VERSION.RELEASE);
        sb.append(")");
        AVLog.ioi("LiveCoreImpl", sb.toString());
        StringBuilder sb2 = new StringBuilder("DevicesName:");
        sb2.append(Build.MODEL);
        AVLog.ioi("LiveCoreImpl", sb2.toString());
    }

    /* access modifiers changed from: protected */
    public void initInteractClientParams(final Builder builder) {
        this.mInteractEngineBuilder = new InteractEngineBuilder();
        this.mInteractEngine = this.mInteractEngineBuilder.setUUID(UUID.randomUUID().toString().replace("-", "")).setPushAtomic(new AtomicInteger(-1)).setLiveCoreBuilder(builder).setLiveCore(this).setStatusLiveStreamIsAudioCaptured(false).setStatusLiveStreamIsPushed(false).setVideoThreadHandler(this.mVideoCaptureHandler).setWorkThreadHandler(this.mWorkThreadHandler).setSingleView(this.mSingleViewMode).setUsingLiveCoreCapture(builder.isUsingExternAudioCaptureOnServerInteractMode()).create();
        if (this.mInteractEngine != null) {
            this.mInteractEngine.setSEIProcessor(new SEIListener() {
                public void onReceiveSEI(int i, String str, int i2, int i3, int i4, float[] fArr, int i5, long j, ByteBuffer byteBuffer) {
                    ByteBuffer byteBuffer2 = byteBuffer;
                    String str2 = str;
                    LiveCoreImpl.this.processSEI(str, byteBuffer2);
                    if (LiveCoreImpl.this.mGameVideoConsumer != null && builder.isEnableGameMode()) {
                        VideoMixerTexture videoMixerTexture = new VideoMixerTexture(i3, i4, 0, VideoMixer.TEXTURE_TYPE_2D, new int[]{i2, 0, 0}, null);
                        int i6 = i;
                        LiveCoreImpl.this.mGameVideoConsumer.onVideoFrame(i, videoMixerTexture, byteBuffer2);
                    }
                }
            });
        }
        ((LiveStream) this.mLiveStream).setStreamUniqueIdentifier(this.mInteractEngineBuilder.getUUID(), this.mInteractEngineBuilder.getPushAtomic());
    }

    public void start(List<String> list) {
        this.mPushedOnce = true;
        if (!this.mInteractEngine.isInteracting() || this.mInteractEngineBuilder.isClientMixer()) {
            if (this.mLiveStream != null) {
                this.mLiveStream.start(list);
                this.mInteractEngineBuilder.setStatusLiveStreamIsPushed(true);
            }
            startReportNetworkQuality();
        }
    }

    private void initEffectCamera(Builder builder) {
        this.mEffectCameraWrapper = EffectCameraWrapper.Create(builder, this.mVideoCaptureHandler, this.mWorkThreadHandler, new LiveStreamVideoCapture.Observer() {
            public void onVideoCaptureStarted() {
                if (LiveCoreImpl.this.mInfoListener != null) {
                    LiveCoreImpl.this.mInfoListener.onInfo(5, 0, 0);
                }
            }

            public void onVideoCaptureStoped() {
                if (LiveCoreImpl.this.mInfoListener != null) {
                    LiveCoreImpl.this.mInfoListener.onInfo(6, 0, 0);
                }
            }

            public void onVideoCaptureError(int i, Exception exc) {
                if (LiveCoreImpl.this.mErrorListener != null) {
                    LiveCoreImpl.this.mErrorListener.onError(2, i, exc);
                }
            }
        }, new FrameListener() {
            public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.pushVideoFrame(i, false, i3, i4, 0, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f}, j * 1000, bundle);
                }
            }
        });
        this.mEffectCameraWrapper.setEffectAlgorithmAB(builder.getEffectAlgorithmAB());
        EffectCameraWrapper effectCameraWrapper = this.mEffectCameraWrapper;
        boolean z = false;
        if (!(builder.getRoiOn(false) == 0 && builder.getRoiOn(true) == 0)) {
            z = true;
        }
        effectCameraWrapper.enableRoi(z);
        if (builder.getEffectResourceFinder() != null) {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect(), builder.getEffectResourceFinder());
        } else if (builder.getAssetManager() == null || !(builder.getAssetManager() instanceof AssetManager)) {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect());
        } else {
            this.mEffectCameraWrapper.configEffect(builder.getVideoWidth(), builder.getVideoHeight(), builder.getEffectModePath(), Build.MODEL, builder.isUseTTFaceDetect(), (AssetManager) builder.getAssetManager());
        }
    }

    private void postLiveCoreLog(boolean z) {
        Builder builder = getBuilder();
        if (builder != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject put = new JSONObject().put(C42311c.f106863g, "2.0.0").put("report_version", 5).put("product_line", CustomActionPushReceiver.f104061f).put("timestamp", currentTimeMillis).put("project_key", builder.mProjectKey);
                if (z) {
                    this.mStartTimeMs = currentTimeMillis;
                    put.put("event_key", "live_core_start");
                } else {
                    put.put("event_key", "live_core_end");
                    if (this.mStartTimeMs != 0) {
                        put.put("push_duration", currentTimeMillis - this.mStartTimeMs);
                    }
                    if (this.mPushedOnce) {
                        put.put("mode", "push");
                    }
                }
                ILogMonitor logMonitor = builder.getLogMonitor();
                if (logMonitor != null) {
                    logMonitor.onLogMonitor("live_client_monitor_log", put);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Create live core log error: ");
                sb.append(e.toString());
                AVLog.ioe("LiveCoreImpl", sb.toString());
            }
        }
    }

    public void switchVideoCapture(int i) {
        if (!this.mUsingEffectCamera || i == 2 || 1 == i) {
            switch (i) {
                case 1:
                case 2:
                    if (this.mUsingEffectCamera) {
                        if (this.mEffectCameraWrapper != null) {
                            this.mEffectCameraWrapper.switchCamera();
                        }
                        getBuilder().setVideoCaptureDevice(i);
                        return;
                    } else if (this.mLiveStream != null) {
                        this.mLiveStream.switchVideoCapture(i);
                        return;
                    }
                    break;
                case 3:
                    if (this.mUsingEffectCamera) {
                        if (this.mEffectCameraWrapper != null) {
                            this.mEffectCameraWrapper.stopCapture();
                        }
                        getBuilder().setVideoCaptureDevice(i);
                    }
                    if (this.mLiveStream != null) {
                        this.mLiveStream.switchVideoCapture(i);
                        return;
                    }
                    break;
                default:
                    if (!this.mUsingEffectCamera) {
                        if (this.mLiveStream != null) {
                            this.mLiveStream.switchVideoCapture(i);
                            break;
                        }
                    } else if (this.mEffectCameraWrapper != null) {
                        this.mEffectCameraWrapper.stopCapture();
                        return;
                    }
                    break;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("invalid operation on switch video capture, target capture ");
        sb.append(i);
        sb.append(" current capture ");
        sb.append(getBuilder().getVideoCaptureDevice());
        sb.append(" is effectcam ");
        sb.append(this.mUsingEffectCamera);
        final Exception exc = new Exception(sb.toString());
        this.mWorkThreadHandler.post(new Runnable() {
            public void run() {
                LiveCoreImpl.this.onWarning(1, 0, exc);
            }
        });
        getBuilder().setVideoCaptureDevice(i);
    }

    protected LiveCoreImpl(Builder builder) {
        if (builder.getContext() != null) {
            initLogFile(builder.getContext());
        }
        this.mWorkThread = new HandlerThread("LiveCoreWorkThread");
        this.mWorkThread.start();
        this.mWorkThreadHandler = new Handler(this.mWorkThread.getLooper());
        this.mVideoCaptureThread = new GLThread("LiveCoreVideoCaptureThread");
        this.mVideoCaptureThread.start();
        this.mVideoCaptureHandler = this.mVideoCaptureThread.getHandler();
        this.mAudioDeviceModule = new AudioDeviceModule(this, builder.getContext());
        this.mAudioDeviceModule.enableBuiltInAEC(false);
        this.mAudioDeviceModule.enableEchoMode(false);
        this.mAudioDeviceModule.getRenderMixer().setEnable(true);
        TEBundle parameter = this.mAudioDeviceModule.getParameter();
        parameter.setInt("audio_sample", builder.getAudioCaptureSampleHZ());
        parameter.setInt("audio_channels", builder.getAudioCaptureChannel());
        parameter.setDouble("adm_aec_volume_coeff", 2.0d);
        parameter.setInt("adm_audio_player_channel", builder.getAudioChannel());
        parameter.setInt("adm_audio_player_sample", builder.getAudioSampleHZ());
        parameter.setInt("audio_bit_width", builder.getAudioBitwidth());
        parameter.setBool("VoIPMode", true);
        this.mAudioDeviceModule.setParameter(parameter);
        parameter.release();
        this.mSingleViewMode = builder.isEnableGameMode();
        this.mUsingEffectCamera = builder.isUsingEffectCamera();
        if (!VideoEffectUtilsWrapper.haveEffect()) {
            this.mUsingEffectCamera = false;
            builder.setUsingEffectCamera(this.mUsingEffectCamera);
            AVLog.iow("LiveCoreImpl", "Not found effect and force using BuiltInCamera");
        }
        if (this.mUsingEffectCamera) {
            initEffectCamera(builder);
            builder.setVideoCaptureDevice(4);
        }
        IVideoEffectProcessor videoEffectProcessor = builder.getVideoEffectProcessor();
        if (videoEffectProcessor != null) {
            AVLog.ioi("LiveCoreImpl", "Using extern video effect handler.");
        }
        this.mLiveStream = builder.createLiveStream(this.mWorkThreadHandler, this.mVideoCaptureHandler, this.mAudioDeviceModule, videoEffectProcessor);
        createLogServer(builder);
        if (this.mUsingEffectCamera) {
            this.mLiveStream.getVideoFilterMgr().enable(false);
        } else if (builder.getVideoCaptureDevice() != 3) {
            this.mLiveStream.getVideoFilterMgr().enable(true);
        }
        this.mLiveStream.setTextureFrameAvailableListener(this);
        this.mLiveStream.setAudioFrameAvailableListener(this);
        this.mLayerControl = new LayerControl(this.mWorkThreadHandler);
        this.mAudioDeviceControl = new AudioDeviceControl(this.mAudioDeviceModule);
        this.mLayerControl.getVideoMixer().setEnable(false);
        initInteractClientParams(builder);
        enableMixer(true, true);
        enableMixer(false, true);
        postLiveCoreLog(true);
    }

    public void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback) {
        this.mLiveStream.catchVideo(bundle, catchVideoCallback);
    }

    public void setPreviewMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
        }
    }

    private void needSaveSei(String str, Object obj) {
        if (this.mInteractEngine != null) {
            this.mInteractEngine.needSaveSei(str, obj);
        }
    }

    public void enableMixer(boolean z, boolean z2) {
        if (this.mLiveStream != null) {
            this.mLiveStream.enableMixer(z, z2);
        }
    }

    public void enableMirror(boolean z, boolean z2) {
        if (this.mUsingEffectCamera) {
            if (this.mEffectCameraWrapper != null) {
                this.mEffectCameraWrapper.enableMirror(z, z2);
            }
        } else if (this.mLiveStream != null) {
            this.mLiveStream.enableMirror(z, z2);
        }
    }

    public void processSEI(String str, ByteBuffer byteBuffer) {
        RtcExtraDataListener rtcExtraDataListener = this.mRtcExtraDataListener;
        if (rtcExtraDataListener != null && byteBuffer != null) {
            String parseStringFromByteBuffer = AlgorithmResult.parseStringFromByteBuffer(0, byteBuffer);
            if (parseStringFromByteBuffer != null) {
                rtcExtraDataListener.onRtcData(str, parseStringFromByteBuffer);
            }
        }
    }

    public Client create(InteractConfig interactConfig, boolean z) {
        Client client;
        InteractEngine interactEngine = this.mInteractEngine;
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (interactEngine == null || liveStream == null) {
            client = null;
        } else {
            this.mInteractEngineBuilder.setOriginUrl(liveStream.getOriginUrl());
            this.mInteractEngineBuilder.setStreamUrl(liveStream.getLiveStreamUrl());
            client = interactEngine.create(interactConfig, z);
            if (client != null) {
                syncInteractParams();
            }
        }
        if (client != null && !client.isGuest()) {
            client.setInteractEventListener(new InteractEventListener() {
                public void onInteractStart(Client client) {
                    if (client.getConfig().isClientMixStream()) {
                        LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
                        if (liveStream != null) {
                            liveStream.changeBitrateForInteractMode(true);
                        }
                    }
                }

                public void onInteractStop(Client client) {
                    if (client.getConfig().isClientMixStream()) {
                        LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
                        if (liveStream != null) {
                            liveStream.changeBitrateForInteractMode(false);
                        }
                    }
                }

                public void onIneractInfoReport(Client client, int i, long j, Object... objArr) {
                    if (i == 15) {
                        int i2 = 0;
                        if (objArr[0].toString().equals(client.getConfig().getInteractId())) {
                            int intValue = objArr[1].intValue();
                            int i3 = 3;
                            switch (intValue) {
                                case 1:
                                case 2:
                                    i2 = 1;
                                    break;
                                case 3:
                                case 4:
                                    i2 = 2;
                                    break;
                                case 5:
                                case 6:
                                    i2 = 3;
                                    break;
                            }
                            if (i2 != 0 && LiveCoreImpl.this.mInfoListener != null) {
                                ILiveStreamInfoListener iLiveStreamInfoListener = LiveCoreImpl.this.mInfoListener;
                                if (client.getConfig().isClientMixStream()) {
                                    i3 = 2;
                                }
                                iLiveStreamInfoListener.onInfo(BaseNotice.HASHTAG, i3, i2);
                            }
                        }
                    }
                }
            });
        }
        return client;
    }

    public int addSeiField(String str, Object obj, int i) {
        return addSeiField(str, obj, i, true, true);
    }

    public void onADMInfo(int i, int i2, long j) {
        if (this.mInfoListener != null) {
            switch (i) {
                case 2:
                    this.mInfoListener.onInfo(22, i2, 0);
                    return;
                case 3:
                    this.mInfoListener.onInfo(23, i2, 0);
                    return;
                case 4:
                    this.mInfoListener.onInfo(24, i2, 0);
                    break;
            }
        }
    }

    private void createGameEngine(Builder builder, AudioDeviceModule audioDeviceModule, IFilterManager iFilterManager) {
        Method method;
        Class cls;
        Exception e;
        Vector vector = new Vector();
        vector.add(builder);
        vector.add(this);
        vector.add(audioDeviceModule);
        vector.add(iFilterManager);
        vector.add(this.mLayerControl);
        vector.add(this.mAudioDeviceControl);
        try {
            cls = Class.forName("com.ss.avframework.livestreamv2.game.GameEngine");
            try {
                method = cls.getMethod("create", new Class[]{vector.getClass()});
                try {
                    this.mGameEngine = (IGameEngineExt) method.invoke(null, new Object[]{vector});
                    this.mGameEngine.setupLogServer(new LiveStreamGameLogService((LiveStream) this.mLiveStream, builder.getLogUploader()));
                    this.mGameVideoConsumer = this.mGameEngine.getVideoSink();
                    this.mGameEngine.setInteractEngine(this.mInteractEngine);
                } catch (Exception e2) {
                    e = e2;
                    StringBuilder sb = new StringBuilder("BUG, Create game engine failed(class:");
                    sb.append(cls);
                    sb.append("cons:");
                    sb.append(method);
                    sb.append(" builder:");
                    sb.append(builder);
                    sb.append(" m:");
                    sb.append(audioDeviceModule);
                    sb.append(" filter:");
                    sb.append(iFilterManager);
                    sb.append(" layerctr:");
                    sb.append(this.mLayerControl);
                    sb.append(" audioctr:");
                    sb.append(this.mAudioDeviceControl);
                    sb.append(" args size:");
                    sb.append(vector.size());
                    sb.append(" cause:");
                    sb.append(e.getMessage());
                    AVLog.ioe("LiveCoreImpl", sb.toString(), e);
                }
            } catch (Exception e3) {
                Exception exc = e3;
                method = null;
                e = exc;
                StringBuilder sb2 = new StringBuilder("BUG, Create game engine failed(class:");
                sb2.append(cls);
                sb2.append("cons:");
                sb2.append(method);
                sb2.append(" builder:");
                sb2.append(builder);
                sb2.append(" m:");
                sb2.append(audioDeviceModule);
                sb2.append(" filter:");
                sb2.append(iFilterManager);
                sb2.append(" layerctr:");
                sb2.append(this.mLayerControl);
                sb2.append(" audioctr:");
                sb2.append(this.mAudioDeviceControl);
                sb2.append(" args size:");
                sb2.append(vector.size());
                sb2.append(" cause:");
                sb2.append(e.getMessage());
                AVLog.ioe("LiveCoreImpl", sb2.toString(), e);
            }
        } catch (Exception e4) {
            method = null;
            e = e4;
            cls = null;
            StringBuilder sb22 = new StringBuilder("BUG, Create game engine failed(class:");
            sb22.append(cls);
            sb22.append("cons:");
            sb22.append(method);
            sb22.append(" builder:");
            sb22.append(builder);
            sb22.append(" m:");
            sb22.append(audioDeviceModule);
            sb22.append(" filter:");
            sb22.append(iFilterManager);
            sb22.append(" layerctr:");
            sb22.append(this.mLayerControl);
            sb22.append(" audioctr:");
            sb22.append(this.mAudioDeviceControl);
            sb22.append(" args size:");
            sb22.append(vector.size());
            sb22.append(" cause:");
            sb22.append(e.getMessage());
            AVLog.ioe("LiveCoreImpl", sb22.toString(), e);
        }
    }

    public int addSeiField(String str, Object obj, int i, boolean z, boolean z2) {
        if (obj != null) {
            needSaveSei(str, obj);
        }
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.addSeiField(str, obj, i, z, z2);
    }

    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList<IAudioFrameAvailableListener> arrayList;
        synchronized (this.mAudioFrameListenersFence) {
            arrayList = new ArrayList<>(this.mAudioFrameListeners);
        }
        for (IAudioFrameAvailableListener onAudioFrameAvailable : arrayList) {
            onAudioFrameAvailable.onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushVideoFrame(byteBuffer, i, i2, i3, j);
    }

    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j);
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        if (this.mLiveStream == null) {
            return 0;
        }
        return this.mLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
    }

    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        ArrayList<ITextureFrameAvailableListener> arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList<>(this.mTextureFrameListeners);
        }
        for (ITextureFrameAvailableListener iTextureFrameAvailableListener : arrayList) {
            if (iTextureFrameAvailableListener instanceof ILiveCoreTextureFrameAvailableListener) {
                ((ILiveCoreTextureFrameAvailableListener) iTextureFrameAvailableListener).onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j, fArr, byteBuffer);
            } else {
                iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, byteBuffer);
            }
        }
    }
}
