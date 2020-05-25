package com.bytedance.scene.p837a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.bytedance.scene.p841c.C12868b;
import com.bytedance.scene.p841c.C12868b.C12869a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.scene.a.c */
public abstract class C12837c {

    /* renamed from: a */
    public ViewGroup f33614a;

    /* renamed from: a */
    public abstract void mo24304a(C12828a aVar, C12828a aVar2, Runnable runnable, C12868b bVar);

    /* renamed from: b */
    public abstract void mo24305b(C12828a aVar, C12828a aVar2, Runnable runnable, C12868b bVar);

    /* renamed from: a */
    public static void m25750a(final View view, C12868b bVar, final Runnable runnable) {
        if (view == view.getRootView()) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            viewTreeObserver.addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    if (atomicBoolean.get()) {
                        return false;
                    }
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
            C128458 r7 = new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            };
            final ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
            final C128458 r3 = r7;
            final View view2 = view;
            final Runnable runnable2 = runnable;
            C128469 r1 = new C12869a() {
                /* renamed from: a */
                public final void mo24307a() {
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(r3);
                    } else {
                        view2.getViewTreeObserver().removeGlobalOnLayoutListener(r3);
                    }
                    atomicBoolean.set(false);
                    runnable2.run();
                }
            };
            bVar.mo24330a(r1);
            viewTreeObserver.addOnGlobalLayoutListener(r7);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }
}
