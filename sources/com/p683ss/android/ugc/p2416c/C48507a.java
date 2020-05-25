package com.p683ss.android.ugc.p2416c;

import com.p683ss.android.ugc.p2416c.C48514f.C48518c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.c.a */
class C48507a implements C48518c {

    /* renamed from: a */
    public Map<String, C48518c> f121950a = new HashMap();

    /* renamed from: a */
    public <T> T mo96007a(Object obj, Class<T> cls) {
        return null;
    }

    C48507a() {
    }

    /* renamed from: a */
    static String m104944a(Class cls) {
        String name = cls.getName();
        StringBuilder sb = new StringBuilder("com.ss.android.ugc.graph.ComponentDelegateHolder");
        sb.append(Math.abs(name.trim().hashCode()));
        return sb.toString();
    }
}
