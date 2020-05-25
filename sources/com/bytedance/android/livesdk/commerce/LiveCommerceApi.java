package com.bytedance.android.livesdk.commerce;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface LiveCommerceApi {

    /* renamed from: a */
    public static final C6701a f18272a = C6701a.f18273a;

    /* renamed from: com.bytedance.android.livesdk.commerce.LiveCommerceApi$a */
    public static final class C6701a {

        /* renamed from: a */
        static final /* synthetic */ C6701a f18273a = new C6701a();

        private C6701a() {
        }
    }

    @C12706h
    C2201v<C4172a<Object, C2974a>> fetchLiveCommerce(@C12699af String str, @C12724z(mo23894a = "user_id") long j, @C12724z(mo23894a = "offset") long j2, @C12724z(mo23894a = "count") long j3, @C12724z(mo23894a = "from") String str2);

    @C12706h
    C2201v<C4177d<C6712e>> fetchLiveGoodsUserStatus(@C12699af String str, @C12724z(mo23894a = "user_id") long j);
}
