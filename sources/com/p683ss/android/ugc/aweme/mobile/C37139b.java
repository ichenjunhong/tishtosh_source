package com.p683ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnDismissListener;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.mobile.b */
public final class C37139b {

    /* renamed from: d */
    private static final boolean f94806d = false;

    /* renamed from: a */
    public C37147i f94807a;

    /* renamed from: b */
    public String f94808b = "";

    /* renamed from: c */
    boolean f94809c;

    /* renamed from: com.ss.android.ugc.aweme.mobile.b$a */
    public interface C37140a {
        /* renamed from: a */
        void mo66201a(Dialog dialog);

        /* renamed from: b */
        void mo66202b(Dialog dialog);
    }

    public C37139b(Activity activity, C37140a aVar, OnDismissListener onDismissListener) {
        this.f94807a = new C37147i(activity);
        this.f94807a.setCancelable(false);
        this.f94807a.setCanceledOnTouchOutside(false);
        this.f94807a.setTitle(R.string.bx1);
        C37147i iVar = this.f94807a;
        iVar.f29898a.mo20114b(activity.getString(R.string.bx0));
        this.f94807a.mo20130a(-2, activity.getString(R.string.dke), null);
        this.f94807a.mo20130a(-1, activity.getString(R.string.bwz), null);
        this.f94807a.setOnDismissListener(null);
        this.f94807a.setOnShowListener(new C37141c(this, activity, aVar));
        this.f94807a.f94821c = new C37142d(this, aVar);
    }
}
