package com.p683ss.android.ugc.aweme.emoji.p1688g;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29419g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.g.l */
public final class C29381l extends C29419g {
    /* renamed from: a */
    public final int mo59213a() {
        return R.drawable.y9;
    }

    /* renamed from: h */
    public final boolean mo59222h() {
        return true;
    }

    /* renamed from: i */
    public final int mo59223i() {
        return 3;
    }

    /* renamed from: d */
    public final String mo59218d() {
        return C11010c.m22280a().getString(R.string.ax4);
    }

    /* renamed from: k */
    public final String mo59225k() {
        return String.valueOf(mo59223i());
    }

    /* renamed from: f */
    public final int mo59220f() {
        if (this.f77045c == null || this.f77045c.size() == 0) {
            return 1;
        }
        return ((this.f77045c.size() - 1) / 8) + 1;
    }

    /* renamed from: b */
    public final List<C29285a> mo59216b(int i) {
        ArrayList arrayList = new ArrayList(8);
        m69268a(arrayList, i);
        m69267a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m69267a(List<C29285a> list) {
        while (list.size() < 8) {
            list.add(new C29285a());
        }
    }

    /* renamed from: a */
    private void m69268a(List<C29285a> list, int i) {
        if (this.f77045c != null) {
            int min = Math.min(this.f77045c.size(), (i + 1) * 8);
            for (int i2 = i * 8; i2 < min; i2++) {
                C29366a aVar = (C29366a) this.f77045c.get(i2);
                C29285a aVar2 = new C29285a();
                if (aVar == null) {
                    C29366a aVar3 = new C29366a();
                    aVar3.setStickerType(2);
                    aVar2.f76668d = aVar3;
                    aVar2.f76665a = R.drawable.xz;
                    aVar2.f76667c = C11010c.m22280a().getString(R.string.ax4);
                } else {
                    aVar2.f76667c = C29298a.m69088b(aVar);
                    aVar2.f76668d = aVar;
                }
                list.add(aVar2);
            }
        }
    }
}
