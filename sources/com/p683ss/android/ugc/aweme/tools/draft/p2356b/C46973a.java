package com.p683ss.android.ugc.aweme.tools.draft.p2356b;

import android.app.ProgressDialog;
import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39631n;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.views.C48174a;
import com.p683ss.android.ugc.aweme.views.C48174a.C48175a;
import com.p683ss.android.ugc.aweme.views.C48174a.C48177c;
import com.p683ss.android.ugc.aweme.views.C48193i;
import com.p683ss.android.ugc.aweme.views.C48193i.C48194a;
import com.p683ss.android.ugc.aweme.views.C48193i.C48196c;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a */
public final class C46973a {

    /* renamed from: a */
    public static final C46973a f118676a = new C46973a();

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a$a */
    public static final class C46974a implements C48196c {

        /* renamed from: a */
        final /* synthetic */ C52670a f118677a;

        /* renamed from: a */
        public final void mo94271a() {
            this.f118677a.invoke();
        }

        C46974a(C52670a aVar) {
            this.f118677a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a$b */
    public static final class C46975b implements C48196c {

        /* renamed from: a */
        final /* synthetic */ C52670a f118678a;

        /* renamed from: a */
        public final void mo94271a() {
            this.f118678a.invoke();
        }

        C46975b(C52670a aVar) {
            this.f118678a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a$c */
    public static final class C46976c implements C48177c {

        /* renamed from: a */
        final /* synthetic */ C52670a f118679a;

        /* renamed from: a */
        public final void mo94272a() {
            this.f118679a.invoke();
        }

        C46976c(C52670a aVar) {
            this.f118679a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.b.a$d */
    public static final class C46977d implements C48177c {

        /* renamed from: a */
        final /* synthetic */ C52670a f118680a;

        /* renamed from: a */
        public final void mo94272a() {
            this.f118680a.invoke();
        }

        C46977d(C52670a aVar) {
            this.f118680a = aVar;
        }
    }

    private C46973a() {
    }

    /* renamed from: a */
    public static ProgressDialog m102022a(Context context, C52670a<C52860x> aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "cancel");
        C39631n nVar = C39618d.f101169j;
        C52711k.m112236a((Object) nVar, "AVEnv.AB_SERVICE");
        switch (nVar.mo74142d()) {
            case 1:
                return C48193i.f121258d.mo95625a(context, C48194a.VISIBLE, new C46974a(aVar));
            case 2:
                return C48193i.f121258d.mo95625a(context, C48194a.VISIBLE_AFTER_5S, new C46975b(aVar));
            case 3:
                return C48174a.f121195e.m104423a(context, C48175a.VISIBLE, new C46976c(aVar), "");
            case 4:
                return C48174a.f121195e.m104423a(context, C48175a.VISIBLE_AFTER_5S, new C46977d(aVar), "");
            default:
                return C45546c.m99207a(context, context.getString(R.string.dnt));
        }
    }
}
