package com.bytedance.p785o.p786a.p788b.p789a.p792b.p793a;

import com.bytedance.p785o.p786a.p788b.p789a.p790a.p791a.C12415a;

/* renamed from: com.bytedance.o.a.b.a.b.a.b */
public final class C12418b implements C12415a {
    /* renamed from: a */
    public final boolean mo23476a(Object obj, Throwable th) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (th instanceof ClassNotFoundException) {
            for (StackTraceElement methodName : stackTrace) {
                if (methodName.getMethodName().contains("installProvider")) {
                    return true;
                }
            }
        }
        return false;
    }
}
