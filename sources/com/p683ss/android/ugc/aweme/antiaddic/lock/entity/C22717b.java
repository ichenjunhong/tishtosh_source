package com.p683ss.android.ugc.aweme.antiaddic.lock.entity;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.b */
public final class C22717b {
    @C17952c(mo34828a = "teen_mode")

    /* renamed from: a */
    public final int f60919a;
    @C17952c(mo34828a = "screen_time_management")

    /* renamed from: b */
    public final int f60920b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22717b) {
                C22717b bVar = (C22717b) obj;
                if (this.f60919a == bVar.f60919a) {
                    if (this.f60920b == bVar.f60920b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f60919a) * 31) + Integer.hashCode(this.f60920b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncedTeenModeSetting(teenMode=");
        sb.append(this.f60919a);
        sb.append(", timeLock=");
        sb.append(this.f60920b);
        sb.append(")");
        return sb.toString();
    }
}
