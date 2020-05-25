package com.p683ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.feed.helper.C30365e;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.at */
public final class C30032at implements C13791d<C14045f> {

    /* renamed from: a */
    public volatile long f78391a;

    /* renamed from: b */
    public volatile long f78392b;

    /* renamed from: c */
    public volatile int f78393c;

    /* renamed from: d */
    public volatile String f78394d;

    /* renamed from: e */
    private WeakReference<SmartImageView> f78395e;

    /* renamed from: f */
    private DataCenter f78396f;

    /* renamed from: g */
    private volatile long f78397g;

    /* renamed from: h */
    private volatile C30365e f78398h;

    public final void onFailure(String str, Throwable th) {
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final void onSubmit(String str, Object obj) {
    }

    C30032at(WeakReference<SmartImageView> weakReference, DataCenter dataCenter, C30365e eVar) {
        this.f78395e = weakReference;
        this.f78396f = dataCenter;
        this.f78398h = eVar;
    }

    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
        C14045f fVar = (C14045f) obj;
        C22574a.m55738f().mo46921b("feed_cover_total", false);
        if (this.f78395e.get() != null) {
            C30073bk.m70501a((SimpleDraweeView) this.f78395e.get(), R.drawable.csk);
        }
        this.f78397g = SystemClock.elapsedRealtime();
    }
}
