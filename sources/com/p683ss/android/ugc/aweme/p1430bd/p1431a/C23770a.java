package com.p683ss.android.ugc.aweme.p1430bd.p1431a;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.bd.a.a */
public final class C23770a implements Serializable {
    @C17952c(mo34828a = "refresh_switch")

    /* renamed from: a */
    private boolean f63356a;
    @C17952c(mo34828a = "refresh_interval")

    /* renamed from: b */
    private int f63357b;
    @C17952c(mo34828a = "keepalive_timeout")

    /* renamed from: c */
    private int f63358c;

    public final int getKeepaliveTimeout() {
        return this.f63358c;
    }

    public final int getRefreshInterval() {
        return this.f63357b;
    }

    public final boolean isRefreshSwitch() {
        return this.f63356a;
    }

    public final int hashCode() {
        return ((((this.f63356a ? 1 : 0) * true) + this.f63357b) * 31) + this.f63358c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CdnDomainRefresh{");
        sb.append("refreshSwitch=");
        sb.append(this.f63356a);
        sb.append(", refreshInterval=");
        sb.append(this.f63357b);
        sb.append(", keepaliveTimeout=");
        sb.append(this.f63358c);
        sb.append('}');
        return sb.toString();
    }

    public final void setKeepaliveTimeout(int i) {
        this.f63358c = i;
    }

    public final void setRefreshInterval(int i) {
        this.f63357b = i;
    }

    public final void setRefreshSwitch(boolean z) {
        this.f63356a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C23770a aVar = (C23770a) obj;
        if (this.f63356a == aVar.f63356a && this.f63357b == aVar.f63357b && this.f63358c == aVar.f63358c) {
            return true;
        }
        return false;
    }
}
