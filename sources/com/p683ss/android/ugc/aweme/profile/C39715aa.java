package com.p683ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.profile.experiment.C39868b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.I18nHeaderDetailActivity;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.aa */
public final class C39715aa {
    /* renamed from: a */
    public static Class m88417a() {
        return I18nHeaderDetailActivity.class;
    }

    /* renamed from: a */
    public static void m88420a(TextView textView) {
        textView.setText(R.string.dk2);
    }

    /* renamed from: a */
    public static String m88418a(String str) {
        if (TextUtils.isEmpty(str)) {
            return " ";
        }
        return str;
    }

    /* renamed from: a */
    public static void m88419a(Activity activity) {
        ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: a */
    public static void m88421a(C18922i iVar, Integer num, int i) {
        if (C39868b.m88638a() && num != null && num.intValue() == 1000 && i == 0) {
            iVar.mo38776a("filter_private", 1);
        }
    }
}
