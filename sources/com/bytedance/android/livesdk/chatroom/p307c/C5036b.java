package com.bytedance.android.livesdk.chatroom.p307c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.p683ss.android.common.util.C18922i;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.b */
public final class C5036b {
    /* renamed from: a */
    public static void m11520a(Context context, C8692a aVar) {
        switch (aVar.f23801h) {
            case 2:
                C4514j.m10883j().mo10322c().mo10490a(context, C4704c.m11227b(aVar.f23799f).mo10505a(aVar.f23795b));
                return;
            case 3:
                C18922i iVar = new C18922i(aVar.f23799f);
                iVar.mo38778a("is_first_consume", String.valueOf(C4627a.m11090a(TTLiveSDKContext.getHostService().mo10315h().mo14521a())));
                C4495a.m10823a().mo10301a((Object) new C5161ag(iVar.mo38774a(), "banner"));
                return;
            default:
                C18922i iVar2 = new C18922i(aVar.f23799f);
                iVar2.mo38778a("title", aVar.f23795b);
                C4514j.m10883j().mo10328i().handle(context, Uri.parse(iVar2.mo38774a()));
                return;
        }
    }
}
