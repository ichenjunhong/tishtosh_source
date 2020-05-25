package com.p683ss.android.ugc.aweme.notice.api;

import com.p683ss.android.ugc.aweme.notice.C38018a;
import com.p683ss.android.ugc.aweme.notice.C38079b;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38029b;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a;
import com.p683ss.android.ugc.aweme.notice.api.p2007c.C38045b;
import com.p683ss.android.ugc.aweme.services.MainServiceHelperImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notice.api.d */
public final class C38046d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f96821a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38046d.class), "noticeListService", "getNoticeListService()Lcom/ss/android/ugc/aweme/notice/api/list/NoticeListService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38046d.class), "noticeCountService", "getNoticeCountService()Lcom/ss/android/ugc/aweme/notice/api/count/NoticeCountService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38046d.class), "mainServiceHelper", "getMainServiceHelper()Lcom/ss/android/ugc/aweme/notice/api/helper/IMainServiceHelper;"))};

    /* renamed from: b */
    public static final C38046d f96822b = new C38046d();

    /* renamed from: c */
    private static final C52668f f96823c = C52732g.m112285a(C38049c.f96828a);

    /* renamed from: d */
    private static final C52668f f96824d = C52732g.m112285a(C38048b.f96827a);

    /* renamed from: e */
    private static final C52668f f96825e = C52732g.m112285a(C38047a.f96826a);

    /* renamed from: com.ss.android.ugc.aweme.notice.api.d$a */
    static final class C38047a extends C52712l implements C52670a<IMainServiceHelper> {

        /* renamed from: a */
        public static final C38047a f96826a = new C38047a();

        C38047a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return MainServiceHelperImpl.provideIMainServiceHelper_Monster();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.d$b */
    static final class C38048b extends C52712l implements C52670a<C38029b> {

        /* renamed from: a */
        public static final C38048b f96827a = new C38048b();

        C38048b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C38018a.m85047b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.api.d$c */
    static final class C38049c extends C52712l implements C52670a<C38045b> {

        /* renamed from: a */
        public static final C38049c f96828a = new C38049c();

        C38049c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C38079b.m85154c();
        }
    }

    private C38046d() {
    }

    /* renamed from: a */
    public final C38045b mo77573a() {
        return (C38045b) f96823c.getValue();
    }

    /* renamed from: b */
    public final C38029b mo77574b() {
        return (C38029b) f96824d.getValue();
    }

    /* renamed from: c */
    public final IMainServiceHelper mo77575c() {
        return (IMainServiceHelper) f96825e.getValue();
    }

    /* renamed from: d */
    public static final C38044a m85104d() {
        return f96822b.mo77573a().mo77572b();
    }

    /* renamed from: e */
    public static final void m85105e() {
        f96822b.mo77574b().mo77489a();
    }

    /* renamed from: a */
    private int m85096a(int i) {
        return mo77574b().mo77487a(i);
    }

    /* renamed from: c */
    public static final void m85103c(int... iArr) {
        C52711k.m112240b(iArr, "groups");
        f96822b.mo77574b().mo77495a(iArr);
    }

    /* renamed from: a */
    public static final int m85097a(String str) {
        C52711k.m112240b(str, "uid");
        return f96822b.mo77574b().mo77488a(str);
    }

    /* renamed from: a */
    public static final int m85098a(int... iArr) {
        C52711k.m112240b(iArr, "groups");
        Collection arrayList = new ArrayList(iArr.length);
        for (int a : iArr) {
            arrayList.add(Integer.valueOf(f96822b.m85096a(a)));
        }
        return C52575l.m112149l((List) arrayList);
    }

    /* renamed from: b */
    public static final boolean m85102b(int... iArr) {
        C52711k.m112240b(iArr, "groups");
        Collection arrayList = new ArrayList(iArr.length);
        for (int a : iArr) {
            arrayList.add(Integer.valueOf(f96822b.m85096a(a)));
        }
        if (C52575l.m112149l((List) arrayList) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m85100a(boolean z) {
        f96822b.mo77574b().mo77493a(z);
    }

    /* renamed from: a */
    public static final void m85099a(int i, int i2) {
        f96822b.mo77574b().mo77490a(i, i2);
    }

    /* renamed from: a */
    public static final void m85101a(boolean z, int i) {
        f96822b.mo77574b().mo77494a(z, i);
    }
}
