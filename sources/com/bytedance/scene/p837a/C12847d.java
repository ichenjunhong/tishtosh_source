package com.bytedance.scene.p837a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.view.View;
import com.bytedance.scene.p841c.C12866a;
import com.bytedance.scene.p841c.C12866a.C12867a;
import com.bytedance.scene.p841c.C12868b;
import com.bytedance.scene.p841c.C12868b.C12869a;
import com.bytedance.scene.p841c.C12872e;

/* renamed from: com.bytedance.scene.a.d */
public abstract class C12847d extends C12837c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Animator mo24299a(C12828a aVar, C12828a aVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo24300a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Animator mo24301b(C12828a aVar, C12828a aVar2);

    /* renamed from: a */
    public final void mo24304a(C12828a aVar, C12828a aVar2, Runnable runnable, C12868b bVar) {
        final C12867a aVar3;
        final C12867a aVar4;
        C12828a aVar5 = aVar;
        C12828a aVar6 = aVar2;
        View view = aVar5.f33605b;
        View view2 = aVar6.f33605b;
        if (aVar5.f33607d) {
            aVar3 = C12866a.m25782b(view);
        } else {
            C12866a.m25780a(view);
            aVar3 = null;
        }
        if (aVar6.f33607d) {
            aVar4 = C12866a.m25782b(view2);
        } else {
            C12866a.m25780a(view2);
            aVar4 = null;
        }
        view.setVisibility(0);
        final float o = C1056u.m3069o(view);
        if (o > 0.0f) {
            C1056u.m3048c(view, 0.0f);
        }
        final Animator a = mo24299a(aVar, aVar2);
        if (!mo24300a()) {
            a.setDuration(300);
        }
        final C12828a aVar7 = aVar2;
        final View view3 = view;
        final C12828a aVar8 = aVar;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        C128481 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!aVar7.f33607d) {
                    view3.setVisibility(8);
                }
                if (o > 0.0f) {
                    C1056u.m3048c(view3, o);
                }
                if (aVar8.f33607d) {
                    C12866a.m25781a(view3, aVar3);
                } else {
                    C12866a.m25780a(view3);
                }
                if (aVar7.f33607d) {
                    C12866a.m25781a(view4, aVar4);
                } else {
                    C12866a.m25780a(view4);
                }
                runnable2.run();
            }
        };
        a.addListener(r0);
        a.addListener(new C12872e(view));
        a.addListener(new C12872e(view2));
        a.start();
        bVar.mo24330a(new C12869a() {
            /* renamed from: a */
            public final void mo24307a() {
                a.end();
            }
        });
    }

    /* renamed from: b */
    public final void mo24305b(C12828a aVar, C12828a aVar2, Runnable runnable, C12868b bVar) {
        final C12867a aVar3;
        final C12867a aVar4;
        C12828a aVar5 = aVar;
        C12828a aVar6 = aVar2;
        View view = aVar5.f33605b;
        View view2 = aVar6.f33605b;
        if (aVar5.f33607d) {
            aVar3 = C12866a.m25782b(view);
        } else {
            C12866a.m25780a(view);
            aVar3 = null;
        }
        if (aVar6.f33607d) {
            aVar4 = C12866a.m25782b(view2);
        } else {
            C12866a.m25780a(view2);
            aVar4 = null;
        }
        view.setVisibility(0);
        if (VERSION.SDK_INT >= 18) {
            this.f33614a.getOverlay().add(view);
        } else {
            this.f33614a.addView(view);
        }
        final Animator b = mo24301b(aVar, aVar2);
        if (!mo24300a()) {
            b.setDuration(300);
        }
        final C12828a aVar7 = aVar;
        final View view3 = view;
        final C12828a aVar8 = aVar2;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        C128503 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (aVar7.f33607d) {
                    C12866a.m25781a(view3, aVar3);
                } else {
                    C12866a.m25780a(view3);
                }
                if (aVar8.f33607d) {
                    C12866a.m25781a(view4, aVar4);
                } else {
                    C12866a.m25780a(view4);
                }
                if (VERSION.SDK_INT >= 18) {
                    C12847d.this.f33614a.getOverlay().remove(view3);
                } else {
                    C12847d.this.f33614a.removeView(view3);
                }
                runnable2.run();
            }
        };
        b.addListener(r0);
        b.addListener(new C12872e(view));
        b.addListener(new C12872e(view2));
        b.start();
        bVar.mo24330a(new C12869a() {
            /* renamed from: a */
            public final void mo24307a() {
                b.end();
            }
        });
    }
}
