package com.p683ss.android.ugc.aweme.i18n.language.p1805a;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.p2402x.C48410a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.c */
public final class C33102c {
    /* renamed from: a */
    private static boolean m76092a() {
        return C48410a.m66172c();
    }

    /* renamed from: a */
    public static Locale m76088a(Context context) {
        return context.getResources().getConfiguration().locale;
    }

    /* renamed from: b */
    public static Context m76095b(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return m76097c(context);
        }
        return context;
    }

    /* renamed from: c */
    private static Context m76097c(Context context) {
        Resources resources = context.getResources();
        Locale a = C33106b.m76104a(context);
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(a);
        configuration.setLocales(new LocaleList(new Locale[]{a}));
        try {
            if (I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().isArabicLang(context)) {
                configuration.screenLayout = (configuration.screenLayout & -193) | 128;
            }
        } catch (Throwable unused) {
        }
        return context.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    private static void m76091a(Configuration configuration, Locale locale) {
        if (VERSION.SDK_INT < 17) {
            configuration.locale = locale;
        } else {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: b */
    private static void m76096b(Context context, Locale locale) {
        if (context != null) {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            m76091a(configuration, locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    /* renamed from: a */
    public static void m76089a(Context context, Locale locale) {
        m76096b(context, locale);
        if (!(context instanceof Application)) {
            m76096b(context.getApplicationContext(), locale);
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country)) {
            country = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        C33106b.m76106a(context, "key_current_region", country);
        C33106b.m76106a(context, "pref_language_key", locale.getLanguage());
    }

    /* renamed from: a */
    private static boolean m76093a(String str, String str2) {
        if ((str != null || str2 != null) && !"".equals(str) && !"".equals(str2) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m76094a(Locale locale, Locale locale2) {
        if (!m76093a(locale.getLanguage(), locale2.getLanguage()) || !m76093a(locale.getCountry(), locale2.getCountry()) || !m76093a(locale.getVariant(), locale2.getVariant())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m76090a(final Context context, final Locale locale, boolean z, final C33104d dVar) {
        if (m76094a(locale, context.getResources().getConfiguration().locale)) {
            if (dVar != null) {
                dVar.mo70132a();
            }
        } else if (!z || !m76092a()) {
            m76089a(context, locale);
            if (dVar != null) {
                dVar.mo70132a();
            }
        } else {
            C48410a aVar = new C48410a(new Locale(locale.getLanguage()));
            aVar.mo55967a(new C27559n() {

                /* renamed from: a */
                WeakReference<Context> f85932a = new WeakReference<>(context);

                /* renamed from: b */
                public final void mo50034b(boolean z) {
                }

                /* renamed from: a */
                public final void mo50033a(boolean z) {
                    Context context = (Context) this.f85932a.get();
                    if (context != null && !z) {
                        C33102c.m76089a(context, locale);
                        if (dVar != null) {
                            dVar.mo70132a();
                        }
                    }
                }
            });
            aVar.mo55969b();
        }
    }
}
