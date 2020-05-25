package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d.C5042b;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.cl */
final /* synthetic */ class C6504cl implements C5042b {

    /* renamed from: a */
    private final LinkPKMvpWidget f17813a;

    C6504cl(LinkPKMvpWidget linkPKMvpWidget) {
        this.f17813a = linkPKMvpWidget;
    }

    /* renamed from: a */
    public final void mo10903a(View view, Object obj) {
        LinkPKMvpWidget linkPKMvpWidget = this.f17813a;
        LinearLayout linearLayout = (LinearLayout) view;
        C4632d dVar = (C4632d) obj;
        if (dVar == C4632d.PENAL) {
            linkPKMvpWidget.mo12430a((List) linkPKMvpWidget.f17152a.get("data_pk_mvp_list_guest"), linkPKMvpWidget.f17186h, linearLayout, false);
            return;
        }
        if (dVar == C4632d.FINISHED) {
            linearLayout.setVisibility(8);
        }
    }
}
