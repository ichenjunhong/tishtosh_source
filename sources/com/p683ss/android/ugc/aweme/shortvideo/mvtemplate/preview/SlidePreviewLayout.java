package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout */
public final class SlidePreviewLayout extends FrameLayout {

    /* renamed from: a */
    private final int f111974a;

    /* renamed from: b */
    private int f111975b;

    /* renamed from: c */
    private int f111976c;

    /* renamed from: d */
    private C44206a f111977d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout$a */
    public interface C44206a {
        /* renamed from: a */
        void mo90125a(boolean z);
    }

    public SlidePreviewLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public SlidePreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setCallback(C44206a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f111977d = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f111975b = (int) motionEvent.getX();
            this.f111976c = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 2 || Math.abs(((int) motionEvent.getX()) - this.f111975b) <= this.f111974a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1 && Math.abs(motionEvent.getX() - ((float) this.f111975b)) > Math.abs(motionEvent.getY() - ((float) this.f111976c))) {
            if (motionEvent.getX() - ((float) this.f111975b) > ((float) this.f111974a)) {
                C44206a aVar = this.f111977d;
                if (aVar != null) {
                    aVar.mo90125a(true);
                }
                return true;
            } else if (((float) this.f111975b) - motionEvent.getX() > ((float) this.f111974a)) {
                C44206a aVar2 = this.f111977d;
                if (aVar2 != null) {
                    aVar2.mo90125a(false);
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public SlidePreviewLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f111974a = 20;
    }

    public /* synthetic */ SlidePreviewLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
