package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.p384db.C7684a;
import com.bytedance.android.livesdk.i18n.p384db.C7688d;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.i18n.d */
final /* synthetic */ class C7682d implements Callable {

    /* renamed from: a */
    private final C7679c f21170a;

    C7682d(C7679c cVar) {
        this.f21170a = cVar;
    }

    public final Object call() {
        C7679c cVar = this.f21170a;
        C7684a a = C7679c.f21158c.mo14046a("locale");
        if (a == null) {
            throw new Exception("locale info not found in db");
        } else if (TextUtils.equals(cVar.f21159a, a.f21175b)) {
            C7681b bVar = new C7681b();
            bVar.f21167a = cVar.f21159a;
            C7684a a2 = C7679c.f21158c.mo14046a(C42311c.f106863g);
            if (a2 != null) {
                bVar.f21168b = Long.valueOf(a2.f21175b).longValue();
                List<C7688d> a3 = C7679c.f21157b.mo14048a();
                if (!a3.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (C7688d dVar : a3) {
                        if (!TextUtils.isEmpty(dVar.f21179a) && !TextUtils.isEmpty(dVar.f21180b)) {
                            hashMap.put(dVar.f21179a, dVar.f21180b);
                        }
                    }
                    bVar.f21169c = hashMap;
                    return bVar;
                }
                StringBuilder sb = new StringBuilder("translations not found for locale: ");
                sb.append(cVar.f21159a);
                throw new Exception(sb.toString());
            }
            throw new Exception("version info not found in db");
        } else {
            StringBuilder sb2 = new StringBuilder("locale in db is ");
            sb2.append(a.f21175b);
            sb2.append(", but you are request for ");
            sb2.append(cVar.f21159a);
            throw new Exception(sb2.toString());
        }
    }
}
