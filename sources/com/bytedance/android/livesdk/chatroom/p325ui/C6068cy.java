package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.presenter.C5793ao;
import com.bytedance.android.livesdk.chatroom.presenter.C5811bb;
import com.bytedance.android.livesdk.chatroom.presenter.C5812bc;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8341k.C8343b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy */
final /* synthetic */ class C6068cy implements OnClickListener {

    /* renamed from: a */
    private final C6049cl f16225a;

    /* renamed from: b */
    private final String f16226b;

    C6068cy(C6049cl clVar, String str) {
        this.f16225a = clVar;
        this.f16226b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6049cl clVar = this.f16225a;
        String str = this.f16226b;
        dialogInterface.dismiss();
        if (clVar.f16188m.getFollowInfo() != null) {
            C5793ao aoVar = clVar.f16195t;
            Activity activity = clVar.f16178c;
            TTLiveSDKContext.getHostService().mo10315h().mo14519a(((C8343b) ((C8343b) ((C8343b) ((C8343b) ((C8343b) C8334f.m16519c().mo14547a(activity)).mo14503a(clVar.f16191p)).mo14546a((int) clVar.f16188m.getFollowInfo().getFollowStatus())).mo14548a(str)).mo14550b(clVar.f16192q.getId())).mo14551c()).mo6505a((C1710e<? super T>) new C5811bb<Object>(aoVar), (C1710e<? super Throwable>) new C5812bc<Object>(aoVar));
            clVar.f16193r.mo10375a(false, clVar.f16191p, clVar.f16197v, clVar.f16190o, clVar.f16189n, clVar.f16198w, LinkCrossRoomDataHolder.m11103a().f12614e == clVar.f16188m.getId());
        }
    }
}
