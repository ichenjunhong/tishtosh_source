package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.b */
public final class C34980b {
    @C17952c(mo34828a = "max_time")

    /* renamed from: a */
    public final long f90002a;
    @C17952c(mo34828a = "min_time")

    /* renamed from: b */
    public final long f90003b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34980b) {
                C34980b bVar = (C34980b) obj;
                if (this.f90002a == bVar.f90002a) {
                    if (this.f90003b == bVar.f90003b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f90002a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f90003b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationFetchMissingPage(toFetchMaxTime=");
        sb.append(this.f90002a);
        sb.append(", toFetchMinTime=");
        sb.append(this.f90003b);
        sb.append(")");
        return sb.toString();
    }

    public C34980b(long j, long j2) {
        this.f90002a = j;
        this.f90003b = j2;
    }
}
