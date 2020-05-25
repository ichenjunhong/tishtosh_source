package com.p683ss.android.ugc.aweme.notification;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.notification.g */
public final class C38205g {

    /* renamed from: a */
    static SharedPreferences f97270a = C35807d.m80935a(C11010c.m22280a(), "notice_account_related_sp", 0);

    /* renamed from: b */
    public static final C38205g f97271b = new C38205g();

    private C38205g() {
    }

    /* renamed from: a */
    public static final void m85374a() {
        Editor editor;
        SharedPreferences sharedPreferences = f97270a;
        if (sharedPreferences != null) {
            editor = sharedPreferences.edit();
        } else {
            editor = null;
        }
        if (editor != null) {
            editor.clear();
        }
        C9402b.m18594a(editor);
    }
}
