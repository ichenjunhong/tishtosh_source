package com.snapchat.kit.sdk.core.metrics;

import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import java.util.Objects;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b */
public final class C18267b<T> {
    @C17952c(mo34828a = "retry_count")
    @C17950a

    /* renamed from: a */
    public int f50449a;
    @C17952c(mo34828a = "event")
    @C17950a

    /* renamed from: b */
    public T f50450b;

    public C18267b(T t) {
        this(t, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18267b)) {
            return false;
        }
        C18267b bVar = (C18267b) obj;
        if (!Objects.equals(Integer.valueOf(this.f50449a), Integer.valueOf(bVar.f50449a)) || !Objects.equals(this.f50450b, bVar.f50450b)) {
            return false;
        }
        return true;
    }

    public C18267b(T t, int i) {
        this.f50449a = i;
        this.f50450b = t;
    }
}
