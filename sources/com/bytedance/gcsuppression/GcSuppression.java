package com.bytedance.gcsuppression;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Trace;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class GcSuppression {

    /* renamed from: d */
    private static volatile GcSuppression f27232d;

    /* renamed from: a */
    public AtomicInteger f27233a = new AtomicInteger(0);

    /* renamed from: b */
    public long f27234b = 60;

    /* renamed from: c */
    public ExecutorService f27235c;

    /* renamed from: e */
    private Context f27236e;

    /* renamed from: f */
    private AtomicBoolean f27237f = new AtomicBoolean(false);

    /* renamed from: g */
    private boolean f27238g = true;

    /* renamed from: h */
    private long f27239h = 0;

    /* renamed from: i */
    private long f27240i = 0;

    /* renamed from: j */
    private ScheduledFuture f27241j;

    /* renamed from: k */
    private C10025a f27242k;

    /* renamed from: l */
    private Runnable f27243l = new Runnable() {
        public final void run() {
            GcSuppression.this.mo17995b();
        }
    };

    /* renamed from: com.bytedance.gcsuppression.GcSuppression$a */
    public interface C10025a {
    }

    private native int startGcSuppression();

    private native int stopGcSuppression();

    /* renamed from: a */
    public static GcSuppression m20171a() {
        if (f27232d == null) {
            synchronized (GcSuppression.class) {
                if (f27232d == null) {
                    f27232d = new GcSuppression();
                }
            }
        }
        return f27232d;
    }

    private GcSuppression() {
    }

    /* renamed from: b */
    public final int mo17995b() {
        int i;
        boolean z;
        if (this.f27238g) {
            this.f27240i = System.currentTimeMillis();
            if (VERSION.SDK_INT >= 18) {
                Trace.beginSection("GcSuppressionStop");
            }
        }
        if (this.f27233a.get() == 2) {
            if (this.f27241j != null) {
                this.f27241j.cancel(false);
                this.f27241j = null;
            }
            i = stopGcSuppression();
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f27233a.compareAndSet(2, 3);
                Editor edit = C35807d.m80935a(this.f27236e, "gcsuppress", 0).edit();
                edit.putInt("vc", 1028);
                edit.putInt("state", this.f27233a.get());
                edit.commit();
            } else {
                this.f27233a.compareAndSet(2, 1);
            }
            if (!(this.f27242k == null || i == -1 || this.f27237f.get())) {
                this.f27237f.set(true);
                Editor edit2 = C35807d.m80935a(this.f27236e, "gcsuppress", 0).edit();
                edit2.putBoolean("hfs", true);
                edit2.commit();
            }
        } else {
            i = -1;
        }
        if (this.f27238g && VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
        return i;
    }
}
