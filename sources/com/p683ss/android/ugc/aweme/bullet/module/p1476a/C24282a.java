package com.p683ss.android.ugc.aweme.bullet.module.p1476a;

import android.content.Context;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.bullet.utils.C24347a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.a.a */
public final class C24282a {

    /* renamed from: a */
    public static final C24282a f64418a = new C24282a();

    private C24282a() {
    }

    /* renamed from: a */
    public static List<C10268e> m59453a(C10326b bVar) {
        List<C10268e> arrayList = new ArrayList<>();
        C10757a aVar = (C10757a) bVar.mo18401c(C10757a.class);
        Context context = (Context) bVar.mo18401c(Context.class);
        if (!(aVar == null || context == null)) {
            Map javaMethods = C20854a.m53168h().getJavaMethods(new WeakReference(context), aVar);
            if (javaMethods != null) {
                for (Entry entry : javaMethods.entrySet()) {
                    C24347a aVar2 = C24347a.f64655a;
                    Object key = entry.getKey();
                    C52711k.m112236a(key, "entry.key");
                    String str = (String) key;
                    Object value = entry.getValue();
                    C52711k.m112236a(value, "entry.value");
                    arrayList.add(C24347a.m59706a(bVar, str, (C10762d) value, C10269a.PRIVATE));
                }
            }
        }
        return arrayList;
    }
}
