package com.p683ss.android.ugc.aweme.tools.draft.p2355a;

import p2628d.C52848o;
import p2628d.p2631c.C52625c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a.d */
public abstract class C46971d<T> implements C52625c<T> {
    /* renamed from: a */
    public abstract void mo94267a(T t);

    /* renamed from: a */
    public abstract void mo94268a(Throwable th);

    public void resumeWith(Object obj) {
        Throwable r0 = C52848o.m114623exceptionOrNullimpl(obj);
        if (r0 == null) {
            mo94267a((T) obj);
        } else {
            mo94268a(r0);
        }
    }
}
