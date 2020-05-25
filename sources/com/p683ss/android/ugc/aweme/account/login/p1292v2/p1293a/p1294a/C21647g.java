package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.g */
public final class C21647g extends C21838c {

    /* renamed from: b */
    public final C21829b f58667b;

    /* renamed from: c */
    public final String f58668c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.g$a */
    static final class C21648a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21647g f58669a;

        C21648a(C21647g gVar) {
            this.f58669a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (TextUtils.isEmpty(this.f58669a.f58668c)) {
                C21829b bVar = this.f58669a.f59129a;
                String string = this.f58669a.f59129a.getString(R.string.cg1);
                C52711k.m112236a((Object) string, "fragment.getString(R.string.network_unavailable)");
                bVar.mo45582a(0, string);
                return;
            }
            C26890h.m65011a("click_sign_up", C20856a.m53173a().mo44776a("enter_method", "login").f56798a);
            Object a = C23826bi.m58450a(C22475af.class);
            C52711k.m112236a(a, "ModuleStore.getService(I…oduleService::class.java)");
            int f = ((C22475af) a).mo46779f();
            if (f != 0) {
                C21829b bVar2 = this.f58669a.f58667b;
                Bundle arguments = this.f58669a.f59129a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", C21850i.AGE_GATE_LOGIN.getValue());
                arguments.putString("sms_code_key", this.f58669a.f58668c);
                arguments.putInt("age_gate_register_action", f);
                C52711k.m112236a((Object) arguments, "(fragment.arguments ?: B…                        }");
                bVar2.mo45961a(arguments);
            } else if (C21472c.m54111a()) {
                C21829b bVar3 = this.f58669a.f58667b;
                Bundle arguments2 = this.f58669a.f59129a.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", C21850i.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                arguments2.putString("sms_code_key", this.f58669a.f58668c);
                C52711k.m112236a((Object) arguments2, "(fragment.arguments ?: B…                        }");
                bVar3.mo45961a(arguments2);
            } else {
                C21135a b = C21839d.f59130a.mo45973b((Fragment) this.f58669a.f58667b);
                C21829b bVar4 = this.f58669a.f59129a;
                String a2 = C21134a.m53619a(b);
                C52711k.m112236a((Object) a2, "PhoneNumberUtil.formatNumber(phoneNumber)");
                C21677s.m54407a(bVar4, a2, this.f58669a.f58668c, C21848h.SIGN_UP, this.f58669a.f58667b.mo45965k()).mo6491b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.g$b */
    static final class C21649b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21647g f58670a;

        C21649b(C21647g gVar) {
            this.f58670a = gVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            FragmentActivity activity = this.f58670a.f59129a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo45905a() {
        C10643a b = new C10643a(this.f58667b.getActivity()).mo18902b(this.f58667b.getString(R.string.fxt)).mo18893a(this.f58667b.getString(R.string.fxr), (OnClickListener) new C21648a(this)).mo18903b(this.f58667b.getString(R.string.fxs), (OnClickListener) new C21649b(this));
        C52711k.m112236a((Object) b, "DmtDialog.Builder(frag.a…essed()\n                }");
        C52711k.m112240b(b, "builder");
        b.mo18897a().mo18882b().setCanceledOnTouchOutside(false);
        return true;
    }

    public C21647g(C21829b bVar, String str) {
        C52711k.m112240b(bVar, "frag");
        C52711k.m112240b(str, "smsCodeKey");
        super(bVar);
        this.f58667b = bVar;
        this.f58668c = str;
    }
}
