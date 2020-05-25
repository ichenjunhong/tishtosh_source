package com.p683ss.android.ugc.aweme.location;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.p510b.C9225c;

/* renamed from: com.ss.android.ugc.aweme.location.v */
public final class C36288v implements C9225c {

    /* renamed from: a */
    private final C36260e f92885a;

    public final void onLocateStop(String str) {
    }

    public C36288v(C36260e eVar) {
        this.f92885a = eVar;
    }

    public final void onLocateStart(String str) {
        C36260e eVar = this.f92885a;
        if (eVar != null) {
            eVar.mo75079a(str);
        }
    }

    public final void onLocateChange(String str, BDLocation bDLocation) {
        boolean z;
        C36260e eVar = this.f92885a;
        if (eVar != null) {
            if (bDLocation != null) {
                z = bDLocation.isCache();
            } else {
                z = true;
            }
            eVar.mo75081a(str, z);
        }
    }

    public final void onLocateError(String str, BDLocationException bDLocationException) {
        C36271k kVar;
        C36260e eVar = this.f92885a;
        if (eVar != null) {
            if (bDLocationException != null) {
                kVar = new C36271k(bDLocationException.getCode(), bDLocationException.getCauses());
            } else {
                kVar = null;
            }
            eVar.mo75080a(str, kVar);
        }
    }
}
