package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acb;
import com.google.android.gms.internal.ads.aes;
import com.google.android.gms.internal.ads.bed;
import com.google.android.gms.internal.ads.beg;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.zzbgz;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.i */
public final class C14997i implements bed, Runnable {

    /* renamed from: a */
    private final List<Object[]> f38709a;

    /* renamed from: b */
    private final AtomicReference<bed> f38710b;

    /* renamed from: c */
    private Context f38711c;

    /* renamed from: d */
    private zzbgz f38712d;

    /* renamed from: e */
    private CountDownLatch f38713e;

    public C14997i(C14964ay ayVar) {
        this(ayVar.f38629c, ayVar.f38631e);
    }

    private C14997i(Context context, zzbgz zzbgz) {
        this.f38709a = new Vector();
        this.f38710b = new AtomicReference<>();
        this.f38713e = new CountDownLatch(1);
        this.f38711c = context;
        this.f38712d = zzbgz;
        if (aes.m32760b()) {
            acb.m32566a((Runnable) this);
        } else {
            run();
        }
    }

    /* renamed from: a */
    private final boolean m30966a() {
        try {
            this.f38713e.await();
            return true;
        } catch (InterruptedException e) {
            abv.m32795c("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m30968b() {
        if (!this.f38709a.isEmpty()) {
            for (Object[] objArr : this.f38709a) {
                if (objArr.length == 1) {
                    ((bed) this.f38710b.get()).mo27638a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((bed) this.f38710b.get()).mo27637a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f38709a.clear();
        }
    }

    /* renamed from: b */
    private static Context m30967b(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final String mo27634a(Context context) {
        if (m30966a()) {
            bed bed = (bed) this.f38710b.get();
            if (bed != null) {
                m30968b();
                return bed.mo27634a(m30967b(context));
            }
        }
        return "";
    }

    /* renamed from: a */
    public final String mo27635a(Context context, String str, View view) {
        return mo27636a(context, str, view, null);
    }

    /* renamed from: a */
    public final String mo27636a(Context context, String str, View view, Activity activity) {
        if (m30966a()) {
            bed bed = (bed) this.f38710b.get();
            if (bed != null) {
                m30968b();
                return bed.mo27636a(m30967b(context), str, view, activity);
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo27639a(View view) {
        bed bed = (bed) this.f38710b.get();
        if (bed != null) {
            bed.mo27639a(view);
        }
    }

    /* renamed from: a */
    public final void mo27638a(MotionEvent motionEvent) {
        bed bed = (bed) this.f38710b.get();
        if (bed != null) {
            m30968b();
            bed.mo27638a(motionEvent);
            return;
        }
        this.f38709a.add(new Object[]{motionEvent});
    }

    /* renamed from: a */
    public final void mo27637a(int i, int i2, int i3) {
        bed bed = (bed) this.f38710b.get();
        if (bed != null) {
            m30968b();
            bed.mo27637a(i, i2, i3);
            return;
        }
        this.f38709a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.f38712d.f46240d;
            if (!((Boolean) caf.m37099d().mo30717a(C15740bx.f44220aG)).booleanValue() && z2) {
                z = true;
            }
            this.f38710b.set(beg.m35493a(this.f38712d.f46237a, m30967b(this.f38711c), z));
        } finally {
            this.f38713e.countDown();
            this.f38711c = null;
            this.f38712d = null;
        }
    }
}
