package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import android.util.Base64;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.p833c.C12727a;
import com.google.gson.C18082l;
import com.google.gson.C18087q;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.p1388at.C23290c;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import com.p683ss.android.vesdk.VEMVAlgorithmConfig.AlgorithmInfo.AlgorithmItem;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d */
public final class C47284d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f119372a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47284d.class), "api", "getApi()Lcom/ss/android/ugc/aweme/tools/mvtemplate/net/AfrApi;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47284d.class), "mvCache", "getMvCache()Lcom/ss/android/ugc/aweme/tools/mvtemplate/net/MvNetCache;"))};

    /* renamed from: b */
    public C1690c f119373b;

    /* renamed from: c */
    public final List<C23290c> f119374c = new ArrayList();

    /* renamed from: d */
    private final C52668f f119375d = C52732g.m112285a(C47285a.f119377a);

    /* renamed from: e */
    private final C52668f f119376e = C52732g.m112285a(C47288d.f119380a);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$a */
    static final class C47285a extends C52712l implements C52670a<AfrApi> {

        /* renamed from: a */
        public static final C47285a f119377a = new C47285a();

        C47285a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AfrApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(((Host) EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0)).getItemName()).mo19923a((C12727a) new MvNetInterceptor()).mo19925a().mo19930a(AfrApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$b */
    public static final class C47286b<T, R> implements C1711f<Throwable, ImageResponse> {

        /* renamed from: a */
        public static final C47286b f119378a = new C47286b();

        C47286b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            ImageResponse imageResponse = new ImageResponse();
            imageResponse.status_code = -1;
            return imageResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$c */
    static final class C47287c<T, R> implements C1711f<Throwable, VideoResponse> {

        /* renamed from: a */
        public static final C47287c f119379a = new C47287c();

        C47287c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            VideoResponse videoResponse = new VideoResponse();
            videoResponse.status_code = -1;
            return videoResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$d */
    static final class C47288d extends C52712l implements C52670a<C47277a> {

        /* renamed from: a */
        public static final C47288d f119380a = new C47288d();

        C47288d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47277a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$e */
    public static final class C47289e<T, R> implements C1711f<Object[], R> {

        /* renamed from: a */
        final /* synthetic */ C52725c f119381a;

        /* renamed from: b */
        final /* synthetic */ C52727e f119382b;

        public C47289e(C52725c cVar, C52727e eVar) {
            this.f119381a = cVar;
            this.f119382b = eVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            Object[] objArr = (Object[]) obj;
            C52711k.m112240b(objArr, "response");
            List arrayList = new ArrayList();
            for (Object obj2 : objArr) {
                if (obj2 instanceof BaseNetResponse) {
                    BaseNetResponse baseNetResponse = (BaseNetResponse) obj2;
                    if (baseNetResponse.status_code == 0) {
                        arrayList.add(obj2);
                    } else {
                        this.f119381a.element++;
                        String str = baseNetResponse.message;
                        if (str != null) {
                            if (str.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                C52727e eVar = this.f119382b;
                                T t = baseNetResponse.message;
                                if (t == null) {
                                    C52711k.m112234a();
                                }
                                eVar.element = t;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$f */
    public static final class C47290f<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C47284d f119383a;

        /* renamed from: b */
        final /* synthetic */ C52725c f119384b;

        public C47290f(C47284d dVar, C52725c cVar) {
            this.f119383a = dVar;
            this.f119384b = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
            if (r11 != false) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0126, code lost:
            if (r5 > 0) goto L_0x0029;
         */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r15) {
            /*
                r14 = this;
                java.util.List r15 = (java.util.List) r15
                java.lang.String r0 = "list"
                p2628d.p2639f.p2641b.C52711k.m112240b(r15, r0)
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.Iterator r15 = r15.iterator()
            L_0x000d:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto L_0x014c
                java.lang.Object r0 = r15.next()
                com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = (com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse) r0
                boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse
                r2 = 1
                if (r1 == 0) goto L_0x0135
                com.ss.android.ugc.aweme.tools.mvtemplate.net.d r1 = r14.f119383a
                com.ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse r0 = (com.p683ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse) r0
                com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrResponse r0 = r0.getData()
                r3 = 0
                if (r0 != 0) goto L_0x002c
            L_0x0029:
                r3 = 1
                goto L_0x012a
            L_0x002c:
                java.util.List r4 = r0.getAfrData()
                if (r4 != 0) goto L_0x0033
                goto L_0x0029
            L_0x0033:
                java.lang.String r5 = r0.getKey()
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0041
                r5 = 1
                goto L_0x0042
            L_0x0041:
                r5 = 0
            L_0x0042:
                if (r5 == 0) goto L_0x0045
                goto L_0x0029
            L_0x0045:
                java.util.Iterator r4 = r4.iterator()
                r5 = 0
            L_0x004a:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0126
                java.lang.Object r6 = r4.next()
                com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrData r6 = (com.p683ss.android.ugc.aweme.tools.mvtemplate.net.AfrData) r6
                java.lang.String r7 = r0.getKey()
                com.ss.android.ugc.aweme.tools.mvtemplate.net.a r8 = r1.mo94577b()
                java.lang.String r8 = r8.mo94569b(r7)
                java.lang.String r9 = r6.getPic()
                if (r9 == 0) goto L_0x00d4
                r10 = r9
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                int r10 = r10.length()
                if (r10 != 0) goto L_0x0073
                r10 = 1
                goto L_0x0074
            L_0x0073:
                r10 = 0
            L_0x0074:
                if (r10 == 0) goto L_0x0077
                goto L_0x00d4
            L_0x0077:
                byte[] r9 = android.util.Base64.decode(r9, r3)
                android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options
                r10.<init>()
                android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
                r10.inPreferredConfig = r11
                int r11 = r9.length
                android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r9, r3, r11, r10)
                if (r9 != 0) goto L_0x008c
                goto L_0x00d1
            L_0x008c:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "resize_bitmap_tmp"
                java.lang.String r11 = com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c.m102580a(r11)
                r10.append(r11)
                java.lang.String r11 = java.io.File.separator
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                java.lang.String r10 = ".bmp"
                java.lang.String r10 = com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47251c.m102591c(r10)
                r11.append(r10)
                java.lang.String r10 = r11.toString()
                java.io.File r11 = new java.io.File
                r11.<init>(r10)
                r12 = 100
                android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.PNG
                boolean r11 = com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c.C47249a.m102574a(r9, r11, r12, r13)
                boolean r12 = r9.isRecycled()
                if (r12 != 0) goto L_0x00ce
                r9.recycle()
            L_0x00ce:
                if (r11 == 0) goto L_0x00d1
                goto L_0x00d6
            L_0x00d1:
                java.lang.String r10 = ""
                goto L_0x00d6
            L_0x00d4:
                java.lang.String r10 = ""
            L_0x00d6:
                r9 = r10
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x00e1
                r9 = 1
                goto L_0x00e2
            L_0x00e1:
                r9 = 0
            L_0x00e2:
                if (r9 == 0) goto L_0x0122
                java.lang.String r9 = r6.getAlgorithm()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x00f2
                r9 = 1
                goto L_0x00f3
            L_0x00f2:
                r9 = 0
            L_0x00f3:
                if (r9 == 0) goto L_0x0122
                r9 = r8
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x0100
                r9 = 1
                goto L_0x0101
            L_0x0100:
                r9 = 0
            L_0x0101:
                if (r9 == 0) goto L_0x0122
                com.ss.android.ugc.aweme.at.c r9 = new com.ss.android.ugc.aweme.at.c
                java.lang.String r11 = r6.getAlgorithm()
                java.lang.String r12 = r6.getJsonResult()
                r9.<init>(r8, r11, r10, r12)
                com.ss.android.ugc.aweme.tools.mvtemplate.net.a r8 = r1.mo94577b()
                java.lang.String r6 = r6.getAlgorithm()
                r8.mo94568a(r7, r6, r9)
                java.util.List<com.ss.android.ugc.aweme.at.c> r6 = r1.f119374c
                r6.add(r9)
                goto L_0x004a
            L_0x0122:
                int r5 = r5 + 1
                goto L_0x004a
            L_0x0126:
                if (r5 <= 0) goto L_0x012a
                goto L_0x0029
            L_0x012a:
                if (r3 == 0) goto L_0x000d
                d.f.b.v$c r0 = r14.f119384b
                int r1 = r0.element
                int r1 = r1 + r2
                r0.element = r1
                goto L_0x000d
            L_0x0135:
                boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse
                if (r1 == 0) goto L_0x000d
                com.ss.android.ugc.aweme.tools.mvtemplate.net.d r1 = r14.f119383a
                com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse r0 = (com.p683ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse) r0
                boolean r0 = r1.mo94576a(r0)
                if (r0 == 0) goto L_0x000d
                d.f.b.v$c r0 = r14.f119384b
                int r1 = r0.element
                int r1 = r1 + r2
                r0.element = r1
                goto L_0x000d
            L_0x014c:
                d.x r15 = p2628d.C52860x.f131107a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47284d.C47290f.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$g */
    public static final class C47291g<T> implements C1710e<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47284d f119385a;

        /* renamed from: b */
        final /* synthetic */ C52725c f119386b;

        /* renamed from: c */
        final /* synthetic */ C47295f f119387c;

        /* renamed from: d */
        final /* synthetic */ C52727e f119388d;

        public C47291g(C47284d dVar, C52725c cVar, C47295f fVar, C52727e eVar) {
            this.f119385a = dVar;
            this.f119386b = cVar;
            this.f119387c = fVar;
            this.f119388d = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C52860x xVar = (C52860x) obj;
            if (this.f119386b.element == 0) {
                this.f119387c.mo94501a(this.f119385a.f119374c);
            } else {
                this.f119387c.mo94502a(this.f119385a.f119374c, (String) this.f119388d.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$h */
    public static final class C47292h<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C47284d f119389a;

        /* renamed from: b */
        final /* synthetic */ C47295f f119390b;

        /* renamed from: c */
        final /* synthetic */ C52727e f119391c;

        public C47292h(C47284d dVar, C47295f fVar, C52727e eVar) {
            this.f119389a = dVar;
            this.f119390b = fVar;
            this.f119391c = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f119390b.mo94502a(this.f119389a.f119374c, (String) this.f119391c.element);
            C1690c cVar = this.f119389a.f119373b;
            if (cVar != null && !cVar.isDisposed()) {
                C1690c cVar2 = this.f119389a.f119373b;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.d$i */
    public static final class C47293i implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C47284d f119392a;

        public C47293i(C47284d dVar) {
            this.f119392a = dVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            C1690c cVar = this.f119392a.f119373b;
            if (cVar != null && !cVar.isDisposed()) {
                C1690c cVar2 = this.f119392a.f119373b;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
            }
        }
    }

    /* renamed from: a */
    public final AfrApi mo94574a() {
        return (AfrApi) this.f119375d.getValue();
    }

    /* renamed from: b */
    public final C47277a mo94577b() {
        return (C47277a) this.f119376e.getValue();
    }

    /* renamed from: a */
    private static String m102640a(String str) {
        boolean z;
        if (str != null) {
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                byte[] decode = Base64.decode(str, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(C47251c.m102580a("resize_bitmap_tmp"));
                sb.append(File.separator);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(C47251c.m102591c(".mp4"));
                String sb4 = sb3.toString();
                try {
                    File file = new File(sb4);
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    bufferedOutputStream.write(decode);
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                    z2 = false;
                }
                if (z2) {
                    return sb4;
                }
                return "";
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo94576a(com.p683ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoItemInfo r9 = r9.getData()
            r0 = 1
            if (r9 != 0) goto L_0x0008
            return r0
        L_0x0008:
            com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoItem r1 = r9.getVideoItem()
            if (r1 != 0) goto L_0x000f
            return r0
        L_0x000f:
            java.lang.String r2 = r9.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 0
            if (r2 != 0) goto L_0x001e
            r2 = 1
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 == 0) goto L_0x0022
            return r0
        L_0x0022:
            java.lang.String r9 = r9.getKey()
            com.ss.android.ugc.aweme.tools.mvtemplate.net.a r2 = r8.mo94577b()
            java.lang.String r2 = r2.mo94569b(r9)
            java.lang.String r4 = r1.getContent()
            java.lang.String r4 = m102640a(r4)
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x0082
            java.lang.String r5 = r1.getAlgorithm()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            if (r5 == 0) goto L_0x0082
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.at.c r5 = new com.ss.android.ugc.aweme.at.c
            java.lang.String r6 = r1.getAlgorithm()
            java.lang.String r7 = r1.getJsonResult()
            r5.<init>(r2, r6, r4, r7)
            com.ss.android.ugc.aweme.tools.mvtemplate.net.a r2 = r8.mo94577b()
            java.lang.String r1 = r1.getAlgorithm()
            r2.mo94568a(r9, r1, r5)
            java.util.List<com.ss.android.ugc.aweme.at.c> r9 = r8.f119374c
            r9.add(r5)
            r9 = 0
            goto L_0x0083
        L_0x0082:
            r9 = 1
        L_0x0083:
            if (r9 <= 0) goto L_0x0086
            return r0
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.mvtemplate.net.C47284d.mo94576a(com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse):boolean");
    }

    /* renamed from: a */
    public final void mo94575a(String str, AlgorithmItem algorithmItem, List<C2201v<? extends BaseNetResponse>> list) {
        boolean z;
        C18082l lVar;
        String a = mo94577b().mo94567a(str);
        if (algorithmItem.isNeedServerExecute) {
            String str2 = algorithmItem.algorithmName;
            C52711k.m112236a((Object) str2, "item.algorithmName");
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C47277a b = mo94577b();
                String str3 = algorithmItem.algorithmName;
                C52711k.m112236a((Object) str3, "item.algorithmName");
                C23290c a2 = b.mo94566a(a, str3);
                if (a2 == null) {
                    TypedFile typedFile = new TypedFile("image/*", new File(str));
                    try {
                        lVar = new C18087q().mo35029a(algorithmItem.algorithmParamJson);
                    } catch (C18091u unused) {
                        lVar = null;
                    }
                    AfrApi a3 = mo94574a();
                    String str4 = algorithmItem.algorithmName;
                    C52711k.m112236a((Object) str4, "item.algorithmName");
                    C2201v b2 = a3.getVideoInfo(str4, a, algorithmItem.result_out_type.ordinal(), typedFile, lVar).mo6547f((C1711f<? super Throwable, ? extends T>) C47287c.f119379a).mo6529b(C2168a.m6521b());
                    C52711k.m112236a((Object) b2, "api.getVideoInfo(item.al…scribeOn(Schedulers.io())");
                    list.add(b2);
                    return;
                }
                this.f119374c.add(a2);
            }
        }
    }
}
