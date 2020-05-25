package com.p683ss.android.ugc.aweme.p1403ba;

import android.app.Fragment;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;

/* renamed from: com.ss.android.ugc.aweme.ba.a */
public final class C23360a extends Fragment {

    /* renamed from: a */
    C23364b f62372a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("permissions"), 1);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f62372a != null) {
            this.f62372a.mo40906a(strArr, iArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
