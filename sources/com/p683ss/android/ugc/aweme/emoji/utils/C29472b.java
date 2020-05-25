package com.p683ss.android.ugc.aweme.emoji.utils;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.b */
public final class C29472b {

    /* renamed from: a */
    private static final String f77202a;

    /* renamed from: b */
    private static final String f77203b;

    /* renamed from: c */
    private static EmojiApi f77204c;

    /* renamed from: a */
    public static EmojiApi m69540a() {
        return f77204c;
    }

    static {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C11010c.m22282b().f29547a);
        f77202a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f77202a);
        sb2.append("/aweme/v1/");
        f77203b = sb2.toString();
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f77204c = (EmojiApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(f77203b).create(EmojiApi.class);
        }
    }
}
