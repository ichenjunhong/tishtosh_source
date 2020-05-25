package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class bgb extends bgm {

    /* renamed from: d */
    private List<Long> f42295d;

    public bgb(bey bey, String str, String str2, C15588a aVar, int i, int i2) {
        super(bey, str, str2, aVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30119a() throws IllegalAccessException, InvocationTargetException {
        this.f42315b.mo29301m(-1);
        this.f42315b.mo29302n(-1);
        if (this.f42295d == null) {
            this.f42295d = (List) this.f42316c.invoke(null, new Object[]{this.f42314a.f42216a});
        }
        if (this.f42295d != null && this.f42295d.size() == 2) {
            synchronized (this.f42315b) {
                this.f42315b.mo29301m(((Long) this.f42295d.get(0)).longValue());
                this.f42315b.mo29302n(((Long) this.f42295d.get(1)).longValue());
            }
        }
    }
}
