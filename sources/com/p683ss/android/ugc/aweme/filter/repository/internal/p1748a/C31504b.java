package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.b */
public final class C31504b {

    /* renamed from: a */
    public final int f82418a = R.array.a7;

    /* renamed from: b */
    public final int f82419b = R.array.a8;

    /* renamed from: c */
    public final int f82420c = R.array.a9;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31504b) {
                C31504b bVar = (C31504b) obj;
                if (this.f82418a == bVar.f82418a) {
                    if (this.f82419b == bVar.f82419b) {
                        if (this.f82420c == bVar.f82420c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f82418a * 31) + this.f82419b) * 31) + this.f82420c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackupFilterResourceTable(nameArray=");
        sb.append(this.f82418a);
        sb.append(", enNameArray=");
        sb.append(this.f82419b);
        sb.append(", thumbResArray=");
        sb.append(this.f82420c);
        sb.append(")");
        return sb.toString();
    }

    public C31504b(int i, int i2, int i3) {
    }
}
