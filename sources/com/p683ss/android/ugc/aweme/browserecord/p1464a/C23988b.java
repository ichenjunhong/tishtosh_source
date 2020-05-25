package com.p683ss.android.ugc.aweme.browserecord.p1464a;

import com.p683ss.android.ugc.aweme.browserecord.model.C24042a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.a.b */
public final class C23988b implements Serializable {

    /* renamed from: a */
    private final int f63677a;

    /* renamed from: b */
    private final C24042a f63678b;

    /* renamed from: c */
    private final User f63679c;

    public C23988b() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ C23988b copy$default(C23988b bVar, int i, C24042a aVar, User user, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bVar.f63677a;
        }
        if ((i2 & 2) != 0) {
            aVar = bVar.f63678b;
        }
        if ((i2 & 4) != 0) {
            user = bVar.f63679c;
        }
        return bVar.copy(i, aVar, user);
    }

    public final int component1() {
        return this.f63677a;
    }

    public final C24042a component2() {
        return this.f63678b;
    }

    public final User component3() {
        return this.f63679c;
    }

    public final C23988b copy(int i, C24042a aVar, User user) {
        return new C23988b(i, aVar, user);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23988b) {
                C23988b bVar = (C23988b) obj;
                if (!(this.f63677a == bVar.f63677a) || !C52711k.m112239a((Object) this.f63678b, (Object) bVar.f63678b) || !C52711k.m112239a((Object) this.f63679c, (Object) bVar.f63679c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C24042a getMBrowseItem() {
        return this.f63678b;
    }

    public final User getMRecommendUser() {
        return this.f63679c;
    }

    public final int getType() {
        return this.f63677a;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f63677a) * 31;
        C24042a aVar = this.f63678b;
        int i = 0;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        User user = this.f63679c;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseRecordAdapterItem(type=");
        sb.append(this.f63677a);
        sb.append(", mBrowseItem=");
        sb.append(this.f63678b);
        sb.append(", mRecommendUser=");
        sb.append(this.f63679c);
        sb.append(")");
        return sb.toString();
    }

    public C23988b(int i, C24042a aVar, User user) {
        this.f63677a = i;
        this.f63678b = aVar;
        this.f63679c = user;
    }

    public /* synthetic */ C23988b(int i, C24042a aVar, User user, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        if ((i2 & 4) != 0) {
            user = null;
        }
        this(i, aVar, user);
    }
}
