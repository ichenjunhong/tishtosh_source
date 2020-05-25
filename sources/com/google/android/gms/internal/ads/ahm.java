package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.internal.C15464q;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@C16299uq
public final class ahm extends FrameLayout implements ahi {

    /* renamed from: a */
    final aid f40484a;

    /* renamed from: b */
    ahk f40485b;

    /* renamed from: c */
    String f40486c;

    /* renamed from: d */
    String[] f40487d;

    /* renamed from: e */
    private final aib f40488e;

    /* renamed from: f */
    private final FrameLayout f40489f;

    /* renamed from: g */
    private final C15806ck f40490g;

    /* renamed from: h */
    private final long f40491h;

    /* renamed from: i */
    private boolean f40492i;

    /* renamed from: j */
    private boolean f40493j;

    /* renamed from: k */
    private boolean f40494k;

    /* renamed from: l */
    private boolean f40495l;

    /* renamed from: m */
    private long f40496m;

    /* renamed from: n */
    private long f40497n;

    /* renamed from: o */
    private Bitmap f40498o;

    /* renamed from: p */
    private ImageView f40499p;

    /* renamed from: q */
    private boolean f40500q;

    /* renamed from: a */
    public static void m32918a(aib aib, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        aib.mo29242a("onVideoEvent", (Map) hashMap);
    }

    public ahm(Context context, aib aib, int i, boolean z, C15806ck ckVar, aia aia) {
        Context context2 = context;
        super(context);
        aib aib2 = aib;
        this.f40488e = aib2;
        C15806ck ckVar2 = ckVar;
        this.f40490g = ckVar2;
        this.f40489f = new FrameLayout(context);
        addView(this.f40489f, new LayoutParams(-1, -1));
        C15464q.m32123a(aib.mo28939e());
        this.f40485b = aib.mo28939e().f38690b.mo28894a(context, aib2, i, z, ckVar2, aia);
        if (this.f40485b != null) {
            this.f40489f.addView(this.f40485b, new LayoutParams(-1, -1, 17));
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44496z)).booleanValue()) {
                mo28902l();
            }
        }
        this.f40499p = new ImageView(context);
        this.f40491h = ((Long) caf.m37099d().mo30717a(C15740bx.f44190D)).longValue();
        this.f40495l = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44188B)).booleanValue();
        if (this.f40490g != null) {
            this.f40490g.mo30900a("spinner_used", this.f40495l ? "1" : "0");
        }
        this.f40484a = new aid(this);
        if (this.f40485b != null) {
            this.f40485b.mo28844a((ahi) this);
        }
        if (this.f40485b == null) {
            mo28878a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public final void mo28895a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f40489f.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: h */
    public final void mo28898h() {
        if (this.f40485b != null) {
            if (!TextUtils.isEmpty(this.f40486c)) {
                this.f40485b.mo28888a(this.f40486c, this.f40487d);
            } else {
                mo28896a("no_src", new String[0]);
            }
        }
    }

    /* renamed from: i */
    public final void mo28899i() {
        if (this.f40485b != null) {
            this.f40485b.mo28847d();
        }
    }

    /* renamed from: j */
    public final void mo28900j() {
        if (this.f40485b != null) {
            ahk ahk = this.f40485b;
            ahk.f40483c.mo28959a(true);
            ahk.mo28848e();
        }
    }

    /* renamed from: k */
    public final void mo28901k() {
        if (this.f40485b != null) {
            ahk ahk = this.f40485b;
            ahk.f40483c.mo28959a(false);
            ahk.mo28848e();
        }
    }

    public final void setVolume(float f) {
        if (this.f40485b != null) {
            ahk ahk = this.f40485b;
            aie aie = ahk.f40483c;
            aie.f40581a = f;
            aie.mo28962d();
            ahk.mo28848e();
        }
    }

    /* renamed from: l */
    public final void mo28902l() {
        if (this.f40485b != null) {
            TextView textView = new TextView(this.f40485b.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f40485b.mo28841a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f40489f.addView(textView, new LayoutParams(-2, -2, 17));
            this.f40489f.bringChildToFront(textView);
        }
    }

    /* renamed from: a */
    public final void mo28876a() {
        this.f40484a.mo28956b();
        acd.f40245a.post(new ahp(this));
    }

    /* renamed from: b */
    public final void mo28879b() {
        if (this.f40485b != null && this.f40497n == 0) {
            mo28896a("canplaythrough", "duration", String.valueOf(((float) this.f40485b.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f40485b.getVideoWidth()), "videoHeight", String.valueOf(this.f40485b.getVideoHeight()));
        }
    }

    /* renamed from: c */
    public final void mo28880c() {
        if (this.f40488e.mo28938d() != null && !this.f40493j) {
            this.f40494k = (this.f40488e.mo28938d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f40494k) {
                this.f40488e.mo28938d().getWindow().addFlags(128);
                this.f40493j = true;
            }
        }
        this.f40492i = true;
    }

    /* renamed from: d */
    public final void mo28881d() {
        mo28896a("pause", new String[0]);
        mo28904n();
        this.f40492i = false;
    }

    /* renamed from: e */
    public final void mo28882e() {
        mo28896a("ended", new String[0]);
        mo28904n();
    }

    /* renamed from: a */
    public final void mo28878a(String str, String str2) {
        mo28896a("error", "what", str, "extra", str2);
    }

    /* renamed from: f */
    public final void mo28883f() {
        if (this.f40500q && this.f40498o != null && !m32919o()) {
            this.f40499p.setImageBitmap(this.f40498o);
            this.f40499p.invalidate();
            this.f40489f.addView(this.f40499p, new LayoutParams(-1, -1));
            this.f40489f.bringChildToFront(this.f40499p);
        }
        this.f40484a.mo28955a();
        this.f40497n = this.f40496m;
        acd.f40245a.post(new ahq(this));
    }

    public final void finalize() throws Throwable {
        try {
            this.f40484a.mo28955a();
            if (this.f40485b != null) {
                ahk ahk = this.f40485b;
                Executor executor = agf.f40430a;
                ahk.getClass();
                executor.execute(new ahn(ahk));
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo28903m() {
        if (this.f40485b != null) {
            long currentPosition = (long) this.f40485b.getCurrentPosition();
            if (this.f40496m != currentPosition && currentPosition > 0) {
                mo28896a("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f40496m = currentPosition;
            }
        }
    }

    /* renamed from: g */
    public final void mo28884g() {
        if (this.f40492i && m32919o()) {
            this.f40489f.removeView(this.f40499p);
        }
        if (this.f40498o != null) {
            long b = C14963ax.m30837g().mo28524b();
            if (this.f40485b.getBitmap(this.f40498o) != null) {
                this.f40500q = true;
            }
            long b2 = C14963ax.m30837g().mo28524b() - b;
            if (abv.m32495a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                abv.m32494a(sb.toString());
            }
            if (b2 > this.f40491h) {
                abv.m32798e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f40495l = false;
                this.f40498o = null;
                if (this.f40490g != null) {
                    this.f40490g.mo30900a("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo28877a(int i, int i2) {
        if (this.f40495l) {
            int max = Math.max(i / ((Integer) caf.m37099d().mo30717a(C15740bx.f44189C)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) caf.m37099d().mo30717a(C15740bx.f44189C)).intValue(), 1);
            if (this.f40498o == null || this.f40498o.getWidth() != max || this.f40498o.getHeight() != max2) {
                this.f40498o = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.f40500q = false;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f40484a.mo28956b();
        } else {
            this.f40484a.mo28955a();
            this.f40497n = this.f40496m;
        }
        acd.f40245a.post(new aho(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f40484a.mo28956b();
            z = true;
        } else {
            this.f40484a.mo28955a();
            this.f40497n = this.f40496m;
            z = false;
        }
        acd.f40245a.post(new ahr(this, z));
    }

    /* renamed from: o */
    private final boolean m32919o() {
        return this.f40499p.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28896a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f40488e.mo29242a("onVideoEvent", (Map) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final void mo28904n() {
        if (this.f40488e.mo28938d() != null && this.f40493j && !this.f40494k) {
            this.f40488e.mo28938d().getWindow().clearFlags(128);
            this.f40493j = false;
        }
    }
}
