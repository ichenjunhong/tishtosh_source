package com.p683ss.android.ugc.aweme.photomovie.edit.imageframe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p683ss.android.ugc.aweme.shortvideo.p2209l.C43952a;
import com.p683ss.android.ugc.tools.utils.C50198b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.a */
public final class C38771a implements C38777a {

    /* renamed from: a */
    public final C43952a f98640a;

    /* renamed from: b */
    public final C38775b f98641b;

    /* renamed from: c */
    public final File[] f98642c;

    /* renamed from: d */
    public final int[] f98643d;

    /* renamed from: e */
    public C38774b f98644e;

    /* renamed from: f */
    public boolean f98645f;

    /* renamed from: g */
    private final Handler f98646g;

    /* renamed from: h */
    private final boolean f98647h;

    /* renamed from: i */
    private final long f98648i;

    /* renamed from: j */
    private final int f98649j;

    /* renamed from: k */
    private final int f98650k;

    /* renamed from: l */
    private final float f98651l;

    /* renamed from: m */
    private final int f98652m;

    /* renamed from: n */
    private final Resources f98653n;

    /* renamed from: o */
    private int f98654o;

    /* renamed from: p */
    private boolean f98655p;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.a$a */
    public static class C38773a {

        /* renamed from: a */
        public final Context f98657a;

        /* renamed from: b */
        public boolean f98658b;

        /* renamed from: c */
        public long f98659c = 50;

        /* renamed from: d */
        public int f98660d;

        /* renamed from: e */
        public int f98661e;

        /* renamed from: f */
        public float f98662f;

        /* renamed from: g */
        public File[] f98663g;

        /* renamed from: h */
        public int[] f98664h;

        /* renamed from: i */
        public C38774b f98665i;

        public C38773a(Context context, int[] iArr) {
            if (iArr.length != 0) {
                this.f98657a = context;
                this.f98664h = iArr;
                return;
            }
            throw new IllegalArgumentException("resource is empty");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.a$b */
    public interface C38774b {
        /* renamed from: a */
        void mo78731a(BitmapDrawable bitmapDrawable, C43952a aVar);

        /* renamed from: b */
        void mo78732b();
    }

    /* renamed from: b */
    private void m86152b() {
        if (this.f98654o < this.f98642c.length) {
            File file = this.f98642c[this.f98654o];
            if (!file.isFile() || !m86151a(file)) {
                this.f98654o++;
                m86152b();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable a = C50198b.m108331a(this.f98653n, file.getAbsolutePath(), this.f98649j, this.f98650k, this.f98651l, this.f98652m, this.f98640a);
            long currentTimeMillis2 = this.f98648i - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            if (this.f98654o == 0 && !this.f98655p) {
                currentTimeMillis2 = 0;
            }
            this.f98646g.sendMessageDelayed(Message.obtain(this.f98646g, 2, a), currentTimeMillis2);
            if (this.f98655p) {
                this.f98655p = false;
            }
            this.f98654o++;
        } else if (this.f98647h) {
            this.f98654o = 0;
            this.f98655p = true;
            m86152b();
        } else {
            this.f98646g.sendEmptyMessage(3);
        }
    }

    /* renamed from: c */
    private void m86153c() {
        if (this.f98654o < this.f98643d.length) {
            int i = this.f98643d[this.f98654o];
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable a = C50198b.m108329a(this.f98653n, i, this.f98649j, this.f98650k, this.f98651l, this.f98652m, this.f98640a);
            long currentTimeMillis2 = this.f98648i - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            if (this.f98654o == 0 && !this.f98655p) {
                currentTimeMillis2 = 0;
            }
            this.f98646g.sendMessageDelayed(Message.obtain(this.f98646g, 2, a), currentTimeMillis2);
            if (this.f98655p) {
                this.f98655p = false;
            }
            this.f98654o++;
        } else if (this.f98647h) {
            this.f98654o = 0;
            this.f98655p = true;
            m86153c();
        } else {
            this.f98646g.sendEmptyMessage(3);
        }
    }

    /* renamed from: a */
    public final void mo78736a() {
        if (this.f98645f) {
            this.f98645f = false;
            this.f98654o = 0;
            this.f98655p = false;
            this.f98644e = null;
            this.f98641b.f98668c.removeCallbacksAndMessages(null);
            this.f98641b.mo78739a(this);
            m86150a(this.f98641b);
            this.f98646g.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: a */
    private static void m86150a(C38775b bVar) {
        try {
            Looper looper = bVar.getLooper();
            if (looper != null) {
                if (VERSION.SDK_INT >= 18) {
                    looper.quitSafely();
                    return;
                }
                looper.quit();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static boolean m86151a(File file) {
        if (file.getName().endsWith("png") || file.getName().endsWith("jpg")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    private C38771a(C38773a aVar) {
        this.f98640a = C43952a.f111289a;
        this.f98641b = new C38775b();
        this.f98646g = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                int i;
                switch (message.what) {
                    case 2:
                        if (C38771a.this.f98644e != null) {
                            C38771a.this.f98644e.mo78731a((BitmapDrawable) message.obj, C38771a.this.f98640a);
                        }
                        if (C38771a.this.f98645f) {
                            Handler handler = C38771a.this.f98641b.f98668c;
                            if (C38771a.this.f98642c != null) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            handler.sendEmptyMessage(i);
                            return;
                        }
                        break;
                    case 3:
                        if (C38771a.this.f98644e != null) {
                            C38771a.this.f98644e.mo78732b();
                        }
                        C38771a.this.mo78736a();
                        break;
                }
            }
        };
        C38775b bVar = this.f98641b;
        bVar.f98667b.writeLock().lock();
        try {
            bVar.f98666a.add(this);
            bVar.f98667b.writeLock().unlock();
            this.f98647h = aVar.f98658b;
            this.f98648i = aVar.f98659c;
            this.f98649j = aVar.f98660d;
            this.f98650k = aVar.f98661e;
            this.f98651l = aVar.f98662f;
            this.f98652m = aVar.f98657a.getResources().getDisplayMetrics().densityDpi;
            this.f98642c = aVar.f98663g;
            this.f98643d = aVar.f98664h;
            this.f98653n = aVar.f98657a.getResources();
            this.f98644e = aVar.f98665i;
        } catch (Throwable th) {
            bVar.f98667b.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo78737a(Message message) {
        if (this.f98645f) {
            if (message.what == 0) {
                m86152b();
                return;
            }
            if (message.what == 1) {
                m86153c();
            }
        }
    }
}
