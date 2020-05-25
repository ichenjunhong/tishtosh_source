package com.p683ss.android.ugc.aweme.image;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12155a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12170e;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.p683ss.android.ugc.aweme.base.C23550k;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1417h.C23536a;
import com.p683ss.android.ugc.aweme.experiment.DynamicCoverOptimizeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.image.b */
public final class C35482b {

    /* renamed from: a */
    public static final C35482b f91208a = new C35482b();

    /* renamed from: com.ss.android.ugc.aweme.image.b$a */
    public interface C35483a {
        /* renamed from: a */
        void mo58506a(SmartImageView smartImageView);
    }

    /* renamed from: com.ss.android.ugc.aweme.image.b$b */
    static final class C35484b implements C12170e {

        /* renamed from: a */
        final /* synthetic */ boolean f91209a;

        /* renamed from: b */
        final /* synthetic */ C23550k f91210b;

        /* renamed from: c */
        final /* synthetic */ Video f91211c;

        C35484b(boolean z, C23550k kVar, Video video) {
            this.f91209a = z;
            this.f91210b = kVar;
            this.f91211c = video;
        }

        /* renamed from: a */
        public final void mo23088a(final int i, int[] iArr) {
            C0013i.m18a((Callable<TResult>) new Callable(this) {

                /* renamed from: a */
                final /* synthetic */ C35484b f91212a;

                {
                    this.f91212a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (this.f91212a.f91209a && i >= 6 && !this.f91212a.f91210b.mo48718a() && this.f91212a.f91211c.getPlayAddr() != null) {
                        VideoUrlModel playAddr = this.f91212a.f91211c.getPlayAddr();
                        C52711k.m112236a((Object) playAddr, "video.playAddr");
                        if (!TextUtils.isEmpty(playAddr.getUri())) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("frames", i);
                                VideoUrlModel playAddr2 = this.f91212a.f91211c.getPlayAddr();
                                C52711k.m112236a((Object) playAddr2, "video.playAddr");
                                jSONObject.put("vid", playAddr2.getUri());
                                jSONObject.put("url", this.f91212a.f91210b.f62671b.get(0));
                                C23569o.m57779a("aweme_animated_image_frames_error", jSONObject);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    return null;
                }
            }, (Executor) C24076h.m58904e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.image.b$c */
    public static final class C35486c extends C12168c {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f91214a;

        /* renamed from: b */
        final /* synthetic */ C35483a f91215b;

        /* renamed from: c */
        final /* synthetic */ boolean f91216c;

        /* renamed from: d */
        final /* synthetic */ UrlModel f91217d;

        /* renamed from: e */
        final /* synthetic */ C23550k f91218e;

        /* renamed from: f */
        final /* synthetic */ Video f91219f;

        /* renamed from: g */
        final /* synthetic */ boolean f91220g;

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            String str;
            if (this.f91220g && !this.f91218e.mo48718a() && this.f91219f.getPlayAddr() != null) {
                VideoUrlModel playAddr = this.f91219f.getPlayAddr();
                C52711k.m112236a((Object) playAddr, "video.playAddr");
                if (!TextUtils.isEmpty(playAddr.getUri())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("frames", -1);
                        VideoUrlModel playAddr2 = this.f91219f.getPlayAddr();
                        C52711k.m112236a((Object) playAddr2, "video.playAddr");
                        jSONObject.put("vid", playAddr2.getUri());
                        jSONObject.put("url", this.f91218e.f62671b.get(0));
                        String str2 = "errMsg";
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        jSONObject.put(str2, str);
                        C23569o.m57779a("aweme_animated_image_frames_error", jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
            this.f91214a.setUserVisibleHint(true);
            C35483a aVar = this.f91215b;
            if (aVar != null) {
                aVar.mo58506a(this.f91214a);
            }
            if (this.f91216c) {
                this.f91214a.mo23137b();
            }
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(this.f91217d.getUri());
            urlModel.setUrlList(this.f91218e.f62671b);
            this.f91219f.setCachedOuterCoverUrl(urlModel);
        }

        C35486c(SmartImageView smartImageView, C35483a aVar, boolean z, UrlModel urlModel, C23550k kVar, Video video, boolean z2) {
            this.f91214a = smartImageView;
            this.f91215b = aVar;
            this.f91216c = z;
            this.f91217d = urlModel;
            this.f91218e = kVar;
            this.f91219f = video;
            this.f91220g = z2;
        }
    }

    private C35482b() {
    }

    /* renamed from: a */
    private final boolean m80197a(Context context) {
        boolean z;
        if (!C23337c.m57398a() && (!C35487c.m80205a(context) || C32462a.m75159a(context))) {
            if (VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            if (C23536a.m57711a("aweme_app", "use_dynamic_cover", z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m80198a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        for (String isEmpty : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(isEmpty)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo73885a(SmartImageView smartImageView, Video video, String str, boolean z, C35483a aVar, String str2) {
        String str3 = str2;
        C52711k.m112240b(smartImageView, "coverView");
        C52711k.m112240b(video, "video");
        C52711k.m112240b(str, "sceneTag");
        if (!m80197a(C11010c.m22280a())) {
            return false;
        }
        int a = C10181b.m20511a().mo18168a(DynamicCoverOptimizeExperiment.class, true, "dynamic_cover_style", 31744, 0);
        if ((C52711k.m112239a((Object) str3, (Object) "9frames") || a == 1) && m80198a(video.getDynamicCover())) {
            UrlModel dynamicCover = video.getDynamicCover();
            C52711k.m112236a((Object) dynamicCover, "video.dynamicCover");
            m80196a(smartImageView, dynamicCover, video, false, str, "9frames", aVar, z);
            return true;
        }
        if (C52711k.m112239a((Object) str3, (Object) "6frames") || a == 2) {
            if (m80198a(video.getAnimatedCover())) {
                UrlModel animatedCover = video.getAnimatedCover();
                C52711k.m112236a((Object) animatedCover, "video.animatedCover");
                m80196a(smartImageView, animatedCover, video, true, str, "6frames", aVar, z);
                return true;
            } else if (m80198a(video.getDynamicCover())) {
                UrlModel dynamicCover2 = video.getDynamicCover();
                C52711k.m112236a((Object) dynamicCover2, "video.dynamicCover");
                m80196a(smartImageView, dynamicCover2, video, false, str, "9frames_test", aVar, z);
                return true;
            }
        }
        if (a != 0 || !m80198a(video.getDynamicCover())) {
            return false;
        }
        UrlModel dynamicCover3 = video.getDynamicCover();
        C52711k.m112236a((Object) dynamicCover3, "video.dynamicCover");
        m80196a(smartImageView, dynamicCover3, video, false, str, "", aVar, z);
        return true;
    }

    /* renamed from: a */
    private static void m80196a(SmartImageView smartImageView, UrlModel urlModel, Video video, boolean z, String str, String str2, C35483a aVar, boolean z2) {
        int i;
        String str3;
        String str4 = str2;
        if (z) {
            i = C35510q.f91268e.f32089b;
        } else {
            C12155a aVar2 = C12155a.f32088a;
            C52711k.m112236a((Object) aVar2, "AnimationFrameScheduler.DEFAULT_FRAME_SCHEDULER");
            i = aVar2.f32089b;
        }
        C23550k a = C23608p.m57874a(urlModel);
        C52711k.m112236a((Object) a, "UrlModelConverter.convert(model)");
        if (!TextUtils.isEmpty(str4) && !a.mo48718a()) {
            List<String> list = a.f62671b;
            C52711k.m112236a((Object) list, "convertedUrlModel.urls");
            Iterable<String> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (String str5 : iterable) {
                C52711k.m112236a((Object) str5, "it");
                if (C52830p.m112456b((CharSequence) str5, (CharSequence) "?", false, 2, (Object) null)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append("&ilog=");
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(str4);
                    str3 = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str5);
                    sb4.append("?ilog=");
                    String sb5 = sb4.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sb5);
                    sb6.append(str4);
                    str3 = sb6.toString();
                }
                arrayList.add(str3);
            }
            a.f62671b = (List) arrayList;
        }
        Video video2 = video;
        C12208t b = C12203q.m24645a((Object) a).mo23116a((C12197k) smartImageView).mo23118a(str).mo23112a(i, (C12170e) new C35484b(z, a, video)).mo23124b(true);
        C35486c cVar = new C35486c(smartImageView, aVar, z2, urlModel, a, video2, z);
        b.mo23122a((C12175j) cVar);
    }
}
