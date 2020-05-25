package com.facebook.messenger;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.messenger.b */
public final class C14531b {

    /* renamed from: a */
    public static final Set<String> f37742a;

    /* renamed from: b */
    public static final Set<String> f37743b;

    /* renamed from: c */
    public static final Set<String> f37744c;

    /* renamed from: d */
    public final Uri f37745d;

    /* renamed from: e */
    public final String f37746e;

    /* renamed from: f */
    public final String f37747f;

    /* renamed from: g */
    public final Uri f37748g;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("image/*");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/gif");
        hashSet.add("image/webp");
        hashSet.add("video/*");
        hashSet.add("video/mp4");
        hashSet.add("audio/*");
        hashSet.add("audio/mpeg");
        f37743b = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(C42311c.f106865i);
        hashSet2.add("android.resource");
        hashSet2.add("file");
        f37742a = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(WebKitApi.SCHEME_HTTP);
        hashSet3.add(WebKitApi.SCHEME_HTTPS);
        f37744c = Collections.unmodifiableSet(hashSet3);
    }

    C14531b(C14532c cVar) {
        this.f37745d = cVar.f37749a;
        this.f37746e = cVar.f37750b;
        this.f37747f = cVar.f37751c;
        this.f37748g = cVar.f37752d;
        if (this.f37745d == null) {
            throw new NullPointerException("Must provide non-null uri");
        } else if (this.f37746e == null) {
            throw new NullPointerException("Must provide mimeType");
        } else if (!f37742a.contains(this.f37745d.getScheme())) {
            StringBuilder sb = new StringBuilder("Unsupported URI scheme: ");
            sb.append(this.f37745d.getScheme());
            throw new IllegalArgumentException(sb.toString());
        } else if (!f37743b.contains(this.f37746e)) {
            StringBuilder sb2 = new StringBuilder("Unsupported mime-type: ");
            sb2.append(this.f37746e);
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.f37748g != null && !f37744c.contains(this.f37748g.getScheme())) {
            StringBuilder sb3 = new StringBuilder("Unsupported external uri scheme: ");
            sb3.append(this.f37748g.getScheme());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static C14532c m29758a(Uri uri, String str) {
        return new C14532c(uri, str);
    }
}
