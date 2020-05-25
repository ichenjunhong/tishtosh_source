package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p861f.p862a.C13106e;
import com.p683ss.android.ugc.aweme.account.C22307v;
import com.p683ss.android.ugc.aweme.account.base.p1268a.C20917a;
import com.p683ss.android.ugc.aweme.account.login.C21057ae;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21796t;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21798u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21806u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22000e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22000e.C22004c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.C2197r;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h */
public final class C21887h extends C21868b {

    /* renamed from: a */
    public static final C21888a f59242a = new C21888a(null);

    /* renamed from: b */
    private C22000e f59243b;

    /* renamed from: c */
    private HashMap f59244c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$a */
    public static final class C21888a {
        private C21888a() {
        }

        public /* synthetic */ C21888a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m54609a(Integer num, String str) {
            int i;
            C52711k.m112240b(str, "enterMethod");
            C20856a a = new C20856a().mo44776a("platform", "email").mo44776a("enter_method", str);
            String str2 = "is_success";
            if (num != null && num.intValue() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C20856a a2 = a.mo44774a(str2, i).mo44774a("is_register", 1);
            if (num == null) {
                a2.mo44776a("error_code", "");
            } else {
                a2.mo44774a("error_code", num.intValue());
            }
            C26890h.m65011a("register_click_next_result", a2.f56798a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$b */
    static final class C21889b<T> implements C1710e<C13106e> {

        /* renamed from: a */
        final /* synthetic */ C21887h f59245a;

        C21889b(C21887h hVar) {
            this.f59245a = hVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            C13106e eVar = (C13106e) obj;
            C21839d.m54507a((Fragment) this.f59245a, ((InputWithIndicator) this.f59245a.mo44862a(R.id.e75)).getText());
            StringBuilder sb = new StringBuilder();
            sb.append(((InputWithIndicator) this.f59245a.mo44862a(R.id.e75)).getText());
            sb.append(" is ");
            C52711k.m112236a((Object) eVar, "it");
            if (eVar.mo24769a()) {
                str = "not available";
            } else {
                str = "available";
            }
            sb.append(str);
            if (eVar.mo24769a()) {
                C21887h hVar = this.f59245a;
                Bundle arguments = this.f59245a.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", C21850i.EMAIL_PASSWORD_LOGIN.getValue());
                C52711k.m112236a((Object) arguments, "(arguments ?: Bundle()).…                        }");
                hVar.mo45961a(arguments);
            } else {
                C21887h hVar2 = this.f59245a;
                Bundle arguments2 = this.f59245a.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", C21850i.CREATE_PASSWORD_FOR_EMAIL.getValue());
                C52711k.m112236a((Object) arguments2, "(arguments ?: Bundle()).…                        }");
                hVar2.mo45961a(arguments2);
            }
            C21888a.m54609a(Integer.valueOf(0), this.f59245a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$c */
    static final class C21890c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21887h f59246a;

        C21890c(C21887h hVar) {
            this.f59246a = hVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("register_click_next", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", this.f59246a.mo45967m()).f56798a);
            CharSequence text = ((InputWithIndicator) this.f59246a.mo44862a(R.id.e75)).getText();
            if (TextUtils.isEmpty(text) || !Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                ((InputResultIndicator) this.f59246a.mo44862a(R.id.e76)).mo45986a();
                C21887h hVar = this.f59246a;
                C21829b bVar = hVar;
                String text2 = ((InputWithIndicator) hVar.mo44862a(R.id.e75)).getText();
                C21848h hVar2 = C21848h.SIGN_UP;
                C21850i k = hVar.mo45965k();
                C52711k.m112240b(bVar, "fragment");
                C52711k.m112240b(text2, "email");
                C52711k.m112240b(hVar2, "scene");
                C52711k.m112240b(k, "step");
                C2193n a = C2193n.m6558a((C2197r<T>) new C21796t<T>(hVar2, k, bVar, text2)).mo6486a((C1710e<? super Throwable>) new C21798u<Object>(bVar));
                C52711k.m112236a((Object) a, "Maybe.create<EmailCheckR…nse.errorMsg}\")\n        }");
                C21806u.m54453a(bVar, a).mo6496c((C1710e<? super T>) new C21889b<Object>(hVar)).mo6491b();
                return;
            }
            C21887h hVar3 = this.f59246a;
            String string = this.f59246a.getString(R.string.aex);
            C52711k.m112236a((Object) string, "getString(R.string.commo…ration_email_input_error)");
            hVar3.mo45582a(0, string);
            C21888a.m54609a(null, this.f59246a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$d */
    public static final class C21891d extends C22307v {

        /* renamed from: a */
        final /* synthetic */ C21887h f59247a;

        C21891d(C21887h hVar) {
            this.f59247a = hVar;
        }

        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59247a.mo44862a(R.id.e76);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45986a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f59247a.mo44862a(R.id.e72);
            if (loadingButton != null) {
                boolean z = false;
                if (editable != null) {
                    String obj = editable.toString();
                    if (obj != null && obj.length() > 0) {
                        z = true;
                    }
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$e */
    static final class C21892e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21887h f59248a;

        C21892e(C21887h hVar) {
            this.f59248a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47700ay.m103235a(C20917a.m53262a(this.f59248a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.h$f */
    static final class C21893f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21887h f59249a;

        C21893f(C21887h hVar) {
            this.f59249a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47700ay.m103235a(C20917a.m53263b(this.f59249a.getActivity()));
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59244c == null) {
            this.f59244c = new HashMap();
        }
        View view = (View) this.f59244c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59244c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59244c != null) {
            this.f59244c.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0s;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        ((LoadingButton) mo44862a(R.id.e72)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a(R.id.e72)).mo46296b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, true, null, false, true, 223, null);
        return aVar;
    }

    /* renamed from: W_ */
    public final void mo45995W_() {
        super.mo45995W_();
        RecyclerView recyclerView = (RecyclerView) mo44862a(R.id.e74);
        C52711k.m112236a((Object) recyclerView, "emailSignUpDomainList");
        recyclerView.setVisibility(8);
    }

    /* renamed from: X_ */
    public final void mo45996X_() {
        super.mo45996X_();
        RecyclerView recyclerView = (RecyclerView) mo44862a(R.id.e74);
        C52711k.m112236a((Object) recyclerView, "emailSignUpDomainList");
        recyclerView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        ((InputResultIndicator) mo44862a(R.id.e76)).mo45987a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        mo45997a((LoadingButton) mo44862a(R.id.e72), new C21890c(this));
        ((InputWithIndicator) mo44862a(R.id.e75)).setTextWatcher(new C21891d(this));
        C21057ae.m53524a(getContext(), (DmtTextView) mo44862a(R.id.e73), new C21892e(this), new C21893f(this), false);
        RecyclerView recyclerView = (RecyclerView) mo44862a(R.id.e74);
        C52711k.m112236a((Object) recyclerView, "emailSignUpDomainList");
        this.f59243b = C22004c.m54757a(recyclerView, ((InputWithIndicator) mo44862a(R.id.e75)).getEditText(), mo45966l(), mo45967m());
        ((InputWithIndicator) mo44862a(R.id.e75)).getEditText().setNextFocusDownId(((InputWithIndicator) mo44862a(R.id.e75)).getEditText().getId());
    }
}
