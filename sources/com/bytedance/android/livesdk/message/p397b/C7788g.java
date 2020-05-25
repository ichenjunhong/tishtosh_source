package com.bytedance.android.livesdk.message.p397b;

import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.p399o.C8064d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.bytedance.android.livesdk.message.b.g */
final /* synthetic */ class C7788g implements C2205y {

    /* renamed from: a */
    private final List f21412a;

    C7788g(List list) {
        this.f21412a = list;
    }

    public final void subscribe(C2204x xVar) {
        for (C7859c cVar : this.f21412a) {
            if (cVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("msg_id", Long.valueOf(cVar.getMessageId()));
                hashMap.put("msg_type", cVar.getClass().getSimpleName());
                hashMap.put("msg_time", Long.valueOf(cVar.timestamp));
                C8064d.m16005b().mo9197a("ttlive_msgtype", (Map<String, ?>) hashMap);
            }
        }
    }
}
