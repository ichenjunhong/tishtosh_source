package com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26172e;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a */
public class C26157a extends C26172e {

    /* renamed from: c */
    public Animator f69076c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.a$a */
    public static final class C26158a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C26157a f69077a;

        C26158a(C26157a aVar) {
            this.f69077a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f69077a.mo53797f();
        }

        public final void onAnimationCancel(Animator animator) {
            this.f69077a.f69111b.mo53799a(1);
        }
    }

    /* renamed from: a */
    public void mo53778a() {
    }

    /* renamed from: b */
    public final void mo53780b() {
        Animator animator = this.f69076c;
        if (animator != null) {
            animator.pause();
        }
    }

    /* renamed from: c */
    public final void mo53781c() {
        Animator animator = this.f69076c;
        if (animator != null) {
            animator.resume();
        }
    }

    /* renamed from: d */
    public void mo53782d() {
        Animator animator = this.f69076c;
        if (animator != null) {
            animator.cancel();
        }
        mo53779a(null);
    }

    public C26157a(C26173f fVar) {
        C52711k.m112240b(fVar, "stateContext");
        super(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53779a(Animator animator) {
        this.f69076c = animator;
        Animator animator2 = this.f69076c;
        if (animator2 != null) {
            animator2.addListener(new C26158a(this));
        }
    }
}
