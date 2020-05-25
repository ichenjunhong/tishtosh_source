package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ak */
public final class C26384ak {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69604a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26384ak.class), "KEVA", "getKEVA()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C52668f f69605b = C52732g.m112285a(C26385a.f69608a);

    /* renamed from: c */
    public static boolean f69606c;

    /* renamed from: d */
    public static final C26384ak f69607d = new C26384ak();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ak$a */
    static final class C26385a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C26385a f69608a = new C26385a();

        C26385a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("keva_repo_ad_web_checker");
        }
    }

    private C26384ak() {
    }

    /* renamed from: b */
    private static void m63833b(String str) {
        if (str != null) {
            Context a = C11010c.m22280a();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n请反馈给lizijian@bytedance.com");
            C10691a.m21545b(a, sb.toString()).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo54106a(String str) {
        if (f69606c && str != null) {
            boolean z = false;
            if (C52830p.m112411b(str, "bytedance://", false, 2, null)) {
                StringBuilder sb = new StringBuilder("console.log");
                try {
                    Uri parse = Uri.parse(str);
                    C52711k.m112236a((Object) parse, "uri");
                    boolean z2 = true;
                    if (!(!C52711k.m112239a((Object) "log_event", (Object) parse.getHost()))) {
                        String queryParameter = parse.getQueryParameter("tag");
                        String queryParameter2 = parse.getQueryParameter("label");
                        if (queryParameter == null) {
                            sb.append("未设置tag,");
                            z = true;
                        }
                        if (queryParameter2 == null) {
                            sb.append("未设置label");
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            m63833b(sb.toString());
                        }
                    }
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder("console.log上报url不合法,错误：");
                    sb2.append(e.getMessage());
                    m63833b(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54105a(long j, String str) {
        boolean z;
        if (f69606c) {
            StringBuilder sb = new StringBuilder("adInfo方法");
            boolean z2 = false;
            if (j <= 0) {
                sb.append("adId未设置,");
                z = true;
            } else {
                z = false;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (z2) {
                sb.append("log_extra为空");
                z = true;
            }
            if (z) {
                m63833b(sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo54107b(long j, String str) {
        boolean z;
        if (f69606c) {
            boolean z2 = false;
            if (j > 0) {
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m63833b("ad_id已设置，但未注入toutiao-track-log.js");
                }
            }
            if (j <= 0 && str != null) {
                if (str.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    m63833b("toutiao-track-log.js已注入，但未设置ad_id");
                }
            }
        }
    }
}
