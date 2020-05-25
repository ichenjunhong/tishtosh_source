package com.p683ss.android.ugc.aweme.sdk.iap.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.d */
public final class C41390d {

    /* renamed from: a */
    public Map<String, C41392f> f104941a = new HashMap();

    /* renamed from: b */
    public Map<String, Purchase> f104942b = new HashMap();

    C41390d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo84005a(C41392f fVar) {
        this.f104941a.put(fVar.f104943a, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo84004a(Purchase purchase) {
        this.f104942b.put(purchase.getSku(), purchase);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<String> mo84003a(String str) {
        ArrayList arrayList = new ArrayList();
        for (Purchase purchase : this.f104942b.values()) {
            if (purchase.getItemType().equals(str)) {
                arrayList.add(purchase.getSku());
            }
        }
        return arrayList;
    }
}
