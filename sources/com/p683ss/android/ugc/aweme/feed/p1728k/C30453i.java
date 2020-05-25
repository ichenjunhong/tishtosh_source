package com.p683ss.android.ugc.aweme.feed.p1728k;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.facebook.p987k.p988a.C14460b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.p683ss.android.ugc.aweme.feed.helper.C30365e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.k.i */
public final class C30453i extends C12168c {

    /* renamed from: a */
    public WeakReference<VideoViewHolder> f79580a;

    /* renamed from: b */
    public Aweme f79581b;

    /* renamed from: c */
    public Video f79582c;

    /* renamed from: d */
    private long f79583d;

    /* renamed from: e */
    private C30365e f79584e;

    /* renamed from: a */
    public final boolean mo60878a() {
        if (this.f79580a.get() == null || this.f79581b == null || this.f79582c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23085a(Uri uri) {
        this.f79580a.clear();
        this.f79581b = null;
        this.f79582c = null;
    }

    public C30453i(VideoViewHolder videoViewHolder, C30365e eVar) {
        this.f79580a = new WeakReference<>(videoViewHolder);
        this.f79581b = videoViewHolder.mo53999e();
        this.f79584e = eVar;
    }

    /* renamed from: a */
    public final void mo23086a(Uri uri, View view) {
        this.f79583d = System.currentTimeMillis();
        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                if (C30453i.this.mo60878a()) {
                    return null;
                }
                C26890h.onEvent(MobClick.obtain().setEventName("image_request").setValue(C30453i.this.f79581b.getAid()).setLabelName("perf_monitor").setJsonObject(new C26898j().mo54849a("request_id", ((VideoViewHolder) C30453i.this.f79580a.get()).f78326q.optString("request_id")).mo54850a()));
                return null;
            }
        }, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public final void mo23095a(Uri uri, View view, Throwable th) {
        if (!mo60878a()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f79583d;
            final boolean ab = ((VideoViewHolder) this.f79580a.get()).mo60211ab();
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    int i;
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(C30453i.this.f79581b.getAid()).setLabelName("perf_monitor");
                    C26898j a = new C26898j().mo54849a("request_id", ((VideoViewHolder) C30453i.this.f79580a.get()).f78326q.optString("request_id"));
                    String str = "is_success";
                    if (!ab) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    C26890h.onEvent(labelName.setJsonObject(a.mo54849a(str, String.valueOf(i)).mo54849a("duration", String.valueOf(currentTimeMillis)).mo54849a("internet_speed", String.valueOf((int) C14460b.m29586a().mo26626c())).mo54849a("is_cache", String.valueOf(C23515d.m57680a(Uri.parse((String) C30453i.this.f79582c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).mo54850a()));
                    return null;
                }
            }, (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
        C22574a.m55738f().mo46921b("feed_cover_total", false);
        if (this.f79584e != null) {
            this.f79584e.f79370a = SystemClock.elapsedRealtime();
        }
        if (!mo60878a()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f79583d;
            final boolean ab = ((VideoViewHolder) this.f79580a.get()).mo60211ab();
            C0013i.m18a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    int i;
                    if (C30453i.this.mo60878a()) {
                        return null;
                    }
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(C30453i.this.f79581b.getAid()).setLabelName("perf_monitor");
                    C26898j a = new C26898j().mo54849a("request_id", ((VideoViewHolder) C30453i.this.f79580a.get()).f78326q.optString("request_id"));
                    String str = "is_success";
                    if (!ab) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    C26890h.onEvent(labelName.setJsonObject(a.mo54849a(str, String.valueOf(i)).mo54849a("duration", String.valueOf(currentTimeMillis)).mo54849a("internet_speed", String.valueOf((int) C14460b.m29586a().mo26626c())).mo54849a("is_cache", String.valueOf(C23515d.m57680a(Uri.parse((String) C30453i.this.f79582c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).mo54850a()));
                    return null;
                }
            }, (Executor) C26890h.m65003a());
        }
    }
}
