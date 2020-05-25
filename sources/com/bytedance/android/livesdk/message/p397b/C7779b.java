package com.bytedance.android.livesdk.message.p397b;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p399o.C8069h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.message.b.b */
public final class C7779b implements IInterceptor {

    /* renamed from: a */
    private long f21389a;

    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C8001m)) {
            return false;
        }
        C8001m mVar = (C8001m) iMessage;
        if (this.f21389a <= 0) {
            this.f21389a = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        }
        if (mVar.f21870c == null) {
            new C8069h().mo14225a(C42311c.f106865i, (Object) mVar.f21869b).mo14225a("is_visiable_to_senter", (Object) String.valueOf(mVar.f21871d)).mo14225a("support_display_text", (Object) String.valueOf(mVar.supportDisplayText())).mo14225a("client_user_id", (Object) String.valueOf(this.f21389a)).mo14228a("chat_message_exception_log", 0);
            return true;
        } else if (mVar.f21871d || mVar.f21870c == null || this.f21389a <= 0 || this.f21389a != mVar.f21870c.getId()) {
            return false;
        } else {
            return true;
        }
    }
}
