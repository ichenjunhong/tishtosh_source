package com.bytedance.android.livesdk.p267a.p268a;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.livesdk.p267a.C4487b;
import com.bytedance.android.livesdk.p267a.C4488c;
import com.bytedance.android.livesdk.p267a.C4489d;
import com.bytedance.android.livesdk.p267a.C4489d.C4490a;
import com.bytedance.common.utility.C9414h;
import com.google.gson.p1076a.C17952c;
import com.google.gson.p1077b.C17956a;
import java.util.List;
import java.util.Map;

@C4488c(mo10289a = "webcast_inroom_actions")
/* renamed from: com.bytedance.android.livesdk.a.a.e */
public final class C4482e extends C4489d<Void> {

    /* renamed from: b */
    final String f12249b = "actions";

    /* renamed from: com.bytedance.android.livesdk.a.a.e$a */
    public static class C4485a {
        @C17952c(mo34828a = "schema")

        /* renamed from: a */
        public String f12253a;
        @C17952c(mo34828a = "next_actions")

        /* renamed from: b */
        public List<String> f12254b;
    }

    /* renamed from: a */
    public final void mo10286a(Map<String, Object> map) throws Exception {
        List<C4485a> list = (List) C2942b.m8369a().mo34885a(String.valueOf(map.get("actions")), new C17956a<List<C4485a>>() {
        }.f49843c);
        if (!C9414h.m18630a(list)) {
            for (C4485a aVar : list) {
                String str = aVar.f12253a;
                final List<String> list2 = aVar.f12254b;
                C4487b.m10802a().mo10288a(str, new C4490a() {
                    /* renamed from: a */
                    public final void mo10284a(Object obj) {
                        for (String a : list2) {
                            C4487b.m10802a().mo10287a(a);
                        }
                    }
                });
            }
            mo10291a(null);
        }
    }
}
