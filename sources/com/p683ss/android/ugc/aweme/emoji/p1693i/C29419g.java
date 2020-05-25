package com.p683ss.android.ugc.aweme.emoji.p1693i;

import android.graphics.drawable.Drawable;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29358c;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29286b;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.g */
public class C29419g extends C29286b {

    /* renamed from: c */
    public List<C29366a> f77045c;

    /* renamed from: d */
    public C29358c f77046d;

    /* renamed from: a */
    public int mo59213a() {
        return R.drawable.y_;
    }

    /* renamed from: i */
    public int mo59223i() {
        return 2;
    }

    /* renamed from: b */
    public final String mo59215b() {
        return this.f77046d.getIconUrl();
    }

    /* renamed from: c */
    public final Drawable mo59217c() {
        return super.mo59217c();
    }

    /* renamed from: d */
    public String mo59218d() {
        return this.f77046d.getDisplayName();
    }

    /* renamed from: g */
    public final int mo59221g() {
        if (mo59222h()) {
            return 8;
        }
        return 1;
    }

    /* renamed from: h */
    public boolean mo59222h() {
        if (this.f77045c == null || this.f77045c.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final int mo59224j() {
        if (this.f77045c == null) {
            return 0;
        }
        return this.f77045c.size();
    }

    /* renamed from: f */
    public int mo59220f() {
        if (!mo59222h()) {
            return 1;
        }
        return ((this.f77045c.size() - 1) / 8) + 1;
    }

    /* renamed from: k */
    public String mo59225k() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo59223i());
        sb.append("-");
        sb.append(this.f77046d.getId());
        return sb.toString();
    }

    /* renamed from: l */
    public final List<C29285a> mo59226l() {
        C29366a aVar;
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < this.f77045c.size(); i++) {
            C29285a aVar2 = new C29285a();
            if (i < 0 || i >= this.f77045c.size()) {
                aVar = null;
            } else {
                aVar = (C29366a) this.f77045c.get(i);
            }
            if (aVar != null) {
                aVar2.f76667c = C29298a.m69088b(aVar);
                aVar2.f76668d = aVar;
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<C29285a> mo59216b(int i) {
        C29366a aVar;
        ArrayList arrayList = new ArrayList(8);
        for (int i2 = i * 8; i2 < (i + 1) * 8; i2++) {
            C29285a aVar2 = new C29285a();
            if (i2 < 0 || i2 >= this.f77045c.size()) {
                aVar = null;
            } else {
                aVar = (C29366a) this.f77045c.get(i2);
            }
            if (aVar != null) {
                aVar2.f76667c = C29298a.m69088b(aVar);
                aVar2.f76668d = aVar;
            }
            arrayList.add(aVar2);
        }
        return arrayList;
    }
}
