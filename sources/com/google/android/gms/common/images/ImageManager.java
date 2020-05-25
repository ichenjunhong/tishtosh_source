package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0786h;
import com.google.android.gms.internal.p1042c.C16477d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager {

    /* renamed from: a */
    static final Object f39691a = new Object();

    /* renamed from: b */
    static HashSet<Uri> f39692b = new HashSet<>();

    /* renamed from: c */
    final ExecutorService f39693c;

    /* renamed from: d */
    final C16477d f39694d;

    /* renamed from: e */
    final Map<C15391a, ImageReceiver> f39695e;

    /* renamed from: f */
    final Map<Uri, ImageReceiver> f39696f;

    /* renamed from: g */
    final Map<Uri, Long> f39697g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Context f39698h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Handler f39699i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C15388b f39700j;

    final class ImageReceiver extends ResultReceiver {

        /* renamed from: a */
        final ArrayList<C15391a> f39701a;

        /* renamed from: b */
        private final Uri f39702b;

        /* renamed from: c */
        private final /* synthetic */ ImageManager f39703c;

        public final void onReceiveResult(int i, Bundle bundle) {
            this.f39703c.f39693c.execute(new C15389c(this.f39702b, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$a */
    public interface C15387a {
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$b */
    static final class C15388b extends C0786h<C15392b, Bitmap> {
        /* renamed from: b */
        public final /* synthetic */ int mo2506b(Object obj, Object obj2) {
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$c */
    final class C15389c implements Runnable {

        /* renamed from: a */
        private final Uri f39704a;

        /* renamed from: b */
        private final ParcelFileDescriptor f39705b;

        public C15389c(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.f39704a = uri;
            this.f39705b = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                boolean z2 = false;
                Bitmap bitmap2 = null;
                if (this.f39705b != null) {
                    try {
                        bitmap2 = BitmapFactory.decodeFileDescriptor(this.f39705b.getFileDescriptor());
                    } catch (OutOfMemoryError unused) {
                        z2 = true;
                    }
                    try {
                        this.f39705b.close();
                    } catch (IOException unused2) {
                    }
                    z = z2;
                    bitmap = bitmap2;
                } else {
                    bitmap = null;
                    z = false;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Handler b = ImageManager.this.f39699i;
                C15390d dVar = new C15390d(this.f39704a, bitmap, z, countDownLatch);
                b.post(dVar);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused3) {
                }
            } else {
                throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            }
        }
    }

    /* renamed from: com.google.android.gms.common.images.ImageManager$d */
    final class C15390d implements Runnable {

        /* renamed from: a */
        private final Uri f39707a;

        /* renamed from: b */
        private final Bitmap f39708b;

        /* renamed from: c */
        private final CountDownLatch f39709c;

        /* renamed from: d */
        private boolean f39710d;

        public C15390d(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.f39707a = uri;
            this.f39708b = bitmap;
            this.f39710d = z;
            this.f39709c = countDownLatch;
        }

        public final void run() {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                boolean z = this.f39708b != null;
                if (ImageManager.this.f39700j != null) {
                    if (this.f39710d) {
                        ImageManager.this.f39700j.mo2503a();
                        System.gc();
                        this.f39710d = false;
                        ImageManager.this.f39699i.post(this);
                        return;
                    } else if (z) {
                        ImageManager.this.f39700j.mo2502a(new C15392b(this.f39707a), this.f39708b);
                    }
                }
                ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f39696f.remove(this.f39707a);
                if (imageReceiver != null) {
                    ArrayList<C15391a> arrayList = imageReceiver.f39701a;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C15391a aVar = (C15391a) arrayList.get(i);
                        if (z) {
                            aVar.mo28340a(ImageManager.this.f39698h, this.f39708b, false);
                        } else {
                            ImageManager.this.f39697g.put(this.f39707a, Long.valueOf(SystemClock.elapsedRealtime()));
                            aVar.mo28341a(ImageManager.this.f39698h, ImageManager.this.f39694d, false);
                        }
                        if (!(aVar instanceof C15393c)) {
                            ImageManager.this.f39695e.remove(aVar);
                        }
                    }
                }
                this.f39709c.countDown();
                synchronized (ImageManager.f39691a) {
                    ImageManager.f39692b.remove(this.f39707a);
                }
                return;
            }
            throw new IllegalStateException("OnBitmapLoadedRunnable must be executed in the main thread");
        }
    }
}
