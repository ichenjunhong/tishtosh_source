package com.bytedance.sdk.account.p849b.p851b;

import android.os.Bundle;
import com.bytedance.sdk.account.p849b.p850a.C13024a;
import com.bytedance.sdk.account.p849b.p850a.C13025b;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13031b;

/* renamed from: com.bytedance.sdk.account.b.b.a */
public final class C13026a implements C13025b {
    /* renamed from: a */
    public final boolean mo24667a(int i, Bundle bundle, C13024a aVar) {
        if (bundle == null || aVar == null) {
            return false;
        }
        if (i == 1) {
            C13030a aVar2 = new C13030a(bundle);
            if (!aVar2.checkArgs()) {
                return false;
            }
            if (aVar2.f34049f != null) {
                aVar2.f34049f = aVar2.f34049f.replace(" ", "");
            }
            if (aVar2.f34051h != null) {
                aVar2.f34051h = aVar2.f34051h.replace(" ", "");
            }
            if (aVar2.f34050g != null) {
                aVar2.f34050g = aVar2.f34050g.replace(" ", "");
            }
            aVar.onReq(aVar2);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            C13031b bVar = new C13031b(bundle);
            if (!bVar.checkArgs()) {
                return false;
            }
            aVar.onResp(bVar);
            return true;
        }
    }
}
