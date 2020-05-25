package com.facebook.common.p925i;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.p920d.C13696m;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.facebook.common.i.a */
public final class C13721a {

    /* renamed from: c */
    private static C13721a f35702c;

    /* renamed from: d */
    private static final long f35703d = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    public volatile StatFs f35704a;

    /* renamed from: b */
    public volatile StatFs f35705b;

    /* renamed from: e */
    private volatile File f35706e;

    /* renamed from: f */
    private volatile File f35707f;

    /* renamed from: g */
    private long f35708g;

    /* renamed from: h */
    private final Lock f35709h = new ReentrantLock();

    /* renamed from: i */
    private volatile boolean f35710i;

    /* renamed from: com.facebook.common.i.a$a */
    public enum C13722a {
        INTERNAL,
        EXTERNAL
    }

    protected C13721a() {
    }

    /* renamed from: a */
    public static synchronized C13721a m27767a() {
        C13721a aVar;
        synchronized (C13721a.class) {
            if (f35702c == null) {
                f35702c = new C13721a();
            }
            aVar = f35702c;
        }
        return aVar;
    }

    /* renamed from: d */
    private void m27768d() {
        this.f35704a = m27766a(this.f35704a, this.f35706e);
        this.f35705b = m27766a(this.f35705b, this.f35707f);
        this.f35708g = SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public void mo25640b() {
        if (!this.f35710i) {
            this.f35709h.lock();
            try {
                if (!this.f35710i) {
                    this.f35706e = Environment.getDataDirectory();
                    this.f35707f = Environment.getExternalStorageDirectory();
                    m27768d();
                    this.f35710i = true;
                }
            } finally {
                this.f35709h.unlock();
            }
        }
    }

    /* renamed from: c */
    public void mo25641c() {
        if (this.f35709h.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f35708g > f35703d) {
                    m27768d();
                }
            } finally {
                this.f35709h.unlock();
            }
        }
    }

    /* renamed from: a */
    private static StatFs m27766a(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = new StatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                statFs = null;
            } catch (Throwable th) {
                throw C13696m.m27667b(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }
}
