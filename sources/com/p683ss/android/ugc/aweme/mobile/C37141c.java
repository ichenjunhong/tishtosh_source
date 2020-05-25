package com.p683ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.widget.Button;
import com.p683ss.android.ugc.aweme.mobile.C37139b.C37140a;

/* renamed from: com.ss.android.ugc.aweme.mobile.c */
final /* synthetic */ class C37141c implements OnShowListener {

    /* renamed from: a */
    private final C37139b f94810a;

    /* renamed from: b */
    private final Activity f94811b;

    /* renamed from: c */
    private final C37140a f94812c;

    C37141c(C37139b bVar, Activity activity, C37140a aVar) {
        this.f94810a = bVar;
        this.f94811b = activity;
        this.f94812c = aVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C37139b bVar = this.f94810a;
        Activity activity = this.f94811b;
        C37140a aVar = this.f94812c;
        Button a = bVar.f94807a.mo20129a(-1);
        if (a != null) {
            a.setOnClickListener(new C37144f(bVar, activity));
        }
        Button a2 = bVar.f94807a.mo20129a(-2);
        if (a2 != null) {
            a2.setOnClickListener(new C37145g(bVar, aVar));
        }
    }
}
