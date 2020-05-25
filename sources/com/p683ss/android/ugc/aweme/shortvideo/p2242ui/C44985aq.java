package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aq */
public final class C44985aq implements Serializable {

    /* renamed from: a */
    private final boolean f113927a;

    /* renamed from: b */
    private final String f113928b;

    /* renamed from: c */
    private final boolean f113929c;

    /* renamed from: id */
    public final String f113930id;

    public static /* synthetic */ C44985aq copy$default(C44985aq aqVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aqVar.f113930id;
        }
        if ((i & 2) != 0) {
            z = aqVar.f113929c;
        }
        return aqVar.copy(str, z);
    }

    public final boolean component2() {
        return this.f113929c;
    }

    public final C44985aq copy(String str, boolean z) {
        C52711k.m112240b(str, "id");
        return new C44985aq(str, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44985aq) {
                C44985aq aqVar = (C44985aq) obj;
                if (C52711k.m112239a((Object) this.f113930id, (Object) aqVar.f113930id)) {
                    if (this.f113929c == aqVar.f113929c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getDoorplateLevelId() {
        return this.f113928b;
    }

    public final int hashCode() {
        String str = this.f113930id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f113929c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isDoorplateLevel() {
        return this.f113927a;
    }

    public final boolean isPoi() {
        return this.f113929c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPoi(id=");
        sb.append(this.f113930id);
        sb.append(", isPoi=");
        sb.append(this.f113929c);
        sb.append(")");
        return sb.toString();
    }

    public C44985aq(String str, boolean z) {
        String str2;
        boolean z2;
        C52711k.m112240b(str, "id");
        this.f113930id = str;
        this.f113929c = z;
        boolean z3 = false;
        if (this.f113929c) {
            if (this.f113930id.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (!C52711k.m112239a((Object) this.f113930id, (Object) "0"))) {
                z3 = true;
            }
        }
        this.f113927a = z3;
        if (this.f113927a) {
            str2 = this.f113930id;
        } else {
            str2 = null;
        }
        this.f113928b = str2;
    }
}
