package com.bytedance.ies.p659c;

import com.squareup.wire.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.c.a */
public class C10617a {

    /* renamed from: b */
    private static volatile C10617a f28144b;

    /* renamed from: a */
    public final Map<Class, Message> f28145a = new HashMap();

    private C10617a() {
    }

    /* renamed from: a */
    public static C10617a m21405a() {
        if (f28144b != null) {
            return f28144b;
        }
        synchronized (C10617a.class) {
            if (f28144b == null) {
                f28144b = new C10617a();
            }
        }
        return f28144b;
    }

    /* renamed from: a */
    public final <T extends Message> T mo18839a(Class<T> cls) {
        return (Message) this.f28145a.get(cls);
    }

    /* renamed from: a */
    public final <T extends Message> T mo18840a(Class<T> cls, T t) {
        if (t != null) {
            return t;
        }
        return mo18839a(cls);
    }
}
