package com.bytedance.android.livesdk.chatroom.viewmodule;

import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.fb */
final /* synthetic */ class C6580fb implements C1710e {

    /* renamed from: a */
    private final VoteWidget f17918a;

    C6580fb(VoteWidget voteWidget) {
        this.f17918a = voteWidget;
    }

    public final void accept(Object obj) {
        this.f17918a.f17667a.mo10525a("H5_commonMessage", new JSONObject((String) obj));
    }
}
