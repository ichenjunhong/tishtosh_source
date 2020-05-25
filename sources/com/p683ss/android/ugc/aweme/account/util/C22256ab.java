package com.p683ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a.C20996b;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.util.ab */
final /* synthetic */ class C22256ab implements C0011g {

    /* renamed from: a */
    private final Bundle f60027a;

    C22256ab(Bundle bundle) {
        this.f60027a = bundle;
    }

    public final Object then(C0013i iVar) {
        String str;
        Bundle bundle = this.f60027a;
        if (iVar.mo33d()) {
            String str2 = "";
            if (iVar.mo35f() instanceof C23459a) {
                C23459a aVar = (C23459a) iVar.mo35f();
                String valueOf = String.valueOf(aVar.getErrorCode());
                str = aVar.getErrorMsg();
                str2 = valueOf;
            } else {
                str = iVar.mo35f().getMessage();
            }
            C20994a.m53364a(str2, str, C20996b.REFRESH_AWEME_USER, null, "");
        } else if (iVar.mo34e() != null) {
            C20994a.m53360a(C20996b.REFRESH_AWEME_USER, null, ((User) iVar.mo34e()).getUid());
        } else {
            C20994a.m53364a("", "user == null", C20996b.REFRESH_AWEME_USER, null, "");
        }
        if (!iVar.mo33d()) {
            if (iVar.mo34e() != null) {
                C23826bi.m58449a().queryUserSync((User) iVar.mo34e());
            }
            return bundle;
        }
        throw iVar.mo35f();
    }
}
