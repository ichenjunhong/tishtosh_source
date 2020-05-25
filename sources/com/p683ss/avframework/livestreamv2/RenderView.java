package com.p683ss.avframework.livestreamv2;

import android.opengl.Matrix;
import android.view.SurfaceView;
import android.view.View;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.opengl.GLRenderVideoSink;
import com.p683ss.avframework.opengl.GLRenderVideoSink.GLRenderer;
import com.p683ss.avframework.opengl.GlRenderDrawer;
import com.p683ss.avframework.opengl.RendererCommon;
import com.p683ss.avframework.utils.AVLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.RenderView */
public class RenderView extends GLRenderVideoSink implements GLRenderer {
    private GlRenderDrawer mDrawer;
    private boolean mFitMode;
    private int mFrameHeight;
    private int mFrameWidth;
    private boolean mMirrorX;
    private boolean mMirrorY;
    private float[] mPrj;
    private Statistict mRealRateStatistict;
    private VideoFrameRender mRenderFrame;
    private boolean mSizedChanged;
    protected int mWindHeight;
    protected int mWindWidth;

    /* renamed from: com.ss.avframework.livestreamv2.RenderView$Statistict */
    class Statistict {
        private List<Long> mList;
        private final int mWinMs;

        public void add() {
            synchronized (this.mList) {
                update();
                this.mList.add(Long.valueOf(System.currentTimeMillis()));
            }
        }

        private void update() {
            if (!this.mList.isEmpty()) {
                Long valueOf = Long.valueOf(System.currentTimeMillis() - ((long) this.mWinMs));
                while (!this.mList.isEmpty()) {
                    Long l = (Long) this.mList.get(0);
                    if (l.longValue() < valueOf.longValue()) {
                        this.mList.remove(l);
                    } else {
                        return;
                    }
                }
            }
        }

        public float getRealRatePerSecond() {
            synchronized (this.mList) {
                update();
                if (this.mList.isEmpty()) {
                    return 0.0f;
                }
                Long valueOf = Long.valueOf(((Long) this.mList.get(this.mList.size() - 1)).longValue() - ((Long) this.mList.get(0)).longValue());
                if (valueOf.longValue() == 0) {
                    return 0.0f;
                }
                float size = (((float) this.mList.size()) * 1000.0f) / ((float) valueOf.longValue());
                return size;
            }
        }

        private Statistict(int i) {
            this.mList = new ArrayList();
            this.mWinMs = i;
        }
    }

    public boolean isFitMode() {
        return this.mFitMode;
    }

    public float getRealRatePerSeconds() {
        if (this.mRealRateStatistict != null) {
            return this.mRealRateStatistict.getRealRatePerSecond();
        }
        return 0.0f;
    }

    public void onSurfaceCreated() {
        this.mDrawer = new GlRenderDrawer();
        this.mRenderFrame = new VideoFrameRender();
    }

    public void onSurfaceDestroy() {
        if (this.mDrawer != null) {
            this.mDrawer.release();
            this.mDrawer = null;
        }
        if (this.mRenderFrame != null) {
            this.mRenderFrame.release();
            this.mRenderFrame = null;
        }
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    public RenderView(SurfaceView surfaceView) {
        super(surfaceView);
        this.mPrj = new float[16];
        setRenderer(this);
        Matrix.setIdentityM(this.mPrj, 0);
        this.mRenderFrame = new VideoFrameRender();
    }

    public RenderView(View view) {
        super(view);
        this.mPrj = new float[16];
        setRenderer(this);
        Matrix.setIdentityM(this.mPrj, 0);
        this.mRenderFrame = new VideoFrameRender();
    }

    public void onDrawFrame(VideoFrame videoFrame) {
        if (this.mDrawer != null) {
            if (this.mRealRateStatistict != null) {
                this.mRealRateStatistict.add();
            }
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (!(!this.mSizedChanged && rotatedHeight == this.mFrameHeight && rotatedWidth == this.mFrameWidth)) {
                calcViewRatio(rotatedWidth, rotatedHeight);
                this.mSizedChanged = false;
            }
            VideoFrameRender videoFrameRender = this.mRenderFrame;
            GlRenderDrawer glRenderDrawer = this.mDrawer;
            if (!(videoFrameRender == null || glRenderDrawer == null)) {
                if (!videoFrameRender.drawFrame(videoFrame, glRenderDrawer, this.mPrj, null, 0, 0, this.mWindWidth, this.mWindHeight)) {
                    StringBuilder sb = new StringBuilder("Render frame failed timestamp ");
                    sb.append(videoFrame.getTimestampNs());
                    AVLog.m110011w("RenderView", sb.toString());
                }
            }
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        this.mWindWidth = i;
        this.mWindHeight = i2;
        this.mSizedChanged = true;
    }

    public RenderView(SurfaceView surfaceView, boolean z) {
        this(surfaceView);
        if (z) {
            this.mRealRateStatistict = new Statistict(1000);
        }
    }

    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    private void calcViewRatio(int i, int i2) {
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
        Matrix.setIdentityM(this.mPrj, 0);
        RendererCommon.calcWindRatio(this.mFitMode, this.mMirrorX, this.mMirrorY, this.mWindWidth, this.mWindHeight, i, i2, this.mPrj);
    }

    public RenderView(View view, boolean z) {
        super(view);
        this.mPrj = new float[16];
        setRenderer(this);
        Matrix.setIdentityM(this.mPrj, 0);
        this.mRenderFrame = new VideoFrameRender();
        if (z) {
            this.mRealRateStatistict = new Statistict(1000);
        }
    }
}
