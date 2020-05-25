package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.poi.model.au */
public final class C39115au extends BaseResponse {
    @C17952c(mo34828a = "is_suc")

    /* renamed from: a */
    public final boolean f99783a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39115au) {
                if (this.f99783a == ((C39115au) obj).f99783a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f99783a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiUploadImageResponse(isSuc=");
        sb.append(this.f99783a);
        sb.append(")");
        return sb.toString();
    }
}
