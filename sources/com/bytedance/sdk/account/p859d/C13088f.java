package com.bytedance.sdk.account.p859d;

import android.content.Context;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.C12997b.C12999b;
import com.bytedance.sdk.account.p844a.C13020e;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12994f;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import com.bytedance.sdk.account.p871j.C13180a;
import com.bytedance.sdk.account.p876k.C13195c;
import com.bytedance.sdk.account.p876k.C13197d;
import com.bytedance.sdk.account.p876k.C13199e;
import com.bytedance.sdk.account.p876k.C13201f;
import com.bytedance.sdk.account.p876k.C13204h;
import com.p683ss.android.account.C18496d;
import java.util.Map;

/* renamed from: com.bytedance.sdk.account.d.f */
final class C13088f implements C13020e {

    /* renamed from: a */
    Context f34203a;

    public C13088f(Context context) {
        this.f34203a = context;
    }

    /* renamed from: a */
    public final void mo24651a(String str, Map map, C18496d dVar) {
        new C13204h(this.f34203a, C13078b.m26262a(str, null, null, null, null, null, null).mo24752a(C12999b.m26135a("/2/user/info/")).mo24756b(), dVar).mo24766d();
    }

    /* renamed from: a */
    public final void mo24648a(String str, String str2, String str3, long j, Map map, C12989a<C12995g> aVar) {
        C13180a.m26564a(Integer.valueOf(6), str2);
        new C13199e(this.f34203a, C13078b.m26262a(str2, null, String.valueOf(j), str3, null, str, map).mo24752a(C12999b.m26134a()).mo24751a().mo24757c(), aVar).mo24766d();
    }

    /* renamed from: b */
    public final void mo24652b(String str, String str2, String str3, long j, Map map, C12989a<C12995g> aVar) {
        C13180a.m26564a(Integer.valueOf(6), str2);
        new C13199e(this.f34203a, C13078b.m26262a(str2, str3, String.valueOf(j), null, null, str, map).mo24752a(C12999b.m26134a()).mo24751a().mo24757c(), aVar).mo24766d();
    }

    /* renamed from: c */
    public final void mo24654c(String str, String str2, String str3, long j, Map map, C12989a<C12995g> aVar) {
        C13180a.m26564a(Integer.valueOf(6), str2);
        new C13201f(this.f34203a, C13078b.m26262a(str2, null, String.valueOf(j), str3, null, str, map).mo24752a(C12999b.m26136b()).mo24757c(), aVar).mo24766d();
    }

    /* renamed from: d */
    public final void mo24655d(String str, String str2, String str3, long j, Map map, C12989a<C12995g> aVar) {
        C13180a.m26564a(Integer.valueOf(6), str2);
        new C13201f(this.f34203a, C13078b.m26262a(str2, str3, String.valueOf(j), null, null, str, map).mo24752a(C12999b.m26136b()).mo24757c(), aVar).mo24766d();
    }

    /* renamed from: a */
    public final void mo24649a(String str, String str2, String str3, long j, Map map, C18496d dVar) {
        new C13197d(this.f34203a, C13078b.m26262a(str2, null, String.valueOf(j), str3, null, str, map).mo24752a(C12999b.m26137c()).mo24757c(), dVar).mo24766d();
    }

    /* renamed from: b */
    public final void mo24653b(String str, String str2, String str3, long j, Map map, C18496d dVar) {
        new C13197d(this.f34203a, C13078b.m26262a(str2, str3, String.valueOf(j), null, null, str, map).mo24752a(C12999b.m26137c()).mo24757c(), dVar).mo24766d();
    }

    /* renamed from: a */
    public final void mo24650a(String str, String str2, String str3, String str4, String str5, long j, Map map, C12989a<C12994f> aVar) {
        String str6 = str5;
        new C13195c(this.f34203a, C13078b.m26262a(str2, str4, "0", str3, null, str, null).mo24753a("access_token_secret", str5).mo24752a(C12998a.m26118a("/passport/auth/authorize/")).mo24757c(), aVar).mo24766d();
    }
}
