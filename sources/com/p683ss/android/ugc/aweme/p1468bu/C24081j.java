package com.p683ss.android.ugc.aweme.p1468bu;

import com.bytedance.common.utility.p523c.C9389c;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.linkselector.p1178d.C19206a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.net.C37808r;
import com.p683ss.android.ugc.aweme.p1468bu.C24078i.C24080a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.ss.android.ugc.aweme.bu.j */
public final class C24081j {

    /* renamed from: a */
    private static final List<String> f63930a = new ArrayList<String>(16) {
        {
            add("com.ss.android.linkselector");
            add("com.ss.android.deviceregister");
            add("com.bytedance.frameworks.plugin");
            add("com.crashlytics.android.core");
        }
    };

    /* renamed from: a */
    public static void m58919a(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C24093p.IO);
        arrayList.add(C24093p.DEFAULT);
        arrayList.add(C24093p.SERIAL);
        arrayList.add(C24093p.BACKGROUND);
        C24080a a = C24078i.m58916a();
        a.f63924a = false;
        a.f63925b = (List) C24078i.m58917a(arrayList);
        a.f63926c = (List) C24078i.m58917a(f63930a);
        a.f63927d = C24078i.m58915a(TimeUnit.MINUTES.toMillis(5));
        a.f63928e = C24078i.m58915a(TimeUnit.MINUTES.toMillis(5));
        a.f63929f = C24078i.m58915a(TimeUnit.MINUTES.toMillis(15));
        C24076h.f63910a = a.mo49843a();
        C24076h.f63912c = new C24084l();
        C37808r.f96272a = C24076h.m58902c();
        C18842a.m45932a(C24069f.f63887a);
        C9393e.setExecutorService(C24076h.m58902c());
        C9389c.f25618a = C24076h.m58903d();
        C1711f<? super C1675ac, ? extends C1675ac> fVar = C24083k.f63931a;
        if (!C2150a.f6933w) {
            C2150a.f6919i = fVar;
            C19206a.f52932a = C24076h.m58902c();
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
