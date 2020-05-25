package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.api.DislikeReasonApi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.c */
public final class C31060c extends C26832a<String> {

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.c$a */
    static final class C31061a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f81316a;

        C31061a(Object[] objArr) {
            this.f81316a = objArr;
        }

        public final /* synthetic */ Object call() {
            String str;
            Object obj = this.f81316a[0];
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                Object obj2 = this.f81316a[1];
                if (obj2 != null) {
                    String str2 = (String) obj2;
                    if (aweme == null) {
                        return "";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("dislike_reason_id", str2);
                    String str3 = "music_id";
                    if (aweme.getMusic() != null) {
                        str = aweme.getMusic().getMid();
                    } else {
                        str = "";
                    }
                    hashMap.put(str3, str);
                    hashMap.put("author_id", aweme.getAuthorUid());
                    DislikeReasonApi.f81337a.disLikeReason(hashMap).execute();
                    return str2;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    public final boolean sendRequest(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new C31061a(objArr), 0);
        return true;
    }
}
