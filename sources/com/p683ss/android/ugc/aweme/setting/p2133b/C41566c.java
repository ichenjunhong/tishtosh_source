package com.p683ss.android.ugc.aweme.setting.p2133b;

import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.setting.b.c */
public final class C41566c {
    /* renamed from: a */
    static void m91405a() {
        Field[] declaredFields;
        AbTestModel d = C41589c.m91432a().mo85306m();
        for (Field field : d.getClass().getDeclaredFields()) {
            if (field.getAnnotation(Deprecated.class) == null) {
                if (field.getAnnotation(C41575g.class) == null) {
                    C41576h.f105291b.add(new C41576h(field, d));
                } else {
                    C41576h hVar = new C41576h(field, d);
                    String a = hVar.f105292c.mo85354a();
                    if (!C41576h.f105290a.containsKey(a)) {
                        C41576h.f105290a.put(a, new ArrayList());
                    }
                    ((ArrayList) C41576h.f105290a.get(a)).add(hVar);
                    C41576h.f105291b.add(hVar);
                }
            }
        }
    }
}
