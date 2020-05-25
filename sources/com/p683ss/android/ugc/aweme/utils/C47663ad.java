package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.p030v4.app.Fragment;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.trill.R;
import java.io.File;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ad */
public final class C47663ad {
    /* renamed from: a */
    public static final void m103171a(Activity activity, Fragment fragment, int i, String str, String str2) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
        if (!C52711k.m112239a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            C9432q.m18673a((Context) activity, 2131952652, (int) R.string.cot);
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str2);
        intent.addFlags(1);
        Context context = activity;
        intent.putExtra("output", C19547d.m47838a(context, file2));
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i);
            } catch (Exception unused) {
                C9432q.m18673a(context, 2131952652, (int) R.string.coq);
                return;
            }
        } else {
            activity.startActivityForResult(intent, i);
        }
        BusinessComponentServiceUtils.getIMBusinessService().mo70370a(true);
    }
}
