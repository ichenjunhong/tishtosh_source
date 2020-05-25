package com.p683ss.android.ugc.aweme.comment.p1526k;

import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.k.o */
public final class C25244o {

    /* renamed from: a */
    public C25246b f66850a;

    /* renamed from: b */
    public C1690c f66851b;

    /* renamed from: com.ss.android.ugc.aweme.comment.k.o$a */
    public interface C25245a {
        /* renamed from: a */
        void mo51129a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.k.o$b */
    public interface C25246b {
        /* renamed from: a */
        void mo51529a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.k.o$c */
    public static final class C25247c<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C25244o f66852a;

        public C25247c(C25244o oVar) {
            this.f66852a = oVar;
        }

        public final void subscribe(final C2204x<String> xVar) {
            C52711k.m112240b(xVar, "it");
            this.f66852a.f66850a = new C25246b() {
                /* renamed from: a */
                public final void mo51529a(String str) {
                    C52711k.m112240b(str, "msg");
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "it");
                    if (!xVar.isDisposed()) {
                        xVar.mo6282a(str);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.k.o$d */
    public static final class C25249d<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ C25245a f66854a;

        public C25249d(C25245a aVar) {
            this.f66854a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C25245a aVar = this.f66854a;
            C52711k.m112236a((Object) str, "p0");
            aVar.mo51129a(str);
        }
    }
}
