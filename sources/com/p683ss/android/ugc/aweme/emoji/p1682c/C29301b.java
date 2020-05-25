package com.p683ss.android.ugc.aweme.emoji.p1682c;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1693i.C29419g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.b */
public final class C29301b extends C29419g {

    /* renamed from: b */
    public List<C29366a> f76683b;

    /* renamed from: c */
    public static boolean m69097c(int i) {
        return i <= 0;
    }

    /* renamed from: a */
    public final int mo59213a() {
        return R.drawable.y8;
    }

    /* renamed from: h */
    public final boolean mo59222h() {
        return true;
    }

    /* renamed from: i */
    public final int mo59223i() {
        return 4;
    }

    public C29301b() {
        this.f76669a = 1;
    }

    /* renamed from: d */
    public final String mo59218d() {
        return C11010c.m22280a().getString(R.string.ax2);
    }

    /* renamed from: k */
    public final String mo59225k() {
        return String.valueOf(mo59223i());
    }

    /* renamed from: f */
    public final int mo59220f() {
        if (this.f77045c == null || this.f77045c.size() == 0) {
            return 2;
        }
        int size = ((this.f77045c.size() - 1) / 8) + 1;
        if (size < 2) {
            return 2;
        }
        return size;
    }

    /* renamed from: b */
    public final List<C29285a> mo59216b(int i) {
        ArrayList arrayList = new ArrayList(8);
        m69094a(arrayList, i);
        m69096b((List<C29285a>) arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m69095a(List<C29285a> list) {
        if (C9376b.m18558a((Collection<T>) list) || !((C29285a) list.get(0)).mo59210a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m69096b(List<C29285a> list) {
        while (list.size() < 8) {
            list.add(new C29285a());
        }
    }

    /* renamed from: d */
    public final boolean mo59247d(int i) {
        if (!m69097c(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m69094a(List<C29285a> list, int i) {
        if (this.f77045c != null) {
            int min = Math.min(this.f77045c.size(), (i + 1) * 8);
            for (int i2 = i * 8; i2 < min; i2++) {
                C29366a aVar = (C29366a) this.f77045c.get(i2);
                if (aVar != null) {
                    C29285a aVar2 = new C29285a();
                    aVar2.f76667c = C29298a.m69088b(aVar);
                    aVar2.f76668d = aVar;
                    list.add(aVar2);
                } else if (i2 == 8) {
                    C29285a aVar3 = new C29285a();
                    aVar3.f76665a = R.drawable.y7;
                    C29366a aVar4 = new C29366a();
                    aVar4.setStickerType(10);
                    aVar4.setDisplayName(C11010c.m22280a().getString(R.string.axn));
                    aVar3.f76668d = aVar4;
                    list.add(aVar3);
                } else {
                    list.add(new C29285a());
                }
            }
        }
    }
}
