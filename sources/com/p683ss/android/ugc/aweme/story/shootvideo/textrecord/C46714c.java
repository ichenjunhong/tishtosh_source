package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.c */
public class C46714c {

    /* renamed from: c */
    private static C46714c f117841c;

    /* renamed from: a */
    public List<C46713b> f117842a = new ArrayList();

    /* renamed from: b */
    public int f117843b;

    /* renamed from: a */
    public static C46714c m101387a() {
        if (f117841c == null) {
            synchronized (C46714c.class) {
                if (f117841c == null) {
                    f117841c = new C46714c();
                }
            }
        }
        return f117841c;
    }

    /* renamed from: b */
    public final C46713b mo93786b() {
        if (this.f117843b == this.f117842a.size()) {
            this.f117843b = 0;
        }
        return (C46713b) this.f117842a.get(this.f117843b);
    }

    private C46714c() {
        this.f117842a.add(new C46713b(new int[]{-16716612, -16745761}, -1, -1056964609));
        this.f117842a.add(new C46713b(new int[]{-20071, -55717}, -1, -1056964609));
        this.f117842a.add(new C46713b(new int[]{-14625300, -5938690, -119723}, -1, -1056964609));
        this.f117842a.add(new C46713b(new int[]{-468142, -42147}, -1, -1056964609));
        this.f117842a.add(new C46713b(new int[]{-16352892, -15726275}, -1, -1056964609));
        this.f117842a.add(new C46713b(new int[]{-1773591, -7100977}, -16777216, 1442840576));
        this.f117842a.add(new C46713b(new int[]{-12369085, -16777216}, -1, -1056964609));
    }
}
