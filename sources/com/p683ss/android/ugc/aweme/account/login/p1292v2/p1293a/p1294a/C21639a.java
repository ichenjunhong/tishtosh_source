package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b.C18493a;
import com.p683ss.android.ugc.aweme.C23786bf;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C27983t;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.ActionResultModel;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.C21851a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseBindService;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.a */
public final class C21639a {

    /* renamed from: a */
    public static final C21639a f58654a = new C21639a();

    /* renamed from: b */
    private static final boolean f58655b = false;

    private C21639a() {
    }

    /* renamed from: a */
    private static String m54349a(C21850i iVar) {
        switch (C21640b.f58658c[iVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "mobile";
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return "email";
            default:
                return "";
        }
    }

    /* renamed from: b */
    private static String m54353b(C21850i iVar) {
        switch (C21640b.f58659d[iVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "phone_sms";
            case 5:
                return "phone_password";
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "email_or_username";
            case 11:
                return "reset_password_for_phone";
            default:
                return "";
        }
    }

    /* renamed from: a */
    private static void m54350a(Bundle bundle) {
        BaseLoginMethod baseLoginMethod;
        LoginMethodName loginMethodName;
        if (bundle.getSerializable("recover_account_data") != null) {
            BaseLoginMethod baseLoginMethod2 = new BaseLoginMethod(null, null, null, null, 15, null);
            C21518u.m54176b(baseLoginMethod2);
            return;
        }
        switch (C21640b.f58657b[C21851a.m54529a(bundle.getInt("current_page")).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                C21135a b = C21839d.m54509b(bundle);
                if (b == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                    break;
                } else {
                    String d = C23826bi.m58463d();
                    C52711k.m112236a((Object) d, "ModuleStore.getCurUserId()");
                    PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(d, LoginMethodName.PHONE_SMS, b, null, 8, null);
                    baseLoginMethod = phoneLoginMethod;
                    break;
                }
            case 5:
            case 6:
                C21135a b2 = C21839d.m54509b(bundle);
                if (b2 == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                    break;
                } else {
                    String d2 = C23826bi.m58463d();
                    C52711k.m112236a((Object) d2, "ModuleStore.getCurUserId()");
                    PhoneLoginMethod phoneLoginMethod2 = new PhoneLoginMethod(d2, LoginMethodName.PHONE_NUMBER_PASS, b2, null, 8, null);
                    baseLoginMethod = phoneLoginMethod2;
                    break;
                }
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                String a = C21839d.m54504a(bundle);
                if (C21145a.m53660a(a)) {
                    loginMethodName = LoginMethodName.EMAIL_PASS;
                } else {
                    loginMethodName = LoginMethodName.USER_NAME_PASS;
                }
                LoginMethodName loginMethodName2 = loginMethodName;
                String d3 = C23826bi.m58463d();
                C52711k.m112236a((Object) d3, "ModuleStore.getCurUserId()");
                AccountPassLoginMethod accountPassLoginMethod = new AccountPassLoginMethod(d3, loginMethodName2, a, null, 8, null);
                baseLoginMethod = accountPassLoginMethod;
                break;
            default:
                baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
                break;
        }
        C21518u.m54176b(baseLoginMethod);
    }

    /* renamed from: a */
    public static void m54352a(C21829b bVar, C13104c cVar) {
        JSONObject jSONObject;
        C52711k.m112240b(bVar, "fragment");
        FragmentActivity activity = bVar.getActivity();
        if (activity != null) {
            C0195p<Bundle> pVar = ((ActionResultModel) C0214z.m440a(activity).mo359a(ActionResultModel.class)).f59092c;
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            User i = C23826bi.m58468i();
            if (!(i == null || cVar == null)) {
                try {
                    JSONObject jSONObject2 = cVar.f34279l;
                    if (jSONObject2 != null) {
                        jSONObject = jSONObject2.optJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("mobile");
                        i.setPhoneBinded(true);
                        i.setBindPhone(optString);
                        IAccountUserService a = C23826bi.m58449a();
                        new C18493a();
                        a.updateUserInfo(C18493a.m44735b(jSONObject2));
                        C52711k.m112236a((Object) optString, "phone");
                        String jSONObject3 = jSONObject.toString();
                        C52711k.m112236a((Object) jSONObject3, "data.toString()");
                        C23826bi.m58451a(7, 1, (Object) new C27983t(optString, jSONObject3));
                    }
                } catch (Exception unused) {
                }
            }
            BaseBindService l = C23826bi.m58471l();
            C52711k.m112236a((Object) l, "ModuleStore.getBindService()");
            C23786bf verificationService = l.getVerificationService();
            C52711k.m112236a((Object) verificationService, "ModuleStore.getBindService().verificationService");
            if (verificationService.isDangerZone()) {
                BaseBindService l2 = C23826bi.m58471l();
                C52711k.m112236a((Object) l2, "ModuleStore.getBindService()");
                C23786bf verificationService2 = l2.getVerificationService();
                FragmentActivity activity2 = bVar.getActivity();
                if (activity2 == null) {
                    C52711k.m112234a();
                }
                verificationService2.showRebindView(activity2, "phone_bundling");
            }
            pVar.postValue(arguments);
        }
    }

    /* renamed from: a */
    public static String m54348a(Context context, int i, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "errorMsg");
        if (C21459s.f58194d.contains(Integer.valueOf(i)) || C21459s.f58196f.contains(Integer.valueOf(i)) || i == 0) {
            return "";
        }
        if (i < 0) {
            String string = context.getString(R.string.ccn);
            C52711k.m112236a((Object) string, "context.getString(R.string.mus_time_out)");
            return string;
        }
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.ccn);
        }
        C52711k.m112236a((Object) str, "if (TextUtils.isEmpty(er…s_time_out) else errorMsg");
        return str;
    }

    /* renamed from: a */
    public final void mo45904a(C21829b bVar, C21848h hVar, C21850i iVar, JSONObject jSONObject, C13207b bVar2) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(bVar2, "userInfo");
        C23826bi.m58455a(bVar2);
        Bundle arguments = bVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C52711k.m112236a((Object) arguments, "fragment.arguments ?: Bundle()");
        m54350a(arguments);
        FragmentActivity activity = bVar.getActivity();
        if (activity != null) {
            C0195p<Bundle> pVar = ((ActionResultModel) C0214z.m440a(activity).mo359a(ActionResultModel.class)).f59092c;
            if (bVar2.f34477e) {
                Bundle arguments2 = bVar.getArguments();
                if (arguments2 == null) {
                    C52711k.m112234a();
                }
                arguments2.putBoolean("new_user_need_set_username", true);
                if (iVar == C21850i.EMAIL_SMS_SIGN_UP || iVar == C21850i.CREATE_PASSWORD_FOR_EMAIL) {
                    Bundle arguments3 = bVar.getArguments();
                    if (arguments3 == null) {
                        C52711k.m112234a();
                    }
                    arguments3.putBoolean("new_user_need_get_recommend_username", true);
                    Bundle arguments4 = bVar.getArguments();
                    if (arguments4 == null) {
                        C52711k.m112234a();
                    }
                    arguments4.putString("set_username_platform", "email");
                } else {
                    Bundle arguments5 = bVar.getArguments();
                    if (arguments5 == null) {
                        C52711k.m112234a();
                    }
                    arguments5.putBoolean("new_user_need_set_pass_word", true);
                    Bundle arguments6 = bVar.getArguments();
                    if (arguments6 == null) {
                        C52711k.m112234a();
                    }
                    arguments6.putString("set_username_platform", "sms_verification");
                }
            } else if (bVar.getActivity() instanceof SignUpOrLoginActivity) {
                FragmentActivity activity2 = bVar.getActivity();
                if (activity2 != null) {
                    ((SignUpOrLoginActivity) activity2).f59173a = null;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                }
            }
            String a = m54349a(iVar);
            if (!TextUtils.isEmpty(a)) {
                arguments.putString("platform", a);
            }
            String b = m54353b(iVar);
            if (!TextUtils.isEmpty(b)) {
                arguments.putString("login_path", b);
            }
            pVar.postValue(arguments);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x023d, code lost:
        if (r8 == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0252, code lost:
        if (r8 == null) goto L_0x0254;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m54351a(com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b r6, int r7, java.lang.String r8, com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h r9, com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i r10, org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "fragment"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "errorMsg"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "scene"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "step"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            android.os.Bundle r0 = r6.getArguments()
            if (r0 != 0) goto L_0x001d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x001d:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.services.BindService.FROM_PROACCOUNT
            boolean r0 = r0.getBoolean(r1)
            android.support.v4.f.b<java.lang.Integer> r1 = com.p683ss.android.ugc.aweme.account.login.C21459s.f58194d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x02fe
            android.support.v4.f.b<java.lang.Integer> r1 = com.p683ss.android.ugc.aweme.account.login.C21459s.f58196f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x003d
            goto L_0x02fe
        L_0x003d:
            r1 = 2132548933(0x7f1c1d45, float:2.0751154E38)
            r2 = 2132548293(0x7f1c1ac5, float:2.0749856E38)
            r3 = 2132543161(0x7f1c06b9, float:2.0739447E38)
            switch(r7) {
                case 1001: goto L_0x02d4;
                case 1002: goto L_0x02a1;
                case 1003: goto L_0x02a1;
                case 1009: goto L_0x025d;
                case 1011: goto L_0x01f1;
                case 1023: goto L_0x01bd;
                case 1024: goto L_0x01a7;
                case 1027: goto L_0x0191;
                case 1028: goto L_0x01a7;
                case 1033: goto L_0x0187;
                case 1034: goto L_0x0187;
                case 1039: goto L_0x0177;
                case 1051: goto L_0x0161;
                case 1054: goto L_0x014b;
                case 1075: goto L_0x012d;
                case 1092: goto L_0x00ef;
                case 1202: goto L_0x00d9;
                case 1203: goto L_0x00c3;
                case 1320: goto L_0x00ba;
                case 2003: goto L_0x008d;
                case 2004: goto L_0x008d;
                case 2006: goto L_0x012d;
                case 2013: goto L_0x0084;
                case 2015: goto L_0x007b;
                case 2027: goto L_0x005c;
                case 2028: goto L_0x005c;
                case 2037: goto L_0x0053;
                default: goto L_0x0049;
            }
        L_0x0049:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r7 = r9
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0053:
            com.ss.android.ugc.aweme.account.login.v2.a.a.e r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.e
            r7.<init>(r6)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x005c:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r10 = r8
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x006e
            r8 = 2132546358(0x7f1c1336, float:2.0745932E38)
            java.lang.String r8 = r6.getString(r8)
        L_0x006e:
            java.lang.String r10 = "if (TextUtils.isEmpty(er…_page_lock) else errorMsg"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            r9.<init>(r6, r7, r8)
            r7 = r9
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x007b:
            com.ss.android.ugc.aweme.account.login.v2.a.a.f r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.f
            r7.<init>(r6, r9, r10, r11)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0084:
            com.ss.android.ugc.aweme.account.login.v2.a.a.d r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.d
            r7.<init>(r6, r11)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x008d:
            com.ss.android.ugc.aweme.account.login.v2.base.h r9 = r6.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.BIND_PHONE
            if (r9 == r10) goto L_0x00a7
            com.ss.android.ugc.aweme.account.login.v2.base.h r9 = r6.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.MODIFY_PHONE
            if (r9 != r10) goto L_0x009e
            goto L_0x00a7
        L_0x009e:
            com.ss.android.ugc.aweme.account.login.v2.a.a.j r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.j
            r7.<init>(r6, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x00a7:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            java.lang.String r9 = r6.getString(r1)
            java.lang.String r10 = "fragment.getString(R.str…ssword_phone_input_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x00ba:
            com.ss.android.ugc.aweme.account.login.v2.a.a.c r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.c
            r7.<init>(r6)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x00c3:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132546651(0x7f1c145b, float:2.0746526E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.string.mus_error_code)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x00d9:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543276(0x7f1c072c, float:2.073968E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…stration_phone_sms_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x00ef:
            com.ss.android.ugc.aweme.account.login.v2.base.h r10 = r6.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r11 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.BIND_PHONE
            if (r10 == r11) goto L_0x011a
            com.ss.android.ugc.aweme.account.login.v2.base.h r10 = r6.mo45970p()
            com.ss.android.ugc.aweme.account.login.v2.base.h r11 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.MODIFY_PHONE
            if (r10 != r11) goto L_0x0100
            goto L_0x011a
        L_0x0100:
            com.ss.android.ugc.aweme.account.login.v2.base.h r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            if (r9 != r10) goto L_0x0113
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            java.lang.String r9 = r6.getString(r2)
            java.lang.String r10 = "fragment.getString(R.str…ver_account_error_access)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            goto L_0x0128
        L_0x0113:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r8 = r9
            goto L_0x0128
        L_0x011a:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            java.lang.String r9 = r6.getString(r1)
            java.lang.String r10 = "fragment.getString(R.str…ssword_phone_input_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
        L_0x0128:
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x012d:
            com.ss.android.ugc.aweme.account.login.v2.base.h r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h.RECOVER_ACCOUNT
            if (r9 != r10) goto L_0x0140
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            java.lang.String r9 = r6.getString(r2)
            java.lang.String r10 = "fragment.getString(R.str…ver_account_error_access)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            goto L_0x0146
        L_0x0140:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r8 = r9
        L_0x0146:
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x014b:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543218(0x7f1c06f2, float:2.0739563E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…_reset_phone_input_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0161:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543266(0x7f1c0722, float:2.073966E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…istration_password_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0177:
            com.ss.android.ugc.aweme.account.login.v2.a.a.k r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.k
            r0 = r8
            r1 = r6
            r2 = r7
            r3 = r11
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0187:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r7 = r9
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0191:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543294(0x7f1c073e, float:2.0739717E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…on_username_error_format)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x01a7:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543293(0x7f1c073d, float:2.0739715E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…istration_username_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x01bd:
            if (r0 == 0) goto L_0x01db
            java.lang.String r8 = "input_wrong_email"
            com.ss.android.ugc.aweme.account.a.b.a r9 = new com.ss.android.ugc.aweme.account.a.b.a
            r9.<init>()
            java.lang.String r10 = "page"
            java.lang.String r11 = "Input Email Captcha"
            com.ss.android.ugc.aweme.account.a.b.a r9 = r9.mo44776a(r10, r11)
            java.lang.String r10 = "error_code"
            java.lang.String r11 = "2"
            com.ss.android.ugc.aweme.account.a.b.a r9 = r9.mo44776a(r10, r11)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r9)
        L_0x01db:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132544385(0x7f1c0b81, float:2.074193E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.string.email_is_taken)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x01f1:
            com.ss.android.ugc.aweme.account.login.v2.base.i r9 = r6.mo45965k()
            int[] r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21640b.f58656a
            int r9 = r9.ordinal()
            r9 = r10[r9]
            switch(r9) {
                case 1: goto L_0x0248;
                case 2: goto L_0x0233;
                case 3: goto L_0x0220;
                case 4: goto L_0x0220;
                case 5: goto L_0x0220;
                case 6: goto L_0x020a;
                default: goto L_0x0200;
            }
        L_0x0200:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r7 = r9
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x020a:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543210(0x7f1c06ea, float:2.0739547E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…_reset_email_input_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0220:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            java.lang.String r9 = r6.getString(r3)
            java.lang.String r10 = "fragment.getString(R.str…common_login_email_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0233:
            com.ss.android.ugc.aweme.account.login.v2.a.a.g r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.g
            if (r11 == 0) goto L_0x023f
            java.lang.String r8 = "sms_code_key"
            java.lang.String r8 = r11.optString(r8)
            if (r8 != 0) goto L_0x0241
        L_0x023f:
            java.lang.String r8 = ""
        L_0x0241:
            r7.<init>(r6, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x0248:
            com.ss.android.ugc.aweme.account.login.v2.a.a.h r7 = new com.ss.android.ugc.aweme.account.login.v2.a.a.h
            if (r11 == 0) goto L_0x0254
            java.lang.String r8 = "sms_code_key"
            java.lang.String r8 = r11.optString(r8)
            if (r8 != 0) goto L_0x0256
        L_0x0254:
            java.lang.String r8 = ""
        L_0x0256:
            r7.<init>(r6, r8)
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x025d:
            com.ss.android.ugc.aweme.account.login.v2.base.i r9 = r6.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.PHONE_PASSWORD_LOGIN
            if (r9 != r10) goto L_0x0277
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543204(0x7f1c06e4, float:2.0739535E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…mon_login_password_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            goto L_0x029d
        L_0x0277:
            com.ss.android.ugc.aweme.account.login.v2.base.i r9 = r6.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.EMAIL_PASSWORD_LOGIN
            if (r9 == r10) goto L_0x028f
            com.ss.android.ugc.aweme.account.login.v2.base.i r9 = r6.mo45965k()
            com.ss.android.ugc.aweme.account.login.v2.base.i r10 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.INPUT_EMAIL_LOGIN
            if (r9 != r10) goto L_0x0288
            goto L_0x028f
        L_0x0288:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r8 = r9
            goto L_0x029d
        L_0x028f:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            java.lang.String r9 = r6.getString(r3)
            java.lang.String r10 = "fragment.getString(R.str…common_login_email_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
        L_0x029d:
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x02a1:
            if (r0 == 0) goto L_0x02bf
            java.lang.String r8 = "input_wrong_phone"
            com.ss.android.ugc.aweme.account.a.b.a r9 = new com.ss.android.ugc.aweme.account.a.b.a
            r9.<init>()
            java.lang.String r10 = "page"
            java.lang.String r11 = "Input Phone Captcha"
            com.ss.android.ugc.aweme.account.a.b.a r9 = r9.mo44776a(r10, r11)
            java.lang.String r10 = "error_code"
            java.lang.String r11 = "1"
            com.ss.android.ugc.aweme.account.a.b.a r9 = r9.mo44776a(r10, r11)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r8, r9)
        L_0x02bf:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r8 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9 = 2132543271(0x7f1c0727, float:2.073967E38)
            java.lang.String r9 = r6.getString(r9)
            java.lang.String r10 = "fragment.getString(R.str…ration_phone_input_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            r8.<init>(r6, r7, r9)
            r7 = r8
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
            goto L_0x02fa
        L_0x02d4:
            if (r0 == 0) goto L_0x02f2
            java.lang.String r9 = "input_wrong_phone"
            com.ss.android.ugc.aweme.account.a.b.a r10 = new com.ss.android.ugc.aweme.account.a.b.a
            r10.<init>()
            java.lang.String r11 = "page"
            java.lang.String r0 = "Input Phone Captcha"
            com.ss.android.ugc.aweme.account.a.b.a r10 = r10.mo44776a(r11, r0)
            java.lang.String r11 = "error_code"
            java.lang.String r0 = "2"
            com.ss.android.ugc.aweme.account.a.b.a r10 = r10.mo44776a(r11, r0)
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r10)
        L_0x02f2:
            com.ss.android.ugc.aweme.account.login.v2.a.a.i r9 = new com.ss.android.ugc.aweme.account.login.v2.a.a.i
            r9.<init>(r6, r7, r8)
            r7 = r9
            com.ss.android.ugc.aweme.account.login.v2.base.c r7 = (com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c) r7
        L_0x02fa:
            r7.mo45905a()
            return
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21639a.m54351a(com.ss.android.ugc.aweme.account.login.v2.base.b, int, java.lang.String, com.ss.android.ugc.aweme.account.login.v2.base.h, com.ss.android.ugc.aweme.account.login.v2.base.i, org.json.JSONObject):void");
    }
}
