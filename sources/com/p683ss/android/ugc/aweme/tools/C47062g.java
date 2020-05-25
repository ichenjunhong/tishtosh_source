package com.p683ss.android.ugc.aweme.tools;

import com.p683ss.android.ugc.aweme.shortvideo.C42482c;

/* renamed from: com.ss.android.ugc.aweme.tools.g */
public final class C47062g extends C46933c {

    /* renamed from: a */
    public C42482c f118843a;

    /* renamed from: b */
    public String f118844b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicResultEvent{music=");
        sb.append(this.f118843a);
        sb.append(", localPath='");
        sb.append(this.f118844b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public C47062g(C42482c cVar, String str) {
        this.f118843a = cVar;
        this.f118844b = str;
    }
}
