package com.bytedance.android.live.core.p230g;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.live.core.g.q */
public final class C3907q {

    /* renamed from: d */
    private static C3907q f10923d = new C3907q();

    /* renamed from: a */
    ExecutorService f10924a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());

    /* renamed from: b */
    public List<String> f10925b = new LinkedList();

    /* renamed from: c */
    public final Object f10926c = new Object();

    /* renamed from: a */
    public static C3907q m9871a() {
        return f10923d;
    }

    private C3907q() {
    }

    /* renamed from: a */
    public final boolean mo9268a(ImageModel imageModel) {
        if (imageModel == null || C9414h.m18630a(imageModel.getUrls())) {
            return false;
        }
        synchronized (this.f10926c) {
            for (String contains : imageModel.getUrls()) {
                if (this.f10925b.contains(contains)) {
                    return true;
                }
            }
            return false;
        }
    }
}
