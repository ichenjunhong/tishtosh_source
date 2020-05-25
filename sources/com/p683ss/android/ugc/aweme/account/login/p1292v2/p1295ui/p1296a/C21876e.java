package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p844a.p848d.C13018g;
import com.bytedance.sdk.account.p861f.p863b.C13162t.C13163a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C22041x;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21684ad;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21686ae;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21687af;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21719bb;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21721bc;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21722bd;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21760cf;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21762cg;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21763ch;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21806u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.utils.C22293a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.C2197r;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.e */
public final class C21876e extends C21868b {

    /* renamed from: c */
    public static final C21877a f59218c = new C21877a(null);

    /* renamed from: a */
    public boolean f59219a;

    /* renamed from: b */
    public String f59220b = "";

    /* renamed from: d */
    private boolean f59221d = true;

    /* renamed from: e */
    private boolean f59222e;

    /* renamed from: j */
    private boolean f59223j;

    /* renamed from: k */
    private HashMap f59224k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.e$a */
    public static final class C21877a {
        private C21877a() {
        }

        public /* synthetic */ C21877a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.e$b */
    public static final class C21878b extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21876e f59225a;

        C21878b(C21876e eVar) {
            this.f59225a = eVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            super.afterTextChanged(editable);
            if (this.f59225a.isViewValid()) {
                String text = ((InputWithIndicator) this.f59225a.mo44862a(R.id.e41)).getText();
                boolean z2 = false;
                if (text.length() > 20) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59225a.mo44862a(R.id.e42);
                    String string = this.f59225a.getString(R.string.cbg);
                    C52711k.m112236a((Object) string, "getString(R.string.mus_password_too_long)");
                    inputResultIndicator.mo45987a(string);
                } else {
                    ((InputResultIndicator) this.f59225a.mo44862a(R.id.e42)).mo45986a();
                }
                LoadingButton loadingButton = (LoadingButton) this.f59225a.mo44862a(R.id.e40);
                C52711k.m112236a((Object) loadingButton, "createPasswordContinueBtn");
                if (text.length() >= 8 && !z) {
                    z2 = true;
                }
                loadingButton.setEnabled(z2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.e$c */
    static final class C21879c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21876e f59226a;

        C21879c(C21876e eVar) {
            this.f59226a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String text = ((InputWithIndicator) this.f59226a.mo44862a(R.id.e41)).getText();
            if (!C22041x.m54771a(text)) {
                C21876e eVar = this.f59226a;
                String string = this.f59226a.getString(R.string.afe);
                C52711k.m112236a((Object) string, "getString(R.string.commo…istration_password_error)");
                eVar.mo45582a(0, string);
                return;
            }
            switch (C21882f.f59230b[this.f59226a.mo45965k().ordinal()]) {
                case 1:
                    C21829b bVar = this.f59226a;
                    String str = this.f59226a.f59220b;
                    C52711k.m112240b(bVar, "fragment");
                    C52711k.m112240b(text, "pwd");
                    C52711k.m112240b(str, "ticket");
                    C2193n a = C2193n.m6558a((C2197r<T>) new C21760cf<T>(bVar, text, str)).mo6496c((C1710e<? super T>) new C21762cg<Object>(bVar)).mo6486a((C1710e<? super Throwable>) new C21763ch<Object>(bVar));
                    C52711k.m112236a((Object) a, "Maybe.create(MaybeOnSubs…MAIL, fragment)\n        }");
                    C21806u.m54453a(bVar, a).mo6491b();
                    return;
                case 2:
                    C21876e eVar2 = this.f59226a;
                    C21677s.m54403a(eVar2, text).mo6496c((C1710e<? super T>) new C21881d<Object>(eVar2)).mo6491b();
                    return;
                case 3:
                    C22293a.m55177a(this.f59226a.getContext());
                    C21829b bVar2 = this.f59226a;
                    String a2 = C21839d.f59130a.mo45972a((Fragment) this.f59226a);
                    C52711k.m112240b(bVar2, "fragment");
                    C52711k.m112240b(a2, "email");
                    C52711k.m112240b(text, "pwd");
                    C2193n a3 = C2193n.m6558a((C2197r<T>) new C21684ad<T>(bVar2, text, a2)).mo6496c((C1710e<? super T>) new C21686ae<Object>(bVar2)).mo6486a((C1710e<? super Throwable>) new C21687af<Object>(bVar2));
                    C52711k.m112236a((Object) a3, "Maybe.create(MaybeOnSubs…detailErrorMsg)\n        }");
                    C21806u.m54453a(bVar2, a3).mo6491b();
                    return;
                case 4:
                    C21829b bVar3 = this.f59226a;
                    String str2 = this.f59226a.f59220b;
                    C52711k.m112240b(bVar3, "fragment");
                    C52711k.m112240b(text, "pwd");
                    C52711k.m112240b(str2, "ticket");
                    C2193n a4 = C2193n.m6558a((C2197r<T>) new C21719bb<T>(bVar3, text, str2)).mo6496c((C1710e<? super T>) new C21721bc<Object>(bVar3)).mo6486a((C1710e<? super Throwable>) new C21722bd<Object>(bVar3));
                    C52711k.m112236a((Object) a4, "Maybe.create(MaybeOnSubs…}\n            }\n        }");
                    C21806u.m54453a(bVar3, a4).mo6496c((C1710e<? super T>) new C1710e<C13018g>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C21879c f59227a;

                        {
                            this.f59227a = r1;
                        }

                        public final /* synthetic */ void accept(Object obj) {
                            C13018g gVar = (C13018g) obj;
                            C10691a.m21533a(this.f59227a.f59226a.getContext(), (int) R.string.zs).mo19066a();
                        }
                    }).mo6491b();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.e$d */
    static final class C21881d<T> implements C1710e<C12993e<C13163a>> {

        /* renamed from: a */
        final /* synthetic */ C21876e f59228a;

        C21881d(C21876e eVar) {
            this.f59228a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C12993e eVar = (C12993e) obj;
            this.f59228a.f59219a = true;
            C23826bi.m58451a(13, 1, (Object) null);
            FragmentActivity activity = this.f59228a.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.finish();
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59224k == null) {
            this.f59224k = new HashMap();
        }
        View view = (View) this.f59224k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59224k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59224k != null) {
            this.f59224k.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0q;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        LoadingButton loadingButton = (LoadingButton) mo44862a(R.id.e40);
        if (loadingButton != null) {
            loadingButton.mo46295a();
        }
    }

    /* renamed from: e */
    public final void mo45584e() {
        LoadingButton loadingButton = (LoadingButton) mo44862a(R.id.e40);
        if (loadingButton != null) {
            loadingButton.mo46296b();
        }
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        if (this.f59223j) {
            return true;
        }
        if (!this.f59219a) {
            C23826bi.m58451a(13, 2, (Object) null);
        }
        return false;
    }

    public final void onResume() {
        super.onResume();
        C21994b.m54752a(((InputWithIndicator) mo44862a(R.id.e41)).getEditText());
    }

    /* renamed from: t */
    public final void mo45999t() {
        this.f59223j = false;
        C26890h.m65011a("click_password_skip", C20856a.m53173a().mo44776a("platform", "sms_verification").f56798a);
        super.mo45999t();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        String str;
        String str2;
        String str3;
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        if (!this.f59222e) {
            str3 = getString(R.string.adw);
            C52711k.m112236a((Object) str3, "getString(R.string.common_login_panel_entry_2)");
            str2 = getString(R.string.afg);
            C52711k.m112236a((Object) str2, "getString(R.string.commo…istration_password_title)");
            str = "set_password";
        } else {
            str3 = getString(R.string.aef);
            C52711k.m112236a((Object) str3, "getString(R.string.common_login_reset_title)");
            str2 = getString(R.string.aea);
            C52711k.m112236a((Object) str2, "getString(R.string.commo…gin_reset_password_title)");
            str = "reset_password";
        }
        aVar.f59179a = str3;
        aVar.f59182d = str2;
        aVar.f59185g = str;
        aVar.f59183e = getString(R.string.aff);
        boolean z = true;
        if (mo45965k() == C21850i.CREATE_PASSWORD_FOR_PHONE) {
            aVar.f59180b = getString(R.string.de5);
            this.f59223j = true;
        }
        aVar.f59187i = true;
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            z = false;
        }
        aVar.f59186h = z;
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0011
            java.lang.String r0 = "ticket"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r4 = ""
        L_0x0013:
            r3.f59220b = r4
            com.ss.android.ugc.aweme.account.login.v2.base.i r4 = r3.mo45965k()
            int[] r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21882f.f59229a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            switch(r4) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0030
        L_0x0026:
            r3.f59222e = r0
            r3.f59221d = r0
            goto L_0x0030
        L_0x002b:
            r3.f59222e = r0
            r4 = 0
            r3.f59221d = r4
        L_0x0030:
            java.lang.String r4 = "set_password_show"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "platform"
            boolean r2 = r3.f59221d
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = "phone"
            goto L_0x0042
        L_0x0040:
            java.lang.String r2 = "email"
        L_0x0042:
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21876e.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo44862a(R.id.e42);
        if (inputResultIndicator != null) {
            inputResultIndicator.mo45987a(str);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f59222e) {
            LoadingButton loadingButton = (LoadingButton) mo44862a(R.id.e40);
            String string = getString(R.string.adb);
            C52711k.m112236a((Object) string, "getString(R.string.common_login_input_button)");
            loadingButton.setText(string);
        }
        ((InputWithIndicator) mo44862a(R.id.e41)).getEditText().addTextChangedListener(new C21878b(this));
        mo45997a((LoadingButton) mo44862a(R.id.e40), new C21879c(this));
    }
}
