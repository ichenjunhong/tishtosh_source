package com.p683ss.android.ugc.aweme.live.settings;

import android.content.Context;
import com.bytedance.p753k.C12103a;
import com.bytedance.p753k.p754a.p755a.C12110e;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.live.settings.b */
final /* synthetic */ class C36166b implements C0011g {

    /* renamed from: a */
    private final Context f92606a;

    C36166b(Context context) {
        this.f92606a = context;
    }

    public final Object then(C0013i iVar) {
        Context context = this.f92606a;
        if (!iVar.mo33d()) {
            C36167c cVar = (C36167c) iVar.mo34e();
            if (!(cVar == null || cVar.status_code != 0 || cVar.f92607a == null)) {
                ((C12110e) C12103a.m24530b(C12110e.class)).mo22891a(context, cVar.f92607a);
            }
        }
        return null;
    }
}
