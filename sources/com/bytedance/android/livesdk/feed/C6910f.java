package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.content.Context;
import com.bytedance.android.livesdk.feed.p339g.C6951a;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.LiveFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;

/* renamed from: com.bytedance.android.livesdk.feed.f */
public final class C6910f implements C0212b {

    /* renamed from: a */
    private IFeedRepository f18912a;

    /* renamed from: b */
    private C7023m f18913b;

    /* renamed from: c */
    private long f18914c;

    /* renamed from: d */
    private C7005j f18915d;

    /* renamed from: e */
    private Context f18916e;

    /* renamed from: f */
    private C6951a f18917f;

    /* renamed from: g */
    private C7067q f18918g;

    /* renamed from: a */
    public final C6910f mo13107a(long j) {
        this.f18914c = j;
        return this;
    }

    /* renamed from: a */
    public final C6910f mo13108a(C7005j jVar) {
        this.f18915d = jVar;
        return this;
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo361a(Class<T> cls) {
        if (cls.isAssignableFrom(BaseFeedDataViewModel.class)) {
            return new BaseFeedDataViewModel(this.f18912a, this.f18915d, this.f18917f);
        }
        if (cls.isAssignableFrom(FragmentFeedViewModel.class)) {
            return new FragmentFeedViewModel(this.f18912a, this.f18915d, this.f18917f);
        }
        if (cls.isAssignableFrom(TabFeedViewModel.class)) {
            TabFeedViewModel tabFeedViewModel = new TabFeedViewModel(this.f18912a, this.f18915d, this.f18913b, this.f18917f, this.f18918g, this.f18914c);
            return tabFeedViewModel;
        } else if (cls.isAssignableFrom(DislikeTipViewModel.class)) {
            return new DislikeTipViewModel(this.f18913b, this.f18914c, this.f18916e);
        } else {
            if (cls.isAssignableFrom(TimeOutRefreshViewModel.class)) {
                return new TimeOutRefreshViewModel();
            }
            if (cls.isAssignableFrom(LiveFeedViewModel.class)) {
                return new LiveFeedViewModel(this.f18912a, this.f18913b.mo13185c());
            }
            StringBuilder sb = new StringBuilder("unknown model ");
            sb.append(cls.getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C6910f(IFeedRepository iFeedRepository, C7023m mVar, Context context, C7067q qVar, C6951a aVar) {
        this.f18912a = iFeedRepository;
        this.f18913b = mVar;
        this.f18916e = context;
        this.f18918g = qVar;
        this.f18917f = aVar;
    }
}
