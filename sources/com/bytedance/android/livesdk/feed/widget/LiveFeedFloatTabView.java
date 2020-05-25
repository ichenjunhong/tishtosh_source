package com.bytedance.android.livesdk.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import java.util.List;

public class LiveFeedFloatTabView extends LiveTabIndicator {

    /* renamed from: a */
    public boolean f19439a;

    /* renamed from: c */
    private boolean f19440c;

    /* renamed from: d */
    private Animator f19441d;

    /* renamed from: e */
    private Animator f19442e;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19440c = true;
    }

    /* renamed from: c */
    public final void mo13277c() {
        if (this.f19440c) {
            if (this.f19441d != null && this.f19441d.isRunning()) {
                this.f19441d.cancel();
            }
            setTranslationY((float) (-getHeight()));
            this.f19439a = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f19440c = false;
        if (this.f19441d != null && this.f19441d.isRunning()) {
            this.f19441d.cancel();
        }
        if (this.f19442e != null && this.f19442e.isRunning()) {
            this.f19442e.cancel();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo13275a() {
        if (this.f19440c && !this.f19439a) {
            if (this.f19442e != null && this.f19442e.isRunning()) {
                this.f19442e.cancel();
            }
            this.f19441d = ObjectAnimator.ofFloat(this, "translationY", new float[]{getTranslationY(), 0.0f});
            this.f19441d.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    LiveFeedFloatTabView.this.f19439a = true;
                }
            });
            this.f19441d.start();
        }
    }

    /* renamed from: b */
    public final void mo13276b() {
        if (this.f19440c && this.f19439a) {
            if (this.f19441d != null && this.f19441d.isRunning()) {
                this.f19441d.cancel();
            }
            this.f19442e = ObjectAnimator.ofFloat(this, "translationY", new float[]{getTranslationY(), (float) (-getHeight())});
            this.f19442e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    LiveFeedFloatTabView.this.f19439a = false;
                }
            });
            this.f19442e.start();
        }
    }

    public void setTabList(List<C6945f> list) {
        setTitles(list);
    }

    public LiveFeedFloatTabView(Context context) {
        this(context, null);
    }

    public LiveFeedFloatTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveFeedFloatTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
