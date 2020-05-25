package com.p683ss.android.ugc.aweme.common.keyboard;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.keyboard.a */
public class C26911a {

    /* renamed from: d */
    private static final String f70772d = "a";

    /* renamed from: a */
    int f70773a;

    /* renamed from: b */
    int f70774b;

    /* renamed from: c */
    public boolean f70775c;

    /* renamed from: e */
    private List<C26912b> f70776e;

    /* renamed from: b */
    public final void mo54867b(C26912b bVar) {
        if (this.f70776e != null) {
            this.f70776e.remove(bVar);
        }
    }

    /* renamed from: a */
    public final void mo54865a(C26912b bVar) {
        if (this.f70776e == null) {
            this.f70776e = new ArrayList();
        }
        this.f70776e.add(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo54866a(boolean z, int i) {
        if (this.f70776e != null) {
            for (C26912b b : this.f70776e) {
                b.mo51856b(z, i);
            }
        }
    }
}
