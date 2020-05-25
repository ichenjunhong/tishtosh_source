package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p845a.C12996h;
import com.bytedance.sdk.account.p844a.p846b.C13000a;
import com.bytedance.sdk.account.p844a.p846b.C13004e;
import com.bytedance.sdk.account.p844a.p848d.C13012a;
import com.bytedance.sdk.account.p844a.p848d.C13018g;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p861f.p862a.C13105d;
import com.bytedance.sdk.account.p861f.p862a.C13106e;
import com.bytedance.sdk.account.p861f.p862a.C13107f;
import com.bytedance.sdk.account.p861f.p862a.C13108g;
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.bytedance.sdk.account.p861f.p862a.C13114m;
import com.bytedance.sdk.account.p861f.p862a.C13115n;
import com.bytedance.sdk.account.p861f.p862a.C13116o;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.bytedance.sdk.account.p861f.p863b.C13162t.C13163a;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13125b;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13126c;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13127d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13128e;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13129f;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13130g;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13131h;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13133j;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13134k;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13135l;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13140q;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13143t;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b.C20901a;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21107l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21841f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21637a.C21638a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21658e.C21659a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21662h.C21663a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21668m.C21669a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21672p.C21673a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21675r.C21676a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21812w.C21813a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21639a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21887h.C21888a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21957s.C21958a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21967t.C21968a;
import com.p683ss.android.ugc.aweme.account.login.recover.C21450h;
import com.p683ss.android.ugc.aweme.account.login.recover.C21450h.C21451a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21409a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21409a.C21410a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21414b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21414b.C21415a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21414b.C21416b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21420c;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21420c.C21421a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21422d;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21422d.C21423a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21424e;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21424e.C21425a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21426f;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21426f.C21427a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1289a.C21411a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1289a.C21412b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1289a.C21413c;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21417a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21418b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21419c;
import com.p683ss.android.ugc.aweme.account.network.NetworkProxyAccount.C22074c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1267b.C20915c;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22091c;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import org.p2692b.C53694b;
import org.p2692b.C53696d;
import p064c.p065a.C2149h;
import p064c.p065a.C2193n;
import p064c.p065a.C2195p;
import p064c.p065a.C2197r;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1714i;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p079b.C1808c;
import p064c.p065a.p072e.p077e.p079b.C1814e;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s */
public final class C21677s {

    /* renamed from: a */
    public static final C21677s f58713a = new C21677s();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$a */
    public static final class C21678a<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58714a;

        /* renamed from: b */
        final /* synthetic */ String f58715b;

        /* renamed from: c */
        final /* synthetic */ String f58716c;

        /* renamed from: d */
        final /* synthetic */ boolean f58717d;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$a$a */
        public static final class C21679a extends C21660f {

            /* renamed from: a */
            final /* synthetic */ C21678a f58718a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58719b;

            public final void onSuccess(C12993e<C21661g> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58719b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58719b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58718a.f58714a.mo45970p(), this.f58718a.f58714a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21679a(C21678a aVar, C2195p pVar) {
                this.f58718a = aVar;
                this.f58719b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58719b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58718a.f58714a.mo45970p(), this.f58718a.f58714a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onError(C12993e<C21661g> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C2195p pVar = this.f58719b;
                if (eVar != null) {
                    i2 = eVar.f34000c;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21848h p = this.f58718a.f58714a.mo45970p();
                C21850i k = this.f58718a.f58714a.mo45965k();
                if (eVar != null) {
                    C21661g gVar = (C21661g) eVar.f34007h;
                    if (gVar != null) {
                        JSONObject jSONObject2 = gVar.f34279l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            C21675r rVar = new C21675r(i2, str, p, k, jSONObject, null, 32, null);
                            pVar.mo6304a((Throwable) rVar);
                        }
                    }
                }
                jSONObject = null;
                C21675r rVar2 = new C21675r(i2, str, p, k, jSONObject, null, 32, null);
                pVar.mo6304a((Throwable) rVar2);
            }
        }

        public C21678a(C21829b bVar, String str, String str2, boolean z) {
            this.f58714a = bVar;
            this.f58715b = str;
            this.f58716c = str2;
            this.f58717d = z;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C21661g>> pVar) {
            C52711k.m112240b(pVar, "it");
            C20915c.m53261b(this.f58714a.mo45966l(), "email");
            C21679a aVar = new C21679a(this, pVar);
            this.f58714a.mo45962a((C12989a<T>) aVar);
            C21659a aVar2 = C21658e.f58689e;
            Context context = this.f58714a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            aVar2.mo45916a(context, this.f58715b, this.f58716c, this.f58717d, aVar).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$aa */
    public static final class C21680aa<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f58720a;

        /* renamed from: b */
        final /* synthetic */ C21850i f58721b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58722c;

        /* renamed from: d */
        final /* synthetic */ String f58723d;

        /* renamed from: e */
        final /* synthetic */ String f58724e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$aa$a */
        public static final class C21681a extends C13000a {

            /* renamed from: a */
            final /* synthetic */ C21680aa f58725a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58726b;

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13012a aVar = (C13012a) bVar;
                C52711k.m112240b(aVar, "response");
                this.f58726b.mo6303a(aVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C13012a aVar = (C13012a) bVar;
                C52711k.m112240b(aVar, "response");
                C2195p pVar = this.f58726b;
                C21675r rVar = new C21675r(aVar.f34000c, aVar.f34001d, this.f58725a.f58720a, this.f58725a.f58721b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21681a(C21680aa aaVar, C2195p pVar) {
                this.f58725a = aaVar;
                this.f58726b = pVar;
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                String str;
                C13012a aVar = (C13012a) bVar;
                C2195p pVar = this.f58726b;
                if (aVar != null) {
                    str = aVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i, str, this.f58725a.f58720a, this.f58725a.f58721b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C13012a aVar = (C13012a) bVar;
                C52711k.m112240b(aVar, "response");
                C2195p pVar = this.f58726b;
                C21675r rVar = new C21675r(aVar.f34000c, aVar.f34001d, this.f58725a.f58720a, this.f58725a.f58721b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21680aa(C21848h hVar, C21850i iVar, C21829b bVar, String str, String str2) {
            this.f58720a = hVar;
            this.f58721b = iVar;
            this.f58722c = bVar;
            this.f58723d = str;
            this.f58724e = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13012a> pVar) {
            C52711k.m112240b(pVar, "it");
            C21681a aVar = new C21681a(this, pVar);
            this.f58722c.mo45962a((C12989a<T>) aVar);
            this.f58722c.mo45969o().mo24615a(this.f58723d, this.f58724e, 4, (Map) null, (String) null, (C13000a) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ab */
    public static final class C21682ab<T> implements C1710e<C13012a> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58727a;

        public C21682ab(C21829b bVar) {
            this.f58727a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13012a aVar = (C13012a) obj;
            C21674q.m54385a(0, "forget_password", this.f58727a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ac */
    public static final class C21683ac<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58728a;

        public C21683ac(C21829b bVar) {
            this.f58728a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21674q.m54385a(((C21675r) th).getErrorCode(), "forget_password", this.f58728a.mo45967m());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ad */
    public static final class C21684ad<T> implements C2197r<C12993e<C13107f>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58729a;

        /* renamed from: b */
        final /* synthetic */ String f58730b;

        /* renamed from: c */
        final /* synthetic */ String f58731c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ad$a */
        public static final class C21685a extends C13129f {

            /* renamed from: a */
            final /* synthetic */ C21684ad f58732a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58733b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58733b;
                int i = eVar.f34000c;
                String str = eVar.f34001d;
                C21848h hVar = C21848h.SIGN_UP;
                C21850i k = this.f58732a.f58729a.mo45965k();
                String str2 = eVar.f34001d;
                C52711k.m112236a((Object) str2, "response.errorMsg");
                C21675r rVar = new C21675r(i, str, hVar, k, null, str2);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C13107f> eVar) {
                C52711k.m112240b(eVar, "response");
                if (eVar.f34007h == null || ((C13107f) eVar.f34007h).f34257e == null) {
                    C2195p pVar = this.f58733b;
                    C21675r rVar = new C21675r(-1, "no data", C21848h.SIGN_UP, C21850i.CREATE_PASSWORD_FOR_EMAIL, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                    return;
                }
                this.f58733b.mo6303a(eVar);
            }

            C21685a(C21684ad adVar, C2195p pVar) {
                this.f58732a = adVar;
                this.f58733b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58733b;
                int i = eVar.f34000c;
                String str2 = eVar.f34001d;
                C21848h hVar = C21848h.SIGN_UP;
                C21850i k = this.f58732a.f58729a.mo45965k();
                String str3 = eVar.f34001d;
                C52711k.m112236a((Object) str3, "response.errorMsg");
                C21675r rVar = new C21675r(i, str2, hVar, k, null, str3);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
                if (r0 == null) goto L_0x0038;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
                if (r0 == null) goto L_0x0017;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13107f> r10, int r11) {
                /*
                    r9 = this;
                    c.a.p r11 = r9.f58733b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r7 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    if (r10 == 0) goto L_0x000a
                    int r0 = r10.f34000c
                    r1 = r0
                    goto L_0x000e
                L_0x000a:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r1 = -10000(0xffffffffffffd8f0, float:NaN)
                L_0x000e:
                    if (r10 == 0) goto L_0x0017
                    java.lang.String r0 = r10.f34001d
                    if (r0 != 0) goto L_0x0015
                    goto L_0x0017
                L_0x0015:
                    r2 = r0
                    goto L_0x001a
                L_0x0017:
                    java.lang.String r0 = ""
                    goto L_0x0015
                L_0x001a:
                    com.ss.android.ugc.aweme.account.login.v2.base.h r3 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.SIGN_UP
                    com.ss.android.ugc.aweme.account.login.v2.a.s$ad r0 = r9.f58732a
                    com.ss.android.ugc.aweme.account.login.v2.base.b r0 = r0.f58729a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r0.mo45965k()
                    if (r10 == 0) goto L_0x0038
                    T r0 = r10.f34007h
                    com.bytedance.sdk.account.f.a.f r0 = (com.bytedance.sdk.account.p861f.p862a.C13107f) r0
                    if (r0 == 0) goto L_0x0038
                    org.json.JSONObject r0 = r0.f34279l
                    if (r0 == 0) goto L_0x0038
                    java.lang.String r5 = "data"
                    org.json.JSONObject r0 = r0.getJSONObject(r5)
                    if (r0 != 0) goto L_0x003d
                L_0x0038:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                L_0x003d:
                    java.lang.String r5 = "password"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$ad r6 = r9.f58732a
                    java.lang.String r6 = r6.f58730b
                    org.json.JSONObject r0 = r0.put(r5, r6)
                    java.lang.String r5 = "email"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$ad r6 = r9.f58732a
                    java.lang.String r6 = r6.f58731c
                    org.json.JSONObject r5 = r0.put(r5, r6)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r6 = 0
                    if (r10 == 0) goto L_0x005c
                    java.lang.String r8 = r10.f34001d
                    goto L_0x005d
                L_0x005c:
                    r8 = r6
                L_0x005d:
                    r0.append(r8)
                    r8 = 124(0x7c, float:1.74E-43)
                    r0.append(r8)
                    if (r10 == 0) goto L_0x0069
                    java.lang.String r6 = r10.f34002e
                L_0x0069:
                    r0.append(r6)
                    java.lang.String r6 = r0.toString()
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    r11.mo6304a(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21684ad.C21685a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        public C21684ad(C21829b bVar, String str, String str2) {
            this.f58729a = bVar;
            this.f58730b = str;
            this.f58731c = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13107f>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21674q.f58706a.mo45930a(Boolean.valueOf(true), "email", (C21841f) this.f58729a, false);
            C21685a aVar = new C21685a(this, pVar);
            this.f58729a.mo45962a((C12989a<T>) aVar);
            this.f58729a.mo45969o().mo24634a(this.f58731c, this.f58730b, "", "", (C13129f) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ae */
    public static final class C21686ae<T> implements C1710e<C12993e<C13107f>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58734a;

        public C21686ae(C21829b bVar) {
            this.f58734a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21674q.m54390a(true, "email", "register", this.f58734a.mo45967m(), 0);
            C21841f fVar = this.f58734a;
            C13207b bVar = ((C13107f) eVar.f34007h).f34257e;
            C52711k.m112236a((Object) bVar, "it.mobileObj.mUserInfo");
            C21674q.f58706a.mo45932a(true, "email", fVar, bVar);
            C21639a aVar = C21639a.f58654a;
            C21829b bVar2 = this.f58734a;
            C21848h hVar = C21848h.SIGN_UP;
            C21850i k = this.f58734a.mo45965k();
            C13207b bVar3 = ((C13107f) eVar.f34007h).f34257e;
            C52711k.m112236a((Object) bVar3, "it.mobileObj.mUserInfo");
            aVar.mo45904a(bVar2, hVar, k, null, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$af */
    public static final class C21687af<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58735a;

        public C21687af(C21829b bVar) {
            this.f58735a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C21674q.m54390a(false, "email", "register", this.f58735a.mo45967m(), rVar.getErrorCode());
                C21674q.f58706a.mo45931a(true, rVar.getErrorCode(), "email", (C21841f) this.f58735a);
                C22093d.f59607b.mo46194a(1, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ag */
    static final class C21688ag<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58736a;

        /* renamed from: b */
        final /* synthetic */ C21416b f58737b;

        /* renamed from: c */
        final /* synthetic */ C21848h f58738c;

        /* renamed from: d */
        final /* synthetic */ C21850i f58739d;

        /* renamed from: e */
        final /* synthetic */ String f58740e;

        C21688ag(C21829b bVar, C21416b bVar2, C21848h hVar, C21850i iVar, String str) {
            this.f58736a = bVar;
            this.f58737b = bVar2;
            this.f58738c = hVar;
            this.f58739d = iVar;
            this.f58740e = str;
        }

        /* renamed from: a */
        public final void mo6498a(final C2195p<C21418b> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C21415a aVar = C21414b.f58096e;
            Context context = this.f58736a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            C21416b bVar = this.f58737b;
            C21412b r3 = new C21412b(this) {

                /* renamed from: a */
                final /* synthetic */ C21688ag f58741a;

                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                    C21418b bVar2 = (C21418b) bVar;
                    if (bVar2 != null) {
                        C2195p pVar = pVar;
                        C21675r rVar = new C21675r(bVar2.f34000c, bVar2.f34001d, this.f58741a.f58738c, this.f58741a.f58739d, null, null, 32, null);
                        pVar.mo6304a((Throwable) rVar);
                    }
                }

                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    C21418b bVar2 = (C21418b) bVar;
                    if (bVar2 != null) {
                        pVar.mo6303a(bVar2);
                        return;
                    }
                    C2195p pVar = pVar;
                    C21675r rVar = new C21675r(-1, "no data", this.f58741a.f58738c, this.f58741a.f58739d, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                {
                    this.f58741a = r1;
                }

                public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    C21418b bVar2 = (C21418b) bVar;
                    if (bVar2 != null) {
                        C2195p pVar = pVar;
                        C21675r rVar = new C21675r(bVar2.f34000c, bVar2.f34001d, this.f58741a.f58738c, this.f58741a.f58739d, null, null, 32, null);
                        pVar.mo6304a((Throwable) rVar);
                    }
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    String str;
                    C21418b bVar2 = (C21418b) bVar;
                    C2195p pVar = pVar;
                    if (bVar2 != null) {
                        str = bVar2.f34001d;
                    } else {
                        str = null;
                    }
                    C21675r rVar = new C21675r(i, str, this.f58741a.f58738c, this.f58741a.f58739d, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                    C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", this.f58741a.f58740e).mo44774a("status", 0).mo44774a("error_code", i).f56798a);
                }
            };
            C52711k.m112240b(context, "context");
            C52711k.m112240b(r3, "call");
            C21415a aVar2 = aVar;
            C13074a aVar3 = new C13074a();
            Map hashMap = new HashMap();
            hashMap.put("mix_mode", "1");
            if (bVar != null) {
                hashMap.put("find_way", String.valueOf(bVar.getFind_way()));
                int find_way = bVar.getFind_way();
                if (find_way != 4) {
                    switch (find_way) {
                        case 0:
                            if (bVar.getArea_code() != null) {
                                hashMap.put("area_code", bVar.getArea_code());
                            }
                            if (bVar.getMobile() != null) {
                                hashMap.put("mobile", bVar.getMobile());
                                break;
                            }
                            break;
                        case 1:
                            if (bVar.getDouyin_no() != null) {
                                hashMap.put("douyin_no", bVar.getDouyin_no());
                                break;
                            }
                            break;
                    }
                } else if (bVar.getEmail() != null) {
                    hashMap.put("email", bVar.getEmail());
                }
            }
            C13074a a = aVar3.mo24754a(hashMap);
            C52711k.m112236a((Object) a, "ApiRequest.Builder().parameters(getParams(obj))");
            new C21414b(context, a.mo24752a("/passport/mobile/get_account/").mo24757c(), r3).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ah */
    static final class C21690ah<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58743a;

        /* renamed from: b */
        final /* synthetic */ String f58744b;

        /* renamed from: c */
        final /* synthetic */ String f58745c;

        /* renamed from: d */
        final /* synthetic */ C21848h f58746d;

        /* renamed from: e */
        final /* synthetic */ C21850i f58747e;

        C21690ah(C21829b bVar, String str, String str2, C21848h hVar, C21850i iVar) {
            this.f58743a = bVar;
            this.f58744b = str;
            this.f58745c = str2;
            this.f58746d = hVar;
            this.f58747e = iVar;
        }

        /* renamed from: a */
        public final void mo6498a(final C2195p<C21417a> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C21410a aVar = C21409a.f58094e;
            Context context = this.f58743a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            String str = this.f58744b;
            String str2 = this.f58745c;
            C21411a r4 = new C21411a(this) {

                /* renamed from: a */
                final /* synthetic */ C21690ah f58748a;

                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    C21417a aVar = (C21417a) bVar;
                    if (aVar != null) {
                        pVar.mo6303a(aVar);
                        return;
                    }
                    C2195p pVar = pVar;
                    C21675r rVar = new C21675r(-1, "no data", this.f58748a.f58746d, this.f58748a.f58747e, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                {
                    this.f58748a = r1;
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    String str;
                    C21417a aVar = (C21417a) bVar;
                    C2195p pVar = pVar;
                    if (aVar != null) {
                        str = aVar.f34001d;
                    } else {
                        str = null;
                    }
                    C21675r rVar = new C21675r(i, str, this.f58748a.f58746d, this.f58748a.f58747e, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }
            };
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "ticket");
            C52711k.m112240b(r4, "call");
            C21410a aVar2 = aVar;
            C13074a aVar3 = new C13074a();
            HashMap hashMap = new HashMap();
            hashMap.put("need_limit_platform", "0");
            Map map = hashMap;
            map.put("need_limit_os", "0");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("not_login_ticket", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                String str3 = "ticket";
                if (str2 == null) {
                    C52711k.m112234a();
                }
                map.put(str3, str2);
            }
            C13074a a = aVar3.mo24754a(map);
            C52711k.m112236a((Object) a, "ApiRequest.Builder().par…LoginTicket, safeTicket))");
            C13073a c = a.mo24752a(C12998a.m26118a("/passport/auth/available_ways/")).mo24757c();
            C52711k.m112236a((Object) c, "request");
            new C21409a(context, c, r4).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ai */
    static final class C21692ai<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58750a;

        /* renamed from: b */
        final /* synthetic */ String f58751b;

        /* renamed from: c */
        final /* synthetic */ C21848h f58752c;

        /* renamed from: d */
        final /* synthetic */ C21850i f58753d;

        C21692ai(C21829b bVar, String str, C21848h hVar, C21850i iVar) {
            this.f58750a = bVar;
            this.f58751b = str;
            this.f58752c = hVar;
            this.f58753d = iVar;
        }

        /* renamed from: a */
        public final void mo6498a(final C2195p<C21419c> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C21423a aVar = C21422d.f58111f;
            Context context = this.f58750a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            String str = this.f58751b;
            C21413c r3 = new C21413c(this) {

                /* renamed from: a */
                final /* synthetic */ C21692ai f58754a;

                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                    C21419c cVar = (C21419c) bVar;
                    if (cVar != null) {
                        C2195p pVar = pVar;
                        C21675r rVar = new C21675r(cVar.f34000c, cVar.f34001d, this.f58754a.f58752c, this.f58754a.f58753d, null, null, 32, null);
                        pVar.mo6304a((Throwable) rVar);
                    }
                }

                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    C21419c cVar = (C21419c) bVar;
                    if (cVar != null) {
                        pVar.mo6303a(cVar);
                        return;
                    }
                    C2195p pVar = pVar;
                    C21675r rVar = new C21675r(-1, "no data", this.f58754a.f58752c, this.f58754a.f58753d, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                {
                    this.f58754a = r1;
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    String str;
                    C21419c cVar = (C21419c) bVar;
                    C2195p pVar = pVar;
                    if (cVar != null) {
                        str = cVar.f34001d;
                    } else {
                        str = null;
                    }
                    C21675r rVar = new C21675r(i, str, this.f58754a.f58752c, this.f58754a.f58753d, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    C21419c cVar = (C21419c) bVar;
                    if (cVar != null) {
                        C2195p pVar = pVar;
                        C21675r rVar = new C21675r(cVar.f34000c, cVar.f34001d, this.f58754a.f58752c, this.f58754a.f58753d, null, null, 32, null);
                        pVar.mo6304a((Throwable) rVar);
                    }
                }
            };
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "ticket");
            C52711k.m112240b(r3, "call");
            C21423a aVar2 = aVar;
            C13074a aVar3 = new C13074a();
            Map hashMap = new HashMap();
            hashMap.put("not_login_ticket", str);
            C13074a a = aVar3.mo24754a(hashMap);
            C52711k.m112236a((Object) a, "ApiRequest.Builder().parameters(getParams(ticket))");
            C13073a c = a.mo24752a("/passport/shark/safe_verify/").mo24757c();
            C52711k.m112236a((Object) c, "request");
            new C21422d(context, c, r3).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$aj */
    static final class C21694aj<T> implements C2197r<C12993e<C13121t>> {

        /* renamed from: a */
        final /* synthetic */ String f58756a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58757b;

        /* renamed from: c */
        final /* synthetic */ String f58758c;

        /* renamed from: d */
        final /* synthetic */ String f58759d;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$aj$a */
        public static final class C21695a extends C13141r {

            /* renamed from: a */
            final /* synthetic */ C21694aj f58760a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58761b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58761b;
                int i = eVar.f34000c;
                String str = eVar.f34001d;
                C21848h hVar = C21848h.LOGIN;
                C21850i k = this.f58760a.f58757b.mo45965k();
                String str2 = eVar.f34001d;
                C52711k.m112236a((Object) str2, "response.errorMsg");
                C21675r rVar = new C21675r(i, str, hVar, k, null, str2);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C13121t> eVar) {
                C52711k.m112240b(eVar, "response");
                if (eVar.f34007h == null || ((C13121t) eVar.f34007h).f34337t == null) {
                    C2195p pVar = this.f58761b;
                    C21675r rVar = new C21675r(-1, "no data", C21848h.LOGIN, C21850i.INPUT_PHONE_FIND_PASSWORD, null, "no data");
                    pVar.mo6304a((Throwable) rVar);
                    return;
                }
                this.f58761b.mo6303a(eVar);
            }

            C21695a(C21694aj ajVar, C2195p pVar) {
                this.f58760a = ajVar;
                this.f58761b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C52711k.m112240b(str, "captcha");
                C2195p pVar = this.f58761b;
                int i = eVar.f34000c;
                String str2 = eVar.f34001d;
                C21848h hVar = C21848h.LOGIN;
                C21850i k = this.f58760a.f58757b.mo45965k();
                String str3 = eVar.f34001d;
                C52711k.m112236a((Object) str3, "response.errorMsg");
                C21675r rVar = new C21675r(i, str2, hVar, k, null, str3);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13121t> r9, int r10) {
                /*
                    r8 = this;
                    c.a.p r10 = r8.f58761b
                    if (r9 == 0) goto L_0x0008
                    int r0 = r9.f34000c
                    r2 = r0
                    goto L_0x000c
                L_0x0008:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r2 = -10000(0xffffffffffffd8f0, float:NaN)
                L_0x000c:
                    r0 = 0
                    if (r9 == 0) goto L_0x0013
                    java.lang.String r1 = r9.f34001d
                    r3 = r1
                    goto L_0x0014
                L_0x0013:
                    r3 = r0
                L_0x0014:
                    com.ss.android.ugc.aweme.account.login.v2.base.h r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.LOGIN
                    com.ss.android.ugc.aweme.account.login.v2.a.s$aj r1 = r8.f58760a
                    com.ss.android.ugc.aweme.account.login.v2.base.b r1 = r1.f58757b
                    com.ss.android.ugc.aweme.account.login.v2.base.i r5 = r1.mo45965k()
                    if (r9 == 0) goto L_0x004f
                    T r1 = r9.f34007h
                    com.bytedance.sdk.account.f.a.t r1 = (com.bytedance.sdk.account.p861f.p862a.C13121t) r1
                    if (r1 == 0) goto L_0x004f
                    org.json.JSONObject r1 = r1.f34279l
                    if (r1 == 0) goto L_0x004f
                    java.lang.String r6 = "data"
                    org.json.JSONObject r1 = r1.getJSONObject(r6)
                    if (r1 == 0) goto L_0x004f
                    java.lang.String r6 = "loginType"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$aj r7 = r8.f58760a
                    java.lang.String r7 = r7.f58756a
                    r1.put(r6, r7)
                    java.lang.String r6 = "pwd"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$aj r7 = r8.f58760a
                    java.lang.String r7 = r7.f58758c
                    r1.put(r6, r7)
                    java.lang.String r6 = "handle"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$aj r7 = r8.f58760a
                    java.lang.String r7 = r7.f58759d
                    r1.put(r6, r7)
                    r6 = r1
                    goto L_0x0050
                L_0x004f:
                    r6 = r0
                L_0x0050:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    if (r9 == 0) goto L_0x005a
                    java.lang.String r7 = r9.f34001d
                    goto L_0x005b
                L_0x005a:
                    r7 = r0
                L_0x005b:
                    r1.append(r7)
                    r7 = 124(0x7c, float:1.74E-43)
                    r1.append(r7)
                    if (r9 == 0) goto L_0x0067
                    java.lang.String r0 = r9.f34002e
                L_0x0067:
                    r1.append(r0)
                    java.lang.String r7 = r1.toString()
                    com.ss.android.ugc.aweme.account.login.v2.a.r r9 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r1 = r9
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r10.mo6304a(r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21694aj.C21695a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21694aj(String str, C21829b bVar, String str2, String str3) {
            this.f58756a = str;
            this.f58757b = bVar;
            this.f58758c = str2;
            this.f58759d = str3;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13121t>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21674q.f58706a.mo45930a(Boolean.valueOf(false), this.f58756a, (C21841f) this.f58757b, false);
            C21695a aVar = new C21695a(this, pVar);
            this.f58757b.mo45962a((C12989a<T>) aVar);
            String str = this.f58756a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    this.f58757b.mo45969o().mo24645c(this.f58759d, this.f58758c, "", aVar);
                    return;
                }
            } else if (str.equals("email")) {
                this.f58757b.mo45969o().mo24643b(this.f58759d, this.f58758c, "", (C13141r) aVar);
                return;
            }
            this.f58757b.mo45969o().mo24630a(this.f58759d, this.f58758c, "", (C13141r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ak */
    static final class C21696ak<T> implements C1710e<C12993e<C13121t>> {

        /* renamed from: a */
        final /* synthetic */ String f58762a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58763b;

        /* renamed from: c */
        final /* synthetic */ String f58764c;

        C21696ak(String str, C21829b bVar, String str2) {
            this.f58762a = str;
            this.f58763b = bVar;
            this.f58764c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            if (!C52711k.m112239a((Object) this.f58762a, (Object) "phone")) {
                C21839d.m54507a((Fragment) this.f58763b, this.f58764c);
            }
            C21674q qVar = C21674q.f58706a;
            String str = this.f58762a;
            C21841f fVar = this.f58763b;
            C13207b bVar = ((C13121t) eVar.f34007h).f34337t;
            C52711k.m112236a((Object) bVar, "it.mobileObj.mUserInfo");
            qVar.mo45932a(false, str, fVar, bVar);
            C20975a.m53337a(13);
            C21639a aVar = C21639a.f58654a;
            C21829b bVar2 = this.f58763b;
            C21848h hVar = C21848h.LOGIN;
            C21850i k = this.f58763b.mo45965k();
            C13207b bVar3 = ((C13121t) eVar.f34007h).f34337t;
            C52711k.m112236a((Object) bVar3, "it.mobileObj.mUserInfo");
            aVar.mo45904a(bVar2, hVar, k, null, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$al */
    static final class C21697al<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f58765a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58766b;

        C21697al(String str, C21829b bVar) {
            this.f58765a = str;
            this.f58766b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                if (C52711k.m112239a((Object) this.f58765a, (Object) "phone")) {
                    C22093d.f59607b.mo46196a(false, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                } else {
                    C22093d.f59607b.mo46194a(1, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                }
                C21674q.f58706a.mo45931a(false, rVar.getErrorCode(), this.f58765a, (C21841f) this.f58766b);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$am */
    static final class C21698am<T> implements C2197r<C12993e<C13121t>> {

        /* renamed from: a */
        final /* synthetic */ String f58767a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58768b;

        /* renamed from: c */
        final /* synthetic */ String f58769c;

        /* renamed from: d */
        final /* synthetic */ String f58770d;

        /* renamed from: e */
        final /* synthetic */ String f58771e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$am$a */
        public static final class C21699a extends C13141r {

            /* renamed from: a */
            final /* synthetic */ C21698am f58772a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58773b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58773b;
                int i = eVar.f34000c;
                String str = eVar.f34001d;
                C21848h hVar = C21848h.LOGIN;
                C21850i k = this.f58772a.f58768b.mo45965k();
                String str2 = eVar.f34001d;
                C52711k.m112236a((Object) str2, "response.errorMsg");
                C21675r rVar = new C21675r(i, str, hVar, k, null, str2);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C13121t> eVar) {
                C52711k.m112240b(eVar, "response");
                if (eVar.f34007h == null || ((C13121t) eVar.f34007h).f34337t == null) {
                    C2195p pVar = this.f58773b;
                    C21675r rVar = new C21675r(-1, "no data", C21848h.LOGIN, C21850i.INPUT_PHONE_FIND_PASSWORD, null, "no data");
                    pVar.mo6304a((Throwable) rVar);
                    return;
                }
                this.f58773b.mo6303a(eVar);
            }

            C21699a(C21698am amVar, C2195p pVar) {
                this.f58772a = amVar;
                this.f58773b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C52711k.m112240b(str, "captcha");
                C2195p pVar = this.f58773b;
                int i = eVar.f34000c;
                String str2 = eVar.f34001d;
                C21848h hVar = C21848h.LOGIN;
                C21850i k = this.f58772a.f58768b.mo45965k();
                String str3 = eVar.f34001d;
                C52711k.m112236a((Object) str3, "response.errorMsg");
                C21675r rVar = new C21675r(i, str2, hVar, k, null, str3);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13121t> r9, int r10) {
                /*
                    r8 = this;
                    c.a.p r10 = r8.f58773b
                    if (r9 == 0) goto L_0x0008
                    int r0 = r9.f34000c
                    r2 = r0
                    goto L_0x000c
                L_0x0008:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r2 = -10000(0xffffffffffffd8f0, float:NaN)
                L_0x000c:
                    r0 = 0
                    if (r9 == 0) goto L_0x0013
                    java.lang.String r1 = r9.f34001d
                    r3 = r1
                    goto L_0x0014
                L_0x0013:
                    r3 = r0
                L_0x0014:
                    com.ss.android.ugc.aweme.account.login.v2.base.h r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.LOGIN
                    com.ss.android.ugc.aweme.account.login.v2.a.s$am r1 = r8.f58772a
                    com.ss.android.ugc.aweme.account.login.v2.base.b r1 = r1.f58768b
                    com.ss.android.ugc.aweme.account.login.v2.base.i r5 = r1.mo45965k()
                    if (r9 == 0) goto L_0x004f
                    T r1 = r9.f34007h
                    com.bytedance.sdk.account.f.a.t r1 = (com.bytedance.sdk.account.p861f.p862a.C13121t) r1
                    if (r1 == 0) goto L_0x004f
                    org.json.JSONObject r1 = r1.f34279l
                    if (r1 == 0) goto L_0x004f
                    java.lang.String r6 = "data"
                    org.json.JSONObject r1 = r1.getJSONObject(r6)
                    if (r1 == 0) goto L_0x004f
                    java.lang.String r6 = "loginType"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$am r7 = r8.f58772a
                    java.lang.String r7 = r7.f58767a
                    r1.put(r6, r7)
                    java.lang.String r6 = "pwd"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$am r7 = r8.f58772a
                    java.lang.String r7 = r7.f58769c
                    r1.put(r6, r7)
                    java.lang.String r6 = "handle"
                    com.ss.android.ugc.aweme.account.login.v2.a.s$am r7 = r8.f58772a
                    java.lang.String r7 = r7.f58770d
                    r1.put(r6, r7)
                    r6 = r1
                    goto L_0x0050
                L_0x004f:
                    r6 = r0
                L_0x0050:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    if (r9 == 0) goto L_0x005a
                    java.lang.String r7 = r9.f34001d
                    goto L_0x005b
                L_0x005a:
                    r7 = r0
                L_0x005b:
                    r1.append(r7)
                    r7 = 124(0x7c, float:1.74E-43)
                    r1.append(r7)
                    if (r9 == 0) goto L_0x0067
                    java.lang.String r0 = r9.f34002e
                L_0x0067:
                    r1.append(r0)
                    java.lang.String r7 = r1.toString()
                    com.ss.android.ugc.aweme.account.login.v2.a.r r9 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r1 = r9
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r10.mo6304a(r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21698am.C21699a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21698am(String str, C21829b bVar, String str2, String str3, String str4) {
            this.f58767a = str;
            this.f58768b = bVar;
            this.f58769c = str2;
            this.f58770d = str3;
            this.f58771e = str4;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13121t>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21674q.f58706a.mo45930a(Boolean.valueOf(false), this.f58767a, (C21841f) this.f58768b, false);
            C21699a aVar = new C21699a(this, pVar);
            this.f58768b.mo45962a((C12989a<T>) aVar);
            String str = this.f58767a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    C21427a aVar2 = C21426f.f58115f;
                    Context context = this.f58768b.getContext();
                    if (context == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) context, "fragment.context!!");
                    aVar2.mo45602a(context, this.f58771e, "", "", "", "", this.f58769c, "", "", C21848h.LOGIN.getValue(), 3, aVar).mo24766d();
                    return;
                }
            } else if (str.equals("email")) {
                C21427a aVar3 = C21426f.f58115f;
                Context context2 = this.f58768b.getContext();
                if (context2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context2, "fragment.context!!");
                aVar3.mo45602a(context2, this.f58771e, "", "", "", "", this.f58769c, "", "", C21848h.LOGIN.getValue(), 2, aVar).mo24766d();
                return;
            }
            this.f58768b.mo45969o().mo24630a(this.f58770d, this.f58769c, "", (C13141r) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$an */
    static final class C21700an<T> implements C1710e<C12993e<C13121t>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58774a;

        /* renamed from: b */
        final /* synthetic */ String f58775b;

        C21700an(C21829b bVar, String str) {
            this.f58774a = bVar;
            this.f58775b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21639a aVar = C21639a.f58654a;
            C21829b bVar = this.f58774a;
            C21848h hVar = C21848h.LOGIN;
            C21850i k = this.f58774a.mo45965k();
            C13207b bVar2 = ((C13121t) eVar.f34007h).f34337t;
            C52711k.m112236a((Object) bVar2, "it.mobileObj.mUserInfo");
            aVar.mo45904a(bVar, hVar, k, null, bVar2);
            C21674q qVar = C21674q.f58706a;
            String str = this.f58775b;
            C21841f fVar = this.f58774a;
            C13207b bVar3 = ((C13121t) eVar.f34007h).f34337t;
            C52711k.m112236a((Object) bVar3, "it.mobileObj.mUserInfo");
            qVar.mo45932a(false, str, fVar, bVar3);
            C20975a.m53337a(13);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ao */
    static final class C21701ao<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f58776a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58777b;

        C21701ao(String str, C21829b bVar) {
            this.f58776a = str;
            this.f58777b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                if (C52711k.m112239a((Object) this.f58776a, (Object) "phone")) {
                    C22093d.f59607b.mo46196a(false, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                } else {
                    C22093d.f59607b.mo46194a(1, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                }
                C21674q.f58706a.mo45931a(false, rVar.getErrorCode(), this.f58776a, (C21841f) this.f58777b);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ap */
    static final class C21702ap<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ boolean f58778a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58779b;

        /* renamed from: c */
        final /* synthetic */ C21848h f58780c;

        /* renamed from: d */
        final /* synthetic */ C21850i f58781d;

        /* renamed from: e */
        final /* synthetic */ String f58782e;

        /* renamed from: f */
        final /* synthetic */ String f58783f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ap$a */
        public static final class C21703a extends C13134k {

            /* renamed from: a */
            final /* synthetic */ C21702ap f58784a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58785b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58785b;
                int i = eVar.f34000c;
                String str = eVar.f34001d;
                C21848h hVar = this.f58784a.f58780c;
                C21850i iVar = this.f58784a.f58781d;
                String str2 = eVar.f34001d;
                C52711k.m112236a((Object) str2, "response.errorMsg");
                C21675r rVar = new C21675r(i, str, hVar, iVar, null, str2);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C13114m> eVar) {
                C52711k.m112240b(eVar, "response");
                if (eVar.f34007h == null || ((C13114m) eVar.f34007h).f34292d == null) {
                    this.f58785b.mo6304a((Throwable) C21676a.m54395a(this.f58784a.f58780c, this.f58784a.f58781d));
                } else {
                    this.f58785b.mo6303a(eVar);
                }
            }

            C21703a(C21702ap apVar, C2195p pVar) {
                this.f58784a = apVar;
                this.f58785b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58785b;
                int i = eVar.f34000c;
                String str2 = eVar.f34001d;
                C21848h hVar = this.f58784a.f58780c;
                C21850i iVar = this.f58784a.f58781d;
                String str3 = eVar.f34001d;
                C52711k.m112236a((Object) str3, "response.errorMsg");
                C21675r rVar = new C21675r(i, str2, hVar, iVar, null, str3);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13114m> r10, int r11) {
                /*
                    r9 = this;
                    c.a.p r0 = r9.f58785b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r8 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r1 = 0
                    if (r10 == 0) goto L_0x000b
                    java.lang.String r2 = r10.f34001d
                    r3 = r2
                    goto L_0x000c
                L_0x000b:
                    r3 = r1
                L_0x000c:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$ap r2 = r9.f58784a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r4 = r2.f58780c
                    com.ss.android.ugc.aweme.account.login.v2.a.s$ap r2 = r9.f58784a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r5 = r2.f58781d
                    if (r10 == 0) goto L_0x0028
                    T r2 = r10.f34007h
                    com.bytedance.sdk.account.f.a.m r2 = (com.bytedance.sdk.account.p861f.p862a.C13114m) r2
                    if (r2 == 0) goto L_0x0028
                    org.json.JSONObject r2 = r2.f34279l
                    if (r2 == 0) goto L_0x0028
                    java.lang.String r6 = "data"
                    org.json.JSONObject r2 = r2.getJSONObject(r6)
                    r6 = r2
                    goto L_0x0029
                L_0x0028:
                    r6 = r1
                L_0x0029:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    if (r10 == 0) goto L_0x0033
                    java.lang.String r7 = r10.f34001d
                    goto L_0x0034
                L_0x0033:
                    r7 = r1
                L_0x0034:
                    r2.append(r7)
                    r7 = 124(0x7c, float:1.74E-43)
                    r2.append(r7)
                    if (r10 == 0) goto L_0x0040
                    java.lang.String r1 = r10.f34002e
                L_0x0040:
                    r2.append(r1)
                    java.lang.String r7 = r2.toString()
                    r1 = r8
                    r2 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    java.lang.Throwable r8 = (java.lang.Throwable) r8
                    r0.mo6304a(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21702ap.C21703a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21702ap(boolean z, C21829b bVar, C21848h hVar, C21850i iVar, String str, String str2) {
            this.f58778a = z;
            this.f58779b = bVar;
            this.f58780c = hVar;
            this.f58781d = iVar;
            this.f58782e = str;
            this.f58783f = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13114m>> pVar) {
            C52711k.m112240b(pVar, "it");
            if (!this.f58778a) {
                C21674q.f58706a.mo45930a(Boolean.valueOf(this.f58778a), "sms_verification", (C21841f) this.f58779b, false);
            }
            C21703a aVar = new C21703a(this, pVar);
            this.f58779b.mo45962a((C12989a<T>) aVar);
            this.f58779b.mo45969o().mo24619a(this.f58782e, this.f58783f, (C13134k) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$aq */
    static final class C21704aq<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ boolean f58786a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58787b;

        C21704aq(boolean z, C21829b bVar) {
            this.f58786a = z;
            this.f58787b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C21674q.f58706a.mo45931a(this.f58786a, rVar.getErrorCode(), "sms_verification", (C21841f) this.f58787b);
                C22093d.f59607b.mo46198b(false, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ar */
    static final class C21705ar<T> implements C1710e<C12993e<C13114m>> {

        /* renamed from: a */
        final /* synthetic */ boolean f58788a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58789b;

        C21705ar(boolean z, C21829b bVar) {
            this.f58788a = z;
            this.f58789b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21841f fVar = this.f58789b;
            C13207b bVar = ((C13114m) eVar.f34007h).f34292d;
            C52711k.m112236a((Object) bVar, "it.mobileObj.mUserInfo");
            C21674q.f58706a.mo45932a(this.f58788a, "sms_verification", fVar, bVar);
            C21639a aVar = C21639a.f58654a;
            C21829b bVar2 = this.f58789b;
            C21848h hVar = C21848h.SIGN_UP;
            C21850i k = this.f58789b.mo45965k();
            C13207b bVar3 = ((C13114m) eVar.f34007h).f34292d;
            C52711k.m112236a((Object) bVar3, "it.mobileObj.mUserInfo");
            aVar.mo45904a(bVar2, hVar, k, null, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$as */
    public static final class C21706as<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f58790a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58791b;

        /* renamed from: c */
        final /* synthetic */ C21850i f58792c;

        /* renamed from: d */
        final /* synthetic */ String f58793d;

        /* renamed from: e */
        final /* synthetic */ String f58794e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$as$a */
        public static final class C21707a extends C13135l {

            /* renamed from: a */
            final /* synthetic */ C21706as f58795a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58796b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58796b;
                int i = eVar.f34000c;
                String str = eVar.f34001d;
                C21848h hVar = this.f58795a.f58790a;
                C21850i iVar = this.f58795a.f58792c;
                String str2 = eVar.f34001d;
                C52711k.m112236a((Object) str2, "response.errorMsg");
                C21675r rVar = new C21675r(i, str, hVar, iVar, null, str2);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C13115n> eVar) {
                C52711k.m112240b(eVar, "response");
                if (eVar.f34007h == null || ((C13115n) eVar.f34007h).f34297e == null) {
                    C2195p pVar = this.f58796b;
                    C21675r rVar = new C21675r(-1, "no data", this.f58795a.f58790a, this.f58795a.f58792c, null, "no data");
                    pVar.mo6304a((Throwable) rVar);
                    return;
                }
                this.f58796b.mo6303a(eVar.f34007h);
            }

            C21707a(C21706as asVar, C2195p pVar) {
                this.f58795a = asVar;
                this.f58796b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58796b;
                int i = eVar.f34000c;
                String str2 = eVar.f34001d;
                C21848h hVar = this.f58795a.f58790a;
                C21850i iVar = this.f58795a.f58792c;
                String str3 = eVar.f34001d;
                C52711k.m112236a((Object) str3, "response.errorMsg");
                C21675r rVar = new C21675r(i, str2, hVar, iVar, null, str3);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13115n> r10, int r11) {
                /*
                    r9 = this;
                    c.a.p r0 = r9.f58796b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r8 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r1 = 0
                    if (r10 == 0) goto L_0x000b
                    java.lang.String r2 = r10.f34001d
                    r3 = r2
                    goto L_0x000c
                L_0x000b:
                    r3 = r1
                L_0x000c:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$as r2 = r9.f58795a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r4 = r2.f58790a
                    com.ss.android.ugc.aweme.account.login.v2.a.s$as r2 = r9.f58795a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r5 = r2.f58792c
                    if (r10 == 0) goto L_0x0028
                    T r2 = r10.f34007h
                    com.bytedance.sdk.account.f.a.n r2 = (com.bytedance.sdk.account.p861f.p862a.C13115n) r2
                    if (r2 == 0) goto L_0x0028
                    org.json.JSONObject r2 = r2.f34279l
                    if (r2 == 0) goto L_0x0028
                    java.lang.String r6 = "data"
                    org.json.JSONObject r2 = r2.getJSONObject(r6)
                    r6 = r2
                    goto L_0x0029
                L_0x0028:
                    r6 = r1
                L_0x0029:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    if (r10 == 0) goto L_0x0033
                    java.lang.String r7 = r10.f34001d
                    goto L_0x0034
                L_0x0033:
                    r7 = r1
                L_0x0034:
                    r2.append(r7)
                    r7 = 124(0x7c, float:1.74E-43)
                    r2.append(r7)
                    if (r10 == 0) goto L_0x0040
                    java.lang.String r1 = r10.f34002e
                L_0x0040:
                    r2.append(r1)
                    java.lang.String r7 = r2.toString()
                    r1 = r8
                    r2 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    java.lang.Throwable r8 = (java.lang.Throwable) r8
                    r0.mo6304a(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21706as.C21707a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        public C21706as(C21848h hVar, C21829b bVar, C21850i iVar, String str, String str2) {
            this.f58790a = hVar;
            this.f58791b = bVar;
            this.f58792c = iVar;
            this.f58793d = str;
            this.f58794e = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13115n> pVar) {
            boolean z;
            C52711k.m112240b(pVar, "emitter");
            C21674q qVar = C21674q.f58706a;
            if (this.f58790a == C21848h.SIGN_UP) {
                z = true;
            } else {
                z = false;
            }
            qVar.mo45930a(Boolean.valueOf(z), "sms_verification", (C21841f) this.f58791b, false);
            C21707a aVar = new C21707a(this, pVar);
            this.f58791b.mo45962a((C12989a<T>) aVar);
            this.f58791b.mo45969o().mo24629a(this.f58793d, this.f58794e, "", (C13135l) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$at */
    public static final class C21708at<T> implements C1710e<C13115n> {

        /* renamed from: a */
        final /* synthetic */ boolean f58797a;

        /* renamed from: b */
        final /* synthetic */ boolean f58798b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58799c;

        public C21708at(boolean z, boolean z2, C21829b bVar) {
            this.f58797a = z;
            this.f58798b = z2;
            this.f58799c = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            C13115n nVar = (C13115n) obj;
            C21674q qVar = C21674q.f58706a;
            boolean z = this.f58797a;
            if (this.f58798b) {
                str = "whatsapp";
            } else {
                str = "sms_verification";
            }
            C21841f fVar = this.f58799c;
            C13207b bVar = nVar.f34297e;
            C52711k.m112236a((Object) bVar, "it.mUserInfo");
            qVar.mo45932a(z, str, fVar, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$au */
    public static final class C21709au<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ boolean f58800a;

        /* renamed from: b */
        final /* synthetic */ boolean f58801b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58802c;

        public C21709au(boolean z, boolean z2, C21829b bVar) {
            this.f58800a = z;
            this.f58801b = z2;
            this.f58802c = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                if (!this.f58800a || rVar.getErrorCode() != 1011) {
                    C22093d.f59607b.mo46198b(false, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                    C21674q qVar = C21674q.f58706a;
                    boolean z = this.f58800a;
                    int errorCode = rVar.getErrorCode();
                    if (this.f58801b) {
                        str = "whatsapp";
                    } else {
                        str = "sms_verification";
                    }
                    qVar.mo45931a(z, errorCode, str, (C21841f) this.f58802c);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$av */
    public static final class C21710av<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f58803a;

        /* renamed from: b */
        final /* synthetic */ C21850i f58804b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58805c;

        /* renamed from: d */
        final /* synthetic */ String f58806d;

        /* renamed from: e */
        final /* synthetic */ String f58807e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$av$a */
        public static final class C21711a extends C13133j {

            /* renamed from: a */
            final /* synthetic */ C21710av f58808a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58809b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                if (eVar != null) {
                    C2195p pVar = this.f58809b;
                    int i = eVar.f34000c;
                    String str = eVar.f34001d;
                    C21848h hVar = this.f58808a.f58803a;
                    C21850i iVar = this.f58808a.f58804b;
                    String str2 = eVar.f34001d;
                    C52711k.m112236a((Object) str2, "response.errorMsg");
                    C21675r rVar = new C21675r(i, str, hVar, iVar, null, str2);
                    pVar.mo6304a((Throwable) rVar);
                }
            }

            public final void onSuccess(C12993e<C13116o> eVar) {
                C13116o oVar;
                if (eVar != null) {
                    oVar = (C13116o) eVar.f34007h;
                } else {
                    oVar = null;
                }
                if (oVar == null || ((C13116o) eVar.f34007h).f34302e == null) {
                    C2195p pVar = this.f58809b;
                    C21675r rVar = new C21675r(-1, "no data", this.f58808a.f58803a, this.f58808a.f58804b, null, "no data");
                    pVar.mo6304a((Throwable) rVar);
                    return;
                }
                this.f58809b.mo6303a(eVar.f34007h);
            }

            C21711a(C21710av avVar, C2195p pVar) {
                this.f58808a = avVar;
                this.f58809b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                if (eVar != null) {
                    C2195p pVar = this.f58809b;
                    int i = eVar.f34000c;
                    String str2 = eVar.f34001d;
                    C21848h hVar = this.f58808a.f58803a;
                    C21850i iVar = this.f58808a.f58804b;
                    String str3 = eVar.f34001d;
                    C52711k.m112236a((Object) str3, "response.errorMsg");
                    C21675r rVar = new C21675r(i, str2, hVar, iVar, null, str3);
                    pVar.mo6304a((Throwable) rVar);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13116o> r10, int r11) {
                /*
                    r9 = this;
                    c.a.p r0 = r9.f58809b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r8 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r1 = 0
                    if (r10 == 0) goto L_0x000b
                    java.lang.String r2 = r10.f34001d
                    r3 = r2
                    goto L_0x000c
                L_0x000b:
                    r3 = r1
                L_0x000c:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$av r2 = r9.f58808a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r4 = r2.f58803a
                    com.ss.android.ugc.aweme.account.login.v2.a.s$av r2 = r9.f58808a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r5 = r2.f58804b
                    if (r10 == 0) goto L_0x0028
                    T r2 = r10.f34007h
                    com.bytedance.sdk.account.f.a.o r2 = (com.bytedance.sdk.account.p861f.p862a.C13116o) r2
                    if (r2 == 0) goto L_0x0028
                    org.json.JSONObject r2 = r2.f34279l
                    if (r2 == 0) goto L_0x0028
                    java.lang.String r6 = "data"
                    org.json.JSONObject r2 = r2.getJSONObject(r6)
                    r6 = r2
                    goto L_0x0029
                L_0x0028:
                    r6 = r1
                L_0x0029:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    if (r10 == 0) goto L_0x0033
                    java.lang.String r7 = r10.f34001d
                    goto L_0x0034
                L_0x0033:
                    r7 = r1
                L_0x0034:
                    r2.append(r7)
                    r7 = 124(0x7c, float:1.74E-43)
                    r2.append(r7)
                    if (r10 == 0) goto L_0x0040
                    java.lang.String r1 = r10.f34002e
                L_0x0040:
                    r2.append(r1)
                    java.lang.String r7 = r2.toString()
                    r1 = r8
                    r2 = r11
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    java.lang.Throwable r8 = (java.lang.Throwable) r8
                    r0.mo6304a(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21710av.C21711a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        public C21710av(C21848h hVar, C21850i iVar, C21829b bVar, String str, String str2) {
            this.f58803a = hVar;
            this.f58804b = iVar;
            this.f58805c = bVar;
            this.f58806d = str;
            this.f58807e = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13116o> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C21711a aVar = new C21711a(this, pVar);
            this.f58805c.mo45962a((C12989a<T>) aVar);
            C21421a aVar2 = C21420c.f58109f;
            Context context = this.f58805c.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            String str = "";
            String str2 = this.f58806d;
            String str3 = this.f58807e;
            String str4 = "";
            C13133j jVar = aVar;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "mobile");
            C52711k.m112240b(str3, "code");
            C52711k.m112240b(str4, "captcha");
            C52711k.m112240b(jVar, "call");
            C13116o oVar = new C13116o(str, str3, Integer.valueOf(0), str4);
            C13074a a = new C13074a().mo24752a(C12998a.m26119b());
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(oVar.f34298a)) {
                String d = C9431p.m18668d(oVar.f34298a);
                C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.mMobile)");
                hashMap.put("mobile", d);
            }
            if (!TextUtils.isEmpty(oVar.f34301d)) {
                hashMap.put("captcha", oVar.f34301d);
            }
            Map map = hashMap;
            String d2 = C9431p.m18668d(oVar.f34299b.toString());
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithX…ueryObj.mCode.toString())");
            map.put("code", d2);
            map.put("mix_mode", "1");
            if (str2 != null) {
                map.put("not_login_ticket", str2);
            }
            C13073a c = a.mo24754a(map).mo24751a().mo24757c();
            C52711k.m112236a((Object) c, "request");
            new C21420c(context, c, oVar, jVar).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$aw */
    public static final class C21712aw<T> implements C1710e<C13116o> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58810a;

        public C21712aw(C21829b bVar) {
            this.f58810a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13116o oVar = (C13116o) obj;
            C21639a aVar = C21639a.f58654a;
            C21829b bVar = this.f58810a;
            C21848h hVar = C21848h.LOGIN;
            C21850i k = this.f58810a.mo45965k();
            C13207b bVar2 = oVar.f34302e;
            C52711k.m112236a((Object) bVar2, "it.mUserInfo");
            aVar.mo45904a(bVar, hVar, k, null, bVar2);
            C21841f fVar = this.f58810a;
            C13207b bVar3 = oVar.f34302e;
            C52711k.m112236a((Object) bVar3, "it.mUserInfo");
            C21674q.f58706a.mo45932a(false, "sms_verification", fVar, bVar3);
            C20975a.m53337a(13);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ax */
    public static final class C21713ax<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C21713ax f58811a = new C21713ax();

        C21713ax() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                if (rVar.getErrorCode() != 1011) {
                    C22093d.f59607b.mo46198b(false, rVar.getErrorCode(), rVar.getDetailErrorMsg());
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ay */
    public static final class C21714ay<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f58812a;

        /* renamed from: b */
        final /* synthetic */ C21850i f58813b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58814c;

        /* renamed from: d */
        final /* synthetic */ String f58815d;

        /* renamed from: e */
        final /* synthetic */ int f58816e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ay$a */
        public static final class C21715a extends C13143t {

            /* renamed from: a */
            final /* synthetic */ C21714ay f58817a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58818b;

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                this.f58818b.mo6303a(hVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                C2195p pVar = this.f58818b;
                C21675r rVar = new C21675r(hVar.f34000c, hVar.f34001d, this.f58817a.f58812a, this.f58817a.f58813b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21715a(C21714ay ayVar, C2195p pVar) {
                this.f58817a = ayVar;
                this.f58818b = pVar;
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                C2195p pVar = this.f58818b;
                C21675r rVar = new C21675r(hVar.f34000c, hVar.f34001d, this.f58817a.f58812a, this.f58817a.f58813b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                C2195p pVar = this.f58818b;
                C21675r rVar = new C21675r(hVar.f34000c, hVar.f34001d, this.f58817a.f58812a, this.f58817a.f58813b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21714ay(C21848h hVar, C21850i iVar, C21829b bVar, String str, int i) {
            this.f58812a = hVar;
            this.f58813b = iVar;
            this.f58814c = bVar;
            this.f58815d = str;
            this.f58816e = i;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12996h> pVar) {
            C52711k.m112240b(pVar, "it");
            C21715a aVar = new C21715a(this, pVar);
            this.f58814c.mo45962a((C12989a<T>) aVar);
            this.f58814c.mo45969o().mo24607a(this.f58815d, this.f58816e, true, 1, "", (C13143t) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$az */
    public static final class C21716az<T> implements C1710e<C12996h> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58819a;

        public C21716az(C21829b bVar) {
            this.f58819a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12996h hVar = (C12996h) obj;
            C21811v.m54456a(true, this.f58819a.mo45966l(), "change_bind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$b */
    public static final class C21717b<T> implements C1710e<C12993e<C21661g>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58820a;

        public C21717b(C21829b bVar) {
            this.f58820a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C20915c.m53260a(this.f58820a.mo45966l(), "email", 0, null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ba */
    public static final class C21718ba<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58821a;

        public C21718ba(C21829b bVar) {
            this.f58821a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C21811v.m54456a(false, this.f58821a.mo45966l(), "change_bind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bb */
    public static final class C21719bb<T> implements C2197r<C13018g> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58822a;

        /* renamed from: b */
        final /* synthetic */ String f58823b;

        /* renamed from: c */
        final /* synthetic */ String f58824c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bb$a */
        public static final class C21720a extends C13004e {

            /* renamed from: a */
            final /* synthetic */ C21719bb f58825a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58826b;

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                if (gVar.f34009h == null) {
                    C21676a.m54395a(C21848h.SET_OR_RESET_PASSWORD, this.f58825a.f58822a.mo45965k());
                } else {
                    this.f58826b.mo6303a(gVar);
                }
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                C2195p pVar = this.f58826b;
                C21675r rVar = new C21675r(gVar.f34000c, gVar.f34001d, C21848h.SET_OR_RESET_PASSWORD, this.f58825a.f58822a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21720a(C21719bb bbVar, C2195p pVar) {
                this.f58825a = bbVar;
                this.f58826b = pVar;
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                String str;
                C13018g gVar = (C13018g) bVar;
                C2195p pVar = this.f58826b;
                if (gVar != null) {
                    str = gVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i, str, C21848h.SET_OR_RESET_PASSWORD, this.f58825a.f58822a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                C2195p pVar = this.f58826b;
                C21675r rVar = new C21675r(gVar.f34000c, gVar.f34001d, C21848h.SET_OR_RESET_PASSWORD, this.f58825a.f58822a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21719bb(C21829b bVar, String str, String str2) {
            this.f58822a = bVar;
            this.f58823b = str;
            this.f58824c = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13018g> pVar) {
            C52711k.m112240b(pVar, "it");
            C21674q.f58706a.mo45930a(Boolean.valueOf(false), "sms_verification", (C21841f) this.f58822a, true);
            C21720a aVar = new C21720a(this, pVar);
            this.f58822a.mo45962a((C12989a<T>) aVar);
            this.f58822a.mo45969o().mo24617a(this.f58823b, this.f58824c, (C13004e) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bc */
    public static final class C21721bc<T> implements C1710e<C13018g> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58827a;

        public C21721bc(C21829b bVar) {
            this.f58827a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13018g gVar = (C13018g) obj;
            C21841f fVar = this.f58827a;
            C13207b bVar = gVar.f34009h;
            C52711k.m112236a((Object) bVar, "it.userInfo");
            C21674q.f58706a.mo45932a(false, "sms_verification", fVar, bVar);
            C21639a aVar = C21639a.f58654a;
            C21829b bVar2 = this.f58827a;
            C21848h hVar = C21848h.SET_OR_RESET_PASSWORD;
            C21850i k = this.f58827a.mo45965k();
            C13207b bVar3 = gVar.f34009h;
            C52711k.m112236a((Object) bVar3, "it.userInfo");
            aVar.mo45904a(bVar2, hVar, k, null, bVar3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bd */
    public static final class C21722bd<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58828a;

        public C21722bd(C21829b bVar) {
            this.f58828a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof C21675r) {
                C21675r rVar = (C21675r) th;
                C21674q.f58706a.mo45931a(false, rVar.getErrorCode(), "sms_verification", (C21841f) this.f58828a);
                if (this.f58828a.mo45965k() == C21850i.RESET_PASSWORD_FOR_PHONE) {
                    C23826bi.m58451a(8, 3, (Object) rVar.getErrorMsg());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$be */
    static final class C21723be<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ String f58829a;

        /* renamed from: b */
        final /* synthetic */ int f58830b;

        /* renamed from: c */
        final /* synthetic */ String f58831c;

        /* renamed from: d */
        final /* synthetic */ C21829b f58832d;

        /* renamed from: e */
        final /* synthetic */ C21848h f58833e;

        /* renamed from: f */
        final /* synthetic */ C21850i f58834f;

        /* renamed from: g */
        final /* synthetic */ String f58835g;

        /* renamed from: h */
        final /* synthetic */ String f58836h;

        /* renamed from: i */
        final /* synthetic */ int f58837i;

        /* renamed from: j */
        final /* synthetic */ String f58838j;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$be$a */
        public static final class C21724a extends C21107l {

            /* renamed from: a */
            final /* synthetic */ C21723be f58839a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58840b;

            public final void onSuccess(C12993e<C13120s> eVar) {
                C2195p pVar = this.f58840b;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                pVar.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58840b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58839a.f58833e, this.f58839a.f58834f, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21724a(C21723be beVar, C2195p pVar) {
                this.f58839a = beVar;
                this.f58840b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58840b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58839a.f58833e, this.f58839a.f58834f, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                if (r1 == null) goto L_0x0013;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13120s> r12, int r13) {
                /*
                    r11 = this;
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    java.lang.String r0 = "next_url"
                    if (r12 == 0) goto L_0x0013
                    T r1 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r1
                    if (r1 == 0) goto L_0x0013
                    java.lang.String r1 = r1.f34317d
                    if (r1 != 0) goto L_0x0015
                L_0x0013:
                    java.lang.String r1 = ""
                L_0x0015:
                    r5.put(r0, r1)
                    r0 = 2030(0x7ee, float:2.845E-42)
                    if (r13 != r0) goto L_0x003c
                    if (r12 == 0) goto L_0x0035
                    T r0 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r0
                    if (r0 == 0) goto L_0x0035
                    org.json.JSONObject r0 = r0.f34279l
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    r5.put(r1, r0)
                L_0x0035:
                    java.lang.String r0 = com.p683ss.android.ugc.aweme.account.login.C21459s.f58205o
                    java.lang.String r1 = "/passport/mobile/send_code/v1/"
                    r5.put(r0, r1)
                L_0x003c:
                    c.a.p r9 = r11.f58840b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r10 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    if (r12 == 0) goto L_0x0046
                    java.lang.String r12 = r12.f34001d
                L_0x0044:
                    r2 = r12
                    goto L_0x0048
                L_0x0046:
                    r12 = 0
                    goto L_0x0044
                L_0x0048:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$be r12 = r11.f58839a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r3 = r12.f58833e
                    com.ss.android.ugc.aweme.account.login.v2.a.s$be r12 = r11.f58839a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r12.f58834f
                    r6 = 0
                    r7 = 32
                    r8 = 0
                    r0 = r10
                    r1 = r13
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Throwable r10 = (java.lang.Throwable) r10
                    r9.mo6304a(r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21723be.C21724a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21723be(String str, int i, String str2, C21829b bVar, C21848h hVar, C21850i iVar, String str3, String str4, int i2, String str5) {
            this.f58829a = str;
            this.f58830b = i;
            this.f58831c = str2;
            this.f58832d = bVar;
            this.f58833e = hVar;
            this.f58834f = iVar;
            this.f58835g = str3;
            this.f58836h = str4;
            this.f58837i = i2;
            this.f58838j = str5;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", this.f58829a).mo44774a("send_reason", this.f58830b).mo44776a("enter_method", this.f58831c).mo44776a("enter_from", this.f58832d.mo45966l()).f56798a);
            boolean a = C22299f.m55184a();
            C21724a aVar = new C21724a(this, pVar);
            this.f58832d.mo45962a((C12989a<T>) aVar);
            String str = this.f58838j;
            C13139p pVar2 = aVar;
            this.f58832d.mo45969o().mo24612a(this.f58835g, "", this.f58830b, 0, this.f58836h, this.f58837i, a ? 1 : 0, "", str, pVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bf */
    static final class C21725bf<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58841a;

        /* renamed from: b */
        final /* synthetic */ String f58842b;

        /* renamed from: c */
        final /* synthetic */ String f58843c;

        C21725bf(int i, String str, String str2) {
            this.f58841a = i;
            this.f58842b = str;
            this.f58843c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46201a(0, this.f58841a, 0, "");
            C21674q.f58706a.mo45929a(0, this.f58842b, this.f58841a, "text", null, this.f58843c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bg */
    static final class C21726bg<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58844a;

        /* renamed from: b */
        final /* synthetic */ String f58845b;

        /* renamed from: c */
        final /* synthetic */ String f58846c;

        C21726bg(int i, String str, String str2) {
            this.f58844a = i;
            this.f58845b = str;
            this.f58846c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46201a(1, this.f58844a, rVar.getErrorCode(), rVar.getErrorMsg());
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58845b, this.f58844a, "text", rVar.getErrorMsg(), this.f58846c);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bh */
    static final class C21727bh<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ String f58847a;

        /* renamed from: b */
        final /* synthetic */ C21829b f58848b;

        /* renamed from: c */
        final /* synthetic */ String f58849c;

        /* renamed from: d */
        final /* synthetic */ String f58850d;

        /* renamed from: e */
        final /* synthetic */ int f58851e;

        /* renamed from: f */
        final /* synthetic */ HashMap f58852f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bh$a */
        public static final class C21728a extends C13131h {

            /* renamed from: a */
            final /* synthetic */ C2195p f58853a;

            C21728a(C2195p pVar) {
                this.f58853a = pVar;
            }

            public final void onSuccess(C12993e<C13109h> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58853a.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58853a;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, C21848h.LOGIN, C21850i.INPUT_EMAIL_FIND_PASSWORD, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onError(C12993e<C13109h> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C2195p pVar = this.f58853a;
                if (eVar != null) {
                    i2 = eVar.f34000c;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21848h hVar = C21848h.LOGIN;
                C21850i iVar = C21850i.INPUT_EMAIL_FIND_PASSWORD;
                if (eVar != null) {
                    C13109h hVar2 = (C13109h) eVar.f34007h;
                    if (hVar2 != null) {
                        JSONObject jSONObject2 = hVar2.f34279l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            C21675r rVar = new C21675r(i2, str, hVar, iVar, jSONObject, null, 32, null);
                            pVar.mo6304a((Throwable) rVar);
                        }
                    }
                }
                jSONObject = null;
                C21675r rVar2 = new C21675r(i2, str, hVar, iVar, jSONObject, null, 32, null);
                pVar.mo6304a((Throwable) rVar2);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58853a;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, C21848h.LOGIN, C21850i.INPUT_EMAIL_FIND_PASSWORD, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        C21727bh(String str, C21829b bVar, String str2, String str3, int i, HashMap hashMap) {
            this.f58847a = str;
            this.f58848b = bVar;
            this.f58849c = str2;
            this.f58850d = str3;
            this.f58851e = i;
            this.f58852f = hashMap;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13109h>> pVar) {
            String str;
            C52711k.m112240b(pVar, "it");
            String str2 = "send_email_code";
            C20856a a = new C20856a().mo44776a("send_method", this.f58847a);
            String str3 = "send_reason";
            if (this.f58848b.mo45965k() == C21850i.RESET_PASSWORD_FOR_EMAIL) {
                str = "reset_password";
            } else {
                str = "trigger_verification";
            }
            C26890h.m65011a(str2, a.mo44776a(str3, str).f56798a);
            C21728a aVar = new C21728a(pVar);
            this.f58848b.mo45962a((C12989a<T>) aVar);
            this.f58848b.mo45969o().mo24625a(this.f58849c, (String) null, this.f58850d, this.f58851e, (String) null, (Map) this.f58852f, (String) null, (C13131h) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bi */
    static final class C21729bi<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f58854a;

        /* renamed from: b */
        final /* synthetic */ int f58855b;

        C21729bi(String str, int i) {
            this.f58854a = str;
            this.f58855b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58854a, this.f58855b, "mail", rVar.getErrorMsg(), null);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bj */
    static final class C21730bj<T> implements C1710e<C12993e<C13109h>> {

        /* renamed from: a */
        final /* synthetic */ String f58856a;

        /* renamed from: b */
        final /* synthetic */ int f58857b;

        C21730bj(String str, int i) {
            this.f58856a = str;
            this.f58857b = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21674q.f58706a.mo45929a(0, this.f58856a, this.f58857b, "mail", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bk */
    static final class C21731bk<T> implements C2197r<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ String f58858a;

        /* renamed from: b */
        final /* synthetic */ int f58859b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58860c;

        /* renamed from: d */
        final /* synthetic */ C21850i f58861d;

        /* renamed from: e */
        final /* synthetic */ String f58862e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bk$a */
        public static final class C21732a extends C21107l {

            /* renamed from: a */
            final /* synthetic */ C21731bk f58863a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58864b;

            public final void onSuccess(C12993e<C13120s> eVar) {
                super.onSuccess(eVar);
                C2195p pVar = this.f58864b;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                pVar.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58864b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, C21848h.LOGIN, this.f58863a.f58861d, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21732a(C21731bk bkVar, C2195p pVar) {
                this.f58863a = bkVar;
                this.f58864b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C52711k.m112240b(str, "captcha");
                C2195p pVar = this.f58864b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, C21848h.LOGIN, this.f58863a.f58861d, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onError(C12993e<C13120s> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                super.onError(eVar, i);
                C2195p pVar = this.f58864b;
                if (eVar != null) {
                    i2 = eVar.f34000c;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21848h hVar = C21848h.LOGIN;
                C21850i iVar = this.f58863a.f58861d;
                if (eVar != null) {
                    C13120s sVar = (C13120s) eVar.f34007h;
                    if (sVar != null) {
                        JSONObject jSONObject2 = sVar.f34279l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            C21675r rVar = new C21675r(i2, str, hVar, iVar, jSONObject, null, 32, null);
                            pVar.mo6304a((Throwable) rVar);
                        }
                    }
                }
                jSONObject = null;
                C21675r rVar2 = new C21675r(i2, str, hVar, iVar, jSONObject, null, 32, null);
                pVar.mo6304a((Throwable) rVar2);
            }
        }

        C21731bk(String str, int i, C21829b bVar, C21850i iVar, String str2) {
            this.f58858a = str;
            this.f58859b = i;
            this.f58860c = bVar;
            this.f58861d = iVar;
            this.f58862e = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "it");
            C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", this.f58858a).mo44774a("send_reason", this.f58859b).mo44776a("enter_method", this.f58860c.mo45967m()).mo44776a("enter_from", this.f58860c.mo45966l()).f56798a);
            C21732a aVar = new C21732a(this, pVar);
            this.f58860c.mo45962a((C12989a<T>) aVar);
            this.f58860c.mo45969o().mo24614a(this.f58862e, (String) null, this.f58859b, (C13139p) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bl */
    static final class C21733bl<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58865a;

        /* renamed from: b */
        final /* synthetic */ String f58866b;

        /* renamed from: c */
        final /* synthetic */ String f58867c;

        C21733bl(int i, String str, String str2) {
            this.f58865a = i;
            this.f58866b = str;
            this.f58867c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46201a(0, this.f58865a, 0, "");
            C21674q.f58706a.mo45929a(0, this.f58866b, this.f58865a, "text", null, this.f58867c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bm */
    static final class C21734bm<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58868a;

        /* renamed from: b */
        final /* synthetic */ String f58869b;

        /* renamed from: c */
        final /* synthetic */ String f58870c;

        C21734bm(int i, String str, String str2) {
            this.f58868a = i;
            this.f58869b = str;
            this.f58870c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46201a(1, this.f58868a, rVar.getErrorCode(), rVar.getMessage());
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58869b, this.f58868a, "text", rVar.getErrorMsg(), this.f58870c);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bn */
    static final class C21735bn<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ String f58871a;

        /* renamed from: b */
        final /* synthetic */ int f58872b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58873c;

        /* renamed from: d */
        final /* synthetic */ C21848h f58874d;

        /* renamed from: e */
        final /* synthetic */ C21850i f58875e;

        /* renamed from: f */
        final /* synthetic */ String f58876f;

        /* renamed from: g */
        final /* synthetic */ String f58877g;

        /* renamed from: h */
        final /* synthetic */ int f58878h;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bn$a */
        public static final class C21736a extends C21107l {

            /* renamed from: a */
            final /* synthetic */ C21735bn f58879a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58880b;

            public final void onSuccess(C12993e<C13120s> eVar) {
                C2195p pVar = this.f58880b;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                pVar.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58880b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58879a.f58874d, this.f58879a.f58875e, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21736a(C21735bn bnVar, C2195p pVar) {
                this.f58879a = bnVar;
                this.f58880b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58880b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58879a.f58874d, this.f58879a.f58875e, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                if (r1 == null) goto L_0x0013;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13120s> r12, int r13) {
                /*
                    r11 = this;
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    java.lang.String r0 = "next_url"
                    if (r12 == 0) goto L_0x0013
                    T r1 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r1
                    if (r1 == 0) goto L_0x0013
                    java.lang.String r1 = r1.f34317d
                    if (r1 != 0) goto L_0x0015
                L_0x0013:
                    java.lang.String r1 = ""
                L_0x0015:
                    r5.put(r0, r1)
                    r0 = 2030(0x7ee, float:2.845E-42)
                    if (r13 != r0) goto L_0x003c
                    if (r12 == 0) goto L_0x0035
                    T r0 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r0
                    if (r0 == 0) goto L_0x0035
                    org.json.JSONObject r0 = r0.f34279l
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    r5.put(r1, r0)
                L_0x0035:
                    java.lang.String r0 = com.p683ss.android.ugc.aweme.account.login.C21459s.f58205o
                    java.lang.String r1 = "/passport/mobile/send_code/v1/"
                    r5.put(r0, r1)
                L_0x003c:
                    c.a.p r9 = r11.f58880b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r10 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    if (r12 == 0) goto L_0x0046
                    java.lang.String r12 = r12.f34001d
                L_0x0044:
                    r2 = r12
                    goto L_0x0048
                L_0x0046:
                    r12 = 0
                    goto L_0x0044
                L_0x0048:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bn r12 = r11.f58879a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r3 = r12.f58874d
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bn r12 = r11.f58879a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r12.f58875e
                    r6 = 0
                    r7 = 32
                    r8 = 0
                    r0 = r10
                    r1 = r13
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Throwable r10 = (java.lang.Throwable) r10
                    r9.mo6304a(r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21735bn.C21736a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21735bn(String str, int i, C21829b bVar, C21848h hVar, C21850i iVar, String str2, String str3, int i2) {
            this.f58871a = str;
            this.f58872b = i;
            this.f58873c = bVar;
            this.f58874d = hVar;
            this.f58875e = iVar;
            this.f58876f = str2;
            this.f58877g = str3;
            this.f58878h = i2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", this.f58871a).mo44774a("send_reason", this.f58872b).mo44776a("enter_method", this.f58873c.mo45967m()).mo44776a("enter_from", this.f58873c.mo45966l()).f56798a);
            boolean a = C22299f.m55184a();
            C21736a aVar = new C21736a(this, pVar);
            this.f58873c.mo45962a((C12989a<T>) aVar);
            this.f58873c.mo45969o().mo24611a(this.f58876f, "", this.f58872b, 0, this.f58877g, this.f58878h, a ? 1 : 0, (C13139p) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bo */
    static final class C21737bo<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58881a;

        /* renamed from: b */
        final /* synthetic */ String f58882b;

        /* renamed from: c */
        final /* synthetic */ C21850i f58883c;

        /* renamed from: d */
        final /* synthetic */ C21829b f58884d;

        /* renamed from: e */
        final /* synthetic */ String f58885e;

        /* renamed from: f */
        final /* synthetic */ String f58886f;

        C21737bo(int i, String str, C21850i iVar, C21829b bVar, String str2, String str3) {
            this.f58881a = i;
            this.f58882b = str;
            this.f58883c = iVar;
            this.f58884d = bVar;
            this.f58885e = str2;
            this.f58886f = str3;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46202a(1, this.f58881a, rVar.getErrorCode(), rVar.getMessage(), this.f58882b);
                if (this.f58883c == C21850i.INPUT_PHONE_SIGN_UP) {
                    C21968a.m54723a(Integer.valueOf(rVar.getErrorCode()), this.f58884d.mo45967m());
                } else if (this.f58883c == C21850i.INPUT_PHONE_LOGIN) {
                    C21958a.m54711a(false, this.f58884d.mo45967m());
                }
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58885e, this.f58881a, "text", rVar.getErrorMsg(), this.f58886f);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bp */
    static final class C21738bp<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58887a;

        /* renamed from: b */
        final /* synthetic */ String f58888b;

        /* renamed from: c */
        final /* synthetic */ String f58889c;

        /* renamed from: d */
        final /* synthetic */ String f58890d;

        C21738bp(int i, String str, String str2, String str3) {
            this.f58887a = i;
            this.f58888b = str;
            this.f58889c = str2;
            this.f58890d = str3;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46202a(0, this.f58887a, 0, "", this.f58888b);
            C21674q.f58706a.mo45929a(0, this.f58889c, this.f58887a, "text", null, this.f58890d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bq */
    static final class C21739bq<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ String f58891a;

        /* renamed from: b */
        final /* synthetic */ int f58892b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58893c;

        /* renamed from: d */
        final /* synthetic */ C21848h f58894d;

        /* renamed from: e */
        final /* synthetic */ C21850i f58895e;

        /* renamed from: f */
        final /* synthetic */ String f58896f;

        /* renamed from: g */
        final /* synthetic */ String f58897g;

        /* renamed from: h */
        final /* synthetic */ int f58898h;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bq$a */
        public static final class C21740a extends C21107l {

            /* renamed from: a */
            final /* synthetic */ C21739bq f58899a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58900b;

            public final void onSuccess(C12993e<C13120s> eVar) {
                C2195p pVar = this.f58900b;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                pVar.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58900b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58899a.f58894d, this.f58899a.f58895e, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21740a(C21739bq bqVar, C2195p pVar) {
                this.f58899a = bqVar;
                this.f58900b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58900b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58899a.f58894d, this.f58899a.f58895e, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                if (r1 == null) goto L_0x0013;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13120s> r12, int r13) {
                /*
                    r11 = this;
                    org.json.JSONObject r5 = new org.json.JSONObject
                    r5.<init>()
                    java.lang.String r0 = "next_url"
                    if (r12 == 0) goto L_0x0013
                    T r1 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r1
                    if (r1 == 0) goto L_0x0013
                    java.lang.String r1 = r1.f34317d
                    if (r1 != 0) goto L_0x0015
                L_0x0013:
                    java.lang.String r1 = ""
                L_0x0015:
                    r5.put(r0, r1)
                    r0 = 2030(0x7ee, float:2.845E-42)
                    if (r13 != r0) goto L_0x003c
                    if (r12 == 0) goto L_0x0035
                    T r0 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r0
                    if (r0 == 0) goto L_0x0035
                    org.json.JSONObject r0 = r0.f34279l
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    org.json.JSONObject r0 = r0.optJSONObject(r1)
                    if (r0 == 0) goto L_0x0035
                    java.lang.String r1 = "data"
                    r5.put(r1, r0)
                L_0x0035:
                    java.lang.String r0 = com.p683ss.android.ugc.aweme.account.login.C21459s.f58205o
                    java.lang.String r1 = "/passport/mobile/send_code/v1/"
                    r5.put(r0, r1)
                L_0x003c:
                    r0 = 1206(0x4b6, float:1.69E-42)
                    if (r13 != r0) goto L_0x0052
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bq r0 = r11.f58899a
                    com.ss.android.ugc.aweme.account.login.v2.base.b r0 = r0.f58893c
                    android.content.Context r0 = r0.getContext()
                    r1 = 2132543280(0x7f1c0730, float:2.0739689E38)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r1)
                    r0.mo19066a()
                L_0x0052:
                    c.a.p r9 = r11.f58900b
                    com.ss.android.ugc.aweme.account.login.v2.a.r r10 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    if (r12 == 0) goto L_0x005c
                    java.lang.String r12 = r12.f34001d
                L_0x005a:
                    r2 = r12
                    goto L_0x005e
                L_0x005c:
                    r12 = 0
                    goto L_0x005a
                L_0x005e:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bq r12 = r11.f58899a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r3 = r12.f58894d
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bq r12 = r11.f58899a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r12.f58895e
                    r6 = 0
                    r7 = 32
                    r8 = 0
                    r0 = r10
                    r1 = r13
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Throwable r10 = (java.lang.Throwable) r10
                    r9.mo6304a(r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21739bq.C21740a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }
        }

        C21739bq(String str, int i, C21829b bVar, C21848h hVar, C21850i iVar, String str2, String str3, int i2) {
            this.f58891a = str;
            this.f58892b = i;
            this.f58893c = bVar;
            this.f58894d = hVar;
            this.f58895e = iVar;
            this.f58896f = str2;
            this.f58897g = str3;
            this.f58898h = i2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", this.f58891a).mo44774a("send_reason", this.f58892b).mo44776a("enter_method", this.f58893c.mo45967m()).mo44776a("enter_from", this.f58893c.mo45966l()).f56798a);
            boolean a = C22299f.m55184a();
            C21740a aVar = new C21740a(this, pVar);
            this.f58893c.mo45962a((C12989a<T>) aVar);
            C21425a aVar2 = C21424e.f58113f;
            Context context = this.f58893c.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            String str = this.f58896f;
            String str2 = "";
            String str3 = "";
            int i = this.f58892b;
            String str4 = this.f58897g;
            int i2 = this.f58898h;
            C13139p pVar2 = aVar;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str2, "mobile");
            C52711k.m112240b(str3, "captcha");
            C52711k.m112240b(str4, "ticket");
            C52711k.m112240b(pVar2, "call");
            C13120s sVar = new C13120s(str2, str3, i, 0, str4, i2, a ? 1 : 0);
            C21425a aVar3 = aVar2;
            C13074a aVar4 = new C13074a();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(sVar.f34314a)) {
                hashMap.put("mobile", C9431p.m18668d(sVar.f34314a));
            }
            if (!TextUtils.isEmpty(sVar.f34320g)) {
                hashMap.put("old_mobile", C9431p.m18668d(sVar.f34320g));
            }
            if (!TextUtils.isEmpty(sVar.f34315b)) {
                hashMap.put("captcha", sVar.f34315b);
            }
            hashMap.put("type", C9431p.m18668d(String.valueOf(sVar.f34318e)));
            hashMap.put("unbind_exist", C9431p.m18668d(String.valueOf(sVar.f34319f)));
            hashMap.put("mix_mode", "1");
            if (sVar.f34328z == 1) {
                hashMap.put("check_register", "1");
            } else if (sVar.f34328z == 0) {
                hashMap.put("check_register", "0");
            }
            if (!TextUtils.isEmpty(sVar.f34322t)) {
                hashMap.put("ticket", sVar.f34322t);
            }
            hashMap.put("auto_read", String.valueOf(sVar.f34323u));
            if (!TextUtils.isEmpty(sVar.f34324v)) {
                hashMap.put("shark_ticket", sVar.f34324v);
            }
            if (!TextUtils.isEmpty(sVar.f34326x)) {
                hashMap.put("auth_token", sVar.f34326x);
            }
            if (!TextUtils.isEmpty(sVar.f34325w)) {
                hashMap.put("unusable_mobile_ticket", sVar.f34325w);
            }
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            C13074a a2 = aVar4.mo24755a((Map<String, String>) hashMap, C52731z.m112270f(sVar.f34327y));
            C52711k.m112236a((Object) a2, "ApiRequest.Builder().par…ableMap<String, String>?)");
            C13073a c = a2.mo24752a(C12998a.m26117a()).mo24757c();
            C52711k.m112236a((Object) c, "request");
            new C21424e(context, c, sVar, pVar2).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$br */
    static final class C21741br<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58901a;

        /* renamed from: b */
        final /* synthetic */ String f58902b;

        /* renamed from: c */
        final /* synthetic */ C21850i f58903c;

        /* renamed from: d */
        final /* synthetic */ C21829b f58904d;

        /* renamed from: e */
        final /* synthetic */ String f58905e;

        C21741br(int i, String str, C21850i iVar, C21829b bVar, String str2) {
            this.f58901a = i;
            this.f58902b = str;
            this.f58903c = iVar;
            this.f58904d = bVar;
            this.f58905e = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46202a(1, this.f58901a, rVar.getErrorCode(), rVar.getMessage(), this.f58902b);
                if (this.f58903c == C21850i.INPUT_PHONE_SIGN_UP) {
                    C21968a.m54723a(Integer.valueOf(rVar.getErrorCode()), this.f58904d.mo45967m());
                } else if (this.f58903c == C21850i.INPUT_PHONE_LOGIN) {
                    C21958a.m54711a(false, this.f58904d.mo45967m());
                }
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58905e, this.f58901a, "text", rVar.getErrorMsg(), null);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bs */
    static final class C21742bs<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58906a;

        /* renamed from: b */
        final /* synthetic */ String f58907b;

        /* renamed from: c */
        final /* synthetic */ String f58908c;

        C21742bs(int i, String str, String str2) {
            this.f58906a = i;
            this.f58907b = str;
            this.f58908c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46202a(0, this.f58906a, 0, "", this.f58907b);
            C21674q.f58706a.mo45929a(0, this.f58908c, this.f58906a, "text", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bt */
    public static final class C21743bt<T> implements C2197r<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58909a;

        /* renamed from: b */
        final /* synthetic */ String f58910b;

        /* renamed from: c */
        final /* synthetic */ C21848h f58911c;

        /* renamed from: d */
        final /* synthetic */ C21850i f58912d;

        /* renamed from: e */
        final /* synthetic */ C21829b f58913e;

        /* renamed from: f */
        final /* synthetic */ String f58914f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bt$a */
        public static final class C21744a extends C13139p {

            /* renamed from: a */
            final /* synthetic */ C21743bt f58915a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58916b;

            public final void onSuccess(C12993e<C13120s> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58916b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58916b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58915a.f58911c, this.f58915a.f58912d, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21744a(C21743bt btVar, C2195p pVar) {
                this.f58915a = btVar;
                this.f58916b = pVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
                if (r12 == null) goto L_0x0025;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13120s> r12, int r13) {
                /*
                    r11 = this;
                    c.a.p r0 = r11.f58916b
                    if (r12 == 0) goto L_0x0008
                    java.lang.String r1 = r12.f34001d
                L_0x0006:
                    r4 = r1
                    goto L_0x000a
                L_0x0008:
                    r1 = 0
                    goto L_0x0006
                L_0x000a:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bt r1 = r11.f58915a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r5 = r1.f58911c
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bt r1 = r11.f58915a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r6 = r1.f58912d
                    org.json.JSONObject r7 = new org.json.JSONObject
                    r7.<init>()
                    java.lang.String r1 = "next_url"
                    if (r12 == 0) goto L_0x0025
                    T r12 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r12 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r12
                    if (r12 == 0) goto L_0x0025
                    java.lang.String r12 = r12.f34317d
                    if (r12 != 0) goto L_0x0027
                L_0x0025:
                    java.lang.String r12 = ""
                L_0x0027:
                    r7.put(r1, r12)
                    com.ss.android.ugc.aweme.account.login.v2.a.r r12 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r8 = 0
                    r9 = 32
                    r10 = 0
                    r2 = r12
                    r3 = r13
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    java.lang.Throwable r12 = (java.lang.Throwable) r12
                    r0.mo6304a(r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21743bt.C21744a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58916b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58915a.f58911c, this.f58915a.f58912d, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21743bt(int i, String str, C21848h hVar, C21850i iVar, C21829b bVar, String str2) {
            this.f58909a = i;
            this.f58910b = str;
            this.f58911c = hVar;
            this.f58912d = iVar;
            this.f58913e = bVar;
            this.f58914f = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "it");
            C26890h.m65011a("send_voice_verification_code", new C20856a().mo44776a("send_reason", String.valueOf(this.f58909a)).mo44776a("send_method", this.f58910b).f56798a);
            C21744a aVar = new C21744a(this, pVar);
            this.f58913e.mo45962a((C12989a<T>) aVar);
            C21451a aVar2 = C21450h.f58166e;
            Context context = this.f58913e.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            String str = this.f58914f;
            String str2 = "";
            String str3 = "";
            int i = this.f58909a;
            C13139p pVar2 = aVar;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str2, "mobile");
            C52711k.m112240b(str3, "captcha");
            C52711k.m112240b(pVar2, "call");
            C21451a aVar3 = aVar2;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str2, "mobile");
            C52711k.m112240b(str3, "captcha");
            C52711k.m112240b(pVar2, "call");
            C13120s sVar = new C13120s(str2, str3, i, 0, -1);
            C13074a a = new C13074a().mo24752a(C12998a.m26131n());
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(sVar.f34314a)) {
                hashMap.put("mobile", C9431p.m18668d(sVar.f34314a));
            }
            if (!TextUtils.isEmpty(sVar.f34320g)) {
                hashMap.put("old_mobile", C9431p.m18668d(sVar.f34320g));
            }
            if (!TextUtils.isEmpty(sVar.f34315b)) {
                hashMap.put("captcha", sVar.f34315b);
            }
            if (!TextUtils.isEmpty(String.valueOf(sVar.f34318e))) {
                hashMap.put("type", C9431p.m18668d(String.valueOf(sVar.f34318e)));
            }
            if (!TextUtils.isEmpty(String.valueOf(sVar.f34319f))) {
                hashMap.put("unbind_exist", C9431p.m18668d(String.valueOf(sVar.f34319f)));
            }
            hashMap.put("mix_mode", "1");
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            C13073a c = a.mo24754a((Map<String, String>) hashMap).mo24757c();
            C52711k.m112236a((Object) c, "request");
            new C21450h(context, c, sVar, pVar2).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bu */
    public static final class C21745bu<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58917a;

        /* renamed from: b */
        final /* synthetic */ String f58918b;

        public C21745bu(int i, String str) {
            this.f58917a = i;
            this.f58918b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46201a(1, this.f58917a, rVar.getErrorCode(), rVar.getMessage());
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58918b, this.f58917a, "voice", rVar.getErrorMsg(), null);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bv */
    public static final class C21746bv<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58919a;

        /* renamed from: b */
        final /* synthetic */ String f58920b;

        public C21746bv(int i, String str) {
            this.f58919a = i;
            this.f58920b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46201a(0, this.f58919a, 0, "");
            C21674q.f58706a.mo45929a(0, this.f58920b, this.f58919a, "voice", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bw */
    static final class C21747bw<T> implements C2197r<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58921a;

        /* renamed from: b */
        final /* synthetic */ String f58922b;

        /* renamed from: c */
        final /* synthetic */ C21848h f58923c;

        /* renamed from: d */
        final /* synthetic */ C21850i f58924d;

        /* renamed from: e */
        final /* synthetic */ C21829b f58925e;

        /* renamed from: f */
        final /* synthetic */ String f58926f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bw$a */
        public static final class C21748a extends C13139p {

            /* renamed from: a */
            final /* synthetic */ C21747bw f58927a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58928b;

            public final void onSuccess(C12993e<C13120s> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58928b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58928b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58927a.f58923c, this.f58927a.f58924d, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21748a(C21747bw bwVar, C2195p pVar) {
                this.f58927a = bwVar;
                this.f58928b = pVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
                if (r12 == null) goto L_0x0025;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13120s> r12, int r13) {
                /*
                    r11 = this;
                    c.a.p r0 = r11.f58928b
                    if (r12 == 0) goto L_0x0008
                    java.lang.String r1 = r12.f34001d
                L_0x0006:
                    r4 = r1
                    goto L_0x000a
                L_0x0008:
                    r1 = 0
                    goto L_0x0006
                L_0x000a:
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bw r1 = r11.f58927a
                    com.ss.android.ugc.aweme.account.login.v2.base.h r5 = r1.f58923c
                    com.ss.android.ugc.aweme.account.login.v2.a.s$bw r1 = r11.f58927a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r6 = r1.f58924d
                    org.json.JSONObject r7 = new org.json.JSONObject
                    r7.<init>()
                    java.lang.String r1 = "next_url"
                    if (r12 == 0) goto L_0x0025
                    T r12 = r12.f34007h
                    com.bytedance.sdk.account.f.a.s r12 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r12
                    if (r12 == 0) goto L_0x0025
                    java.lang.String r12 = r12.f34317d
                    if (r12 != 0) goto L_0x0027
                L_0x0025:
                    java.lang.String r12 = ""
                L_0x0027:
                    r7.put(r1, r12)
                    com.ss.android.ugc.aweme.account.login.v2.a.r r12 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                    r8 = 0
                    r9 = 32
                    r10 = 0
                    r2 = r12
                    r3 = r13
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                    java.lang.Throwable r12 = (java.lang.Throwable) r12
                    r0.mo6304a(r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21747bw.C21748a.onError(com.bytedance.sdk.account.a.a.e, int):void");
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58928b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58927a.f58923c, this.f58927a.f58924d, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        C21747bw(int i, String str, C21848h hVar, C21850i iVar, C21829b bVar, String str2) {
            this.f58921a = i;
            this.f58922b = str;
            this.f58923c = hVar;
            this.f58924d = iVar;
            this.f58925e = bVar;
            this.f58926f = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "it");
            C26890h.m65011a("send_voice_verification_code", new C20856a().mo44776a("send_reason", String.valueOf(this.f58921a)).mo44776a("send_method", this.f58922b).f56798a);
            C21748a aVar = new C21748a(this, pVar);
            this.f58925e.mo45962a((C12989a<T>) aVar);
            this.f58925e.mo45969o().mo24642b(this.f58926f, "", this.f58921a, (C13139p) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bx */
    static final class C21749bx<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58929a;

        /* renamed from: b */
        final /* synthetic */ String f58930b;

        /* renamed from: c */
        final /* synthetic */ String f58931c;

        C21749bx(int i, String str, String str2) {
            this.f58929a = i;
            this.f58930b = str;
            this.f58931c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46201a(1, this.f58929a, rVar.getErrorCode(), rVar.getMessage());
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58930b, this.f58929a, "voice", rVar.getErrorMsg(), this.f58931c);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$by */
    static final class C21750by<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58932a;

        /* renamed from: b */
        final /* synthetic */ String f58933b;

        /* renamed from: c */
        final /* synthetic */ String f58934c;

        /* renamed from: d */
        final /* synthetic */ C21829b f58935d;

        C21750by(int i, String str, String str2, C21829b bVar) {
            this.f58932a = i;
            this.f58933b = str;
            this.f58934c = str2;
            this.f58935d = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46201a(0, this.f58932a, 0, "");
            C21674q.f58706a.mo45929a(0, this.f58933b, this.f58932a, "voice", null, this.f58934c);
            FragmentActivity activity = this.f58935d.getActivity();
            if (activity != null) {
                Boolean.valueOf(!activity.isFinishing());
            }
            FragmentActivity activity2 = this.f58935d.getActivity();
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity2, "fragment.activity!!");
            new C10643a(activity2).mo18892a(activity2.getString(R.string.fy1, new Object[]{this.f58934c})).mo18886a((int) R.string.ahm, (OnClickListener) null).mo18897a().mo18883c().setCancelable(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$bz */
    static final class C21751bz<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ String f58936a;

        /* renamed from: b */
        final /* synthetic */ int f58937b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58938c;

        /* renamed from: d */
        final /* synthetic */ String f58939d;

        /* renamed from: e */
        final /* synthetic */ String f58940e;

        /* renamed from: f */
        final /* synthetic */ int f58941f;

        /* renamed from: g */
        final /* synthetic */ C21848h f58942g;

        /* renamed from: h */
        final /* synthetic */ C21850i f58943h;

        C21751bz(String str, int i, C21829b bVar, String str2, String str3, int i2, C21848h hVar, C21850i iVar) {
            this.f58936a = str;
            this.f58937b = i;
            this.f58938c = bVar;
            this.f58939d = str2;
            this.f58940e = str3;
            this.f58941f = i2;
            this.f58942g = hVar;
            this.f58943h = iVar;
        }

        /* renamed from: a */
        public final void mo6498a(final C2195p<C12993e<C13120s>> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C26890h.m65011a("send_whatsapp_code", new C20856a().mo44776a("send_method", this.f58936a).mo44774a("send_reason", this.f58937b).mo44776a("enter_method", this.f58938c.mo45967m()).mo44776a("enter_from", this.f58938c.mo45966l()).f56798a);
            C20901a aVar = C20900b.f56878f;
            Context context = this.f58938c.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            int i = this.f58937b;
            String str = this.f58940e;
            int i2 = this.f58941f;
            boolean a = C22299f.m55184a();
            aVar.mo44858a(context, this.f58939d, "", i, 0, str, i2, a ? 1 : 0, new C13139p(this) {

                /* renamed from: a */
                final /* synthetic */ C21751bz f58944a;

                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                    C12993e eVar = (C12993e) bVar;
                    C52711k.m112240b(eVar, "response");
                    C2195p pVar = pVar;
                    C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58944a.f58942g, this.f58944a.f58943h, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                public final void onSuccess(C12993e<C13120s> eVar) {
                    if (eVar != null) {
                        pVar.mo6303a(eVar);
                        return;
                    }
                    C2195p pVar = pVar;
                    C21675r rVar = new C21675r(-1, "no data", this.f58944a.f58942g, this.f58944a.f58943h, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                {
                    this.f58944a = r1;
                }

                public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    C12993e eVar = (C12993e) bVar;
                    C52711k.m112240b(eVar, "response");
                    C2195p pVar = pVar;
                    C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58944a.f58942g, this.f58944a.f58943h, null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
                    if (r1 == null) goto L_0x0013;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onError(com.bytedance.sdk.account.p844a.p845a.C12993e<com.bytedance.sdk.account.p861f.p862a.C13120s> r12, int r13) {
                    /*
                        r11 = this;
                        org.json.JSONObject r5 = new org.json.JSONObject
                        r5.<init>()
                        java.lang.String r0 = "next_url"
                        if (r12 == 0) goto L_0x0013
                        T r1 = r12.f34007h
                        com.bytedance.sdk.account.f.a.s r1 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r1
                        if (r1 == 0) goto L_0x0013
                        java.lang.String r1 = r1.f34317d
                        if (r1 != 0) goto L_0x0015
                    L_0x0013:
                        java.lang.String r1 = ""
                    L_0x0015:
                        r5.put(r0, r1)
                        r0 = 2030(0x7ee, float:2.845E-42)
                        if (r13 != r0) goto L_0x003c
                        if (r12 == 0) goto L_0x0035
                        T r0 = r12.f34007h
                        com.bytedance.sdk.account.f.a.s r0 = (com.bytedance.sdk.account.p861f.p862a.C13120s) r0
                        if (r0 == 0) goto L_0x0035
                        org.json.JSONObject r0 = r0.f34279l
                        if (r0 == 0) goto L_0x0035
                        java.lang.String r1 = "data"
                        org.json.JSONObject r0 = r0.optJSONObject(r1)
                        if (r0 == 0) goto L_0x0035
                        java.lang.String r1 = "data"
                        r5.put(r1, r0)
                    L_0x0035:
                        java.lang.String r0 = com.p683ss.android.ugc.aweme.account.login.C21459s.f58205o
                        java.lang.String r1 = "/passport/mobile/send_code/v1/"
                        r5.put(r0, r1)
                    L_0x003c:
                        c.a.p r9 = r13
                        com.ss.android.ugc.aweme.account.login.v2.a.r r10 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                        if (r12 == 0) goto L_0x0046
                        java.lang.String r12 = r12.f34001d
                    L_0x0044:
                        r2 = r12
                        goto L_0x0048
                    L_0x0046:
                        r12 = 0
                        goto L_0x0044
                    L_0x0048:
                        com.ss.android.ugc.aweme.account.login.v2.a.s$bz r12 = r11.f58944a
                        com.ss.android.ugc.aweme.account.login.v2.base.h r3 = r12.f58942g
                        com.ss.android.ugc.aweme.account.login.v2.a.s$bz r12 = r11.f58944a
                        com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r12.f58943h
                        r6 = 0
                        r7 = 32
                        r8 = 0
                        r0 = r10
                        r1 = r13
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                        java.lang.Throwable r10 = (java.lang.Throwable) r10
                        r9.mo6304a(r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21751bz.C217521.onError(com.bytedance.sdk.account.a.a.e, int):void");
                }
            }).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$c */
    public static final class C21753c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58946a;

        public C21753c(C21829b bVar) {
            this.f58946a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C20915c.m53260a(this.f58946a.mo45966l(), "email", rVar.getErrorCode(), rVar.getErrorMsg(), null);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ca */
    static final class C21754ca<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ int f58947a;

        /* renamed from: b */
        final /* synthetic */ C21850i f58948b;

        /* renamed from: c */
        final /* synthetic */ C21829b f58949c;

        /* renamed from: d */
        final /* synthetic */ String f58950d;

        /* renamed from: e */
        final /* synthetic */ String f58951e;

        C21754ca(int i, C21850i iVar, C21829b bVar, String str, String str2) {
            this.f58947a = i;
            this.f58948b = iVar;
            this.f58949c = bVar;
            this.f58950d = str;
            this.f58951e = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22097f.f59615d.mo46203b(1, this.f58947a, rVar.getErrorCode(), rVar.getMessage());
                if (this.f58948b == C21850i.INPUT_PHONE_SIGN_UP) {
                    C21968a.m54723a(Integer.valueOf(rVar.getErrorCode()), this.f58949c.mo45967m());
                } else if (this.f58948b == C21850i.INPUT_PHONE_LOGIN) {
                    C21958a.m54711a(false, this.f58949c.mo45967m());
                }
                C21674q.f58706a.mo45929a(rVar.getErrorCode(), this.f58950d, this.f58947a, "whatsapp", rVar.getErrorMsg(), this.f58951e);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cb */
    static final class C21755cb<T> implements C1710e<C12993e<C13120s>> {

        /* renamed from: a */
        final /* synthetic */ int f58952a;

        /* renamed from: b */
        final /* synthetic */ String f58953b;

        /* renamed from: c */
        final /* synthetic */ String f58954c;

        C21755cb(int i, String str, String str2) {
            this.f58952a = i;
            this.f58953b = str;
            this.f58954c = str2;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22097f.f59615d.mo46203b(0, this.f58952a, 0, "");
            C21674q.f58706a.mo45929a(0, this.f58953b, this.f58952a, "whatsapp", null, this.f58954c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cc */
    static final class C21756cc<T> implements C2197r<C12993e<C13163a>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58955a;

        /* renamed from: b */
        final /* synthetic */ String f58956b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cc$a */
        public static final class C21757a extends C13140q {

            /* renamed from: a */
            final /* synthetic */ C21756cc f58957a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58958b;

            public final /* synthetic */ void onResponse(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                if (eVar == null) {
                    C2195p pVar = this.f58958b;
                    C21675r rVar = new C21675r(-1, "no data", C21848h.SIGN_UP, this.f58957a.f58955a.mo45965k(), null, null, 32, null);
                    pVar.mo6304a((Throwable) rVar);
                } else if (eVar.f34000c != 0) {
                    C2195p pVar2 = this.f58958b;
                    C21675r rVar2 = new C21675r(eVar.f34000c, eVar.f34001d, C21848h.SIGN_UP, this.f58957a.f58955a.mo45965k(), null, null, 32, null);
                    pVar2.mo6304a((Throwable) rVar2);
                } else {
                    this.f58958b.mo6303a(eVar);
                }
            }

            C21757a(C21756cc ccVar, C2195p pVar) {
                this.f58957a = ccVar;
                this.f58958b = pVar;
            }
        }

        C21756cc(C21829b bVar, String str) {
            this.f58955a = bVar;
            this.f58956b = str;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13163a>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21757a aVar = new C21757a(this, pVar);
            this.f58955a.mo45962a((C12989a<T>) aVar);
            this.f58955a.mo45969o().mo24620a(this.f58956b, (String) null, (C13140q) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cd */
    static final class C21758cd<T> implements C1710e<C12993e<C13163a>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58959a;

        C21758cd(C21829b bVar) {
            this.f58959a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21674q.m54390a(true, "phone", "register", this.f58959a.mo45967m(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ce */
    static final class C21759ce<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58960a;

        C21759ce(C21829b bVar) {
            this.f58960a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "phone";
            String str2 = "register";
            String m = this.f58960a.mo45967m();
            if (th != null) {
                C21674q.m54390a(false, str, str2, m, ((C21675r) th).getErrorCode());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cf */
    public static final class C21760cf<T> implements C2197r<C13018g> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58961a;

        /* renamed from: b */
        final /* synthetic */ String f58962b;

        /* renamed from: c */
        final /* synthetic */ String f58963c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cf$a */
        public static final class C21761a extends C13004e {

            /* renamed from: a */
            final /* synthetic */ C21760cf f58964a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58965b;

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                this.f58965b.mo6303a(gVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                C2195p pVar = this.f58965b;
                C21675r rVar = new C21675r(gVar.f34000c, gVar.f34001d, C21848h.SET_OR_RESET_PASSWORD, this.f58964a.f58961a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21761a(C21760cf cfVar, C2195p pVar) {
                this.f58964a = cfVar;
                this.f58965b = pVar;
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                C2195p pVar = this.f58965b;
                C21675r rVar = new C21675r(i, gVar.f34001d, C21848h.SET_OR_RESET_PASSWORD, this.f58964a.f58961a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C13018g gVar = (C13018g) bVar;
                C52711k.m112240b(gVar, "response");
                C2195p pVar = this.f58965b;
                C21675r rVar = new C21675r(gVar.f34000c, gVar.f34001d, C21848h.SET_OR_RESET_PASSWORD, this.f58964a.f58961a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21760cf(C21829b bVar, String str, String str2) {
            this.f58961a = bVar;
            this.f58962b = str;
            this.f58963c = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13018g> pVar) {
            C52711k.m112240b(pVar, "it");
            C21674q.f58706a.mo45930a(Boolean.valueOf(false), "email", (C21841f) this.f58961a, true);
            C21761a aVar = new C21761a(this, pVar);
            this.f58961a.mo45962a((C12989a<T>) aVar);
            C13011d o = this.f58961a.mo45969o();
            String str = this.f58962b;
            if (str != null) {
                o.mo24639a(C52830p.m112447b(str).toString(), this.f58963c, (Map) null, (String) null, (C13004e) aVar);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cg */
    public static final class C21762cg<T> implements C1710e<C13018g> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58966a;

        public C21762cg(C21829b bVar) {
            this.f58966a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13018g gVar = (C13018g) obj;
            C21674q.m54390a(true, "email", "reset_password", this.f58966a.mo45967m(), 0);
            C21841f fVar = this.f58966a;
            C13207b bVar = gVar.f34009h;
            C52711k.m112236a((Object) bVar, "it.userInfo");
            C21674q.f58706a.mo45932a(false, "email", fVar, bVar);
            C21639a aVar = C21639a.f58654a;
            C21829b bVar2 = this.f58966a;
            C21848h hVar = C21848h.SET_OR_RESET_PASSWORD;
            C21850i k = this.f58966a.mo45965k();
            C13207b bVar3 = gVar.f34009h;
            C52711k.m112236a((Object) bVar3, "it.userInfo");
            aVar.mo45904a(bVar2, hVar, k, null, bVar3);
            C20975a.m53337a(13);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ch */
    public static final class C21763ch<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58967a;

        public C21763ch(C21829b bVar) {
            this.f58967a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C21674q.m54390a(false, "email", "reset_password", this.f58967a.mo45967m(), rVar.getErrorCode());
                C21674q.f58706a.mo45931a(false, rVar.getErrorCode(), "email", (C21841f) this.f58967a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ci */
    static final class C21764ci<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58968a;

        /* renamed from: b */
        final /* synthetic */ String f58969b;

        /* renamed from: c */
        final /* synthetic */ int f58970c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ci$a */
        public static final class C21765a extends C13143t {

            /* renamed from: a */
            final /* synthetic */ C21764ci f58971a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58972b;

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                this.f58972b.mo6303a(hVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                C2195p pVar = this.f58972b;
                C21675r rVar = new C21675r(hVar.f34000c, hVar.f34001d, this.f58971a.f58968a.mo45970p(), this.f58971a.f58968a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21765a(C21764ci ciVar, C2195p pVar) {
                this.f58971a = ciVar;
                this.f58972b = pVar;
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                String str;
                C12996h hVar = (C12996h) bVar;
                C2195p pVar = this.f58972b;
                if (hVar != null) {
                    str = hVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i, str, this.f58971a.f58968a.mo45970p(), this.f58971a.f58968a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12996h hVar = (C12996h) bVar;
                C52711k.m112240b(hVar, "response");
                C2195p pVar = this.f58972b;
                C21675r rVar = new C21675r(hVar.f34000c, hVar.f34001d, this.f58971a.f58968a.mo45970p(), this.f58971a.f58968a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        C21764ci(C21829b bVar, String str, int i) {
            this.f58968a = bVar;
            this.f58969b = str;
            this.f58970c = i;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12996h> pVar) {
            C52711k.m112240b(pVar, "it");
            C21765a aVar = new C21765a(this, pVar);
            this.f58968a.mo45962a((C12989a<T>) aVar);
            this.f58968a.mo45969o().mo24607a(this.f58969b, this.f58970c, true, 0, (String) null, (C13143t) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cj */
    static final class C21766cj<T> implements C1710e<C12996h> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58973a;

        C21766cj(C21829b bVar) {
            this.f58973a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12996h hVar = (C12996h) obj;
            C21674q.m54389a(true, this.f58973a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$ck */
    static final class C21767ck<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58974a;

        C21767ck(C21829b bVar) {
            this.f58974a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Throwable) obj) instanceof C21675r) {
                C21674q.m54389a(false, this.f58974a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cl */
    static final class C21768cl<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58975a;

        /* renamed from: b */
        final /* synthetic */ String f58976b;

        /* renamed from: c */
        final /* synthetic */ int f58977c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cl$a */
        public static final class C21769a extends C21670n {

            /* renamed from: a */
            final /* synthetic */ C21768cl f58978a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58979b;

            public final void onSuccess(C12993e<C21671o> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58979b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58979b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58978a.f58975a.mo45970p(), this.f58978a.f58975a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21769a(C21768cl clVar, C2195p pVar) {
                this.f58978a = clVar;
                this.f58979b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58979b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58978a.f58975a.mo45970p(), this.f58978a.f58975a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onError(C12993e<C21671o> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C2195p pVar = this.f58979b;
                if (eVar != null) {
                    i2 = eVar.f34000c;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21848h p = this.f58978a.f58975a.mo45970p();
                C21850i k = this.f58978a.f58975a.mo45965k();
                if (eVar != null) {
                    C21671o oVar = (C21671o) eVar.f34007h;
                    if (oVar != null) {
                        JSONObject jSONObject2 = oVar.f34279l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            C21675r rVar = new C21675r(i2, str, p, k, jSONObject, null, 32, null);
                            pVar.mo6304a((Throwable) rVar);
                        }
                    }
                }
                jSONObject = null;
                C21675r rVar2 = new C21675r(i2, str, p, k, jSONObject, null, 32, null);
                pVar.mo6304a((Throwable) rVar2);
            }
        }

        C21768cl(C21829b bVar, String str, int i) {
            this.f58975a = bVar;
            this.f58976b = str;
            this.f58977c = i;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C21671o>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21769a aVar = new C21769a(this, pVar);
            this.f58975a.mo45962a((C12989a<T>) aVar);
            C21673a aVar2 = C21672p.f58704e;
            Context context = this.f58975a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            aVar2.mo45928a(context, this.f58976b, this.f58977c, aVar).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cm */
    public static final class C21770cm<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58980a;

        /* renamed from: b */
        final /* synthetic */ C21848h f58981b;

        /* renamed from: c */
        final /* synthetic */ C21850i f58982c;

        /* renamed from: d */
        final /* synthetic */ String f58983d;

        /* renamed from: e */
        final /* synthetic */ String f58984e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cm$a */
        public static final class C21771a extends C13130g {

            /* renamed from: a */
            final /* synthetic */ C21770cm f58985a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58986b;

            public final void onSuccess(C12993e<C13108g> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58986b.mo6303a(eVar.f34007h);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58986b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58985a.f58981b, this.f58985a.f58982c, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21771a(C21770cm cmVar, C2195p pVar) {
                this.f58985a = cmVar;
                this.f58986b = pVar;
            }

            public final void onError(C12993e<C13108g> eVar, int i) {
                String str;
                JSONObject jSONObject;
                C2195p pVar = this.f58986b;
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21848h hVar = this.f58985a.f58981b;
                C21850i iVar = this.f58985a.f58982c;
                if (eVar != null) {
                    C13108g gVar = (C13108g) eVar.f34007h;
                    if (gVar != null) {
                        JSONObject jSONObject2 = gVar.f34279l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            C21675r rVar = new C21675r(i, str, hVar, iVar, jSONObject, null, 32, null);
                            pVar.mo6304a((Throwable) rVar);
                        }
                    }
                }
                jSONObject = null;
                C21675r rVar2 = new C21675r(i, str, hVar, iVar, jSONObject, null, 32, null);
                pVar.mo6304a((Throwable) rVar2);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58986b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58985a.f58981b, this.f58985a.f58982c, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21770cm(C21829b bVar, C21848h hVar, C21850i iVar, String str, String str2) {
            this.f58980a = bVar;
            this.f58981b = hVar;
            this.f58982c = iVar;
            this.f58983d = str;
            this.f58984e = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13108g> pVar) {
            C52711k.m112240b(pVar, "it");
            C21674q.f58706a.mo45930a(Boolean.valueOf(true), "email", (C21841f) this.f58980a, false);
            C21771a aVar = new C21771a(this, pVar);
            this.f58980a.mo45962a((C12989a<T>) aVar);
            this.f58980a.mo45969o().mo24616a(this.f58983d, this.f58984e, 1, (Map) null, (String) null, (C13130g) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$cn */
    public static final class C21772cn<T> implements C1710e<C13108g> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58987a;

        public C21772cn(C21829b bVar) {
            this.f58987a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13108g gVar = (C13108g) obj;
            C22093d.f59607b.mo46194a(0, 0, "");
            C21674q.m54385a(0, "register", this.f58987a.mo45967m());
            C21841f fVar = this.f58987a;
            C13207b bVar = gVar.f34263f;
            C52711k.m112236a((Object) bVar, "it.mUserInfo");
            C21674q.f58706a.mo45932a(true, "email", fVar, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$co */
    public static final class C21773co<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58988a;

        public C21773co(C21829b bVar) {
            this.f58988a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22093d.f59607b.mo46194a(1, rVar.getErrorCode(), rVar.getErrorMsg());
                C21674q.m54385a(rVar.getErrorCode(), "register", this.f58988a.mo45967m());
                C21674q.f58706a.mo45931a(true, rVar.getErrorCode(), "email", (C21841f) this.f58988a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$d */
    public static final class C21774d<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58989a;

        /* renamed from: b */
        final /* synthetic */ C21848h f58990b;

        /* renamed from: c */
        final /* synthetic */ C21850i f58991c;

        /* renamed from: d */
        final /* synthetic */ boolean f58992d;

        /* renamed from: e */
        final /* synthetic */ String f58993e;

        /* renamed from: f */
        final /* synthetic */ String f58994f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$d$a */
        public static final class C21775a extends C13125b {

            /* renamed from: a */
            final /* synthetic */ C21774d f58995a;

            /* renamed from: b */
            final /* synthetic */ C2195p f58996b;

            public final void onSuccess(C12993e<C13103b> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f58996b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58996b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58995a.f58990b, this.f58995a.f58991c, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21775a(C21774d dVar, C2195p pVar) {
                this.f58995a = dVar;
                this.f58996b = pVar;
            }

            public final void onError(C12993e<C13103b> eVar, int i) {
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58996b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58995a.f58990b, this.f58995a.f58991c, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f58996b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f58995a.f58990b, this.f58995a.f58991c, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21774d(C21829b bVar, C21848h hVar, C21850i iVar, boolean z, String str, String str2) {
            this.f58989a = bVar;
            this.f58990b = hVar;
            this.f58991c = iVar;
            this.f58992d = z;
            this.f58993e = str;
            this.f58994f = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13103b>> pVar) {
            C52711k.m112240b(pVar, "it");
            C20915c.m53261b(this.f58989a.mo45966l(), "mobile");
            C21775a aVar = new C21775a(this, pVar);
            this.f58989a.mo45962a((C12989a<T>) aVar);
            if (this.f58992d) {
                C21638a aVar2 = C21637a.f58652e;
                Context context = this.f58989a.getContext();
                if (context == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) context, "fragment.context!!");
                aVar2.mo45903a(context, this.f58993e, this.f58994f, "", "", 0, aVar).mo24766d();
                return;
            }
            this.f58989a.mo45969o().mo24623a(this.f58993e, this.f58994f, "", 0, (C13125b) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$e */
    public static final class C21776e<T> implements C1710e<C12993e<C13103b>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58997a;

        /* renamed from: b */
        final /* synthetic */ String f58998b;

        public C21776e(C21829b bVar, String str) {
            this.f58997a = bVar;
            this.f58998b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22091c.f59605d.mo46192a(0, "bindPhone", 0, "");
            C21811v.m54456a(true, this.f58997a.mo45966l(), "first_bind_phone_click");
            C20915c.m53260a(this.f58997a.mo45966l(), "mobile", 0, null, this.f58998b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$f */
    public static final class C21777f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f58999a;

        /* renamed from: b */
        final /* synthetic */ String f59000b;

        public C21777f(C21829b bVar, String str) {
            this.f58999a = bVar;
            this.f59000b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22091c.f59605d.mo46192a(1, "bindPhone", rVar.getErrorCode(), rVar.getErrorMsg());
                C21811v.m54456a(false, this.f58999a.mo45966l(), "first_bind_phone_click");
                C20915c.m53260a(this.f58999a.mo45966l(), "mobile", rVar.getErrorCode(), rVar.getErrorMsg(), this.f59000b);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$g */
    public static final class C21778g<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59001a;

        /* renamed from: b */
        final /* synthetic */ String f59002b;

        /* renamed from: c */
        final /* synthetic */ String f59003c;

        /* renamed from: d */
        final /* synthetic */ String f59004d;

        /* renamed from: e */
        final /* synthetic */ boolean f59005e;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$g$a */
        public static final class C21779a extends C21666k {

            /* renamed from: a */
            final /* synthetic */ C21778g f59006a;

            /* renamed from: b */
            final /* synthetic */ C2195p f59007b;

            public final void onSuccess(C12993e<C21667l> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f59007b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59007b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59006a.f59001a.mo45970p(), this.f59006a.f59001a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21779a(C21778g gVar, C2195p pVar) {
                this.f59006a = gVar;
                this.f59007b = pVar;
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59007b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59006a.f59001a.mo45970p(), this.f59006a.f59001a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onError(C12993e<C21667l> eVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C2195p pVar = this.f59007b;
                if (eVar != null) {
                    i2 = eVar.f34000c;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21848h p = this.f59006a.f59001a.mo45970p();
                C21850i k = this.f59006a.f59001a.mo45965k();
                if (eVar != null) {
                    C21667l lVar = (C21667l) eVar.f34007h;
                    if (lVar != null) {
                        JSONObject jSONObject2 = lVar.f34279l;
                        if (jSONObject2 != null) {
                            jSONObject = jSONObject2.getJSONObject("data");
                            C21675r rVar = new C21675r(i2, str, p, k, jSONObject, null, 32, null);
                            pVar.mo6304a((Throwable) rVar);
                        }
                    }
                }
                jSONObject = null;
                C21675r rVar2 = new C21675r(i2, str, p, k, jSONObject, null, 32, null);
                pVar.mo6304a((Throwable) rVar2);
            }
        }

        public C21778g(C21829b bVar, String str, String str2, String str3, boolean z) {
            this.f59001a = bVar;
            this.f59002b = str;
            this.f59003c = str2;
            this.f59004d = str3;
            this.f59005e = z;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C21667l>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21779a aVar = new C21779a(this, pVar);
            this.f59001a.mo45962a((C12989a<T>) aVar);
            C21669a aVar2 = C21668m.f58700e;
            Context context = this.f59001a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            aVar2.mo45924a(context, this.f59002b, this.f59003c, this.f59004d, this.f59005e, aVar).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$h */
    public static final class C21780h<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f59008a;

        /* renamed from: b */
        final /* synthetic */ C21850i f59009b;

        /* renamed from: c */
        final /* synthetic */ C21829b f59010c;

        /* renamed from: d */
        final /* synthetic */ String f59011d;

        /* renamed from: e */
        final /* synthetic */ String f59012e;

        /* renamed from: f */
        final /* synthetic */ String f59013f;

        /* renamed from: g */
        final /* synthetic */ C0777a f59014g;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$h$a */
        public static final class C21781a extends C13126c {

            /* renamed from: a */
            final /* synthetic */ C21780h f59015a;

            /* renamed from: b */
            final /* synthetic */ C2195p f59016b;

            public final void onSuccess(C12993e<C13104c> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f59016b.mo6303a(eVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59016b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59015a.f59008a, this.f59015a.f59009b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21781a(C21780h hVar, C2195p pVar) {
                this.f59015a = hVar;
                this.f59016b = pVar;
            }

            public final void onError(C12993e<C13104c> eVar, int i) {
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59016b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59015a.f59008a, this.f59015a.f59009b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59016b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59015a.f59008a, this.f59015a.f59009b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21780h(C21848h hVar, C21850i iVar, C21829b bVar, String str, String str2, String str3, C0777a aVar) {
            this.f59008a = hVar;
            this.f59009b = iVar;
            this.f59010c = bVar;
            this.f59011d = str;
            this.f59012e = str2;
            this.f59013f = str3;
            this.f59014g = aVar;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13104c>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21781a aVar = new C21781a(this, pVar);
            this.f59010c.mo45962a((C12989a<T>) aVar);
            this.f59010c.mo45969o().mo24638a(this.f59011d, this.f59012e, "", this.f59013f, (Map) this.f59014g, (C13126c) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$i */
    public static final class C21782i<T> implements C1710e<C12993e<C13104c>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59017a;

        public C21782i(C21829b bVar) {
            this.f59017a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C22091c.f59605d.mo46193b(0, "changePhone", 0, "");
            C21811v.m54456a(true, this.f59017a.mo45966l(), "rebind_phone_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$j */
    public static final class C21783j<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59018a;

        public C21783j(C21829b bVar) {
            this.f59018a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C22091c.f59605d.mo46193b(1, "changePhone", rVar.getErrorCode(), rVar.getErrorMsg());
                C21811v.m54456a(false, this.f59018a.mo45966l(), "rebind_phone_click");
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$k */
    public static final class C21784k<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59019a;

        /* renamed from: b */
        final /* synthetic */ String f59020b;

        /* renamed from: c */
        final /* synthetic */ String f59021c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$k$a */
        public static final class C21785a extends C21664i {

            /* renamed from: a */
            final /* synthetic */ C21784k f59022a;

            /* renamed from: b */
            final /* synthetic */ C2195p f59023b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                super.onNeedSecureCaptcha(eVar);
                C2195p pVar = this.f59023b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59022a.f59019a.mo45970p(), this.f59022a.f59019a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C21665j> eVar) {
                String str;
                C52711k.m112240b(eVar, "response");
                C21665j jVar = (C21665j) eVar.f34007h;
                if (jVar != null) {
                    str = jVar.f58696b;
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f59023b.mo6303a(eVar);
                } else {
                    this.f59023b.mo6304a((Throwable) C21676a.m54395a(this.f59022a.f59019a.mo45970p(), this.f59022a.f59019a.mo45965k()));
                }
            }

            C21785a(C21784k kVar, C2195p pVar) {
                this.f59022a = kVar;
                this.f59023b = pVar;
            }

            public final void onError(C12993e<C21665j> eVar, int i) {
                String str;
                C2195p pVar = this.f59023b;
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i, str, this.f59022a.f59019a.mo45970p(), this.f59022a.f59019a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                super.onNeedCaptcha(eVar, str);
                C2195p pVar = this.f59023b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59022a.f59019a.mo45970p(), this.f59022a.f59019a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21784k(C21829b bVar, String str, String str2) {
            this.f59019a = bVar;
            this.f59020b = str;
            this.f59021c = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C21665j>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21785a aVar = new C21785a(this, pVar);
            this.f59019a.mo45962a((C12989a<T>) aVar);
            C21663a aVar2 = C21662h.f58693e;
            Context context = this.f59019a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            aVar2.mo45920a(context, this.f59020b, this.f59021c, aVar).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$l */
    public static final class C21786l<T> implements C1710e<C12993e<C21665j>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59024a;

        public C21786l(C21829b bVar) {
            this.f59024a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21674q.m54390a(true, "email", this.f59024a.mo45966l(), this.f59024a.mo45967m(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$m */
    public static final class C21787m<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59025a;

        public C21787m(C21829b bVar) {
            this.f59025a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C21674q.m54390a(false, "email", this.f59025a.mo45966l(), this.f59025a.mo45967m(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$n */
    public static final class C21788n<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59026a;

        /* renamed from: b */
        final /* synthetic */ String f59027b;

        /* renamed from: c */
        final /* synthetic */ String f59028c;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$n$a */
        public static final class C21789a extends C13127d {

            /* renamed from: a */
            final /* synthetic */ C21788n f59029a;

            /* renamed from: b */
            final /* synthetic */ C2195p f59030b;

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                super.onNeedSecureCaptcha(eVar);
                C2195p pVar = this.f59030b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59029a.f59026a.mo45970p(), this.f59029a.f59026a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final void onSuccess(C12993e<C13105d> eVar) {
                String str;
                C52711k.m112240b(eVar, "response");
                C13105d dVar = (C13105d) eVar.f34007h;
                if (dVar != null) {
                    str = dVar.f34247b;
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f59030b.mo6303a(eVar);
                } else {
                    this.f59030b.mo6304a((Throwable) C21676a.m54395a(this.f59029a.f59026a.mo45970p(), this.f59029a.f59026a.mo45965k()));
                }
            }

            C21789a(C21788n nVar, C2195p pVar) {
                this.f59029a = nVar;
                this.f59030b = pVar;
            }

            public final void onError(C12993e<C13105d> eVar, int i) {
                String str;
                C2195p pVar = this.f59030b;
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i, str, this.f59029a.f59026a.mo45970p(), this.f59029a.f59026a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                super.onNeedCaptcha(eVar, str);
                C2195p pVar = this.f59030b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59029a.f59026a.mo45970p(), this.f59029a.f59026a.mo45965k(), null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21788n(C21829b bVar, String str, String str2) {
            this.f59026a = bVar;
            this.f59027b = str;
            this.f59028c = str2;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C12993e<C13105d>> pVar) {
            C52711k.m112240b(pVar, "it");
            C21789a aVar = new C21789a(this, pVar);
            this.f59026a.mo45962a((C12989a<T>) aVar);
            C21813a aVar2 = C21812w.f59075e;
            Context context = this.f59026a.getContext();
            if (context == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) context, "fragment.context!!");
            aVar2.mo45946a(context, this.f59027b, this.f59028c, "", aVar).mo24766d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$o */
    public static final class C21790o<T> implements C1710e<C12993e<C13105d>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59031a;

        public C21790o(C21829b bVar) {
            this.f59031a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            C21674q.m54390a(true, "phone", this.f59031a.mo45966l(), this.f59031a.mo45967m(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$p */
    public static final class C21791p<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59032a;

        public C21791p(C21829b bVar) {
            this.f59032a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C21674q.m54390a(false, "phone", this.f59032a.mo45966l(), this.f59032a.mo45967m(), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$q */
    public static final class C21792q<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f59033a;

        /* renamed from: b */
        final /* synthetic */ C21850i f59034b;

        /* renamed from: c */
        final /* synthetic */ C21829b f59035c;

        /* renamed from: d */
        final /* synthetic */ String f59036d;

        /* renamed from: e */
        final /* synthetic */ String f59037e;

        /* renamed from: f */
        final /* synthetic */ int f59038f;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$q$a */
        public static final class C21793a extends C13000a {

            /* renamed from: a */
            final /* synthetic */ C21792q f59039a;

            /* renamed from: b */
            final /* synthetic */ C2195p f59040b;

            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13012a aVar = (C13012a) bVar;
                C52711k.m112240b(aVar, "response");
                this.f59040b.mo6303a(aVar);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C13012a aVar = (C13012a) bVar;
                C52711k.m112240b(aVar, "response");
                C2195p pVar = this.f59040b;
                C21675r rVar = new C21675r(aVar.f34000c, aVar.f34001d, this.f59039a.f59033a, this.f59039a.f59034b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21793a(C21792q qVar, C2195p pVar) {
                this.f59039a = qVar;
                this.f59040b = pVar;
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                String str;
                C13012a aVar = (C13012a) bVar;
                C2195p pVar = this.f59040b;
                if (aVar != null) {
                    str = aVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i, str, this.f59039a.f59033a, this.f59039a.f59034b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C13012a aVar = (C13012a) bVar;
                C52711k.m112240b(aVar, "response");
                C2195p pVar = this.f59040b;
                C21675r rVar = new C21675r(aVar.f34000c, aVar.f34001d, this.f59039a.f59033a, this.f59039a.f59034b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21792q(C21848h hVar, C21850i iVar, C21829b bVar, String str, String str2, int i) {
            this.f59033a = hVar;
            this.f59034b = iVar;
            this.f59035c = bVar;
            this.f59036d = str;
            this.f59037e = str2;
            this.f59038f = i;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13012a> pVar) {
            C52711k.m112240b(pVar, "it");
            C21793a aVar = new C21793a(this, pVar);
            this.f59035c.mo45962a((C12989a<T>) aVar);
            this.f59035c.mo45969o().mo24613a(this.f59036d, this.f59037e, this.f59038f, (C13000a) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$r */
    public static final class C21794r<T> implements C1710e<C13012a> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59041a;

        public C21794r(C21829b bVar) {
            this.f59041a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C13012a aVar = (C13012a) obj;
            C21674q.m54389a(true, this.f59041a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$s */
    public static final class C21795s<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59042a;

        public C21795s(C21829b bVar) {
            this.f59042a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Throwable) obj) instanceof C21675r) {
                C21674q.m54389a(false, this.f59042a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$t */
    public static final class C21796t<T> implements C2197r<T> {

        /* renamed from: a */
        final /* synthetic */ C21848h f59043a;

        /* renamed from: b */
        final /* synthetic */ C21850i f59044b;

        /* renamed from: c */
        final /* synthetic */ C21829b f59045c;

        /* renamed from: d */
        final /* synthetic */ String f59046d;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$t$a */
        public static final class C21797a extends C13128e {

            /* renamed from: a */
            final /* synthetic */ C21796t f59047a;

            /* renamed from: b */
            final /* synthetic */ C2195p f59048b;

            public final void onSuccess(C12993e<C13106e> eVar) {
                C52711k.m112240b(eVar, "response");
                this.f59048b.mo6303a(eVar.f34007h);
            }

            public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59048b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59047a.f59043a, this.f59047a.f59044b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            C21797a(C21796t tVar, C2195p pVar) {
                this.f59047a = tVar;
                this.f59048b = pVar;
            }

            public final void onError(C12993e<C13106e> eVar, int i) {
                int i2;
                String str;
                C2195p pVar = this.f59048b;
                if (eVar != null) {
                    i2 = eVar.f34000c;
                } else {
                    i2 = -10000;
                }
                if (eVar != null) {
                    str = eVar.f34001d;
                } else {
                    str = null;
                }
                C21675r rVar = new C21675r(i2, str, this.f59047a.f59043a, this.f59047a.f59044b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }

            public final /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                C12993e eVar = (C12993e) bVar;
                C52711k.m112240b(eVar, "response");
                C2195p pVar = this.f59048b;
                C21675r rVar = new C21675r(eVar.f34000c, eVar.f34001d, this.f59047a.f59043a, this.f59047a.f59044b, null, null, 32, null);
                pVar.mo6304a((Throwable) rVar);
            }
        }

        public C21796t(C21848h hVar, C21850i iVar, C21829b bVar, String str) {
            this.f59043a = hVar;
            this.f59044b = iVar;
            this.f59045c = bVar;
            this.f59046d = str;
        }

        /* renamed from: a */
        public final void mo6498a(C2195p<C13106e> pVar) {
            C52711k.m112240b(pVar, "emitter");
            C21797a aVar = new C21797a(this, pVar);
            this.f59045c.mo45962a((C12989a<T>) aVar);
            this.f59045c.mo45969o().mo24641a(this.f59046d, C52550ab.m112045a(), "", (C13128e) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$u */
    public static final class C21798u<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59049a;

        public C21798u(C21829b bVar) {
            this.f59049a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C21675r rVar = (C21675r) th;
                C21888a.m54609a(Integer.valueOf(rVar.getErrorCode()), this.f59049a.mo45967m());
                C22094a aVar = C22093d.f59607b;
                int errorCode = rVar.getErrorCode();
                StringBuilder sb = new StringBuilder("CheckEmail:");
                sb.append(rVar.getErrorMsg());
                aVar.mo46194a(1, errorCode, sb.toString());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$v */
    static final class C21799v<T, R> implements C1711f<String, C53694b<C21657d>> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59050a;

        C21799v(C21829b bVar) {
            this.f59050a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C52711k.m112240b(str, "response");
            return new C53694b<C21657d>(this) {

                /* renamed from: a */
                final /* synthetic */ C21799v f59051a;

                {
                    this.f59051a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo336a(org.p2692b.C53695c<? super com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21657d> r12) {
                    /*
                        r11 = this;
                        com.ss.android.ugc.aweme.account.network.NetworkProxyAccount r0 = com.p683ss.android.ugc.aweme.account.network.NetworkProxyAccount.f59579c
                        com.google.gson.f r0 = r0.mo46183a()
                        java.lang.String r1 = r2
                        java.lang.Class<com.ss.android.ugc.aweme.account.login.v2.a.d> r2 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21657d.class
                        java.lang.Object r0 = r0.mo34884a(r1, r2)
                        com.ss.android.ugc.aweme.account.login.v2.a.d r0 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21657d) r0
                        java.lang.String r1 = r0.f58687a
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        java.lang.String r2 = "success"
                        java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                        boolean r1 = android.text.TextUtils.equals(r1, r2)
                        if (r1 == 0) goto L_0x0022
                        r12.onNext(r0)
                        goto L_0x0056
                    L_0x0022:
                        com.ss.android.ugc.aweme.account.login.v2.a.r r1 = new com.ss.android.ugc.aweme.account.login.v2.a.r
                        com.ss.android.ugc.aweme.account.login.v2.a.c r2 = r0.f58688b
                        if (r2 == 0) goto L_0x0032
                        java.lang.Integer r2 = r2.f58684a
                        if (r2 == 0) goto L_0x0032
                        int r2 = r2.intValue()
                        r3 = r2
                        goto L_0x0034
                    L_0x0032:
                        r2 = -1
                        r3 = -1
                    L_0x0034:
                        com.ss.android.ugc.aweme.account.login.v2.a.c r0 = r0.f58688b
                        if (r0 == 0) goto L_0x003c
                        java.lang.String r0 = r0.f58685b
                    L_0x003a:
                        r4 = r0
                        goto L_0x003e
                    L_0x003c:
                        r0 = 0
                        goto L_0x003a
                    L_0x003e:
                        com.ss.android.ugc.aweme.account.login.v2.base.h r5 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.SIGN_UP
                        com.ss.android.ugc.aweme.account.login.v2.a.s$v r0 = r11.f59051a
                        com.ss.android.ugc.aweme.account.login.v2.base.b r0 = r0.f59050a
                        com.ss.android.ugc.aweme.account.login.v2.base.i r6 = r0.mo45965k()
                        r7 = 0
                        r8 = 0
                        r9 = 32
                        r10 = 0
                        r2 = r1
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        r12.onError(r1)
                    L_0x0056:
                        r12.onComplete()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21799v.C218001.mo336a(org.b.c):void");
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$w */
    static final class C21801w<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59053a;

        /* renamed from: b */
        final /* synthetic */ String f59054b;

        /* renamed from: c */
        final /* synthetic */ String f59055c;

        /* renamed from: d */
        final /* synthetic */ String f59056d;

        C21801w(C21829b bVar, String str, String str2, String str3) {
            this.f59053a = bVar;
            this.f59054b = str;
            this.f59055c = str2;
            this.f59056d = str3;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            Throwable th = (Throwable) obj;
            String str2 = "set_username_response";
            C20856a a = new C20856a().mo44776a("enter_from", this.f59053a.mo45966l()).mo44776a("enter_method", this.f59053a.mo45967m()).mo44776a("platform", this.f59054b).mo44774a("is_success", 0);
            String str3 = "error_code";
            boolean z = th instanceof C21675r;
            if (z) {
                i = ((C21675r) th).getErrorCode();
            } else {
                i = -1;
            }
            C20856a a2 = a.mo44774a(str3, i);
            String str4 = "error_desc";
            if (!z) {
                str = th.getMessage();
            } else {
                str = "";
            }
            C26890h.m65011a(str2, a2.mo44776a(str4, str).mo44776a("origin_username", this.f59055c).mo44776a("result_username", this.f59056d).f56798a);
            if (z) {
                C21675r rVar = (C21675r) th;
                if (rVar.getErrorCode() == 4) {
                    FragmentActivity activity = this.f59053a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    C21829b bVar = this.f59053a;
                    int errorCode = rVar.getErrorCode();
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C21639a.m54351a(bVar, errorCode, message, rVar.getScene(), rVar.getStep(), rVar.getExtra());
                }
            } else {
                C21829b bVar2 = this.f59053a;
                String string = this.f59053a.getString(R.string.cg1);
                C52711k.m112236a((Object) string, "fragment.getString(R.string.network_unavailable)");
                bVar2.mo45582a(0, string);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$x */
    static final class C21802x<T> implements C1710e<C21657d> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59057a;

        /* renamed from: b */
        final /* synthetic */ String f59058b;

        /* renamed from: c */
        final /* synthetic */ String f59059c;

        /* renamed from: d */
        final /* synthetic */ String f59060d;

        C21802x(C21829b bVar, String str, String str2, String str3) {
            this.f59057a = bVar;
            this.f59058b = str;
            this.f59059c = str2;
            this.f59060d = str3;
        }

        public final /* synthetic */ void accept(Object obj) {
            C21657d dVar = (C21657d) obj;
            C26890h.m65011a("set_username_response", new C20856a().mo44776a("enter_from", this.f59057a.mo45966l()).mo44776a("enter_method", this.f59057a.mo45967m()).mo44776a("platform", this.f59058b).mo44774a("is_success", 1).mo44776a("origin_username", this.f59059c).mo44776a("result_username", this.f59060d).f56798a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$y */
    static final class C21803y implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C21829b f59061a;

        C21803y(C21829b bVar) {
            this.f59061a = bVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f59061a.mo45963b(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$z */
    static final class C21804z<T> implements C1710e<C53696d> {

        /* renamed from: a */
        final /* synthetic */ C21829b f59062a;

        C21804z(C21829b bVar) {
            this.f59062a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C53696d dVar = (C53696d) obj;
            this.f59062a.mo45963b(1);
        }
    }

    private C21677s() {
    }

    /* renamed from: a */
    public static C2193n<C12993e<C13121t>> m54408a(C21829b bVar, String str, String str2, String str3) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "account");
        C52711k.m112240b(str2, "pwd");
        C52711k.m112240b(str3, "type");
        C2193n a = C2193n.m6558a((C2197r<T>) new C21694aj<T>(str3, bVar, str2, str)).mo6496c((C1710e<? super T>) new C21696ak<Object>(str3, bVar, str)).mo6486a((C1710e<? super Throwable>) new C21697al<Object>(str3, bVar));
        C52711k.m112236a((Object) a, "Maybe.create(MaybeOnSubs…type, fragment)\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: a */
    public static C2193n<C12993e<C13114m>> m54407a(C21829b bVar, String str, String str2, C21848h hVar, C21850i iVar) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "phoneNumber");
        C52711k.m112240b(str2, "smsCodeKey");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        boolean z = hVar == C21848h.SIGN_UP;
        C21702ap apVar = new C21702ap(z, bVar, hVar, iVar, str, str2);
        C2193n c = C2193n.m6558a((C2197r<T>) apVar).mo6486a((C1710e<? super Throwable>) new C21704aq<Object>(z, bVar)).mo6496c((C1710e<? super T>) new C21705ar<Object>(z, bVar));
        C52711k.m112236a((Object) c, "Maybe.create<MobileApiRe…eObj.mUserInfo)\n        }");
        return C21806u.m54453a(bVar, c);
    }

    /* renamed from: a */
    public final C2193n<C12993e<C13120s>> mo45942a(C21829b bVar, String str, C21848h hVar, C21850i iVar, String str2, String str3, String str4) {
        C21829b bVar2 = bVar;
        String str5 = str;
        String str6 = str3;
        C52711k.m112240b(bVar2, "fragment");
        C52711k.m112240b(str5, "phoneNumber");
        C21848h hVar2 = hVar;
        C52711k.m112240b(hVar2, "scene");
        C52711k.m112240b(iVar, "step");
        String str7 = str2;
        C52711k.m112240b(str7, "ticket");
        C52711k.m112240b(str6, "sendMethod");
        int a = m54396a(hVar);
        int a2 = m54397a(iVar);
        String str8 = str;
        C21735bn bnVar = new C21735bn(str3, a2, bVar, hVar2, iVar, str8, str7, a);
        C2193n a3 = C2193n.m6558a((C2197r<T>) bnVar);
        String str9 = str4;
        C21737bo boVar = new C21737bo(a2, str9, iVar, bVar, str3, str8);
        C2193n c = a3.mo6486a((C1710e<? super Throwable>) boVar).mo6496c((C1710e<? super T>) new C21738bp<Object>(a2, str9, str6, str5));
        C52711k.m112236a((Object) c, "Maybe.create<MobileApiRe…l, phoneNumber)\n        }");
        return C21806u.m54453a(bVar2, c);
    }

    /* renamed from: a */
    public final C2193n<C12993e<C13120s>> mo45941a(C21829b bVar, String str, C21848h hVar, C21850i iVar, String str2, String str3) {
        C21829b bVar2 = bVar;
        String str4 = str;
        String str5 = str2;
        C52711k.m112240b(bVar2, "fragment");
        C52711k.m112240b(str4, "phoneNumber");
        C21848h hVar2 = hVar;
        C52711k.m112240b(hVar2, "scene");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(str5, "sendMethod");
        String str6 = str3;
        C52711k.m112240b(str6, "ticket");
        int a = m54396a(hVar);
        int a2 = m54397a(iVar);
        C21829b bVar3 = bVar;
        C21751bz bzVar = new C21751bz(str2, a2, bVar3, str, str6, a, hVar2, iVar);
        C2193n a3 = C2193n.m6558a((C2197r<T>) bzVar);
        C21754ca caVar = new C21754ca(a2, iVar, bVar3, str2, str);
        C2193n c = a3.mo6486a((C1710e<? super Throwable>) caVar).mo6496c((C1710e<? super T>) new C21755cb<Object>(a2, str5, str4));
        C52711k.m112236a((Object) c, "Maybe.create<MobileApiRe…l, phoneNumber)\n        }");
        return C21806u.m54453a(bVar2, c);
    }

    /* renamed from: a */
    public static C2193n<C12996h> m54404a(C21829b bVar, String str, int i) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "codes");
        C2193n a = C2193n.m6558a((C2197r<T>) new C21764ci<T>(bVar, str, i)).mo6496c((C1710e<? super T>) new C21766cj<Object>(bVar)).mo6486a((C1710e<? super Throwable>) new C21767ck<Object>(bVar));
        C52711k.m112236a((Object) a, "Maybe.create<ValidateCod…)\n            }\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: a */
    public final C2193n<C12993e<C13120s>> mo45940a(C21829b bVar, String str, C21848h hVar, C21850i iVar, String str2) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "phoneNumber");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(str2, "sendMethod");
        int a = m54397a(iVar);
        C21747bw bwVar = new C21747bw(a, str2, hVar, iVar, bVar, str);
        C2193n c = C2193n.m6558a((C2197r<T>) bwVar).mo6486a((C1710e<? super Throwable>) new C21749bx<Object>(a, str2, str)).mo6496c((C1710e<? super T>) new C21750by<Object>(a, str2, str, bVar));
        C52711k.m112236a((Object) c, "Maybe.create(MaybeOnSubs…)\n            }\n        }");
        return C21806u.m54453a(bVar, c);
    }

    /* renamed from: a */
    public static C2193n<C12993e<C13109h>> m54405a(C21829b bVar, String str, int i, String str2, HashMap<String, String> hashMap, String str3) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "email");
        C52711k.m112240b(str2, "sendMethod");
        C21727bh bhVar = new C21727bh(str2, bVar, str, str3, i, hashMap);
        C2193n c = C2193n.m6558a((C2197r<T>) bhVar).mo6486a((C1710e<? super Throwable>) new C21729bi<Object>(str2, i)).mo6496c((C1710e<? super T>) new C21730bj<Object>(str2, i));
        C52711k.m112236a((Object) c, "Maybe.create<MobileApiRe…l\", null, null)\n        }");
        return C21806u.m54453a(bVar, c);
    }

    /* renamed from: a */
    public final C2193n<C12993e<C13120s>> mo45943a(C21829b bVar, String str, C21850i iVar, String str2) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "phoneNumber");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(str2, "sendMethod");
        int a = m54397a(iVar);
        C21731bk bkVar = new C21731bk(str2, a, bVar, iVar, str);
        C2193n a2 = C2193n.m6558a((C2197r<T>) bkVar).mo6496c((C1710e<? super T>) new C21733bl<Object>(a, str2, str)).mo6486a((C1710e<? super Throwable>) new C21734bm<Object>(a, str2, str));
        C52711k.m112236a((Object) a2, "Maybe.create(MaybeOnSubs…g, phoneNumber)\n        }");
        return C21806u.m54453a(bVar, a2);
    }

    /* renamed from: a */
    public static C2193n<C21419c> m54406a(C21829b bVar, String str, C21848h hVar, C21850i iVar) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "ticket");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C2193n a = C2193n.m6558a((C2197r<T>) new C21692ai<T>(bVar, str, hVar, iVar));
        C52711k.m112236a((Object) a, "Maybe.create<SafeVerifyR…    }).start()\n\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: a */
    public static C2193n<C12993e<C13121t>> m54409a(C21829b bVar, String str, String str2, String str3, String str4) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "account");
        C52711k.m112240b(str2, "pwd");
        C52711k.m112240b(str3, "type");
        C21698am amVar = new C21698am(str3, bVar, str2, str, str4);
        C2193n a = C2193n.m6558a((C2197r<T>) amVar).mo6496c((C1710e<? super T>) new C21700an<Object>(bVar, str3)).mo6486a((C1710e<? super Throwable>) new C21701ao<Object>(str3, bVar));
        C52711k.m112236a((Object) a, "Maybe.create(MaybeOnSubs…type, fragment)\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: a */
    private static int m54396a(C21848h hVar) {
        switch (C21805t.f59065c[hVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public static int m54397a(C21850i iVar) {
        switch (C21805t.f59063a[iVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return C22165u.f59781u;
            case 4:
            case 5:
                return C22165u.f59764d;
            case 6:
                return C22165u.f59768h;
            case 7:
                return C22165u.f59786z;
            case 8:
                return C22165u.f59777q;
            case 9:
                return C22165u.f59773m;
            case 10:
            case 11:
                return C22165u.f59779s;
            default:
                return C22165u.f59781u;
        }
    }

    /* renamed from: a */
    public static C2193n<C12993e<C13163a>> m54403a(C21829b bVar, String str) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "pwd");
        C2193n a = C2193n.m6558a((C2197r<T>) new C21756cc<T>(bVar, str)).mo6496c((C1710e<? super T>) new C21758cd<Object>(bVar)).mo6486a((C1710e<? super Throwable>) new C21759ce<Object>(bVar));
        C52711k.m112236a((Object) a, "Maybe.create(MaybeOnSubs…ion).errorCode)\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: b */
    public static C2193n<C12993e<C21671o>> m54410b(C21829b bVar, String str, int i) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "codes");
        C2193n a = C2193n.m6558a((C2197r<T>) new C21768cl<T>(bVar, str, i));
        C52711k.m112236a((Object) a, "Maybe.create<MobileApiRe…llBack).start()\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: a */
    public static C2149h<C21657d> m54398a(C21829b bVar, Map<String, String> map, String str, String str2) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(map, "params");
        C52711k.m112240b(str, "platForm");
        C52711k.m112240b(str2, "originUsername");
        String str3 = (String) map.get("login_name");
        String str4 = "/passport/login_name/register/";
        C52711k.m112240b(str4, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(map, "params");
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C24095a.m58955l());
        sb.append(str4);
        C2149h b = C2149h.m6451a(new C18922i(sb.toString()).mo38774a()).mo6446a((C1711f<? super T, ? extends C53694b<? extends R>>) new C22074c<Object,Object>(map)).mo6452b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Flowable.just(UrlBuilder…scribeOn(Schedulers.io())");
        C2149h a = b.mo6446a((C1711f<? super T, ? extends C53694b<? extends R>>) new C21799v<Object,Object>(bVar)).mo6443a(C1667a.m5940a());
        C1710e wVar = new C21801w(bVar, str, str2, str3);
        C1710e b2 = C1723a.m6037b();
        C1706a aVar = C1723a.f5844c;
        C2149h a2 = a.mo6445a(b2, wVar, aVar, aVar).mo6444a((C1710e<? super T>) new C21802x<Object>(bVar, str, str2, str3));
        C1706a yVar = new C21803y(bVar);
        C1745b.m6050a(yVar, "onFinally is null");
        C2149h a3 = C2150a.m6483a((C2149h<T>) new C1808c<T>(a2, yVar));
        C1710e zVar = new C21804z(bVar);
        C1714i iVar = C1723a.f5848g;
        C1706a aVar2 = C1723a.f5844c;
        C1745b.m6050a(zVar, "onSubscribe is null");
        C1745b.m6050a(iVar, "onRequest is null");
        C1745b.m6050a(aVar2, "onCancel is null");
        C2149h<C21657d> a4 = C2150a.m6483a((C2149h<T>) new C1814e<T>(a3, zVar, iVar, aVar2));
        C52711k.m112236a((Object) a4, "NetworkProxyAccount.exec…MATIOM)\n                }");
        return a4;
    }

    /* renamed from: b */
    public static C2193n<C21417a> m54411b(C21829b bVar, String str, String str2, C21848h hVar, C21850i iVar) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "ticket");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C21690ah ahVar = new C21690ah(bVar, str, str2, hVar, iVar);
        C2193n a = C2193n.m6558a((C2197r<T>) ahVar);
        C52711k.m112236a((Object) a, "Maybe.create<AccountAvai…     }).start()\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: a */
    public static C2193n<C21418b> m54402a(C21829b bVar, C21416b bVar2, C21848h hVar, C21850i iVar, String str) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(bVar2, "obj");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(str, "platform");
        C21688ag agVar = new C21688ag(bVar, bVar2, hVar, iVar, str);
        C2193n a = C2193n.m6558a((C2197r<T>) agVar);
        C52711k.m112236a((Object) a, "Maybe.create<GetAccountT…    }).start()\n\n        }");
        return C21806u.m54453a(bVar, a);
    }

    /* renamed from: c */
    public final C2193n<C12993e<C13120s>> mo45945c(C21829b bVar, String str, C21848h hVar, C21850i iVar, String str2, String str3, String str4) {
        C21829b bVar2 = bVar;
        String str5 = str3;
        C52711k.m112240b(bVar, "fragment");
        C21848h hVar2 = hVar;
        C52711k.m112240b(hVar2, "scene");
        C52711k.m112240b(iVar, "step");
        String str6 = str2;
        C52711k.m112240b(str6, "ticket");
        C52711k.m112240b(str5, "sendMethod");
        int a = m54396a(hVar);
        int a2 = m54397a(iVar);
        C21739bq bqVar = new C21739bq(str3, a2, bVar, hVar2, iVar, str, str6, a);
        C2193n a3 = C2193n.m6558a((C2197r<T>) bqVar);
        String str7 = str4;
        C21741br brVar = new C21741br(a2, str7, iVar, bVar, str3);
        C2193n c = a3.mo6486a((C1710e<? super Throwable>) brVar).mo6496c((C1710e<? super T>) new C21742bs<Object>(a2, str7, str5));
        C52711k.m112236a((Object) c, "Maybe.create<MobileApiRe…t\", null, null)\n        }");
        return C21806u.m54453a(bVar, c);
    }

    /* renamed from: b */
    public final C2193n<C12993e<C13120s>> mo45944b(C21829b bVar, String str, C21848h hVar, C21850i iVar, String str2, String str3, String str4) {
        String str5;
        C21829b bVar2 = bVar;
        String str6 = str;
        String str7 = str4;
        C52711k.m112240b(bVar2, "fragment");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(str7, "sendMethod");
        int a = m54396a(hVar);
        int a2 = m54397a(iVar);
        switch (C21805t.f59066d[iVar.ordinal()]) {
            case 1:
                str5 = "first_bind_phone_click";
                break;
            case 2:
                str5 = "first_bind_phone_click";
                break;
            case 3:
                str5 = "change_bind_phone_click";
                break;
            case 4:
                str5 = "rebind_phone_click";
                break;
            case 5:
                str5 = "rebind_phone_click";
                break;
            default:
                str5 = "";
                break;
        }
        C21723be beVar = new C21723be(str4, a2, str5, bVar, hVar, iVar, str, str2, a, str3);
        C2193n c = C2193n.m6558a((C2197r<T>) beVar).mo6496c((C1710e<? super T>) new C21725bf<Object>(a2, str7, str6));
        C52711k.m112236a((Object) c, "Maybe.create<MobileApiRe…l, phoneNumber)\n        }");
        C2193n<C12993e<C13120s>> a3 = C21806u.m54453a(bVar2, c).mo6486a((C1710e<? super Throwable>) new C21726bg<Object>(a2, str7, str6));
        C52711k.m112236a((Object) a3, "request(fragment, Maybe.…g, phoneNumber)\n        }");
        return a3;
    }

    /* renamed from: a */
    public static /* synthetic */ C2193n m54399a(C21677s sVar, C21829b bVar, String str, int i, String str2, HashMap hashMap, String str3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            hashMap = null;
        }
        return m54405a(bVar, str, i, str2, hashMap, (String) null);
    }
}
