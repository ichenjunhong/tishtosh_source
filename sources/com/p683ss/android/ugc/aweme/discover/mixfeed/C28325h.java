package com.p683ss.android.ugc.aweme.discover.mixfeed;

import android.content.Context;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.crossplatform.preload.C27278a.C27279a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27300c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FEConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeConfigCollection;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.h */
public final class C28325h {

    /* renamed from: a */
    public static final C28325h f74308a = new C28325h();

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.h$a */
    public static final class C28326a implements C27279a {

        /* renamed from: a */
        final /* synthetic */ Context f74309a;

        public C28326a(Context context) {
            this.f74309a = context;
        }

        /* renamed from: a */
        public final C27300c mo55653a(String str) {
            C52711k.m112240b(str, "baseUrl");
            return new C27300c(str, this.f74309a);
        }
    }

    private C28325h() {
    }

    /* renamed from: a */
    public static String m67252a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            FeConfigCollection feConfigCollection = b.getFeConfigCollection();
            C52711k.m112236a((Object) feConfigCollection, "SettingsReader.get().feConfigCollection");
            FEConfig rnGeneralSingleCard = feConfigCollection.getRnGeneralSingleCard();
            C52711k.m112236a((Object) rnGeneralSingleCard, "SettingsReader.get().feC…ction.rnGeneralSingleCard");
            String schema = rnGeneralSingleCard.getSchema();
            C52711k.m112236a((Object) schema, "SettingsReader.get().feC…nGeneralSingleCard.schema");
            return schema;
        } catch (C10174a unused) {
            return "";
        }
    }
}
