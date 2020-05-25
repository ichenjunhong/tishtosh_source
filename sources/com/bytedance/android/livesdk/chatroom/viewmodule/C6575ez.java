package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8064d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ez */
final /* synthetic */ class C6575ez implements C1710e {

    /* renamed from: a */
    private final UserPermissionCheckWidget f17909a;

    C6575ez(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f17909a = userPermissionCheckWidget;
    }

    public final void accept(Object obj) {
        UserPermissionCheckWidget userPermissionCheckWidget = this.f17909a;
        Throwable th = (Throwable) obj;
        if (th instanceof C2949a) {
            C2949a aVar = (C2949a) th;
            int errorCode = aVar.getErrorCode();
            String prompt = aVar.getPrompt();
            if (errorCode >= 30001 && errorCode <= 30006) {
                if (!TextUtils.isEmpty(prompt)) {
                    C4575an.m10988a(prompt, 1);
                }
                C4495a.m10823a().mo10301a((Object) new C5204w(35));
                return;
            }
        }
        C8064d.m16005b();
        C8064d.m9718a(6, th.getStackTrace());
    }
}
