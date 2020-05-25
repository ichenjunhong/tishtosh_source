package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21996c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.recover.C21444f.C21446b;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.utils.C22293a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g */
public final class C21883g extends C21868b implements OnClickListener, C21055ac, C21996c {

    /* renamed from: e */
    public static final C21884a f59231e = new C21884a(null);

    /* renamed from: a */
    public EditText f59232a;

    /* renamed from: b */
    public EditText f59233b;

    /* renamed from: c */
    public boolean f59234c;

    /* renamed from: d */
    public C21446b f59235d;

    /* renamed from: j */
    private boolean f59236j;

    /* renamed from: k */
    private String f59237k = "";

    /* renamed from: p */
    private boolean f59238p = true;

    /* renamed from: q */
    private HashMap f59239q;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$a */
    public static final class C21884a {
        private C21884a() {
        }

        public /* synthetic */ C21884a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$b */
    static final class C21885b<T> implements C1710e<C12993e<C13121t>> {

        /* renamed from: a */
        public static final C21885b f59240a = new C21885b();

        C21885b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$c */
    public static final class C21886c extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21883g f59241a;

        C21886c(C21883g gVar) {
            this.f59241a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r3) {
            /*
                r2 = this;
                super.afterTextChanged(r3)
                com.ss.android.ugc.aweme.account.login.v2.ui.a.g r3 = r2.f59241a
                boolean r3 = r3.isViewValid()
                if (r3 != 0) goto L_0x000c
                return
            L_0x000c:
                com.ss.android.ugc.aweme.account.login.v2.ui.a.g r3 = r2.f59241a
                r0 = 2132018774(0x7f140656, float:1.9675864E38)
                android.view.View r3 = r3.mo44862a(r0)
                com.ss.android.ugc.aweme.account.ui.LoadingButton r3 = (com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton) r3
                java.lang.String r0 = "emailLoginNextBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.account.login.v2.ui.a.g r0 = r2.f59241a
                android.widget.EditText r0 = r0.f59232a
                if (r0 != 0) goto L_0x0027
                java.lang.String r1 = "emailInput"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0027:
                boolean r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b.m54753b(r0)
                if (r0 != 0) goto L_0x0040
                com.ss.android.ugc.aweme.account.login.v2.ui.a.g r0 = r2.f59241a
                android.widget.EditText r0 = r0.f59233b
                if (r0 != 0) goto L_0x0038
                java.lang.String r1 = "passwordInput"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0038:
                boolean r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b.m54753b(r0)
                if (r0 != 0) goto L_0x0040
                r0 = 1
                goto L_0x0041
            L_0x0040:
                r0 = 0
            L_0x0041:
                r3.setEnabled(r0)
                com.ss.android.ugc.aweme.account.login.v2.ui.a.g r3 = r2.f59241a
                r0 = 2132018773(0x7f140655, float:1.9675862E38)
                android.view.View r0 = r3.mo44862a(r0)
                if (r0 == 0) goto L_0x005d
                r1 = 2132019752(0x7f140a28, float:1.9677848E38)
                android.view.View r0 = r0.findViewById(r1)
                com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator r0 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator) r0
                if (r0 == 0) goto L_0x005d
                r0.mo45986a()
            L_0x005d:
                r0 = 2132018776(0x7f140658, float:1.9675868E38)
                android.view.View r3 = r3.mo44862a(r0)
                com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator r3 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator) r3
                if (r3 == 0) goto L_0x006c
                r3.mo45986a()
                return
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21883g.C21886c.afterTextChanged(android.text.Editable):void");
        }
    }

    /* renamed from: u */
    private final void m54592u() {
        m54593v();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f59239q == null) {
            this.f59239q = new HashMap();
        }
        View view = (View) this.f59239q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59239q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean ai_() {
        return this.f59238p;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f59239q != null) {
            this.f59239q.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.b0r;
    }

    public final void ad_() {
        LoadingButton loadingButton = (LoadingButton) mo44862a(R.id.e6y);
        if (loadingButton != null) {
            loadingButton.mo46295a();
        }
    }

    /* renamed from: e */
    public final void mo45584e() {
        LoadingButton loadingButton = (LoadingButton) mo44862a(R.id.e6y);
        if (loadingButton != null) {
            loadingButton.mo46296b();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f59236j) {
            m54593v();
        }
    }

    /* renamed from: j */
    public final String mo45586j() {
        EditText editText = this.f59232a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        return editText.getText().toString();
    }

    /* renamed from: v */
    private final void m54593v() {
        EditText editText;
        EditText editText2 = this.f59232a;
        if (editText2 == null) {
            C52711k.m112237a("emailInput");
        }
        if (C21994b.m54753b(editText2)) {
            editText = this.f59232a;
            if (editText == null) {
                C52711k.m112237a("emailInput");
            }
        } else {
            editText = this.f59233b;
            if (editText == null) {
                C52711k.m112237a("passwordInput");
            }
        }
        if (C21854a.m54534a()) {
            C21994b.m54752a(editText);
        } else {
            editText.requestFocus();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.f59232a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        KeyboardUtils.m58184c(editText);
        EditText editText2 = this.f59233b;
        if (editText2 == null) {
            C52711k.m112237a("passwordInput");
        }
        KeyboardUtils.m58184c(editText2);
        mo44866g();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        if (this.f59236j) {
            C21861a aVar = new C21861a(getString(R.string.adb), null, false, getString(R.string.fxw), getString(R.string.fxv), false, "email_sign_up_to_login_enter_password_page", false, true, 166, null);
            return aVar;
        }
        C21861a aVar2 = new C21861a(null, null, false, null, null, false, "email_login_homepage", false, true, 191, null);
        return aVar2;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                m54592u();
                return;
            }
            this.f59234c = true;
        }
    }

    public final void onClick(View view) {
        Boolean bool;
        String str;
        String str2;
        ClickInstrumentation.onClick(view);
        boolean z = false;
        this.f59238p = false;
        C22293a.m55177a(getContext());
        EditText editText = this.f59232a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        String obj = editText.getText().toString();
        EditText editText2 = this.f59233b;
        if (editText2 == null) {
            C52711k.m112237a("passwordInput");
        }
        String obj2 = editText2.getText().toString();
        boolean a = C21145a.m53660a(obj);
        String str3 = null;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bool = Boolean.valueOf(arguments.getBoolean("email_should_add_email", false));
            } else {
                bool = null;
            }
        } else {
            bool = Boolean.valueOf(false);
        }
        if (this.f59235d != null) {
            C21446b bVar = this.f59235d;
            if (bVar == null) {
                C52711k.m112234a();
            }
            z = bVar.getSafe();
        }
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            if (bool == null) {
                C52711k.m112234a();
            }
            if (bool.booleanValue() && z) {
                C21829b bVar2 = this;
                if (a) {
                    str2 = "email";
                } else {
                    str2 = "handle";
                }
                C21446b bVar3 = this.f59235d;
                if (bVar3 != null) {
                    str3 = bVar3.getTicket();
                }
                C21677s.m54409a(bVar2, obj, obj2, str2, str3).mo6496c((C1710e<? super T>) C21885b.f59240a).mo6491b();
                return;
            }
        }
        C21829b bVar4 = this;
        if (a) {
            str = "email";
        } else {
            str = "handle";
        }
        C21677s.m54408a(bVar4, obj, obj2, str).mo6491b();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        Serializable serializable;
        super.onCreate(bundle);
        Boolean bool = null;
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("recover_account_data");
            } else {
                serializable = null;
            }
            this.f59235d = (C21446b) serializable;
        }
        boolean z2 = false;
        if (mo45965k() == C21850i.EMAIL_PASSWORD_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        this.f59236j = z;
        if (this.f59236j) {
            this.f59237k = C21839d.f59130a.mo45972a((Fragment) this);
            return;
        }
        if (getArguments() != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                bool = Boolean.valueOf(arguments2.getBoolean("email_should_add_email", false));
            }
        } else {
            bool = Boolean.valueOf(false);
        }
        if (this.f59235d != null) {
            C21446b bVar = this.f59235d;
            if (bVar == null) {
                C52711k.m112234a();
            }
            z2 = bVar.getSafe();
        }
        if (mo45970p() == C21848h.RECOVER_ACCOUNT) {
            if (bool == null) {
                C52711k.m112234a();
            }
            if (bool.booleanValue()) {
                if (z2) {
                    C21446b bVar2 = this.f59235d;
                    if (bVar2 != null && bVar2.getEmail() != null) {
                        C21446b bVar3 = this.f59235d;
                        if (bVar3 == null) {
                            C52711k.m112234a();
                        }
                        this.f59237k = String.valueOf(bVar3.getEmail());
                    } else {
                        return;
                    }
                }
            }
        }
        if (!C23826bi.m58466g()) {
            BaseLoginMethod a = C21518u.m54170a(LoginMethodName.DEFAULT);
            if (a instanceof AccountPassLoginMethod) {
                this.f59237k = ((AccountPassLoginMethod) a).getName();
            }
        }
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        View a = mo44862a(R.id.e6x);
        if (a != null) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) a.findViewById(R.id.ecz);
            if (inputResultIndicator != null) {
                inputResultIndicator.f59160a.setVisibility(0);
                inputResultIndicator.f59160a.setBackgroundColor(inputResultIndicator.f59162c);
                inputResultIndicator.f59161b.setVisibility(8);
            }
        }
        InputResultIndicator inputResultIndicator2 = (InputResultIndicator) mo44862a(R.id.e70);
        if (inputResultIndicator2 != null) {
            inputResultIndicator2.mo45987a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010b, code lost:
        if (r1 != false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            super.onViewCreated(r6, r7)
            r6 = 2132018773(0x7f140655, float:1.9675862E38)
            android.view.View r6 = r5.mo44862a(r6)
            java.lang.String r7 = "emailLoginInclude"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r7 = 2132019751(0x7f140a27, float:1.9677846E38)
            android.view.View r6 = r6.findViewById(r7)
            com.ss.android.ugc.aweme.account.ui.InputWithIndicator r6 = (com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator) r6
            android.widget.EditText r6 = r6.getEditText()
            r5.f59232a = r6
            r6 = 2132018775(0x7f140657, float:1.9675866E38)
            android.view.View r6 = r5.mo44862a(r6)
            com.ss.android.ugc.aweme.account.ui.InputWithIndicator r6 = (com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator) r6
            android.widget.EditText r6 = r6.getEditText()
            r5.f59233b = r6
            com.ss.android.ugc.aweme.account.login.v2.ui.a.g$c r6 = new com.ss.android.ugc.aweme.account.login.v2.ui.a.g$c
            r6.<init>(r5)
            android.os.Bundle r7 = r5.getArguments()
            r0 = 0
            if (r7 == 0) goto L_0x0051
            android.os.Bundle r7 = r5.getArguments()
            if (r7 == 0) goto L_0x004f
            java.lang.String r1 = "email_should_add_email"
            boolean r7 = r7.getBoolean(r1, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0055
        L_0x004f:
            r7 = 0
            goto L_0x0055
        L_0x0051:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0055:
            com.ss.android.ugc.aweme.account.login.recover.f$b r1 = r5.f59235d
            if (r1 != 0) goto L_0x005b
            r1 = 0
            goto L_0x0066
        L_0x005b:
            com.ss.android.ugc.aweme.account.login.recover.f$b r1 = r5.f59235d
            if (r1 != 0) goto L_0x0062
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0062:
            boolean r1 = r1.getSafe()
        L_0x0066:
            com.ss.android.ugc.aweme.account.login.v2.base.h r2 = r5.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r3 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            if (r2 != r3) goto L_0x00bb
            if (r7 != 0) goto L_0x0073
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0073:
            boolean r2 = r7.booleanValue()
            if (r2 == 0) goto L_0x00bb
            if (r1 == 0) goto L_0x00bb
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x008d
            android.widget.EditText r2 = r5.f59232a
            if (r2 != 0) goto L_0x008a
            java.lang.String r3 = "emailInput"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x008a:
            r2.setFocusedByDefault(r0)
        L_0x008d:
            android.widget.EditText r2 = r5.f59232a
            if (r2 != 0) goto L_0x0096
            java.lang.String r3 = "emailInput"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0096:
            r2.setFocusableInTouchMode(r0)
            android.content.Context r2 = r5.getContext()
            if (r2 == 0) goto L_0x00bb
            android.widget.EditText r2 = r5.f59232a
            if (r2 != 0) goto L_0x00a8
            java.lang.String r3 = "emailInput"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00a8:
            android.content.Context r3 = r5.getContext()
            if (r3 != 0) goto L_0x00b1
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00b1:
            r4 = 2131822065(0x7f1105f1, float:1.927689E38)
            int r3 = android.support.p030v4.content.C0726c.m2098c(r3, r4)
            r2.setTextColor(r3)
        L_0x00bb:
            android.widget.EditText r2 = r5.f59232a
            if (r2 != 0) goto L_0x00c4
            java.lang.String r3 = "emailInput"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00c4:
            r3 = 32
            r2.setInputType(r3)
            r3 = 2132543163(0x7f1c06bb, float:2.0739451E38)
            java.lang.String r3 = r5.getString(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setHint(r3)
            android.text.TextWatcher r6 = (android.text.TextWatcher) r6
            r2.addTextChangedListener(r6)
            java.lang.String r3 = r5.f59237k
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r3 = r5.f59237k
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            java.lang.String r3 = r5.f59237k
            int r3 = r3.length()
            r2.setSelection(r3)
        L_0x00f4:
            boolean r3 = r5.f59236j
            if (r3 != 0) goto L_0x010d
            com.ss.android.ugc.aweme.account.login.v2.base.h r3 = r5.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            if (r3 != r4) goto L_0x0110
            if (r7 != 0) goto L_0x0105
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0105:
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0110
            if (r1 == 0) goto L_0x0110
        L_0x010d:
            r2.setEnabled(r0)
        L_0x0110:
            android.widget.EditText r7 = r5.f59233b
            if (r7 != 0) goto L_0x0119
            java.lang.String r1 = "passwordInput"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0119:
            r1 = 129(0x81, float:1.81E-43)
            r7.setInputType(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r7.setTypeface(r1)
            android.text.method.PasswordTransformationMethod r1 = new android.text.method.PasswordTransformationMethod
            r1.<init>()
            android.text.method.TransformationMethod r1 = (android.text.method.TransformationMethod) r1
            r7.setTransformationMethod(r1)
            r1 = 2132546762(0x7f1c14ca, float:2.0746751E38)
            java.lang.String r1 = r5.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.setHint(r1)
            r7.addTextChangedListener(r6)
            r6 = 2132018772(0x7f140654, float:1.967586E38)
            android.view.View r6 = r5.mo44862a(r6)
            java.lang.String r7 = "emailLoginForgotPassword"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()
            if (r7 != 0) goto L_0x0151
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0151:
            java.lang.String r1 = "activity!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
            android.app.Activity r7 = (android.app.Activity) r7
            r1 = r5
            com.ss.android.ugc.aweme.account.login.v2.base.b r1 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b) r1
            com.ss.android.ugc.aweme.account.login.v2.ui.a r2 = r5.f59207n
            if (r2 != 0) goto L_0x0162
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0162:
            java.lang.String r2 = r2.f59185g
            if (r2 != 0) goto L_0x0169
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0169:
            com.ss.android.ugc.aweme.account.login.v2.base.h r3 = r5.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r4 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            if (r3 != r4) goto L_0x0172
            r0 = 1
        L_0x0172:
            com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21997d.m54755a(r6, r7, r1, r2, r0)
            r6 = 2132018774(0x7f140656, float:1.9675864E38)
            android.view.View r6 = r5.mo44862a(r6)
            com.ss.android.ugc.aweme.account.ui.LoadingButton r6 = (com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton) r6
            r7 = r5
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            r5.mo45997a(r6, r7)
            boolean r6 = r5.f59234c
            if (r6 == 0) goto L_0x018b
            r5.m54592u()
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21883g.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
