package com.bytedance.android.livesdk.p267a.p268a;

import com.bytedance.android.livesdk.p267a.C4488c;
import com.bytedance.android.livesdk.p267a.C4489d;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52847n;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52786h;

@C4488c(mo10289a = "webcast_inroom_livelog")
/* renamed from: com.bytedance.android.livesdk.a.a.d */
public final class C4480d extends C4489d<JSONObject> {

    /* renamed from: com.bytedance.android.livesdk.a.a.d$a */
    static final class C4481a extends C52712l implements C52671b<String, C52847n<? extends String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f12248a;

        C4481a(JSONObject jSONObject) {
            this.f12248a = jSONObject;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (r0 == null) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r2 = (java.lang.String) r2
                org.json.JSONObject r0 = r1.f12248a
                java.lang.Object r0 = r0.get(r2)
                if (r0 == 0) goto L_0x0010
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                d.n r2 = p2628d.C52856t.m112465a(r2, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p267a.p268a.C4480d.C4481a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo10286a(Map<String, Object> map) {
        String str;
        Object obj = map.get("event_name");
        Object obj2 = map.get("params");
        if (obj2 != null) {
            str = obj2.toString();
        } else {
            str = null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (obj != null) {
                C8049c a = C8049c.m15979a();
                String obj3 = obj.toString();
                Iterator keys = jSONObject.keys();
                C52711k.m112236a((Object) keys, "keys()");
                a.mo14202a(obj3, C52550ab.m112046a(C52786h.m112348d(C52786h.m112336a(keys), new C4481a(jSONObject))), Room.class, C8059j.class);
            }
        } catch (Exception unused) {
        }
        mo10291a(null);
    }
}
