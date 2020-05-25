package com.p683ss.android.ugc.aweme.feed.api;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.api.h */
public final class C30150h implements Serializable {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    private final int f78690a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    private final String f78691b;
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: c */
    private final List<Aweme> f78692c;
    @C17952c(mo34828a = "next_cursor")

    /* renamed from: d */
    private final int f78693d;
    @C17952c(mo34828a = "has_more")

    /* renamed from: e */
    private final boolean f78694e;

    public C30150h() {
        this(0, null, null, 0, false, 31, null);
    }

    public final List<Aweme> getAwemeList() {
        return this.f78692c;
    }

    public final int getCode() {
        return this.f78690a;
    }

    public final boolean getHasMore() {
        return this.f78694e;
    }

    public final String getMsg() {
        return this.f78691b;
    }

    public final int getNextCursor() {
        return this.f78693d;
    }

    public C30150h(int i, String str, List<Aweme> list, int i2, boolean z) {
        C52711k.m112240b(str, "msg");
        C52711k.m112240b(list, "awemeList");
        this.f78690a = i;
        this.f78691b = str;
        this.f78692c = list;
        this.f78693d = i2;
        this.f78694e = z;
    }

    public /* synthetic */ C30150h(int i, String str, List list, int i2, boolean z, int i3, C52707g gVar) {
        int i4;
        boolean z2;
        int i5 = 0;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            list = new ArrayList();
        }
        List list2 = list;
        if ((i3 & 8) == 0) {
            i5 = i2;
        }
        if ((i3 & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        this(i4, str2, list2, i5, z2);
    }
}
