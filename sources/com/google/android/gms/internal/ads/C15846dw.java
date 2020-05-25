package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dw */
public final class C15846dw implements C15948hq<Object> {

    /* renamed from: a */
    private final WeakReference<C15842ds> f44923a;

    /* renamed from: b */
    private final String f44924b;

    public C15846dw(C15842ds dsVar, String str) {
        this.f44923a = new WeakReference<>(dsVar);
        this.f44924b = str;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f44924b.equals(str)) {
            if ("_ai".equals(str2)) {
                C15842ds dsVar = (C15842ds) this.f44923a.get();
                if (dsVar != null) {
                    dsVar.mo31047v();
                }
            } else if ("_ac".equals(str2)) {
                C15842ds dsVar2 = (C15842ds) this.f44923a.get();
                if (dsVar2 != null) {
                    dsVar2.mo31048w();
                }
            }
        }
    }
}
