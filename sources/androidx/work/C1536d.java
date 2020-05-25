package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
public final class C1536d {

    /* renamed from: a */
    public final Set<C1537a> f5531a = new HashSet();

    /* renamed from: androidx.work.d$a */
    public static final class C1537a {

        /* renamed from: a */
        public final Uri f5532a;

        /* renamed from: b */
        public final boolean f5533b;

        public final int hashCode() {
            return (this.f5532a.hashCode() * 31) + (this.f5533b ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1537a aVar = (C1537a) obj;
            if (this.f5533b != aVar.f5533b || !this.f5532a.equals(aVar.f5532a)) {
                return false;
            }
            return true;
        }

        public C1537a(Uri uri, boolean z) {
            this.f5532a = uri;
            this.f5533b = z;
        }
    }

    /* renamed from: a */
    public final int mo5915a() {
        return this.f5531a.size();
    }

    public final int hashCode() {
        return this.f5531a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5531a.equals(((C1536d) obj).f5531a);
    }
}
