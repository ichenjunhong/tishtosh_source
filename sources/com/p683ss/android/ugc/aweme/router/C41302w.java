package com.p683ss.android.ugc.aweme.router;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.p030v4.app.C0643c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.p1162e.C19140b;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.router.C41272c.C41273a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.router.w */
public class C41302w {

    /* renamed from: a */
    public static Set<C41308a> f104750a = new LinkedHashSet();

    /* renamed from: b */
    public static C41309b f104751b = null;

    /* renamed from: c */
    public static C41302w f104752c = null;

    /* renamed from: e */
    static boolean f104753e = false;

    /* renamed from: f */
    private static final String f104754f = "com.ss.android.ugc.aweme.router.w";

    /* renamed from: g */
    private static Application f104755g;

    /* renamed from: h */
    private static final LinkedHashMap<String, C41288m> f104756h = new LinkedHashMap<>();

    /* renamed from: i */
    private static boolean f104757i = false;

    /* renamed from: d */
    public C41300u f104758d = new C41300u();

    /* renamed from: com.ss.android.ugc.aweme.router.w$a */
    public interface C41308a {
        /* renamed from: a */
        void mo83857a();
    }

    /* renamed from: com.ss.android.ugc.aweme.router.w$b */
    public interface C41309b {
        /* renamed from: a */
        String mo47844a(String str);
    }

    /* renamed from: a */
    private static boolean m91046a(C41288m mVar, String str) {
        return mVar != null;
    }

    /* renamed from: a */
    public final boolean mo83858a(Activity activity, String str) {
        return C41310x.m91060a(this, activity, str);
    }

    /* renamed from: a */
    public final boolean mo83859a(Activity activity, String str, int i) {
        return C41310x.m91061a(this, activity, str, i);
    }

    /* renamed from: a */
    public final boolean mo83860a(Activity activity, String str, View view) {
        return C41310x.m91062a(this, activity, str, view);
    }

    /* renamed from: a */
    public final boolean mo83861a(String str) {
        return C41310x.m91063a(this, str);
    }

    /* renamed from: a */
    public final boolean mo83862a(String str, HashMap hashMap) {
        return C41310x.m91064a(this, str, hashMap);
    }

    /* renamed from: a */
    public static C41302w m91042a() {
        if (f104752c != null) {
            return f104752c;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    /* renamed from: b */
    private static void m91047b() {
        if (!f104757i) {
            synchronized (f104756h) {
                for (C41308a a : f104750a) {
                    a.mo83857a();
                }
                f104757i = true;
            }
        }
    }

    public C41302w(Application application) {
        f104755g = application;
    }

    /* renamed from: b */
    public final boolean mo83866b(String str) {
        C19140b.m46665a(C11010c.m22280a()).mo39083a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(C11010c.m22280a(), str).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C41302w.m91045a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m91047b();
            if (f104751b != null) {
                str = f104751b.mo47844a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C41288m mVar = null;
            Iterator it = f104756h.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C41312z.m91071a(str2, str)) {
                    mVar = (C41288m) f104756h.get(str2);
                    break;
                }
            }
            if (!m91046a(mVar, str)) {
                m91045a(str, false);
                return false;
            }
            zArr[0] = mVar.mo47182a(str);
        }
        if (!zArr[0]) {
            m91045a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: a */
    public static void m91043a(String str, C41288m mVar) {
        f104756h.put(str, mVar);
    }

    /* renamed from: a */
    public static void m91044a(String str, Class<? extends Activity> cls) {
        C41271b bVar = new C41271b(f104755g, str, cls);
        bVar.f104714c = f104753e;
        if (f104756h.get(str) == null) {
            f104756h.put(str, bVar);
        }
    }

    /* renamed from: a */
    public static void m91045a(String str, boolean z) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            String str3 = "type";
            if (z) {
                str2 = "smartrouter";
            } else {
                str2 = "all";
            }
            jSONObject.put(str3, str2);
            jSONObject.put(C23060d.f61428b, str);
            C9951d.m19999a("in_app_router_no_matched", null, null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo83863b(Activity activity, String str) {
        C19140b.m46665a(C11010c.m22280a()).mo39083a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute((Context) activity, str).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C41302w.m91045a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m91047b();
            if (f104751b != null) {
                str = f104751b.mo47844a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C41288m mVar = null;
            Iterator it = f104756h.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C41312z.m91071a(str2, str)) {
                    mVar = (C41288m) f104756h.get(str2);
                    break;
                }
            }
            if (!m91046a(mVar, str)) {
                m91045a(str, false);
                return false;
            }
            zArr[0] = mVar.mo47180a(activity, str);
        }
        if (!zArr[0]) {
            m91045a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: b */
    public final boolean mo83867b(String str, HashMap<String, String> hashMap) {
        String str2;
        if (hashMap != null) {
            C41311y a = C41311y.m91065a(str);
            for (Entry entry : hashMap.entrySet()) {
                a.mo83870a((String) entry.getKey(), (String) entry.getValue());
            }
            str2 = a.mo83871a();
        } else {
            str2 = str;
        }
        C19140b.m46665a(C11010c.m22280a()).mo39083a(str2);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(C11010c.m22280a(), str2).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C41302w.m91045a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m91047b();
            if (f104751b != null) {
                str = f104751b.mo47844a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C41288m mVar = null;
            Iterator it = f104756h.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (C41312z.m91071a(str3, str)) {
                    mVar = (C41288m) f104756h.get(str3);
                    break;
                }
            }
            if (!m91046a(mVar, str2)) {
                m91045a(str2, false);
                return false;
            }
            zArr[0] = mVar.mo47182a(str2);
        }
        if (!zArr[0]) {
            m91045a(str2, false);
        }
        return zArr[0];
    }

    /* renamed from: b */
    public final boolean mo83864b(Activity activity, String str, int i) {
        C19140b.m46665a(C11010c.m22280a()).mo39083a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute((Context) activity, str).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C41302w.m91045a(str, true);
            }
        }).open(i);
        if (!zArr[0]) {
            m91047b();
            if (f104751b != null) {
                str = f104751b.mo47844a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C41288m mVar = null;
            Iterator it = f104756h.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C41312z.m91071a(str2, str)) {
                    mVar = (C41288m) f104756h.get(str2);
                    break;
                }
            }
            if (!m91046a(mVar, str)) {
                m91045a(str, false);
                return false;
            } else if (mVar instanceof C41271b) {
                C41271b bVar = (C41271b) mVar;
                C41273a aVar = new C41273a();
                aVar.f104723a = 1;
                C41272c cVar = new C41272c();
                cVar.f104722e = aVar.f104723a;
                cVar.f104718a = aVar.f104724b;
                cVar.f104719b = aVar.f104725c;
                cVar.f104720c = aVar.f104726d;
                cVar.f104721d = aVar.f104727e;
                cVar.f104720c = i;
                bVar.f104713b = cVar;
                zArr[0] = bVar.mo47180a(activity, str);
            } else {
                zArr[0] = mVar.mo47180a(activity, str);
            }
        }
        if (!zArr[0]) {
            m91045a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: b */
    public final boolean mo83865b(Activity activity, String str, View view) {
        C0643c a = C0643c.m1728a(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);
        C19140b.m46665a(C11010c.m22280a()).mo39083a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute((Context) activity, str).withBundleAnimation(a.mo2171a()).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C41302w.m91045a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m91047b();
            if (f104751b != null) {
                str = f104751b.mo47844a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            C41288m mVar = null;
            Iterator it = f104756h.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (C41312z.m91071a(str2, str)) {
                    mVar = (C41288m) f104756h.get(str2);
                    break;
                }
            }
            if (!m91046a(mVar, str)) {
                m91045a(str, false);
                return false;
            }
            zArr[0] = mVar.mo47181a(activity, str, view);
        }
        if (!zArr[0]) {
            m91045a(str, false);
        }
        return zArr[0];
    }
}
