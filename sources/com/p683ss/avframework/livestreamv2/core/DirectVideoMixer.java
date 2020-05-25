package com.p683ss.avframework.livestreamv2.core;

import android.view.View;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.engine.VideoSink;
import com.p683ss.avframework.livestreamv2.RenderView;
import com.p683ss.avframework.mixer.VideoMixer;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer */
class DirectVideoMixer extends VideoMixer {
    private boolean mDirectRender;
    private int mHeight;
    public WeakReference<MixerRenderView> mRenderView;
    private VideoSinkInternal mVideoSinkInternal = new VideoSinkInternal();
    private int mWidth;

    /* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer$MixerRenderView */
    public static class MixerRenderView extends RenderView {
        private WeakReference<DirectVideoMixer> mVideoMixer;

        public synchronized void release() {
            this.mVideoMixer = null;
            super.release();
        }

        public void onSurfaceCreated() {
            super.onSurfaceCreated();
            StringBuilder sb = new StringBuilder("surface Create ");
            sb.append(this);
            AVLog.ioi("MixerRenderView", sb.toString());
        }

        public void onSurfaceDestroy() {
            super.onSurfaceDestroy();
            StringBuilder sb = new StringBuilder("surface Destroy ");
            sb.append(this);
            AVLog.ioi("MixerRenderView", sb.toString());
        }

        public MixerRenderView(View view, DirectVideoMixer directVideoMixer) {
            super(view, true);
            this.mVideoMixer = new WeakReference<>(directVideoMixer);
        }

        public void onSurfaceChanged(int i, int i2) {
            super.onSurfaceChanged(i, i2);
            DirectVideoMixer directVideoMixer = (DirectVideoMixer) this.mVideoMixer.get();
            if (directVideoMixer != null) {
                directVideoMixer.updateSize(i, i2);
            }
            StringBuilder sb = new StringBuilder("surface Change(");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append(")");
            sb.append(this);
            AVLog.ioi("MixerRenderView", sb.toString());
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer$VideoSinkInternal */
    class VideoSinkInternal extends VideoSink {
        public void OnDiscardedFrame() {
        }

        public synchronized void release() {
            super.release();
        }

        VideoSinkInternal() {
        }

        public void onFrame(VideoFrame videoFrame) {
            RenderView renderView = (RenderView) DirectVideoMixer.this.mRenderView.get();
            if (renderView != null) {
                renderView.onFrame(videoFrame);
            }
        }
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isDirectRenderMode() {
        return this.mDirectRender;
    }

    public synchronized void release() {
        this.mRenderView = new WeakReference<>(null);
        RemoveVideoSink(this.mVideoSinkInternal);
        this.mVideoSinkInternal.release();
        this.mVideoSinkInternal = null;
        super.release();
    }

    public DirectVideoMixer() {
        AddVideoSink(this.mVideoSinkInternal);
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        this.mWidth = tEBundle.getInt("vmixer_width");
        this.mHeight = tEBundle.getInt("vmixer_height");
        tEBundle.setBool("vmixer_enable_gl_finish", GLThreadManager.isNeedFinish());
        setParameter(tEBundle);
        tEBundle.release();
        enableDirectRender(false);
    }

    public void enableDirectRender(boolean z) {
        this.mDirectRender = z;
        setEnable(!z);
    }

    public void updateView(MixerRenderView mixerRenderView) {
        this.mRenderView = new WeakReference<>(mixerRenderView);
    }

    public int onDirectFrame(VideoFrame videoFrame) {
        if (this.mDirectRender) {
            RenderView renderView = (RenderView) this.mRenderView.get();
            if (renderView != null) {
                renderView.onFrame(videoFrame);
            }
        }
        return 0;
    }

    public int onFrame(int i, VideoFrame videoFrame) {
        synchronized (this) {
            if (this.mDirectRender) {
                return -1;
            }
            int mixFrame = mixFrame(i, videoFrame);
            return mixFrame;
        }
    }

    public void updateSize(int i, int i2) {
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        tEBundle.setInt("vmixer_width", i);
        tEBundle.setInt("vmixer_height", i2);
        setParameter(tEBundle);
        tEBundle.release();
        this.mWidth = i;
        this.mHeight = i2;
    }

    public int onFrame(int i, VideoMixerTexture videoMixerTexture) {
        synchronized (this) {
            if (this.mDirectRender) {
                return -1;
            }
            int mixFrame = mixFrame(i, videoMixerTexture);
            return mixFrame;
        }
    }
}
