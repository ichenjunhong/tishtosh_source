package com.bytedance.android.live.broadcast.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.broadcast.model.c */
public final class C3455c {
    @C17952c(mo34828a = "enable_live_audio")

    /* renamed from: a */
    public boolean f9884a;
    @C17952c(mo34828a = "enable_live_third_party")

    /* renamed from: b */
    public boolean f9885b;
    @C17952c(mo34828a = "enable_live_screenshot")

    /* renamed from: c */
    public boolean f9886c;
    @C17952c(mo34828a = "toast")

    /* renamed from: d */
    public C3456a f9887d;

    /* renamed from: com.bytedance.android.live.broadcast.model.c$a */
    public static class C3456a {
        @C17952c(mo34828a = "new_anchor")

        /* renamed from: a */
        public boolean f9888a;
    }

    public C3455c() {
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3455c)) {
            return false;
        }
        C3455c cVar = (C3455c) obj;
        if (this.f9884a == cVar.f9884a && this.f9885b == cVar.f9885b && this.f9886c == cVar.f9886c) {
            return true;
        }
        return false;
    }

    public C3455c(boolean z, boolean z2, boolean z3) {
        this.f9884a = z;
        this.f9885b = z2;
        this.f9886c = z3;
    }
}
