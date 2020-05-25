package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p030v4.app.C0636b;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.am */
public final class C42069am {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.am$a */
    static final class C42070a implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C52670a f106475a;

        /* renamed from: b */
        final /* synthetic */ Activity f106476b;

        C42070a(C52670a aVar, Activity activity) {
            this.f106475a = aVar;
            this.f106476b = activity;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            if (iArr != null) {
                if (iArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (iArr[0] == 0) {
                        C52670a aVar = this.f106475a;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                    } else {
                        C41922a.m91868a().showNoPermissionDialog(R.string.ci3, R.string.ci2, this.f106476b);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.am$b */
    public static final class C42071b implements C23364b {

        /* renamed from: a */
        final /* synthetic */ Activity f106477a;

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.am$b$a */
        static final class C42072a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42071b f106478a;

            C42072a(C42071b bVar) {
                this.f106478a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C47720bh.m103294a(this.f106478a.f106477a);
            }
        }

        public C42071b(Activity activity) {
            this.f106477a = activity;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            C52711k.m112236a((Object) iArr, "grantResults");
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == -1 && !C0636b.m1719a(this.f106477a, strArr[0])) {
                C47700ay.m103234a(this.f106477a, R.string.kc, R.string.wf, null, R.string.ah4, new C42072a(this)).show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.am$c */
    static final class C42073c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f106479a;

        /* renamed from: b */
        final /* synthetic */ String f106480b;

        /* renamed from: c */
        final /* synthetic */ String f106481c;

        /* renamed from: d */
        final /* synthetic */ String f106482d;

        C42073c(Aweme aweme, String str, String str2, String str3) {
            this.f106479a = aweme;
            this.f106480b = str;
            this.f106481c = str2;
            this.f106482d = str3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C42069am.m92163a(false, this.f106479a, this.f106480b, this.f106481c, this.f106482d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.am$d */
    static final class C42074d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30313ae f106483a;

        /* renamed from: b */
        final /* synthetic */ Aweme f106484b;

        /* renamed from: c */
        final /* synthetic */ String f106485c;

        /* renamed from: d */
        final /* synthetic */ String f106486d;

        /* renamed from: e */
        final /* synthetic */ String f106487e;

        C42074d(C30313ae aeVar, Aweme aweme, String str, String str2, String str3) {
            this.f106483a = aeVar;
            this.f106484b = aweme;
            this.f106485c = str;
            this.f106486d = str2;
            this.f106487e = str3;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C30313ae aeVar = this.f106483a;
            if (aeVar != null) {
                aeVar.mo60714a(new C30332aw(2, this.f106484b));
            }
            C42069am.m92163a(true, this.f106484b, this.f106485c, this.f106486d, this.f106487e);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static final void m92160a(Activity activity, C52670a<C52860x> aVar) {
        C52711k.m112240b(activity, "context");
        if (C47946e.m103737c(activity) != 0) {
            C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C42070a(aVar, activity));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public static final boolean m92164a(Aweme aweme, Context context) {
        C52711k.m112240b(context, "context");
        if (aweme == null) {
            return false;
        }
        AwemeStatus status = aweme.getStatus();
        if (status == null || status.isAllowShare()) {
            return true;
        }
        C10691a.m21542b(context, (int) R.string.wc).mo19066a();
        return false;
    }

    /* renamed from: a */
    public static final void m92163a(boolean z, Aweme aweme, String str, String str2, String str3) {
        C23089d a = C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a("enter_from", str).mo47829a("impr_id", str3);
        if (TextUtils.equals(str, "personal_homepage")) {
            a.mo47829a("tab_name", str2);
        }
        if (z) {
            C26890h.m65011a("confirm_delete_video", a.f61491a);
        } else {
            C26890h.m65011a("cancel_delete_video", a.f61491a);
        }
    }

    /* renamed from: a */
    private static void m92161a(Context context, Aweme aweme, C30313ae<C30332aw> aeVar, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "imprId");
        C10643a aVar = new C10643a(context);
        if (aweme.getStarAtlasOrderId() > 0) {
            aVar.mo18899b((int) R.string.g3_);
        } else {
            aVar.mo18899b((int) R.string.aob);
        }
        C10643a b = aVar.mo18900b((int) R.string.wf, (OnClickListener) new C42073c(aweme, str2, str, str3));
        C42074d dVar = new C42074d(aeVar, aweme, str2, str, str3);
        b.mo18886a((int) R.string.ao9, (OnClickListener) dVar).mo18897a().mo18882b();
    }

    /* renamed from: a */
    public static /* synthetic */ void m92162a(Context context, Aweme aweme, C30313ae aeVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = "";
        }
        m92161a(context, aweme, aeVar, str4, str5, str3);
    }
}
