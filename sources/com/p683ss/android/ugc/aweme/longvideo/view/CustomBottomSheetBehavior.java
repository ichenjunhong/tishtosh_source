package com.p683ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior */
public final class CustomBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: v */
    private C36388a f93164v;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior$a */
    public interface C36388a {
        /* renamed from: a */
        void mo75246a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent);
    }

    public CustomBottomSheetBehavior() {
    }

    /* renamed from: a */
    public final void mo75309a(C36388a aVar) {
        C52711k.m112240b(aVar, "onTouchEventCallBack");
        this.f93164v = aVar;
    }

    public CustomBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "ctx");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo1171a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C52711k.m112240b(coordinatorLayout, "parent");
        C52711k.m112240b(v, "child");
        C52711k.m112240b(motionEvent, "event");
        C36388a aVar = this.f93164v;
        if (aVar != null) {
            aVar.mo75246a(coordinatorLayout, v, motionEvent);
        }
        return super.mo1171a(coordinatorLayout, (View) v, motionEvent);
    }
}
