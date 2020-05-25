package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42607a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42665n;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42675s;
import com.p683ss.android.ugc.aweme.shortvideo.mob.C43994a;
import com.p683ss.android.vesdk.C50793z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0008d;
import p001a.C0010f;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52726d;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2 */
public final class VEMediaParserProviderV2 implements C0183j {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f108982a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(VEMediaParserProviderV2.class), "frameDiskCache", "getFrameDiskCache()Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;"))};

    /* renamed from: b */
    public boolean f108983b;

    /* renamed from: c */
    public final Map<String, C50793z> f108984c = new LinkedHashMap();

    /* renamed from: d */
    public final List<Long> f108985d = new ArrayList();

    /* renamed from: e */
    private final ExecutorService f108986e = C43156e.m94701a();

    /* renamed from: f */
    private final List<C0010f> f108987f = new ArrayList();

    /* renamed from: g */
    private final List<C0013i<Bitmap>> f108988g = new ArrayList();

    /* renamed from: h */
    private final C52668f f108989h = C52732g.m112285a(C43139a.f108990a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$a */
    static final class C43139a extends C52712l implements C52670a<C42665n<Bitmap>> {

        /* renamed from: a */
        public static final C43139a f108990a = new C43139a();

        C43139a() {
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$b */
    static final class C43140b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f108991a;

        /* renamed from: b */
        final /* synthetic */ C0008d f108992b;

        /* renamed from: c */
        final /* synthetic */ C0027j f108993c;

        /* renamed from: d */
        final /* synthetic */ String f108994d;

        /* renamed from: e */
        final /* synthetic */ int f108995e;

        /* renamed from: f */
        final /* synthetic */ C50793z f108996f;

        /* renamed from: g */
        final /* synthetic */ int f108997g;

        /* renamed from: h */
        final /* synthetic */ String f108998h;

        C43140b(VEMediaParserProviderV2 vEMediaParserProviderV2, C0008d dVar, C0027j jVar, String str, int i, C50793z zVar, int i2, String str2) {
            this.f108991a = vEMediaParserProviderV2;
            this.f108992b = dVar;
            this.f108993c = jVar;
            this.f108994d = str;
            this.f108995e = i;
            this.f108996f = zVar;
            this.f108997g = i2;
            this.f108998h = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                a.d r0 = r5.f108992b
                boolean r0 = r0.mo8a()
                if (r0 == 0) goto L_0x000e
                a.j r0 = r5.f108993c
                r0.mo45b()
                return
            L_0x000e:
                java.lang.String r0 = r5.f108994d
                boolean r1 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103311a(r0)
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0052
                android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
                r1.<init>()
                r1.inJustDecodeBounds = r3
                android.graphics.BitmapFactory.decodeFile(r0, r1)
                java.lang.String r0 = r1.outMimeType
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r4 = android.text.TextUtils.isEmpty(r1)
                if (r4 != 0) goto L_0x0052
                java.lang.String r4 = "type"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
                java.lang.String r0 = "png"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = p2628d.p2650m.C52830p.m112455b(r1, r0, r3)
                if (r0 != 0) goto L_0x0050
                java.lang.String r0 = "jpg"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = p2628d.p2650m.C52830p.m112455b(r1, r0, r3)
                if (r0 != 0) goto L_0x0050
                java.lang.String r0 = "jpeg"
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = p2628d.p2650m.C52830p.m112455b(r1, r0, r3)
                if (r0 == 0) goto L_0x0052
            L_0x0050:
                r0 = 1
                goto L_0x0053
            L_0x0052:
                r0 = 0
            L_0x0053:
                if (r0 == 0) goto L_0x0067
                java.lang.String r0 = r5.f108994d
                r1 = 2
                int[] r1 = new int[r1]
                int r4 = r5.f108995e
                r1[r2] = r4
                int r2 = r5.f108995e
                r1[r3] = r2
                android.graphics.Bitmap r0 = com.p683ss.android.ugc.tools.utils.C50199c.m108334a(r0, r1)
                goto L_0x0076
            L_0x0067:
                com.ss.android.vesdk.z r0 = r5.f108996f
                int r1 = r5.f108997g
                r2 = -1
                int r3 = r5.f108995e
                com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2 r4 = r5.f108991a
                boolean r4 = r4.f108983b
                android.graphics.Bitmap r0 = r0.mo99489a(r1, r2, r3, r4)
            L_0x0076:
                if (r0 == 0) goto L_0x008e
                boolean r1 = r0.isRecycled()
                if (r1 != 0) goto L_0x008e
                com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$b$1 r1 = new com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$b$1
                r1.<init>(r5, r0)
                java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                java.util.concurrent.ExecutorService r2 = com.p683ss.android.ugc.aweme.p1468bu.C24076h.m58902c()
                java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
                p001a.C0013i.m18a(r1, r2)
            L_0x008e:
                if (r0 != 0) goto L_0x009b
                a.j r0 = r5.f108993c
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                r0.mo46b(r1)
                return
            L_0x009b:
                a.j r1 = r5.f108993c
                r1.mo47b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2.C43140b.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$c */
    static final class C43143c extends C52712l implements C52671b<String, C50793z> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f109002a;

        C43143c(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f109002a = vEMediaParserProviderV2;
            super(1);
        }

        /* renamed from: a */
        public final C50793z invoke(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C50793z zVar = new C50793z();
            zVar.mo99491a(str);
            this.f109002a.f108984c.put(str, zVar);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$d */
    static final class C43144d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f109003a;

        /* renamed from: b */
        final /* synthetic */ String f109004b;

        C43144d(VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
            this.f109003a = vEMediaParserProviderV2;
            this.f109004b = str;
        }

        public final /* synthetic */ Object call() {
            C42675s a = this.f109003a.mo87676a().mo86986a(this.f109004b);
            if (a != null) {
                return (Bitmap) a.f107977c;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$e */
    static final class C43145e<TTaskResult, TContinuationResult> implements C0011g<Bitmap, C52860x> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f109005a;

        /* renamed from: b */
        final /* synthetic */ boolean f109006b;

        /* renamed from: c */
        final /* synthetic */ int f109007c;

        /* renamed from: d */
        final /* synthetic */ String f109008d;

        /* renamed from: e */
        final /* synthetic */ int f109009e;

        /* renamed from: f */
        final /* synthetic */ C43149a f109010f;

        /* renamed from: g */
        final /* synthetic */ C52726d f109011g;

        C43145e(VEMediaParserProviderV2 vEMediaParserProviderV2, boolean z, int i, String str, int i2, C43149a aVar, C52726d dVar) {
            this.f109005a = vEMediaParserProviderV2;
            this.f109006b = z;
            this.f109007c = i;
            this.f109008d = str;
            this.f109009e = i2;
            this.f109010f = aVar;
            this.f109011g = dVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo33d() || !this.f109006b) {
                Bitmap bitmap = (Bitmap) iVar.mo34e();
                if (bitmap != null) {
                    if (!(!bitmap.isRecycled())) {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        this.f109010f.mo87717a(bitmap);
                        if (this.f109011g.element != -1) {
                            this.f109005a.f108985d.add(Long.valueOf(System.currentTimeMillis() - this.f109011g.element));
                        }
                    }
                }
            } else {
                this.f109005a.mo87677a(this.f109007c, this.f109008d, this.f109009e, this.f109010f, false);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$f */
    static final class C43146f<TTaskResult, TContinuationResult> implements C0011g<List<? extends Bitmap>, Void> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f109012a;

        C43146f(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f109012a = vEMediaParserProviderV2;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f109012a.mo87678b();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$g */
    static final class C43147g<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f109013a;

        C43147g(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f109013a = vEMediaParserProviderV2;
        }

        public final /* synthetic */ Object call() {
            this.f109013a.mo87680d();
            this.f109013a.mo87676a().mo86987a();
            this.f109013a.mo87678b();
            C43994a.m96557a(this.f109013a.f108985d, "video_clip");
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final C42665n<Bitmap> mo87676a() {
        return (C42665n) this.f108989h.getValue();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void releaseFrames() {
        C0013i.m16a((Callable<TResult>) new C43147g<TResult>(this));
    }

    /* renamed from: b */
    public final void mo87678b() {
        for (Entry key : this.f108984c.entrySet()) {
            String str = (String) key.getKey();
            C50793z zVar = (C50793z) this.f108984c.get(str);
            if (zVar != null) {
                this.f108984c.put(str, null);
                zVar.mo99490a();
            }
        }
    }

    /* renamed from: c */
    public final void mo87679c() {
        if (this.f108988g.isEmpty()) {
            mo87678b();
            return;
        }
        C0013i.m15a((Collection<? extends C0013i<TResult>>) this.f108988g).mo20a((C0011g<TResult, TContinuationResult>) new C43146f<TResult,TContinuationResult>(this), (Executor) C0013i.f24a);
        this.f108988g.clear();
    }

    /* renamed from: d */
    public final void mo87680d() {
        for (C0010f c : this.f108987f) {
            c.mo14c();
        }
        this.f108987f.clear();
        this.f108988g.clear();
    }

    /* renamed from: a */
    private final C0013i<Bitmap> m94618a(String str) {
        C0013i<Bitmap> a = C0013i.m16a((Callable<TResult>) new C43144d<TResult>(this, str));
        C52711k.m112236a((Object) a, "Task.callInBackground {\n…cacheKey)?.data\n        }");
        return a;
    }

    public VEMediaParserProviderV2(Context context) {
        C52711k.m112240b(context, "context");
        C39629l.m88232a().mo58586q();
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().mo324a(this);
        }
    }

    /* renamed from: a */
    private final C0013i<Bitmap> m94619a(String str, String str2, int i) {
        C50793z zVar;
        C43143c cVar = new C43143c(this);
        int a = C23728o.m58241a(56.0d);
        C50793z zVar2 = (C50793z) this.f108984c.get(str2);
        if (zVar2 == null) {
            zVar = cVar.invoke(str2);
        } else {
            zVar = zVar2;
        }
        C0010f fVar = new C0010f();
        this.f108987f.add(fVar);
        C0008d b = fVar.mo13b();
        C52711k.m112236a((Object) b, "cts.token");
        C0013i<Bitmap> a2 = m94617a(b, zVar, i, a, str2, str);
        this.f108988g.add(a2);
        return a2;
    }

    /* renamed from: a */
    public final void mo87677a(int i, String str, int i2, C43149a aVar, boolean z) {
        C0013i a;
        C52726d dVar = new C52726d();
        dVar.element = -1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        String sb2 = sb.toString();
        if (mo87676a().mo86989b(sb2)) {
            a = m94618a(sb2);
        } else {
            dVar.element = System.currentTimeMillis();
            a = m94619a(sb2, str, i2);
        }
        C0013i iVar = a;
        C43145e eVar = new C43145e(this, z, i, str, i2, aVar, dVar);
        iVar.mo20a((C0011g<TResult, TContinuationResult>) eVar, C0013i.f25b);
    }

    /* renamed from: a */
    private final C0013i<Bitmap> m94617a(C0008d dVar, C50793z zVar, int i, int i2, String str, String str2) {
        C0027j jVar = new C0027j();
        ExecutorService executorService = this.f108986e;
        C43140b bVar = new C43140b(this, dVar, jVar, str, i2, zVar, i, str2);
        executorService.execute(bVar);
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "tcs.task");
        return iVar;
    }
}
