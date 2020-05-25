package com.p683ss.android.ugc.aweme.shortvideo.p2209l;

import android.app.ActivityManager;
import android.graphics.drawable.BitmapDrawable;
import android.support.p030v4.p038f.C0786h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.a */
public final class C43952a {

    /* renamed from: a */
    public static final C43952a f111289a = new C43952a();

    /* renamed from: b */
    private final C0786h<String, BitmapDrawable> f111290b;

    /* renamed from: c */
    private final ReadWriteLock f111291c = new ReentrantReadWriteLock();

    private C43952a() {
        long j;
        ActivityManager activityManager = (ActivityManager) C39629l.m88233b().getSystemService("activity");
        long j2 = 1;
        if (activityManager != null) {
            j = (long) (((activityManager.getMemoryClass() * PreloadTask.BYTE_UNIT_NUMBER) * PreloadTask.BYTE_UNIT_NUMBER) / 4);
        } else {
            j = 1;
        }
        if (j > 0) {
            j2 = j;
        }
        this.f111290b = new C0786h<String, BitmapDrawable>((int) j2) {
            /* renamed from: b */
            public final /* synthetic */ int mo2506b(Object obj, Object obj2) {
                String str = (String) obj;
                return ((BitmapDrawable) obj2).getBitmap().getByteCount();
            }
        };
    }

    /* renamed from: a */
    public final BitmapDrawable mo89518a(String str) {
        try {
            this.f111291c.readLock().lock();
            return (BitmapDrawable) this.f111290b.mo2501a(str);
        } finally {
            this.f111291c.readLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo89519a(String str, BitmapDrawable bitmapDrawable) {
        try {
            this.f111291c.writeLock().lock();
            this.f111290b.mo2502a(str, bitmapDrawable);
        } finally {
            this.f111291c.writeLock().unlock();
        }
    }
}
