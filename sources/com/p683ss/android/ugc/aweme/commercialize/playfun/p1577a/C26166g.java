package com.p683ss.android.ugc.aweme.commercialize.playfun.p1577a;

import android.animation.Animator;
import android.graphics.Point;
import android.graphics.PointF;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26155a;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26172e;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.g */
public final class C26166g extends C26172e {

    /* renamed from: c */
    public Animator f69084c;

    /* renamed from: d */
    private Animator f69085d;

    /* renamed from: e */
    public final boolean mo53785e() {
        return true;
    }

    /* renamed from: d */
    public final void mo53782d() {
        super.mo53782d();
        Animator animator = this.f69084c;
        if (animator != null) {
            animator.cancel();
        }
        this.f69084c = null;
        Animator animator2 = this.f69085d;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f69085d = null;
    }

    /* renamed from: a */
    public final void mo53778a() {
        m63447a("WidgetShowState---handle");
        this.f69111b.mo53800a("hanging");
        this.f69111b.f69117f.setVisibility(8);
        PointF c = this.f69111b.mo53803c();
        if (this.f69111b.f69116e.getTranslationY() != c.y) {
            this.f69085d = C26155a.m63418a(this.f69111b.f69116e, c.y);
            Animator animator = this.f69085d;
            if (animator != null) {
                animator.start();
            }
        }
        this.f69111b.mo53801a("become_widget", new Point((int) this.f69111b.f69116e.getTranslationX(), (int) this.f69111b.f69116e.getTranslationY()), null);
        DataCenter dataCenter = this.f69111b.f69118g;
        if (dataCenter != null) {
            dataCenter.mo48228a("ON_AD_PLAY_FUN_STATE_WIDGET_SHOW", (Object) null);
        }
    }

    public C26166g(C26173f fVar) {
        C52711k.m112240b(fVar, "stateContext");
        super(fVar);
    }
}
