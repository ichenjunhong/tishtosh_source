package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.C8716q;
import com.bytedance.android.livesdkapi.depend.model.live.C8716q.C8717a;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9414h;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.model.ay */
public class C7820ay extends C7859c {

    /* renamed from: a */
    public List<C8716q> f21529a;
    @C17952c(mo34828a = "user_armies_map")

    /* renamed from: b */
    Map<Long, C7821a> f21530b;
    @C17952c(mo34828a = "user_armies_list")

    /* renamed from: c */
    List<C7821a> f21531c;

    /* renamed from: com.bytedance.android.livesdk.message.model.ay$a */
    public static class C7821a {
        @C17952c(mo34828a = "user_armies")

        /* renamed from: a */
        List<C7822a> f21532a;

        /* renamed from: com.bytedance.android.livesdk.message.model.ay$a$a */
        public static class C7822a {
            @C17952c(mo34828a = "user_id")

            /* renamed from: a */
            public long f21533a;
            @C17952c(mo34828a = "score")

            /* renamed from: b */
            public int f21534b;
            @C17952c(mo34828a = "nickname")

            /* renamed from: c */
            public String f21535c;
            @C17952c(mo34828a = "avatar_thumb")

            /* renamed from: d */
            public ImageModel f21536d;
        }
    }

    public C7820ay() {
        this.type = C8629a.LINK_MIC_ARMIES;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14143a() {
        this.f21529a = new ArrayList();
        if (!C9414h.m18630a(this.f21531c)) {
            for (C7821a aVar : this.f21531c) {
                C8716q qVar = new C8716q();
                if (aVar != null) {
                    ArrayList arrayList = new ArrayList();
                    if (aVar.f21532a != null) {
                        for (C7822a aVar2 : aVar.f21532a) {
                            C8717a aVar3 = new C8717a();
                            aVar3.f23922a = aVar2.f21533a;
                            aVar3.f23923b = aVar2.f21534b;
                            aVar3.f23924c = aVar2.f21535c;
                            aVar3.f23925d = aVar2.f21536d;
                            arrayList.add(aVar3);
                        }
                    }
                    qVar.f23919b = arrayList;
                    this.f21529a.add(qVar);
                }
            }
        }
    }
}
