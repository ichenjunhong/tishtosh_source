package com.p683ss.android.ugc.aweme.commercialize.star;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.d */
public final class C26260d {

    /* renamed from: a */
    static C26261a f69332a = new C26261a("ad_tcm_schema", f69334c);

    /* renamed from: b */
    public static final C26260d f69333b = new C26260d();

    /* renamed from: c */
    private static final String f69334c = f69334c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.d$a */
    static final class C26261a {

        /* renamed from: a */
        private final String f69335a;

        /* renamed from: a */
        public final String mo53912a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                String adTcmSchema = b.getFeAnchorAdConf().getAdTcmSchema();
                if (TextUtils.isEmpty(adTcmSchema)) {
                    return this.f69335a;
                }
                C52711k.m112236a((Object) adTcmSchema, "url");
                return adTcmSchema;
            } catch (Exception unused) {
                return this.f69335a;
            }
        }

        public C26261a(String str, String str2) {
            C52711k.m112240b(str, "key");
            C52711k.m112240b(str2, "default");
            this.f69335a = str2;
        }
    }

    private C26260d() {
    }
}
