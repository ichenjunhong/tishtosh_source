package com.p683ss.android.ugc.aweme.share.improve.p2163c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import java.util.ArrayList;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.d */
public final class C42153d {

    /* renamed from: a */
    private static final ArrayList<String> f106619a = C52575l.m112103d("copy", "qr_code");

    /* renamed from: com.ss.android.ugc.aweme.share.improve.c.d$a */
    public static final class C42154a implements OnClickListener {

        /* renamed from: a */
        public static final C42154a f106620a = new C42154a();

        C42154a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static final boolean m92523a(C42357g gVar) {
        C52711k.m112240b(gVar, "$this$isChannelAction");
        return f106619a.contains(gVar.mo49954c());
    }
}
