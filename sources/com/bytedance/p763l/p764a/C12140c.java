package com.bytedance.p763l.p764a;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import com.bytedance.p763l.C12149b;
import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.C12153d;
import com.bytedance.p763l.p765b.C12150a;
import com.google.android.play.core.p1053e.C17318a;
import com.google.android.play.core.p1053e.C17329b;
import com.google.android.play.core.p1053e.C17338d;
import com.google.android.play.core.p1053e.C17339e;
import com.google.android.play.core.p1053e.C17340f;
import com.google.android.play.core.p1053e.C17342g;
import com.google.android.play.core.p1053e.C17343h;
import com.google.android.play.core.p1056f.C17362a;
import com.google.android.play.core.p1056f.C17363b;
import com.google.android.play.core.p1056f.C17365d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.l.a.c */
public class C12140c implements C12149b {

    /* renamed from: d */
    private static volatile C12140c f32052d;

    /* renamed from: a */
    public List<C17343h> f32053a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final C17343h f32054b = new C17343h() {
        /* renamed from: a */
        public final /* synthetic */ void mo23054a(Object obj) {
            boolean z;
            final C17342g gVar = (C17342g) obj;
            if (gVar.mo33634b() == 5) {
                if (VERSION.SDK_INT >= 26) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Context a = C12152c.m24592a();
                    if (VERSION.SDK_INT > 25 && VERSION.SDK_INT < 28) {
                        C17329b.f48819a.mo33685a("Calling dispatchPackageBroadcast", new Object[0]);
                        try {
                            Class cls = Class.forName("android.app.ActivityThread");
                            Method method = cls.getMethod("currentActivityThread", new Class[0]);
                            method.setAccessible(true);
                            Object invoke = method.invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mAppThread");
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(invoke);
                            obj2.getClass().getMethod("dispatchPackageBroadcast", new Class[]{Integer.TYPE, String[].class}).invoke(obj2, new Object[]{Integer.valueOf(3), new String[]{a.getPackageName()}});
                            C17329b.f48819a.mo33685a("Called dispatchPackageBroadcast", new Object[0]);
                        } catch (Exception e) {
                            C17329b.f48819a.mo33686a((Throwable) e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
                        }
                    }
                    new Handler().post(new Runnable() {
                        public final void run() {
                            C12152c.m24592a().getAssets();
                        }
                    });
                }
            }
            new Handler().post(new Runnable() {
                public final void run() {
                    C17342g gVar = gVar;
                    for (String b : gVar.mo33640h()) {
                        String b2 = C12147e.m24581a().mo23060b(b);
                        C12153d.m24598a().mo23065a(C12140c.m24569a(b2, gVar));
                        C12139b.m24568a().f32051a.put(b2, gVar);
                    }
                }
            });
            for (C17343h a2 : C12140c.this.f32053a) {
                a2.mo23054a(gVar);
            }
        }
    };

    /* renamed from: c */
    public C17338d f32055c = C17339e.m42458a(C12152c.m24592a());

    /* renamed from: a */
    public final Map<String, C12150a> mo23050a() {
        return C12153d.m24598a().f32084b;
    }

    /* renamed from: b */
    public static C12140c m24571b() {
        if (f32052d == null) {
            synchronized (C12140c.class) {
                if (f32052d == null) {
                    f32052d = new C12140c();
                }
            }
        }
        return f32052d;
    }

    private C12140c() {
        this.f32055c.mo33618a(this.f32054b);
        m24572c();
    }

    /* renamed from: c */
    private void m24572c() {
        HashMap hashMap = new HashMap();
        Set b = this.f32055c.mo33621b();
        try {
            JSONArray jSONArray = new JSONArray(C12146d.m24580a(C12152c.m24592a(), "plugins.json"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("packageName");
                    String optString2 = optJSONObject.optString("aabName");
                    if (optString2 == null) {
                        optString2 = optString;
                    }
                    C12147e a = C12147e.m24581a();
                    if (a.f32065a.containsKey(optString)) {
                        StringBuilder sb = new StringBuilder("duplicate config for package name ");
                        sb.append(optString);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (!a.f32066b.containsKey(optString2)) {
                        a.f32065a.put(optString, optString2);
                        a.f32066b.put(optString2, optString);
                        if (b.contains(optString2)) {
                            hashMap.put(optString, new C12150a(optString, C12152c.m24596b().mo23049b(), 5));
                        } else {
                            int a2 = C12148f.m24584a().mo23061a(optString);
                            if (a2 == -1) {
                                hashMap.put(optString, new C12150a(optString, C12152c.m24596b().mo23049b(), 0));
                            } else {
                                C17365d b2 = this.f32055c.mo33620b(a2);
                                if (!b2.mo33658a()) {
                                    hashMap.put(optString, new C12150a(optString, C12152c.m24596b().mo23049b(), 0));
                                } else {
                                    hashMap.put(optString, m24569a(optString, (C17342g) b2.mo33660c()));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("duplicate config for aab name ");
                        sb2.append(optString2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
            }
        } catch (Exception unused) {
        }
        C12153d.m24598a().f32084b.putAll(hashMap);
    }

    /* renamed from: b */
    public final C12150a mo23053b(String str) {
        return (C12150a) C12153d.m24598a().f32084b.get(str);
    }

    /* renamed from: a */
    public final void mo23051a(final String str) {
        this.f32055c.mo33616a(C17340f.m42459a().mo33631a(C12147e.m24581a().mo23059a(str)).mo33632a()).mo33657a((C17363b<? super ResultT>) new C17363b<Integer>() {
            /* renamed from: a */
            public final /* synthetic */ void mo23058a(Object obj) {
                C12148f.m24584a().mo23062a(str, ((Integer) obj).intValue());
            }
        }).mo33656a((C17362a) new C17362a() {
            /* renamed from: a */
            public final void mo23057a(Exception exc) {
                C12140c.m24570a(exc, str);
            }
        });
    }

    /* renamed from: a */
    static C12150a m24569a(String str, C17342g gVar) {
        C12150a aVar = new C12150a(str, C12152c.m24596b().mo23049b(), gVar.mo33634b());
        aVar.f32072d = gVar.mo33637e();
        aVar.f32073e = gVar.mo33636d();
        aVar.f32076h = gVar.mo33642j();
        aVar.f32075g = gVar.mo33635c();
        return aVar;
    }

    /* renamed from: a */
    public static void m24570a(Exception exc, String str) {
        C12150a aVar = new C12150a(str, C12152c.m24596b().mo23049b(), 6);
        if (exc instanceof C17318a) {
            aVar.f32075g = ((C17318a) exc).getErrorCode();
        }
        aVar.f32077i = exc;
        C12153d.m24598a().mo23065a(aVar);
    }

    /* renamed from: a */
    public final boolean mo23052a(String str, String str2) {
        if (!this.f32055c.mo33621b().contains(C12147e.m24581a().mo23059a(str))) {
            return false;
        }
        try {
            C17329b.m42425a(C12152c.m24592a().createPackageContext(C12152c.m24592a().getPackageName(), 0), str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
