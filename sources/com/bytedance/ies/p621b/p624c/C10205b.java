package com.bytedance.ies.p621b.p624c;

import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import okhttp3.C53657l;
import okhttp3.C53659m;
import okhttp3.C53673t;

/* renamed from: com.bytedance.ies.b.c.b */
public final class C10205b implements C53659m {

    /* renamed from: b */
    private CookieHandler f27534b;

    /* renamed from: c */
    private Pattern f27535c = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    public C10205b(CookieHandler cookieHandler) {
        this.f27534b = cookieHandler;
    }

    public final List<C53657l> loadForRequest(C53673t tVar) {
        if (tVar == null) {
            return Collections.emptyList();
        }
        try {
            Map map = this.f27534b.get(tVar.mo111611b(), Collections.emptyMap());
            if (map == null || map.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = null;
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    for (String str2 : (List) entry.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(m20667a(tVar, str2));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private static List<C53657l> m20667a(C53673t tVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(";");
        for (String a : split) {
            C53657l a2 = C53657l.m114118a(tVar, a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final void saveFromResponse(C53673t tVar, List<C53657l> list) {
        if (tVar != null && !C9414h.m18630a(list)) {
            ArrayList arrayList = new ArrayList();
            for (C53657l lVar : list) {
                arrayList.add(lVar.toString());
            }
            try {
                this.f27534b.put(tVar.mo111611b(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException unused) {
            }
        }
    }
}
