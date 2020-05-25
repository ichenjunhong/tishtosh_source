package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ci */
final /* synthetic */ class C6501ci implements C5042b {

    /* renamed from: a */
    private final LinkPKMvpWidget f17810a;

    C6501ci(LinkPKMvpWidget linkPKMvpWidget) {
        this.f17810a = linkPKMvpWidget;
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        LinkPKMvpWidget linkPKMvpWidget = this.f17810a;
        LinearLayout linearLayout = (LinearLayout) view;
        C4632d dVar = (C4632d) obj;
        if (dVar == C4632d.PENAL) {
            linkPKMvpWidget.mo12430a((List) linkPKMvpWidget.f17152a.get("data_pk_mvp_list_anchor"), linkPKMvpWidget.f17185g, linearLayout, true);
            return;
        }
        if (dVar == C4632d.FINISHED) {
            linearLayout.setVisibility(8);
        }
    }
}
