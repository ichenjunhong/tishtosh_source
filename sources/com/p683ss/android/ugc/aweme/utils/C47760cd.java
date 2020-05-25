package com.p683ss.android.ugc.aweme.utils;

import com.google.gson.C17971f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.cd */
public final class C47760cd {

    /* renamed from: a */
    private static C17971f f120282a;

    /* renamed from: a */
    public static C17971f m103383a() {
        if (f120282a == null) {
            f120282a = new C17971f();
        }
        return f120282a;
    }

    /* renamed from: a */
    public static String m103385a(Object obj) {
        return m103383a().mo34889b(obj);
    }

    /* renamed from: a */
    public static <T> T m103384a(String str, Class<T> cls) {
        return m103383a().mo34884a(str, cls);
    }

    /* renamed from: b */
    public static <T> List<T> m103386b(String str, Class<T[]> cls) {
        Object[] objArr = (Object[]) m103383a().mo34884a(str, cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
