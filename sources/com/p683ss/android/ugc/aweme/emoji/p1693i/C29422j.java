package com.p683ss.android.ugc.aweme.emoji.p1693i;

import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.j */
final class C29422j {

    /* renamed from: a */
    private static HashMap<String, C29358c> f77047a = new HashMap<>();

    /* renamed from: b */
    public static void m69392b(String str) {
        f77047a.remove(str);
    }

    /* renamed from: a */
    public static C29358c m69390a(String str) {
        return (C29358c) f77047a.get(str);
    }

    /* renamed from: a */
    public static void m69391a(String str, C29358c cVar) {
        f77047a.put(str, cVar);
    }
}
