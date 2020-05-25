package android.support.p043v7.view;

import android.content.Context;
import android.content.res.Configuration;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.view.a */
public final class C1217a {

    /* renamed from: a */
    public Context f4017a;

    /* renamed from: b */
    public final boolean mo3936b() {
        return this.f4017a.getResources().getBoolean(R.bool.a);
    }

    /* renamed from: c */
    public final boolean mo3937c() {
        if (this.f4017a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo3935a() {
        Configuration configuration = this.f4017a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    private C1217a(Context context) {
        this.f4017a = context;
    }

    /* renamed from: a */
    public static C1217a m3676a(Context context) {
        return new C1217a(context);
    }
}
