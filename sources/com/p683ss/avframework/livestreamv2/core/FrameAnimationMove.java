package com.p683ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;
import com.p683ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.core.FrameAnimationMove */
class FrameAnimationMove extends FrameAnimationBase {
    protected float mDeltaXPerFrame;
    protected float mDeltaYPerFrame;

    /* access modifiers changed from: protected */
    public void updateRect(RectF rectF) {
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

    /* access modifiers changed from: protected */
    public void calculation() {
        float centerX = this.mTargetRect.centerX() - this.mCurrentRect.centerX();
        float centerY = this.mTargetRect.centerY() - this.mCurrentRect.centerY();
        if (!((centerX == 0.0f && centerY == 0.0f) || this.mTotalFrames == 0)) {
            this.mDeltaXPerFrame = centerX / ((float) this.mTotalFrames);
            this.mDeltaYPerFrame = centerY / ((float) this.mTotalFrames);
            this.mContinue = true;
        }
        StringBuilder sb = new StringBuilder("mDeltaXPerFrame ");
        sb.append(this.mDeltaXPerFrame);
        sb.append(" mDeltaYPerFrame ");
        sb.append(this.mDeltaYPerFrame);
        sb.append(" deltaX ");
        sb.append(centerX);
        sb.append(" deltaY ");
        sb.append(centerY);
        sb.append(" fps ");
        sb.append(this.mFps);
        sb.append(" totalFrames ");
        sb.append(this.mTotalFrames);
        sb.append(" continue ");
        sb.append(this.mContinue);
        AVLog.ioi("FrameAnimationMove", sb.toString());
    }

    public void update(VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    /* access modifiers changed from: protected */
    public void updateDescription(VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2);
        AVLog.m110011w("FrameAnimationMove", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    public void update(VideoFrame videoFrame) {
        this.mCurrentAnimationFrameIndex++;
        if (valid()) {
            this.mCurrentRect.offset(this.mDeltaXPerFrame, this.mDeltaYPerFrame);
            VideoMixerDescription videoMixerDescription = new VideoMixerDescription();
            updateRect(this.mCurrentRect);
            videoMixerDescription.copy(this.mCurrentDescription);
            videoMixerDescription.left = this.mCurrentRect.left;
            videoMixerDescription.top = this.mCurrentRect.top;
            videoMixerDescription.right = this.mCurrentRect.right;
            videoMixerDescription.bottom = this.mCurrentRect.bottom;
            updateDescription(videoMixerDescription);
        }
        if (this.mCurrentAnimationFrameIndex >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    public FrameAnimationMove(int i, Layer layer, long j, RectF rectF, int i2) {
        super(i, layer, j, rectF, i2);
    }
}
