package com.p683ss.android.ugc.p1235a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.a.g */
public abstract class C20314g {

    /* renamed from: a */
    protected List<String> f55809a = new ArrayList();

    /* renamed from: b */
    protected Map<Class, List<String>> f55810b = new HashMap();

    /* renamed from: a */
    public abstract <T> T mo42949a(String str, Object... objArr);

    /* renamed from: a */
    public abstract <T> List<T> mo42950a(Class<T> cls, Object... objArr);

    /* renamed from: a */
    public C20314g mo42951a(Class cls) {
        if (this.f55810b.get(cls) != null) {
            return this;
        }
        return null;
    }

    /* renamed from: a */
    public C20314g mo42952a(String str) {
        if (this.f55809a.contains(str)) {
            return this;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> List<T> mo42956a(List<String> list, Object... objArr) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String a : list) {
            try {
                Object a2 = mo42949a(a, objArr);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42957a(Class cls, String... strArr) {
        List list = (List) this.f55810b.get(cls);
        if (list == null) {
            list = new ArrayList();
        }
        list.addAll(Arrays.asList(strArr));
        this.f55810b.put(cls, list);
    }
}
