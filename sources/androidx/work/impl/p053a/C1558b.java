package androidx.work.impl.p053a;

import com.C2240a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: androidx.work.impl.a.b */
public final class C1558b {

    /* renamed from: a */
    public boolean f5554a;

    /* renamed from: b */
    public boolean f5555b;

    /* renamed from: c */
    public boolean f5556c;

    /* renamed from: d */
    public boolean f5557d;

    public final int hashCode() {
        int i;
        if (this.f5554a) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f5555b) {
            i += 16;
        }
        if (this.f5556c) {
            i += UnReadVideoExperiment.BROWSE_RECORD_LIST;
        }
        if (this.f5557d) {
            return i + 4096;
        }
        return i;
    }

    public final String toString() {
        return C2240a.m6772a("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f5554a), Boolean.valueOf(this.f5555b), Boolean.valueOf(this.f5556c), Boolean.valueOf(this.f5557d)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1558b bVar = (C1558b) obj;
        if (this.f5554a == bVar.f5554a && this.f5555b == bVar.f5555b && this.f5556c == bVar.f5556c && this.f5557d == bVar.f5557d) {
            return true;
        }
        return false;
    }

    public C1558b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5554a = z;
        this.f5555b = z2;
        this.f5556c = z3;
        this.f5557d = z4;
    }
}
