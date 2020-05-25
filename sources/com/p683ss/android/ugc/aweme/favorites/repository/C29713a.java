package com.p683ss.android.ugc.aweme.favorites.repository;

/* renamed from: com.ss.android.ugc.aweme.favorites.repository.a */
public final class C29713a {

    /* renamed from: a */
    public final int f77627a;

    /* renamed from: b */
    public final int f77628b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29713a) {
                C29713a aVar = (C29713a) obj;
                if (this.f77627a == aVar.f77627a) {
                    if (this.f77628b == aVar.f77628b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f77627a * 31) + this.f77628b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectListRequestParams(cursor=");
        sb.append(this.f77627a);
        sb.append(", count=");
        sb.append(this.f77628b);
        sb.append(")");
        return sb.toString();
    }

    public C29713a(int i, int i2) {
        this.f77627a = i;
        this.f77628b = i2;
    }
}
