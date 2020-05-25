package com.p683ss.android.ugc.aweme.emoji.p1680a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;

/* renamed from: com.ss.android.ugc.aweme.emoji.a.a */
public final class C29285a {

    /* renamed from: a */
    public int f76665a;

    /* renamed from: b */
    public String f76666b;

    /* renamed from: c */
    public String f76667c;

    /* renamed from: d */
    public C29366a f76668d;

    /* renamed from: a */
    public final boolean mo59210a() {
        if (this.f76668d != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29285a)) {
            return false;
        }
        C29285a aVar = (C29285a) obj;
        if (((aVar.f76665a > 0 || !TextUtils.isEmpty(aVar.f76666b)) && aVar.f76665a == this.f76665a && TextUtils.equals(aVar.f76666b, this.f76666b) && TextUtils.equals(aVar.f76667c, this.f76667c)) || (aVar.f76668d != null && aVar.f76668d.equals(this.f76668d))) {
            return true;
        }
        return false;
    }
}
