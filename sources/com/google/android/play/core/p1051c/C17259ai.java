package com.google.android.play.core.p1051c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.c.ai */
public final class C17259ai {

    /* renamed from: a */
    private final Context f48729a;

    public C17259ai(Context context) {
        this.f48729a = context;
    }

    /* renamed from: a */
    private static String m42285a(Locale locale) {
        String str;
        String valueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            str = "";
        } else {
            String str2 = "_";
            String valueOf2 = String.valueOf(locale.getCountry());
            str = valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2);
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }

    /* renamed from: a */
    public final List<String> mo33544a() {
        Configuration configuration = this.f48729a.getResources().getConfiguration();
        if (VERSION.SDK_INT < 24) {
            return Collections.singletonList(m42285a(configuration.locale));
        }
        LocaleList locales = configuration.getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i = 0; i < locales.size(); i++) {
            arrayList.add(m42285a(locales.get(i)));
        }
        return arrayList;
    }
}
