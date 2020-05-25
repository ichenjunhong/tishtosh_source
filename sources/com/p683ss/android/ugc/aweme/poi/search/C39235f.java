package com.p683ss.android.ugc.aweme.poi.search;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ss.android.ugc.aweme.poi.search.f */
final /* synthetic */ class C39235f implements OnClickListener {

    /* renamed from: a */
    private final C392292 f100196a;

    C39235f(C392292 r1) {
        this.f100196a = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C392292 r3 = this.f100196a;
        StringBuilder sb = new StringBuilder("package:");
        sb.append(C39227a.this.getContext().getPackageName());
        C39227a.this.getContext().startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString())));
    }
}
