package com.p683ss.android.ugc.aweme.account.login.recover;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.AccountKeyBoardHelper.C21854a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21996c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21868b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21414b.C21416b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21417a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21418b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21419c;
import com.p683ss.android.ugc.aweme.account.p1307ui.InputWithIndicator;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.utils.C22293a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a */
public final class C21403a extends C21868b implements OnClickListener, C21055ac, C21996c {

    /* renamed from: j */
    public static final C21404a f58076j = new C21404a(null);

    /* renamed from: a */
    public EditText f58077a;

    /* renamed from: b */
    public boolean f58078b;

    /* renamed from: c */
    public boolean f58079c;

    /* renamed from: d */
    public C21417a f58080d;

    /* renamed from: e */
    public String f58081e;

    /* renamed from: k */
    private String f58082k = "";

    /* renamed from: p */
    private boolean f58083p = true;

    /* renamed from: q */
    private boolean f58084q;

    /* renamed from: r */
    private boolean f58085r;

    /* renamed from: s */
    private HashMap f58086s;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$a */
    public static final class C21404a {
        private C21404a() {
        }

        public /* synthetic */ C21404a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$b */
    static final class C21405b<T> implements C1710e<C21418b> {

        /* renamed from: a */
        final /* synthetic */ C21403a f58087a;

        /* renamed from: b */
        final /* synthetic */ boolean f58088b;

        C21405b(C21403a aVar, boolean z) {
            this.f58087a = aVar;
            this.f58088b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r12) {
            /*
                r11 = this;
                com.ss.android.ugc.aweme.account.login.recover.a.b.b r12 = (com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21418b) r12
                r0 = 2132548302(0x7f1c1ace, float:2.0749875E38)
                r1 = 2132548300(0x7f1c1acc, float:2.074987E38)
                r2 = 0
                r3 = 1
                r4 = 0
                if (r12 == 0) goto L_0x006a
                java.lang.String r5 = r12.f58106h
                if (r5 == 0) goto L_0x0045
                java.lang.String r5 = r12.f58106h
                boolean r5 = com.bytedance.p879t.p882c.C13248c.m26638a(r5)
                if (r5 != 0) goto L_0x0045
                com.ss.android.ugc.aweme.account.login.recover.a r5 = r11.f58087a
                java.lang.String r6 = r12.f58106h
                r5.f58081e = r6
                com.ss.android.ugc.aweme.account.login.recover.a r5 = r11.f58087a
                java.lang.String r6 = r12.f58106h
                if (r6 != 0) goto L_0x0028
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0028:
                boolean r7 = r11.f58088b
                r8 = r5
                com.ss.android.ugc.aweme.account.login.v2.base.b r8 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b) r8
                com.ss.android.ugc.aweme.account.login.v2.base.h r9 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
                com.ss.android.ugc.aweme.account.login.v2.base.i r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_EMAIL_USERNAME_RECOVER
                c.a.n r6 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.m54406a(r8, r6, r9, r10)
                com.ss.android.ugc.aweme.account.login.recover.a$e r8 = new com.ss.android.ugc.aweme.account.login.recover.a$e
                r8.<init>(r5, r7)
                c.a.d.e r8 = (p064c.p065a.p071d.C1710e) r8
                c.a.n r5 = r6.mo6496c(r8)
                r5.mo6491b()
                r5 = 1
                goto L_0x006b
            L_0x0045:
                boolean r5 = r11.f58088b
                if (r5 == 0) goto L_0x005a
                com.ss.android.ugc.aweme.account.login.recover.a r5 = r11.f58087a
                com.ss.android.ugc.aweme.account.login.recover.a r6 = r11.f58087a
                java.lang.String r6 = r6.getString(r1)
                java.lang.String r7 = "getString(R.string.recover_account_valid_email)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                r5.mo45582a(0, r6)
                goto L_0x006a
            L_0x005a:
                com.ss.android.ugc.aweme.account.login.recover.a r5 = r11.f58087a
                com.ss.android.ugc.aweme.account.login.recover.a r6 = r11.f58087a
                java.lang.String r6 = r6.getString(r0)
                java.lang.String r7 = "getString(R.string.recover_account_valid_username)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
                r5.mo45582a(0, r6)
            L_0x006a:
                r5 = 0
            L_0x006b:
                if (r12 != 0) goto L_0x0092
                boolean r12 = r11.f58088b
                if (r12 == 0) goto L_0x0082
                com.ss.android.ugc.aweme.account.login.recover.a r12 = r11.f58087a
                com.ss.android.ugc.aweme.account.login.recover.a r0 = r11.f58087a
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "getString(R.string.recover_account_valid_email)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r12.mo45582a(0, r0)
                goto L_0x0092
            L_0x0082:
                com.ss.android.ugc.aweme.account.login.recover.a r12 = r11.f58087a
                com.ss.android.ugc.aweme.account.login.recover.a r1 = r11.f58087a
                java.lang.String r0 = r1.getString(r0)
                java.lang.String r1 = "getString(R.string.recover_account_valid_username)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r12.mo45582a(0, r0)
            L_0x0092:
                java.lang.String r12 = "login_click_next_result"
                com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
                r0.<init>()
                java.lang.String r1 = "platform"
                boolean r2 = r11.f58088b
                if (r2 == 0) goto L_0x00a2
                java.lang.String r2 = "email"
                goto L_0x00a4
            L_0x00a2:
                java.lang.String r2 = "username"
            L_0x00a4:
                com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
                java.lang.String r1 = "status"
                com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44774a(r1, r5)
                java.lang.String r1 = "error_code"
                com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44774a(r1, r4)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r12, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21403a.C21405b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$c */
    static final class C21406c<T> implements C1710e<C21417a> {

        /* renamed from: a */
        final /* synthetic */ C21403a f58089a;

        /* renamed from: b */
        final /* synthetic */ boolean f58090b;

        C21406c(C21403a aVar, boolean z) {
            this.f58089a = aVar;
            this.f58090b = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r2.f34031k != false) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r14) {
            /*
                r13 = this;
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r14 = (com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21417a) r14
                r0 = 0
                r1 = 0
                if (r14 == 0) goto L_0x0127
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                r2.f58080d = r14
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r2 = r2.f58080d
                if (r2 == 0) goto L_0x0127
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r2 = r2.f58080d
                if (r2 != 0) goto L_0x0019
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0019:
                boolean r2 = r2.f34029i
                if (r2 != 0) goto L_0x0037
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r2 = r2.f58080d
                if (r2 != 0) goto L_0x0026
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0026:
                boolean r2 = r2.f34030j
                if (r2 != 0) goto L_0x0037
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r2 = r2.f58080d
                if (r2 != 0) goto L_0x0033
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0033:
                boolean r2 = r2.f34031k
                if (r2 == 0) goto L_0x0044
            L_0x0037:
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r2 = r2.f58080d
                if (r2 != 0) goto L_0x0040
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0040:
                boolean r2 = r2.f58105s
                if (r2 == 0) goto L_0x009b
            L_0x0044:
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                android.os.Bundle r2 = r2.getArguments()
                if (r2 == 0) goto L_0x0053
                java.lang.String r3 = "feedback_param"
                java.lang.String r2 = r2.getString(r3)
                goto L_0x0054
            L_0x0053:
                r2 = r1
            L_0x0054:
                com.ss.android.ugc.aweme.account.login.recover.a r3 = r13.f58089a
                android.content.Context r3 = r3.getContext()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "//feedback_input"
                r4.<init>(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r3, r2)
                java.lang.String r3 = "username"
                com.ss.android.ugc.aweme.account.login.recover.a r4 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r4.f58080d
                if (r4 != 0) goto L_0x0077
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0077:
                java.lang.String r4 = r4.f58104r
                com.bytedance.router.SmartRoute r2 = r2.withParam(r3, r4)
                java.lang.String r3 = "has_mobile"
                com.bytedance.router.SmartRoute r2 = r2.withParam(r3, r0)
                java.lang.String r3 = "has_email"
                com.bytedance.router.SmartRoute r2 = r2.withParam(r3, r0)
                r2.open()
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                android.widget.EditText r2 = com.p683ss.android.ugc.aweme.account.login.recover.C21403a.m54019a(r2)
                java.lang.String r3 = ""
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.setText(r3)
                goto L_0x0127
            L_0x009b:
                com.ss.android.ugc.aweme.account.login.recover.a r2 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a r3 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.f$b r12 = new com.ss.android.ugc.aweme.account.login.recover.f$b
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58080d
                if (r4 == 0) goto L_0x00a9
                java.lang.String r4 = r4.f58103q
                r5 = r4
                goto L_0x00aa
            L_0x00a9:
                r5 = r1
            L_0x00aa:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58080d
                if (r4 == 0) goto L_0x00b2
                java.lang.String r4 = r4.f58104r
                r6 = r4
                goto L_0x00b3
            L_0x00b2:
                r6 = r1
            L_0x00b3:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58080d
                if (r4 == 0) goto L_0x00bb
                java.lang.String r4 = r4.f34028h
                r7 = r4
                goto L_0x00bc
            L_0x00bb:
                r7 = r1
            L_0x00bc:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58080d
                if (r4 == 0) goto L_0x00c4
                java.lang.String r4 = r4.f34034n
                r8 = r4
                goto L_0x00c5
            L_0x00c4:
                r8 = r1
            L_0x00c5:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58080d
                if (r4 == 0) goto L_0x00cd
                java.util.List<java.lang.String> r4 = r4.f34035o
                r9 = r4
                goto L_0x00ce
            L_0x00cd:
                r9 = r1
            L_0x00ce:
                java.lang.String r10 = r3.f58081e
                boolean r11 = r3.f58079c
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                android.os.Bundle r3 = r2.getArguments()
                if (r3 != 0) goto L_0x00e1
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
            L_0x00e1:
                java.lang.String r4 = "next_page"
                com.ss.android.ugc.aweme.account.login.v2.base.i r5 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.RECOVER_VERIFY_EMAIL_PHONE_THIRD_PARTY
                int r5 = r5.getValue()
                r3.putInt(r4, r5)
                java.lang.String r4 = "current_scene"
                com.ss.android.ugc.aweme.account.login.v2.base.h r5 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
                int r5 = r5.getValue()
                r3.putInt(r4, r5)
                java.lang.String r4 = "verify_account_data"
                java.io.Serializable r12 = (java.io.Serializable) r12
                r3.putSerializable(r4, r12)
                com.p683ss.android.ugc.aweme.C23826bi.m58466g()
                java.lang.String r4 = "(arguments ?: Bundle()).…\n\n            }\n        }"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r2.mo45961a(r3)
                android.widget.EditText r3 = r2.f58077a
                if (r3 != 0) goto L_0x0112
                java.lang.String r4 = "emailInput"
                p2628d.p2639f.p2641b.C52711k.m112237a(r4)
            L_0x0112:
                java.lang.String r4 = ""
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
                android.widget.EditText r2 = r2.f58077a
                if (r2 != 0) goto L_0x0122
                java.lang.String r3 = "emailInput"
                p2628d.p2639f.p2641b.C52711k.m112237a(r3)
            L_0x0122:
                android.view.View r2 = (android.view.View) r2
                com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.m58184c(r2)
            L_0x0127:
                if (r14 != 0) goto L_0x0155
                boolean r14 = r13.f58090b
                r2 = 1
                if (r14 == 0) goto L_0x0142
                com.ss.android.ugc.aweme.account.login.recover.a r14 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a r3 = r13.f58089a
                r4 = 2132548300(0x7f1c1acc, float:2.074987E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "getString(R.string.recover_account_valid_email)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r14.mo45582a(0, r3)
                return
            L_0x0142:
                com.ss.android.ugc.aweme.account.login.recover.a r14 = r13.f58089a
                com.ss.android.ugc.aweme.account.login.recover.a r3 = r13.f58089a
                r4 = 2132548302(0x7f1c1ace, float:2.0749875E38)
                java.lang.String r3 = r3.getString(r4)
                java.lang.String r4 = "getString(R.string.recover_account_valid_username)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r14.mo45582a(0, r3)
            L_0x0155:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21403a.C21406c.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$d */
    public static final class C21407d extends C23698l {

        /* renamed from: a */
        final /* synthetic */ C21403a f58091a;

        C21407d(C21403a aVar) {
            this.f58091a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            if (this.f58091a.isViewValid()) {
                LoadingButton loadingButton = (LoadingButton) this.f58091a.mo44862a((int) R.id.e6y);
                C52711k.m112236a((Object) loadingButton, "emailLoginNextBtn");
                loadingButton.setEnabled(!C21994b.m54753b(C21403a.m54019a(this.f58091a)));
                View a = this.f58091a.mo44862a((int) R.id.e6x);
                C52711k.m112236a((Object) a, "emailLoginInclude");
                ((InputResultIndicator) a.findViewById(R.id.ecz)).mo45986a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a$e */
    static final class C21408e<T> implements C1710e<C21419c> {

        /* renamed from: a */
        final /* synthetic */ C21403a f58092a;

        /* renamed from: b */
        final /* synthetic */ boolean f58093b;

        C21408e(C21403a aVar, boolean z) {
            this.f58092a = aVar;
            this.f58093b = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            C21419c cVar = (C21419c) obj;
            if (cVar != null) {
                this.f58092a.f58079c = cVar.f58107h;
                String str = cVar.f58108i;
                if (this.f58092a.f58081e != null) {
                    C21403a aVar = this.f58092a;
                    String str2 = this.f58092a.f58081e;
                    if (str2 == null) {
                        C52711k.m112234a();
                    }
                    boolean z = this.f58092a.f58079c;
                    C21677s.m54411b(aVar, str2, str, C21848h.RECOVER_ACCOUNT, C21850i.PHONE_EMAIL_USERNAME_RECOVER).mo6496c((C1710e<? super T>) new C21406c<Object>(aVar, this.f58093b)).mo6491b();
                }
                if (this.f58092a.f58081e == null) {
                    if (this.f58093b) {
                        C21403a aVar2 = this.f58092a;
                        String string = this.f58092a.getString(R.string.h96);
                        C52711k.m112236a((Object) string, "getString(R.string.recover_account_valid_email)");
                        aVar2.mo45582a(0, string);
                    } else {
                        C21403a aVar3 = this.f58092a;
                        String string2 = this.f58092a.getString(R.string.h98);
                        C52711k.m112236a((Object) string2, "getString(R.string.recover_account_valid_username)");
                        aVar3.mo45582a(0, string2);
                    }
                }
            }
            if (cVar == null) {
                if (this.f58093b) {
                    C21403a aVar4 = this.f58092a;
                    String string3 = this.f58092a.getString(R.string.h96);
                    C52711k.m112236a((Object) string3, "getString(R.string.recover_account_valid_email)");
                    aVar4.mo45582a(0, string3);
                    return;
                }
                C21403a aVar5 = this.f58092a;
                String string4 = this.f58092a.getString(R.string.h98);
                C52711k.m112236a((Object) string4, "getString(R.string.recover_account_valid_username)");
                aVar5.mo45582a(0, string4);
            }
        }
    }

    /* renamed from: u */
    private final void m54020u() {
        m54021v();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f58086s == null) {
            this.f58086s = new HashMap();
        }
        View view = (View) this.f58086s.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58086s.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean ai_() {
        return this.f58083p;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f58086s != null) {
            this.f58086s.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.ayu;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void onResume() {
        super.onResume();
    }

    public final void ad_() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.e6y);
        if (loadingButton != null) {
            loadingButton.mo46295a();
        }
    }

    /* renamed from: e */
    public final void mo45584e() {
        LoadingButton loadingButton = (LoadingButton) mo44862a((int) R.id.e6y);
        if (loadingButton != null) {
            loadingButton.mo46296b();
        }
    }

    /* renamed from: v */
    private final void m54021v() {
        if (C21854a.m54534a()) {
            EditText editText = this.f58077a;
            if (editText == null) {
                C52711k.m112237a("emailInput");
            }
            C21994b.m54752a(editText);
            return;
        }
        EditText editText2 = this.f58077a;
        if (editText2 == null) {
            C52711k.m112237a("emailInput");
        }
        editText2.requestFocus();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, false, null, false, true, 102, null);
        return aVar;
    }

    /* renamed from: j */
    public final String mo45586j() {
        EditText editText = this.f58077a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        return editText.getText().toString();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m54019a(C21403a aVar) {
        EditText editText = aVar.f58077a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        return editText;
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                m54020u();
                return;
            }
            this.f58078b = true;
        }
    }

    public final void onClick(View view) {
        int i;
        String str;
        ClickInstrumentation.onClick(view);
        this.f58084q = false;
        this.f58085r = false;
        String str2 = null;
        this.f58080d = null;
        this.f58079c = false;
        this.f58083p = false;
        C22293a.m55177a(getContext());
        EditText editText = this.f58077a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        String obj = editText.getText().toString();
        boolean a = C21145a.m53660a(obj);
        if (a) {
            i = 4;
            str2 = obj;
            obj = null;
        } else {
            i = 1;
        }
        C21416b bVar = new C21416b(i, null, null, C9431p.m18668d(obj), C9431p.m18668d(str2));
        C21829b bVar2 = this;
        C21848h hVar = C21848h.RECOVER_ACCOUNT;
        C21850i iVar = C21850i.PHONE_EMAIL_USERNAME_RECOVER;
        if (a) {
            str = "email";
        } else {
            str = "username";
        }
        C21677s.m54402a(bVar2, bVar, hVar, iVar, str).mo6496c((C1710e<? super T>) new C21405b<Object>(this, a)).mo6491b();
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        View a = mo44862a((int) R.id.e6x);
        C52711k.m112236a((Object) a, "emailLoginInclude");
        ((InputResultIndicator) a.findViewById(R.id.ecz)).mo45987a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        View a = mo44862a((int) R.id.e6x);
        C52711k.m112236a((Object) a, "emailLoginInclude");
        this.f58077a = ((InputWithIndicator) a.findViewById(R.id.ecy)).getEditText();
        C21407d dVar = new C21407d(this);
        EditText editText = this.f58077a;
        if (editText == null) {
            C52711k.m112237a("emailInput");
        }
        editText.setInputType(32);
        editText.setHint(getString(R.string.ad3));
        editText.addTextChangedListener(dVar);
        if (!TextUtils.isEmpty(this.f58082k)) {
            editText.setText(this.f58082k);
            editText.setSelection(this.f58082k.length());
        }
        mo45997a((LoadingButton) mo44862a((int) R.id.e6y), this);
        if (this.f58078b) {
            m54020u();
        }
    }
}
