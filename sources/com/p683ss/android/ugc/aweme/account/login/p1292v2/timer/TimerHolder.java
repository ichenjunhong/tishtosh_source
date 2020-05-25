package com.p683ss.android.ugc.aweme.account.login.p1292v2.timer;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.C0195p;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21598l;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder */
public final class TimerHolder extends AndroidViewModel {

    /* renamed from: c */
    public static final C21852a f59140c = new C21852a(null);

    /* renamed from: b */
    public final C0195p<SparseArray<Map<String, C21853b>>> f59141b = new C0195p<>();

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder$a */
    public static final class C21852a {
        private C21852a() {
        }

        public /* synthetic */ C21852a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C21853b m54530a(FragmentActivity fragmentActivity, String str, C21848h hVar) {
            C52711k.m112240b(str, "timerId");
            C52711k.m112240b(hVar, "scene");
            if (fragmentActivity == null) {
                return null;
            }
            SparseArray sparseArray = (SparseArray) ((TimerHolder) C0214z.m440a(fragmentActivity).mo359a(TimerHolder.class)).f59141b.getValue();
            if (sparseArray != null) {
                Map map = (Map) sparseArray.get(hVar.getValue());
                if (map != null) {
                    return (C21853b) map.get(str);
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m54531a(FragmentActivity fragmentActivity, C21848h hVar, String str, boolean z) {
            C52711k.m112240b(str, "timerId");
            if (fragmentActivity != null && hVar != null) {
                C0195p<SparseArray<Map<String, C21853b>>> pVar = ((TimerHolder) C0214z.m440a(fragmentActivity).mo359a(TimerHolder.class)).f59141b;
                SparseArray sparseArray = (SparseArray) pVar.getValue();
                if (sparseArray != null) {
                    Map map = (Map) sparseArray.get(hVar.getValue());
                    if (map != null) {
                        C21853b bVar = (C21853b) map.get(str);
                        if (bVar != null) {
                            bVar.f59143b = Boolean.valueOf(z);
                            pVar.postValue(sparseArray);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static void m54532a(FragmentActivity fragmentActivity, String str, C21853b bVar, C21848h hVar) {
            C52711k.m112240b(str, "timerId");
            C52711k.m112240b(bVar, "model");
            C52711k.m112240b(hVar, "scene");
            if (fragmentActivity != null) {
                C0195p<SparseArray<Map<String, C21853b>>> pVar = ((TimerHolder) C0214z.m440a(fragmentActivity).mo359a(TimerHolder.class)).f59141b;
                SparseArray sparseArray = (SparseArray) pVar.getValue();
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                Map map = (Map) sparseArray.get(hVar.getValue());
                if (map == null) {
                    map = new LinkedHashMap();
                }
                map.put(str, bVar);
                sparseArray.put(hVar.getValue(), map);
                pVar.postValue(sparseArray);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder$b */
    public static final class C21853b {

        /* renamed from: a */
        public C21598l f59142a;

        /* renamed from: b */
        public Boolean f59143b;

        private C21853b(C21598l lVar, Boolean bool) {
            C52711k.m112240b(lVar, "timer");
            this.f59142a = lVar;
            this.f59143b = bool;
        }

        public /* synthetic */ C21853b(C21598l lVar, Boolean bool, int i, C52707g gVar) {
            this(lVar, null);
        }
    }

    public TimerHolder(Application application) {
        C52711k.m112240b(application, "app");
        super(application);
    }
}
