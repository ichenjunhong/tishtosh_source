package com.p683ss.android.ugc.aweme.live.sdk.chatroom.p1925ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.p683ss.android.ugc.aweme.port.internal.C39655e.C39656a;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b */
public final class C36157b {

    /* renamed from: a */
    public int f92591a;

    /* renamed from: b */
    float f92592b;

    /* renamed from: c */
    LinkedList<View> f92593c = new LinkedList<>();

    /* renamed from: d */
    public ViewGroup f92594d;

    /* renamed from: e */
    public C39656a f92595e;

    /* renamed from: f */
    private ValueAnimator f92596f;

    /* renamed from: a */
    public final void mo74893a() {
        if (this.f92596f != null) {
            this.f92596f.cancel();
            this.f92596f = null;
        }
        if (this.f92591a == 2) {
            this.f92596f = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        } else {
            this.f92596f = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
        }
        this.f92596f.setDuration(300);
        this.f92596f.setInterpolator(new LinearInterpolator());
        this.f92596f.addUpdateListener(new C36159c(this));
        this.f92596f.addListener(new AnimatorListener() {
            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                switch (C36157b.this.f92591a) {
                    case 1:
                        C36157b.this.mo74894a(0.0f);
                        break;
                    case 2:
                        C36157b.this.mo74894a(1.0f);
                        return;
                }
            }

            public final void onAnimationStart(Animator animator) {
                C36157b.this.f92594d.setEnabled(false);
                C36157b.this.f92594d.setVisibility(0);
                if (C36157b.this.f92591a == 1 && C36157b.this.f92595e != null) {
                    C36157b.this.f92595e.mo80737b();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C36157b.this.f92594d.setEnabled(true);
                if (C36157b.this.f92591a == 2) {
                    C36157b.this.f92594d.setVisibility(8);
                    if (C36157b.this.f92595e != null) {
                        C36157b.this.f92595e.mo80736a();
                    }
                }
                switch (C36157b.this.f92591a) {
                    case 1:
                        C36157b.this.mo74894a(0.0f);
                        break;
                    case 2:
                        C36157b.this.mo74894a(1.0f);
                        return;
                }
            }
        });
        this.f92596f.start();
    }

    public C36157b(ViewGroup viewGroup) {
        this.f92594d = viewGroup;
    }

    /* renamed from: a */
    public final void mo74894a(float f) {
        Iterator it = this.f92593c.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setAlpha(f);
            if (f == 0.0f) {
                view.setEnabled(false);
            }
            if (f == 1.0f) {
                view.setEnabled(true);
            }
        }
    }
}
