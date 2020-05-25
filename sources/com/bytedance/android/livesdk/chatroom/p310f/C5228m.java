package com.bytedance.android.livesdk.chatroom.p310f;

import android.os.Bundle;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.common.utility.C9414h;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.m */
public final /* synthetic */ class C5228m implements C1710e {

    /* renamed from: a */
    private final String f13953a;

    /* renamed from: b */
    private final long f13954b;

    /* renamed from: c */
    private final Map f13955c;

    public C5228m(String str, long j, Map map) {
        this.f13953a = str;
        this.f13954b = j;
        this.f13955c = map;
    }

    public final void accept(Object obj) {
        String str = this.f13953a;
        long j = this.f13954b;
        Map map = this.f13955c;
        Pair pair = (Pair) obj;
        C5225j.f13949a = false;
        if (pair == null || C9414h.m18630a((List) pair.first) || ((List) pair.first).get(0) == null) {
            C5225j.m11844a(0, -4);
            C4575an.m10981a((int) R.string.e_k);
            return;
        }
        Bundle a = C5225j.m11843a((List) pair.first, (C2974a) pair.second, str, j, map);
        C5225j.m11845a(j, a);
        TTLiveSDKContext.getHostService().mo10314g().mo15568a(C8830k.m17331e().mo13039a().context(), ((FeedItem) ((List) pair.first).get(0)).item.getId(), a);
    }
}
