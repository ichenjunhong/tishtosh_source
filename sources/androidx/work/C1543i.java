package androidx.work;

import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.i */
public final class C1543i {

    /* renamed from: a */
    public UUID f5539a;

    /* renamed from: b */
    public C1544a f5540b;

    /* renamed from: c */
    public C1538e f5541c;

    /* renamed from: d */
    public Set<String> f5542d;

    /* renamed from: androidx.work.i$a */
    public enum C1544a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f5539a != null) {
            i = this.f5539a.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (this.f5540b != null) {
            i2 = this.f5540b.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.f5541c != null) {
            i3 = this.f5541c.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        if (this.f5542d != null) {
            i4 = this.f5542d.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{mId='");
        sb.append(this.f5539a);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.f5540b);
        sb.append(", mOutputData=");
        sb.append(this.f5541c);
        sb.append(", mTags=");
        sb.append(this.f5542d);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1543i iVar = (C1543i) obj;
        if (this.f5539a == null ? iVar.f5539a != null : !this.f5539a.equals(iVar.f5539a)) {
            return false;
        }
        if (this.f5540b != iVar.f5540b) {
            return false;
        }
        if (this.f5541c == null ? iVar.f5541c != null : !this.f5541c.equals(iVar.f5541c)) {
            return false;
        }
        if (this.f5542d != null) {
            return this.f5542d.equals(iVar.f5542d);
        }
        if (iVar.f5542d == null) {
            return true;
        }
        return false;
    }
}
