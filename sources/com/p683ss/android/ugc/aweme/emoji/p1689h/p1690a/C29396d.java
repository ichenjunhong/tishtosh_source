package com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29386b;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29387c;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29388d;
import com.p683ss.android.ugc.aweme.emoji.utils.C29472b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29474d;
import com.p683ss.android.ugc.aweme.emoji.utils.EmojiApi;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d */
public final class C29396d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f76997a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29396d.class), "emojiNameIdMap", "getEmojiNameIdMap()Ljava/util/LinkedHashMap;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29396d.class), "panelEmojiNameMap", "getPanelEmojiNameMap()Ljava/util/LinkedHashMap;"))};

    /* renamed from: f */
    public static final C29396d f76998f = new C29396d();

    /* renamed from: g */
    public static final C29397a f76999g = new C29397a(null);

    /* renamed from: b */
    public C29387c f77000b;

    /* renamed from: c */
    public C29389b f77001c;

    /* renamed from: d */
    public volatile String f77002d = "";

    /* renamed from: e */
    public volatile int f77003e;

    /* renamed from: h */
    private final C52668f f77004h = C52732g.m112285a(C29399c.f77008a);

    /* renamed from: i */
    private final C52668f f77005i = C52732g.m112285a(C29400d.f77009a);

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$a */
    public static final class C29397a {
        private C29397a() {
        }

        /* renamed from: a */
        public static C29396d m69317a() {
            return C29396d.f76998f;
        }

        public /* synthetic */ C29397a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$b */
    public static final class C29398b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C29396d f77006a;

        /* renamed from: b */
        final /* synthetic */ C29386b f77007b;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
            if (r9 == null) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSuccessed(com.p683ss.android.socialbase.downloader.model.DownloadInfo r9) {
            /*
                r8 = this;
                super.onSuccessed(r9)
                java.lang.String r0 = "OnlineEmojiResManager download succeed"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
                com.ss.android.ugc.aweme.emoji.h.a.d r0 = r8.f77006a
                com.ss.android.ugc.aweme.emoji.h.a.a.b r1 = r8.f77007b
                if (r9 == 0) goto L_0x0014
                java.lang.String r9 = r9.getTargetFilePath()
                if (r9 != 0) goto L_0x0016
            L_0x0014:
                java.lang.String r9 = ""
            L_0x0016:
                com.ss.android.ugc.aweme.emoji.h.a.c r2 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29393c.f76991a
                java.lang.String r3 = r1.getMd5()
                if (r3 != 0) goto L_0x0021
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0021:
                java.lang.String r4 = "zipFilePath"
                p2628d.p2639f.p2641b.C52711k.m112240b(r9, r4)
                java.lang.String r4 = "md5"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
                java.io.File r4 = new java.io.File
                r4.<init>(r9)
                boolean r5 = r4.exists()
                r6 = 1
                r7 = 0
                if (r5 != 0) goto L_0x0052
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "OnlineEmojiFileHelper isZipFileValid: zFile not exist: "
                r4.<init>(r5)
                r4.append(r9)
                java.lang.String r5 = ", "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r3)
                goto L_0x00a0
            L_0x0052:
                boolean r5 = r4.isFile()
                if (r5 != 0) goto L_0x0072
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "OnlineEmojiFileHelper isZipFileValid: zFile not a file: "
                r4.<init>(r5)
                r4.append(r9)
                java.lang.String r5 = ", "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r3)
                goto L_0x00a0
            L_0x0072:
                java.lang.String r4 = com.bytedance.common.utility.C9395d.m18570a(r4)
                boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)
                r5 = r5 ^ r6
                if (r5 == 0) goto L_0x009f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "OnlineEmojiFileHelper isZipFileValid: md5 not match: "
                r5.<init>(r6)
                r5.append(r9)
                java.lang.String r6 = ", "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r3 = ", "
                r5.append(r3)
                r5.append(r4)
                java.lang.String r3 = r5.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r3)
                goto L_0x00a0
            L_0x009f:
                r7 = 1
            L_0x00a0:
                if (r7 == 0) goto L_0x00a3
                goto L_0x00a4
            L_0x00a3:
                r2 = 0
            L_0x00a4:
                if (r2 == 0) goto L_0x00dd
                java.lang.String r3 = r1.getMd5()
                if (r3 != 0) goto L_0x00af
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00af:
                java.lang.String r3 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29393c.m69301a(r3)
                boolean r9 = r2.mo59456a(r9, r3)
                if (r9 == 0) goto L_0x00d2
                java.lang.String r9 = "OnlineEmojiResManager unZip success"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r9)
                r0.mo59464a(r1)
                com.ss.android.ugc.aweme.emoji.utils.d r9 = com.p683ss.android.ugc.aweme.emoji.utils.C29474d.m69546a()
                java.lang.String r0 = "EmojiSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r0)
                java.lang.String r0 = r1.getMd5()
                r9.mo59572a(r0)
                goto L_0x00e2
            L_0x00d2:
                java.lang.String r9 = "OnlineEmojiResManager unZip failed"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r9)
                com.ss.android.ugc.aweme.emoji.h.a.c r9 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29393c.f76991a
                r9.mo59458b(r3)
                goto L_0x00e2
            L_0x00dd:
                java.lang.String r9 = "OnlineEmojiResManager resource zip not valid"
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r9)
            L_0x00e2:
                java.io.File r9 = new java.io.File
                java.lang.String r0 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29393c.m69300a()
                r9.<init>(r0)
                boolean r0 = r9.isDirectory()
                if (r0 == 0) goto L_0x0100
                com.ss.android.ugc.aweme.emoji.h.a.c r0 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29393c.f76991a
                java.lang.String r9 = r9.getAbsolutePath()
                java.lang.String r1 = "absolutePath"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
                r0.mo59458b(r9)
                return
            L_0x0100:
                r9.delete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.C29398b.onSuccessed(com.ss.android.socialbase.downloader.model.DownloadInfo):void");
        }

        C29398b(C29396d dVar, C29386b bVar) {
            this.f77006a = dVar;
            this.f77007b = bVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            Object obj;
            super.onFailed(downloadInfo, baseException);
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager download failed: ");
            String str = null;
            if (baseException != null) {
                obj = Integer.valueOf(baseException.getErrorCode());
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (baseException != null) {
                str = baseException.getMessage();
            }
            sb.append(str);
            C32458a.m75144a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$c */
    static final class C29399c extends C52712l implements C52670a<LinkedHashMap<String, String>> {

        /* renamed from: a */
        public static final C29399c f77008a = new C29399c();

        C29399c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$d */
    static final class C29400d extends C52712l implements C52670a<LinkedHashMap<String, String>> {

        /* renamed from: a */
        public static final C29400d f77009a = new C29400d();

        C29400d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$e */
    static final class C29401e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f77010a;

        C29401e(String str) {
            this.f77010a = str;
        }

        public final /* synthetic */ Object call() {
            C29393c cVar = C29393c.f76991a;
            String str = this.f77010a;
            C52711k.m112236a((Object) str, "lastCacheMd5");
            return cVar.mo59459c(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$f */
    static final class C29402f<TTaskResult, TContinuationResult> implements C0011g<C29387c, Void> {

        /* renamed from: a */
        final /* synthetic */ C29396d f77011a;

        /* renamed from: b */
        final /* synthetic */ String f77012b;

        C29402f(C29396d dVar, String str) {
            this.f77011a = dVar;
            this.f77012b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0098, code lost:
            if (r7 == null) goto L_0x009a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r7) {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "OnlineEmojiResManager preloadResourceInfo: "
                r0.<init>(r1)
                java.lang.String r1 = r6.f77012b
                r0.append(r1)
                java.lang.String r1 = ", result="
                r0.append(r1)
                java.lang.String r1 = "task"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r1)
                java.lang.Object r1 = r7.mo34e()
                com.ss.android.ugc.aweme.emoji.h.a.a.c r1 = (com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29387c) r1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
                java.lang.Object r7 = r7.mo34e()
                com.ss.android.ugc.aweme.emoji.h.a.a.c r7 = (com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29387c) r7
                r0 = 0
                if (r7 == 0) goto L_0x009a
                boolean r1 = r7.isValid()
                if (r1 == 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r7 = r0
            L_0x0037:
                if (r7 == 0) goto L_0x009a
                com.ss.android.ugc.aweme.emoji.h.a.d r1 = r6.f77011a
                r1.f77000b = r7
                java.util.List r1 = r7.getStickers()
                if (r1 != 0) goto L_0x0046
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0046:
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x004c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0085
                java.lang.Object r2 = r1.next()
                com.ss.android.ugc.aweme.emoji.h.a.a.a r2 = (com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.p1691a.C29385a) r2
                com.ss.android.ugc.aweme.emoji.h.a.d r3 = r6.f77011a
                java.util.LinkedHashMap r3 = r3.mo59463a()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = r2.getDisplayName()
                java.lang.String r5 = r2.getUri()
                r3.put(r4, r5)
                boolean r3 = r2.showInPanel()
                if (r3 == 0) goto L_0x004c
                com.ss.android.ugc.aweme.emoji.h.a.d r3 = r6.f77011a
                java.util.LinkedHashMap r3 = r3.mo59466b()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = r2.getDisplayName()
                java.lang.String r2 = r2.getUri()
                r3.put(r4, r2)
                goto L_0x004c
            L_0x0085:
                com.ss.android.ugc.aweme.emoji.h.a.d r1 = r6.f77011a
                java.lang.String r2 = "resInfo"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r2)
                com.ss.android.ugc.aweme.emoji.h.a.b r2 = new com.ss.android.ugc.aweme.emoji.h.a.b
                r2.<init>(r7, r0)
                r1.f77001c = r2
                com.ss.android.ugc.aweme.emoji.h.a.d r1 = r6.f77011a
                r2 = 2
                r1.f77003e = r2
                if (r7 != 0) goto L_0x009f
            L_0x009a:
                com.ss.android.ugc.aweme.emoji.h.a.d r7 = r6.f77011a
                r1 = 3
                r7.f77003e = r1
            L_0x009f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.p1689h.p1690a.C29396d.C29402f.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.h.a.d$g */
    public static final class C29403g implements C1683ag<C29388d> {

        /* renamed from: a */
        final /* synthetic */ C29396d f77013a;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C29403g(C29396d dVar) {
            this.f77013a = dVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            C32458a.m75148a(th);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            boolean z;
            C29388d dVar = (C29388d) obj;
            C52711k.m112240b(dVar, "response");
            boolean z2 = true;
            if (dVar.f76981b == 1) {
                C29474d a = C29474d.m69546a();
                C52711k.m112236a((Object) a, "EmojiSPUtils.get()");
                a.mo59572a("");
                C32458a.m75144a("OnlineEmojiResManager refreshEmoji fallback");
                return;
            }
            C29386b bVar = dVar.f76980a;
            if (bVar != null) {
                if (C13248c.m26638a(bVar.getMd5()) || C13248c.m26638a(bVar.getResourceUrl())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bVar = null;
                }
                if (bVar != null) {
                    C29474d a2 = C29474d.m69546a();
                    C52711k.m112236a((Object) a2, "EmojiSPUtils.get()");
                    if (C52711k.m112239a((Object) bVar.getMd5(), (Object) a2.mo59575c())) {
                        C29393c cVar = C29393c.f76991a;
                        String md5 = bVar.getMd5();
                        if (md5 == null) {
                            C52711k.m112234a();
                        }
                        C52711k.m112240b(md5, "md5");
                        File file = new File(C29393c.m69301a(md5));
                        if (file.exists() && file.isDirectory()) {
                            z2 = false;
                        }
                        if (!z2) {
                            this.f77013a.mo59464a(bVar);
                            return;
                        }
                    }
                    C29396d dVar2 = this.f77013a;
                    DownloadTask savePath = Downloader.with(C11010c.m22280a()).url(bVar.getResourceUrl()).retryCount(3).savePath(C29393c.m69300a());
                    String md52 = bVar.getMd5();
                    if (md52 == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112240b(md52, "md5");
                    StringBuilder sb = new StringBuilder();
                    sb.append(md52);
                    sb.append(".zip");
                    savePath.name(sb.toString()).subThreadListener(new C29398b(dVar2, bVar)).download();
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder("OnlineEmojiResManager refreshEmoji fail: ");
            sb2.append(dVar);
            C32458a.m75144a(sb2.toString());
        }
    }

    /* renamed from: a */
    public final LinkedHashMap<String, String> mo59463a() {
        return (LinkedHashMap) this.f77004h.getValue();
    }

    /* renamed from: b */
    public final LinkedHashMap<String, String> mo59466b() {
        return (LinkedHashMap) this.f77005i.getValue();
    }

    /* renamed from: e */
    private final boolean m69309e() {
        int i = this.f77003e;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo59467c() {
        boolean z;
        if (this.f77003e == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager not enabled: ");
            sb.append(this.f77003e);
            C32458a.m75144a(sb.toString());
        }
        return z;
    }

    /* renamed from: d */
    public final void mo59468d() {
        EmojiApi a = C29472b.m69540a();
        C52711k.m112236a((Object) a, "EmojiApiUtil.get()");
        C1680ad.m5960a((C2206z<? extends T>) a.getSmallEmojiResources()).mo6155b(C2168a.m6521b()).mo6159b((C1683ag<? super T>) new C29403g<Object>(this));
    }

    private C29396d() {
        boolean z;
        C29474d a = C29474d.m69546a();
        C52711k.m112236a((Object) a, "EmojiSPUtils.get()");
        String c = a.mo59575c();
        C52711k.m112236a((Object) c, "lastCacheMd5");
        if (c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C32458a.m75144a("OnlineEmojiResManager preloadResourceInfo lastCacheMd5 empty");
            return;
        }
        this.f77002d = c;
        this.f77003e = 1;
        C0013i.m16a((Callable<TResult>) new C29401e<TResult>(c)).mo20a((C0011g<TResult, TContinuationResult>) new C29402f<TResult,TContinuationResult>(this, c), C0013i.f25b);
    }

    /* renamed from: a */
    static Drawable m69308a(Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getDrawable(R.drawable.y_);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo59462a(String str) {
        StringBuilder sb = new StringBuilder("file:/");
        C29387c cVar = this.f77000b;
        if (cVar == null) {
            C52711k.m112234a();
        }
        sb.append(cVar.getPicFileDirPath());
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo59465b(String str) {
        if (!mo59467c()) {
            return null;
        }
        String str2 = (String) mo59463a().get(str);
        if (str2 == null) {
            StringBuilder sb = new StringBuilder("OnlineEmojiResManager mapResource not found: ");
            sb.append(str);
            C32458a.m75144a(sb.toString());
            str2 = null;
        }
        return str2;
    }

    /* renamed from: a */
    public final void mo59464a(C29386b bVar) {
        boolean z;
        C29393c cVar = C29393c.f76991a;
        if (m69309e()) {
            if (this.f77002d.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String[] strArr = new String[2];
                strArr[0] = this.f77002d;
                String md5 = bVar.getMd5();
                if (md5 == null) {
                    C52711k.m112234a();
                }
                strArr[1] = md5;
                cVar.mo59455a(strArr);
                return;
            }
        }
        String[] strArr2 = new String[1];
        String md52 = bVar.getMd5();
        if (md52 == null) {
            C52711k.m112234a();
        }
        strArr2[0] = md52;
        cVar.mo59455a(strArr2);
    }
}
