package com.p683ss.caijing.globaliap.p2561e;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.caijing.globaliap.p2561e.C51271a.C51272a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.e.a */
public abstract class C51271a<Response extends C51272a> {

    /* renamed from: com.ss.caijing.globaliap.e.a$a */
    public static class C51272a implements Serializable {

        /* renamed from: g */
        public String f128038g;

        /* renamed from: h */
        public String f128039h;

        /* renamed from: c */
        public final boolean mo101797c() {
            return TextUtils.equals(this.f128038g, "CD0000");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, String> mo101743a(Map<String, String> map);

    /* renamed from: a */
    public final Map<String, String> mo101796a() {
        HashMap hashMap = new HashMap();
        hashMap.put("charset", "utf-8");
        hashMap.put(C42311c.f106863g, "1.0");
        hashMap.put("format", "JSON");
        return mo101743a(hashMap);
    }
}
