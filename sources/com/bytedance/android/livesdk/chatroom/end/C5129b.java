package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import java.util.HashMap;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.b */
final /* synthetic */ class C5129b implements C1711f {

    /* renamed from: a */
    static final C1711f f13718a = new C5129b();

    private C5129b() {
    }

    public final Object apply(Object obj) {
        C8722v vVar = (C8722v) obj;
        HashMap hashMap = new HashMap();
        if (vVar.f23957c == null || vVar.f23957c.f23830b == 0) {
            hashMap.put("channel_id", String.valueOf(vVar.f23955a));
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("channel_id", String.valueOf(vVar.f23955a));
            hashMap.put("pk_id", String.valueOf(vVar.f23957c.f23833e));
            hashMap.put("connection_type", "pk");
            hashMap.put("theme", vVar.f23957c.f23831c);
            hashMap.put("pk_time", String.valueOf(vVar.f23957c.f23830b));
        }
        return hashMap;
    }
}
