package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.gson.C17963d;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C52104b;
import com.twitter.sdk.android.core.internal.C52116i;
import com.twitter.sdk.android.core.internal.C52119l;
import com.twitter.sdk.android.core.internal.scribe.C52181v.C52182a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.a */
public class C52143a extends C52179t {

    /* renamed from: b */
    private static volatile ScheduledExecutorService f129795b;

    /* renamed from: c */
    private final C52189k<? extends C52188j<TwitterAuthToken>> f129796c;

    /* renamed from: d */
    private final String f129797d;

    /* renamed from: e */
    private final Context f129798e;

    /* renamed from: a */
    private C52188j m111518a() {
        return this.f129796c.mo108768a();
    }

    /* renamed from: d */
    private static boolean m111524d() {
        if (!"release".equals("debug")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private String m111520b() {
        return this.f129798e.getResources().getConfiguration().locale.getLanguage();
    }

    /* renamed from: c */
    private static ScheduledExecutorService m111523c() {
        if (f129795b == null) {
            synchronized (C52143a.class) {
                if (f129795b == null) {
                    String str = "scribe";
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49846a(C52116i.m111474a(str)).mo49847a());
                    C52116i.m111475a(str, scheduledExecutorService);
                    f129795b = scheduledExecutorService;
                }
            }
        }
        return f129795b;
    }

    /* renamed from: a */
    private static long m111516a(C52188j jVar) {
        if (jVar != null) {
            return jVar.f129902b;
        }
        return 0;
    }

    /* renamed from: a */
    private void m111519a(C52181v vVar) {
        super.mo108914a(vVar, m111516a(m111518a()));
    }

    /* renamed from: a */
    public final void mo108852a(C52158e... eVarArr) {
        for (int i = 0; i <= 0; i++) {
            mo108851a(eVarArr[0], Collections.emptyList());
        }
    }

    /* renamed from: c */
    private static String m111522c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str;
    }

    /* renamed from: a */
    public static C52180u m111517a(String str, String str2) {
        C52180u uVar = new C52180u(m111524d(), m111522c("https://syndication.twitter.com", ""), "i", "sdk", "", m111521b(str, str2), 100, 600);
        return uVar;
    }

    /* renamed from: b */
    private static String m111521b(String str, String str2) {
        StringBuilder sb = new StringBuilder("TwitterKit/");
        sb.append("3.0 (Android ");
        sb.append(VERSION.SDK_INT);
        sb.append(") ");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo108851a(C52158e eVar, List<C52144aa> list) {
        String str = "";
        C52158e eVar2 = eVar;
        m111519a(C52183w.m111607a(eVar2, str, System.currentTimeMillis(), m111520b(), this.f129797d, list));
    }

    public C52143a(Context context, C52189k<? extends C52188j<TwitterAuthToken>> kVar, C52072e eVar, C52119l lVar, C52180u uVar) {
        this(context, C52225r.m111638a().f130052e, kVar, eVar, lVar, uVar);
    }

    private C52143a(Context context, TwitterAuthConfig twitterAuthConfig, C52189k<? extends C52188j<TwitterAuthToken>> kVar, C52072e eVar, C52119l lVar, C52180u uVar) {
        String str;
        ScheduledExecutorService c = m111523c();
        C52182a aVar = new C52182a(new C17978g().mo34893a(C17963d.LOWER_CASE_WITH_UNDERSCORES).mo34900d());
        super(context, c, uVar, aVar, twitterAuthConfig, kVar, eVar, lVar);
        this.f129798e = context;
        this.f129796c = kVar;
        if (lVar.f129732a) {
            C52104b b = lVar.mo108820b();
            if (b != null) {
                str = b.f129708a;
                this.f129797d = str;
            }
        }
        str = null;
        this.f129797d = str;
    }
}
