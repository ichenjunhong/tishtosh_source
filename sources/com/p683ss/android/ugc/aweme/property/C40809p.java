package com.p683ss.android.ugc.aweme.property;

import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

@C40808o(mo83138a = "xiaenlong", mo83139b = "查看内测工具", mo83140c = "1设计师自测  2待测试  3测试中 4测试不通过 5测试通过, 多选按照逗号分隔, 比如 1,3,5", mo83141d = "2019/10/15", mo83142e = "https://bytedance.feishu.cn/space/doc/doccnu41nvobXiOyUG7A77ZWXfe")
/* renamed from: com.ss.android.ugc.aweme.property.p */
public final class C40809p implements C40762a {

    /* renamed from: a */
    static final List<C40768af> f103934a = C52575l.m112099b((Object[]) new C40768af[]{m90278a("全部测试状态", f103941h), m90278a("设计师自测", f103936c), m90278a("待测试", f103937d), m90278a("测试中", f103938e), m90278a("测试不通过", f103939f), m90278a("测试通过", f103940g)});

    /* renamed from: b */
    public static final C40809p f103935b = new C40809p();

    /* renamed from: c */
    private static final String f103936c = f103936c;

    /* renamed from: d */
    private static final String f103937d = f103937d;

    /* renamed from: e */
    private static final String f103938e = f103938e;

    /* renamed from: f */
    private static final String f103939f = f103939f;

    /* renamed from: g */
    private static final String f103940g = f103940g;

    /* renamed from: h */
    private static final String f103941h = C52575l.m112120a(C52575l.m112099b((Object[]) new String[]{f103936c, f103937d, f103938e, f103939f, f103940g}), ",", null, null, 0, null, null, 62, null);

    /* renamed from: i */
    private static final C40761aa f103942i = new C40761aa(C35807d.m80935a(C39629l.m88233b(), "combined_pref", 0));

    /* renamed from: com.ss.android.ugc.aweme.property.p$a */
    static final class C40810a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f103943a;

        C40810a(String str) {
            this.f103943a = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C52711k.m112239a((Object) C40809p.f103935b.mo83144a(), (Object) this.f103943a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.p$b */
    static final class C40811b extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f103944a;

        C40811b(String str) {
            this.f103944a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C40809p.f103935b.mo83145a(this.f103944a);
            } else if (C52711k.m112239a((Object) C40809p.f103935b.mo83144a(), (Object) this.f103944a)) {
                C40809p.f103935b.mo83145a("");
            }
            return C52860x.f131107a;
        }
    }

    private C40809p() {
    }

    public final Object defValue() {
        return "1,2,3,4,5";
    }

    public final String key() {
        return "in_house_effect_status";
    }

    public final boolean supportPersist() {
        return true;
    }

    public final C40763b type() {
        return C40763b.String;
    }

    /* renamed from: a */
    public final String mo83144a() {
        return f103942i.mo83071e(this);
    }

    /* renamed from: a */
    public final void mo83145a(String str) {
        f103942i.mo83065a((C40762a) this, str);
    }

    /* renamed from: a */
    private static C40768af m90278a(String str, String str2) {
        return new C40768af(str, new C40810a(str2), new C40811b(str2));
    }
}
