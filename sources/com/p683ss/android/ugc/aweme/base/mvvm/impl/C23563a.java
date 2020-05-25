package com.p683ss.android.ugc.aweme.base.mvvm.impl;

import com.p683ss.android.ugc.aweme.base.mvvm.C23560c;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;

/* renamed from: com.ss.android.ugc.aweme.base.mvvm.impl.a */
public class C23563a<T extends C23560c> implements C23562e<T> {

    /* renamed from: a */
    protected T f62681a;

    /* renamed from: a */
    public final T mo48745a() {
        return this.f62681a;
    }

    /* renamed from: b */
    public final void mo48749b() {
        if (this.f62681a != null) {
            this.f62681a.refresh();
        }
    }

    /* renamed from: a */
    public final void mo48746a(T t) {
        this.f62681a = t;
    }
}
