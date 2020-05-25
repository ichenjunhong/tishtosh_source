package com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn.model.RNBundleInfo;
import com.p683ss.android.ugc.aweme.utils.C47682ar;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52808d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.c */
public final class C27207c {

    /* renamed from: b */
    public static final C52668f f71835b = C52732g.m112285a(C27209b.f71841a);

    /* renamed from: c */
    public static final C27208a f71836c = new C27208a(null);

    /* renamed from: a */
    public RNBundleInfo f71837a;

    /* renamed from: d */
    private boolean f71838d;

    /* renamed from: e */
    private boolean f71839e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.c$a */
    public static final class C27208a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71840a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27208a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/ReactAssetResourceChecker;"))};

        private C27208a() {
        }

        /* renamed from: a */
        public static C27207c m65631a() {
            return (C27207c) C27207c.f71835b.getValue();
        }

        public /* synthetic */ C27208a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m65632a(String str) {
            String str2;
            Object obj;
            C52711k.m112240b(str, "assetName");
            if (!C52830p.m112402a(str)) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    InputStream open = C11010c.m22280a().getAssets().open(str);
                    if (open != null) {
                        C52647c.m112189a(open, null);
                        return true;
                    }
                    obj = C52848o.m114620constructorimpl(null);
                    C52848o.m114619boximpl(obj);
                } catch (Throwable th) {
                    obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
                }
            }
            return false;
        }

        /* renamed from: b */
        public static RNBundleInfo m65633b(String str) {
            Closeable bufferedReader;
            Throwable th;
            Throwable th2;
            C52711k.m112240b(str, "assetName");
            try {
                InputStream open = C11010c.m22280a().getAssets().open(str);
                if (open == null) {
                    return null;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(open, C52808d.f131043a), VideoCacheReadBuffersizeExperiment.DEFAULT);
                try {
                    RNBundleInfo rNBundleInfo = (RNBundleInfo) new C17971f().mo34883a((Reader) (BufferedReader) bufferedReader, RNBundleInfo.class);
                    C52647c.m112189a(bufferedReader, null);
                    return rNBundleInfo;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r1;
                    th2 = th4;
                }
                C52647c.m112189a(bufferedReader, th);
                throw th2;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.c$b */
    static final class C27209b extends C52712l implements C52670a<C27207c> {

        /* renamed from: a */
        public static final C27209b f71841a = new C27209b();

        C27209b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27207c(null);
        }
    }

    /* renamed from: a */
    public final String mo55542a() {
        C27207c cVar;
        if (this.f71838d) {
            cVar = this;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return "offline/rn_base_android/base.android.jsbundle";
        }
        return null;
    }

    /* renamed from: b */
    public final String mo55543b() {
        C27207c cVar;
        if (this.f71839e) {
            cVar = this;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return "offline/rn_snapshot/blobdata";
        }
        return null;
    }

    private C27207c() {
        this.f71838d = C27208a.m65632a("offline/rn_base_android/base.android.jsbundle");
        this.f71839e = C27208a.m65632a("offline/rn_snapshot/blobdata");
        if (this.f71838d) {
            this.f71837a = C27208a.m65633b("offline/rn_base_android/bundle_info.json");
        }
    }

    /* renamed from: c */
    public final boolean mo55544c() {
        if (C47682ar.m103195a(mo55542a()) || C47682ar.m103195a(mo55543b())) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C27207c(C52707g gVar) {
        this();
    }
}
