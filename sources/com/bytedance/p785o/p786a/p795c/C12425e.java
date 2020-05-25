package com.bytedance.p785o.p786a.p795c;

import com.bytedance.p785o.p786a.C12413b;
import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p787a.C12412e;

/* renamed from: com.bytedance.o.a.c.e */
public abstract class C12425e extends C12421a implements C12412e {
    /* renamed from: c */
    public abstract boolean mo23478c();

    /* renamed from: d */
    public final C12424d mo23479d() {
        return C12424d.REGISTER_EXCEPTION;
    }

    /* renamed from: a */
    public void mo23473a() {
        if (mo23478c()) {
            C12413b.INSTANCE.addUncaughtExceptionConsumer(this);
            C12409d.m24989a(mo23475b(), "start called.");
        }
    }
}
