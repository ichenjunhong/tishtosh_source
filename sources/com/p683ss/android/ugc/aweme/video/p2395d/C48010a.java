package com.p683ss.android.ugc.aweme.video.p2395d;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.ss.android.ugc.trill.R;
import com.toutiao.proxyserver.C51895s;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.video.d.a */
public class C48010a implements C48012b {

    /* renamed from: w */
    private static final String f120652w = "a";

    /* renamed from: A */
    private boolean f120653A;

    /* renamed from: a */
    public volatile boolean f120654a;

    /* renamed from: b */
    long f120655b = 0;

    /* renamed from: c */
    int f120656c = 0;

    /* renamed from: d */
    int f120657d = 0;

    /* renamed from: e */
    long f120658e;

    /* renamed from: f */
    boolean f120659f;

    /* renamed from: g */
    int f120660g;

    /* renamed from: h */
    int f120661h;

    /* renamed from: i */
    int f120662i = -1;

    /* renamed from: j */
    long f120663j = -1;

    /* renamed from: k */
    int f120664k;

    /* renamed from: l */
    float f120665l;

    /* renamed from: m */
    String f120666m;

    /* renamed from: n */
    String f120667n;

    /* renamed from: o */
    String f120668o;

    /* renamed from: p */
    String f120669p;

    /* renamed from: q */
    String f120670q;

    /* renamed from: r */
    boolean f120671r;

    /* renamed from: s */
    String f120672s;

    /* renamed from: t */
    String f120673t;

    /* renamed from: u */
    String f120674u;

    /* renamed from: v */
    double f120675v;

    /* renamed from: x */
    private C48011a f120676x;

    /* renamed from: y */
    private C48013c f120677y;

    /* renamed from: z */
    private SparseArray<View> f120678z = new SparseArray<>();

    /* renamed from: com.ss.android.ugc.aweme.video.d.a$a */
    static class C48011a extends Handler {

        /* renamed from: a */
        private WeakReference<C48010a> f120679a;

        C48011a(C48010a aVar) {
            this.f120679a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            C48010a aVar;
            String str;
            if (this.f120679a != null) {
                aVar = (C48010a) this.f120679a.get();
            } else {
                aVar = null;
            }
            if (aVar != null && message.what == 1) {
                C48021h M = C48121w.m104249M();
                aVar.mo95217a(R.string.dl8, aVar.f120669p);
                if (aVar.f120668o == null || aVar.f120668o.length() <= 25) {
                    aVar.mo95217a(R.string.f92, aVar.f120668o);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.f120668o.substring(0, 25));
                    sb.append("\n");
                    sb.append(aVar.f120668o.substring(25, aVar.f120668o.length()));
                    aVar.mo95217a(R.string.f92, sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.valueOf(aVar.f120658e));
                sb2.append("ms");
                aVar.mo95217a(R.string.b3l, sb2.toString());
                aVar.mo95217a(R.string.vd, String.valueOf(aVar.f120656c));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(String.valueOf(aVar.f120655b));
                sb3.append("ms");
                aVar.mo95217a(R.string.ve, sb3.toString());
                aVar.mo95217a(R.string.c3d, String.valueOf(aVar.f120657d));
                aVar.mo95217a(R.string.vv, String.valueOf(aVar.f120662i));
                aVar.mo95217a(R.string.fc1, String.valueOf(aVar.f120663j));
                aVar.mo95217a(R.string.dlj, aVar.f120672s);
                aVar.mo95217a(R.string.btk, String.valueOf(aVar.f120659f));
                aVar.mo95217a(R.string.g2y, String.valueOf(aVar.f120673t));
                aVar.mo95217a(R.string.hk2, String.valueOf(aVar.f120674u));
                aVar.mo95217a(R.string.hk3, String.valueOf(aVar.f120675v));
                aVar.mo95217a(R.string.cpi, String.valueOf(M.mo95242a()));
                aVar.mo95217a(R.string.f9k, String.valueOf(C51895s.f129475j));
                aVar.mo95217a(R.string.cpa, String.valueOf(aVar.f120665l));
                aVar.mo95217a(R.string.vy, aVar.f120666m);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(String.valueOf(aVar.f120660g));
                sb4.append("KBps");
                aVar.mo95217a(R.string.bst, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(String.valueOf(aVar.f120661h));
                sb5.append("KBps");
                aVar.mo95217a(R.string.h3i, sb5.toString());
                aVar.mo95217a(R.string.sv, String.valueOf(aVar.f120664k));
                if (aVar.f120667n != null) {
                    aVar.mo95217a(R.string.sx, aVar.f120667n);
                }
                aVar.mo95217a(R.string.dui, String.valueOf(M.mo95260r()));
                aVar.mo95217a(R.string.c86, String.valueOf(C48069o.f120792a));
                aVar.mo95217a(R.string.f9g, String.valueOf(aVar.f120671r));
                if (aVar.f120670q == null || aVar.f120670q.length() <= 120) {
                    str = aVar.f120670q;
                } else {
                    str = aVar.f120670q.substring(0, 120);
                }
                aVar.mo95217a(R.string.cpk, str);
                aVar.mo95217a(R.string.cpj, M.mo95244b());
                StringBuilder sb6 = new StringBuilder();
                sb6.append(C48017a.m103960b());
                sb6.append(C48107j.m104193f().mo95409h().getClass().getSimpleName());
                aVar.mo95217a(R.string.cw0, sb6.toString());
                removeMessages(1);
                if (!aVar.f120654a) {
                    sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo95213a() {
        this.f120657d = 0;
        this.f120655b = 0;
        this.f120656c = 0;
        this.f120658e = 0;
        this.f120659f = false;
        this.f120662i = -1;
        this.f120663j = -1;
        this.f120673t = null;
        this.f120672s = null;
        this.f120670q = null;
        this.f120666m = null;
        this.f120671r = false;
    }

    /* renamed from: a */
    public final void mo95215a(float f) {
        this.f120665l = f;
    }

    /* renamed from: b */
    public final void mo95222b(double d) {
        this.f120675v = d;
    }

    /* renamed from: c */
    public final void mo95227c(int i) {
        this.f120662i = i;
    }

    /* renamed from: d */
    public final void mo95231d(int i) {
        this.f120664k = i;
    }

    /* renamed from: e */
    public final void mo95233e(int i) {
        this.f120660g = i;
    }

    /* renamed from: f */
    public final void mo95235f(int i) {
        this.f120661h = i;
    }

    /* renamed from: a */
    public final void mo95216a(int i) {
        this.f120656c = i;
    }

    /* renamed from: b */
    public final void mo95223b(int i) {
        this.f120657d = i;
    }

    /* renamed from: c */
    public final void mo95228c(long j) {
        this.f120663j = j;
    }

    /* renamed from: d */
    public final void mo95232d(String str) {
        this.f120670q = str;
    }

    /* renamed from: e */
    public final void mo95234e(String str) {
        this.f120672s = str;
    }

    /* renamed from: f */
    public final void mo95236f(String str) {
        this.f120674u = str;
    }

    /* renamed from: g */
    public final void mo95237g(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f120671r = z;
    }

    /* renamed from: a */
    public final void mo95218a(long j) {
        this.f120655b = j;
    }

    /* renamed from: b */
    public final void mo95224b(long j) {
        this.f120658e = j;
    }

    /* renamed from: c */
    public final void mo95229c(String str) {
        this.f120669p = str;
    }

    /* renamed from: b */
    public final void mo95225b(String str) {
        this.f120668o = str;
    }

    /* renamed from: c */
    public final void mo95230c(boolean z) {
        this.f120653A = z;
    }

    /* renamed from: a */
    public final void mo95214a(double d) {
        this.f120666m = new BigDecimal(d).setScale(0, 4).toPlainString();
    }

    /* renamed from: b */
    public final void mo95226b(boolean z) {
        this.f120659f = z;
    }

    /* renamed from: a */
    public final void mo95219a(Object obj) {
        if (obj != null) {
            this.f120667n = obj.toString();
        }
    }

    /* renamed from: a */
    public final void mo95220a(String str) {
        this.f120673t = str;
    }

    /* renamed from: a */
    public final void mo95221a(boolean z) {
        this.f120654a = !z;
        if (z) {
            this.f120676x.sendEmptyMessageDelayed(1, 1000);
        } else {
            this.f120676x.removeMessages(1);
        }
    }

    public C48010a(Context context, FrameLayout frameLayout) {
        this.f120677y = new C48013c(context);
        frameLayout.addView(this.f120677y.f120680a, new LayoutParams(-1, -1));
        this.f120676x = new C48011a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo95217a(int i, String str) {
        View view = (View) this.f120678z.get(i);
        if (view == null) {
            this.f120678z.put(i, this.f120677y.mo95239a(i, str));
            return;
        }
        this.f120677y.mo95240a(view, str);
    }
}
