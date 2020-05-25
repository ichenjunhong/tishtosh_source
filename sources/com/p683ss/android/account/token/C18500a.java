package com.p683ss.android.account.token;

import android.content.Context;
import com.bytedance.retrofit2.p830a.C12685b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.account.token.a */
public final class C18500a {

    /* renamed from: a */
    private static volatile boolean f50979a = false;

    /* renamed from: b */
    private static volatile boolean f50980b = true;

    /* renamed from: c */
    private static Set<String> f50981c = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public static void m44768a() {
        if (f50979a) {
            C18503c.m44773a().mo37767b();
        }
    }

    /* renamed from: a */
    public static void m44770a(Collection<String> collection) {
        if (f50979a) {
            C18503c.m44773a().mo37765a(collection);
            return;
        }
        if (f50981c != null) {
            f50981c.addAll(collection);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m44767a(String str) {
        if (!f50979a) {
            return null;
        }
        LinkedList<C12685b> linkedList = new LinkedList<>();
        C18503c.m44775a(str, (List<C12685b>) linkedList);
        if (linkedList.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap(linkedList.size());
        for (C12685b bVar : linkedList) {
            hashMap.put(bVar.f33318a, bVar.f33319b);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m44771a(boolean z) {
        if (f50979a && z != f50980b) {
            C18503c.m44773a().mo37766a(z);
            if (z) {
                C18503c.m44773a().mo37767b();
            } else {
                C18503c a = C18503c.m44773a();
                if (C18503c.f50991f && a.f50994d != null) {
                    a.f50994d.removeMessages(1000);
                }
            }
            f50980b = z;
        }
    }

    /* renamed from: a */
    public static void m44769a(Context context, C18501b bVar) {
        if (!f50979a) {
            C18503c.f50990a = new C18503c(context, bVar);
            C18503c.m44773a().mo37766a(f50980b);
            f50979a = true;
            if (f50981c.size() != 0) {
                C18503c.m44773a().mo37765a((Collection<String>) f50981c);
                f50981c.clear();
                f50981c = null;
            }
        }
    }
}
