package com.p683ss.android.ugc.asve.context;

import android.view.SurfaceHolder;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.context.C20355c.C20356a;
import com.p683ss.android.ugc.asve.p1238b.C20318a;
import com.p683ss.android.ugc.asve.p1238b.C20323e;
import com.p683ss.android.ugc.asve.p1238b.C20331k;
import com.p683ss.android.ugc.asve.recorder.C20504f;
import com.p683ss.android.ugc.asve.sandbox.C20809p;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.asve.context.h */
public interface C20363h {

    /* renamed from: com.ss.android.ugc.asve.context.h$a */
    public static final class C20364a {

        /* renamed from: com.ss.android.ugc.asve.context.h$a$a */
        public static final class C20366a implements C20355c {
            C20366a() {
            }

            /* renamed from: d */
            public final boolean mo43112d() {
                return true;
            }

            /* renamed from: f */
            public final boolean mo43114f() {
                return false;
            }

            /* renamed from: g */
            public final int mo43115g() {
                return R.drawable.z8;
            }

            /* renamed from: a */
            public final C20331k mo43109a() {
                return C20356a.m50407a(this);
            }

            /* renamed from: b */
            public final C20323e mo43110b() {
                return C20356a.m50408b(this);
            }

            /* renamed from: c */
            public final C20318a mo43111c() {
                return C20356a.m50409c(this);
            }

            /* renamed from: e */
            public final byte mo43113e() {
                return C20356a.m50410d(this);
            }

            /* renamed from: h */
            public final int[] mo43116h() {
                return C20356a.m50411e(this);
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$b */
        public static final class C20367b implements C20361f {
            C20367b() {
            }

            /* renamed from: a */
            public final boolean mo43173a() {
                return false;
            }

            /* renamed from: b */
            public final String mo43174b() {
                return "";
            }

            /* renamed from: c */
            public final String mo43175c() {
                return "";
            }

            /* renamed from: d */
            public final int mo43176d() {
                return 0;
            }

            /* renamed from: e */
            public final int mo43177e() {
                return 0;
            }

            /* renamed from: f */
            public final boolean mo43178f() {
                return false;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$c */
        public static final class C20368c implements C20362g {
            C20368c() {
            }

            /* renamed from: a */
            public final String mo43179a() {
                return "";
            }

            /* renamed from: b */
            public final String mo43180b() {
                return "";
            }

            /* renamed from: c */
            public final float mo43181c() {
                return 0.66f;
            }

            /* renamed from: d */
            public final boolean mo43182d() {
                return true;
            }

            /* renamed from: e */
            public final int mo43183e() {
                return R.array.a6;
            }

            /* renamed from: f */
            public final int mo43184f() {
                return R.array.a5;
            }

            /* renamed from: g */
            public final int mo43185g() {
                return R.drawable.b9f;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.context.h$a$d */
        public static final class C20369d implements C20504f {

            /* renamed from: a */
            private final File f55868a = C20315a.m50092a().mo43158l();

            /* renamed from: b */
            private final File f55869b = new File(C20315a.m50092a().mo43158l(), "segs");

            /* renamed from: c */
            private final File f55870c = new File(mo43188b(), "video");

            /* renamed from: d */
            private final File f55871d = new File(mo43188b(), "audio");

            /* renamed from: e */
            private final File f55872e = new File(mo43186a(), "photo");

            /* renamed from: a */
            public final File mo43186a() {
                return this.f55868a;
            }

            /* renamed from: b */
            public final File mo43188b() {
                return this.f55869b;
            }

            /* renamed from: c */
            public final File mo43190c() {
                return this.f55870c;
            }

            /* renamed from: d */
            public final File mo43191d() {
                return this.f55871d;
            }

            /* renamed from: e */
            public final File mo43192e() {
                return this.f55872e;
            }

            C20369d() {
            }

            /* renamed from: a */
            public final String mo43187a(int i) {
                StringBuilder sb = new StringBuilder("/");
                sb.append(i);
                sb.append(".v");
                return sb.toString();
            }

            /* renamed from: b */
            public final String mo43189b(int i) {
                StringBuilder sb = new StringBuilder("/");
                sb.append(i);
                sb.append(".a");
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    Boolean mo43117a();

    /* renamed from: b */
    boolean mo43118b();

    /* renamed from: c */
    SurfaceHolder mo43119c();

    /* renamed from: d */
    C20504f mo43120d();

    /* renamed from: e */
    C52847n<Integer, Integer> mo43121e();

    /* renamed from: f */
    boolean mo43122f();

    /* renamed from: g */
    boolean mo43123g();

    /* renamed from: h */
    boolean mo43124h();

    /* renamed from: i */
    boolean mo43125i();

    /* renamed from: j */
    C20361f mo43126j();

    /* renamed from: k */
    C20362g mo43127k();

    /* renamed from: l */
    C20357d mo43128l();

    /* renamed from: m */
    C20355c mo43129m();

    /* renamed from: n */
    boolean mo43130n();

    /* renamed from: o */
    C20809p mo43131o();

    /* renamed from: p */
    boolean mo43132p();

    /* renamed from: q */
    boolean mo43133q();

    /* renamed from: r */
    boolean mo43134r();

    /* renamed from: s */
    long mo43135s();
}
