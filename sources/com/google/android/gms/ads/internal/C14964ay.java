package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.support.p030v4.p038f.C0800n;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.internal.ads.C15563abr;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.C15796ca;
import com.google.android.gms.internal.ads.C15813cr;
import com.google.android.gms.internal.ads.C15893fp;
import com.google.android.gms.internal.ads.C15897ft;
import com.google.android.gms.internal.ads.C15900fw;
import com.google.android.gms.internal.ads.C15903fz;
import com.google.android.gms.internal.ads.C15907gc;
import com.google.android.gms.internal.ads.C15909ge;
import com.google.android.gms.internal.ads.C15994ji;
import com.google.android.gms.internal.ads.C16066m;
import com.google.android.gms.internal.ads.C16147p;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16309v;
import com.google.android.gms.internal.ads.C16388xy;
import com.google.android.gms.internal.ads.C16396yf;
import com.google.android.gms.internal.ads.abb;
import com.google.android.gms.internal.ads.abc;
import com.google.android.gms.internal.ads.abd;
import com.google.android.gms.internal.ads.abp;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acz;
import com.google.android.gms.internal.ads.aeh;
import com.google.android.gms.internal.ads.aes;
import com.google.android.gms.internal.ads.bed;
import com.google.android.gms.internal.ads.beh;
import com.google.android.gms.internal.ads.caf;
import com.google.android.gms.internal.ads.cai;
import com.google.android.gms.internal.ads.cal;
import com.google.android.gms.internal.ads.zzabp;
import com.google.android.gms.internal.ads.zzacq;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.ay */
public final class C14964ay implements OnGlobalLayoutListener, OnScrollChangedListener {

    /* renamed from: A */
    zzabp f38607A;

    /* renamed from: B */
    C15907gc f38608B;

    /* renamed from: C */
    List<Integer> f38609C;

    /* renamed from: D */
    C15813cr f38610D;

    /* renamed from: E */
    C16396yf f38611E;

    /* renamed from: F */
    C16388xy f38612F;

    /* renamed from: G */
    public String f38613G;

    /* renamed from: H */
    public String f38614H;

    /* renamed from: I */
    List<String> f38615I;

    /* renamed from: J */
    public abp f38616J;

    /* renamed from: K */
    View f38617K;

    /* renamed from: L */
    public int f38618L;

    /* renamed from: M */
    boolean f38619M;

    /* renamed from: N */
    public HashSet<abd> f38620N;

    /* renamed from: O */
    boolean f38621O;

    /* renamed from: P */
    boolean f38622P;

    /* renamed from: Q */
    boolean f38623Q;

    /* renamed from: R */
    private int f38624R;

    /* renamed from: S */
    private int f38625S;

    /* renamed from: T */
    private aeh f38626T;

    /* renamed from: a */
    final String f38627a;

    /* renamed from: b */
    public String f38628b;

    /* renamed from: c */
    public final Context f38629c;

    /* renamed from: d */
    final beh f38630d;

    /* renamed from: e */
    public final zzbgz f38631e;

    /* renamed from: f */
    C14965az f38632f;

    /* renamed from: g */
    public C15563abr f38633g;

    /* renamed from: h */
    public acz f38634h;

    /* renamed from: i */
    public zzyz f38635i;

    /* renamed from: j */
    public abb f38636j;

    /* renamed from: k */
    public abc f38637k;

    /* renamed from: l */
    public abd f38638l;

    /* renamed from: m */
    cai f38639m;

    /* renamed from: n */
    cal f38640n;

    /* renamed from: o */
    C16147p f38641o;

    /* renamed from: p */
    C16066m f38642p;

    /* renamed from: q */
    C16309v f38643q;

    /* renamed from: r */
    C15893fp f38644r;

    /* renamed from: s */
    C15897ft f38645s;

    /* renamed from: t */
    C15909ge f38646t;

    /* renamed from: u */
    C15994ji f38647u;

    /* renamed from: v */
    C0800n<String, C15900fw> f38648v;

    /* renamed from: w */
    C0800n<String, C15903fz> f38649w;

    /* renamed from: x */
    zzafl f38650x;

    /* renamed from: y */
    zzacq f38651y;

    /* renamed from: z */
    zzaks f38652z;

    public C14964ay(Context context, zzyz zzyz, String str, zzbgz zzbgz) {
        this(context, zzyz, str, zzbgz, null);
    }

    private C14964ay(Context context, zzyz zzyz, String str, zzbgz zzbgz, beh beh) {
        this.f38624R = -1;
        this.f38625S = -1;
        this.f38621O = true;
        this.f38622P = true;
        C15740bx.m36941a(context);
        if (C14963ax.m30834d().mo28585a() != null) {
            List b = C15740bx.m36942b();
            if (zzbgz.f46238b != 0) {
                b.add(Integer.toString(zzbgz.f46238b));
            }
            C15796ca a = C14963ax.m30834d().mo28585a();
            if (b != null && !b.isEmpty()) {
                a.f44735b.put("e", TextUtils.join(",", b));
            }
        }
        this.f38627a = UUID.randomUUID().toString();
        if (zzyz.f46341d || zzyz.f46345h) {
            this.f38632f = null;
        } else {
            C14965az azVar = new C14965az(context, str, zzbgz.f46237a, this, this);
            this.f38632f = azVar;
            this.f38632f.setMinimumWidth(zzyz.f46343f);
            this.f38632f.setMinimumHeight(zzyz.f46340c);
            this.f38632f.setVisibility(4);
        }
        this.f38635i = zzyz;
        this.f38628b = str;
        this.f38629c = context;
        this.f38631e = zzbgz;
        this.f38630d = new beh(new C14997i(this));
        this.f38626T = new aeh(200);
        this.f38649w = new C0800n<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27565a(View view) {
        if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44314bv)).booleanValue()) {
            bed bed = this.f38630d.f42188b;
            if (bed != null) {
                bed.mo27639a(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo27564a() {
        if (this.f38636j != null && this.f38636j.f40104b != null) {
            this.f38636j.f40104b.destroy();
        }
    }

    /* renamed from: b */
    public final void mo27567b() {
        if (!(this.f38636j == null || this.f38636j.f40118p == null)) {
            try {
                this.f38636j.f40118p.mo31254c();
            } catch (RemoteException unused) {
                abv.m32798e("Could not destroy mediation adapter.");
            }
        }
    }

    /* renamed from: c */
    public final boolean mo27568c() {
        return this.f38618L == 0;
    }

    /* renamed from: d */
    public final boolean mo27569d() {
        return this.f38618L == 1;
    }

    public final void onGlobalLayout() {
        m30850b(false);
    }

    public final void onScrollChanged() {
        m30850b(true);
        this.f38623Q = true;
    }

    /* renamed from: b */
    private final void m30850b(boolean z) {
        if (this.f38632f != null && this.f38636j != null && this.f38636j.f40104b != null && this.f38636j.f40104b.mo29197w() != null) {
            if (!z || this.f38626T.mo28750a()) {
                if (this.f38636j.f40104b.mo29197w().mo29216b()) {
                    int[] iArr = new int[2];
                    this.f38632f.getLocationOnScreen(iArr);
                    int b = aes.m32758b(this.f38629c, iArr[0]);
                    int b2 = aes.m32758b(this.f38629c, iArr[1]);
                    if (!(b == this.f38624R && b2 == this.f38625S)) {
                        this.f38624R = b;
                        this.f38625S = b2;
                        this.f38636j.f40104b.mo29197w().mo29204a(this.f38624R, this.f38625S, !z);
                    }
                }
                if (this.f38632f != null) {
                    View findViewById = this.f38632f.getRootView().findViewById(16908290);
                    if (findViewById != null) {
                        Rect rect = new Rect();
                        Rect rect2 = new Rect();
                        this.f38632f.getGlobalVisibleRect(rect);
                        findViewById.getGlobalVisibleRect(rect2);
                        if (rect.top != rect2.top) {
                            this.f38621O = false;
                        }
                        if (rect.bottom != rect2.bottom) {
                            this.f38622P = false;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo27566a(boolean z) {
        if (!(this.f38618L != 0 || this.f38636j == null || this.f38636j.f40104b == null)) {
            this.f38636j.f40104b.stopLoading();
        }
        if (this.f38633g != null) {
            this.f38633g.mo28617b();
        }
        if (this.f38634h != null) {
            this.f38634h.mo28617b();
        }
        if (z) {
            this.f38636j = null;
        }
    }
}
