package com.p683ss.android.ugc.aweme.account.p1300n;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13105d;
import com.bytedance.sdk.account.p861f.p863b.C13162t.C13163a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C22041x;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21665j;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21784k;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21786l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21787m;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21788n;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21790o;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.C21791p;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21806u;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21868b;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C2193n;
import p064c.p065a.C2197r;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.n.c */
public final class C22065c extends C21868b {

    /* renamed from: a */
    public String f59569a = "";

    /* renamed from: b */
    public String f59570b = "";

    /* renamed from: c */
    private HashMap f59571c;

    /* renamed from: com.ss.android.ugc.aweme.account.n.c$a */
    public static final class C22066a extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C22065c f59572a;

        C22066a(C22065c cVar) {
            this.f59572a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            super.afterTextChanged(editable);
            if (this.f59572a.isViewValid()) {
                String text = ((InputWithIndicator) this.f59572a.mo44862a(R.id.e41)).getText();
                boolean z2 = false;
                if (text.length() > 20) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59572a.mo44862a(R.id.e42);
                    String string = this.f59572a.getString(R.string.cbg);
                    C52711k.m112236a((Object) string, "getString(R.string.mus_password_too_long)");
                    inputResultIndicator.mo45987a(string);
                } else {
                    ((InputResultIndicator) this.f59572a.mo44862a(R.id.e42)).mo45986a();
                }
                LoadingButton loadingButton = (LoadingButton) this.f59572a.mo44862a(R.id.e40);
                C52711k.m112236a((Object) loadingButton, "createPasswordContinueBtn");
                if (text.length() >= 8 && !z) {
                    z2 = true;
                }
                loadingButton.setEnabled(z2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.c$b */
    static final class C22067b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22065c f59573a;

        C22067b(C22065c cVar) {
            this.f59573a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String text = ((InputWithIndicator) this.f59573a.mo44862a(R.id.e41)).getText();
            if (!C22041x.m54771a(text)) {
                C22065c cVar = this.f59573a;
                String string = this.f59573a.getString(R.string.afe);
                C52711k.m112236a((Object) string, "getString(R.string.commo…istration_password_error)");
                cVar.mo45582a(0, string);
            } else if (TextUtils.isEmpty(this.f59573a.f59569a)) {
                C21677s.m54403a(this.f59573a, text).mo6496c((C1710e<? super T>) new C1710e<C12993e<C13163a>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22067b f59576a;

                    {
                        this.f59576a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        C12993e eVar = (C12993e) obj;
                        C10691a.m21551c((Context) C23826bi.m58460b(), this.f59576a.f59573a.getString(R.string.zs)).mo19066a();
                        FragmentActivity activity = this.f59576a.f59573a.getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        activity.finish();
                    }
                }).mo6491b();
            } else if (TextUtils.equals(this.f59573a.f59570b, "email")) {
                C21829b bVar = this.f59573a;
                String str = this.f59573a.f59569a;
                C52711k.m112240b(bVar, "fragment");
                C52711k.m112240b(str, "ticket");
                C52711k.m112240b(text, "pwd");
                C2193n a = C2193n.m6558a((C2197r<T>) new C21784k<T>(bVar, str, text)).mo6496c((C1710e<? super T>) new C21786l<Object>(bVar)).mo6486a((C1710e<? super Throwable>) new C21787m<Object>(bVar));
                C52711k.m112236a((Object) a, "Maybe.create<MobileApiRe…nt.enterMethod)\n        }");
                C21806u.m54453a(bVar, a).mo6496c((C1710e<? super T>) new C1710e<C12993e<C21665j>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22067b f59574a;

                    {
                        this.f59574a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        C23826bi.m58451a(8, 1, (Object) ((C21665j) ((C12993e) obj).f34007h).f58696b);
                        C10691a.m21551c((Context) C23826bi.m58460b(), this.f59574a.f59573a.getString(R.string.a08)).mo19066a();
                        FragmentActivity activity = this.f59574a.f59573a.getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        activity.finish();
                    }
                }).mo6491b();
            } else {
                C21829b bVar2 = this.f59573a;
                String str2 = this.f59573a.f59569a;
                C52711k.m112240b(bVar2, "fragment");
                C52711k.m112240b(str2, "ticket");
                C52711k.m112240b(text, "pwd");
                C2193n a2 = C2193n.m6558a((C2197r<T>) new C21788n<T>(bVar2, str2, text)).mo6496c((C1710e<? super T>) new C21790o<Object>(bVar2)).mo6486a((C1710e<? super Throwable>) new C21791p<Object>(bVar2));
                C52711k.m112236a((Object) a2, "Maybe.create<MobileApiRe…nt.enterMethod)\n        }");
                C21806u.m54453a(bVar2, a2).mo6496c((C1710e<? super T>) new C1710e<C12993e<C13105d>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C22067b f59575a;

                    {
                        this.f59575a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        C23826bi.m58451a(8, 1, (Object) ((C13105d) ((C12993e) obj).f34007h).f34247b);
                        C10691a.m21551c((Context) C23826bi.m58460b(), this.f59575a.f59573a.getString(R.string.a08)).mo19066a();
                        FragmentActivity activity = this.f59575a.f59573a.getActivity();
                        if (activity == null) {
                            C52711k.m112234a();
                        }
                        activity.finish();
                    }
                }).mo6491b();
            }
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59571c == null) {
            this.f59571c = new HashMap();
        }
        View view = (View) this.f59571c.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59571c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59571c != null) {
            this.f59571c.clear();
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

    public final void onResume() {
        super.onResume();
        C21994b.m54752a(((InputWithIndicator) mo44862a(R.id.e41)).getEditText());
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59182d = getString(R.string.afg);
        aVar.f59183e = getString(R.string.aff);
        aVar.f59179a = " ";
        aVar.f59186h = false;
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r4 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            r4 = r3
            android.support.v4.app.Fragment r4 = (android.support.p030v4.app.Fragment) r4
            java.lang.String r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d.m54514e(r4)
            r3.f59569a = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x001a
            java.lang.String r0 = "platForm"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x001c
        L_0x001a:
            java.lang.String r4 = ""
        L_0x001c:
            r3.f59570b = r4
            java.lang.String r4 = "set_password_show"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "platform"
            java.lang.String r2 = r3.f59570b
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1300n.C22065c.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        ((InputResultIndicator) mo44862a(R.id.e42)).mo45987a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        ((InputWithIndicator) mo44862a(R.id.e41)).getEditText().addTextChangedListener(new C22066a(this));
        mo45997a((LoadingButton) mo44862a(R.id.e40), new C22067b(this));
    }
}
