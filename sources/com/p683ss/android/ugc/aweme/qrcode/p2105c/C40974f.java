package com.p683ss.android.ugc.aweme.qrcode.p2105c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.api.CouponRedeemApi.C25639b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a.C36953a;
import com.p683ss.android.ugc.aweme.qrcode.C41008e;
import com.p683ss.android.ugc.aweme.qrcode.ScanResultActivity;
import com.p683ss.android.ugc.aweme.qrcode.TextQRCodeActivity;
import com.p683ss.android.ugc.aweme.qrcode.p2102a.C40930d;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40942c;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40943d;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40970d.C40972a;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40997p.C40998a;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40997p.C40999b;
import com.p683ss.android.ugc.aweme.qrcode.p2106d.C41006c;
import com.p683ss.android.ugc.aweme.qrcode.p2106d.C41007d;
import com.p683ss.android.ugc.aweme.router.C41312z;
import com.p683ss.android.ugc.aweme.share.C41941ab;
import com.p683ss.android.ugc.aweme.share.C42250w;
import com.p683ss.android.ugc.aweme.share.p2150b.C41992b;
import com.p683ss.android.ugc.aweme.util.C47631n;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.f */
public final class C40974f implements C40972a, C40999b {

    /* renamed from: a */
    public AmeSSActivity f104211a;

    /* renamed from: b */
    public C40998a f104212b;

    /* renamed from: c */
    public boolean f104213c;

    /* renamed from: d */
    public String f104214d;

    /* renamed from: e */
    public boolean f104215e;

    /* renamed from: f */
    public C40988m f104216f = new C40988m(this);

    /* renamed from: g */
    boolean f104217g;

    /* renamed from: h */
    public boolean f104218h;

    /* renamed from: i */
    public List<C40930d> f104219i;

    /* renamed from: j */
    public List<C40930d> f104220j;

    /* renamed from: k */
    private C40970d f104221k;

    /* renamed from: l */
    private C41008e f104222l = new C41008e();

    /* renamed from: com.ss.android.ugc.aweme.qrcode.c.f$a */
    static class C40981a {

        /* renamed from: a */
        public final C25639b f104238a = null;

        /* renamed from: b */
        public final String f104239b;

        C40981a(C25639b bVar, String str) {
            this.f104239b = str;
        }
    }

    /* renamed from: a */
    public final long mo83450a() {
        return 65536;
    }

    /* renamed from: a */
    public final void mo83451a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public final boolean mo83475a(Context context, String str, int i, int i2) {
        String b = C41992b.m91957b(str);
        if (TimeLockRuler.isTeenModeON() && !ParentalPlatformManager.m55916a(b)) {
            C10691a.m21548c(C11010c.m22280a(), (int) R.string.dw3).mo19066a();
            return true;
        } else if (C41007d.m90632a(b) || C41007d.m90633b(b)) {
            if (C41007d.m90633b(b)) {
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append("&schema_type=9");
                sb.append("&object_id=");
                sb.append(C41312z.m91072b(b, "app_effect_id"));
                b = sb.toString();
            }
            for (C40930d dVar : this.f104219i) {
                if (dVar.mo83412a(b, i2)) {
                    this.f104214d = dVar.mo83410a();
                    return true;
                }
            }
            this.f104214d = "web";
            if (this.f104221k == null) {
                this.f104221k = new C40970d(this);
            }
            C40970d dVar2 = this.f104221k;
            AmeSSActivity ameSSActivity = this.f104211a;
            if (!TextUtils.isEmpty(b)) {
                if (dVar2.f104206b != null) {
                    dVar2.f104206b.mo77195c();
                    dVar2.f104206b = null;
                }
                dVar2.f104206b = new C40989n(new C40943d(), new C40969c(ameSSActivity, b, i) {

                    /* renamed from: a */
                    final /* synthetic */ Context f104207a;

                    /* renamed from: b */
                    final /* synthetic */ String f104208b;

                    /* renamed from: c */
                    final /* synthetic */ int f104209c;

                    /* renamed from: a */
                    public final void mo83465a(Exception exc) {
                        C40970d.m90569a(this.f104207a, this.f104208b, true, this.f104209c);
                        C40970d.this.mo83466a();
                    }

                    /* renamed from: a */
                    public final void mo83464a(C40942c cVar) {
                        int i = cVar.f104168a;
                        if (i == 0) {
                            C40970d.m90569a(this.f104207a, this.f104208b, true, this.f104209c);
                        } else if (i == 3 || i == 5 || i == 9) {
                            C40970d.m90569a(this.f104207a, C41006c.m90631a(this.f104208b, cVar.f104169b, "qrcode"), true, this.f104209c);
                        } else if (i != 11) {
                            C40970d.m90569a(this.f104207a, this.f104208b, true, this.f104209c);
                        } else {
                            Context context = this.f104207a;
                            String str = this.f104208b;
                            Intent intent = new Intent(context, ScanResultActivity.class);
                            intent.putExtra("extra_scan_result", str);
                            context.startActivity(intent);
                        }
                        C40970d.this.mo83466a();
                    }

                    {
                        this.f104207a = r2;
                        this.f104208b = r3;
                        this.f104209c = r4;
                    }
                });
                dVar2.f104206b.mo83480a(b);
            }
            return true;
        } else {
            for (C40930d dVar3 : this.f104220j) {
                if (dVar3.mo83412a(b, i2)) {
                    this.f104214d = dVar3.mo83410a();
                    return true;
                }
            }
            AmeSSActivity ameSSActivity2 = this.f104211a;
            Intent intent = new Intent(ameSSActivity2, TextQRCodeActivity.class);
            intent.putExtra("intent_extra_content", b);
            ameSSActivity2.startActivity(intent);
            this.f104214d = "text";
            return true;
        }
    }

    /* renamed from: c */
    public final void mo83458c() {
        this.f104212b.mo83491a(false);
    }

    /* renamed from: d */
    public final void mo83467d() {
        this.f104212b.mo83490a(200);
    }

    /* renamed from: b */
    public final void mo83457b() {
        if (this.f104221k != null) {
            C40970d dVar = this.f104221k;
            if (dVar.f104206b != null) {
                dVar.f104206b.mo77195c();
            }
            dVar.f104205a = null;
        }
        this.f104212b = null;
        this.f104211a = null;
    }

    /* renamed from: a */
    public final void mo83472a(String str) {
        if (this.f104211a != null && this.f104211a.isViewValid() && !TextUtils.isEmpty(str)) {
            this.f104218h = true;
            C42250w wVar = new C42250w(this.f104211a, 3);
            wVar.f106816e = false;
            wVar.f106818g = new C40985j(this);
            wVar.mo86227a(str, 0, "scan", "scan");
        }
    }

    public C40974f(AmeSSActivity ameSSActivity, C40998a aVar) {
        this.f104211a = ameSSActivity;
        this.f104212b = aVar;
    }

    /* renamed from: a */
    public final void mo83473a(String str, String str2) {
        if (this.f104211a != null && this.f104211a.isViewValid()) {
            this.f104218h = true;
            C41941ab abVar = new C41941ab(this.f104211a, "scan");
            abVar.f106178r = false;
            abVar.f106171k = new C40983h(str);
            abVar.f106172l = new C40984i(this);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", "qrcode");
            abVar.mo86053a(C17593ar.m43277a((E[]) new String[]{str}), false, hashMap);
        }
    }

    /* renamed from: a */
    public final void mo83455a(boolean z, int i, int i2) {
        if (this.f104211a != null && this.f104211a.isViewValid()) {
            new Handler(Looper.getMainLooper()).post(new C40982g(this, z));
            if (z) {
                this.f104212b.bI_();
            }
        }
    }

    /* renamed from: a */
    private void m90581a(String str, boolean z, String str2, String str3) {
        m90580a(null, str, z, str2, str3);
    }

    /* renamed from: a */
    public final void mo83456a(boolean z, int i, final String str, final int i2) {
        if (this.f104211a.isViewValid()) {
            if (i2 == 2) {
                C47631n.m103118a(str, this.f104211a);
                return;
            }
            AmeSSActivity ameSSActivity = this.f104211a;
            this.f104213c = z;
            if (!C40987l.m90602a(this.f104211a)) {
                C9432q.m18672a((Context) this.f104211a, (int) R.string.cg1);
                return;
            }
            C47718bf.m103288a(new C36953a().mo76202a("qrCode").mo76205b(str).mo76204a());
            C0013i a = C0013i.m18a((Callable<TResult>) new Callable<String>() {
                public final /* synthetic */ Object call() throws Exception {
                    C40974f.this.f104212b.mo83496f();
                    return null;
                }
            }, C0013i.f25b).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<String, C40981a>() {
                public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                    boolean z;
                    String str = str;
                    int i = i2;
                    if (C41007d.m90632a(str)) {
                        Uri parse = Uri.parse(str);
                        Set set = (Set) C23183v.m56778a().mo47914j().mo47782d();
                        if (set.isEmpty()) {
                            z = C41007d.f104259a.contains(parse.getHost());
                        } else {
                            z = set.contains(parse.getHost());
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = C41992b.m91955a(str);
                    }
                    return new C40981a(null, str);
                }
            }, (Executor) C0013i.f24a);
            final int i3 = i2;
            final int i4 = i;
            final String str2 = str;
            final boolean z2 = z;
            C409762 r1 = new C0011g<C40981a, String>() {
                /* access modifiers changed from: private */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
                /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
                /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
                /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00f7  */
                /* JADX WARNING: Removed duplicated region for block: B:40:0x00fa  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.String then(p001a.C0013i<com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.C40981a> r7) {
                    /*
                        r6 = this;
                        java.lang.Object r7 = r7.mo34e()
                        com.ss.android.ugc.aweme.qrcode.c.f$a r7 = (com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.C40981a) r7
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r0 = r7.f104238a
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L_0x0060
                        boolean r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
                        if (r0 != 0) goto L_0x0060
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r0 = r7.f104238a
                        int r0 = r0.statusCode
                        if (r0 == 0) goto L_0x0028
                        android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r1 = r7.f104238a
                        java.lang.String r1 = r1.statusMsg
                        com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r0, r1)
                        r0.mo19066a()
                        goto L_0x006f
                    L_0x0028:
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r0 = r7.f104238a
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$a r0 = r0.coupon
                        if (r0 == 0) goto L_0x0048
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r0 = r7.f104238a
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$a r0 = r0.coupon
                        int r0 = r0.couponType
                        r3 = 10
                        if (r0 != r3) goto L_0x0048
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.base.activity.AmeSSActivity r0 = r0.f104211a
                        java.lang.String r3 = r7.f104239b
                        java.lang.String r4 = "object_id"
                        java.lang.String r3 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r3, r4)
                        com.p683ss.android.ugc.aweme.commercialize.CouponVerifyConsumptionSuccessActivity.m62097a(r0, r3)
                        goto L_0x0070
                    L_0x0048:
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        java.lang.String r3 = "verify_coupon_page"
                        r0.f104214d = r3
                        android.os.Handler r0 = new android.os.Handler
                        android.os.Looper r3 = android.os.Looper.getMainLooper()
                        r0.<init>(r3)
                        com.ss.android.ugc.aweme.qrcode.c.k r3 = new com.ss.android.ugc.aweme.qrcode.c.k
                        r3.<init>(r6, r7)
                        r0.post(r3)
                        goto L_0x0070
                    L_0x0060:
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.f r1 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.base.activity.AmeSSActivity r1 = r1.f104211a
                        java.lang.String r3 = r7.f104239b
                        int r4 = r3
                        int r5 = r4
                        r0.mo83475a(r1, r3, r4, r5)
                    L_0x006f:
                        r1 = 0
                    L_0x0070:
                        int r0 = r3
                        r3 = 3
                        if (r0 != r3) goto L_0x0086
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.p$a r7 = r7.f104212b
                        r7.mo83498g()
                        if (r1 != 0) goto L_0x00ca
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.p$a r7 = r7.f104212b
                        r7.mo83500i()
                        goto L_0x00ca
                    L_0x0086:
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        boolean r0 = r0.f104217g
                        if (r0 == 0) goto L_0x0098
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.p$a r7 = r7.f104212b
                        r7.mo83498g()
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        r7.f104217g = r2
                        goto L_0x00ca
                    L_0x0098:
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        boolean r0 = r0.f104215e
                        if (r0 != 0) goto L_0x00c6
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        boolean r0 = r0.f104218h
                        if (r0 != 0) goto L_0x00c1
                        com.ss.android.ugc.aweme.qrcode.c.f r0 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.p$a r0 = r0.f104212b
                        r0.mo83493c()
                        com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi$b r7 = r7.f104238a
                        if (r7 != 0) goto L_0x00b9
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.p$a r7 = r7.f104212b
                        r0 = 200(0xc8, float:2.8E-43)
                        r7.mo83490a(r0)
                        goto L_0x00ca
                    L_0x00b9:
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        com.ss.android.ugc.aweme.qrcode.c.p$a r7 = r7.f104212b
                        r7.finish()
                        goto L_0x00ca
                    L_0x00c1:
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        r7.f104218h = r2
                        goto L_0x00ca
                    L_0x00c6:
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        r7.f104215e = r2
                    L_0x00ca:
                        java.lang.String r7 = r5
                        android.net.Uri r7 = android.net.Uri.parse(r7)
                        java.lang.String r0 = "u_code"
                        java.lang.String r7 = r7.getQueryParameter(r0)
                        com.ss.android.ugc.aweme.aq.ak r0 = new com.ss.android.ugc.aweme.aq.ak
                        r0.<init>()
                        java.lang.String r1 = r5
                        r0.f61711a = r1
                        boolean r1 = r6
                        if (r1 == 0) goto L_0x00e6
                        java.lang.String r1 = "scan_album"
                        goto L_0x00e8
                    L_0x00e6:
                        java.lang.String r1 = "scan_cam"
                    L_0x00e8:
                        r0.f61712b = r1
                        com.ss.android.ugc.aweme.qrcode.c.f r1 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        java.lang.String r1 = r1.f104214d
                        r0.f61713c = r1
                        r0.f61714d = r7
                        int r7 = r4
                        r1 = 2
                        if (r7 != r1) goto L_0x00fa
                        java.lang.String r7 = "shaped"
                        goto L_0x00fc
                    L_0x00fa:
                        java.lang.String r7 = "general"
                    L_0x00fc:
                        r0.f61715e = r7
                        r0.mo48076e()
                        com.ss.android.ugc.aweme.qrcode.c.f r7 = com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.this
                        r7.f104213c = r2
                        r7 = 0
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.C409762.then(a.i):java.lang.String");
                }
            };
            a.mo20a((C0011g<TResult, TContinuationResult>) r1, C0013i.f25b);
            Vibrator vibrator = (Vibrator) this.f104211a.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200);
            }
        }
    }

    /* renamed from: a */
    private static void m90580a(C23089d dVar, String str, boolean z, String str2, String str3) {
        String str4;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "scan");
        String str5 = "enter_method";
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        C26890h.m65011a(str, a.mo47829a(str5, str4).mo47829a(str2, str3).f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e5, code lost:
        r10 = new android.content.Intent(r9, com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.class);
        r10.putExtra("id", r11);
        r10.putExtra("invitation_code", null);
        r10.putExtra("invitor", null);
        r10.putExtra("refer", r13);
        r9.startActivity(r10);
        m90581a("video_play", r8.f104213c, "group_id", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020c, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83474a(android.content.Context r9, int r10, final java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            r8 = this;
            java.lang.String r14 = ""
            boolean r15 = android.text.TextUtils.isEmpty(r12)
            if (r15 != 0) goto L_0x0021
            android.net.Uri r15 = android.net.Uri.parse(r12)
            if (r15 == 0) goto L_0x0021
            java.lang.String r14 = "sec_uid"
            java.lang.String r14 = r15.getQueryParameter(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto L_0x0021
            com.ss.android.ugc.aweme.utils.ew r15 = com.p683ss.android.ugc.aweme.utils.C47865ew.m103536a()
            r15.mo95077a(r11, r14)
        L_0x0021:
            boolean r15 = com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            r0 = 0
            if (r15 == 0) goto L_0x0029
            return r0
        L_0x0029:
            r15 = 23
            r1 = 1
            if (r10 == r15) goto L_0x020d
            r2 = 0
            switch(r10) {
                case 1: goto L_0x01e5;
                case 2: goto L_0x0210;
                case 3: goto L_0x01d8;
                case 4: goto L_0x01cb;
                case 5: goto L_0x0169;
                default: goto L_0x0032;
            }
        L_0x0032:
            r15 = 2132541874(0x7f1c01b2, float:2.0736837E38)
            switch(r10) {
                case 7: goto L_0x0110;
                case 8: goto L_0x010c;
                case 9: goto L_0x00c4;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r10) {
                case 16: goto L_0x00b7;
                case 17: goto L_0x0082;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r10) {
                case 25: goto L_0x0081;
                case 26: goto L_0x0081;
                case 27: goto L_0x0081;
                case 28: goto L_0x0081;
                case 29: goto L_0x01e5;
                case 30: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            return r0
        L_0x003f:
            com.ss.android.ugc.aweme.services.IExternalService r9 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r9 = (com.p683ss.android.ugc.aweme.services.IExternalService) r9
            com.ss.android.ugc.aweme.services.video.IAVPublishService r10 = r9.publishService()
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r12 = r8.f104211a
            boolean r10 = r10.checkIsAlreadyPublished(r12)
            if (r10 != 0) goto L_0x005c
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r9 = r8.f104211a
            com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r9, r15)
            com.ss.android.ugc.aweme.qrcode.c.p$a r9 = r8.f104212b
            r9.bI_()
            return r1
        L_0x005c:
            if (r9 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.services.external.IConfigService r9 = r9.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r9 = r9.avsettingsConfig()
            boolean r9 = r9.needLoginBeforeRecord()
            if (r9 != 0) goto L_0x0070
            r8.mo83472a(r11)
            goto L_0x0080
        L_0x0070:
            r8.f104215e = r1
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r9 = r8.f104211a
            java.lang.String r10 = "scan"
            java.lang.String r12 = "click_my_qr"
            com.ss.android.ugc.aweme.qrcode.c.f$6 r13 = new com.ss.android.ugc.aweme.qrcode.c.f$6
            r13.<init>(r11)
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r9, r10, r12, r2, r13)
        L_0x0080:
            return r1
        L_0x0081:
            return r0
        L_0x0082:
            java.lang.String[] r10 = new java.lang.String[r1]
            r10[r0] = r11
            java.util.ArrayList r6 = com.google.p1057b.p1060c.C17593ar.m43277a((E[]) r10)
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r7 = "reuse"
            r2 = r9
            android.content.Intent r10 = com.p683ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.m100711a(r2, r3, r4, r5, r6, r7)
            r9.startActivity(r10)
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto L_0x00b6
            java.lang.String r9 = "enter_prop_detail"
            com.ss.android.ugc.aweme.app.f.d r10 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r12 = "enter_from"
            java.lang.String r13 = "scan"
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r13)
            java.lang.String r12 = "prop_id"
            com.ss.android.ugc.aweme.app.f.d r10 = r10.mo47829a(r12, r11)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r10)
        L_0x00b6:
            return r1
        L_0x00b7:
            java.lang.String r10 = "enter_personal_detail"
            boolean r12 = r8.f104213c
            java.lang.String r15 = "user_id"
            r8.m90581a(r10, r12, r15, r11)
            com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity.m89408a(r9, r11, r14, r13)
            return r1
        L_0x00c4:
            com.ss.android.ugc.aweme.services.IExternalService r9 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r9 = (com.p683ss.android.ugc.aweme.services.IExternalService) r9
            com.ss.android.ugc.aweme.services.video.IAVPublishService r10 = r9.publishService()
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r13 = r8.f104211a
            boolean r10 = r10.checkIsAlreadyPublished(r13)
            if (r10 != 0) goto L_0x00e1
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r9 = r8.f104211a
            com.bytedance.common.utility.C9432q.m18672a(r9, r15)
            com.ss.android.ugc.aweme.qrcode.c.p$a r9 = r8.f104212b
            r9.bI_()
            return r1
        L_0x00e1:
            java.lang.String r10 = "grade_key"
            java.lang.String r10 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r12, r10)
            if (r9 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.services.external.IConfigService r9 = r9.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r9 = r9.avsettingsConfig()
            boolean r9 = r9.needLoginBeforeRecord()
            if (r9 != 0) goto L_0x00fb
            r8.mo83473a(r11, r10)
            goto L_0x010b
        L_0x00fb:
            r8.f104215e = r1
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r9 = r8.f104211a
            java.lang.String r12 = "scan"
            java.lang.String r13 = "click_my_qr"
            com.ss.android.ugc.aweme.qrcode.c.f$5 r14 = new com.ss.android.ugc.aweme.qrcode.c.f$5
            r14.<init>(r11, r10)
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r9, r12, r13, r2, r14)
        L_0x010b:
            return r1
        L_0x010c:
            com.p683ss.android.ugc.aweme.music.p1978ui.MusicDetailActivity.m83801a(r9, r11, r13)
            return r1
        L_0x0110:
            java.lang.String r10 = "preview"
            java.lang.String r10 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r12, r10)
            java.lang.String r14 = "card_source"
            java.lang.String r14 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r12, r14)
            java.lang.String r15 = "challenge_id"
            java.lang.String r15 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r12, r15)
            java.lang.String r0 = "sticker_id"
            java.lang.String r12 = com.p683ss.android.ugc.aweme.router.C41312z.m91072b(r12, r0)
            java.lang.String r0 = "//poi/detail"
            com.bytedance.router.SmartRoute r9 = com.bytedance.router.SmartRouter.buildRoute(r9, r0)
            java.lang.String r0 = "poi_bundle"
            com.ss.android.ugc.aweme.poi.model.m r2 = new com.ss.android.ugc.aweme.poi.model.m
            r2.<init>()
            com.ss.android.ugc.aweme.poi.model.m r11 = r2.mo79718a(r11)
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.poi.model.m r11 = r11.mo79724f(r2)
            java.lang.String r2 = "1"
            boolean r10 = r2.equalsIgnoreCase(r10)
            r11.f99837c = r10
            com.ss.android.ugc.aweme.poi.model.m r10 = r11.mo79726h(r13)
            java.lang.String r11 = "scan_activity_poi"
            com.ss.android.ugc.aweme.poi.model.m r10 = r10.mo79729k(r11)
            java.lang.String r11 = "1"
            boolean r11 = r11.equalsIgnoreCase(r14)
            r10.f99850p = r11
            r10.f99851q = r15
            r10.f99852r = r12
            com.ss.android.ugc.aweme.poi.model.l r10 = r10.mo79713a()
            com.bytedance.router.SmartRoute r9 = r9.withParam(r0, r10)
            r9.open()
            return r1
        L_0x0169:
            com.ss.android.ugc.aweme.IAccountUserService r10 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            boolean r10 = r10.isLogin()
            if (r10 != 0) goto L_0x0180
            com.ss.android.ugc.aweme.base.activity.AmeSSActivity r9 = r8.f104211a
            r10 = 2132551731(0x7f1c2833, float:2.075683E38)
            com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b(r9, r10, r0)
            r9.mo19066a()
            return r1
        L_0x0180:
            com.ss.android.ugc.aweme.profile.model.User r10 = new com.ss.android.ugc.aweme.profile.model.User
            r10.<init>()
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L_0x01a4
            android.net.Uri r12 = android.net.Uri.parse(r12)
            java.lang.String r14 = "u_code"
            java.lang.String r12 = r12.getQueryParameter(r14)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 != 0) goto L_0x01a4
            long r14 = java.lang.Long.parseLong(r12, r15)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r12 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x01a5
        L_0x01a4:
            r12 = r2
        L_0x01a5:
            long r14 = java.lang.Long.parseLong(r11)
            r10.roomId = r14
            com.ss.android.ugc.aweme.live.ILiveOuterService r11 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            com.ss.android.ugc.aweme.live.ILiveOuterService r11 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r11
            com.ss.android.ugc.aweme.i.c r11 = r11.getLiveWatcherUtils()
            com.ss.android.ugc.aweme.live.a r14 = new com.ss.android.ugc.aweme.live.a
            r14.<init>(r9, r10)
            com.ss.android.ugc.aweme.live.a r9 = r14.mo74739b(r13)
            r10 = 4
            com.ss.android.ugc.aweme.live.a r9 = r9.mo74735a(r10)
            com.ss.android.ugc.aweme.live.a r9 = r9.mo74742e(r12)
            r11.mo70097a(r9)
            return r1
        L_0x01cb:
            java.lang.String r10 = "enter_personal_detail"
            boolean r12 = r8.f104213c
            java.lang.String r15 = "user_id"
            r8.m90581a(r10, r12, r15, r11)
            com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity.m89408a(r9, r11, r14, r13)
            return r1
        L_0x01d8:
            java.lang.String r10 = "enter_music_detail"
            boolean r12 = r8.f104213c
            java.lang.String r14 = "music_id"
            r8.m90581a(r10, r12, r14, r11)
            com.p683ss.android.ugc.aweme.music.p1978ui.MusicDetailActivity.m83801a(r9, r11, r13)
            return r1
        L_0x01e5:
            android.content.Intent r10 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.detail.ui.DetailActivity> r12 = com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.class
            r10.<init>(r9, r12)
            java.lang.String r12 = "id"
            r10.putExtra(r12, r11)
            java.lang.String r12 = "invitation_code"
            r10.putExtra(r12, r2)
            java.lang.String r12 = "invitor"
            r10.putExtra(r12, r2)
            java.lang.String r12 = "refer"
            r10.putExtra(r12, r13)
            r9.startActivity(r10)
            java.lang.String r9 = "video_play"
            boolean r10 = r8.f104213c
            java.lang.String r12 = "group_id"
            r8.m90581a(r9, r10, r12, r11)
            return r1
        L_0x020d:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26403au.m63864a(r11)
        L_0x0210:
            java.lang.String r10 = "enter_tag_detail"
            boolean r12 = r8.f104213c
            java.lang.String r14 = "tag_id"
            r8.m90581a(r10, r12, r14, r11)
            com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity.m60062a(r9, r11, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.qrcode.p2105c.C40974f.mo83474a(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, int, java.util.Map):boolean");
    }
}
