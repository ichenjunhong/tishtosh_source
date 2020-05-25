package com.p683ss.android.ugc.aweme.commerce.sdk.service;

import com.p683ss.android.ugc.aweme.commerce.sdk.p1532a.C25527b;
import com.p683ss.android.ugc.aweme.commerce.sdk.p1532a.C25529c;
import com.p683ss.android.ugc.aweme.commerce.sdk.p1532a.C25531d;
import com.p683ss.android.ugc.aweme.commerce.sdk.p1533b.C25533a;
import com.p683ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService */
public final class CommerceService extends EmptyCommerceService {
    public final void logCommerceEvents(String str, C25560e eVar) {
        C52711k.m112240b(str, "event");
        C25533a aVar = C25533a.f67520a;
        C52711k.m112240b(str, "event");
        int hashCode = str.hashCode();
        if (hashCode != -1804550749) {
            if (hashCode != -1771079945) {
                if (hashCode == 1496812008 && str.equals("enter_product_detail")) {
                    C25527b bVar = new C25527b();
                    if (eVar != null) {
                        bVar.f67505d = eVar.f67569b;
                        bVar.f67506e = eVar.f67570c;
                        bVar.f67507f = eVar.f67571d;
                        bVar.f67508g = eVar.f67586s;
                    }
                    bVar.mo52238a();
                }
            } else if (str.equals("product_anchor_show")) {
                C25529c cVar = new C25529c();
                if (eVar != null) {
                    cVar.f67510d = eVar.f67569b;
                    cVar.f67511e = eVar.f67570c;
                    cVar.f67512f = eVar.f67571d;
                    cVar.f67513g = eVar.f67586s;
                }
                cVar.mo52238a();
            }
        } else if (str.equals("product_stay_time")) {
            C25531d dVar = new C25531d();
            if (eVar != null) {
                dVar.f67515d = eVar.f67569b;
                dVar.f67516e = eVar.f67570c;
                dVar.f67517f = eVar.f67571d;
                dVar.f67518g = eVar.f67586s;
                dVar.f67519h = eVar.f67587t;
            }
            dVar.mo52238a();
        }
    }
}
