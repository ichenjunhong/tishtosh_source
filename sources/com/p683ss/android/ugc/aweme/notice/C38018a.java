package com.p683ss.android.ugc.aweme.notice;

import android.os.Message;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.message.p1949b.C36780b;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38029b;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38030c;
import com.p683ss.android.ugc.aweme.notice.api.p2006b.C38031d;
import com.p683ss.android.ugc.aweme.notice.api.utils.C38056a;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notice.a */
public final class C38018a implements C38029b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f96781a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38018a.class), "redPointService", "getRedPointService()Lcom/ss/android/ugc/aweme/notice/api/count/RedPointService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38018a.class), "oldPointService", "getOldPointService()Lcom/ss/android/ugc/aweme/notice/api/count/OldRedPointService;"))};

    /* renamed from: b */
    private final C52668f f96782b = C52732g.m112285a(C38020b.f96785a);

    /* renamed from: c */
    private final C52668f f96783c = C52732g.m112285a(C38019a.f96784a);

    /* renamed from: com.ss.android.ugc.aweme.notice.a$a */
    static final class C38019a extends C52712l implements C52670a<C38030c> {

        /* renamed from: a */
        public static final C38019a f96784a = new C38019a();

        C38019a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C36782d.m82778d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.a$b */
    static final class C38020b extends C52712l implements C52670a<C38031d> {

        /* renamed from: a */
        public static final C38020b f96785a = new C38020b();

        C38020b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C36782d.m82777c();
        }
    }

    /* renamed from: b */
    public static C38029b m85047b() {
        if (C27991b.f73431O == null) {
            synchronized (C38029b.class) {
                if (C27991b.f73431O == null) {
                    C27991b.f73431O = C27628bo.m66316k();
                }
            }
        }
        return (C38029b) C27991b.f73431O;
    }

    /* renamed from: c */
    private final C38031d m85048c() {
        return (C38031d) this.f96782b.getValue();
    }

    /* renamed from: d */
    private final C38030c m85049d() {
        return (C38030c) this.f96783c.getValue();
    }

    /* renamed from: a */
    public final void mo77495a(int... iArr) {
        C52711k.m112240b(iArr, "groups");
        int i = 0;
        if (C38056a.m85123a()) {
            int length = iArr.length;
            while (i < length) {
                m85048c().mo75939b(iArr[i]);
                i++;
            }
            return;
        }
        int length2 = iArr.length;
        while (i < length2) {
            m85049d().mo75939b(iArr[i]);
            i++;
        }
    }

    /* renamed from: a */
    public final void mo77489a() {
        if (C38056a.m85123a()) {
            m85048c().mo75938b();
        } else {
            m85049d().mo75938b();
        }
    }

    /* renamed from: a */
    public final int mo77488a(String str) {
        C52711k.m112240b(str, "uid");
        return C36780b.m82772a().mo75929a(str);
    }

    /* renamed from: a */
    public final int mo77487a(int i) {
        if (C38056a.m85123a()) {
            return m85048c().mo75940c(i);
        }
        return m85049d().mo75940c(i);
    }

    /* renamed from: a */
    public final void mo77491a(Message message) {
        C52711k.m112240b(message, "msg");
        if (C38056a.m85123a()) {
            m85048c().mo75934a(message);
        } else {
            m85049d().mo75934a(message);
        }
    }

    /* renamed from: a */
    public final void mo77492a(List<String> list) {
        C52711k.m112240b(list, "uids");
        C36780b.m82772a().mo75930a(list);
    }

    /* renamed from: a */
    public final void mo77493a(boolean z) {
        if (C38056a.m85123a()) {
            m85048c().mo75936a(z);
        } else {
            m85049d().mo75936a(z);
        }
    }

    /* renamed from: a */
    public final void mo77490a(int i, int i2) {
        if (C38056a.m85123a()) {
            m85048c().mo75932a(i, i2);
        } else {
            m85049d().mo75932a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo77494a(boolean z, int i) {
        if (C38056a.m85123a()) {
            m85048c().mo75937a(z, i);
        } else {
            m85049d().mo75937a(z, i);
        }
    }
}
