package com.p683ss.android.ugc.aweme.main.guide;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.main.guide.ScrollToFeedFollowGuideView */
public class ScrollToFeedFollowGuideView extends FrameLayout implements AnimatorListener, AnimatorUpdateListener, OnGestureListener {

    /* renamed from: a */
    GestureDetector f93799a;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public ScrollToFeedFollowGuideView(Context context) {
        this(context, null);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        m82566a(0);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        getChildAt(0).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m82566a(500);
        return this.f93799a.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private void m82566a(long j) {
        C47718bf.m103288a(new C36659d(false));
        C36660e.f93806a = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public ScrollToFeedFollowGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollToFeedFollowGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        animate().alpha(1.0f).setDuration(1000).start();
        this.f93799a = new GestureDetector(getContext(), this);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        m82566a(500);
        return true;
    }
}
