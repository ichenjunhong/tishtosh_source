package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;
import java.util.Objects;

/* renamed from: com.bytedance.android.live.base.model.user.d */
public class C3004d {
    @C17952c(mo34828a = "custom_verify")

    /* renamed from: a */
    public String f8829a;
    @C17952c(mo34828a = "enterprise_verify_reason")

    /* renamed from: b */
    public String f8830b;
    @C17952c(mo34828a = "authentication_badge")

    /* renamed from: c */
    public ImageModel f8831c;

    public int hashCode() {
        return Objects.hash(new Object[]{this.f8829a, this.f8830b, this.f8831c});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3004d)) {
            return false;
        }
        C3004d dVar = (C3004d) obj;
        if (!Objects.equals(this.f8829a, dVar.f8829a) || !Objects.equals(this.f8830b, dVar.f8830b) || !Objects.equals(this.f8831c, dVar.f8831c)) {
            return false;
        }
        return true;
    }
}
