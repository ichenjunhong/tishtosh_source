package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dp */
final /* synthetic */ class C6535dp implements C1710e {

    /* renamed from: a */
    private final LiveShareWidget f17859a;

    C6535dp(LiveShareWidget liveShareWidget) {
        this.f17859a = liveShareWidget;
    }

    public final void accept(Object obj) {
        LiveShareWidget liveShareWidget = this.f17859a;
        ShareReportResult shareReportResult = (ShareReportResult) ((C4177d) obj).data;
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && liveShareWidget.f17308b != null) {
            IMessageManager iMessageManager = (IMessageManager) liveShareWidget.dataCenter.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(C5006c.m11497a(liveShareWidget.f17308b.getId(), shareReportResult.getDisplayText(), liveShareWidget.f17309c), true);
            }
        }
    }
}
