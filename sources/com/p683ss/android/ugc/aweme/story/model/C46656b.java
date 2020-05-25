package com.p683ss.android.ugc.aweme.story.model;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse.C42368a;

/* renamed from: com.ss.android.ugc.aweme.story.model.b */
public class C46656b {

    /* renamed from: a */
    public final int f117678a;

    /* renamed from: b */
    public final String f117679b = null;

    /* renamed from: c */
    public final String f117680c = null;

    /* renamed from: d */
    public final Aweme f117681d;

    /* renamed from: e */
    public boolean f117682e;

    /* renamed from: f */
    public String f117683f;

    /* renamed from: g */
    public String[] f117684g;

    /* renamed from: h */
    public C42368a f117685h;

    public String toString() {
        StringBuilder sb = new StringBuilder("state:");
        sb.append(this.f117678a);
        sb.append("  materialId:");
        sb.append(this.f117679b);
        sb.append(" videoPath:");
        sb.append(this.f117680c);
        return sb.toString();
    }

    public C46656b(int i, String str, String str2, Aweme aweme) {
        this.f117678a = i;
        this.f117681d = aweme;
    }
}
