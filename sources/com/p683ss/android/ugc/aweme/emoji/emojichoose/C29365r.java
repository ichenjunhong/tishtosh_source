package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.support.p030v4.app.C0607a.C0609a;
import android.support.p030v4.view.p041a.C1008c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29291g;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.r */
final /* synthetic */ class C29365r implements C0609a {

    /* renamed from: a */
    private final C29291g f76918a;

    C29365r(C29291g gVar) {
        this.f76918a = gVar;
    }

    /* renamed from: a */
    public final void mo2102a(View view, C1008c cVar) {
        C29291g gVar = this.f76918a;
        if (!TextUtils.isEmpty(gVar.mo59218d())) {
            view.setContentDescription(gVar.mo59218d());
        }
        cVar.mo3139b((CharSequence) DmtTextView.class.getName());
    }
}
