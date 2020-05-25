package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C14963ax;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.SideEffectFree;

@C16299uq
public final class ain extends ahk implements SurfaceTextureListener {

    /* renamed from: A */
    private int f40603A;

    /* renamed from: B */
    private final bhb f40604B = new ajb(this);

    /* renamed from: C */
    private final bic f40605C = new ajc(this);

    /* renamed from: D */
    private final bhk f40606D = new ajd(this);

    /* renamed from: a */
    final aib f40607a;

    /* renamed from: d */
    ahi f40608d;

    /* renamed from: e */
    int f40609e = 1;

    /* renamed from: f */
    int f40610f;

    /* renamed from: g */
    int f40611g;

    /* renamed from: h */
    float f40612h;

    /* renamed from: i */
    private float f40613i;

    /* renamed from: j */
    private final Context f40614j;

    /* renamed from: k */
    private final int f40615k;

    /* renamed from: l */
    private final aic f40616l;

    /* renamed from: m */
    private final boolean f40617m;

    /* renamed from: n */
    private final aia f40618n;

    /* renamed from: o */
    private Surface f40619o;

    /* renamed from: p */
    private aig f40620p;

    /* renamed from: q */
    private bgz f40621q;

    /* renamed from: r */
    private bhy f40622r;

    /* renamed from: s */
    private bhh f40623s;

    /* renamed from: t */
    private String f40624t;

    /* renamed from: u */
    private boolean f40625u;

    /* renamed from: v */
    private ahz f40626v;

    /* renamed from: w */
    private boolean f40627w;

    /* renamed from: x */
    private boolean f40628x;

    /* renamed from: y */
    private boolean f40629y;

    /* renamed from: z */
    private int f40630z;

    public ain(Context context, aic aic, aib aib, int i, boolean z, boolean z2, aia aia) {
        super(context);
        this.f40614j = context;
        this.f40617m = z2;
        this.f40607a = aib;
        this.f40615k = i;
        this.f40616l = aic;
        this.f40627w = z;
        this.f40618n = aia;
        setSurfaceTextureListener(this);
        this.f40616l.mo28950a(this);
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: g */
    private final boolean m33024g() {
        return this.f40621q != null && !this.f40625u;
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: h */
    private final boolean m33025h() {
        return m33024g() && this.f40609e != 1;
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [com.google.android.gms.internal.ads.bhf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m33026i() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.bgz r0 = r12.f40621q
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = r12.f40624t
            if (r0 == 0) goto L_0x021e
            android.view.Surface r0 = r12.f40619o
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = r12.f40624t
            java.lang.String r1 = "cache:"
            boolean r0 = r0.startsWith(r1)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x012b
            com.google.android.gms.internal.ads.aib r0 = r12.f40607a
            java.lang.String r3 = r12.f40624t
            com.google.android.gms.internal.ads.akt r0 = r0.mo28931a(r3)
            if (r0 == 0) goto L_0x0039
            boolean r3 = r0 instanceof com.google.android.gms.internal.ads.all
            if (r3 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.all r0 = (com.google.android.gms.internal.ads.all) r0
            r0.mo29111c()
            com.google.android.gms.internal.ads.aig r2 = r0.f40853d
            com.google.android.gms.internal.ads.bhb r0 = r12.f40604B
            com.google.android.gms.internal.ads.bic r3 = r12.f40605C
            com.google.android.gms.internal.ads.bhk r4 = r12.f40606D
            r2.mo28965a(r0, r3, r4)
            goto L_0x01d0
        L_0x0039:
            boolean r3 = r0 instanceof com.google.android.gms.internal.ads.alg
            if (r3 == 0) goto L_0x010d
            com.google.android.gms.internal.ads.alg r0 = (com.google.android.gms.internal.ads.alg) r0
            java.nio.ByteBuffer r3 = r0.mo29107c()
            java.lang.String r4 = r0.f40840d
            boolean r0 = r0.f40841e
            com.google.android.gms.internal.ads.aig r5 = new com.google.android.gms.internal.ads.aig
            r5.<init>()
            java.lang.String r6 = "video/webm"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.bkd r2 = new com.google.android.gms.internal.ads.bkd
            r2.<init>()
        L_0x0059:
            r9 = r2
            goto L_0x0061
        L_0x005b:
            com.google.android.gms.internal.ads.bjr r2 = new com.google.android.gms.internal.ads.bjr
            r2.<init>()
            goto L_0x0059
        L_0x0061:
            if (r0 == 0) goto L_0x0087
            int r0 = r3.limit()
            if (r0 <= 0) goto L_0x0087
            int r0 = r3.limit()
            byte[] r0 = new byte[r0]
            r3.get(r0)
            com.google.android.gms.internal.ads.bkl r8 = new com.google.android.gms.internal.ads.bkl
            r8.<init>(r0)
            com.google.android.gms.internal.ads.bjc r0 = new com.google.android.gms.internal.ads.bjc
            android.net.Uri r7 = android.net.Uri.parse(r4)
            r10 = 2
            com.google.android.gms.internal.ads.aia r2 = r12.f40618n
            int r11 = r2.f40554c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00f4
        L_0x0087:
            com.google.android.gms.internal.ads.acd r0 = com.google.android.gms.ads.internal.C14963ax.m30831a()
            com.google.android.gms.internal.ads.aib r2 = r12.f40607a
            android.content.Context r2 = r2.getContext()
            com.google.android.gms.internal.ads.aib r6 = r12.f40607a
            com.google.android.gms.internal.ads.zzbgz r6 = r6.mo28944k()
            java.lang.String r6 = r6.f46237a
            java.lang.String r0 = r0.mo28670b(r2, r6)
            com.google.android.gms.internal.ads.bkr r2 = new com.google.android.gms.internal.ads.bkr
            com.google.android.gms.internal.ads.aib r6 = r12.f40607a
            android.content.Context r6 = r6.getContext()
            r2.<init>(r6, r0)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44358cm
            com.google.android.gms.internal.ads.bu r6 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r0 = r6.mo30717a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c7
            com.google.android.gms.internal.ads.aje r0 = new com.google.android.gms.internal.ads.aje
            android.content.Context r6 = r12.f40614j
            com.google.android.gms.internal.ads.aip r7 = new com.google.android.gms.internal.ads.aip
            r7.<init>(r12)
            r0.<init>(r6, r2, r7)
            goto L_0x00c8
        L_0x00c7:
            r0 = r2
        L_0x00c8:
            int r2 = r3.limit()
            if (r2 <= 0) goto L_0x00e4
            int r2 = r3.limit()
            byte[] r2 = new byte[r2]
            r3.get(r2)
            com.google.android.gms.internal.ads.bkl r3 = new com.google.android.gms.internal.ads.bkl
            r3.<init>(r2)
            com.google.android.gms.internal.ads.ajg r6 = new com.google.android.gms.internal.ads.ajg
            int r2 = r2.length
            r6.<init>(r3, r2, r0)
            r8 = r6
            goto L_0x00e5
        L_0x00e4:
            r8 = r0
        L_0x00e5:
            com.google.android.gms.internal.ads.bjc r0 = new com.google.android.gms.internal.ads.bjc
            android.net.Uri r7 = android.net.Uri.parse(r4)
            r10 = 2
            com.google.android.gms.internal.ads.aia r2 = r12.f40618n
            int r11 = r2.f40554c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x00f4:
            com.google.android.gms.internal.ads.bhb r2 = r12.f40604B
            com.google.android.gms.internal.ads.bic r3 = r12.f40605C
            com.google.android.gms.internal.ads.bhk r4 = r12.f40606D
            r5.mo28965a(r2, r3, r4)
            boolean r0 = r5.mo28966a(r0)
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "AdExoPlayerHelper Error"
            java.lang.String r2 = "Prepare from ByteBuffer failed."
            r12.m33023a(r0, r2)
        L_0x010a:
            r2 = r5
            goto L_0x01d0
        L_0x010d:
            java.lang.String r0 = "Source is MD5 but not found in cache. Source: "
            java.lang.String r3 = r12.f40624t
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0120
            java.lang.String r0 = r0.concat(r3)
            goto L_0x0126
        L_0x0120:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x0126:
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            goto L_0x01d0
        L_0x012b:
            int r0 = r12.f40615k
            r3 = 2
            r4 = 1
            if (r0 != r4) goto L_0x0144
            com.google.android.gms.internal.ads.bhf r0 = new com.google.android.gms.internal.ads.bhf
            com.google.android.gms.internal.ads.aib r4 = r12.f40607a
            android.content.Context r4 = r4.getContext()
            java.lang.String r5 = r12.f40624t
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r0.<init>(r4, r5, r2, r3)
            goto L_0x01b5
        L_0x0144:
            int r0 = r12.f40615k
            if (r0 != r3) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            com.google.android.gms.common.internal.C15464q.m32133b(r4)
            com.google.android.gms.internal.ads.acd r0 = com.google.android.gms.ads.internal.C14963ax.m30831a()
            com.google.android.gms.internal.ads.aib r3 = r12.f40607a
            android.content.Context r3 = r3.getContext()
            com.google.android.gms.internal.ads.aib r4 = r12.f40607a
            com.google.android.gms.internal.ads.zzbgz r4 = r4.mo28944k()
            java.lang.String r4 = r4.f46237a
            java.lang.String r0 = r0.mo28670b(r3, r4)
            com.google.android.gms.internal.ads.bkr r3 = new com.google.android.gms.internal.ads.bkr
            com.google.android.gms.internal.ads.aib r4 = r12.f40607a
            android.content.Context r4 = r4.getContext()
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44358cm
            com.google.android.gms.internal.ads.bu r4 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r0 = r4.mo30717a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x018e
            com.google.android.gms.internal.ads.aje r0 = new com.google.android.gms.internal.ads.aje
            android.content.Context r4 = r12.f40614j
            com.google.android.gms.internal.ads.aio r5 = new com.google.android.gms.internal.ads.aio
            r5.<init>(r12)
            r0.<init>(r4, r3, r5)
            r8 = r0
            goto L_0x018f
        L_0x018e:
            r8 = r3
        L_0x018f:
            java.lang.String r0 = "video/webm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x019e
            com.google.android.gms.internal.ads.bkd r0 = new com.google.android.gms.internal.ads.bkd
            r0.<init>()
        L_0x019c:
            r9 = r0
            goto L_0x01a4
        L_0x019e:
            com.google.android.gms.internal.ads.bjr r0 = new com.google.android.gms.internal.ads.bjr
            r0.<init>()
            goto L_0x019c
        L_0x01a4:
            com.google.android.gms.internal.ads.bjc r0 = new com.google.android.gms.internal.ads.bjc
            java.lang.String r2 = r12.f40624t
            android.net.Uri r7 = android.net.Uri.parse(r2)
            r10 = 2
            com.google.android.gms.internal.ads.aia r2 = r12.f40618n
            int r11 = r2.f40554c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x01b5:
            com.google.android.gms.internal.ads.aig r2 = new com.google.android.gms.internal.ads.aig
            r2.<init>()
            com.google.android.gms.internal.ads.bhb r3 = r12.f40604B
            com.google.android.gms.internal.ads.bic r4 = r12.f40605C
            com.google.android.gms.internal.ads.bhk r5 = r12.f40606D
            r2.mo28965a(r3, r4, r5)
            boolean r0 = r2.mo28966a(r0)
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "AdExoPlayerHelper Error"
            java.lang.String r3 = "Prepare failed."
            r12.m33023a(r0, r3)
        L_0x01d0:
            r12.f40620p = r2
            com.google.android.gms.internal.ads.aig r0 = r12.f40620p
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "AdExoPlayerHelper is null. Source: "
            java.lang.String r1 = r12.f40624t
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x01e9
            java.lang.String r0 = r0.concat(r1)
            goto L_0x01ef
        L_0x01e9:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x01ef:
            com.google.android.gms.internal.ads.abv.m32798e(r0)
            return
        L_0x01f3:
            com.google.android.gms.internal.ads.aig r0 = r12.f40620p
            com.google.android.gms.internal.ads.bgz r0 = r0.f40589b
            r12.f40621q = r0
            com.google.android.gms.internal.ads.aig r0 = r12.f40620p
            com.google.android.gms.internal.ads.bhy r0 = r0.f40590c
            r12.f40622r = r0
            com.google.android.gms.internal.ads.aig r0 = r12.f40620p
            com.google.android.gms.internal.ads.bhh r0 = r0.f40591d
            r12.f40623s = r0
            com.google.android.gms.internal.ads.bgz r0 = r12.f40621q
            if (r0 == 0) goto L_0x021e
            android.view.Surface r0 = r12.f40619o
            r12.m33020a(r0, r1)
            com.google.android.gms.internal.ads.bgz r0 = r12.f40621q
            int r0 = r0.mo30144a()
            r12.f40609e = r0
            int r0 = r12.f40609e
            r1 = 4
            if (r0 != r1) goto L_0x021e
            r12.mo28983f()
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ain.m33026i():void");
    }

    @SideEffectFree
    /* renamed from: a */
    private final void m33020a(Surface surface, boolean z) {
        if (this.f40621q == null || this.f40622r == null) {
            abv.m32798e("Trying to set surface before player and renderers are initalized.");
        } else if (z) {
            this.f40621q.mo30151b(this.f40622r, 1, surface);
        } else {
            this.f40621q.mo30147a(this.f40622r, 1, surface);
        }
    }

    @SideEffectFree
    /* renamed from: a */
    private final void m33019a(float f, boolean z) {
        if (this.f40621q == null || this.f40623s == null) {
            abv.m32798e("Trying to set volume before player and renderers are initalized.");
        } else if (z) {
            this.f40621q.mo30151b(this.f40623s, 1, Float.valueOf(f));
        } else {
            this.f40621q.mo30147a(this.f40623s, 1, Float.valueOf(f));
        }
    }

    /* renamed from: e */
    public final void mo28848e() {
        m33019a(this.f40483c.mo28958a(), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28982a(int i, int i2, float f) {
        float f2 = i2 == 0 ? 1.0f : (((float) i) * f) / ((float) i2);
        if (this.f40613i != f2) {
            this.f40613i = f2;
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo28983f() {
        if (!this.f40628x) {
            this.f40628x = true;
            abv.m32494a("Video is ready.");
            acd.f40245a.post(new ait(this));
            mo28848e();
            this.f40616l.mo28949a();
            if (this.f40629y) {
                mo28846c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m33023a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(str2).length());
        sb.append("Error received: ");
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        abv.m32798e(sb.toString());
        this.f40625u = true;
        if (this.f40618n.f40552a) {
            m33028k();
        }
        acd.f40245a.post(new aiv(this, str, str2));
    }

    /* renamed from: a */
    public final String mo28841a() {
        String str;
        if (this.f40615k == 1) {
            str = "/Framework";
        } else if (this.f40615k == 2) {
            StringBuilder sb = new StringBuilder(String.valueOf(null).length() + 12);
            sb.append("/Extractor(");
            sb.append(null);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "/Unknown";
        }
        String str2 = this.f40627w ? " spherical" : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb2.append("ExoPlayer/1");
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo28844a(ahi ahi) {
        this.f40608d = ahi;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f40624t = str;
            m33026i();
            return;
        }
        abv.m32798e("Path is null.");
    }

    /* renamed from: c */
    public final void mo28846c() {
        if (m33025h()) {
            if (this.f40618n.f40552a) {
                m33027j();
            }
            this.f40621q.mo30149a(true);
            this.f40616l.mo28953c();
            this.f40483c.mo28960b();
            this.f40482b.mo28914a();
            acd.f40245a.post(new aiw(this));
            return;
        }
        this.f40629y = true;
    }

    /* renamed from: b */
    public final void mo28845b() {
        if (m33024g()) {
            this.f40621q.mo30153c();
            if (this.f40621q != null) {
                m33020a((Surface) null, true);
                if (this.f40620p != null) {
                    this.f40620p.mo28967b();
                    this.f40620p = null;
                }
                this.f40621q = null;
                this.f40622r = null;
                this.f40623s = null;
                this.f40609e = 1;
                this.f40625u = false;
                this.f40628x = false;
                this.f40629y = false;
            }
        }
        this.f40616l.mo28954d();
        this.f40483c.mo28961c();
        this.f40616l.mo28951b();
    }

    /* renamed from: d */
    public final void mo28847d() {
        if (m33025h()) {
            if (this.f40618n.f40552a) {
                m33028k();
            }
            this.f40621q.mo30149a(false);
            this.f40616l.mo28954d();
            this.f40483c.mo28961c();
            acd.f40245a.post(new aix(this));
        }
    }

    /* renamed from: a */
    public final void mo28843a(int i) {
        if (m33025h()) {
            this.f40621q.mo30146a((long) i);
        }
    }

    /* renamed from: a */
    public final void mo28842a(float f, float f2) {
        if (this.f40626v != null) {
            this.f40626v.mo28923a(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (m33025h()) {
            return (int) this.f40621q.mo30156f();
        }
        return 0;
    }

    public final int getDuration() {
        if (m33025h()) {
            return (int) this.f40621q.mo30155e();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.f40610f;
    }

    public final int getVideoHeight() {
        return this.f40611g;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f40613i != 0.0f && this.f40626v == null) {
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            float f3 = (this.f40613i / (f / f2)) - 1.0f;
            if (f3 > 0.01f) {
                measuredHeight = (int) (f / this.f40613i);
            } else if (f3 < -0.01f) {
                measuredWidth = (int) (f2 * this.f40613i);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        if (this.f40626v != null) {
            this.f40626v.mo28924a(measuredWidth, measuredHeight);
        }
        if (VERSION.SDK_INT == 16) {
            if (((this.f40630z > 0 && this.f40630z != measuredWidth) || (this.f40603A > 0 && this.f40603A != measuredHeight)) && this.f40617m && m33024g() && this.f40621q.mo30156f() > 0 && !this.f40621q.mo30152b()) {
                m33019a(0.0f, true);
                this.f40621q.mo30149a(true);
                long f4 = this.f40621q.mo30156f();
                long a = C14963ax.m30837g().mo28523a();
                while (m33024g() && this.f40621q.mo30156f() == f4) {
                    if (C14963ax.m30837g().mo28523a() - a > 250) {
                        break;
                    }
                }
                if (m33024g()) {
                    this.f40621q.mo30149a(false);
                }
                mo28848e();
            }
            this.f40630z = measuredWidth;
            this.f40603A = measuredHeight;
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40627w) {
            this.f40626v = new ahz(getContext());
            this.f40626v.mo28925a(surfaceTexture, i, i2);
            this.f40626v.start();
            SurfaceTexture c = this.f40626v.mo28927c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f40626v.mo28926b();
                this.f40626v = null;
            }
        }
        this.f40619o = new Surface(surfaceTexture);
        if (this.f40621q == null) {
            m33026i();
        } else {
            m33020a(this.f40619o, true);
            if (!this.f40618n.f40552a) {
                m33027j();
            }
        }
        float f = 1.0f;
        if (!(this.f40610f == 0 || this.f40611g == 0)) {
            i = this.f40610f;
            i2 = this.f40611g;
            f = this.f40612h;
        }
        mo28982a(i, i2, f);
        acd.f40245a.post(new aiy(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40626v != null) {
            this.f40626v.mo28924a(i, i2);
        }
        acd.f40245a.post(new aiz(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        abv.m32494a("Surface destroyed");
        mo28847d();
        if (this.f40626v != null) {
            this.f40626v.mo28926b();
            this.f40626v = null;
        }
        if (this.f40621q != null) {
            m33028k();
            if (this.f40619o != null) {
                this.f40619o.release();
            }
            this.f40619o = null;
            m33020a((Surface) null, true);
        }
        acd.f40245a.post(new aja(this));
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f40616l.mo28952b(this);
        this.f40482b.mo28915a(surfaceTexture, this.f40608d);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView1 window visibility changed to ");
        sb.append(i);
        abv.m32494a(sb.toString());
        acd.f40245a.post(new aiq(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: j */
    private final void m33027j() {
        if (this.f40621q != null) {
            this.f40621q.mo30145a(0, true);
        }
    }

    /* renamed from: k */
    private final void m33028k() {
        if (this.f40621q != null) {
            this.f40621q.mo30145a(0, false);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m33021a(ain ain) {
        abv.m32494a("Video ended.");
        if (ain.f40618n.f40552a) {
            ain.m33028k();
        }
        ain.f40616l.mo28954d();
        ain.f40483c.mo28961c();
        acd.f40245a.post(new aiu(ain));
    }
}
