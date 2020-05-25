package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bl */
final /* synthetic */ class C5990bl implements OnClickListener {

    /* renamed from: a */
    private final C5988bj f15891a;

    /* renamed from: b */
    private final long f15892b;

    /* renamed from: c */
    private final String f15893c;

    C5990bl(C5988bj bjVar, long j, String str) {
        this.f15891a = bjVar;
        this.f15892b = j;
        this.f15893c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5988bj bjVar = this.f15891a;
        long j = this.f15892b;
        String str = this.f15893c;
        dialogInterface.dismiss();
        bjVar.mo11981a((int) R.string.ejz);
        bjVar.f15879a.mo11416b(j, str);
        C4563ad.m10956a(bjVar.f15881c, "shutdown_connection", "anchor_connection", true);
    }
}
