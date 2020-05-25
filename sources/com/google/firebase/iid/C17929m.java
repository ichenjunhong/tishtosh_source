package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.m */
public final class C17929m extends C17930n<Void> {
    public C17929m(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo34777a() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34776a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo34779a(null);
        } else {
            mo34778a(new C17931o(4, "Invalid response to one way request"));
        }
    }
}
