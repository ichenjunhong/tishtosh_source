package com.bytedance.ies.geckoclient.p682d;

import com.bytedance.ies.geckoclient.debug.NetWorkAnalyze;
import com.bytedance.ies.geckoclient.debug.NetWorkAnalyze.Session;
import com.bytedance.ies.geckoclient.model.C10956c;

/* renamed from: com.bytedance.ies.geckoclient.d.a */
public final class C10881a {

    /* renamed from: a */
    public String f29198a = "";

    /* renamed from: b */
    public C10956c f29199b;

    public C10881a(C10956c cVar) {
        this.f29199b = cVar;
    }

    /* renamed from: a */
    public static String m22061a(String str, String str2) throws Exception {
        Session a = NetWorkAnalyze.m22173a().mo19711a(str, str2);
        try {
            String a2 = C10883c.m22066a().f29201b.mo19647a(str, str2);
            a.mo19717c(a2);
            return a2;
        } catch (Exception e) {
            a.mo19715a((Throwable) e);
            throw e;
        }
    }

    /* renamed from: b */
    public static boolean m22062b(String str, String str2) throws Exception {
        Session a = NetWorkAnalyze.m22173a().mo19710a(str);
        try {
            boolean b = C10883c.m22066a().f29201b.mo19649b(str, str2);
            StringBuilder sb = new StringBuilder("下载成功 path:");
            sb.append(str2);
            a.mo19717c(sb.toString());
            return b;
        } catch (Exception e) {
            a.mo19715a((Throwable) e);
            StringBuilder sb2 = new StringBuilder("download failed, reason:");
            sb2.append(e.getMessage());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
