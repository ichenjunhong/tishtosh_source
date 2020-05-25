package com.p683ss.avframework.livestreamv2.core;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.avframework.buffer.GlTextureFrameBuffer;
import com.p683ss.avframework.buffer.TextureBufferImpl;
import com.p683ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p683ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p683ss.avframework.effect.EffectWrapper.AlgorithmResult;
import com.p683ss.avframework.livestreamv2.RenderView;
import com.p683ss.avframework.livestreamv2.core.DirectVideoMixer.MixerRenderView;
import com.p683ss.avframework.livestreamv2.core.IGameEngineExt.GameVideoSink;
import com.p683ss.avframework.livestreamv2.core.ILayerControl.ILayer;
import com.p683ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt;
import com.p683ss.avframework.mixer.VideoMixer;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.opengl.GlRenderDrawer;
import com.p683ss.avframework.opengl.RendererCommon;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.livestreamv2.core.LayerControl */
public class LayerControl implements OnTouchListener, ILayerControlExt {
    private static AtomicInteger mAtomicInteger = new AtomicInteger(0);
    private final String TAG = "LayerControl";
    private LayerEventListener mLayerEventListener;
    private List<ILayerExt> mLayers;
    private String mOriginName;
    private RenderView mRenderView;
    private SurfaceHolder mSurfaceHolder;
    public DirectVideoMixer mVideoMixer;

    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer */
    class CanvasLayer extends Layer {
        public CanvasLayer(String str, int i, int i2, VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer */
    class DirectLayer extends Layer {
        /* access modifiers changed from: protected */
        public void createMixerTrack() {
            this.mTrackId = -1;
            this.mVideoMixerDescription = VideoMixerDescription.FILL();
            setEnable(false);
        }

        public void dispose() {
            if (LayerControl.this.mVideoMixer != null) {
                LayerControl.this.mVideoMixer.enableDirectRender(false);
            }
        }

        public boolean isEnable() {
            if (this.mVideoMixerDescription == null || (this.mVideoMixerDescription.flags & 8) != 0) {
                return false;
            }
            return true;
        }

        public void renderFrame(VideoMixerTexture videoMixerTexture) {
            throw new AndroidRuntimeException("later support");
        }

        public void updateDescription(VideoMixerDescription videoMixerDescription) {
            if (videoMixerDescription != null) {
                this.mVideoMixerDescription.copy(videoMixerDescription);
            }
        }

        public void renderFrame(VideoFrame videoFrame) {
            if (isEnable()) {
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (directVideoMixer != null) {
                    directVideoMixer.onDirectFrame(videoFrame);
                }
            }
        }

        public void setEnable(boolean z) {
            if (this.mVideoMixerDescription != null) {
                if (z) {
                    this.mVideoMixerDescription.flags &= -9;
                } else {
                    this.mVideoMixerDescription.flags |= 8;
                }
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.enableDirectRender(z);
            }
        }

        public DirectLayer(String str, int i, int i2, VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$GameLayer */
    class GameLayer extends Layer {
        private AlgorithmResult mAlgorithmResult;
        public CountDownLatch mFrameFence = new CountDownLatch(1);
        private GlRenderDrawer mGlDrawer;
        private int mRandStreamId = LayerControl.getStreamId();
        private boolean mRelease = false;
        private TextureBufferImpl mTextureBuffer;
        private GlTextureFrameBuffer mTextureFrameBuffer;
        private GameVideoSink mVideoSink;
        private int[] mYuvTex = {0, 0, 0};

        public void dispose() {
        }

        public int getRtcId() {
            return this.mRandStreamId;
        }

        /* access modifiers changed from: private */
        /* renamed from: releaseTextureOnGlThread */
        public void lambda$release$2$LayerControl$GameLayer() {
            releaseYuvTexturesOnGlThread();
            if (this.mGlDrawer != null) {
                this.mGlDrawer.release();
                this.mGlDrawer = null;
            }
            if (this.mTextureFrameBuffer != null) {
                this.mTextureFrameBuffer.release();
                this.mTextureFrameBuffer = null;
            }
            this.mRelease = true;
        }

        private void releaseYuvTexturesOnGlThread() {
            if (this.mYuvTex[0] > 0) {
                GLES20.glDeleteTextures(this.mYuvTex.length, this.mYuvTex, 0);
                for (int i = 0; i < this.mYuvTex.length; i++) {
                    this.mYuvTex[i] = 0;
                }
            }
        }

        public void release() {
            super.dispose();
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), (Runnable) new LayerControl$GameLayer$$Lambda$2(this));
            if (this.mAlgorithmResult != null) {
                this.mAlgorithmResult.release();
                this.mAlgorithmResult = null;
            }
        }

        public void setVideoFrameCallback(GameVideoSink gameVideoSink) {
            this.mVideoSink = gameVideoSink;
        }

        private ByteBuffer toDirectBuffer(ByteBuffer byteBuffer) {
            if (byteBuffer == null || byteBuffer.isDirect()) {
                return byteBuffer;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            allocateDirect.put(byteBuffer);
            return allocateDirect;
        }

        private void createTexture(int i, int i2) {
            ThreadUtils.invokeAtFrontUninterruptibly(GLThreadManager.getMainGlHandle(), (Runnable) new LayerControl$GameLayer$$Lambda$1(this, i, i2));
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$createTexture$1$LayerControl$GameLayer(int i, int i2) {
            if (!this.mRelease) {
                if (this.mGlDrawer == null) {
                    this.mGlDrawer = new GlRenderDrawer();
                }
                if (this.mTextureFrameBuffer != null) {
                    this.mTextureFrameBuffer.setSize(i, i2);
                } else {
                    this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
                    this.mTextureFrameBuffer.setSize(i, i2);
                }
                int i3 = (i + 1) >> 1;
                int i4 = (i2 + 1) >> 1;
                releaseYuvTexturesOnGlThread();
                this.mYuvTex[0] = genTextureWithInit(33984, i, i2);
                this.mYuvTex[1] = genTextureWithInit(33985, i3, i4);
                this.mYuvTex[2] = genTextureWithInit(33986, i3, i4);
                this.mWidth = i;
                this.mHeight = i2;
            }
        }

        private int genTextureWithInit(int i, int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glActiveTexture(i);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6409, i2, i3, 0, 6409, 5121, null);
            return iArr[0];
        }

        private boolean loadYuvAndDraw(ByteBuffer byteBuffer, int i, int i2) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (this.mTextureFrameBuffer == null || this.mGlDrawer == null || this.mYuvTex[0] <= 0) {
                return atomicBoolean.get();
            }
            Handler mainGlHandle = GLThreadManager.getMainGlHandle();
            LayerControl$GameLayer$$Lambda$0 layerControl$GameLayer$$Lambda$0 = new LayerControl$GameLayer$$Lambda$0(this, byteBuffer, i, i2, atomicBoolean);
            ThreadUtils.invokeAtFrontUninterruptibly(mainGlHandle, (Runnable) layerControl$GameLayer$$Lambda$0);
            return atomicBoolean.get();
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$loadYuvAndDraw$0$LayerControl$GameLayer(ByteBuffer byteBuffer, int i, int i2, AtomicBoolean atomicBoolean) {
            if (!this.mRelease) {
                int i3 = i * i2;
                if (byteBuffer.capacity() >= (i3 * 3) / 2) {
                    int i4 = i3 / 4;
                    byteBuffer.position(0);
                    byteBuffer.limit(i3);
                    ByteBuffer slice = byteBuffer.slice();
                    byteBuffer.position(i3);
                    int i5 = i3 + i4;
                    byteBuffer.limit(i5);
                    ByteBuffer slice2 = byteBuffer.slice();
                    byteBuffer.position(i5);
                    byteBuffer.limit(i5 + i4);
                    updateI420Image(this.mYuvTex, i, i2, slice, slice2, byteBuffer.slice(), null);
                    this.mTextureFrameBuffer.setSize(i, i2);
                    GLES20.glBindFramebuffer(36160, this.mTextureFrameBuffer.getFrameBufferId());
                    this.mGlDrawer.drawYuv(this.mYuvTex, RendererCommon.identityMatrix(), RendererCommon.identityMatrix(), 0, 0, i, i2);
                    GLES20.glFinish();
                    GLES20.glBindFramebuffer(36160, 0);
                    atomicBoolean.set(true);
                }
            }
        }

        public void onByteBufferVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
            onByteBufferVideoFrame(byteBuffer, i, i2, i3, j, null);
        }

        private void updateTexSubImage(int i, int i2, int i3, int i4, ByteBuffer byteBuffer) {
            GLES20.glActiveTexture(i);
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6409, 5121, byteBuffer);
        }

        public GameLayer(String str, int i, int i2, VideoMixerDescription videoMixerDescription) {
            super(str, i, i2, videoMixerDescription);
        }

        public void onTextureVideoFrame(int i, int i2, int i3, float[] fArr, int i4, long j) {
            onTextureVideoFrame(i, i2, i3, fArr, i4, j, null);
        }

        private void drawYuvAndRender(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
            if (loadYuvAndDraw(byteBuffer, i, i2)) {
                GlTextureFrameBuffer glTextureFrameBuffer = this.mTextureFrameBuffer;
                if (glTextureFrameBuffer != null) {
                    onTextureVideoFrame(glTextureFrameBuffer.getTextureId(), i, i2, null, i3, j, byteBuffer2);
                    return;
                }
                return;
            }
        }

        public void onByteBufferVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ByteBuffer byteBuffer2) {
            int i4 = i;
            int i5 = i2;
            if (!(this.mGlDrawer != null && i4 == this.mWidth && i5 == this.mHeight)) {
                createTexture(i, i2);
            }
            drawYuvAndRender(toDirectBuffer(byteBuffer), i, i2, i3, j, toDirectBuffer(byteBuffer2));
        }

        private void updateI420Image(int[] iArr, int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int[] iArr2) {
            int i3 = (i + 1) >> 1;
            int i4 = (i2 + 1) >> 1;
            updateTexSubImage(33984, iArr[0], i, i2, byteBuffer);
            int i5 = i3;
            int i6 = i4;
            updateTexSubImage(33985, iArr[1], i5, i6, byteBuffer2);
            updateTexSubImage(33986, iArr[2], i5, i6, byteBuffer3);
        }

        public void onTextureVideoFrame(int i, int i2, int i3, float[] fArr, int i4, long j, ByteBuffer byteBuffer) {
            VideoFrame videoFrame;
            int i5 = i;
            ByteBuffer byteBuffer2 = byteBuffer;
            VideoMixerTexture videoMixerTexture = new VideoMixerTexture(i2, i3, NormalGiftView.ALPHA_180, VideoMixer.TEXTURE_TYPE_2D, new int[]{i5, 0, 0}, null);
            renderFrame(videoMixerTexture);
            if (this.mVideoSink != null && !this.mRelease) {
                if (this.mTextureBuffer == null || this.mTextureBuffer.getTextureId() != i5) {
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i2, i3, Type.RGB, i, new Matrix(), (ToI420Interface) new ToI420Interface() {
                        public I420Buffer toI420(TextureBuffer textureBuffer) {
                            return null;
                        }
                    }, (Runnable) new Runnable() {
                        public void run() {
                            GameLayer.this.mFrameFence.countDown();
                        }
                    });
                    this.mTextureBuffer = textureBufferImpl;
                    videoFrame = new VideoFrame(this.mTextureBuffer, 0, j * 1000 * 1000);
                } else {
                    this.mTextureBuffer.retain();
                    this.mFrameFence = new CountDownLatch(1);
                    videoFrame = new VideoFrame(this.mTextureBuffer, 0, j * 1000 * 1000);
                }
                if (byteBuffer2 != null) {
                    int i6 = i2;
                    int i7 = i3;
                    AlgorithmResult parseParcel = AlgorithmResult.parseParcel(i6, i7, toDirectBuffer(byteBuffer2), this.mAlgorithmResult);
                    this.mTextureBuffer.updateExtraData(parseParcel);
                    if (parseParcel != null) {
                        this.mAlgorithmResult = parseParcel;
                    }
                }
                this.mVideoSink.onVideoFrame(this.mRandStreamId, videoFrame, 2);
                videoFrame.release();
                try {
                    this.mFrameFence.await();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$Layer */
    class Layer implements ILayerExt {
        private int mAnimationMode;
        private FrameAnimationBase mCurrentAnimation;
        private boolean mFirstFrame = true;
        protected int mHeight;
        protected String mName;
        private FrameAnimationBase mNextAnimation;
        private boolean mPause;
        protected int mTrackId;
        protected VideoMixerDescription mVideoMixerDescription;
        protected int mWidth;

        public int getHeight() {
            return this.mHeight;
        }

        public VideoMixerDescription getLayerDescription() {
            return this.mVideoMixerDescription;
        }

        public int getRealFps() {
            return 0;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public Canvas lockCanvas() {
            return null;
        }

        public String name() {
            return this.mName;
        }

        public void pause() {
            this.mPause = true;
        }

        public void release() {
        }

        public void resume() {
            this.mPause = false;
        }

        public void unlockCanvasAndPost(Canvas canvas, long j) {
        }

        public int getMixerOutHeight() {
            return LayerControl.this.mVideoMixer.getHeight();
        }

        public int getMixerOutWidth() {
            return LayerControl.this.mVideoMixer.getWidth();
        }

        public boolean isEnable() {
            return LayerControl.this.mVideoMixer.isEnable(this.mTrackId);
        }

        /* access modifiers changed from: protected */
        public void createMixerTrack() {
            this.mTrackId = LayerControl.this.mVideoMixer.createTrack();
            this.mVideoMixerDescription = LayerControl.this.mVideoMixer.getDescription(this.mTrackId);
        }

        public void dispose() {
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (directVideoMixer != null) {
                directVideoMixer.removeTrack(this.mTrackId);
                LayerControl.this.removeLayer((ILayerExt) this);
            }
        }

        public void setVisibility(int i) {
            throw new AndroidRuntimeException("Support later version");
        }

        public void setEnable(boolean z) {
            LayerControl.this.mVideoMixer.setEnable(this.mTrackId, z);
        }

        public void updateDescription(VideoMixerDescription videoMixerDescription) {
            if (videoMixerDescription != null) {
                this.mVideoMixerDescription.copy(videoMixerDescription);
                DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
                if (directVideoMixer != null) {
                    synchronized (directVideoMixer) {
                        directVideoMixer.updateDescription(this.mTrackId, this.mVideoMixerDescription);
                    }
                }
            }
        }

        private void animationUpdateOnPerFrame(VideoFrame videoFrame) {
            if (this.mNextAnimation != null) {
                if (this.mCurrentAnimation != null) {
                    this.mCurrentAnimation.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            if (this.mCurrentAnimation != null) {
                if (this.mCurrentAnimation.valid()) {
                    this.mCurrentAnimation.update(videoFrame);
                } else {
                    this.mCurrentAnimation.restore();
                    this.mCurrentAnimation = null;
                }
            }
        }

        public void renderFrame(VideoFrame videoFrame) {
            animationUpdateOnPerFrame(videoFrame);
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (this.mFirstFrame) {
                updateFrameInfo(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                this.mFirstFrame = false;
            }
            if (LayerControl.this.mVideoMixer != null) {
                directVideoMixer.onFrame(this.mTrackId, videoFrame);
            }
        }

        private void animationUpdateOnPerFrame(VideoMixerTexture videoMixerTexture) {
            if (this.mNextAnimation != null) {
                if (this.mCurrentAnimation != null) {
                    this.mCurrentAnimation.restore();
                    this.mCurrentAnimation = null;
                }
                this.mCurrentAnimation = this.mNextAnimation;
                this.mNextAnimation = null;
            }
            if (this.mCurrentAnimation != null) {
                if (this.mCurrentAnimation.valid()) {
                    this.mCurrentAnimation.update(videoMixerTexture);
                } else {
                    this.mCurrentAnimation.restore();
                    this.mCurrentAnimation = null;
                }
            }
        }

        public void renderFrame(VideoMixerTexture videoMixerTexture) {
            animationUpdateOnPerFrame(videoMixerTexture);
            if (this.mFirstFrame) {
                updateFrameInfo(videoMixerTexture.getWidth(), videoMixerTexture.getHeight());
                this.mFirstFrame = false;
            }
            DirectVideoMixer directVideoMixer = LayerControl.this.mVideoMixer;
            if (!this.mPause && directVideoMixer != null) {
                directVideoMixer.onFrame(this.mTrackId, videoMixerTexture);
            }
        }

        private void updateFrameInfo(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        public void setAnimationMode(int i, long j, RectF rectF) {
            this.mNextAnimation = FrameAnimationFactory.create(i, this, j, rectF, 30);
            this.mAnimationMode = i;
        }

        public Layer(String str, int i, int i2, VideoMixerDescription videoMixerDescription) {
            this.mName = str;
            this.mWidth = i;
            this.mHeight = i2;
            createMixerTrack();
            updateDescription(videoMixerDescription);
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.LayerControl$LayerEventListener */
    public interface LayerEventListener {
        void onHide();

        void onShow();

        boolean onTouch(View view, MotionEvent motionEvent);
    }

    public ILayer[] getLayers() {
        return null;
    }

    public RenderView getRenderView() {
        return this.mRenderView;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    public VideoMixer getVideoMixer() {
        return this.mVideoMixer;
    }

    public static int getStreamId() {
        return mAtomicInteger.incrementAndGet();
    }

    public ILayer getLocalOriginLayer() {
        return findLayer(this.mOriginName);
    }

    public int layerSize() {
        return this.mLayers.size();
    }

    public float getRealRenderFps() {
        if (this.mRenderView != null) {
            return this.mRenderView.getRealRatePerSeconds();
        }
        return 0.0f;
    }

    public boolean isDirectRenderMode() {
        DirectVideoMixer directVideoMixer = this.mVideoMixer;
        if (directVideoMixer != null) {
            return directVideoMixer.isDirectRenderMode();
        }
        return false;
    }

    public void pause() {
        if (this.mLayerEventListener != null) {
            this.mLayerEventListener.onHide();
        }
    }

    public void resume() {
        if (this.mLayerEventListener != null) {
            this.mLayerEventListener.onShow();
        }
    }

    public void dump() {
        synchronized (this.mLayers) {
            for (ILayerExt iLayerExt : this.mLayers) {
                StringBuilder sb = new StringBuilder("Dump Layer(name:");
                sb.append(iLayerExt.name());
                sb.append(",w:");
                sb.append(iLayerExt.getWidth());
                sb.append(",h:");
                sb.append(iLayerExt.getHeight());
                sb.append(",");
                sb.append(iLayerExt.getLayerDescription().toString());
                AVLog.ioi("LayerControl", sb.toString());
            }
        }
    }

    public void release() {
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(this);
        AVLog.ioi("LayerControl", sb.toString());
        dump();
        synchronized (this.mLayers) {
            for (ILayerExt iLayerExt : this.mLayers) {
                ((Layer) iLayerExt).release();
            }
            this.mLayers.clear();
        }
        if (this.mRenderView != null) {
            this.mRenderView.release();
            this.mRenderView = null;
        }
        if (this.mVideoMixer != null) {
            synchronized (this.mVideoMixer) {
                this.mVideoMixer.release();
                this.mVideoMixer = null;
            }
        }
    }

    public void setEventListener(LayerEventListener layerEventListener) {
        this.mLayerEventListener = layerEventListener;
    }

    public void setLocalOrigin(String str) {
        this.mOriginName = str;
    }

    private void removeLayer(String str) {
        removeLayer(findLayer(str));
    }

    public ILayer getLayer(String str) {
        return findLayer(str);
    }

    public void setOriginTriggering(String str) {
        ILayerExt findLayer = findLayer(str);
        if (findLayer != null) {
            this.mVideoMixer.setOriginTrackIndex(((Layer) findLayer).mTrackId);
        }
    }

    LayerControl(Handler handler) {
        StringBuilder sb = new StringBuilder("Construct ");
        sb.append(this);
        AVLog.ioi("LayerControl", sb.toString());
        this.mLayers = new ArrayList();
        this.mVideoMixer = new DirectVideoMixer();
        this.mVideoMixer.setEnable(true);
    }

    private ILayerExt findLayer(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.mLayers) {
            for (ILayerExt iLayerExt : this.mLayers) {
                if (iLayerExt.name().equals(str)) {
                    return iLayerExt;
                }
            }
            return null;
        }
    }

    public void setDisplay(View view) {
        MixerRenderView mixerRenderView = new MixerRenderView(view, this.mVideoMixer);
        if (view instanceof SurfaceView) {
            this.mSurfaceHolder = ((SurfaceView) view).getHolder();
        }
        this.mVideoMixer.updateView(mixerRenderView);
        if (this.mRenderView != null) {
            this.mRenderView.release();
        }
        this.mRenderView = mixerRenderView;
        view.setOnTouchListener(this);
    }

    private void addLayer(ILayerExt iLayerExt) {
        synchronized (this.mLayers) {
            String str = "LayerControl";
            StringBuilder sb = new StringBuilder("Create Layer(name:");
            sb.append(iLayerExt.name());
            sb.append(",w:");
            sb.append(iLayerExt.getWidth());
            sb.append(",h:");
            sb.append(iLayerExt.getHeight());
            sb.append(")");
            AVLog.ioi(str, sb.toString());
            if (!this.mLayers.contains(iLayerExt)) {
                this.mLayers.add(iLayerExt);
            } else {
                throw new AndroidRuntimeException("BUG");
            }
        }
    }

    public void removeLayer(ILayerExt iLayerExt) {
        if (iLayerExt != null) {
            synchronized (this.mLayers) {
                String str = "LayerControl";
                StringBuilder sb = new StringBuilder("Remove Layer(name:");
                sb.append(iLayerExt.name());
                sb.append(",w:");
                sb.append(iLayerExt.getWidth());
                sb.append(",h:");
                sb.append(iLayerExt.getHeight());
                sb.append(")");
                AVLog.ioi(str, sb.toString());
                this.mLayers.remove(iLayerExt);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.mLayerEventListener != null) {
            return this.mLayerEventListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public ILayer createLayer(String str, VideoMixerDescription videoMixerDescription, int i, int i2) {
        return createLayerExt(str, videoMixerDescription, i, i2, 1);
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [com.ss.avframework.livestreamv2.core.ILayerControlExt$ILayerExt] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.avframework.livestreamv2.core.LayerControl$GameLayer] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.ss.avframework.livestreamv2.core.LayerControl$Layer] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.avframework.livestreamv2.core.LayerControl$GameLayer] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.ss.avframework.livestreamv2.core.LayerControl$Layer] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5, types: [com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer]
      assigns: [com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer, com.ss.avframework.livestreamv2.core.LayerControl$GameLayer, com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer, com.ss.avframework.livestreamv2.core.LayerControl$Layer]
      uses: [com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer, com.ss.avframework.livestreamv2.core.ILayerControlExt$ILayerExt, com.ss.avframework.livestreamv2.core.LayerControl$GameLayer, com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer, com.ss.avframework.livestreamv2.core.LayerControl$Layer]
      mth insns count: 45
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p683ss.avframework.livestreamv2.core.ILayerControlExt.ILayerExt createLayerExt(java.lang.String r8, com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            com.ss.avframework.livestreamv2.core.ILayerControlExt$ILayerExt r0 = r7.findLayer(r8)
            if (r0 == 0) goto L_0x0029
            java.security.InvalidParameterException r9 = new java.security.InvalidParameterException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Layer name '"
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = "' already exist."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            java.lang.String r8 = "LayerControl"
            java.lang.String r10 = r9.getMessage()
            com.p683ss.avframework.utils.AVLog.ioe(r8, r10, r9)
            r8 = 0
            return r8
        L_0x0029:
            r0 = 1
            if (r12 == r0) goto L_0x0053
            switch(r12) {
                case 3: goto L_0x0047;
                case 4: goto L_0x003b;
                default: goto L_0x002f;
            }
        L_0x002f:
            com.ss.avframework.livestreamv2.core.LayerControl$Layer r12 = new com.ss.avframework.livestreamv2.core.LayerControl$Layer
            r1 = r12
            r2 = r7
            r3 = r8
            r4 = r10
            r5 = r11
            r6 = r9
            r1.<init>(r3, r4, r5, r6)
            goto L_0x005e
        L_0x003b:
            com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer r12 = new com.ss.avframework.livestreamv2.core.LayerControl$DirectLayer
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r9
            r0.<init>(r2, r3, r4, r5)
            goto L_0x005e
        L_0x0047:
            com.ss.avframework.livestreamv2.core.LayerControl$GameLayer r12 = new com.ss.avframework.livestreamv2.core.LayerControl$GameLayer
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r9
            r0.<init>(r2, r3, r4, r5)
            goto L_0x005e
        L_0x0053:
            com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer r12 = new com.ss.avframework.livestreamv2.core.LayerControl$CanvasLayer
            r0 = r12
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r9
            r0.<init>(r2, r3, r4, r5)
        L_0x005e:
            r7.addLayer(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.avframework.livestreamv2.core.LayerControl.createLayerExt(java.lang.String, com.ss.avframework.mixer.VideoMixer$VideoMixerDescription, int, int, int):com.ss.avframework.livestreamv2.core.ILayerControlExt$ILayerExt");
    }
}
