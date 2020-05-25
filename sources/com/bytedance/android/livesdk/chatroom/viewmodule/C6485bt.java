package com.bytedance.android.livesdk.chatroom.viewmodule;

import org.json.JSONObject;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bt */
public final /* synthetic */ class C6485bt implements C1711f {

    /* renamed from: a */
    private final String f17785a;

    public C6485bt(String str) {
        this.f17785a = str;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        return new JSONObject(this.f17785a);
    }
}
