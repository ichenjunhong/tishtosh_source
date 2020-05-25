package com.p683ss.android.ugc.aweme.commercialize.egg;

import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.h */
public final class C25788h {

    /* renamed from: a */
    public static final C25788h f68196a = new C25788h();

    private C25788h() {
    }

    /* renamed from: a */
    public static final boolean m62410a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            CommerceEggConfig commerceEggConfig = b.getCommerceEggConfig();
            if (commerceEggConfig == null) {
                return false;
            }
            Boolean enableDiggEggRefactor = commerceEggConfig.getEnableDiggEggRefactor();
            if (enableDiggEggRefactor != null) {
                return enableDiggEggRefactor.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m62411b() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            CommerceEggConfig commerceEggConfig = b.getCommerceEggConfig();
            if (commerceEggConfig == null) {
                return false;
            }
            Boolean enableCommentEggRefactor = commerceEggConfig.getEnableCommentEggRefactor();
            if (enableCommentEggRefactor != null) {
                return enableCommentEggRefactor.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m62412c() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            CommerceEggConfig commerceEggConfig = b.getCommerceEggConfig();
            if (commerceEggConfig == null) {
                return false;
            }
            Boolean enableSearchEggRefactor = commerceEggConfig.getEnableSearchEggRefactor();
            if (enableSearchEggRefactor != null) {
                return enableSearchEggRefactor.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
