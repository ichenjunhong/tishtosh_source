package com.p683ss.android.ugc.aweme.discover.hitrank;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.a */
public final class C28214a implements Serializable {
    @C17952c(mo34828a = "compeleted_task_cnt")

    /* renamed from: a */
    private int f74074a;
    @C17952c(mo34828a = "total_task_cnt")

    /* renamed from: b */
    private int f74075b;

    public static /* synthetic */ C28214a copy$default(C28214a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aVar.f74074a;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.f74075b;
        }
        return aVar.copy(i, i2);
    }

    public final int component1() {
        return this.f74074a;
    }

    public final int component2() {
        return this.f74075b;
    }

    public final C28214a copy(int i, int i2) {
        return new C28214a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28214a) {
                C28214a aVar = (C28214a) obj;
                if (this.f74074a == aVar.f74074a) {
                    if (this.f74075b == aVar.f74075b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCompeletedTaskCnt() {
        return this.f74074a;
    }

    public final int getTotalTaskCnt() {
        return this.f74075b;
    }

    public final int hashCode() {
        return (this.f74074a * 31) + this.f74075b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HitTaskInfo(compeletedTaskCnt=");
        sb.append(this.f74074a);
        sb.append(", totalTaskCnt=");
        sb.append(this.f74075b);
        sb.append(")");
        return sb.toString();
    }

    public final void setCompeletedTaskCnt(int i) {
        this.f74074a = i;
    }

    public final void setTotalTaskCnt(int i) {
        this.f74075b = i;
    }

    public C28214a(int i, int i2) {
        this.f74074a = i;
        this.f74075b = i2;
    }
}
