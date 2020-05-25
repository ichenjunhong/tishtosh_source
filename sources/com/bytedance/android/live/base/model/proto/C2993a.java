package com.bytedance.android.live.base.model.proto;

import com.bytedance.android.livesdk.feed.feed.C6946g;
import com.bytedance.android.livesdk.feed.feed.C6949j;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.base.model.proto.a */
public final class C2993a {

    /* renamed from: a */
    public static final Map<Class, C2888b> f8805a = new HashMap();

    static {
        new C2997e();
        C2997e.m8388a(f8805a);
        new _ProtoDecoders_LIVEBASE().inject(f8805a);
        new C2995c();
        f8805a.put(C6946g.class, new C6949j());
    }
}
