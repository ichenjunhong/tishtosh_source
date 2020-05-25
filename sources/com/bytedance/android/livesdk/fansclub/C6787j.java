package com.bytedance.android.livesdk.fansclub;

import android.text.TextUtils;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.fansclub.j */
final /* synthetic */ class C6787j implements C1710e {

    /* renamed from: a */
    private final LiveFansClubEntryWidget f18590a;

    C6787j(LiveFansClubEntryWidget liveFansClubEntryWidget) {
        this.f18590a = liveFansClubEntryWidget;
    }

    public final void accept(Object obj) {
        LiveFansClubEntryWidget liveFansClubEntryWidget = this.f18590a;
        C6784g gVar = (C6784g) obj;
        if (gVar == null || gVar.f18587b != 0) {
            C9432q.m18691b(liveFansClubEntryWidget.contentView, 8);
            return;
        }
        C6791n nVar = gVar.f18586a;
        if (nVar != null) {
            if (!TextUtils.isEmpty(nVar.f18595a)) {
                liveFansClubEntryWidget.f18572e = nVar.f18595a;
            }
            if (nVar.f18596b >= 0) {
                liveFansClubEntryWidget.f18573f = (long) nVar.f18596b;
            }
            liveFansClubEntryWidget.f18574g = nVar.f18597c;
            C9432q.m18691b(liveFansClubEntryWidget.contentView, 0);
            if (!TextUtils.isEmpty(nVar.f18595a) && nVar.f18596b >= 0) {
                liveFansClubEntryWidget.f18568a.setText(liveFansClubEntryWidget.getContext().getResources().getString(R.string.ea8, new Object[]{liveFansClubEntryWidget.f18572e, C4204a.m10420a(liveFansClubEntryWidget.f18573f, "w")}));
            } else if (liveFansClubEntryWidget.f18576i) {
                liveFansClubEntryWidget.f18568a.setText(liveFansClubEntryWidget.getContext().getResources().getString(R.string.ea5));
            } else {
                liveFansClubEntryWidget.f18568a.setText(liveFansClubEntryWidget.getContext().getResources().getString(R.string.ea4));
            }
            liveFansClubEntryWidget.f18575h = nVar.f18598d;
        }
    }
}
