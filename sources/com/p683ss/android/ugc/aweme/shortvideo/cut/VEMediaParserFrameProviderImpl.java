package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p043v7.app.AppCompatActivity;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import com.facebook.imagepipeline.p963c.C13948g;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43845fn;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42658a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42664g;
import com.p683ss.android.vesdk.C50793z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl */
public final class VEMediaParserFrameProviderImpl implements C0183j, C42664g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f107758a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VEMediaParserFrameProviderImpl.class), "frameDiskCache", "getFrameDiskCache()Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;"))};

    /* renamed from: b */
    public boolean f107759b;

    /* renamed from: c */
    public final Map<String, C50793z> f107760c = new LinkedHashMap();

    /* renamed from: d */
    private final ExecutorService f107761d = C42668o.m93630a();

    /* renamed from: e */
    private final C52668f f107762e = C52732g.m112285a(C42599a.f107763a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$a */
    static final class C42599a extends C52712l implements C52670a<C42665n<Bitmap>> {

        /* renamed from: a */
        public static final C42599a f107763a = new C42599a();

        C42599a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(C43308eb.f109491d);
            sb.append("ve_frame_cache2/");
            sb.append(System.currentTimeMillis());
            return new C42665n(sb.toString(), new C42607a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$b */
    static final class C42600b extends C52712l implements C52671b<String, C50793z> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f107764a;

        C42600b(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f107764a = vEMediaParserFrameProviderImpl;
            super(1);
        }

        /* renamed from: a */
        public final C50793z invoke(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C50793z zVar = new C50793z();
            zVar.mo99491a(str);
            this.f107764a.f107760c.put(str, zVar);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$c */
    static final class C42601c<V> implements Callable<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f107765a;

        /* renamed from: b */
        final /* synthetic */ String f107766b;

        /* renamed from: c */
        final /* synthetic */ int f107767c;

        /* renamed from: d */
        final /* synthetic */ C50793z f107768d;

        /* renamed from: e */
        final /* synthetic */ int f107769e;

        /* renamed from: f */
        final /* synthetic */ String f107770f;

        C42601c(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str, int i, C50793z zVar, int i2, String str2) {
            this.f107765a = vEMediaParserFrameProviderImpl;
            this.f107766b = str;
            this.f107767c = i;
            this.f107768d = zVar;
            this.f107769e = i2;
            this.f107770f = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r5 = this;
                java.lang.String r0 = r5.f107766b
                boolean r1 = com.p683ss.android.ugc.tools.utils.C50200d.m108346a(r0)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0044
                android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
                r1.<init>()
                r1.inJustDecodeBounds = r3
                android.graphics.BitmapFactory.decodeFile(r0, r1)
                java.lang.String r0 = r1.outMimeType
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r4 = android.text.TextUtils.isEmpty(r1)
                if (r4 != 0) goto L_0x0044
                java.lang.String r4 = "type"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
                java.lang.String r0 = "png"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = p2628d.p2650m.C52830p.m112455b(r1, r0, r3)
                if (r0 != 0) goto L_0x0042
                java.lang.String r0 = "jpg"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = p2628d.p2650m.C52830p.m112455b(r1, r0, r3)
                if (r0 != 0) goto L_0x0042
                java.lang.String r0 = "jpeg"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = p2628d.p2650m.C52830p.m112455b(r1, r0, r3)
                if (r0 == 0) goto L_0x0044
            L_0x0042:
                r0 = 1
                goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r5.f107766b
                r1 = 2
                int[] r1 = new int[r1]
                int r4 = r5.f107767c
                r1[r2] = r4
                int r2 = r5.f107767c
                r1[r3] = r2
                android.graphics.Bitmap r0 = com.p683ss.android.ugc.tools.utils.C50199c.m108334a(r0, r1)
                goto L_0x0068
            L_0x0059:
                com.ss.android.vesdk.z r0 = r5.f107768d
                int r1 = r5.f107769e
                r2 = -1
                int r3 = r5.f107767c
                com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl r4 = r5.f107765a
                boolean r4 = r4.f107759b
                android.graphics.Bitmap r0 = r0.mo99489a(r1, r2, r3, r4)
            L_0x0068:
                if (r0 == 0) goto L_0x0080
                boolean r1 = r0.isRecycled()
                if (r1 != 0) goto L_0x0080
                com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$c$1 r1 = new com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$c$1
                r1.<init>(r5, r0)
                java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                java.util.concurrent.ExecutorService r2 = com.p683ss.android.ugc.aweme.p1468bu.C24076h.m58902c()
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                p001a.C0013i.m18a(r1, r2)
            L_0x0080:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.C42601c.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$d */
    static final class C42604d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f107774a;

        /* renamed from: b */
        final /* synthetic */ String f107775b;

        C42604d(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f107774a = vEMediaParserFrameProviderImpl;
            this.f107775b = str;
        }

        public final /* synthetic */ Object call() {
            C42675s a = this.f107774a.mo86829a().mo86986a(this.f107775b);
            if (a != null) {
                return (Bitmap) a.f107977c;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$e */
    static final class C42605e<TTaskResult, TContinuationResult> implements C0011g<Bitmap, C52860x> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f107776a;

        /* renamed from: b */
        final /* synthetic */ boolean f107777b;

        /* renamed from: c */
        final /* synthetic */ int f107778c;

        /* renamed from: d */
        final /* synthetic */ String f107779d;

        /* renamed from: e */
        final /* synthetic */ int f107780e;

        /* renamed from: f */
        final /* synthetic */ C42658a f107781f;

        C42605e(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, boolean z, int i, String str, int i2, C42658a aVar) {
            this.f107776a = vEMediaParserFrameProviderImpl;
            this.f107777b = z;
            this.f107778c = i;
            this.f107779d = str;
            this.f107780e = i2;
            this.f107781f = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo33d() || !this.f107777b) {
                Bitmap bitmap = (Bitmap) iVar.mo34e();
                if (bitmap != null) {
                    if (!(!bitmap.isRecycled())) {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        C13715a a = C13715a.m27746a(new C14043d(bitmap, (C13718c<Bitmap>) C13948g.m28419a(), C14046g.f36711a, 0));
                        if (a != null) {
                            if (!a.mo25635d()) {
                                a = null;
                            }
                            if (a != null) {
                                C42658a aVar = this.f107781f;
                                C13715a b = a.clone();
                                C52711k.m112236a((Object) b, "result.clone()");
                                aVar.mo86959a(b);
                                C13715a.m27752c(a);
                            }
                        }
                    }
                }
            } else {
                this.f107776a.mo86831a(this.f107778c, this.f107779d, this.f107780e, this.f107781f, false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$f */
    static final class C42606f<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f107782a;

        C42606f(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f107782a = vEMediaParserFrameProviderImpl;
        }

        public final /* synthetic */ Object call() {
            this.f107782a.mo86829a().mo86987a();
            this.f107782a.mo86833b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final C42665n<Bitmap> mo86829a() {
        return (C42665n) this.f107762e.getValue();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void releaseFrames() {
        C0013i.m16a((Callable<TResult>) new C42606f<TResult>(this));
    }

    /* renamed from: b */
    public final void mo86833b() {
        for (Entry key : this.f107760c.entrySet()) {
            mo86832a((String) key.getKey());
        }
    }

    /* renamed from: b */
    private final C0013i<Bitmap> m93517b(String str) {
        C0013i<Bitmap> a = C0013i.m16a((Callable<TResult>) new C42604d<TResult>(this, str));
        C52711k.m112236a((Object) a, "Task.callInBackground {\n…cacheKey)?.data\n        }");
        return a;
    }

    public VEMediaParserFrameProviderImpl(Context context) {
        C52711k.m112240b(context, "context");
        C39629l.m88232a().mo58586q();
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().mo324a(this);
        }
    }

    /* renamed from: a */
    public final void mo86832a(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C50793z zVar = (C50793z) this.f107760c.get(str);
        if (zVar != null) {
            zVar.mo99490a();
            this.f107760c.put(str, null);
        }
    }

    /* renamed from: a */
    private final C0013i<Bitmap> m93516a(String str, String str2, int i) {
        C50793z zVar;
        C42600b bVar = new C42600b(this);
        int a = C43845fn.m96282a(60.0d, C39629l.m88233b());
        C50793z zVar2 = (C50793z) this.f107760c.get(str2);
        if (zVar2 == null) {
            zVar = bVar.invoke(str2);
        } else {
            zVar = zVar2;
        }
        C42601c cVar = new C42601c(this, str2, a, zVar, i, str);
        C0013i<Bitmap> a2 = C0013i.m18a((Callable<TResult>) cVar, (Executor) this.f107761d);
        C52711k.m112236a((Object) a2, "Task.call(Callable {\n   … }, extractFrameExecutor)");
        return a2;
    }

    /* renamed from: a */
    public final void mo86830a(int i, String str, int i2, int i3, C42658a aVar) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(aVar, "onGetBitmap");
        mo86831a(i, str, i3, aVar, true);
    }

    /* renamed from: a */
    public final void mo86831a(int i, String str, int i2, C42658a aVar, boolean z) {
        C0013i iVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        String sb2 = sb.toString();
        if (mo86829a().mo86989b(sb2)) {
            iVar = m93517b(sb2);
        } else {
            iVar = m93516a(sb2, str, i2);
        }
        C42605e eVar = new C42605e(this, z, i, str, i2, aVar);
        iVar.mo20a((C0011g<TResult, TContinuationResult>) eVar, C0013i.f25b);
    }
}
