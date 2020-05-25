package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.p */
final class C17932p extends C17930n<Bundle> {
    C17932p(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo34777a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34776a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo34779a(bundle2);
    }
}
