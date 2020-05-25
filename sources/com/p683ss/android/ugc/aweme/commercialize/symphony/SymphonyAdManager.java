package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p126ad.symphony.C2680b;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p127a.p128a.C2677d;
import com.bytedance.p126ad.symphony.p129b.C2699d;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.commercialize.symphony.p1578a.C26307a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26405aw;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.AggregationSdk;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lancet.C18995p;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager */
public class SymphonyAdManager implements C26306a {

    /* renamed from: c */
    private static volatile SymphonyAdManager f69376c;

    /* renamed from: a */
    public boolean f69377a;

    /* renamed from: b */
    public boolean f69378b;

    /* renamed from: d */
    private C2699d f69379d;

    /* renamed from: e */
    private Map<String, C2676c> f69380e = new HashMap();

    /* renamed from: f */
    private Map<String, C26307a> f69381f = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager$SymphonyAdApi */
    public interface SymphonyAdApi {
        @C12706h
        C17832m<String> doGet(@C12699af String str);
    }

    /* renamed from: a */
    public static SymphonyAdManager m63648a() {
        if (f69376c == null) {
            synchronized (SymphonyAdManager.class) {
                if (f69376c == null) {
                    f69376c = new SymphonyAdManager();
                }
            }
        }
        return f69376c;
    }

    private SymphonyAdManager() {
        boolean z = false;
        this.f69377a = false;
        Context a = C11010c.m22280a();
        if (a != null) {
            SharedPreferences a2 = C35807d.m80935a(a, "sp_symphony", 0);
            boolean z2 = a2.getBoolean("enable_symphony_sdk_setting", true);
            if (a2.getBoolean("enable_symphony_sdk_ab", true) && z2) {
                z = true;
            }
            this.f69378b = z;
            return;
        }
        C32458a.m75144a("SymphonyAdManager AwemeApplication.getGlobalContext null");
        C32458a.m75148a((Throwable) new C18995p());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2699d mo53955b(Context context) {
        if (this.f69379d == null) {
            this.f69379d = C2680b.m7710a().f8147d;
        }
        return this.f69379d;
    }

    /* renamed from: b */
    private static boolean m63650b(Aweme aweme) {
        if (aweme.isAd() && aweme.getAuthor() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C2676c mo53950a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return (C2676c) this.f69380e.get(aweme.getAid());
    }

    /* renamed from: a */
    public final String mo53951a(Context context) {
        if (!this.f69378b) {
            return "";
        }
        if (!this.f69377a) {
            return "";
        }
        String a = C26405aw.m63872a(mo53955b(context).mo7267a("tiktok_cold_start_app_open", true));
        if (TextUtils.isEmpty(a)) {
            a = "";
        }
        return a;
    }

    /* renamed from: c */
    private int m63651c(Context context, Aweme aweme) {
        return m63652c(context, aweme, null);
    }

    /* renamed from: a */
    public final boolean mo53953a(Context context, Aweme aweme) {
        if (m63651c(context, aweme) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m63649a(C26307a aVar, String str) {
        if (aVar != null && aVar.f69431b != null && aVar.f69431b.f8223a != null) {
            aVar.f69431b.f8223a.f8280d = str;
        }
    }

    /* renamed from: b */
    public final boolean mo53956b(Context context, Aweme aweme) {
        if (m63651c(context, aweme) == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x000e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53952a(android.content.Context r5, java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0051
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0051
            java.util.Iterator r6 = r6.iterator()
            r1 = r0
        L_0x000e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r6.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 != 0) goto L_0x001e
        L_0x001c:
            r2 = r0
            goto L_0x0043
        L_0x001e:
            java.lang.String r3 = r2.getAid()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            boolean r3 = r2.isAd()
            if (r3 != 0) goto L_0x0030
            goto L_0x001c
        L_0x0030:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.AggregationSdk r2 = r2.getAggregationSdk()
            if (r2 != 0) goto L_0x003b
            goto L_0x001c
        L_0x003b:
            org.json.JSONObject r2 = r2.getCommonData()
            com.bytedance.ad.symphony.e.a r2 = com.bytedance.p126ad.symphony.p134e.C2722a.m7781a(r2)
        L_0x0043:
            if (r2 == 0) goto L_0x000e
            if (r1 != 0) goto L_0x004c
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
        L_0x004c:
            r1.add(r2)
            goto L_0x000e
        L_0x0050:
            r0 = r1
        L_0x0051:
            com.bytedance.ad.symphony.b.d r5 = r4.mo53955b(r5)
            java.lang.String r6 = "tiktok_cold_start_app_open"
            r5.mo7268a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager.mo53952a(android.content.Context, java.util.List):void");
    }

    /* renamed from: b */
    public final boolean mo53957b(Context context, Aweme aweme, String str) {
        if (m63652c(context, aweme, str) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private int m63652c(Context context, Aweme aweme, String str) {
        C26307a aVar;
        C2676c cVar;
        if (aweme == null) {
            return 4;
        }
        if (aweme.isLive()) {
            return 0;
        }
        String aid = aweme.getAid();
        if (TextUtils.isEmpty(aid)) {
            return 4;
        }
        if (!aweme.isAd()) {
            return 0;
        }
        if (C26469cc.m63997a(aweme, 3)) {
            if (C26469cc.m63999a(aweme, true)) {
                return 3;
            }
            return 4;
        } else if (!this.f69378b) {
            if (m63650b(aweme)) {
                return 1;
            }
            return 4;
        } else if (C26512f.m64070m(aweme)) {
            return 1;
        } else {
            AggregationSdk aggregationSdk = aweme.getAwemeRawAd().getAggregationSdk();
            if (aggregationSdk == null) {
                return 4;
            }
            if (this.f69381f.containsKey(aid)) {
                aVar = (C26307a) this.f69381f.get(aid);
            } else {
                aVar = C26307a.m63681a(aggregationSdk.getCommonData());
                if (aVar == null) {
                    return 4;
                }
                this.f69381f.put(aid, aVar);
            }
            if (this.f69380e.containsKey(aid)) {
                cVar = (C2676c) this.f69380e.get(aid);
            } else if (context == null) {
                return 4;
            } else {
                m63649a(aVar, str);
                cVar = (C2676c) mo53955b(context).mo7245a(aVar.f69431b, aVar.f69432c);
                if (cVar == null) {
                    return 4;
                }
                this.f69380e.put(aid, cVar);
            }
            if (!(cVar instanceof C2677d)) {
                return 2;
            }
            if (m63650b(aweme)) {
                return 1;
            }
            return 4;
        }
    }

    /* renamed from: a */
    public final boolean mo53954a(Context context, Aweme aweme, String str) {
        if (m63652c(context, aweme, str) == 4) {
            return true;
        }
        return false;
    }
}
