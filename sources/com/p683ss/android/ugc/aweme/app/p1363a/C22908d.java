package com.p683ss.android.ugc.aweme.app.p1363a;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.p568a.C9836c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.C23297av;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.api.Api.C22959b;
import com.p683ss.android.ugc.aweme.app.api.Api.C22960c;
import com.p683ss.android.ugc.aweme.app.api.Api.C22961d;
import com.p683ss.android.ugc.aweme.app.api.C22962a;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.io.IOException;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.a.d */
public final class C22908d implements C23297av {
    /* renamed from: a */
    public final C17971f mo47686a() {
        C17971f gson = C47759cc.m103382a().getGson();
        C52711k.m112236a((Object) gson, "GsonProvider.get().getGson()");
        return gson;
    }

    /* renamed from: a */
    public final int mo47685a(Context context, Throwable th) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(th, "e");
        if (!(th instanceof C9836c)) {
            return 0;
        }
        if (((C9836c) th).getStatusCode() == 503) {
            return -19;
        }
        return -16;
    }

    /* renamed from: a */
    public final <T> T mo47687a(String str, int i, String str2, Class<T> cls, String str3, List<? extends C19180e> list) {
        T t;
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(cls, "cls");
        C52711k.m112240b(str3, "key");
        if (list != null) {
            if (String.class.equals(cls)) {
                t = Api.m56466a(str, i, str2, (C22960c<T>) C22961d.m56475a(), str3);
            } else {
                C22959b bVar = new C22959b(cls);
                if (C22962a.m56477a(C11010c.m22280a())) {
                    t = Api.m56467a(NetworkUtils.postFile(i, str, "file", str2, list), bVar, str3, str);
                } else {
                    throw new IOException();
                }
            }
        } else if (String.class.equals(cls)) {
            return Api.m56466a(str, i, str2, (C22960c<T>) C22961d.m56475a(), str3);
        } else {
            t = Api.m56466a(str, i, str2, (C22960c<T>) new C22959b<T>(cls), str3);
        }
        return t;
    }
}
