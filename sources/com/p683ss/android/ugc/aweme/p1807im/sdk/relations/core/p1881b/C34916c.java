package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34923f.C34924a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.c */
public final class C34916c extends C34923f<IMUser, IMContact> {

    /* renamed from: f */
    public static final C34918b f89907f = new C34918b(null);

    /* renamed from: a */
    public List<String> f89908a;

    /* renamed from: b */
    public C52670a<? extends List<String>> f89909b;

    /* renamed from: c */
    public String f89910c;

    /* renamed from: d */
    public boolean f89911d;

    /* renamed from: e */
    public int f89912e;

    /* renamed from: s */
    private final C52671b<IMUser, IMContact> f89913s;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.c$a */
    public static final class C34917a extends C34924a<C34916c, IMUser, IMContact> {

        /* renamed from: a */
        public final C34916c f89914a = new C34916c(null);

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C34923f mo73023b() {
            return this.f89914a;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C34923f mo73022a() {
            return this.f89914a;
        }

        /* renamed from: a */
        public final C34917a mo73034a(boolean z) {
            C34917a aVar = this;
            aVar.f89914a.f89911d = z;
            return aVar;
        }

        /* renamed from: a */
        public final C34917a mo73032a(C52670a<? extends List<String>> aVar) {
            C52711k.m112240b(aVar, "filter");
            C34917a aVar2 = this;
            aVar2.f89914a.f89909b = aVar;
            return aVar2;
        }

        /* renamed from: a */
        public final C34917a mo73033a(String str) {
            C52711k.m112240b(str, "sql");
            C34917a aVar = this;
            aVar.f89914a.f89910c = str;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.c$b */
    public static final class C34918b {
        private C34918b() {
        }

        /* renamed from: a */
        public static C34917a m79034a() {
            return new C34917a();
        }

        public /* synthetic */ C34918b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.c$c */
    static final class C34919c extends C52712l implements C52671b<IMUser, IMUser> {

        /* renamed from: a */
        public static final C34919c f89915a = new C34919c();

        C34919c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IMUser iMUser = (IMUser) obj;
            C52711k.m112240b(iMUser, "it");
            return iMUser;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C52671b<IMUser, IMContact> mo73015a() {
        return this.f89913s;
    }

    private C34916c() {
        this.f89913s = C34919c.f89915a;
    }

    /* renamed from: i */
    private final List<String> m79024i() {
        C52670a<? extends List<String>> aVar = this.f89909b;
        if (aVar != null) {
            List<String> list = (List) aVar.invoke();
            if (list != null) {
                return list;
            }
        }
        return this.f89908a;
    }

    /* renamed from: j */
    private final int m79025j() {
        if (this.f89911d) {
            return -1;
        }
        if (this.f89926o < 0) {
            this.f89926o = 100;
        }
        return this.f89926o + 5;
    }

    /* renamed from: b */
    public final boolean mo73016b() {
        boolean z;
        if (!super.mo73016b()) {
            return false;
        }
        CharSequence charSequence = this.f89910c;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final List<IMUser> bo_() {
        if (!this.f89911d) {
            int j = m79025j();
            List<IMUser> a = C34387b.m78292a().mo72390a(m79024i(), j, this.f89912e * j, this.f89910c);
            if (a.isEmpty()) {
                return new ArrayList<>();
            }
            this.f89912e++;
            return a;
        }
        throw new UnsupportedOperationException("Weight sort mode not support load more!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final List<IMUser> mo73018c() {
        int i;
        int i2;
        C52711k.m112236a((Object) C34387b.m78292a(), "IMUserDao.inst()");
        boolean j = C34387b.m78306j();
        C52711k.m112236a((Object) C34387b.m78292a(), "IMUserDao.inst()");
        int l = C34387b.m78308l();
        User c = C35265e.m79732c();
        if (c != null) {
            i = c.getFollowingCount();
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder("FollowLoader DB: dbEmpty=");
        sb.append(j);
        sb.append(", dbCount=");
        sb.append(l);
        sb.append(", userCount=");
        sb.append(i);
        C32458a.m75144a(sb.toString());
        if (j || l + 1 < i) {
            if (j) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("error", Integer.valueOf(i2));
            StringBuilder sb2 = new StringBuilder("empty=");
            sb2.append(j);
            sb2.append(", dbCount=");
            sb2.append(l);
            sb2.append(", userCount=");
            sb2.append(i);
            linkedHashMap.put("error_stack", sb2.toString());
            C35265e.m79731b("follow_loader_data_error", linkedHashMap);
            C34971b.m79104a(C34971b.f89988d, C34970a.LOADER_DIFF, false, null, 6, null);
        }
        if (this.f89911d) {
            List<IMUser> c2 = C34387b.m78292a().mo72394c(this.f89910c);
            C52711k.m112236a((Object) c2, "IMUserDao.inst().queryBySortWeight(querySql)");
            return c2;
        }
        List<IMUser> a = C34387b.m78292a().mo72390a(m79024i(), m79025j(), 0, this.f89910c);
        if (a.isEmpty()) {
            this.f89912e = 0;
            return new ArrayList<>();
        }
        this.f89912e++;
        return a;
    }

    public /* synthetic */ C34916c(C52707g gVar) {
        this();
    }
}
