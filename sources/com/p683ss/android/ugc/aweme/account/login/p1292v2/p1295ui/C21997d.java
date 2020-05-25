package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.d */
public final class C21997d {

    /* renamed from: a */
    public static final C21997d f59450a = new C21997d();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.d$a */
    static final class C21998a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f59451a;

        /* renamed from: b */
        final /* synthetic */ C21829b f59452b;

        /* renamed from: c */
        final /* synthetic */ String f59453c;

        /* renamed from: d */
        final /* synthetic */ boolean f59454d;

        C21998a(Activity activity, C21829b bVar, String str, boolean z) {
            this.f59451a = activity;
            this.f59452b = bVar;
            this.f59453c = str;
            this.f59454d = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity activity = this.f59451a;
            C21829b bVar = this.f59452b;
            String str = this.f59453c;
            boolean z = this.f59454d;
            C26891a aVar = new C26891a(activity);
            String string = activity.getString(R.string.cbj);
            C52711k.m112236a((Object) string, "activity.getString(R.string.mus_phone_num)");
            String string2 = activity.getString(R.string.c9u);
            C52711k.m112236a((Object) string2, "activity.getString(R.string.mus_email)");
            aVar.mo54844a((CharSequence[]) new String[]{string, string2}, (DialogInterface.OnClickListener) new C21999b(str, bVar, z));
            C47700ay.m103235a(aVar.mo54842a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.d$b */
    static final class C21999b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f59455a;

        /* renamed from: b */
        final /* synthetic */ C21829b f59456b;

        /* renamed from: c */
        final /* synthetic */ boolean f59457c;

        C21999b(String str, C21829b bVar, boolean z) {
            this.f59455a = str;
            this.f59456b = bVar;
            this.f59457c = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            int i2;
            if (i == 1) {
                C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "email").mo44776a("enter_from", this.f59455a).mo44776a("enter_method", this.f59456b.mo45967m()).f56798a);
            } else if (i == 0) {
                C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "phone").mo44776a("enter_from", this.f59455a).mo44776a("enter_method", this.f59456b.mo45967m()).f56798a);
            }
            C21829b bVar = this.f59456b;
            Bundle arguments = this.f59456b.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            String str = "next_page";
            if (i == 1) {
                i2 = C21850i.INPUT_EMAIL_FIND_PASSWORD.getValue();
            } else {
                i2 = C21850i.INPUT_PHONE_FIND_PASSWORD.getValue();
            }
            arguments.putInt(str, i2);
            if (this.f59457c) {
                arguments.putInt("current_scene", C21848h.RECOVER_ACCOUNT.getValue());
            } else {
                arguments.putInt("current_scene", C21848h.SET_OR_RESET_PASSWORD.getValue());
            }
            if ((this.f59456b instanceof C21996c) && !this.f59457c) {
                C21839d.m54507a((Fragment) this.f59456b, ((C21996c) this.f59456b).mo45586j());
            }
            C52711k.m112236a((Object) arguments, "(fragment.arguments ?: B…          }\n            }");
            bVar.mo45961a(arguments);
            dialogInterface.dismiss();
        }
    }

    private C21997d() {
    }

    /* renamed from: a */
    public static void m54755a(View view, Activity activity, C21829b bVar, String str, boolean z) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(str, "enterFrom");
        view.setOnTouchListener(new C48221a(0.5f, 150, null));
        view.setOnClickListener(new C21998a(activity, bVar, str, z));
    }
}
