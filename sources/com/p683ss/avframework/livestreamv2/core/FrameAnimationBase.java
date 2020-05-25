package com.p683ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import com.p683ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.core.FrameAnimationBase */
class FrameAnimationBase {
    protected long mAnimationTimeMs;
    protected boolean mContinue;
    protected int mCurrentAnimationFrameIndex;
    protected VideoMixerDescription mCurrentDescription = new VideoMixerDescription();
    protected RectF mCurrentRect;
    protected int mFps;
    protected Layer mLayer;
    protected RectF mTargetRect;
    protected int mTotalFrames;
    protected int mType;

    public int getType() {
        return this.mType;
    }

    public boolean valid() {
        return this.mContinue;
    }

    /* access modifiers changed from: protected */
    public void calculation() {
        this.mTotalFrames = (int) ((((float) this.mAnimationTimeMs) / 1000.0f) * ((float) this.mFps));
    }

    public void restore() {
        VideoMixerDescription videoMixerDescription = new VideoMixerDescription();
        videoMixerDescription.copy(this.mCurrentDescription);
        videoMixerDescription.left = this.mTargetRect.left;
        videoMixerDescription.top = this.mTargetRect.top;
        videoMixerDescription.right = this.mTargetRect.right;
        videoMixerDescription.bottom = this.mTargetRect.bottom;
        updateDescription(videoMixerDescription);
    }

    public void update(VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    public void update(VideoFrame videoFrame) {
        this.mCurrentAnimationFrameIndex++;
        if (this.mCurrentAnimationFrameIndex >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    /* access modifiers changed from: protected */
    public void updateDescription(VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2).setzOrder(2147483646);
        AVLog.m110011w("FrameAnimationBase", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    public FrameAnimationBase(int i, Layer layer, long j, RectF rectF, int i2) {
        this.mType = i;
        this.mLayer = layer;
        this.mAnimationTimeMs = j;
        this.mFps = i2;
        this.mCurrentDescription.copy(this.mLayer.getLayerDescription());
        this.mTargetRect = rectF;
        this.mCurrentRect = new RectF(this.mCurrentDescription.left, this.mCurrentDescription.top, this.mCurrentDescription.right, this.mCurrentDescription.bottom);
        calculation();
    }
}
