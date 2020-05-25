package com.p683ss.android.common.applog.p1142a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.p683ss.android.common.applog.TeaThread;
import com.p683ss.android.common.applog.TeaUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.common.applog.a.c */
public class C18872c {

    /* renamed from: k */
    public static volatile C18869a f52052k;

    /* renamed from: l */
    private static volatile C18872c f52053l;

    /* renamed from: a */
    public boolean f52054a;

    /* renamed from: b */
    public boolean f52055b;

    /* renamed from: c */
    public boolean f52056c = true;

    /* renamed from: d */
    public long f52057d = TeaUtils.now();

    /* renamed from: e */
    public C18880d f52058e;

    /* renamed from: f */
    public C18870b f52059f;

    /* renamed from: g */
    public final List<C18880d> f52060g = new ArrayList();

    /* renamed from: h */
    public boolean f52061h = false;

    /* renamed from: i */
    public final Runnable f52062i = new Runnable() {
        public final void run() {
            boolean z;
            StringBuilder sb = new StringBuilder("closeCurrentSession currentSession is null : ");
            if (C18872c.this.f52058e == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (C18872c.this.f52058e != null) {
                if (C18872c.this.f52061h) {
                    C18872c.this.f52059f.mo38672a(C18872c.this.f52058e);
                } else {
                    C18872c.this.f52060g.add(C18872c.this.f52058e);
                }
                C18872c.this.f52058e = null;
                C18872c.this.f52059f.mo38671a();
            }
        }
    };

    /* renamed from: j */
    public final Runnable f52063j = new Runnable() {
        public final void run() {
            C18872c.this.f52061h = true;
            for (C18880d a : new ArrayList(C18872c.this.f52060g)) {
                C18872c.this.f52059f.mo38672a(a);
            }
            C18872c.this.f52060g.clear();
        }
    };

    /* renamed from: m */
    private Handler f52064m;

    /* renamed from: n */
    private Context f52065n;

    /* renamed from: c */
    public final void mo38678c() {
        this.f52054a = false;
        this.f52060g.clear();
        this.f52061h = false;
    }

    /* renamed from: d */
    public final void mo38679d() {
        m45963f().removeMessages(1);
    }

    /* renamed from: f */
    private Handler m45963f() {
        if (this.f52064m == null) {
            synchronized (this) {
                if (this.f52064m == null) {
                    this.f52064m = new Handler(TeaThread.getInst().getLooper()) {
                        public final void handleMessage(Message message) {
                            super.handleMessage(message);
                            boolean z = true;
                            if (message.what == 1) {
                                if (C18872c.this.f52058e != null) {
                                    Object obj = message.obj;
                                    if (obj instanceof String) {
                                        String str = (String) obj;
                                        boolean equals = TeaUtils.equals(str, C18872c.this.f52058e.f52080b);
                                        if (!C18872c.this.f52056c || !C18872c.this.f52055b) {
                                            z = false;
                                        }
                                        if (equals && z) {
                                            C18872c.this.f52058e.f52085g = System.currentTimeMillis();
                                            C18872c.this.f52059f.mo38673b(C18872c.this.f52058e);
                                            C18872c.this.mo38676a(str);
                                            C18872c.this.mo38675a();
                                            return;
                                        }
                                    }
                                }
                                C18872c.this.f52059f.mo38671a();
                                C18872c.this.mo38675a();
                            }
                        }
                    };
                }
            }
        }
        return this.f52064m;
    }

    /* renamed from: b */
    public final void mo38677b() {
        final long now = TeaUtils.now();
        TeaThread.getInst().ensureTeaThread(new Runnable() {
            public final void run() {
                if (C18872c.this.f52055b) {
                    C18872c.this.f52055b = false;
                    if (C18872c.this.f52056c && C18872c.this.f52058e != null) {
                        C18872c.this.f52058e.f52085g = now;
                        TeaThread.getInst().repost(C18872c.this.f52062i, 15000);
                        C18872c.this.f52059f.mo38673b(C18872c.this.f52058e);
                        C18872c.this.mo38679d();
                    }
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo38680e() {
        final long now = TeaUtils.now();
        TeaThread.getInst().ensureTeaThread(new Runnable() {
            public final void run() {
                if (!C18872c.this.f52055b) {
                    C18872c.this.f52055b = true;
                    if (C18872c.this.f52056c) {
                        C18872c.this.f52054a = true;
                        if (C18872c.this.f52058e == null) {
                            C18872c.this.f52058e = new C18880d(now);
                            C18872c.this.f52059f.mo38671a();
                            C18872c.this.mo38676a(C18872c.this.f52058e.f52080b);
                            return;
                        }
                        long j = now - C18872c.this.f52058e.f52085g;
                        if (j <= 15000) {
                            StringBuilder sb = new StringBuilder("task time diff ");
                            sb.append(j);
                            sb.append(" , is less than 15000");
                            sb.append(" so , merge in previous session");
                            TeaThread.getInst().removeCallbacks(C18872c.this.f52062i);
                            C18872c.this.f52058e.f52086h += j;
                            C18872c.this.f52058e.f52085g = now;
                            C18872c.this.f52059f.mo38673b(C18872c.this.f52058e);
                            C18872c.this.mo38676a(C18872c.this.f52058e.f52080b);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("task time diff ");
                        sb2.append(j);
                        sb2.append(" , is bigger than 15000");
                        sb2.append(" so close current session and create new session");
                        TeaThread.getInst().removeCallbacks(C18872c.this.f52062i);
                        C18872c.this.f52062i.run();
                        C18872c.this.f52058e = new C18880d(now);
                        C18872c.this.f52059f.mo38671a();
                        C18872c.this.mo38676a(C18872c.this.f52058e.f52080b);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo38675a() {
        boolean a = f52052k.mo38670a();
        if (this.f52055b != a) {
            new StringBuilder("tryCorrectTaskState newIsTaskRunning : ").append(a);
            if (a) {
                mo38680e();
                return;
            }
            mo38677b();
        }
    }

    /* renamed from: a */
    public static C18872c m45962a(Context context) {
        if (f52053l == null) {
            synchronized (C18872c.class) {
                if (f52053l == null) {
                    f52053l = new C18872c(context.getApplicationContext());
                }
            }
        }
        return f52053l;
    }

    private C18872c(Context context) {
        this.f52065n = context.getApplicationContext();
        this.f52059f = new C18870b(context);
    }

    /* renamed from: a */
    public final void mo38676a(String str) {
        Handler f = m45963f();
        f.removeMessages(1);
        f.sendMessageDelayed(Message.obtain(f, 1, str), 5000);
    }
}
