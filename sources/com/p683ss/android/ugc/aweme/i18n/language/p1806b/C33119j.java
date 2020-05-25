package com.p683ss.android.ugc.aweme.i18n.language.p1806b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.b.j */
public final /* synthetic */ class C33119j implements OnClickListener {

    /* renamed from: a */
    public static final OnClickListener f85960a = new C33119j();

    private C33119j() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C33121l.m76125b(0);
        if (C11010c.m22280a() != null) {
            C35807d.m80935a(C11010c.m22280a(), "prefs_feed_check", 0).edit().putBoolean("key_first_launch", true).apply();
        }
    }
}
