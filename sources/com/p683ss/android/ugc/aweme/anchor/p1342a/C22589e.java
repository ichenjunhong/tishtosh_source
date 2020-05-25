package com.p683ss.android.ugc.aweme.anchor.p1342a;

import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.C22598a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b.C22616a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b.C22619b;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b.C22621c;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b.C22624d;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1347b.C22628e;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53036d;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.a.e */
public abstract class C22589e {

    /* renamed from: b */
    public static final C22590a f60728b = new C22590a(null);

    /* renamed from: a */
    public final C22678i f60729a;

    /* renamed from: com.ss.android.ugc.aweme.anchor.a.e$a */
    public static final class C22590a {
        private C22590a() {
        }

        public /* synthetic */ C22590a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.a.e$b */
    static final class C22591b<T> implements C53036d<C22598a> {

        /* renamed from: a */
        public static final C22591b f60730a = new C22591b();

        C22591b() {
        }

        /* renamed from: a */
        public final /* synthetic */ int mo14402a(Object obj) {
            boolean z;
            C22598a aVar = (C22598a) obj;
            C52711k.m112240b(aVar, "module");
            Integer num = aVar.f60747a;
            boolean z2 = false;
            boolean z3 = true;
            if (num != null && num.intValue() == 1) {
                Collection collection = aVar.f60751e;
                if (collection == null || collection.isEmpty()) {
                    z2 = true;
                }
                if (z2) {
                    return 1;
                }
                return 2;
            }
            Integer num2 = aVar.f60747a;
            if (num2 != null && num2.intValue() == 2) {
                Collection collection2 = aVar.f60751e;
                if (collection2 == null || collection2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return 3;
                }
            }
            Integer num3 = aVar.f60747a;
            if (num3 != null && num3.intValue() == 3) {
                Collection collection3 = aVar.f60751e;
                if (collection3 != null && !collection3.isEmpty()) {
                    z3 = false;
                }
                if (!z3) {
                    return 4;
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public abstract void mo46975a(C53037e eVar, C22678i iVar, String str);

    /* renamed from: a */
    public final C53037e mo46976a() {
        C53037e eVar = new C53037e();
        C52711k.m112240b(eVar, "adapter");
        eVar.mo110579a(C22598a.class).mo110586a(new C22619b(this.f60729a), new C22621c(this.f60729a), new C22628e(this.f60729a), new C22624d(this.f60729a), new C22616a(this.f60729a)).mo110587a(C22591b.f60730a);
        mo46975a(eVar, this.f60729a, "enter_page");
        return eVar;
    }

    public C22589e(C22678i iVar) {
        this.f60729a = iVar;
    }
}
