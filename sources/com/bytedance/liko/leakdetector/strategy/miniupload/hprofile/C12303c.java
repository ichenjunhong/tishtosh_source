package com.bytedance.liko.leakdetector.strategy.miniupload.hprofile;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.c */
public final class C12303c {
    @C17952c(mo34828a = "should_upload")

    /* renamed from: a */
    public final boolean f32448a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12303c) {
                if (this.f32448a == ((C12303c) obj).f32448a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f32448a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedUploadBean(shouldUpload=");
        sb.append(this.f32448a);
        sb.append(")");
        return sb.toString();
    }
}
