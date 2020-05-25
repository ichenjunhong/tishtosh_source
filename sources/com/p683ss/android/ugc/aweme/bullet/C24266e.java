package com.p683ss.android.ugc.aweme.bullet;

import android.app.Application;
import android.net.Uri;
import com.bytedance.common.utility.C9395d;
import com.bytedance.geckox.C10026a;
import com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.bullet.p628b.p631c.C10247a;
import com.bytedance.ies.bullet.p628b.p631c.C10249c;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.p681c.C10879a;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.web.C48276f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.e */
public final class C24266e implements C10247a {

    /* renamed from: c */
    public static final C24267a f64386c = new C24267a(null);

    /* renamed from: a */
    public final Application f64387a;

    /* renamed from: b */
    public final C19767n f64388b;

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$a */
    public static final class C24267a {
        private C24267a() {
        }

        public /* synthetic */ C24267a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$b */
    public static final class C24268b extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C52671b f64389a;

        /* renamed from: b */
        final /* synthetic */ File f64390b;

        /* renamed from: c */
        final /* synthetic */ C52671b f64391c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (downloadInfo != null) {
                String targetFilePath = downloadInfo.getTargetFilePath();
                if (targetFilePath == null) {
                    this.f64389a.invoke(new Throwable("file is null"));
                    return;
                }
                File file = new File(targetFilePath);
                if (!file.exists()) {
                    C52671b bVar = this.f64389a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.getPath());
                    sb.append(" tmp file not found");
                    bVar.invoke(new Throwable(sb.toString()));
                } else if (!file.renameTo(this.f64390b)) {
                    this.f64389a.invoke(new Throwable("temp file rename failed"));
                } else {
                    this.f64391c.invoke(this.f64390b);
                }
            }
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            C52671b bVar = this.f64389a;
            StringBuilder sb = new StringBuilder("download failed, ");
            if (baseException != null) {
                str = baseException.getMessage();
            } else {
                str = null;
            }
            sb.append(str);
            bVar.invoke(new Throwable(sb.toString()));
        }

        C24268b(C52671b bVar, File file, C52671b bVar2) {
            this.f64389a = bVar;
            this.f64390b = file;
            this.f64391c = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$c */
    public static final class C24269c extends C10105a {

        /* renamed from: a */
        final /* synthetic */ C24266e f64392a;

        /* renamed from: b */
        final /* synthetic */ C52671b f64393b;

        /* renamed from: c */
        final /* synthetic */ C52671b f64394c;

        /* renamed from: com.ss.android.ugc.aweme.bullet.e$c$a */
        static final class C24270a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C24269c f64395a;

            C24270a(C24269c cVar) {
                this.f64395a = cVar;
            }

            public final /* synthetic */ Object call() {
                this.f64395a.f64394c.invoke(new Exception("geckox update failed"));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.e$c$b */
        static final class C24271b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C24269c f64396a;

            /* renamed from: b */
            final /* synthetic */ String f64397b;

            C24271b(C24269c cVar, String str) {
                this.f64396a = cVar;
                this.f64397b = str;
            }

            public final /* synthetic */ Object call() {
                C52671b bVar = this.f64396a.f64393b;
                String str = this.f64397b;
                C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132050j);
                bVar.invoke(C10249c.m20729b(str));
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo18076a(String str, Throwable th) {
            super.mo18076a(str, th);
            C0013i.m18a((Callable<TResult>) new C24270a<TResult>(this), C0013i.f25b);
        }

        /* renamed from: a */
        public final void mo18075a(String str, long j) {
            C52711k.m112240b(str, "channel");
            super.mo18075a(str, j);
            C0013i.m18a((Callable<TResult>) new C24271b<TResult>(this, C47731bq.m103349e(this.f64392a.f64388b.mo41210d(), str)), C0013i.f25b);
        }

        C24269c(C24266e eVar, C52671b bVar, C52671b bVar2) {
            this.f64392a = eVar;
            this.f64393b = bVar;
            this.f64394c = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$d */
    public static final class C24272d extends C10105a {

        /* renamed from: a */
        final /* synthetic */ C24266e f64398a;

        /* renamed from: b */
        final /* synthetic */ C52671b f64399b;

        /* renamed from: c */
        final /* synthetic */ C52671b f64400c;

        /* renamed from: com.ss.android.ugc.aweme.bullet.e$d$a */
        static final class C24273a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C24272d f64401a;

            C24273a(C24272d dVar) {
                this.f64401a = dVar;
            }

            public final /* synthetic */ Object call() {
                this.f64401a.f64400c.invoke(new Exception("geckox update failed"));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.e$d$b */
        static final class C24274b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C24272d f64402a;

            /* renamed from: b */
            final /* synthetic */ String f64403b;

            C24274b(C24272d dVar, String str) {
                this.f64402a = dVar;
                this.f64403b = str;
            }

            public final /* synthetic */ Object call() {
                C52671b bVar = this.f64402a.f64399b;
                String str = this.f64403b;
                C52711k.m112236a((Object) str, LeakCanaryFileProvider.f132050j);
                bVar.invoke(C10249c.m20729b(str));
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo18076a(String str, Throwable th) {
            super.mo18076a(str, th);
            C0013i.m18a((Callable<TResult>) new C24273a<TResult>(this), C0013i.f25b);
        }

        /* renamed from: a */
        public final void mo18075a(String str, long j) {
            C52711k.m112240b(str, "channel");
            super.mo18075a(str, j);
            C0013i.m18a((Callable<TResult>) new C24274b<TResult>(this, C47731bq.m103349e(this.f64398a.f64388b.mo41210d(), str)), C0013i.f25b);
        }

        C24272d(C24266e eVar, C52671b bVar, C52671b bVar2) {
            this.f64398a = eVar;
            this.f64399b = bVar;
            this.f64400c = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.e$e */
    public static final class C24275e implements C10879a {

        /* renamed from: a */
        final /* synthetic */ C24266e f64404a;

        /* renamed from: b */
        final /* synthetic */ C52671b f64405b;

        /* renamed from: c */
        final /* synthetic */ String f64406c;

        /* renamed from: d */
        final /* synthetic */ C52671b f64407d;

        /* renamed from: com.ss.android.ugc.aweme.bullet.e$e$a */
        static final class C24276a<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C24275e f64408a;

            C24276a(C24275e eVar) {
                this.f64408a = eVar;
            }

            public final /* synthetic */ Object call() {
                this.f64408a.f64407d.invoke(new Exception("gecko update failed"));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.e$e$b */
        static final class C24277b<V> implements Callable<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C24275e f64409a;

            C24277b(C24275e eVar) {
                this.f64409a = eVar;
            }

            public final /* synthetic */ Object call() {
                C52671b bVar = this.f64409a.f64405b;
                String absolutePath = new File(this.f64409a.f64404a.f64388b.mo41208b(), this.f64409a.f64406c).getAbsolutePath();
                C52711k.m112236a((Object) absolutePath, "File(offlineConfig.offli…    channel).absolutePath");
                bVar.invoke(C10249c.m20729b(absolutePath));
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo19645a() {
            C0013i.m18a((Callable<TResult>) new C24277b<TResult>(this), C0013i.f25b);
        }

        /* renamed from: a */
        public final void mo19646a(String str, Exception exc) {
            C0013i.m18a((Callable<TResult>) new C24276a<TResult>(this), C0013i.f25b);
        }

        C24275e(C24266e eVar, C52671b bVar, String str, C52671b bVar2) {
            this.f64404a = eVar;
            this.f64405b = bVar;
            this.f64406c = str;
            this.f64407d = bVar2;
        }
    }

    /* renamed from: a */
    public final boolean mo18277a(String str) {
        C52711k.m112240b(str, "channel");
        C19767n nVar = this.f64388b;
        if (C47731bq.m103352f()) {
            return C47731bq.m103343c(nVar.mo41210d(), str);
        }
        C10885e b = C47731bq.m103335b(nVar);
        if (b != null) {
            return b.mo19666b(str);
        }
        return false;
    }

    /* renamed from: a */
    public final File mo18275a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        String scheme = uri.getScheme();
        if (scheme == null || scheme.hashCode() != 1303296464 || !scheme.equals("local_file")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append(" not found");
            throw new FileNotFoundException(sb.toString());
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode != -554435892) {
                if (hashCode == 1728122231 && authority.equals("absolute")) {
                    return new File(uri.getPath());
                }
            } else if (authority.equals("relative")) {
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                if (!C47731bq.m103352f() || C13248c.m26638a(path) || !C52830p.m112456b((CharSequence) path, (CharSequence) "/", false, 2, (Object) null)) {
                    File file = new File(this.f64388b.mo41208b(), path);
                    if (file.exists()) {
                        return file;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file.getPath());
                    sb2.append(" not found");
                    throw new FileNotFoundException(sb2.toString());
                }
                String e = C47731bq.m103349e(this.f64388b.mo41210d(), path);
                if (!C13248c.m26638a(e)) {
                    this.f64388b.mo41208b();
                    File file2 = new File(e);
                    if (file2.exists()) {
                        return file2;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(file2.getPath());
                    sb3.append(" not found");
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(path);
                sb4.append(" not found");
                throw new FileNotFoundException(sb4.toString());
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(uri);
        sb5.append(" not found");
        throw new FileNotFoundException(sb5.toString());
    }

    public C24266e(Application application, C19767n nVar) {
        C52711k.m112240b(application, "application");
        C52711k.m112240b(nVar, "offlineConfig");
        this.f64387a = application;
        this.f64388b = nVar;
    }

    /* renamed from: b */
    public final void mo18278b(Uri uri, C52671b<? super File, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "resolve");
        C52711k.m112240b(bVar2, "reject");
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode == 3213448 ? scheme.equals(WebKitApi.SCHEME_HTTP) : !(hashCode != 99617003 || !scheme.equals(WebKitApi.SCHEME_HTTPS))) {
                String uri2 = uri.toString();
                C52711k.m112236a((Object) uri2, "uri.toString()");
                File file = new File(this.f64387a.getCacheDir(), "rn_source_offline");
                if (!file.exists()) {
                    file.mkdirs();
                }
                String a = C9395d.m18571a(uri2);
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append(".jsbundle");
                File file2 = new File(file, sb.toString());
                if (file2.exists()) {
                    bVar.invoke(file2);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a);
                sb2.append(".jsbundle.tmp");
                File file3 = new File(file, sb2.toString());
                if (file3.exists()) {
                    file3.delete();
                }
                try {
                    if (!C48016e.m103944b(file.getPath())) {
                        C48016e.m103935a(file.getPath(), false);
                    }
                    DownloadTask url = Downloader.with(this.f64387a).url(uri2);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(a);
                    sb3.append(".jsbundle.tmp");
                    url.name(sb3.toString()).savePath(file.getPath()).mainThreadListener(new C24268b(bVar2, file2, bVar)).download();
                    return;
                } catch (IOException e) {
                    bVar2.invoke(new Throwable(e.getMessage()));
                }
            }
        }
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "resolve");
        C52711k.m112240b(bVar2, "reject");
        try {
            bVar.invoke(mo18275a(uri));
        } catch (Throwable th) {
            bVar2.invoke(th);
        }
    }

    /* renamed from: a */
    public final void mo18276a(Uri uri, C52671b<? super Uri, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2) {
        boolean z;
        String str;
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "resolve");
        C52711k.m112240b(bVar2, "reject");
        if (C52711k.m112239a((Object) uri.getScheme(), (Object) "local_file") && C52711k.m112239a((Object) uri.getAuthority(), (Object) "relative")) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            C10026a aVar = null;
            if (path.length() <= 1 || !C52830p.m112411b(path, "/", false, 2, null)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                path = null;
            }
            if (path == null) {
                str = null;
            } else if (path != null) {
                str = path.substring(1);
                C52711k.m112236a((Object) str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
            if (!C47731bq.m103352f()) {
                C10885e b = C47731bq.m103335b(this.f64388b);
                if (b != null) {
                    b.mo19663a(str, 0, (C10879a) new C24275e(this, bVar, str, bVar2));
                    return;
                }
                bVar2.invoke(new NullPointerException("GeckoClient is null"));
            } else if (C47731bq.m103354g()) {
                C10026a a = C47731bq.m103328a(this.f64388b);
                if (a != null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new TargetChannel(str));
                    Map map = hashMap;
                    String d = this.f64388b.mo41210d();
                    C52711k.m112236a((Object) d, "offlineConfig.geckoAccessKey");
                    map.put(d, arrayList);
                    a.mo18004a(map, (C10105a) new C24269c(this, bVar, bVar2));
                    return;
                }
                bVar2.invoke(new NullPointerException("GeckoClient is null"));
            } else {
                C19767n nVar = this.f64388b;
                if (C47731bq.f120241c != null) {
                    C48276f a2 = C48276f.m104588a();
                    if (a2 != null) {
                        String d2 = nVar.mo41210d();
                        C10026a a3 = a2.mo95784a(d2);
                        if (a3 == null) {
                            a3 = C47731bq.m103353g(d2);
                            a2.mo95785a(d2, a3);
                        }
                        aVar = a3;
                    }
                }
                if (aVar != null) {
                    aVar.mo18003a(C52575l.m112092a(str), (C10105a) new C24272d(this, bVar, bVar2));
                } else {
                    bVar2.invoke(new NullPointerException("GeckoClient is null"));
                }
            }
        }
    }
}
