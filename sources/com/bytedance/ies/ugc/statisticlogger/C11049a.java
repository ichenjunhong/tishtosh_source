package com.bytedance.ies.ugc.statisticlogger;

import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.deviceregister.C19034d.C19035a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p094l.C2178a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.a */
public final class C11049a {

    /* renamed from: a */
    public static final C2189f<String> f29670a;

    /* renamed from: b */
    static final C2189f<Boolean> f29671b;

    /* renamed from: c */
    static final C2189f<Boolean> f29672c;

    /* renamed from: d */
    static final C2189f<C11052b> f29673d;

    /* renamed from: e */
    public static final C11050a f29674e = new C11050a();

    /* renamed from: f */
    public static final C11049a f29675f = new C11049a();

    /* renamed from: g */
    private static final C2189f<String> f29676g;

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$a */
    public static final class C11050a implements C19035a {
        C11050a() {
        }

        public final void onDidLoadLocally(boolean z) {
            C11049a aVar = C11049a.f29675f;
            C11049a.f29671b.onNext(Boolean.valueOf(z));
        }

        public final void onRemoteConfigUpdate(boolean z, boolean z2) {
            C11049a aVar = C11049a.f29675f;
            C11049a.f29672c.onNext(Boolean.valueOf(z));
        }

        public final void onDeviceRegistrationInfoChanged(String str, String str2) {
            C52711k.m112236a((Object) C2240a.m6772a("onDeviceIdChanged,did:%s,installId:%s", Arrays.copyOf(new Object[]{str, str2}, 2)), "java.lang.String.format(format, *args)");
            C11049a.f29675f.mo20019e();
            C11049a aVar = C11049a.f29675f;
            C11049a.f29673d.onNext(C11052b.INSTANCE);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.a$b */
    public static final class C11051b<T> implements C1715j<String> {

        /* renamed from: a */
        public static final C11051b f29677a = new C11051b();

        C11051b() {
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
    }

    private C11049a() {
    }

    /* renamed from: a */
    public static String m22365a() {
        return AppLog.getInstallId();
    }

    /* renamed from: b */
    public static String m22366b() {
        return AppLog.getClientId();
    }

    /* renamed from: c */
    public static String m22367c() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            return "";
        }
        return serverDeviceId;
    }

    /* renamed from: d */
    public static Map<String, String> m22368d() {
        Map<String, String> hashMap = new HashMap<>();
        AppLog.getSSIDs(hashMap);
        return hashMap;
    }

    /* renamed from: e */
    public final void mo20019e() {
        String c = m22367c();
        if (c != null) {
            f29670a.onNext(c);
        }
        String a = m22365a();
        if (a != null) {
            f29676g.onNext(a);
        }
    }

    static {
        C2189f<String> n = C2178a.m6527l().mo6479n();
        C52711k.m112236a((Object) n, "BehaviorSubject.create<String>().toSerialized()");
        f29670a = n;
        C2189f<String> n2 = C2178a.m6527l().mo6479n();
        C52711k.m112236a((Object) n2, "BehaviorSubject.create<String>().toSerialized()");
        f29676g = n2;
        C2189f<Boolean> n3 = C2180b.m6534l().mo6479n();
        C52711k.m112236a((Object) n3, "PublishSubject.create<Boolean>().toSerialized()");
        f29671b = n3;
        C2189f<Boolean> n4 = C2180b.m6534l().mo6479n();
        C52711k.m112236a((Object) n4, "PublishSubject.create<Boolean>().toSerialized()");
        f29672c = n4;
        C2189f<C11052b> n5 = C2180b.m6534l().mo6479n();
        C52711k.m112236a((Object) n5, "PublishSubject.create<Irrelevant>().toSerialized()");
        f29673d = n5;
    }
}
