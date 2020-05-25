package com.p683ss.android.ugc.aweme.bullet.p1475c;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.C10514d;
import com.bytedance.ies.bullet.kit.web.C10523f;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.C10525h;
import com.bytedance.ies.bullet.kit.web.C10527j;
import com.bytedance.ies.bullet.kit.web.C10530m;
import com.bytedance.ies.bullet.kit.web.p648a.C10487d;
import com.bytedance.ies.bullet.kit.web.p648a.C10490g;
import com.bytedance.ies.bullet.p625a.C10222b;
import com.bytedance.ies.bullet.p625a.C10222b.C10223a;
import com.bytedance.ies.bullet.p628b.p633e.C10291j;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10255a;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10275i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10333d;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10565b;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.aweme.bullet.business.C24252a;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24331b;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24332c;
import com.p683ss.android.ugc.aweme.bullet.module.base.C24337e;
import com.p683ss.android.ugc.aweme.bullet.utils.C24347a;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p2628d.C52847n;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.c.c */
public class C24261c implements C10222b, C10490g {

    /* renamed from: b */
    public static final C24262a f64381b = new C24262a(null);

    /* renamed from: com.ss.android.ugc.aweme.bullet.c.c$a */
    public static final class C24262a {
        private C24262a() {
        }

        public /* synthetic */ C24262a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.c.c$b */
    public static final class C24263b implements C10525h {

        /* renamed from: a */
        final /* synthetic */ C24331b f64382a;

        /* renamed from: b */
        final /* synthetic */ C24261c f64383b;

        /* renamed from: c */
        final /* synthetic */ C10326b f64384c;

        /* renamed from: a */
        public final C10291j mo18251a(C10326b bVar) {
            C52711k.m112240b(bVar, "providerFactory");
            return null;
        }

        /* renamed from: c */
        public final C10514d mo18597c() {
            return new C10514d(this) {

                /* renamed from: a */
                final /* synthetic */ C24263b f64385a;

                {
                    this.f64385a = r1;
                }

                /* renamed from: a */
                public final Map<String, Object> mo18655a(C10524g gVar) {
                    C52711k.m112240b(gVar, "kitContainerApi");
                    ShareBusiness shareBusiness = (ShareBusiness) this.f64385a.f64382a.f64561y.mo50011a(ShareBusiness.class);
                    if (shareBusiness != null) {
                        return C52550ab.m112042a(new C52847n("local_obj", shareBusiness.f64305h));
                    }
                    return C52550ab.m112045a();
                }
            };
        }

        /* renamed from: a */
        public final C10530m mo18595a() {
            return this.f64383b.mo50025a(this.f64384c, this.f64382a.f64561y, this.f64382a.mo49858d());
        }

        /* renamed from: b */
        public final C10523f mo18596b() {
            C10326b bVar = this.f64384c;
            C24254b bVar2 = this.f64382a.f64561y;
            C10523f c = this.f64382a.mo49857c();
            C52711k.m112240b(bVar, "ctx");
            C52711k.m112240b(bVar2, "biz");
            return new C24332c(bVar, bVar2, c);
        }

        C24263b(C24331b bVar, C24261c cVar, C10326b bVar2) {
            this.f64382a = bVar;
            this.f64383b = cVar;
            this.f64384c = bVar2;
        }
    }

    /* renamed from: a */
    public final List<C10275i> mo18254a(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C10223a.m20697a(this, bVar);
    }

    /* renamed from: c */
    public final C10333d<C10255a> mo18256c(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C10223a.m20698b(this, bVar);
    }

    /* renamed from: e */
    public List<C10423r> mo18258e(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return C10223a.m20699c(this, bVar);
    }

    /* renamed from: d */
    public C10565b mo18257d(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        return new C24331b(bVar, new C24252a());
    }

    /* renamed from: h */
    public C10527j mo18616h(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(bVar, "providerFactory");
        return new C10487d();
    }

    /* renamed from: i */
    public final C10525h mo18617i(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        Object c = bVar.mo18401c(C10565b.class);
        if (!(c instanceof C24331b)) {
            c = null;
        }
        C24331b bVar2 = (C24331b) c;
        if (bVar2 != null) {
            return new C24263b(bVar2, this, bVar);
        }
        return null;
    }

    /* renamed from: b */
    public List<C10268e> mo18255b(C10326b bVar) {
        Iterator it;
        C52711k.m112240b(bVar, "providerFactory");
        List<C10268e> arrayList = new ArrayList<>();
        C10757a aVar = (C10757a) bVar.mo18401c(C10757a.class);
        Context context = (Context) bVar.mo18401c(Context.class);
        if (aVar == null || context == null) {
            return arrayList;
        }
        Map buildJavaMethods = DEFAULT.provideWalletService_Monster().buildJavaMethods(new WeakReference(context), aVar);
        if (buildJavaMethods != null) {
            Set entrySet = buildJavaMethods.entrySet();
            if (entrySet != null) {
                it = entrySet.iterator();
                while (it != null && it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    C24347a aVar2 = C24347a.f64655a;
                    Object key = entry.getKey();
                    C52711k.m112236a(key, "entry.key");
                    String str = (String) key;
                    Object value = entry.getValue();
                    C52711k.m112236a(value, "entry.value");
                    arrayList.add(C24347a.m59706a(bVar, str, (C10762d) value, C10269a.PRIVATE));
                }
                return arrayList;
            }
        }
        it = null;
        while (it != null) {
            Entry entry2 = (Entry) it.next();
            C24347a aVar22 = C24347a.f64655a;
            Object key2 = entry2.getKey();
            C52711k.m112236a(key2, "entry.key");
            String str2 = (String) key2;
            Object value2 = entry2.getValue();
            C52711k.m112236a(value2, "entry.value");
            arrayList.add(C24347a.m59706a(bVar, str2, (C10762d) value2, C10269a.PRIVATE));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10530m mo50025a(C10326b bVar, C24254b bVar2, C10530m mVar) {
        C52711k.m112240b(bVar, "ctx");
        C52711k.m112240b(bVar2, "biz");
        return new C24337e(bVar, bVar2, mVar);
    }
}
