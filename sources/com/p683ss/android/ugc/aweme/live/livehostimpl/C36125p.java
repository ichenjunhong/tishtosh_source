package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.android.live.base.p192sp.C3018a;
import com.bytedance.android.livesdkapi.host.C8802f;
import com.bytedance.common.utility.C9425l;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.p753k.C12103a;
import com.p683ss.android.ugc.aweme.live.C36093g;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.p */
public final class C36125p implements C8802f {
    /* renamed from: a */
    public final void mo15568a(Context context, long j, Bundle bundle) {
        if (C9425l.m18651b(context) || C3018a.m8457b(context) || !(context instanceof Activity)) {
            ((C36093g) C12103a.m24530b(C36093g.class)).mo74847c().mo22887a(context, j, bundle);
        } else {
            new C10643a(context).mo18899b((int) R.string.fbg).mo18886a((int) R.string.ah2, (OnClickListener) new C36126q(context, j, bundle)).mo18900b((int) R.string.wf, C36127r.f92531a).mo18897a().mo18883c();
        }
    }
}
