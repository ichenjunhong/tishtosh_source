package com.p683ss.android.ugc.aweme.shortvideo.publish;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.settings.PrePostCheckFreqLimit;
import com.p683ss.android.ugc.aweme.settings.PrePostCheckType;
import com.p683ss.android.ugc.aweme.shortvideo.C43216dj;
import com.p683ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n */
public final class C44394n {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$a */
    public static final class C44395a implements C17824h<C43216dj> {

        /* renamed from: a */
        final /* synthetic */ C52670a f112329a;

        /* renamed from: b */
        final /* synthetic */ C52670a f112330b;

        /* renamed from: c */
        final /* synthetic */ Context f112331c;

        /* renamed from: d */
        final /* synthetic */ C52670a f112332d;

        /* renamed from: e */
        final /* synthetic */ int f112333e;

        /* renamed from: f */
        final /* synthetic */ int f112334f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$a$a */
        static final class C44396a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44395a f112335a;

            C44396a(C44395a aVar) {
                this.f112335a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C44394n.m97194a("UserSaveDraft");
                this.f112335a.f112332d.invoke();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.n$a$b */
        static final class C44397b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C44395a f112336a;

            C44397b(C44395a aVar) {
                this.f112336a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                StringBuilder sb = new StringBuilder("SC T:");
                sb.append(this.f112336a.f112333e);
                sb.append(" L:");
                sb.append(this.f112336a.f112334f);
                C47858ep.m103521c(sb.toString());
            }
        }

        public final void onFailure(Throwable th) {
            C44394n.m97194a("request Failed");
            this.f112329a.invoke();
            this.f112330b.invoke();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            C43216dj djVar = (C43216dj) obj;
            this.f112329a.invoke();
            if (djVar == null) {
                C44394n.m97194a("null result");
                this.f112330b.invoke();
                return;
            }
            StringBuilder sb = new StringBuilder("Success isPass:");
            sb.append(djVar.isPassed());
            sb.append(" status_code:");
            sb.append(djVar.status_code);
            C44394n.m97194a(sb.toString());
            if (djVar.status_code == 1) {
                this.f112330b.invoke();
            } else if (djVar.isPassed()) {
                this.f112330b.invoke();
            } else {
                String a = C44394n.m97192a(this.f112331c, djVar.getReasonBody(), R.string.h39);
                String a2 = C44394n.m97192a(this.f112331c, djVar.getReasonTitle(), R.string.h3_);
                if (TextUtils.isEmpty(a) || TextUtils.isEmpty(a2)) {
                    this.f112330b.invoke();
                    return;
                }
                C10643a aVar = new C10643a(this.f112331c);
                aVar.mo18902b(a).mo18892a(a2).mo18886a((int) R.string.h37, (OnClickListener) new C44396a(this)).mo18900b((int) R.string.h38, (OnClickListener) new C44397b(this));
                Dialog c = aVar.mo18897a().mo18883c();
                c.setCancelable(true);
                c.setCanceledOnTouchOutside(false);
            }
        }

        C44395a(C52670a aVar, C52670a aVar2, Context context, C52670a aVar3, int i, int i2) {
            this.f112329a = aVar;
            this.f112330b = aVar2;
            this.f112331c = context;
            this.f112332d = aVar3;
            this.f112333e = i;
            this.f112334f = i2;
        }
    }

    /* renamed from: a */
    public static final void m97194a(String str) {
        StringBuilder sb = new StringBuilder("CheckServerPrePost ");
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: a */
    public static final String m97192a(Context context, String str, int i) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        String string = context.getString(i);
        C52711k.m112236a((Object) string, "context.getString(defaultStringId)");
        return string;
    }

    /* renamed from: a */
    public static final void m97193a(Context context, C52670a<C52860x> aVar, C52670a<C52860x> aVar2, C52670a<C52860x> aVar3, C52670a<C52860x> aVar4) {
        C52711k.m112240b(aVar, "goon");
        C52711k.m112240b(aVar2, "showLoading");
        C52711k.m112240b(aVar3, "hideLoading");
        C52711k.m112240b(aVar4, "saveDraft");
        if (context == null) {
            m97194a("null context");
            aVar.invoke();
            return;
        }
        int a = C10193n.m20607a().mo18200a(PrePostCheckType.class, "pre_post_check_type", C10181b.m20511a().mo18175c().getPrePostCheckType(), 0);
        int a2 = C10193n.m20607a().mo18200a(PrePostCheckFreqLimit.class, "pre_post_check_freq_limit", C10181b.m20511a().mo18175c().getPrePostCheckFreqLimit(), -1);
        StringBuilder sb = new StringBuilder("Setting prePostCheckType:");
        sb.append(a);
        sb.append(" prePostCheckFreqLimit:");
        sb.append(a2);
        m97194a(sb.toString());
        if (a == 0) {
            aVar.invoke();
            return;
        }
        aVar2.invoke();
        C17832m a3 = TTUploaderService.m93069a(a, a2);
        C44395a aVar5 = new C44395a(aVar3, aVar, context, aVar4, a, a2);
        C17825i.m43740a(a3, aVar5, C0013i.f25b);
    }
}
