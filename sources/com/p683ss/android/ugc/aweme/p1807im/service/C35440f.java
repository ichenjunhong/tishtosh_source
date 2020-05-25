package com.p683ss.android.ugc.aweme.p1807im.service;

import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.service.f */
public interface C35440f {

    /* renamed from: com.ss.android.ugc.aweme.im.service.f$a */
    public interface C35441a {
        /* renamed from: a */
        void mo55878a(C35443c cVar);

        /* renamed from: b */
        void mo55880b(C35443c cVar);

        /* renamed from: c */
        void mo55881c(C35443c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.f$b */
    public static final class C35442b {

        /* renamed from: a */
        public final String f91107a;

        /* renamed from: b */
        public final long f91108b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C35442b) {
                    C35442b bVar = (C35442b) obj;
                    if (C52711k.m112239a((Object) this.f91107a, (Object) bVar.f91107a)) {
                        if (this.f91108b == bVar.f91108b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f91107a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.f91108b;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IMAweme(aid=");
            sb.append(this.f91107a);
            sb.append(", index=");
            sb.append(this.f91108b);
            sb.append(")");
            return sb.toString();
        }

        public C35442b(String str, long j) {
            C52711k.m112240b(str, "aid");
            this.f91107a = str;
            this.f91108b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.f$c */
    public static final class C35443c {

        /* renamed from: a */
        public final List<C35442b> f91109a;

        /* renamed from: b */
        public final boolean f91110b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C35443c) {
                    C35443c cVar = (C35443c) obj;
                    if (C52711k.m112239a((Object) this.f91109a, (Object) cVar.f91109a)) {
                        if (this.f91110b == cVar.f91110b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            List<C35442b> list = this.f91109a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f91110b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IMResponse(data=");
            sb.append(this.f91109a);
            sb.append(", hasMore=");
            sb.append(this.f91110b);
            sb.append(")");
            return sb.toString();
        }

        public C35443c(List<C35442b> list, boolean z) {
            C52711k.m112240b(list, "data");
            this.f91109a = list;
            this.f91110b = z;
        }
    }

    /* renamed from: a */
    void mo71167a();

    /* renamed from: a */
    void mo71168a(long j);

    /* renamed from: a */
    void mo71169a(C35441a aVar);

    /* renamed from: a */
    void mo71170a(String str);

    /* renamed from: b */
    C35443c mo71171b(boolean z);

    /* renamed from: b */
    void mo71172b();

    /* renamed from: b */
    void mo71173b(long j);
}
