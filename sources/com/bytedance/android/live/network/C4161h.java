package com.bytedance.android.live.network;

import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.C2942b.C2943a;
import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.google.gson.C17971f;
import java.lang.reflect.Type;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.network.h */
public final class C4161h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f11349a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4161h.class), "instance", "getInstance()Lcom/google/gson/Gson;"))};

    /* renamed from: b */
    public static final C4161h f11350b = new C4161h();

    /* renamed from: c */
    private static final C52668f f11351c = C52732g.m112285a(C4162a.f11352a);

    /* renamed from: com.bytedance.android.live.network.h$a */
    static final class C4162a extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C4162a f11352a = new C4162a();

        C4162a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C17971f a = C2942b.m8369a();
            return C2943a.f8646a.mo34896a((Type) C4175b.class, (Object) new BaseResponseTypeAdapter(a)).mo34896a((Type) C4177d.class, (Object) new ResponseTypeAdapter(a)).mo34896a((Type) C4172a.class, (Object) new BaseListResponseTypeAdapter(a)).mo34896a((Type) C4176c.class, (Object) new ListResponseTypeAdapter(a)).mo34900d();
        }
    }

    private C4161h() {
    }

    /* renamed from: a */
    public final C17971f mo9558a() {
        return (C17971f) f11351c.getValue();
    }
}
