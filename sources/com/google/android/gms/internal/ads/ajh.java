package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C14963ax;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;

@C16299uq
public final class ajh extends ahk implements SurfaceTextureListener, akh {

    /* renamed from: a */
    final aib f40667a;

    /* renamed from: d */
    ahi f40668d;

    /* renamed from: e */
    private final aic f40669e;

    /* renamed from: f */
    private final boolean f40670f;

    /* renamed from: g */
    private final aia f40671g;

    /* renamed from: h */
    private Surface f40672h;

    /* renamed from: i */
    private ajz f40673i;

    /* renamed from: j */
    private String f40674j;

    /* renamed from: k */
    private String[] f40675k;

    /* renamed from: l */
    private boolean f40676l;

    /* renamed from: m */
    private int f40677m = 1;

    /* renamed from: n */
    private ahz f40678n;

    /* renamed from: o */
    private final boolean f40679o;

    /* renamed from: p */
    private boolean f40680p;

    /* renamed from: q */
    private boolean f40681q;

    /* renamed from: r */
    private int f40682r;

    /* renamed from: s */
    private int f40683s;

    /* renamed from: t */
    private int f40684t;

    /* renamed from: u */
    private int f40685u;

    /* renamed from: v */
    private float f40686v;

    public ajh(Context context, aic aic, aib aib, boolean z, boolean z2, aia aia) {
        super(context);
        this.f40670f = z2;
        this.f40667a = aib;
        this.f40669e = aic;
        this.f40679o = z;
        this.f40671g = aia;
        setSurfaceTextureListener(this);
        this.f40669e.mo28950a(this);
    }

    /* renamed from: f */
    private final ajz m33065f() {
        return new ajz(this.f40667a.getContext(), this.f40671g);
    }

    /* renamed from: g */
    private final String m33066g() {
        return C14963ax.m30831a().mo28670b(this.f40667a.getContext(), this.f40667a.mo28944k().f46237a);
    }

    /* renamed from: h */
    private final boolean m33067h() {
        return this.f40673i != null && !this.f40676l;
    }

    /* renamed from: i */
    private final boolean m33068i() {
        return m33067h() && this.f40677m != 1;
    }

    /* renamed from: j */
    private final void m33069j() {
        if (this.f40673i == null && this.f40674j != null && this.f40672h != null) {
            if (this.f40674j.startsWith("cache:")) {
                akt a = this.f40667a.mo28931a(this.f40674j);
                if (a instanceof alq) {
                    this.f40673i = ((alq) a).mo29115c();
                } else if (a instanceof alp) {
                    alp alp = (alp) a;
                    String g = m33066g();
                    ByteBuffer c = alp.mo29114c();
                    boolean z = alp.f40862e;
                    String str = alp.f40861d;
                    if (str == null) {
                        abv.m32798e("Stream cache URL is null.");
                        return;
                    } else {
                        this.f40673i = m33065f();
                        this.f40673i.mo29059a(new Uri[]{Uri.parse(str)}, g, c, z);
                    }
                } else {
                    String str2 = "Stream cache miss: ";
                    String valueOf = String.valueOf(this.f40674j);
                    abv.m32798e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return;
                }
            } else {
                this.f40673i = m33065f();
                String g2 = m33066g();
                Uri[] uriArr = new Uri[this.f40675k.length];
                for (int i = 0; i < this.f40675k.length; i++) {
                    uriArr[i] = Uri.parse(this.f40675k[i]);
                }
                this.f40673i.mo29058a(uriArr, g2);
            }
            this.f40673i.f40749f = this;
            m33063a(this.f40672h, false);
            this.f40677m = this.f40673i.f40748e.mo30363a();
            if (this.f40677m == 3) {
                m33070k();
            }
        }
    }

    /* renamed from: a */
    private final void m33063a(Surface surface, boolean z) {
        if (this.f40673i != null) {
            this.f40673i.mo29051a(surface, z);
        } else {
            abv.m32798e("Trying to set surface before player is initalized.");
        }
    }

    /* renamed from: a */
    private final void m33062a(float f, boolean z) {
        if (this.f40673i != null) {
            ajz ajz = this.f40673i;
            blx blx = new blx(ajz.f40746c, 2, Float.valueOf(f));
            if (z) {
                ajz.f40748e.mo30370b(blx);
                return;
            }
            ajz.f40748e.mo30368a(blx);
            return;
        }
        abv.m32798e("Trying to set volume before player is initalized.");
    }

    /* renamed from: e */
    public final void mo28848e() {
        m33062a(this.f40483c.mo28958a(), false);
    }

    /* renamed from: k */
    private final void m33070k() {
        if (!this.f40680p) {
            this.f40680p = true;
            acd.f40245a.post(new aji(this));
            mo28848e();
            this.f40669e.mo28949a();
            if (this.f40681q) {
                mo28846c();
            }
        }
    }

    /* renamed from: a */
    public final String mo28841a() {
        String valueOf = String.valueOf("ExoPlayer/3");
        String valueOf2 = String.valueOf(this.f40679o ? " spherical" : "");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final void mo28844a(ahi ahi) {
        this.f40668d = ahi;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f40674j = str;
            this.f40675k = new String[]{str};
            m33069j();
        }
    }

    /* renamed from: a */
    public final void mo28888a(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.f40674j = str;
            this.f40675k = (String[]) Arrays.copyOf(strArr, strArr.length);
            m33069j();
        }
    }

    /* renamed from: c */
    public final void mo28846c() {
        if (m33068i()) {
            if (this.f40671g.f40552a) {
                m33072m();
            }
            this.f40673i.f40748e.mo30367a(true);
            this.f40669e.mo28953c();
            this.f40483c.mo28960b();
            this.f40482b.mo28914a();
            acd.f40245a.post(new ajm(this));
            return;
        }
        this.f40681q = true;
    }

    /* renamed from: b */
    public final void mo28845b() {
        if (m33067h()) {
            this.f40673i.f40748e.mo30372c();
            if (this.f40673i != null) {
                m33063a((Surface) null, true);
                if (this.f40673i != null) {
                    this.f40673i.f40749f = null;
                    this.f40673i.mo29060c();
                    this.f40673i = null;
                }
                this.f40677m = 1;
                this.f40676l = false;
                this.f40680p = false;
                this.f40681q = false;
            }
        }
        this.f40669e.mo28954d();
        this.f40483c.mo28961c();
        this.f40669e.mo28951b();
    }

    /* renamed from: d */
    public final void mo28847d() {
        if (m33068i()) {
            if (this.f40671g.f40552a) {
                m33073n();
            }
            this.f40673i.f40748e.mo30367a(false);
            this.f40669e.mo28954d();
            this.f40483c.mo28961c();
            acd.f40245a.post(new ajn(this));
        }
    }

    /* renamed from: a */
    public final void mo28843a(int i) {
        if (m33068i()) {
            this.f40673i.f40748e.mo30364a((long) i);
        }
    }

    /* renamed from: b */
    public final void mo28889b(int i) {
        if (this.f40673i != null) {
            this.f40673i.f40745b.mo29040a(i);
        }
    }

    /* renamed from: c */
    public final void mo28890c(int i) {
        if (this.f40673i != null) {
            this.f40673i.f40745b.mo29045b(i);
        }
    }

    /* renamed from: d */
    public final void mo28891d(int i) {
        if (this.f40673i != null) {
            this.f40673i.f40745b.mo29047c(i);
        }
    }

    /* renamed from: e */
    public final void mo28892e(int i) {
        if (this.f40673i != null) {
            this.f40673i.f40745b.mo29049d(i);
        }
    }

    /* renamed from: f */
    public final void mo28893f(int i) {
        if (this.f40673i != null) {
            for (WeakReference weakReference : this.f40673i.f40751h) {
                ajt ajt = (ajt) weakReference.get();
                if (ajt != null) {
                    ajt.mo29029a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo28842a(float f, float f2) {
        if (this.f40678n != null) {
            this.f40678n.mo28923a(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (m33068i()) {
            return (int) this.f40673i.f40748e.mo30376g();
        }
        return 0;
    }

    public final int getDuration() {
        if (m33068i()) {
            return (int) this.f40673i.f40748e.mo30375f();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.f40682r;
    }

    public final int getVideoHeight() {
        return this.f40683s;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f40686v != 0.0f && this.f40678n == null) {
            float f = (float) measuredWidth;
            float f2 = f / ((float) measuredHeight);
            if (this.f40686v > f2) {
                measuredHeight = (int) (f / this.f40686v);
            }
            if (this.f40686v < f2) {
                measuredWidth = (int) (((float) measuredHeight) * this.f40686v);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        if (this.f40678n != null) {
            this.f40678n.mo28924a(measuredWidth, measuredHeight);
        }
        if (VERSION.SDK_INT == 16) {
            if (((this.f40684t > 0 && this.f40684t != measuredWidth) || (this.f40685u > 0 && this.f40685u != measuredHeight)) && this.f40670f && m33067h()) {
                blu blu = this.f40673i.f40748e;
                if (blu.mo30376g() > 0 && !blu.mo30371b()) {
                    m33062a(0.0f, true);
                    blu.mo30367a(true);
                    long g = blu.mo30376g();
                    long a = C14963ax.m30837g().mo28523a();
                    while (m33067h() && blu.mo30376g() == g) {
                        if (C14963ax.m30837g().mo28523a() - a > 250) {
                            break;
                        }
                    }
                    blu.mo30367a(false);
                    mo28848e();
                }
            }
            this.f40684t = measuredWidth;
            this.f40685u = measuredHeight;
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40679o) {
            this.f40678n = new ahz(getContext());
            this.f40678n.mo28925a(surfaceTexture, i, i2);
            this.f40678n.start();
            SurfaceTexture c = this.f40678n.mo28927c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f40678n.mo28926b();
                this.f40678n = null;
            }
        }
        this.f40672h = new Surface(surfaceTexture);
        if (this.f40673i == null) {
            m33069j();
        } else {
            m33063a(this.f40672h, true);
            if (!this.f40671g.f40552a) {
                m33072m();
            }
        }
        if (this.f40682r == 0 || this.f40683s == 0) {
            m33064b(i, i2);
        } else {
            m33071l();
        }
        acd.f40245a.post(new ajo(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40678n != null) {
            this.f40678n.mo28924a(i, i2);
        }
        acd.f40245a.post(new ajp(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f40669e.mo28952b(this);
        this.f40482b.mo28915a(surfaceTexture, this.f40668d);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo28847d();
        if (this.f40678n != null) {
            this.f40678n.mo28926b();
            this.f40678n = null;
        }
        if (this.f40673i != null) {
            m33073n();
            if (this.f40672h != null) {
                this.f40672h.release();
            }
            this.f40672h = null;
            m33063a((Surface) null, true);
        }
        acd.f40245a.post(new ajq(this));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        abv.m32494a(sb.toString());
        acd.f40245a.post(new ajr(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: a */
    public final void mo29007a(boolean z, long j) {
        if (this.f40667a != null) {
            agf.f40430a.execute(new ajs(this, z, j));
        }
    }

    /* renamed from: g */
    public final void mo29008g(int i) {
        if (this.f40677m != i) {
            this.f40677m = i;
            switch (i) {
                case 3:
                    m33070k();
                    return;
                case 4:
                    if (this.f40671g.f40552a) {
                        m33073n();
                    }
                    this.f40669e.mo28954d();
                    this.f40483c.mo28961c();
                    acd.f40245a.post(new ajj(this));
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo29005a(int i, int i2) {
        this.f40682r = i;
        this.f40683s = i2;
        m33071l();
    }

    /* renamed from: a */
    public final void mo29006a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String str2 = "ExoPlayerAdapter error: ";
        String valueOf = String.valueOf(sb2);
        abv.m32798e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.f40676l = true;
        if (this.f40671g.f40552a) {
            m33073n();
        }
        acd.f40245a.post(new ajk(this, sb2));
    }

    /* renamed from: l */
    private final void m33071l() {
        m33064b(this.f40682r, this.f40683s);
    }

    /* renamed from: b */
    private final void m33064b(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f40686v != f) {
            this.f40686v = f;
            requestLayout();
        }
    }

    /* renamed from: m */
    private final void m33072m() {
        if (this.f40673i != null) {
            this.f40673i.mo29056a(true);
        }
    }

    /* renamed from: n */
    private final void m33073n() {
        if (this.f40673i != null) {
            this.f40673i.mo29056a(false);
        }
    }
}
