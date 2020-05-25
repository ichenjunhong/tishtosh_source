package com.p683ss.android.ugc.aweme.feed.helper;

import android.support.p030v4.p038f.C0786h;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.s */
public final class C30396s {

    /* renamed from: a */
    public static final C30396s f79462a = new C30396s();

    /* renamed from: b */
    private static C0786h<String, C30389m> f79463b = new C0786h<>(C10181b.m20511a().mo18168a(RealTimeReportMaxNums.class, true, "real_time_report_max_nums", 31744, 10));

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.s$a */
    static final class C30397a extends C52712l implements C52671b<C52847n<? extends Integer, ? extends C30389m>, String> {

        /* renamed from: a */
        public static final C30397a f79464a = new C30397a();

        C30397a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m71320a((C52847n) obj);
        }

        /* renamed from: a */
        private static String m71320a(C52847n<Integer, C30389m> nVar) {
            C52711k.m112240b(nVar, "it");
            try {
                C30389m mVar = (C30389m) nVar.getSecond();
                StringBuilder sb = new StringBuilder();
                sb.append(mVar.f79447a);
                sb.append('|');
                sb.append(mVar.f79448b);
                sb.append('|');
                sb.append((int) (mVar.f79449c / 1000));
                sb.append('|');
                sb.append(((Number) nVar.getFirst()).intValue());
                return sb.toString();
            } catch (Exception e) {
                C32458a.m75143a(e);
                return "";
            }
        }
    }

    private C30396s() {
    }

    /* renamed from: b */
    public static final boolean m71318b() {
        if (C10181b.m20511a().mo18168a(ReportNewUserBehaviorExperiment.class, false, "real_time_report_of_new_user", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m71317a() {
        CharSequence c = C19034d.m46323c();
        if (TextUtils.isEmpty(c) || TextUtils.equals(c, "0") || C10181b.m20511a().mo18168a(ReportNewUserBehaviorExperiment.class, false, "real_time_report_of_new_user", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final String m71319c() {
        Object obj;
        if (f79463b.mo2505b() == 0) {
            return null;
        }
        Map c = f79463b.mo2508c();
        C52711k.m112236a((Object) c, "behaviorList.snapshot()");
        Collection arrayList = new ArrayList();
        for (Entry entry : c.entrySet()) {
            int a = C23064c.m56602a(((C30389m) entry.getValue()).f79450d);
            if (a == -1) {
                obj = null;
            } else {
                obj = C52856t.m112465a(Integer.valueOf(a), entry.getValue());
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return C52575l.m112120a((List) arrayList, ",", null, null, 0, null, C30397a.f79464a, 30, null);
    }

    /* renamed from: a */
    public static final void m71316a(C30389m mVar) {
        C52711k.m112240b(mVar, "behavior");
        C0786h<String, C30389m> hVar = f79463b;
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.f79447a);
        sb.append(mVar.f79448b);
        hVar.mo2502a(sb.toString(), mVar);
    }
}
