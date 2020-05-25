package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.C15525p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.lk */
public class C16050lk<ReferenceT> {

    /* renamed from: a */
    private final Map<String, CopyOnWriteArrayList<C15948hq<? super ReferenceT>>> f45159a = new HashMap();

    /* renamed from: b */
    public ReferenceT f45160b;

    /* renamed from: a */
    public final boolean mo31160a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        mo29242a(uri.getPath(), acd.m32578a(uri));
        return true;
    }

    /* renamed from: a */
    private final synchronized void mo29242a(String str, Map<String, String> map) {
        if (abv.m32791a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            abv.m32494a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 4 + String.valueOf(str4).length());
                sb.append("  ");
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                abv.m32494a(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f45159a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                agf.f40430a.execute(new C16052lm(this, (C15948hq) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo31159a(String str, C15948hq<? super ReferenceT> hqVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f45159a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f45159a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(hqVar);
    }

    /* renamed from: b */
    public final synchronized void mo31161b(String str, C15948hq<? super ReferenceT> hqVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f45159a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(hqVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo31158a(String str, C15525p<C15948hq<? super ReferenceT>> pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f45159a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C15948hq hqVar = (C15948hq) it.next();
                if (pVar.mo28526a(hqVar)) {
                    arrayList.add(hqVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: d */
    public final synchronized void mo31162d() {
        this.f45159a.clear();
    }
}
