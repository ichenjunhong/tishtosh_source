package com.p683ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20977b;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import p2628d.C52803m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.ag */
public final class C21061ag extends C21044a {

    /* renamed from: k */
    public static final C21062a f57262k = new C21062a(null);

    /* renamed from: i */
    public boolean f57263i = true;

    /* renamed from: j */
    public final TPLoginMethod f57264j;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ag$a */
    public static final class C21062a {
        private C21062a() {
        }

        public /* synthetic */ C21062a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ag$b */
    static final class C21063b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21061ag f57265a;

        /* renamed from: b */
        final /* synthetic */ Context f57266b;

        C21063b(C21061ag agVar, Context context) {
            this.f57265a = agVar;
            this.f57266b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57265a.f57263i = false;
            if (C22298e.m55182a()) {
                this.f57265a.f57248f = true;
                if (this.f57265a.isShowing()) {
                    this.f57265a.dismiss();
                }
            }
            this.f57265a.mo45071a(this.f57265a.f57264j.getPlatform());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ag$c */
    static final class C21064c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21061ag f57267a;

        /* renamed from: b */
        final /* synthetic */ Context f57268b;

        C21064c(C21061ag agVar, Context context) {
            this.f57267a = agVar;
            this.f57268b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57267a.f57248f = true;
            this.f57267a.f57263i = false;
            C26890h.m65011a("switch_login_account", new C20856a().mo44776a("enter_method", this.f57267a.f57246d).mo44776a("enter_from", this.f57267a.f57245c).f56798a);
            this.f57267a.dismiss();
            C23826bi.m58470k().retryLogin(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ag$d */
    static final class C21065d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21061ag f57269a;

        /* renamed from: b */
        final /* synthetic */ Context f57270b;

        C21065d(C21061ag agVar, Context context) {
            this.f57269a = agVar;
            this.f57270b = context;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f57269a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ag$e */
    static final class C21066e implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C21061ag f57271a;

        C21066e(C21061ag agVar) {
            this.f57271a = agVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f57271a.f57263i) {
                BaseLoginMethod baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                C21518u.m54176b(baseLoginMethod);
            }
        }
    }

    public final void dismiss() {
        super.dismiss();
        C20975a.m53341b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Dialog mo45077e() {
        StringBuilder sb = new StringBuilder("An operation is not implemented: ");
        sb.append("not implemented");
        throw new C52803m(sb.toString());
    }

    /* renamed from: a */
    public final void mo45070a(Context context) {
        String str;
        C52711k.m112240b(context, "context");
        if (this.f57264j != null) {
            this.f57249g = getLayoutInflater().inflate(R.layout.ayn, null);
            View view = this.f57249g;
            if (view != null) {
                C23515d.m57677a((RemoteImageView) view.findViewById(R.id.hi), this.f57264j.getUserInfo().getAvatarUrl());
                if (((C22475af) C23826bi.m58450a(C22475af.class)).mo46777d()) {
                    str = "";
                } else {
                    str = "@";
                }
                View findViewById = view.findViewById(R.id.bj4);
                C52711k.m112236a((Object) findViewById, "it.findViewById<TextView>(R.id.login_in)");
                TextView textView = (TextView) findViewById;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f57264j.getUserInfo().getUserName());
                textView.setText(context.getString(R.string.fxl, new Object[]{sb.toString()}));
                view.findViewById(R.id.bj4).setOnClickListener(new C21063b(this, context));
                view.findViewById(R.id.cwd).setOnClickListener(new C21064c(this, context));
                view.findViewById(R.id.cp4).setOnClickListener(new C21065d(this, context));
            }
            setContentView(this.f57249g);
            C20975a.m53339a((C20977b) this);
            setOnDismissListener(new C21066e(this));
        }
    }

    public C21061ag(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(bundle, "data");
        super(activity, bundle);
        this.f57264j = tPLoginMethod;
        mo45070a(activity);
    }
}
