package com.p683ss.android.ugc.aweme.translation.p2371a;

import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37716a;
import com.p683ss.android.ugc.aweme.translation.api.TranslationApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.translation.a.b */
public final class C47354b extends C37716a<C47356c> {
    /* renamed from: a */
    public final void mo94636a(String str, String str2, String str3, String str4, int i) {
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final String str8 = str4;
        final int i2 = i;
        C473551 r2 = new Callable() {
            public final Object call() throws Exception {
                return TranslationApi.m102712a(str5, str6, str7, str8, i2);
            }
        };
        a.mo48750a(gVar, r2, 0);
    }
}
