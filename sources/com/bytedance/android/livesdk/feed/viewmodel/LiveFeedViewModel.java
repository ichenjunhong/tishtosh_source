package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0198r;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.C6957i.C6958a;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.feed.C6944e;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import java.util.List;

public class LiveFeedViewModel extends RxViewModel {

    /* renamed from: a */
    public final IFeedRepository f19399a;

    /* renamed from: b */
    public final C0198r<Integer> f19400b = new C0198r<>();

    /* renamed from: c */
    public boolean f19401c = false;

    /* renamed from: d */
    public String f19402d = null;

    /* renamed from: e */
    private final List<C6945f> f19403e;

    /* renamed from: f */
    private C6944e f19404f;

    /* renamed from: g */
    private C6958a f19405g;

    public void onCleared() {
        this.f19399a.mo12977e().mo13104b(this.f19404f);
        this.f19399a.mo12977e().mo13105b(this.f19405g);
        this.f19404f = null;
        super.onCleared();
    }

    /* renamed from: a */
    public final void mo13273a() {
        if (this.f19404f == null) {
            this.f19404f = new C7160w(this);
            this.f19405g = new C7161x(this);
            this.f19399a.mo12977e().mo13100a(this.f19404f);
            this.f19399a.mo12977e().mo13101a(this.f19405g);
        }
    }

    public LiveFeedViewModel(IFeedRepository iFeedRepository, List<C6945f> list) {
        this.f19399a = iFeedRepository;
        this.f19403e = list;
    }
}
