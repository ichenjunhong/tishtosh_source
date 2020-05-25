package com.p683ss.android.ugc.aweme.p1807im.sdk.p1848l;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.l.a */
public final class C34398a implements Serializable {
    @C17952c(mo34828a = "action")

    /* renamed from: a */
    private final int f88767a;

    public static /* synthetic */ C34398a copy$default(C34398a aVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f88767a;
        }
        return aVar.copy(i);
    }

    public final int component1() {
        return this.f88767a;
    }

    public final C34398a copy(int i) {
        return new C34398a(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C34398a) {
                if (this.f88767a == ((C34398a) obj).f88767a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getAction() {
        return this.f88767a;
    }

    public final int hashCode() {
        return this.f88767a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IMBusinessWsPayload(action=");
        sb.append(this.f88767a);
        sb.append(")");
        return sb.toString();
    }

    public C34398a(int i) {
        this.f88767a = i;
    }
}
