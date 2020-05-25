package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.twitter.sdk.android.core.C52068b;
import com.twitter.sdk.android.core.C52077i;
import com.twitter.sdk.android.core.C52188j;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.C52220o;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52229t;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.scribe.C52143a;
import com.twitter.sdk.android.core.internal.scribe.C52154ae;
import com.twitter.sdk.android.core.internal.scribe.C52158e.C52159a;

public class TwitterAuthClient {

    /* renamed from: a */
    final C52225r f129671a;

    /* renamed from: b */
    public final C52083b f129672b;

    /* renamed from: c */
    final C52189k<C52231v> f129673c;

    /* renamed from: d */
    final TwitterAuthConfig f129674d;

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterAuthClient$a */
    static class C52078a {

        /* renamed from: a */
        public static final C52083b f129675a = new C52083b();
    }

    /* renamed from: com.twitter.sdk.android.core.identity.TwitterAuthClient$b */
    static class C52079b extends C52068b<C52231v> {

        /* renamed from: a */
        private final C52189k<C52231v> f129676a;

        /* renamed from: b */
        private final C52068b<C52231v> f129677b;

        /* renamed from: a */
        public final void mo23367a(C52229t tVar) {
            this.f129677b.mo23367a(tVar);
        }

        /* renamed from: a */
        public final void mo23366a(C52077i<C52231v> iVar) {
            this.f129676a.mo108770a((C52188j) iVar.f129666a);
            this.f129677b.mo23366a(iVar);
        }

        C52079b(C52189k<C52231v> kVar, C52068b<C52231v> bVar) {
            this.f129676a = kVar;
            this.f129677b = bVar;
        }
    }

    public TwitterAuthClient() {
        this(C52225r.m111638a(), C52225r.m111638a().f130052e, C52225r.m111638a().f130049b, C52078a.f129675a);
    }

    /* renamed from: a */
    public final void mo108777a(Activity activity, C52068b<C52231v> bVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null.");
        } else if (bVar == null) {
            throw new IllegalArgumentException("Callback must not be null.");
        } else if (!activity.isFinishing()) {
            C52143a a = C52154ae.m111531a();
            boolean z = true;
            boolean z2 = false;
            if (a != null) {
                a.mo108852a(new C52159a().mo108873a("android").mo108875b("login").mo108876c("").mo108877d("").mo108878e("").mo108879f("impression").mo108874a());
            }
            C52079b bVar2 = new C52079b(this.f129673c, bVar);
            PackageManager packageManager = activity.getPackageManager();
            if (!C52092g.m111429a(packageManager, "com.twitter.android", "3082025d308201c6a00302010202044bd76cce300d06092a864886f70d01010505003073310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f31163014060355040a130d547769747465722c20496e632e310f300d060355040b13064d6f62696c65311630140603550403130d4c656c616e6420526563686973301e170d3130303432373233303133345a170d3438303832353233303133345a3073310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f31163014060355040a130d547769747465722c20496e632e310f300d060355040b13064d6f62696c65311630140603550403130d4c656c616e642052656368697330819f300d06092a864886f70d010101050003818d003081890281810086233c2e51c62232d49cc932e470713d63a6a1106b38f9e442e01bc79ca4f95c72b2cb3f1369ef7dea6036bff7c4b2828cb3787e7657ad83986751ced5b131fcc6f413efb7334e32ed9787f9e9a249ae108fa66009ac7a7932c25d37e1e07d4f9f66aa494c270dbac87d261c9668d321c2fba4ef2800e46671a597ff2eac5d7f0203010001300d06092a864886f70d0101050500038181003e1f01cb6ea8be8d2cecef5cd2a64c97ba8728aa5f08f8275d00508d64d139b6a72c5716b40a040df0eeeda04de9361107e123ee8d3dc05e70c8a355f46dbadf1235443b0b214c57211afd4edd147451c443d49498d2a7ff27e45a99c39b9e47429a1dae843ba233bf8ca81296dbe1dc5c5434514d995b0279246809392a219b") && !C52092g.m111429a(packageManager, "com.twitter.android.beta", "308203523082023aa00302010202044fd0006b300d06092a864886f70d0101050500306b310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130754776974746572310f300d060355040b13064d6f62696c65311430120603550403130b4a6f6e617468616e204c65301e170d3132303630373031313431395a170d3339313032343031313431395a306b310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130754776974746572310f300d060355040b13064d6f62696c65311430120603550403130b4a6f6e617468616e204c6530820122300d06092a864886f70d01010105000382010f003082010a028201010089e6cbdfed4288a9c0a215d33d4fa978a5bdd20be426ef4b497d358a9fd1c6efec9684f059f6955e60e5fda1b5910bb2d097e7421a78f9c81e95cd8ef3bf50add7f8d9f073c0478736a6c7fd38c5871559783a76420d37f3f874f2114ec02532e85587791d24037485b1b95ec8cbc75b52042867988b51c7c3589d5b5972fd20a2e8a7c9ced986873f5008a418b2921daa7cfb78afc174eecdb8a79dc0961bea9740d09c4656ac9b8c86263a788e35af1d4a3f86ce053a1aefb5369def91614a390219f896f378712376baa05934a341798950e229f4f735b86004952b259f23cc9fc3b8c1bc8171984884dc92940e91f2e9a78a84a78f0c2946b7e37bbf3b9b0203010001300d06092a864886f70d010105050003820101001cf15250365e66cc87bb5054de1661266cf87907841016b20dfa1f9f59842020cbc33f9b4d41717db0428d11696a0bade6a4950a48cc4fa8ae56c850647379a5c2d977436b644162c453dd36b7745ccb9ff0b5fc070125024de73dab6dcda5c69372e978a49865f569927199ed0f61d7cbee1839079a7da2e83f8c90f7421a8c81b3f17f1cc05d52aedac9acd6e092ffd9ad572960e779a5b91a78e1aeb2b3c7b24464bd223c745e40abd74fc586310809520d183443fcca3c6ade3be458afedbd3325df9c0e552636e35bb55b240eb8c0ba3973c4fb81213f22363be2d70e85014650c2f4fc679747a7ec31ea7b08da7dd9b9ba279a7fbbc1bd440fbe831bf4")) {
                z = false;
            }
            if (z) {
                z2 = this.f129672b.mo108787a(activity, new C52092g(this.f129674d, bVar2, 140));
            }
            if (!z2 && !this.f129672b.mo108787a(activity, new C52088d(this.f129674d, bVar2, 140))) {
                bVar2.mo23367a((C52229t) new C52220o("Authorize failed."));
            }
        }
    }

    private TwitterAuthClient(C52225r rVar, TwitterAuthConfig twitterAuthConfig, C52189k<C52231v> kVar, C52083b bVar) {
        this.f129671a = rVar;
        this.f129672b = bVar;
        this.f129674d = twitterAuthConfig;
        this.f129673c = kVar;
    }
}
