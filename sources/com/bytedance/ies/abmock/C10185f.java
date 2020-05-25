package com.bytedance.ies.abmock;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.abmock.f */
public abstract class C10185f implements C10187h {

    /* renamed from: a */
    private C10187h f27518a;

    /* renamed from: b */
    private List<Object> f27519b = new ArrayList();

    /* renamed from: a */
    public abstract String mo18176a();

    /* renamed from: b */
    public final boolean mo18196b() {
        C10187h hVar = this.f27518a;
        if (hVar != null) {
            return hVar.mo18196b();
        }
        return false;
    }

    /* renamed from: a */
    public final Object mo18193a(String str) {
        C52711k.m112240b(str, "key");
        C10187h hVar = this.f27518a;
        if (hVar != null) {
            return hVar.mo18193a(str);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18194a(Application application) {
        C52711k.m112240b(application, "application");
        mo18195a(application, mo18176a());
    }

    /* renamed from: a */
    public final void mo18195a(Application application, String str) {
        C52711k.m112240b(application, "application");
        C52711k.m112240b(str, "mockPrefix");
        try {
            C10177a.m20507a("正在实例化 HawkStorage");
            this.f27518a = (C10187h) Class.forName("com.bytedance.ies.abmock.debugtool.HawkStorage").newInstance();
            if (this.f27518a != null) {
                C10187h hVar = this.f27518a;
                if (hVar == null) {
                    C52711k.m112234a();
                }
                hVar.mo18195a(application, str);
                C10177a.m20507a("实例化成功");
            }
        } catch (Exception unused) {
            this.f27518a = null;
            C10177a.m20507a("实例化失败");
        }
    }
}
