package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak */
public final class C45388ak {

    /* renamed from: a */
    public static Dialog f114773a;

    /* renamed from: b */
    public static final C45388ak f114774b = new C45388ak();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak$a */
    public static final class C45389a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f114775a;

        public C45389a(C52670a aVar) {
            this.f114775a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f114775a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak$b */
    public static final class C45390b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f114776a;

        /* renamed from: b */
        final /* synthetic */ C52670a f114777b;

        public C45390b(Context context, C52670a aVar) {
            this.f114776a = context;
            this.f114777b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C39618d.f101145I.mo58605c().mo49441d(this.f114776a);
            this.f114777b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak$c */
    public static final class C45391c implements OnDismissListener {

        /* renamed from: a */
        public static final C45391c f114778a = new C45391c();

        C45391c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C45388ak akVar = C45388ak.f114774b;
            C45388ak.f114773a = null;
        }
    }

    private C45388ak() {
    }
}
