package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import com.snapchat.kit.sdk.C18246b.C18248a;
import dagger.p2651a.C52869f;
import java.util.Arrays;

public class SnapKit {

    /* renamed from: a */
    private static SnapKit f50371a;

    /* renamed from: b */
    private final SnapKitComponent f50372b;

    public static void start(Context context) throws IllegalStateException {
        m44460a(context);
    }

    static SnapKitComponent getComponent(Context context) {
        return m44460a(context).f50372b;
    }

    public static void unlink(Context context) {
        getComponent(context).authTokenManager().revokeToken();
    }

    /* renamed from: a */
    private static synchronized SnapKit m44460a(Context context) {
        SnapKit snapKit;
        synchronized (SnapKit.class) {
            if (f50371a == null) {
                f50371a = new SnapKit(context.getApplicationContext());
            }
            snapKit = f50371a;
        }
        return snapKit;
    }

    private SnapKit(Context context) throws IllegalStateException {
        ApplicationInfo applicationInfo;
        String[] strArr;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                String string = bundle.getString("com.snapchat.kit.sdk.clientId");
                String string2 = bundle.getString("com.snapchat.kit.sdk.redirectUrl", "");
                int i = bundle.getInt("com.snapchat.kit.sdk.scopes", 0);
                if (i == 0) {
                    strArr = new String[0];
                } else {
                    strArr = context.getResources().getStringArray(i);
                }
                if (!TextUtils.isEmpty(string)) {
                    C18248a aVar = new C18248a();
                    aVar.f50409a = (C18249c) C52869f.m112470a(new C18249c(context, string, string2, Arrays.asList(strArr)));
                    if (aVar.f50409a != null) {
                        this.f50372b = new C18246b(aVar);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(C18249c.class.getCanonicalName());
                    sb.append(" must be set");
                    throw new IllegalStateException(sb.toString());
                }
                throw new IllegalStateException("client id must be set!");
            }
            throw new IllegalStateException("No metadata for the current app!");
        } catch (NameNotFoundException unused) {
            throw new IllegalStateException("Could not get metadata for current package");
        }
    }
}
