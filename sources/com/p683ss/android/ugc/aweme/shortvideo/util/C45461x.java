package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.profile.p2090ui.DmtStatusViewDialog;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.x */
public final class C45461x {

    /* renamed from: a */
    public static final C45461x f114877a = new C45461x();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.x$a */
    static final class C45462a implements C23505g {

        /* renamed from: a */
        final /* synthetic */ Context f114878a;

        /* renamed from: b */
        final /* synthetic */ String f114879b;

        /* renamed from: c */
        final /* synthetic */ String f114880c;

        /* renamed from: d */
        final /* synthetic */ C52671b f114881d;

        C45462a(Context context, String str, String str2, C52671b bVar) {
            this.f114878a = context;
            this.f114879b = str;
            this.f114880c = str2;
            this.f114881d = bVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            C45461x.m99066b(this.f114878a, this.f114879b, this.f114880c, this.f114881d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.x$b */
    static final class C45463b<T> implements C1710e<DonationTokenResponse> {

        /* renamed from: a */
        final /* synthetic */ C52727e f114882a;

        /* renamed from: b */
        final /* synthetic */ C52671b f114883b;

        /* renamed from: c */
        final /* synthetic */ String f114884c;

        /* renamed from: d */
        final /* synthetic */ Context f114885d;

        C45463b(C52727e eVar, C52671b bVar, String str, Context context) {
            this.f114882a = eVar;
            this.f114883b = bVar;
            this.f114884c = str;
            this.f114885d = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            CharSequence charSequence;
            String str;
            String str2;
            DonationTokenResponse donationTokenResponse = (DonationTokenResponse) obj;
            C47700ay.m103236b((DmtStatusViewDialog) this.f114882a.element);
            if (donationTokenResponse.status_code == 0) {
                DonationTokenBean data = donationTokenResponse.getData();
                if (data != null) {
                    charSequence = data.getToken();
                } else {
                    charSequence = null;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    StringBuilder sb = new StringBuilder("callback invoke: ");
                    DonationTokenBean data2 = donationTokenResponse.getData();
                    if (data2 != null) {
                        str = data2.getToken();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    C52671b bVar = this.f114883b;
                    String str3 = this.f114884c;
                    DonationTokenBean data3 = donationTokenResponse.getData();
                    if (data3 != null) {
                        str2 = data3.getToken();
                    } else {
                        str2 = null;
                    }
                    if (str3 != null && C19547d.m47842a(str3) && !TextUtils.isEmpty(str2)) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        if (!C52830p.m112456b((CharSequence) str3, (CharSequence) "?", false, 2, (Object) null)) {
                            sb2.append("?");
                        } else {
                            sb2.append("&");
                        }
                        sb2.append(str2);
                        str3 = sb2.toString();
                    }
                    bVar.invoke(str3);
                    return;
                }
            }
            Context context = this.f114885d;
            if (context != null) {
                C10691a.m21551c(context, context.getString(R.string.h5l)).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.x$c */
    static final class C45464c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C52727e f114886a;

        /* renamed from: b */
        final /* synthetic */ Context f114887b;

        C45464c(C52727e eVar, Context context) {
            this.f114886a = eVar;
            this.f114887b = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C47700ay.m103236b((DmtStatusViewDialog) this.f114886a.element);
            C32458a.m75148a(th);
            Context context = this.f114887b;
            if (context != null) {
                C10691a.m21551c(context, context.getString(R.string.h5l)).mo19066a();
            }
        }
    }

    private C45461x() {
    }

    /* renamed from: a */
    public final void mo91748a(Context context, String str, String str2, C52671b<? super String, C52860x> bVar) {
        C52711k.m112240b(bVar, "successCallback");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            m99066b(context, str, str2, bVar);
        } else if (context instanceof Activity) {
            C27965f.m66722a((Activity) context, "", "", (C23505g) new C45462a(context, str, str2, bVar));
        }
    }

    /* renamed from: b */
    public static void m99066b(Context context, String str, String str2, C52671b<? super String, C52860x> bVar) {
        long j;
        C52727e eVar = new C52727e();
        eVar.element = null;
        if (context instanceof Activity) {
            eVar.element = new DmtStatusViewDialog((Activity) context);
            C47700ay.m103235a((DmtStatusViewDialog) eVar.element);
        }
        DonationTokenCreateApi a = DonationTokenCreateApi.f114716a.mo91697a();
        if (str != null) {
            j = Long.parseLong(str);
        } else {
            j = 0;
        }
        a.tokenCreate(1, j).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C45463b<Object>(eVar, bVar, str2, context), (C1710e<? super Throwable>) new C45464c<Object>(eVar, context));
    }
}
