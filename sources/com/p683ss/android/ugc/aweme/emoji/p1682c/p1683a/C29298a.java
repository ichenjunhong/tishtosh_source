package com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import java.util.Locale;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.a.a */
public final class C29298a {
    /* renamed from: c */
    public static final boolean m69089c(C29366a aVar) {
        C52711k.m112240b(aVar, "$this$isOriginAnimate");
        return m69087a(aVar, aVar.getAnimateType());
    }

    /* renamed from: d */
    public static final boolean m69090d(C29366a aVar) {
        C52711k.m112240b(aVar, "$this$isThumbnailAnimate");
        return m69087a(aVar, aVar.getStaticType());
    }

    /* renamed from: a */
    public static final String m69086a(C29366a aVar) {
        C52711k.m112240b(aVar, "$this$getEnDisplayName");
        if (aVar.getDisplayNameLangs() != null) {
            return (String) aVar.getDisplayNameLangs().get(Locale.ENGLISH.getLanguage());
        }
        return "";
    }

    /* renamed from: e */
    private static final String m69091e(C29366a aVar) {
        Locale f = m69092f(aVar);
        if (f == null) {
            return "";
        }
        String language = f.getLanguage();
        C52711k.m112236a((Object) language, "locale!!.getLanguage()");
        return language;
    }

    /* renamed from: f */
    private static final Locale m69092f(C29366a aVar) {
        if (VERSION.SDK_INT >= 24) {
            return C11010c.m22280a().getResources().getConfiguration().getLocales().get(0);
        }
        return C11010c.m22280a().getResources().getConfiguration().locale;
    }

    /* renamed from: b */
    public static final String m69088b(C29366a aVar) {
        C52711k.m112240b(aVar, "$this$getRealDisplayName");
        if (aVar.getStickerType() == 2) {
            return "";
        }
        if (TextUtils.equals(Locale.ENGLISH.getLanguage(), m69091e(aVar))) {
            String a = m69086a(aVar);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
        } else if (TextUtils.isEmpty(aVar.getDisplayName())) {
            return m69086a(aVar);
        }
        return aVar.getDisplayName();
    }

    /* renamed from: a */
    private static final boolean m69087a(C29366a aVar, String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str != null) {
                String lowerCase = str.toLowerCase();
                C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                if (!C52711k.m112239a((Object) lowerCase, (Object) "gif")) {
                    if (str != null) {
                        String lowerCase2 = str.toLowerCase();
                        C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                        if (C52711k.m112239a((Object) lowerCase2, (Object) "webp")) {
                            return true;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return true;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        return false;
    }
}
