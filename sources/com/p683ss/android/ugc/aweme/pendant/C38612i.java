package com.p683ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50205i;
import java.io.File;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.pendant.i */
public final class C38612i {

    /* renamed from: e */
    public static final C38613a f98209e = new C38613a(null);

    /* renamed from: a */
    public final String f98210a = "newpendant";

    /* renamed from: b */
    public int f98211b;

    /* renamed from: c */
    public final List<String> f98212c;

    /* renamed from: d */
    public final String f98213d;

    /* renamed from: f */
    private final String f98214f;

    /* renamed from: com.ss.android.ugc.aweme.pendant.i$a */
    public static final class C38613a {
        private C38613a() {
        }

        public /* synthetic */ C38613a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.i$b */
    static final class C38614b<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C38612i f98215a;

        /* renamed from: b */
        final /* synthetic */ Context f98216b;

        C38614b(C38612i iVar, Context context) {
            this.f98215a = iVar;
            this.f98216b = context;
        }

        public final void subscribe(final C2204x<String> xVar) {
            C52711k.m112240b(xVar, "it");
            C38612i.m85942a(this.f98215a.mo78538b());
            C47723bk.m103306a(this.f98215a.mo78540d(), false);
            Downloader.with(this.f98216b).url(this.f98215a.mo78536a()).savePath(this.f98215a.mo78538b()).name(this.f98215a.mo78537a(this.f98215a.mo78536a(), true)).subThreadListener(new AbsDownloadListener(this) {

                /* renamed from: a */
                final /* synthetic */ C38614b f98217a;

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String c = this.f98217a.f98215a.mo78539c();
                    if (C38612i.m85943a(new File(c), this.f98217a.f98215a.f98213d)) {
                        xVar.mo6282a(c);
                        return;
                    }
                    C2204x xVar = xVar;
                    StringBuilder sb = new StringBuilder("当前 ");
                    sb.append(this.f98217a.f98215a.f98211b);
                    sb.append("下载的zip文件的md5不匹配");
                    xVar.mo6274a((Throwable) new Exception(sb.toString()));
                }

                {
                    this.f98217a = r1;
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    C52711k.m112240b(baseException, "e");
                    xVar.mo6274a((Throwable) baseException);
                }
            }).download();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.i$c */
    public static final class C38616c implements C1715j<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C38612i f98219a;

        C38616c(C38612i iVar) {
            this.f98219a = iVar;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo6207a(Object obj) {
            C52711k.m112240b((Throwable) obj, "t");
            if (this.f98219a.f98211b >= this.f98219a.f98212c.size() - 1) {
                return false;
            }
            this.f98219a.f98211b++;
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.i$d */
    static final class C38617d<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C38612i f98220a;

        C38617d(C38612i iVar) {
            this.f98220a = iVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C2201v a = C2201v.m6601a((C2205y<T>) new C38619f<T>(str));
            C52711k.m112236a((Object) a, "Observable.create<Int> {…)\n            }\n        }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.i$e */
    public static final class C38618e implements C1674ab<Integer> {

        /* renamed from: a */
        final /* synthetic */ C38612i f98221a;

        /* renamed from: b */
        final /* synthetic */ C38624l f98222b;

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onComplete() {
            this.f98222b.mo78543a();
        }

        public final /* synthetic */ void onNext(Object obj) {
            if (((Number) obj).intValue() > 0) {
                onComplete();
            } else {
                onError(new Throwable("莫名其妙出来一个错误"));
            }
        }

        C38618e(C38612i iVar, C38624l lVar) {
            this.f98221a = iVar;
            this.f98222b = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.i$f */
    static final class C38619f<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ String f98223a;

        C38619f(String str) {
            this.f98223a = str;
        }

        public final void subscribe(C2204x<Integer> xVar) {
            C52711k.m112240b(xVar, "it");
            try {
                if (C52830p.m112413c(this.f98223a, ".zip", false, 2, null)) {
                    int b = C52830p.m112446b((CharSequence) this.f98223a, ".zip", 0, false, 6, (Object) null);
                    String str = this.f98223a;
                    if (str != null) {
                        String substring = str.substring(0, b);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        C50205i.m108365a(new File(this.f98223a), new File(substring));
                        xVar.mo6282a(Integer.valueOf(1));
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
                xVar.mo6274a(new Throwable("文件路径不以.zip结尾！"));
            } catch (Exception e) {
                xVar.mo6274a((Throwable) e);
            }
        }
    }

    /* renamed from: e */
    public final void mo78541e() {
        m85942a(mo78538b());
    }

    /* renamed from: a */
    public final String mo78536a() {
        if (this.f98211b < this.f98212c.size()) {
            return (String) this.f98212c.get(this.f98211b);
        }
        throw new Exception("当前zipurl数组越界了！！！");
    }

    /* renamed from: c */
    public final String mo78539c() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo78538b());
        sb.append(File.separator);
        sb.append(mo78537a(mo78536a(), true));
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo78540d() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo78538b());
        sb.append(File.separator);
        sb.append(mo78537a(mo78536a(), false));
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo78538b() {
        String str;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        File b = C48016e.m103941b(C11010c.m22280a());
        C52711k.m112236a((Object) b, "FileHelper.getCacheDir(A….getApplicationContext())");
        sb2.append(b.getPath());
        sb2.append(File.separator);
        sb2.append("newpendant");
        sb.append(sb2.toString());
        sb.append(File.separator);
        if (!TextUtils.isEmpty(this.f98214f)) {
            str = this.f98214f;
        } else {
            str = "default_activity";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m85942a(String str) {
        C47723bk.m103315c(str);
    }

    /* renamed from: a */
    public static boolean m85943a(File file, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        return TextUtils.equals(C9395d.m18570a(file), str);
    }

    /* renamed from: a */
    public final String mo78537a(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f98213d);
        if (z) {
            str2 = ".zip";
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public C38612i(String str, List<String> list, String str2) {
        C52711k.m112240b(str, "relativePath");
        C52711k.m112240b(list, "zipUrl");
        C52711k.m112240b(str2, "md5");
        this.f98214f = str;
        this.f98212c = list;
        this.f98213d = str2;
    }
}
