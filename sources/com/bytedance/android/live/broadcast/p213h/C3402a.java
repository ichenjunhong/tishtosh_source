package com.bytedance.android.live.broadcast.p213h;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.p683ss.avframework.livestreamv2.ILiveStream.CatchVideoCallback;
import java.io.File;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.live.broadcast.h.a */
public final class C3402a implements CatchVideoCallback {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9704a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3402a.class), "originVideoPath", "getOriginVideoPath()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3402a.class), "effectVideoPath", "getEffectVideoPath()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3402a.class), "compositeDisposable", "getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;"))};

    /* renamed from: e */
    public static final C3403a f9705e = new C3403a(null);

    /* renamed from: b */
    public int f9706b;

    /* renamed from: c */
    public final C3048a f9707c;

    /* renamed from: d */
    public final boolean f9708d;

    /* renamed from: f */
    private final C52668f f9709f = C52732g.m112285a(C3408e.f9718a);

    /* renamed from: g */
    private final C52668f f9710g = C52732g.m112285a(C3405c.f9715a);

    /* renamed from: h */
    private final C52668f f9711h = C52732g.m112285a(C3404b.f9714a);

    /* renamed from: i */
    private final int f9712i;

    /* renamed from: j */
    private final int f9713j;

    /* renamed from: com.bytedance.android.live.broadcast.h.a$a */
    public static final class C3403a {
        private C3403a() {
        }

        public /* synthetic */ C3403a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$b */
    static final class C3404b extends C52712l implements C52670a<C1689b> {

        /* renamed from: a */
        public static final C3404b f9714a = new C3404b();

        C3404b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C1689b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$c */
    static final class C3405c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C3405c f9715a = new C3405c();

        C3405c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder();
            File dir = C3922z.m9915e().getDir("live_capture_video", 0);
            C52711k.m112236a((Object) dir, "ResUtil.getContext().get…RY, Context.MODE_PRIVATE)");
            sb.append(dir.getAbsolutePath());
            sb.append(File.separator);
            sb.append("effect_video.h264");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$d */
    static final class C3406d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C3402a f9716a;

        C3406d(C3402a aVar) {
            this.f9716a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C3831a.m9707a("CaptureVideoUploadController", "origin file update success");
            this.f9716a.mo8753a(new File(this.f9716a.mo8754b()), "2", C34071.f9717a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$e */
    static final class C3408e extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C3408e f9718a = new C3408e();

        C3408e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder();
            File dir = C3922z.m9915e().getDir("live_capture_video", 0);
            C52711k.m112236a((Object) dir, "ResUtil.getContext().get…RY, Context.MODE_PRIVATE)");
            sb.append(dir.getAbsolutePath());
            sb.append(File.separator);
            sb.append("origin_video.h264");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$f */
    public static final class C3409f<T> implements C1710e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C3402a f9719a;

        public C3409f(C3402a aVar) {
            this.f9719a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            C3831a.m9707a("CaptureVideoUploadController", "catchVideo");
            Bundle bundle = new Bundle();
            bundle.putInt("mode", 0);
            bundle.putString("outputPathOrigin", this.f9719a.mo8752a());
            bundle.putString("outputPathWithEffect", this.f9719a.mo8754b());
            bundle.putBoolean("hardwareEncode", this.f9719a.f9708d);
            C4097p<Float> pVar = LiveConfigSettingKeys.LIVE_CAPTURE_VIDEO_RECORD_DURATION;
            C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LI…URE_VIDEO_RECORD_DURATION");
            Object a = pVar.mo9431a();
            C52711k.m112236a(a, "LiveConfigSettingKeys.LI…DEO_RECORD_DURATION.value");
            bundle.putFloat("duration", ((Number) a).floatValue());
            this.f9719a.f9707c.mo8294a(bundle, (CatchVideoCallback) this.f9719a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$g */
    public static final class C3410g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C3410g f9720a = new C3410g();

        C3410g() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C3831a.m9714b("CaptureVideoUploadController", (Throwable) obj);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$h */
    static final class C3411h<T> implements C1710e<C4177d<Object>> {

        /* renamed from: a */
        final /* synthetic */ C52670a f9721a;

        /* renamed from: b */
        final /* synthetic */ File f9722b;

        C3411h(C52670a aVar, File file) {
            this.f9721a = aVar;
            this.f9722b = file;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            this.f9721a.invoke();
            this.f9722b.delete();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.h.a$i */
    static final class C3412i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ File f9723a;

        C3412i(File file) {
            this.f9723a = file;
        }

        public final /* synthetic */ void accept(Object obj) {
            C3831a.m9714b("CaptureVideoUploadController", (Throwable) obj);
            this.f9723a.delete();
        }
    }

    /* renamed from: a */
    public final String mo8752a() {
        return (String) this.f9709f.getValue();
    }

    /* renamed from: b */
    public final String mo8754b() {
        return (String) this.f9710g.getValue();
    }

    /* renamed from: c */
    public final C1689b mo8755c() {
        return (C1689b) this.f9711h.getValue();
    }

    public final void onComplete() {
        C3831a.m9707a("CaptureVideoUploadController", "onComplete");
        mo8753a(new File(mo8752a()), "1", new C3406d(this));
    }

    public final void onError(int i, String str) {
        StringBuilder sb = new StringBuilder("error code:");
        sb.append(i);
        sb.append(" error msg:");
        sb.append(str);
        C3831a.m9716d("CaptureVideoUploadController", sb.toString());
    }

    /* renamed from: a */
    public final void mo8753a(File file, String str, C52670a<C52860x> aVar) {
        if (file.exists() && file.isFile()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("video_type", new TypedString(str));
            multipartTypedOutput.addPart("file_type", new TypedString("4"));
            multipartTypedOutput.addPart("pixel_x", new TypedString(String.valueOf(this.f9712i)));
            multipartTypedOutput.addPart("pixel_y", new TypedString(String.valueOf(this.f9713j)));
            multipartTypedOutput.addPart("data_size", new TypedString(String.valueOf(file.length())));
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            mo8755c().mo6181a(C3395f.m9156f().mo8742c().mo9020c().updateCaptureVideo(multipartTypedOutput).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3411h<Object>(aVar, file), (C1710e<? super Throwable>) new C3412i<Object>(file)));
        }
    }

    public C3402a(C3048a aVar, int i, int i2, boolean z) {
        C52711k.m112240b(aVar, "liveStream");
        this.f9707c = aVar;
        this.f9712i = i;
        this.f9713j = i2;
        this.f9708d = z;
    }
}
