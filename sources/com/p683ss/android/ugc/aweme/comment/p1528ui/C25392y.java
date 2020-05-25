package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.p683ss.android.ugc.aweme.common.p1593e.C26869c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.y */
public abstract class C25392y extends C26869c {
    /* renamed from: a */
    public abstract void mo51134a(View view);

    /* renamed from: b */
    public final Animator mo51960b(View view) {
        C52711k.m112240b(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.75f});
        C52711k.m112236a((Object) ofFloat, "animator");
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: c */
    public final Animator mo51961c(View view) {
        C52711k.m112240b(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.75f, 1.0f});
        C52711k.m112236a((Object) ofFloat, "animator");
        ofFloat.setDuration(150);
        return ofFloat;
    }

    /* renamed from: a */
    public final void mo51959a(View view, MotionEvent motionEvent) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(motionEvent, "event");
        mo51134a(view);
    }
}
