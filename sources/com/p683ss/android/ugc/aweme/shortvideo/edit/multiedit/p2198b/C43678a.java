package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a */
public final class C43678a {

    /* renamed from: a */
    public static final C43678a f110603a = new C43678a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$a */
    public static final class C43679a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f110604a;

        /* renamed from: b */
        final /* synthetic */ C52670a f110605b;

        public C43679a(String str, C52670a aVar) {
            this.f110604a = str;
            this.f110605b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f110605b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$b */
    static final class C43680b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f110606a;

        C43680b(C52670a aVar) {
            this.f110606a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f110606a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a$c */
    static final class C43681c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f110607a;

        C43681c(C52670a aVar) {
            this.f110607a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f110607a.invoke();
        }
    }

    private C43678a() {
    }

    /* renamed from: a */
    public static void m95951a(Activity activity, C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "cancel");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C10643a(activity).mo18899b((int) R.string.gar).mo18900b((int) R.string.gak, (OnClickListener) null).mo18886a((int) R.string.gaq, (OnClickListener) new C43681c(aVar)).mo18897a().mo18882b().show();
        }
    }

    /* renamed from: b */
    public static void m95952b(Activity activity, C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "cancel");
        if (activity == null || activity.isFinishing()) {
            aVar.invoke();
        } else {
            new C10643a(activity).mo18899b((int) R.string.gar).mo18900b((int) R.string.gak, (OnClickListener) null).mo18886a((int) R.string.gaq, (OnClickListener) new C43680b(aVar)).mo18897a().mo18882b().show();
        }
    }
}
