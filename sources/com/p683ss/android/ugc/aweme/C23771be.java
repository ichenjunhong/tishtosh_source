package com.p683ss.android.ugc.aweme;

import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.be */
public interface C23771be {

    /* renamed from: com.ss.android.ugc.aweme.be$a */
    public static final class C23772a {

        /* renamed from: e */
        public static final C23774b f63359e = new C23774b(null);

        /* renamed from: a */
        public final List<String> f63360a;

        /* renamed from: b */
        public final String f63361b;

        /* renamed from: c */
        public final boolean f63362c;

        /* renamed from: d */
        public final C23773a f63363d;

        /* renamed from: com.ss.android.ugc.aweme.be$a$a */
        public interface C23773a {
        }

        /* renamed from: com.ss.android.ugc.aweme.be$a$b */
        public static final class C23774b {
            private C23774b() {
            }

            public /* synthetic */ C23774b(C52707g gVar) {
                this();
            }
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C23772a) {
                    C23772a aVar = (C23772a) obj;
                    if (C52711k.m112239a((Object) this.f63360a, (Object) aVar.f63360a) && C52711k.m112239a((Object) this.f63361b, (Object) aVar.f63361b)) {
                        if (!(this.f63362c == aVar.f63362c) || !C52711k.m112239a((Object) this.f63363d, (Object) aVar.f63363d)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            List<String> list = this.f63360a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f63361b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f63362c;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            C23773a aVar = this.f63363d;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthorizeVcdParam(scopes=");
            sb.append(this.f63360a);
            sb.append(", secondaryUid=");
            sb.append(this.f63361b);
            sb.append(", stopVcdV1=");
            sb.append(this.f63362c);
            sb.append(", callback=");
            sb.append(this.f63363d);
            sb.append(")");
            return sb.toString();
        }
    }
}
