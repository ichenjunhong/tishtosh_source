package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21842g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21842g.C21843a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21655b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21814x;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21814x.C21817c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21814x.C21818d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21814x.C21819e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C22000e;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.LeakCanaryFileProvider;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p095m.C2191a;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u */
public final class C21979u extends C21868b {

    /* renamed from: a */
    public C22000e f59410a;

    /* renamed from: b */
    public C21814x f59411b = new C21814x();

    /* renamed from: c */
    public EditText f59412c;

    /* renamed from: d */
    public final C21842g f59413d = new C21842g();

    /* renamed from: e */
    public boolean f59414e;

    /* renamed from: j */
    public String f59415j = "";

    /* renamed from: k */
    public C21655b f59416k;

    /* renamed from: p */
    public String f59417p = "";

    /* renamed from: q */
    private boolean f59418q = true;

    /* renamed from: r */
    private HashMap f59419r;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$a */
    public static final class C21980a extends C2191a<C21655b> {

        /* renamed from: a */
        final /* synthetic */ C21979u f59420a;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        C21980a(C21979u uVar) {
            this.f59420a = uVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            C21655b bVar = (C21655b) obj;
            C52711k.m112240b(bVar, "t");
            List<String> list = bVar.f58683b;
            if (list != null && (!list.isEmpty())) {
                if (this.f59420a.isViewValid()) {
                    this.f59420a.mo46052a(bVar);
                    return;
                }
                this.f59420a.f59416k = bVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$b */
    static final class C21981b extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C21979u f59421a;

        C21981b(C21979u uVar) {
            this.f59421a = uVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f59421a.f59414e = true;
                this.f59421a.mo46054j().setText(charSequence);
                C26890h.m65011a("choose_recommend_username", new C20856a().mo44776a("enter_from", this.f59421a.mo45966l()).mo44776a("enter_method", this.f59421a.mo45967m()).mo44776a("platform", this.f59421a.f59415j).f56798a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$c */
    static final class C21982c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21979u f59422a;

        C21982c(C21979u uVar) {
            this.f59422a = uVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21814x xVar = this.f59422a.f59411b;
            C21829b bVar = this.f59422a;
            String obj = this.f59422a.mo46054j().getText().toString();
            String str = this.f59422a.f59415j;
            String str2 = this.f59422a.f59417p;
            C52711k.m112240b(bVar, "fragment");
            C52711k.m112240b(obj, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(str, "platForm");
            C52711k.m112240b(str2, "originUsername");
            xVar.mo45949b();
            xVar.mo45947a().put("login_name", obj);
            xVar.f59078b = C21677s.m54398a(bVar, (Map<String, String>) xVar.mo45947a(), str, str2).mo6444a((C1710e<? super T>) new C21817c<Object>(obj, bVar)).mo6438a((C1710e<? super T>) C21818d.f59087a, (C1710e<? super Throwable>) C21819e.f59088a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$d */
    public static final class C21983d implements C21843a {

        /* renamed from: a */
        final /* synthetic */ C21979u f59423a;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$d$a */
        public static final class C21984a extends C2191a<C21655b> {

            /* renamed from: a */
            final /* synthetic */ C21983d f59424a;

            public final void onComplete() {
            }

            C21984a(C21983d dVar) {
                this.f59424a = dVar;
            }

            public final void onError(Throwable th) {
                String str;
                Iterable iterable;
                C52711k.m112240b(th, "e");
                C21979u uVar = this.f59424a.f59423a;
                C52711k.m112240b(th, "e");
                if (th instanceof C23459a) {
                    C23459a aVar = (C23459a) th;
                    List list = null;
                    if (aVar.getRawResponse() != null) {
                        Object rawResponse = aVar.getRawResponse();
                        if (rawResponse instanceof C21655b) {
                            C21655b bVar = (C21655b) rawResponse;
                            iterable = bVar.f58683b;
                            str = bVar.status_msg;
                        } else {
                            str = null;
                            iterable = null;
                        }
                        C22000e eVar = uVar.f59410a;
                        if (eVar == null) {
                            C52711k.m112234a();
                        }
                        if (iterable != null) {
                            List b = C52575l.m112128b(iterable);
                            if (b != null) {
                                list = C52575l.m112139e((Collection<? extends T>) b);
                            }
                        }
                        eVar.mo46068a(list);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        uVar.mo46053a(false, 1, str);
                        return;
                    }
                }
                uVar.mo46053a(true, 1, null);
            }

            public final /* synthetic */ void onNext(Object obj) {
                List list;
                C21655b bVar = (C21655b) obj;
                C52711k.m112240b(bVar, "t");
                C21979u uVar = this.f59424a.f59423a;
                C52711k.m112240b(bVar, "t");
                if (!C52711k.m112239a((Object) bVar.f58682a, (Object) Boolean.valueOf(false))) {
                    uVar.mo46053a(true, 3, null);
                    return;
                }
                uVar.mo46053a(false, 1, bVar.status_msg);
                C22000e eVar = uVar.f59410a;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                List<String> list2 = bVar.f58683b;
                if (list2 != null) {
                    List b = C52575l.m112128b((Iterable<? extends T>) list2);
                    if (b != null) {
                        list = C52575l.m112139e((Collection<? extends T>) b);
                        eVar.mo46068a(list);
                    }
                }
                list = null;
                eVar.mo46068a(list);
            }
        }

        C21983d(C21979u uVar) {
            this.f59423a = uVar;
        }

        /* renamed from: a */
        public final void mo45978a(String str) {
            C52711k.m112240b(str, "s");
            if (!TextUtils.isEmpty(str)) {
                View a = this.f59423a.mo44862a((int) R.id.ev6);
                C52711k.m112236a((Object) a, "setUsernameInclude");
                ((InputWithIndicator) a.findViewById(R.id.ecy)).mo46281a(2);
                this.f59423a.f59411b.mo45948a(str, new C21984a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.u$e */
    public static final class C21985e extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21979u f59425a;

        C21985e(C21979u uVar) {
            this.f59425a = uVar;
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f59425a.isViewValid()) {
                String obj = this.f59425a.mo46054j().getText().toString();
                boolean isEmpty = TextUtils.isEmpty(obj);
                if (isEmpty || this.f59425a.f59414e) {
                    this.f59425a.f59411b.mo45949b();
                    this.f59425a.f59413d.mo45977a("");
                }
                if (this.f59425a.f59414e) {
                    this.f59425a.mo46054j().setSelection(obj.length());
                    this.f59425a.mo46053a(true, 3, null);
                    this.f59425a.f59414e = false;
                    return;
                }
                C22000e eVar = this.f59425a.f59410a;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                eVar.mo46068a(null);
                this.f59425a.mo46053a(false, 1, null);
                if (!isEmpty) {
                    this.f59425a.f59413d.mo45977a(obj);
                }
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            if (!this.f59425a.f59414e) {
                if (i3 > 0 && i2 == 0) {
                    C26890h.m65011a("type_username", C20856a.m53173a().mo44776a("type", C42311c.f106862f).mo44776a("platform", this.f59425a.f59415j).f56798a);
                } else if (i3 != 0 || i2 <= 0) {
                    if (i3 > 0 && i2 > 0) {
                        C26890h.m65011a("type_username", C20856a.m53173a().mo44776a("type", "replace").mo44776a("platform", this.f59425a.f59415j).f56798a);
                    }
                } else {
                    C26890h.m65011a("type_username", C20856a.m53173a().mo44776a("type", "delete").mo44776a("platform", this.f59425a.f59415j).f56798a);
                }
            }
        }
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59419r == null) {
            this.f59419r = new HashMap();
        }
        View view = (View) this.f59419r.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59419r.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public final boolean mo44865f() {
        return this.f59418q;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59419r != null) {
            this.f59419r.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b11;
    }

    public final void ad_() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.ev7);
        if (loadingButton != null) {
            loadingButton.mo46295a();
        }
    }

    /* renamed from: e */
    public final void mo45584e() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.ev7);
        if (loadingButton != null) {
            loadingButton.mo46296b();
        }
    }

    /* renamed from: j */
    public final EditText mo46054j() {
        EditText editText = this.f59412c;
        if (editText == null) {
            C52711k.m112237a("etUserName");
        }
        return editText;
    }

    /* renamed from: W_ */
    public final void mo45995W_() {
        super.mo45995W_();
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ev8);
        C52711k.m112236a((Object) recyclerView, "setUsernameRv");
        recyclerView.setVisibility(8);
    }

    /* renamed from: X_ */
    public final void mo45996X_() {
        super.mo45996X_();
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ev8);
        C52711k.m112236a((Object) recyclerView, "setUsernameRv");
        recyclerView.setVisibility(0);
    }

    public final void onDestroyView() {
        this.f59416k = null;
        this.f59411b.mo45949b();
        this.f59413d.mo45975a();
        super.onDestroyView();
        mo44866g();
    }

    /* renamed from: t */
    public final void mo45999t() {
        this.f59418q = false;
        C26890h.m65011a("click_username_skip", C20856a.m53173a().mo44776a("platform", this.f59415j).f56798a);
        super.mo45999t();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f59179a = getString(R.string.afr);
        aVar.f59182d = getString(R.string.afw);
        aVar.f59183e = getString(R.string.afv);
        aVar.f59180b = getString(R.string.de5);
        aVar.f59184f = true;
        aVar.f59185g = "set_username";
        aVar.f59187i = true;
        return aVar;
    }

    public final void onResume() {
        super.onResume();
        if (C21854a.m54534a()) {
            EditText editText = this.f59412c;
            if (editText == null) {
                C52711k.m112237a("etUserName");
            }
            C21994b.m54752a(editText);
            return;
        }
        EditText editText2 = this.f59412c;
        if (editText2 == null) {
            C52711k.m112237a("etUserName");
        }
        editText2.requestFocus();
    }

    /* renamed from: a */
    public final void mo46052a(C21655b bVar) {
        List list;
        C52711k.m112240b(bVar, "t");
        List<String> list2 = bVar.f58683b;
        if (list2 != null) {
            List b = C52575l.m112128b((Iterable<? extends T>) list2);
            if (b != null) {
                list = C52575l.m112139e((Collection<? extends T>) b);
                if (list != null && (!list.isEmpty())) {
                    this.f59414e = true;
                    EditText editText = this.f59412c;
                    if (editText == null) {
                        C52711k.m112237a("etUserName");
                    }
                    editText.setText((CharSequence) list.get(0));
                    this.f59417p = (String) list.get(0);
                    C22000e eVar = this.f59410a;
                    if (eVar == null) {
                        C52711k.m112234a();
                    }
                    eVar.mo46068a(list.subList(1, list.size()));
                    return;
                }
            }
        }
        list = null;
        if (list != null) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0013
            java.lang.String r0 = "set_username_platform"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.getString(r0, r1)
            if (r4 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r4 = ""
        L_0x0015:
            r3.f59415j = r4
            java.lang.String r4 = "set_username_show"
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.mo45966l()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = r3.mo45967m()
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.lang.String r1 = "platform"
            java.lang.String r2 = r3.f59415j
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x005d
            java.lang.String r0 = "new_user_need_get_recommend_username"
            boolean r4 = r4.getBoolean(r0)
            r0 = 1
            if (r4 != r0) goto L_0x005c
            com.ss.android.ugc.aweme.account.login.v2.a.x r4 = r3.f59411b
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.account.login.v2.ui.a.u$a r1 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.u$a
            r1.<init>(r3)
            c.a.m.a r1 = (p064c.p065a.p095m.C2191a) r1
            r4.mo45948a(r0, r1)
        L_0x005c:
            return
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21979u.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        View a = mo44862a((int) R.id.ev6);
        if (a != null) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45987a(str);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        View a = mo44862a((int) R.id.ev6);
        C52711k.m112236a((Object) a, "setUsernameInclude");
        this.f59412c = ((InputWithIndicator) a.findViewById(R.id.ecy)).getEditText();
        EditText editText = this.f59412c;
        if (editText == null) {
            C52711k.m112237a("etUserName");
        }
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.aft));
        RecyclerView recyclerView = (RecyclerView) mo44862a((int) R.id.ev8);
        C52711k.m112236a((Object) recyclerView, "setUsernameRv");
        this.f59410a = new C22000e(recyclerView, null, new C21981b(this));
        C22000e eVar = this.f59410a;
        if (eVar == null) {
            C52711k.m112234a();
        }
        eVar.f59459a = true;
        mo45997a((LoadingButton) mo44862a((int) R.id.ev7), new C21982c(this));
        this.f59413d.mo45976a(new C21983d(this), 1000, TimeUnit.MILLISECONDS);
        EditText editText2 = this.f59412c;
        if (editText2 == null) {
            C52711k.m112237a("etUserName");
        }
        editText2.addTextChangedListener(new C21985e(this));
        if (this.f59416k != null) {
            C21655b bVar = this.f59416k;
            if (bVar == null) {
                C52711k.m112234a();
            }
            mo46052a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo46053a(boolean z, int i, String str) {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.ev7);
        C52711k.m112236a((Object) loadingButton, "setUsernameNextBtn");
        loadingButton.setEnabled(z);
        if (str == null) {
            View a = mo44862a((int) R.id.ev6);
            C52711k.m112236a((Object) a, "setUsernameInclude");
            ((InputResultIndicator) a.findViewById(R.id.ecz)).mo45986a();
        } else {
            View a2 = mo44862a((int) R.id.ev6);
            C52711k.m112236a((Object) a2, "setUsernameInclude");
            ((InputResultIndicator) a2.findViewById(R.id.ecz)).mo45987a(str);
        }
        View a3 = mo44862a((int) R.id.ev6);
        C52711k.m112236a((Object) a3, "setUsernameInclude");
        ((InputWithIndicator) a3.findViewById(R.id.ecy)).mo46281a(i);
    }
}
