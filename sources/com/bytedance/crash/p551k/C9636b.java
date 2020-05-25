package com.bytedance.crash.p551k;

import android.text.TextUtils;
import com.bytedance.crash.p547g.C9591c;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.k.b */
public final class C9636b {

    /* renamed from: m */
    public static boolean f26285m = false;

    /* renamed from: n */
    private static IConfigManager f26286n = null;

    /* renamed from: o */
    private static boolean f26287o = true;

    /* renamed from: a */
    public boolean f26288a = true;

    /* renamed from: b */
    public String f26289b = "https://api2.musical.ly/monitor/collect/c/crash";

    /* renamed from: c */
    public String f26290c = "https://api2.musical.ly/monitor/collect/c/exception";

    /* renamed from: d */
    public String f26291d = "https://api2.musical.ly/monitor/collect/c/native_bin_crash";

    /* renamed from: e */
    public String f26292e = "https://mon.byteoversea.com/monitor/collect/c/logcollect";

    /* renamed from: f */
    public long f26293f = 8000;

    /* renamed from: g */
    public int f26294g = UnReadVideoExperiment.LIKE_USER_LIST;

    /* renamed from: h */
    public int f26295h = 1;

    /* renamed from: i */
    public boolean f26296i = true;

    /* renamed from: j */
    public boolean f26297j = true;

    /* renamed from: k */
    public long f26298k = 1000;

    /* renamed from: l */
    public boolean f26299l;

    /* renamed from: c */
    public static boolean m19212c() {
        return f26287o;
    }

    /* renamed from: a */
    public final boolean mo17476a() {
        if (mo17477b() != null) {
            return mo17477b().getLogTypeSwitch("core_exception_monitor");
        }
        return this.f26297j;
    }

    /* renamed from: b */
    public final IConfigManager mo17477b() {
        if (f26287o && f26286n == null) {
            try {
                f26286n = (IConfigManager) C12401c.m24975a(IConfigManager.class);
            } catch (Throwable unused) {
                f26287o = false;
            }
            if (f26286n != null) {
                f26286n.registerConfigListener(new C13226a() {
                    /* renamed from: a */
                    public final void mo16270a(JSONObject jSONObject, boolean z) {
                    }

                    /* renamed from: e */
                    public final void mo16224e() {
                        C9636b.f26285m = true;
                    }
                });
            }
        }
        if (!f26287o || !f26285m) {
            return null;
        }
        return f26286n;
    }

    /* renamed from: a */
    public final void mo17475a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9591c.m19082a();
            this.f26290c = str;
        }
    }

    /* renamed from: b */
    public final void mo17478b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9591c.m19082a();
            this.f26291d = str;
        }
    }

    /* renamed from: c */
    public final void mo17479c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9591c.m19082a();
            this.f26289b = str;
        }
    }
}
