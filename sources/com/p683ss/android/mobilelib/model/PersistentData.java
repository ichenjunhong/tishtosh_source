package com.p683ss.android.mobilelib.model;

import android.content.Context;
import com.bytedance.common.utility.p525e.C9400a;
import com.bytedance.common.utility.p525e.C9400a.C9401a;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.mobilelib.model.PersistentData */
public class PersistentData {
    private static PersistentData sInstance;
    private String mLastLoginMobile = "";
    private String mMobileRegexJson = "[['^(\\+86)?(1\\d{10})$', '$2']]";

    private PersistentData() {
    }

    public String getLastLoginMobile() {
        if (this.mLastLoginMobile == null) {
            return "";
        }
        return this.mLastLoginMobile;
    }

    public static synchronized PersistentData inst() {
        PersistentData persistentData;
        synchronized (PersistentData.class) {
            if (sInstance == null) {
                sInstance = new PersistentData();
            }
            persistentData = sInstance;
        }
        return persistentData;
    }

    public void saveLastLoginMobile(Context context, String str) {
        this.mLastLoginMobile = str;
        StringBuilder sb = new StringBuilder("pref_id_");
        sb.append("app_setting");
        C9401a a = new C9400a(C35807d.m80935a(context, sb.toString(), 0)).edit();
        a.putString("last_login_mobile", str);
        C9402b.m18594a(a);
    }
}
