package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.t */
final /* synthetic */ class C40459t implements OnShowListener {

    /* renamed from: a */
    private final C40454p f103296a;

    C40459t(C40454p pVar) {
        this.f103296a = pVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C40454p pVar = this.f103296a;
        if (pVar.f103287h == 1) {
            C26890h.m65011a("remark_toast", C23089d.m56640a().mo47829a("action_type", "show").f61491a);
        }
        C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C40461v<TResult,TContinuationResult>(pVar), C0013i.f25b);
    }
}
