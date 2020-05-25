package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.h */
public final /* synthetic */ class C47256h implements OnClickListener {

    /* renamed from: a */
    private final MvThemeData f119326a;

    /* renamed from: b */
    private final OnClickListener f119327b;

    public C47256h(MvThemeData mvThemeData, OnClickListener onClickListener) {
        this.f119326a = mvThemeData;
        this.f119327b = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MvThemeData mvThemeData = this.f119326a;
        OnClickListener onClickListener = this.f119327b;
        String id = mvThemeData.f119230a.getId();
        C52711k.m112240b(id, "key");
        Editor edit = C35807d.m80935a(C39618d.f101160a, "mv_template", 0).edit();
        edit.putBoolean(id, true);
        C9402b.m18594a(edit);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
