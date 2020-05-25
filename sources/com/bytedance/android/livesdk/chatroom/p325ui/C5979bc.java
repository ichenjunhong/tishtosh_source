package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bc */
final /* synthetic */ class C5979bc implements OnClickListener {

    /* renamed from: a */
    private final C5977ba f15857a;

    /* renamed from: b */
    private final long f15858b;

    /* renamed from: c */
    private final String f15859c;

    C5979bc(C5977ba baVar, long j, String str) {
        this.f15857a = baVar;
        this.f15858b = j;
        this.f15859c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5977ba baVar = this.f15857a;
        long j = this.f15858b;
        String str = this.f15859c;
        dialogInterface.dismiss();
        baVar.mo11964a((int) R.string.ejz);
        baVar.f15841a.mo11371b(j, str);
        C4563ad.m10956a(baVar.f15843c, "shutdown_connection", "guest_connection", true);
    }
}
