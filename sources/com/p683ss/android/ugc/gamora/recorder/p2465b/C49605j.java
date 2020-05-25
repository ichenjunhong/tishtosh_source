package com.p683ss.android.ugc.gamora.recorder.p2465b;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.j */
public interface C49605j {

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.j$a */
    public static final class C49606a {

        /* renamed from: a */
        public boolean f124438a = true;

        /* renamed from: b */
        public final boolean f124439b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C49606a) {
                    if (this.f124439b == ((C49606a) obj).f124439b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f124439b;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtraInfo(isInitial=");
            sb.append(this.f124439b);
            sb.append(")");
            return sb.toString();
        }

        public C49606a(boolean z) {
            this.f124439b = z;
        }
    }

    /* renamed from: a */
    boolean mo49419a(C49579d dVar, C49606a aVar);

    /* renamed from: b */
    boolean mo49420b(C49579d dVar, C49606a aVar);
}
