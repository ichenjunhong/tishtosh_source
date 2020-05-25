package com.p683ss.android.ugc.aweme.account.login.recover;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.account.C22307v;
import com.p683ss.android.ugc.aweme.account.login.C21055ac;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21861a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.C21994b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.InputResultIndicator;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.p1296a.C21868b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.C21414b.C21416b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21417a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21418b;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21419c;
import com.p683ss.android.ugc.aweme.account.login.sms.C21460a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1307ui.LoadingButton;
import com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.c */
public final class C21434c extends C21868b implements C21055ac {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f58129a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21434c.class), "phoneHintHelper", "getPhoneHintHelper()Lcom/ss/android/ugc/aweme/account/login/sms/GooglePhoneHintHelper;"))};

    /* renamed from: k */
    public static final C21435a f58130k = new C21435a(null);

    /* renamed from: b */
    public boolean f58131b;

    /* renamed from: c */
    public C21417a f58132c;

    /* renamed from: d */
    boolean f58133d;

    /* renamed from: e */
    boolean f58134e;

    /* renamed from: j */
    public String f58135j;

    /* renamed from: p */
    private boolean f58136p = true;

    /* renamed from: q */
    private boolean f58137q;

    /* renamed from: r */
    private boolean f58138r;

    /* renamed from: s */
    private final C52668f f58139s = C52732g.m112285a(new C21440e(this));

    /* renamed from: t */
    private HashMap f58140t;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$a */
    public static final class C21435a {
        private C21435a() {
        }

        public /* synthetic */ C21435a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$b */
    static final class C21436b<T> implements C1710e<C21417a> {

        /* renamed from: a */
        final /* synthetic */ C21434c f58141a;

        C21436b(C21434c cVar) {
            this.f58141a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r1.f34031k != false) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r14) {
            /*
                r13 = this;
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r14 = (com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21417a) r14
                r0 = 0
                if (r14 == 0) goto L_0x0158
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                r1.f58132c = r14
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r1 = r1.f58132c
                if (r1 == 0) goto L_0x0158
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r1 = r1.f58132c
                if (r1 != 0) goto L_0x0018
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0018:
                boolean r1 = r1.f34029i
                r2 = 2132021561(0x7f141139, float:1.9681517E38)
                if (r1 != 0) goto L_0x0039
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r1 = r1.f58132c
                if (r1 != 0) goto L_0x0028
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0028:
                boolean r1 = r1.f34030j
                if (r1 != 0) goto L_0x0039
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r1 = r1.f58132c
                if (r1 != 0) goto L_0x0035
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0035:
                boolean r1 = r1.f34031k
                if (r1 == 0) goto L_0x0046
            L_0x0039:
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r1 = r1.f58132c
                if (r1 != 0) goto L_0x0042
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0042:
                boolean r1 = r1.f58105s
                if (r1 == 0) goto L_0x00c4
            L_0x0046:
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                android.os.Bundle r1 = r1.getArguments()
                if (r1 == 0) goto L_0x0055
                java.lang.String r3 = "feedback_param"
                java.lang.String r1 = r1.getString(r3)
                goto L_0x0056
            L_0x0055:
                r1 = r0
            L_0x0056:
                com.ss.android.ugc.aweme.account.login.recover.c r3 = r13.f58141a
                android.content.Context r3 = r3.getContext()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "//feedback_input"
                r4.<init>(r5)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r3, r1)
                java.lang.String r3 = "username"
                com.ss.android.ugc.aweme.account.login.recover.c r4 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r4.f58132c
                if (r4 != 0) goto L_0x0079
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0079:
                java.lang.String r4 = r4.f58104r
                com.bytedance.router.SmartRoute r1 = r1.withParam(r3, r4)
                java.lang.String r3 = "has_mobile"
                com.ss.android.ugc.aweme.account.login.recover.c r4 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r4.f58132c
                if (r4 != 0) goto L_0x008a
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x008a:
                boolean r4 = r4.f34030j
                com.bytedance.router.SmartRoute r1 = r1.withParam(r3, r4)
                java.lang.String r3 = "has_email"
                com.ss.android.ugc.aweme.account.login.recover.c r4 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r4.f58132c
                if (r4 != 0) goto L_0x009b
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x009b:
                boolean r4 = r4.f34029i
                com.bytedance.router.SmartRoute r1 = r1.withParam(r3, r4)
                r1.open()
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                android.view.View r1 = r1.mo44862a(r2)
                com.ss.android.ugc.aweme.account.ui.PhoneInputView r1 = (com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView) r1
                android.widget.EditText r1 = r1.getEditText()
                java.lang.String r3 = ""
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.setText(r3)
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                android.view.View r1 = r1.mo44862a(r2)
                com.ss.android.ugc.aweme.account.ui.PhoneInputView r1 = (com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView) r1
                r1.mo46309a()
                goto L_0x0158
            L_0x00c4:
                com.ss.android.ugc.aweme.account.login.recover.c r1 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.c r3 = r13.f58141a
                com.ss.android.ugc.aweme.account.login.recover.f$b r12 = new com.ss.android.ugc.aweme.account.login.recover.f$b
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58132c
                if (r4 == 0) goto L_0x00d2
                java.lang.String r4 = r4.f58103q
                r5 = r4
                goto L_0x00d3
            L_0x00d2:
                r5 = r0
            L_0x00d3:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58132c
                if (r4 == 0) goto L_0x00db
                java.lang.String r4 = r4.f58104r
                r6 = r4
                goto L_0x00dc
            L_0x00db:
                r6 = r0
            L_0x00dc:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58132c
                if (r4 == 0) goto L_0x00e4
                java.lang.String r4 = r4.f34028h
                r7 = r4
                goto L_0x00e5
            L_0x00e4:
                r7 = r0
            L_0x00e5:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58132c
                if (r4 == 0) goto L_0x00ed
                java.lang.String r4 = r4.f34034n
                r8 = r4
                goto L_0x00ee
            L_0x00ed:
                r8 = r0
            L_0x00ee:
                com.ss.android.ugc.aweme.account.login.recover.a.b.a r4 = r3.f58132c
                if (r4 == 0) goto L_0x00f6
                java.util.List<java.lang.String> r4 = r4.f34035o
                r9 = r4
                goto L_0x00f7
            L_0x00f6:
                r9 = r0
            L_0x00f7:
                java.lang.String r10 = r3.f58135j
                boolean r11 = r3.f58131b
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                android.os.Bundle r3 = r1.getArguments()
                if (r3 != 0) goto L_0x010a
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
            L_0x010a:
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
                java.lang.String r4 = "(arguments ?: Bundle()).…NT_DATA, model)\n        }"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r1.mo45961a(r3)
                android.view.View r3 = r1.mo44862a(r2)
                com.ss.android.ugc.aweme.account.ui.PhoneInputView r3 = (com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView) r3
                android.widget.EditText r3 = r3.getEditText()
                java.lang.String r4 = ""
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
                android.view.View r3 = r1.mo44862a(r2)
                com.ss.android.ugc.aweme.account.ui.PhoneInputView r3 = (com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView) r3
                r3.mo46309a()
                android.view.View r1 = r1.mo44862a(r2)
                com.ss.android.ugc.aweme.account.ui.PhoneInputView r1 = (com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView) r1
                android.widget.EditText r1 = r1.getEditText()
                android.view.View r1 = (android.view.View) r1
                com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.m58184c(r1)
            L_0x0158:
                if (r14 != 0) goto L_0x016f
                com.ss.android.ugc.aweme.account.login.recover.c r14 = r13.f58141a
                r1 = 0
                com.ss.android.ugc.aweme.account.login.recover.c r2 = r13.f58141a
                r3 = 2132548301(0x7f1c1acd, float:2.0749872E38)
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r3 = "getString(R.string.recov…count_valid_phone_number)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r3 = 1
                r14.mo45582a(0, r2)
            L_0x016f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21434c.C21436b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$c */
    static final class C21437c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21434c f58142a;

        C21437c(C21434c cVar) {
            this.f58142a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21434c cVar = this.f58142a;
            cVar.f58133d = false;
            cVar.f58134e = false;
            cVar.f58132c = null;
            cVar.f58131b = false;
            if (!C21134a.m53622b(((PhoneInputView) this.f58142a.mo44862a(R.id.eof)).getCountryCodeString(), ((PhoneInputView) this.f58142a.mo44862a(R.id.eof)).getPhoneNumberString())) {
                String m = this.f58142a.mo45967m();
                C52711k.m112240b(m, "enterMethod");
                C26890h.m65011a("login_click_next_result", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", m).mo44774a("is_success", 0).mo44774a("is_register", 0).f56798a);
                C21434c cVar2 = this.f58142a;
                String string = this.f58142a.getString(R.string.afi);
                C52711k.m112236a((Object) string, "getString(R.string.commo…ration_phone_input_error)");
                cVar2.mo45582a(0, string);
                return;
            }
            C21416b bVar = new C21416b(0, C9431p.m18668d(((PhoneInputView) this.f58142a.mo44862a(R.id.eof)).getCountryCodeString()), C9431p.m18668d(((PhoneInputView) this.f58142a.mo44862a(R.id.eof)).getPhoneNumberString()), null, null);
            C21677s.m54402a((C21829b) this.f58142a, bVar, C21848h.RECOVER_ACCOUNT, C21850i.PHONE_EMAIL_USERNAME_RECOVER, "phone").mo6496c((C1710e<? super T>) new C1710e<C21418b>(this) {

                /* renamed from: a */
                final /* synthetic */ C21437c f58143a;

                {
                    this.f58143a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void accept(java.lang.Object r10) {
                    /*
                        r9 = this;
                        com.ss.android.ugc.aweme.account.login.recover.a.b.b r10 = (com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21418b) r10
                        r0 = 0
                        r1 = 2132548301(0x7f1c1acd, float:2.0749872E38)
                        r2 = 1
                        r3 = 0
                        if (r10 == 0) goto L_0x0058
                        java.lang.String r4 = r10.f58106h
                        if (r4 == 0) goto L_0x0044
                        java.lang.String r4 = r10.f58106h
                        boolean r4 = com.bytedance.p879t.p882c.C13248c.m26638a(r4)
                        if (r4 != 0) goto L_0x0044
                        com.ss.android.ugc.aweme.account.login.recover.c$c r4 = r9.f58143a
                        com.ss.android.ugc.aweme.account.login.recover.c r4 = r4.f58142a
                        java.lang.String r5 = r10.f58106h
                        r4.f58135j = r5
                        com.ss.android.ugc.aweme.account.login.recover.c$c r4 = r9.f58143a
                        com.ss.android.ugc.aweme.account.login.recover.c r4 = r4.f58142a
                        java.lang.String r5 = r10.f58106h
                        if (r5 != 0) goto L_0x0029
                        p2628d.p2639f.p2641b.C52711k.m112234a()
                    L_0x0029:
                        r6 = r4
                        com.ss.android.ugc.aweme.account.login.v2.base.b r6 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b) r6
                        com.ss.android.ugc.aweme.account.login.v2.base.h r7 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
                        com.ss.android.ugc.aweme.account.login.v2.base.i r8 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_EMAIL_USERNAME_RECOVER
                        c.a.n r5 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s.m54406a(r6, r5, r7, r8)
                        com.ss.android.ugc.aweme.account.login.recover.c$f r6 = new com.ss.android.ugc.aweme.account.login.recover.c$f
                        r6.<init>(r4)
                        c.a.d.e r6 = (p064c.p065a.p071d.C1710e) r6
                        c.a.n r4 = r5.mo6496c(r6)
                        r4.mo6491b()
                        r4 = 1
                        goto L_0x0059
                    L_0x0044:
                        com.ss.android.ugc.aweme.account.login.recover.c$c r4 = r9.f58143a
                        com.ss.android.ugc.aweme.account.login.recover.c r4 = r4.f58142a
                        com.ss.android.ugc.aweme.account.login.recover.c$c r5 = r9.f58143a
                        com.ss.android.ugc.aweme.account.login.recover.c r5 = r5.f58142a
                        java.lang.String r5 = r5.getString(r1)
                        java.lang.String r6 = "getString(R.string.recov…count_valid_phone_number)"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                        r4.mo45582a(0, r5)
                    L_0x0058:
                        r4 = 0
                    L_0x0059:
                        if (r10 != 0) goto L_0x006f
                        com.ss.android.ugc.aweme.account.login.recover.c$c r10 = r9.f58143a
                        com.ss.android.ugc.aweme.account.login.recover.c r10 = r10.f58142a
                        com.ss.android.ugc.aweme.account.login.recover.c$c r5 = r9.f58143a
                        com.ss.android.ugc.aweme.account.login.recover.c r5 = r5.f58142a
                        java.lang.String r1 = r5.getString(r1)
                        java.lang.String r5 = "getString(R.string.recov…count_valid_phone_number)"
                        p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
                        r10.mo45582a(0, r1)
                    L_0x006f:
                        java.lang.String r10 = "find_account_check_result"
                        com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
                        r0.<init>()
                        java.lang.String r1 = "platform"
                        java.lang.String r2 = "phone"
                        com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
                        java.lang.String r1 = "status"
                        com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44774a(r1, r4)
                        java.lang.String r1 = "aid"
                        r2 = 1180(0x49c, float:1.654E-42)
                        com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44774a(r1, r2)
                        java.lang.String r1 = "error_code"
                        com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44774a(r1, r3)
                        java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
                        com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r10, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.recover.C21434c.C21437c.C214381.accept(java.lang.Object):void");
                }
            }).mo6491b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$d */
    public static final class C21439d extends C22307v {

        /* renamed from: a */
        final /* synthetic */ C21434c f58144a;

        C21439d(C21434c cVar) {
            this.f58144a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f58144a.mo44862a(R.id.eoe);
            if (inputResultIndicator != null) {
                inputResultIndicator.mo45986a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f58144a.mo44862a(R.id.eod);
            C52711k.m112236a((Object) loadingButton, "phoneLoginContinueBtn");
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$e */
    static final class C21440e extends C52712l implements C52670a<C21460a> {

        /* renamed from: a */
        final /* synthetic */ C21434c f58145a;

        C21440e(C21434c cVar) {
            this.f58145a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C21460a(this.f58145a, this.f58145a.mo45967m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.c$f */
    static final class C21441f<T> implements C1710e<C21419c> {

        /* renamed from: a */
        final /* synthetic */ C21434c f58146a;

        C21441f(C21434c cVar) {
            this.f58146a = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C21419c cVar = (C21419c) obj;
            if (cVar != null) {
                this.f58146a.f58131b = cVar.f58107h;
                String str = cVar.f58108i;
                if (this.f58146a.f58135j != null) {
                    C21434c cVar2 = this.f58146a;
                    String str2 = this.f58146a.f58135j;
                    if (str2 == null) {
                        C52711k.m112234a();
                    }
                    boolean z = this.f58146a.f58131b;
                    C21677s.m54411b(cVar2, str2, str, C21848h.RECOVER_ACCOUNT, C21850i.PHONE_EMAIL_USERNAME_RECOVER).mo6496c((C1710e<? super T>) new C21436b<Object>(cVar2)).mo6491b();
                }
                if (this.f58146a.f58135j == null) {
                    C21434c cVar3 = this.f58146a;
                    String string = this.f58146a.getString(R.string.h97);
                    C52711k.m112236a((Object) string, "getString(R.string.recov…count_valid_phone_number)");
                    cVar3.mo45582a(0, string);
                }
            }
            if (cVar == null) {
                C21434c cVar4 = this.f58146a;
                String string2 = this.f58146a.getString(R.string.h97);
                C52711k.m112236a((Object) string2, "getString(R.string.recov…count_valid_phone_number)");
                cVar4.mo45582a(0, string2);
            }
        }
    }

    /* renamed from: j */
    private final C21460a m54063j() {
        return (C21460a) this.f58139s.getValue();
    }

    /* renamed from: a */
    public final View mo44862a(int i) {
        if (this.f58140t == null) {
            this.f58140t = new HashMap();
        }
        View view = (View) this.f58140t.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58140t.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean ai_() {
        return this.f58136p;
    }

    /* renamed from: g */
    public final void mo44866g() {
        if (this.f58140t != null) {
            this.f58140t.clear();
        }
    }

    /* renamed from: i */
    public final int mo45585i() {
        return R.layout.az2;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44866g();
    }

    public final void ad_() {
        ((LoadingButton) mo44862a(R.id.eod)).mo46295a();
    }

    /* renamed from: e */
    public final void mo45584e() {
        ((LoadingButton) mo44862a(R.id.eod)).mo46296b();
    }

    public final void onStop() {
        super.onStop();
        m54063j().mo45643b();
    }

    /* renamed from: U_ */
    public final C21861a mo44860U_() {
        C21861a aVar = new C21861a(null, null, false, null, null, true, null, false, false, 326, null);
        return aVar;
    }

    /* renamed from: u */
    private final void m54064u() {
        if (((PhoneInputView) mo44862a(R.id.eof)).getPhoneNumber() <= 0 && !this.f58138r) {
            m54063j().mo45642a(((PhoneInputView) mo44862a(R.id.eof)).getEditText());
        }
        this.f58138r = true;
        C21994b.m54752a(((PhoneInputView) mo44862a(R.id.eof)).getInputView().getEditText());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m54063j().mo45640a();
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                m54064u();
                return;
            }
            this.f58137q = true;
        }
    }

    /* renamed from: a */
    public final void mo45582a(int i, String str) {
        C52711k.m112240b(str, "message");
        ((InputResultIndicator) mo44862a(R.id.eoe)).mo45987a(str);
        ((LoadingButton) mo44862a(R.id.eod)).mo46296b();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        mo45997a((LoadingButton) mo44862a(R.id.eod), new C21437c(this));
        ((PhoneInputView) mo44862a(R.id.eof)).getInputView().setTextWatcher(new C21439d(this));
        boolean z2 = true;
        if (((PhoneInputView) mo44862a(R.id.eof)).getCountryCodeString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (((PhoneInputView) mo44862a(R.id.eof)).getCountryName().length() != 0) {
                z2 = false;
            }
            if (z2) {
                ((PhoneInputView) mo44862a(R.id.eof)).mo46309a();
            }
        }
        if (this.f58137q) {
            m54064u();
            this.f58137q = false;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m54063j().mo45641a(i, i2, intent);
    }
}
