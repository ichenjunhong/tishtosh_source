package com.p683ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.q */
public final class C28209q implements C9382a {

    /* renamed from: a */
    final boolean f74054a;

    /* renamed from: b */
    public int f74055b;

    /* renamed from: c */
    public boolean f74056c;

    /* renamed from: d */
    ViewPager f74057d;

    /* renamed from: e */
    public boolean f74058e;

    /* renamed from: f */
    public Handler f74059f;

    /* renamed from: g */
    Method f74060g;

    /* renamed from: h */
    private long f74061h;

    /* renamed from: i */
    private OnTouchListener f74062i;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.q$a */
    static class C28212a implements Runnable {

        /* renamed from: a */
        private long f74065a;

        /* renamed from: b */
        private WeakReference<C28209q> f74066b;

        public final void run() {
            int i;
            if (!(this.f74066b == null || this.f74066b.get() == null)) {
                C28209q qVar = (C28209q) this.f74066b.get();
                if (qVar != null && qVar.f74059f != null && qVar.f74058e) {
                    if (!qVar.f74058e) {
                        qVar.f74059f.removeCallbacksAndMessages(null);
                    } else {
                        int currentItem = qVar.f74057d.getCurrentItem();
                        if (qVar.f74054a) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        int i2 = currentItem + i;
                        if (i2 < 0) {
                            i2 += qVar.f74055b;
                        }
                        if (qVar.f74060g != null) {
                            try {
                                qVar.f74060g.invoke(qVar.f74057d, new Object[]{Integer.valueOf(i2), Boolean.valueOf(true), Boolean.valueOf(true), Integer.valueOf(1)});
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                        qVar.f74057d.setCurrentItem(i2, true);
                    }
                    if (!qVar.f74058e) {
                        qVar.f74059f.removeCallbacksAndMessages(null);
                        return;
                    }
                    qVar.f74059f.postDelayed(this, this.f74065a);
                }
            }
        }

        C28212a(C28209q qVar, long j) {
            this.f74066b = new WeakReference<>(qVar);
            this.f74065a = j;
        }
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: b */
    public final void mo56625b() {
        if (this.f74058e) {
            this.f74058e = false;
            this.f74059f.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public final void mo56624a() {
        if (!this.f74058e) {
            this.f74058e = true;
            this.f74059f.removeCallbacksAndMessages(null);
            this.f74059f.postDelayed(new C28212a(this, this.f74061h), this.f74061h);
        }
    }

    public C28209q(ViewPager viewPager) {
        this(viewPager, 5000);
    }

    public C28209q(ViewPager viewPager, long j) {
        this.f74061h = 5000;
        this.f74056c = true;
        this.f74062i = new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!C28209q.this.f74056c) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 2) {
                    C28209q.this.mo56625b();
                } else if (action == 1) {
                    C28209q.this.f74059f.postDelayed(new Runnable() {
                        public final void run() {
                            C28209q.this.mo56624a();
                        }
                    }, 2000);
                }
                return false;
            }
        };
        this.f74057d = viewPager;
        this.f74061h = j;
        this.f74059f = new C9381g(this);
        boolean z = false;
        try {
            this.f74060g = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
            this.f74060g.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        viewPager.setOnTouchListener(this.f74062i);
        Context context = viewPager.getContext();
        if (context != null && VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        }
        this.f74054a = z;
    }
}
