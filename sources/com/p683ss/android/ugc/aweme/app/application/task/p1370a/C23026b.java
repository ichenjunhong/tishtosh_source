package com.p683ss.android.ugc.aweme.app.application.task.p1370a;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import android.webkit.WebView;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.trill.app.TrillApplication;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.app.application.task.a.b */
final /* synthetic */ class C23026b implements Runnable {

    /* renamed from: a */
    private final C23025a f61365a;

    C23026b(C23025a aVar) {
        this.f61365a = aVar;
    }

    public final void run() {
        C23025a aVar = this.f61365a;
        try {
            String[] stringArray = AwemeApplication.m56199a().getResources().getStringArray(R.array.aw);
            int length = stringArray.length;
            int i = 0;
            while (i < length) {
                if (!TextUtils.equals(Build.MODEL.toLowerCase(), stringArray[i].toLowerCase())) {
                    i++;
                } else {
                    return;
                }
            }
            try {
                new WebView(TrillApplication.m56199a()).destroy();
            } catch (NoSuchMethodError e) {
                C32458a.m75148a((Throwable) e);
            }
            try {
                Configuration configuration = TrillApplication.m56201c().getResources().getConfiguration();
                Locale a = C33098b.m76080a().mo70129a(C33106b.m76108b());
                Locale.setDefault(a);
                if (VERSION.SDK_INT >= 24) {
                    configuration.setLocale(a);
                    configuration.setLocales(new LocaleList(new Locale[]{a}));
                } else {
                    configuration.locale = a;
                }
                TrillApplication.m56201c().getResources().updateConfiguration(configuration, TrillApplication.m56201c().getResources().getDisplayMetrics());
            } catch (Exception e2) {
                C32458a.m75148a((Throwable) e2);
            }
        } catch (Exception e3) {
            C32458a.m75143a(e3);
        }
    }
}
