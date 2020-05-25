package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.C8608c;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.depend.live.C8643b;
import com.bytedance.android.livesdkapi.depend.live.C8644c;
import com.bytedance.android.livesdkapi.depend.live.C8645d;
import com.bytedance.android.livesdkapi.depend.live.C8647f;
import com.bytedance.android.livesdkapi.depend.live.C8649h;
import com.bytedance.android.livesdkapi.depend.live.C8657i;
import com.bytedance.android.livesdkapi.depend.live.C8661k;
import com.bytedance.android.livesdkapi.depend.live.C8663m;
import com.bytedance.android.livesdkapi.depend.live.C8667q;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8640b;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8677a;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8680c;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.p431c.C8610b;
import com.bytedance.android.livesdkapi.p455i.C8818h;
import com.bytedance.android.livesdkapi.p457k.C8832a;
import com.bytedance.android.livesdkapi.service.C8859b;
import com.bytedance.android.livesdkapi.service.C8860c;
import com.bytedance.android.livesdkapi.service.C8863f;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.s */
public final class C36151s implements C36065d {

    /* renamed from: com.ss.android.ugc.aweme.live.s$a */
    static class C36152a {

        /* renamed from: a */
        public static C36065d f92562a = new C36151s();
    }

    /* renamed from: q */
    public final void mo74831q() {
        Live.refreshLoginState();
    }

    /* renamed from: a */
    public final void mo15038a(Context context) {
        Live.getService().mo15038a(context);
    }

    /* renamed from: a */
    public final void mo15042a(String str, boolean z) {
        Live.getService().mo15042a(str, z);
    }

    /* renamed from: a */
    public final void mo15044a(boolean z) {
        Live.getService().mo15044a(z);
    }

    /* renamed from: a */
    public final void mo15043a(Locale locale) {
        Live.getService().mo15043a(locale);
    }

    /* renamed from: a */
    public final boolean mo15045a(Context context, Uri uri) {
        return Live.getService().mo15045a(context, uri);
    }

    /* renamed from: a */
    public final void mo15041a(String str) {
        Live.getService().mo15041a(str);
    }

    /* renamed from: a */
    public final void mo15036a(long j, C8859b bVar) {
        Live.getService().mo15036a(j, bVar);
    }

    /* renamed from: a */
    public final void mo15037a(long j, C8860c cVar) {
        Live.getService().mo15037a(j, cVar);
    }

    /* renamed from: a */
    public final <T> T mo15033a(String str, T t) {
        return Live.getService().mo15033a(str, t);
    }

    /* renamed from: a */
    public final IMessageManager mo15032a(long j, Context context, String str) {
        return Live.getService().mo15032a(j, context, str);
    }

    /* renamed from: a */
    public final void mo15040a(Context context, C8818h hVar) {
        Live.getService().mo15040a(context, hVar);
    }

    /* renamed from: a */
    public final void mo15039a(Context context, C8633b bVar) {
        Live.getService().mo15039a(context, bVar);
    }

    /* renamed from: a */
    public final String mo15034a(long j, Bundle bundle, Context context) {
        return Live.getService().mo15034a(j, bundle, context);
    }

    /* renamed from: a */
    public final void mo15035a() {
        Live.getService().mo15035a();
    }

    /* renamed from: p */
    public final boolean mo74830p() {
        return Live.openLiveRecord();
    }

    /* renamed from: c */
    public final C8661k mo15050c() {
        return Live.getService().mo15050c();
    }

    /* renamed from: d */
    public final C8649h mo15051d() {
        return Live.getService().mo15051d();
    }

    /* renamed from: e */
    public final C8640b mo15052e() {
        return Live.getService().mo15052e();
    }

    /* renamed from: f */
    public final Fragment mo15053f() {
        return Live.getService().mo15053f();
    }

    /* renamed from: g */
    public final C8644c mo15054g() {
        return Live.getService().mo15054g();
    }

    /* renamed from: h */
    public final C8683f mo15055h() {
        return Live.getService().mo15055h();
    }

    /* renamed from: i */
    public final int mo15056i() {
        return Live.getService().mo15056i();
    }

    /* renamed from: j */
    public final int mo15057j() {
        return Live.getService().mo15057j();
    }

    /* renamed from: k */
    public final C8667q mo15058k() {
        return Live.getService().mo15058k();
    }

    /* renamed from: l */
    public final String mo15059l() {
        return Live.getService().mo15059l();
    }

    /* renamed from: m */
    public final C8608c mo15060m() {
        return Live.getService().mo15060m();
    }

    /* renamed from: n */
    public final C8647f mo15061n() {
        return Live.getService().mo15061n();
    }

    /* renamed from: o */
    public final C8663m mo15062o() {
        return Live.getService().mo15062o();
    }

    /* renamed from: b */
    public final C8863f mo15048b() {
        return Live.getService().mo15048b();
    }

    /* renamed from: b */
    public final void mo15049b(String str) {
        Live.getService().mo15049b(str);
    }

    /* renamed from: b */
    public final C8610b mo15047b(Bundle bundle) {
        return Live.getService().mo15047b(bundle);
    }

    /* renamed from: a */
    public final C8677a mo15030a(Bundle bundle) {
        return Live.getService().mo15030a(bundle);
    }

    /* renamed from: a */
    public final C8682e mo15031a(C8832a aVar) {
        return Live.getService().mo15031a(aVar);
    }

    /* renamed from: a */
    public final void mo74829a(Activity activity, HashMap<String, String> hashMap) {
        LiveFeedActivity.m81192a(activity, hashMap);
    }

    /* renamed from: a */
    public final Fragment mo15024a(Context context, Bundle bundle) {
        return Live.getService().mo15024a(context, bundle);
    }

    /* renamed from: b */
    public final Fragment mo15046b(Context context, Bundle bundle) {
        return Live.getService().mo15046b(context, bundle);
    }

    /* renamed from: a */
    public final Fragment mo15025a(C8680c cVar, Bundle bundle) {
        return Live.getService().mo15025a(cVar, bundle);
    }

    /* renamed from: a */
    public final LiveActivityProxy mo15026a(FragmentActivity fragmentActivity, int i) {
        return Live.getService().mo15026a(fragmentActivity, i);
    }

    /* renamed from: a */
    public final C8643b mo15027a(Context context, ViewGroup viewGroup) {
        return Live.getService().mo15027a(context, viewGroup);
    }

    /* renamed from: a */
    public final C8657i mo15029a(long j, Bundle bundle) {
        return Live.getService().mo15029a(j, bundle);
    }

    /* renamed from: a */
    public final C8645d mo15028a(Context context, ViewGroup viewGroup, long j) {
        return Live.getService().mo15028a(context, viewGroup, j);
    }
}
