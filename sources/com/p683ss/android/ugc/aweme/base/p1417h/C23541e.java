package com.p683ss.android.ugc.aweme.base.p1417h;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.h.e */
public final class C23541e {

    /* renamed from: a */
    private static HashMap<String, C23543g> f62664a = new HashMap<>();

    /* renamed from: a */
    public static C23543g m57714a(Context context, String str) {
        C23543g gVar = (C23543g) f62664a.get(str);
        if (gVar != null) {
            return gVar;
        }
        C23543g gVar2 = new C23543g(context.getApplicationContext(), str);
        f62664a.put(str, gVar2);
        return gVar2;
    }
}
