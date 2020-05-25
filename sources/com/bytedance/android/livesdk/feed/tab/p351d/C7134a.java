package com.bytedance.android.livesdk.feed.tab.p351d;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.C7033o;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import com.bytedance.android.livesdk.feed.viewmodel.FeedTabViewModel;

/* renamed from: com.bytedance.android.livesdk.feed.tab.d.a */
public final class C7134a implements C0212b {

    /* renamed from: a */
    private C7023m f19362a;

    /* renamed from: b */
    private C7033o<C6945f> f19363b;

    /* renamed from: c */
    private C6951a f19364c;

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        if (cls.isAssignableFrom(FeedTabViewModel.class)) {
            return new FeedTabViewModel(this.f19362a, this.f19363b, this.f19364c);
        }
        StringBuilder sb = new StringBuilder("unknown model ");
        sb.append(cls.getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public C7134a(C7023m mVar, C7033o<C6945f> oVar, C6951a aVar) {
        this.f19362a = mVar;
        this.f19363b = oVar;
        this.f19364c = aVar;
    }
}
