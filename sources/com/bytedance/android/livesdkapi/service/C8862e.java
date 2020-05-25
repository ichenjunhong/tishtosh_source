package com.bytedance.android.livesdkapi.service;

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
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdkapi.service.e */
public interface C8862e {
    /* renamed from: a */
    Fragment mo15024a(Context context, Bundle bundle);

    /* renamed from: a */
    Fragment mo15025a(C8680c cVar, Bundle bundle);

    /* renamed from: a */
    LiveActivityProxy mo15026a(FragmentActivity fragmentActivity, int i);

    /* renamed from: a */
    C8643b mo15027a(Context context, ViewGroup viewGroup);

    /* renamed from: a */
    C8645d mo15028a(Context context, ViewGroup viewGroup, long j);

    /* renamed from: a */
    C8657i mo15029a(long j, Bundle bundle);

    /* renamed from: a */
    C8677a mo15030a(Bundle bundle);

    /* renamed from: a */
    C8682e mo15031a(C8832a aVar);

    /* renamed from: a */
    IMessageManager mo15032a(long j, Context context, String str);

    /* renamed from: a */
    <T> T mo15033a(String str, T t);

    /* renamed from: a */
    String mo15034a(long j, Bundle bundle, Context context);

    /* renamed from: a */
    void mo15035a();

    /* renamed from: a */
    void mo15036a(long j, C8859b bVar);

    /* renamed from: a */
    void mo15037a(long j, C8860c cVar);

    /* renamed from: a */
    void mo15038a(Context context);

    /* renamed from: a */
    void mo15039a(Context context, C8633b bVar);

    /* renamed from: a */
    void mo15040a(Context context, C8818h hVar);

    /* renamed from: a */
    void mo15041a(String str);

    /* renamed from: a */
    void mo15042a(String str, boolean z);

    /* renamed from: a */
    void mo15043a(Locale locale);

    /* renamed from: a */
    void mo15044a(boolean z);

    /* renamed from: a */
    boolean mo15045a(Context context, Uri uri);

    /* renamed from: b */
    Fragment mo15046b(Context context, Bundle bundle);

    /* renamed from: b */
    C8610b mo15047b(Bundle bundle);

    /* renamed from: b */
    C8863f mo15048b();

    /* renamed from: b */
    void mo15049b(String str);

    /* renamed from: c */
    C8661k mo15050c();

    /* renamed from: d */
    C8649h mo15051d();

    /* renamed from: e */
    C8640b mo15052e();

    /* renamed from: f */
    Fragment mo15053f();

    /* renamed from: g */
    C8644c mo15054g();

    /* renamed from: h */
    C8683f mo15055h();

    /* renamed from: i */
    int mo15056i();

    /* renamed from: j */
    int mo15057j();

    /* renamed from: k */
    C8667q mo15058k();

    /* renamed from: l */
    String mo15059l();

    /* renamed from: m */
    C8608c mo15060m();

    /* renamed from: n */
    C8647f mo15061n();

    /* renamed from: o */
    C8663m mo15062o();
}
