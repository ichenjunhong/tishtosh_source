package com.p683ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.C41978ap;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import java.io.File;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.gif.a */
public final class C42016a {

    /* renamed from: a */
    public static String f106372a;

    /* renamed from: b */
    public static List<? extends C41978ap> f106373b = C52575l.m112097a();

    /* renamed from: c */
    public static final C42016a f106374c = new C42016a();

    /* renamed from: com.ss.android.ugc.aweme.share.gif.a$a */
    public static final class C42017a implements C47939a {

        /* renamed from: a */
        final /* synthetic */ C42025h f106375a;

        /* renamed from: b */
        final /* synthetic */ Activity f106376b;

        /* renamed from: c */
        final /* synthetic */ Aweme f106377c;

        /* renamed from: d */
        final /* synthetic */ String f106378d;

        /* renamed from: e */
        final /* synthetic */ String f106379e;

        /* renamed from: b */
        public final void mo60069b() {
        }

        /* renamed from: a */
        public final void mo60068a() {
            C42025h hVar = this.f106375a;
            if (hVar != null) {
                hVar.mo86098a(this.f106376b, this.f106377c, this.f106378d, this.f106379e);
            }
        }

        public C42017a(C42025h hVar, Activity activity, Aweme aweme, String str, String str2) {
            this.f106375a = hVar;
            this.f106376b = activity;
            this.f106377c = aweme;
            this.f106378d = str;
            this.f106379e = str2;
        }
    }

    private C42016a() {
    }

    /* renamed from: a */
    public static List<C41978ap> m91989a() {
        return f106373b;
    }

    /* renamed from: b */
    public static String m91990b() {
        return f106372a;
    }

    static {
        File cacheDir = C11010c.m22280a().getCacheDir();
        C52711k.m112236a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
        String path = new File(cacheDir.getPath(), "gif").getPath();
        C52711k.m112236a((Object) path, "File(AppContextManager.g…acheDir.path, \"gif\").path");
        f106372a = path;
    }

    /* renamed from: a */
    public static String m91988a(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        String aid = aweme.getAid();
        C52711k.m112236a((Object) aid, "aweme.aid");
        return aid;
    }
}
