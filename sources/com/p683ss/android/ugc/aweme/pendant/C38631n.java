package com.p683ss.android.ugc.aweme.pendant;

import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.pendant.n */
public final class C38631n {

    /* renamed from: a */
    static C52670a<C52860x> f98262a;

    /* renamed from: b */
    public static final C38631n f98263b = new C38631n();

    /* renamed from: c */
    private static long f98264c = -1;

    /* renamed from: d */
    private static final ShredCollectUploadApi f98265d = ((ShredCollectUploadApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://luckycat-ameboon.snssdk.com").create(ShredCollectUploadApi.class));

    /* renamed from: e */
    private static List<Integer> f98266e = new ArrayList();

    private C38631n() {
    }
}
