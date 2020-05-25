package com.p683ss.avframework.livestreamv2.core;

import android.graphics.RectF;

/* renamed from: com.ss.avframework.livestreamv2.core.FrameAnimationFactory */
class FrameAnimationFactory {
    FrameAnimationFactory() {
    }

    public static FrameAnimationBase create(int i, Layer layer, long j, RectF rectF, int i2) {
        switch (i) {
            case 0:
                return null;
            case 1:
                FrameAnimationRotation frameAnimationRotation = new FrameAnimationRotation(i, layer, j, rectF, i2);
                return frameAnimationRotation;
            case 2:
                FrameAnimationGradualRect frameAnimationGradualRect = new FrameAnimationGradualRect(i, layer, j, rectF, i2);
                return frameAnimationGradualRect;
            case 3:
                FrameAnimationMove frameAnimationMove = new FrameAnimationMove(i, layer, j, rectF, i2);
                return frameAnimationMove;
            default:
                FrameAnimationBase frameAnimationBase = new FrameAnimationBase(i, layer, j, rectF, i2);
                return frameAnimationBase;
        }
    }
}
