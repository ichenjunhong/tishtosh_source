package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class brw<T> implements Comparable<brw<T>> {

    /* renamed from: a */
    public final int f43725a;

    /* renamed from: b */
    public final String f43726b;

    /* renamed from: c */
    public final int f43727c;

    /* renamed from: d */
    final Object f43728d;

    /* renamed from: e */
    byx f43729e;

    /* renamed from: f */
    Integer f43730f;

    /* renamed from: g */
    bvx f43731g;

    /* renamed from: h */
    public boolean f43732h;

    /* renamed from: i */
    public C15565ac f43733i;

    /* renamed from: j */
    public auw f43734j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C15841a f43735k;

    /* renamed from: l */
    private boolean f43736l;

    /* renamed from: m */
    private boolean f43737m;

    /* renamed from: n */
    private boolean f43738n;

    /* renamed from: o */
    private btz f43739o;

    public brw(int i, String str, byx byx) {
        this.f43735k = C15841a.f44902a ? new C15841a() : null;
        this.f43728d = new Object();
        this.f43732h = true;
        int i2 = 0;
        this.f43736l = false;
        this.f43737m = false;
        this.f43738n = false;
        this.f43734j = null;
        this.f43725a = i;
        this.f43726b = str;
        this.f43729e = byx;
        this.f43733i = new bhv();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    i2 = host.hashCode();
                }
            }
        }
        this.f43727c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxw<T> mo28746a(bpz bpz);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28741a(T t);

    /* renamed from: a */
    public byte[] mo28743a() throws C15560a {
        return null;
    }

    /* renamed from: b */
    public final void mo30630b(String str) {
        if (C15841a.f44902a) {
            this.f43735k.mo31043a(str, Thread.currentThread().getId());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo30632c(String str) {
        if (this.f43731g != null) {
            this.f43731g.mo30793b(this);
        }
        if (C15841a.f44902a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new bsy(this, str, id));
            } else {
                this.f43735k.mo31043a(str, id);
                this.f43735k.mo31042a(toString());
            }
        }
    }

    /* renamed from: c */
    public final String mo30631c() {
        String str = this.f43726b;
        int i = this.f43725a;
        if (i == 0 || i == -1) {
            return str;
        }
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final brw<?> mo30627a(auw auw) {
        this.f43734j = auw;
        return this;
    }

    /* renamed from: b */
    public Map<String, String> mo28744b() throws C15560a {
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final int mo30634d() {
        return this.f43733i.mo28658a();
    }

    /* renamed from: e */
    public final void mo30635e() {
        synchronized (this.f43728d) {
            this.f43737m = true;
        }
    }

    /* renamed from: f */
    public final boolean mo30636f() {
        boolean z;
        synchronized (this.f43728d) {
            z = this.f43737m;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30628a(btz btz) {
        synchronized (this.f43728d) {
            this.f43739o = btz;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30629a(bxw<?> bxw) {
        btz btz;
        synchronized (this.f43728d) {
            btz = this.f43739o;
        }
        if (btz != null) {
            btz.mo30126a(this, bxw);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo30637g() {
        btz btz;
        synchronized (this.f43728d) {
            btz = this.f43739o;
        }
        if (btz != null) {
            btz.mo30125a(this);
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f43727c));
        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        String str2 = "[ ] ";
        String str3 = this.f43726b;
        String valueOf2 = String.valueOf(buw.NORMAL);
        String valueOf3 = String.valueOf(this.f43730f);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str3).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str2);
        sb.append(str3);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public /* synthetic */ int compareTo(Object obj) {
        brw brw = (brw) obj;
        buw buw = buw.NORMAL;
        buw buw2 = buw.NORMAL;
        return buw == buw2 ? this.f43730f.intValue() - brw.f43730f.intValue() : buw2.ordinal() - buw.ordinal();
    }
}
