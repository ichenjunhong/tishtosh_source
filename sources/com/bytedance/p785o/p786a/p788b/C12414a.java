package com.bytedance.p785o.p786a.p788b;

import android.app.Application;
import com.bytedance.p785o.p786a.p787a.C12405a;
import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p788b.p789a.p792b.C12416a;
import com.bytedance.p785o.p786a.p788b.p789a.p792b.p793a.C12417a;
import com.bytedance.p785o.p786a.p788b.p789a.p792b.p793a.C12418b;
import com.bytedance.p785o.p786a.p795c.C12421a;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.o.a.b.a */
public final class C12414a extends C12421a {
    /* renamed from: b */
    public final String mo23475b() {
        return "ProviderInstalledFailedPlugin";
    }

    /* renamed from: a */
    public final void mo23473a() {
        super.mo23473a();
        if (!C12416a.f32668a) {
            try {
                Object a = C12405a.m24983a();
                Field declaredField = a.getClass().getDeclaredField("mInstrumentation");
                declaredField.setAccessible(true);
                if (!(declaredField.get(a) instanceof C12416a)) {
                    declaredField.set(a, new C12416a());
                    C12409d.m24993c("InstrumentationWrapper", "Fix success.");
                    C12416a.f32668a = true;
                }
            } catch (Exception e) {
                C12409d.m24993c("InstrumentationWrapper", e.getMessage());
            }
        }
        C12409d.m24989a(mo23475b(), "start");
    }

    /* renamed from: a */
    public final void mo23474a(Application application) {
        super.mo23474a(application);
        C12416a.m24999a(new C12417a());
        C12416a.m24999a(new C12418b());
    }
}
