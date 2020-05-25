package com.p683ss.android.ugc.aweme.feedback.runtime.behavior;

import android.text.TextUtils;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31304a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31305b;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31307c;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31309d;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31310e;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31330g;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31333h;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31336i;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31340k;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31341l;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import com.p683ss.android.ugc.aweme.runtime.behavior.C41319c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c */
public final class C31300c implements C31296a {

    /* renamed from: a */
    public static C31300c f82052a = C31302b.f82055a;

    /* renamed from: b */
    public static final List<C31304a> f82053b = C52575l.m112099b((Object[]) new C31304a[]{new C31307c(), new C31341l(), new C31340k(), new C31305b(), new C31309d(), new C31310e(), new C31330g(), new C31333h(), new C31336i()});

    /* renamed from: c */
    public static final C31301a f82054c = new C31301a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c$a */
    public static final class C31301a {
        private C31301a() {
        }

        /* renamed from: a */
        public static C31300c m73024a() {
            return C31300c.f82052a;
        }

        public /* synthetic */ C31301a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c$b */
    static final class C31302b {

        /* renamed from: a */
        static final C31300c f82055a = new C31300c(null);

        /* renamed from: b */
        public static final C31302b f82056b = new C31302b();

        private C31302b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.c$c */
    static final class C31303c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31300c f82057a;

        /* renamed from: b */
        final /* synthetic */ String f82058b;

        /* renamed from: c */
        final /* synthetic */ String f82059c;

        /* renamed from: d */
        final /* synthetic */ long f82060d;

        /* renamed from: e */
        final /* synthetic */ C31304a f82061e;

        C31303c(C31300c cVar, String str, String str2, long j, C31304a aVar) {
            this.f82057a = cVar;
            this.f82058b = str;
            this.f82059c = str2;
            this.f82060d = j;
            this.f82061e = aVar;
        }

        public final /* synthetic */ Object call() {
            C31300c cVar = this.f82057a;
            C41319c cVar2 = new C41319c(this.f82058b, this.f82060d, this.f82059c);
            C31297b a = C31300c.m73016a();
            C52711k.m112240b(cVar2, "entity");
            a.f82049a.mo83872g().mo83874a(cVar2);
            C31300c cVar3 = this.f82057a;
            String str = this.f82058b;
            long b = this.f82060d - this.f82061e.mo64211b();
            C31297b a2 = C31300c.m73016a();
            C52711k.m112240b(str, "type");
            a2.f82049a.mo83872g().mo83875b(str, b);
            return C52860x.f131107a;
        }
    }

    private C31300c() {
    }

    /* renamed from: a */
    static C31297b m73016a() {
        return C31297b.f82047b;
    }

    /* renamed from: d */
    public static C31296a m73020d() {
        if (C27991b.f73432P == null) {
            synchronized (C31296a.class) {
                if (C27991b.f73432P == null) {
                    C27991b.f73432P = C27613b.m66293f();
                }
            }
        }
        return (C31296a) C27991b.f73432P;
    }

    /* renamed from: c */
    public static boolean m73019c() {
        Boolean bool;
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            bool = b.getFeedbackRecordEnable();
            C52711k.m112236a((Object) bool, "SettingsReader.get().feedbackRecordEnable");
        } catch (Exception unused) {
            bool = Boolean.valueOf(false);
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    public static Map<String, String> m73018b() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (C31304a aVar : f82053b) {
            String c = aVar.mo64212c();
            if (!TextUtils.isEmpty(c)) {
                linkedHashMap.put(aVar.mo64209a(), c);
            }
        }
        StringBuilder sb = new StringBuilder("RuntimeBehaviorManager loadResultSize:");
        sb.append(linkedHashMap.size());
        C45407ay.m98968a(sb.toString());
        return linkedHashMap;
    }

    public /* synthetic */ C31300c(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo64182a(String str) {
        C52711k.m112240b(str, "type");
        mo64183a(str, "");
    }

    /* renamed from: b */
    private static C31304a m73017b(String str) {
        for (C31304a aVar : f82053b) {
            if (aVar.mo64210a(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<C41319c> mo64184a(String str, long j) {
        C52711k.m112240b(str, "type");
        C31297b a = m73016a();
        C52711k.m112240b(str, "type");
        return a.f82049a.mo83872g().mo83873a(str, j);
    }

    /* renamed from: a */
    public final void mo64183a(String str, String str2) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(str2, "msg");
        if (m73019c()) {
            long currentTimeMillis = System.currentTimeMillis();
            C31304a b = m73017b(str);
            if (b != null) {
                C31303c cVar = new C31303c(this, str, str2, currentTimeMillis, b);
                C0013i.m18a((Callable<TResult>) cVar, (Executor) C0013i.f24a);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" 是不支持的运行时动作上报类型，请检查你的代码或联系 zhaoxuan.li");
            throw new Exception(sb.toString());
        }
    }
}
