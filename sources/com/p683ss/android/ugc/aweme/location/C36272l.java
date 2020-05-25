package com.p683ss.android.ugc.aweme.location;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.location.C36280q.C36281a;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.location.l */
public final class C36272l extends C36255b {

    /* renamed from: e */
    private static C36272l f92846e;

    /* renamed from: d */
    public boolean f92847d;

    /* renamed from: f */
    private boolean f92848f = true;

    /* renamed from: c */
    public final boolean mo75075c() {
        return this.f92847d;
    }

    /* renamed from: e */
    public static boolean m81898e() {
        return C36266j.m81879a(C11010c.m22280a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo75095f() {
        super.mo75074b();
        C36285u uVar = this.f92826b;
        if (uVar != null) {
            C36266j jVar = uVar.f92882a;
            if (jVar != null) {
                jVar.mo75086a(false);
            }
        }
    }

    /* renamed from: b */
    public final void mo75074b() {
        int i;
        if (mo75075c()) {
            if (this.f92848f) {
                i = 60000;
                this.f92848f = false;
            } else {
                i = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new C36274m(this), (long) i);
        }
    }

    /* renamed from: g */
    private static C36283s m81899g() {
        C36283s sVar = new C36283s();
        sVar.f92878l = new C36263h();
        C52711k.m112240b(sVar, "setting");
        sVar.f92879m = new C36277o();
        C52711k.m112240b(sVar, "setting");
        sVar.f92877k = new C36281a();
        String str = C11010c.m22282b().f29547a;
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("https://")) {
                sVar.f92867a = str;
            } else {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(str);
                sVar.f92867a = sb.toString();
            }
        }
        try {
            PoiSetting poiSetting = C32816h.m75716b().getPoiSetting();
            sVar.f92868b = poiSetting.getReportWifiMax().intValue();
            sVar.f92869c = poiSetting.getReportBssMax().intValue();
            sVar.f92870d = poiSetting.getReportGps().booleanValue();
            if (m81859d()) {
                sVar.f92871e = poiSetting.getReportAtStart().booleanValue();
            }
            sVar.f92874h = (long) poiSetting.getReportIntervalSeconds().intValue();
            sVar.f92875i = (long) poiSetting.getLocationUpdateInterval().intValue();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        sVar.f92872f = false;
        sVar.f92873g = C47789cu.m103419b();
        sVar.f92876j = false;
        return sVar;
    }

    private C36272l(Context context) {
        C52711k.m112240b(context, "context");
        this.f92825a = context;
        this.f92826b = C36286a.m81925a();
        C0013i.m16a((Callable<TResult>) new C36257b<TResult>(this, context));
    }

    /* renamed from: a */
    public static synchronized C36272l m81897a(Context context) {
        C36272l lVar;
        synchronized (C36272l.class) {
            if (f92846e == null) {
                f92846e = new C36272l(context.getApplicationContext());
            }
            lVar = f92846e;
        }
        return lVar;
    }

    /* renamed from: a */
    public final C36275n mo75071a(C36284t tVar, Context context) {
        if (!C18920g.m46048a(context)) {
            return null;
        }
        C35857a.m81005d().mo74519a(new C36289w()).mo74520a();
        Application application = (Application) C11010c.m22280a();
        C36283s g = m81899g();
        C52711k.m112240b(application, "application");
        C52711k.m112240b(g, "setting");
        return new C36251a(application, g, tVar);
    }
}
