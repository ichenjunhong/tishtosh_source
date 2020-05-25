package dagger.android;

import android.app.Activity;
import android.app.Application;
import com.C2240a;
import dagger.p2651a.C52869f;

/* renamed from: dagger.android.a */
public final class C52870a {
    /* renamed from: a */
    public static void m112474a(Activity activity) {
        C52869f.m112471a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof C52876d) {
            C52871b e = ((C52876d) application).mo47846e();
            C52869f.m112472a(e, "%s.activityInjector() returned null", application.getClass());
            e.mo56093a(activity);
            return;
        }
        throw new RuntimeException(C2240a.m6772a("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), C52876d.class.getCanonicalName()}));
    }
}
