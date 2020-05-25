package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.y */
final /* synthetic */ class C6619y implements OnClickListener {

    /* renamed from: a */
    private final DailyRankWidget f17978a;

    C6619y(DailyRankWidget dailyRankWidget) {
        this.f17978a = dailyRankWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17978a.mo12330a("https://hotsoon.snssdk.com/falcon/live_inroom/page/guard/index.html?charge=1&room_id=%s&anchor_id=%s&user_id=%s&source=%s");
        dialogInterface.dismiss();
    }
}
