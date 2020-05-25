package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.f */
public class C19578f implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("badgenumber", i);
            try {
                context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle);
            } catch (Throwable th) {
                throw new C19610g(th.getMessage());
            }
        }
    }
}
