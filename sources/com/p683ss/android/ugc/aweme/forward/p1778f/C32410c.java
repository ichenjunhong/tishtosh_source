package com.p683ss.android.ugc.aweme.forward.p1778f;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.video.C48021h;

/* renamed from: com.ss.android.ugc.aweme.forward.f.c */
public final class C32410c {

    /* renamed from: a */
    public String f84341a;

    /* renamed from: b */
    public Aweme f84342b;

    /* renamed from: c */
    public C48021h f84343c;

    public final int hashCode() {
        return this.f84341a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardShareInfo{mShareId='");
        sb.append(this.f84341a);
        sb.append('\'');
        sb.append(", mAweme=");
        sb.append(this.f84342b);
        sb.append(", mPlayerManager=");
        sb.append(this.f84343c);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof C32410c) && TextUtils.equals(this.f84341a, ((C32410c) obj).f84341a))) {
            return true;
        }
        return false;
    }

    public C32410c(String str, Aweme aweme, C48021h hVar) {
        this.f84341a = str;
        this.f84342b = aweme;
        this.f84343c = hVar;
    }
}
