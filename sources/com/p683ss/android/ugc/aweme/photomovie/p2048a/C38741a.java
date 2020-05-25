package com.p683ss.android.ugc.aweme.photomovie.p2048a;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.dfbase.C27532a;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photomovie.a.a */
public final class C38741a extends C27532a {

    /* renamed from: f */
    public static final C38742a f98566f = new C38742a(null);

    /* renamed from: d */
    public final String f98567d;

    /* renamed from: e */
    public final PhotoMovieServiceLoadCallback f98568e;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.a.a$a */
    public static final class C38742a {
        private C38742a() {
        }

        public /* synthetic */ C38742a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.a.a$b */
    public static final class C38743b implements C27559n {

        /* renamed from: a */
        final /* synthetic */ C38741a f98569a;

        C38743b(C38741a aVar) {
            this.f98569a = aVar;
        }

        /* renamed from: b */
        public final void mo50034b(boolean z) {
            this.f98569a.mo78697a(10000, "Dynamic module install failed");
        }

        /* renamed from: a */
        public final void mo50033a(boolean z) {
            try {
                Object newInstance = Class.forName("com.ss.android.ugc.aweme.services.photomovie.PhotoMovieService").newInstance();
                if (newInstance != null) {
                    IPhotoMovieService iPhotoMovieService = (IPhotoMovieService) newInstance;
                    C38741a aVar = this.f98569a;
                    C23569o.m57776a("dynamic_install_photomovie_status_rate", 0, C23088c.m56631a().mo47824a("scene", aVar.f98567d).mo47824a("installed_modules", C27558m.m66223a().toString()).mo47825b());
                    aVar.f98568e.onPhotoMovieServiceLoadSuccess(iPhotoMovieService);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.services.photomovie.IPhotoMovieService");
            } catch (ClassNotFoundException unused) {
                this.f98569a.mo78697a(10001, "Installed success but class not found");
            }
        }
    }

    /* renamed from: b */
    public final boolean mo55969b() {
        mo55967a(new C38743b(this));
        return super.mo55969b();
    }

    public C38741a(String str, PhotoMovieServiceLoadCallback photoMovieServiceLoadCallback) {
        C52711k.m112240b(str, "scene");
        C52711k.m112240b(photoMovieServiceLoadCallback, "mCallback");
        super("df_photomovie");
        this.f98567d = str;
        this.f98568e = photoMovieServiceLoadCallback;
    }

    /* renamed from: a */
    public final void mo78697a(int i, String str) {
        C23569o.m57776a("dynamic_install_photomovie_status_rate", 1, C23088c.m56631a().mo47824a("scene", this.f98567d).mo47822a("errorCode", Integer.valueOf(i)).mo47824a("installed_modules", C27558m.m66223a().toString()).mo47824a("errorMsg", str).mo47825b());
        this.f98568e.onPhotoMovieServiceLoadFailed(i, str);
    }
}
