package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.C2240a;
import com.bytedance.common.utility.C9413g;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.sdk.account.p878m.C13215g;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.CommonUserInfo.C21382a;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.TPUserInfo.C21385a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d.C22094a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.p */
public final class C21392p {

    /* renamed from: a */
    static boolean f58048a = false;

    /* renamed from: b */
    public static final C21392p f58049b = new C21392p();

    /* renamed from: com.ss.android.ugc.aweme.account.login.p$a */
    static final class C21393a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21140f f58050a;

        C21393a(C21140f fVar) {
            this.f58050a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C52711k.m112240b(dialogInterface, "<anonymous parameter 0>");
            C22093d.f59607b.mo46197a(false, this.f58050a.f57435b, "", this.f58050a.f57439f);
            Runnable runnable = this.f58050a.f57440g;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.p$b */
    static final class C21394b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JSONObject f58051a;

        /* renamed from: b */
        final /* synthetic */ C21140f f58052b;

        C21394b(JSONObject jSONObject, C21140f fVar) {
            this.f58051a = jSONObject;
            this.f58052b = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C52711k.m112240b(dialogInterface, "<anonymous parameter 0>");
            C0013i b = AccountApiInModule.m53228b(C9413g.m18629a(this.f58051a, "token", ""));
            if (b == null) {
                C22093d.f59607b.mo46197a(false, this.f58052b.f57435b, "cancel_login: Error occurred when requesting AccountApiInModule.loginDuringAccountRemoval", this.f58052b.f57439f);
                C13215g.m26598a(this.f58052b.f57434a, R.string.c2j);
            } else {
                b.mo19a((C0011g<TResult, TContinuationResult>) new C0011g<String, Boolean>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C21394b f58053a;

                    {
                        this.f58053a = r1;
                    }

                    public final /* synthetic */ Object then(C0013i iVar) {
                        LoginMethodName loginMethodName;
                        Object obj;
                        boolean z = false;
                        if (C47957v.m103770a(iVar)) {
                            C52711k.m112236a((Object) iVar, "it");
                            JSONObject jSONObject = new JSONObject((String) iVar.mo34e());
                            BaseLoginMethod baseLoginMethod = null;
                            String a = C9413g.m18629a(jSONObject, "message", null);
                            if (jSONObject.has("message") && !TextUtils.equals(a, "error")) {
                                User queryUser = C23826bi.m58449a().queryUser(null, true);
                                C23826bi.m58457a(queryUser);
                                C22282t.m55144b(true);
                                if (this.f58053a.f58052b.f57437d != null) {
                                    C21392p pVar = C21392p.f58049b;
                                    if (C21392p.f58048a) {
                                        StringBuilder sb = new StringBuilder("Login method: ");
                                        BaseLoginMethod baseLoginMethod2 = this.f58053a.f58052b.f57437d;
                                        if (baseLoginMethod2 != null) {
                                            obj = baseLoginMethod2.getLoginMethodName();
                                        } else {
                                            obj = null;
                                        }
                                        sb.append(obj);
                                    }
                                    BaseLoginMethod baseLoginMethod3 = this.f58053a.f58052b.f57437d;
                                    if (baseLoginMethod3 != null) {
                                        loginMethodName = baseLoginMethod3.getLoginMethodName();
                                    } else {
                                        loginMethodName = null;
                                    }
                                    if (loginMethodName != null) {
                                        switch (C21397q.f58055a[loginMethodName.ordinal()]) {
                                            case 1:
                                                BaseLoginMethod baseLoginMethod4 = this.f58053a.f58052b.f57437d;
                                                if (baseLoginMethod4 != null) {
                                                    PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod4;
                                                    C52711k.m112236a((Object) queryUser, "user");
                                                    String uid = queryUser.getUid();
                                                    C52711k.m112236a((Object) uid, "user.uid");
                                                    baseLoginMethod = new PhoneLoginMethod(uid, LoginMethodName.PHONE_NUMBER_PASS, phoneLoginMethod.getPhoneNumber(), C21382a.m54005a(queryUser));
                                                    break;
                                                } else {
                                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod");
                                                }
                                            case 2:
                                                BaseLoginMethod baseLoginMethod5 = this.f58053a.f58052b.f57437d;
                                                if (baseLoginMethod5 != null) {
                                                    PhoneLoginMethod phoneLoginMethod2 = (PhoneLoginMethod) baseLoginMethod5;
                                                    C52711k.m112236a((Object) queryUser, "user");
                                                    String uid2 = queryUser.getUid();
                                                    C52711k.m112236a((Object) uid2, "user.uid");
                                                    baseLoginMethod = new PhoneLoginMethod(uid2, LoginMethodName.PHONE_SMS, phoneLoginMethod2.getPhoneNumber(), C21382a.m54005a(queryUser));
                                                    break;
                                                } else {
                                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod");
                                                }
                                            case 3:
                                                BaseLoginMethod baseLoginMethod6 = this.f58053a.f58052b.f57437d;
                                                if (baseLoginMethod6 != null) {
                                                    TPLoginMethod tPLoginMethod = (TPLoginMethod) baseLoginMethod6;
                                                    C52711k.m112236a((Object) queryUser, "user");
                                                    String uid3 = queryUser.getUid();
                                                    C52711k.m112236a((Object) uid3, "user.uid");
                                                    TPLoginMethod tPLoginMethod2 = new TPLoginMethod(uid3, tPLoginMethod.getPlatform(), C21385a.m54006a(queryUser), false, C21382a.m54005a(queryUser));
                                                    baseLoginMethod = tPLoginMethod2;
                                                    break;
                                                } else {
                                                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.TPLoginMethod");
                                                }
                                        }
                                    }
                                    if (baseLoginMethod != null) {
                                        C21518u.m54176b(baseLoginMethod);
                                    }
                                }
                                C22093d.f59607b.mo46197a(true, 0, "", this.f58053a.f58052b.f57439f);
                                this.f58053a.f58052b.f57438e.mo45026a(this.f58053a.f58052b.f57439f);
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Void>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C21394b f58054a;

                    {
                        this.f58054a = r1;
                    }

                    public final /* synthetic */ Object then(C0013i iVar) {
                        Runnable runnable = this.f58054a.f58052b.f57440g;
                        if (runnable != null) {
                            runnable.run();
                        }
                        if (C47957v.m103770a(iVar)) {
                            C52711k.m112236a((Object) iVar, "it");
                            Object e = iVar.mo34e();
                            C52711k.m112236a(e, "it.result");
                            if (((Boolean) e).booleanValue()) {
                                return null;
                            }
                        }
                        C22094a aVar = C22093d.f59607b;
                        int i = this.f58054a.f58052b.f57435b;
                        StringBuilder sb = new StringBuilder("cancel_login: ");
                        C52711k.m112236a((Object) iVar, "it");
                        sb.append(iVar.mo35f());
                        aVar.mo46197a(false, i, sb.toString(), this.f58054a.f58052b.f57439f);
                        C13215g.m26598a(this.f58054a.f58052b.f57434a, R.string.c2j);
                        return null;
                    }
                }, C0013i.f25b);
            }
            C26890h.m65011a("deleted_account_login_cancel", C52550ab.m112045a());
        }
    }

    private C21392p() {
    }

    /* renamed from: a */
    public static final void m54014a(C21140f fVar) {
        JSONObject jSONObject;
        long j;
        String str;
        C52711k.m112240b(fVar, "info");
        if (fVar.f57435b == 1075) {
            if (fVar.f57434a == null || fVar.f57436c == null || fVar.f57438e == null) {
                Runnable runnable = fVar.f57440g;
                if (runnable != null) {
                    runnable.run();
                }
                C13215g.m26598a(C23826bi.m58460b(), R.string.c2j);
                return;
            }
            if (fVar.f57436c.has("data")) {
                jSONObject = fVar.f57436c.optJSONObject("data");
            } else if (!fVar.f57436c.has("cancel_time") || !fVar.f57436c.has("token")) {
                jSONObject = null;
            } else {
                jSONObject = fVar.f57436c;
            }
            if (jSONObject != null) {
                String str2 = "cancel_time";
                if (jSONObject == null || C9431p.m18664a(str2) || !jSONObject.has(str2)) {
                    j = 0;
                } else {
                    j = jSONObject.optLong(str2, 0);
                }
                Locale locale = Locale.US;
                C52711k.m112236a((Object) locale, "Locale.US");
                String string = fVar.f57434a.getString(R.string.c2d);
                C52711k.m112236a((Object) string, "info.context.getString(R…during_acc_removal_title)");
                Object[] objArr = new Object[1];
                if (j > 0) {
                    str = m54013a(fVar.f57434a, j);
                } else {
                    str = "";
                }
                objArr[0] = str;
                String a = C2240a.m6773a(locale, string, Arrays.copyOf(objArr, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                Locale locale2 = Locale.US;
                C52711k.m112236a((Object) locale2, "Locale.US");
                String string2 = fVar.f57434a.getString(R.string.c2c);
                C52711k.m112236a((Object) string2, "info.context.getString(R…_during_acc_removal_desc)");
                String a2 = C2240a.m6773a(locale2, string2, Arrays.copyOf(new Object[]{fVar.f57434a.getString(R.string.wr), fVar.f57434a.getString(R.string.f6w)}, 2));
                C52711k.m112236a((Object) a2, "java.lang.String.format(locale, format, *args)");
                new C10643a(fVar.f57434a).mo18892a(a).mo18902b(a2).mo18900b((int) R.string.f6w, (OnClickListener) new C21393a(fVar)).mo18886a((int) R.string.wr, (OnClickListener) new C21394b(jSONObject, fVar)).mo18897a().mo18883c();
                C26890h.m65011a("deleted_account_login_alert", C52550ab.m112045a());
            } else if (!f58048a) {
                Runnable runnable2 = fVar.f57440g;
                if (runnable2 != null) {
                    runnable2.run();
                }
                C13215g.m26598a(C23826bi.m58460b(), R.string.c2j);
            } else {
                StringBuilder sb = new StringBuilder("Invalid JSON format detected when processing ");
                sb.append("error code (1075): ");
                sb.append(fVar.f57436c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private static String m54013a(Context context, long j) {
        try {
            String formatDateTime = DateUtils.formatDateTime(context, j * 1000, 65540);
            C52711k.m112236a((Object) formatDateTime, "DateUtils.formatDateTime…teUtils.FORMAT_SHOW_YEAR)");
            return formatDateTime;
        } catch (Exception unused) {
            return "";
        }
    }
}
