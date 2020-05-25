package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout */
public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private C40421b f103200a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout$a */
    public static class C40420a implements C40421b {
        /* renamed from: a */
        public void mo82114a(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout$b */
    public interface C40421b {
        /* renamed from: a */
        void mo82114a(MotionEvent motionEvent);
    }

    public SwitchModeFrameLayout(Context context) {
        super(context);
    }

    public void setIntercepter(C40421b bVar) {
        this.f103200a = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f103200a != null) {
            this.f103200a.mo82114a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
