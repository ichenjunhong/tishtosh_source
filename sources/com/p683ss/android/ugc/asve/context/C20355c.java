package com.p683ss.android.ugc.asve.context;

import com.p683ss.android.ugc.asve.p1238b.C20318a;
import com.p683ss.android.ugc.asve.p1238b.C20323e;
import com.p683ss.android.ugc.asve.p1238b.C20331k;
import com.p683ss.android.ugc.asve.p1238b.C20336o;

/* renamed from: com.ss.android.ugc.asve.context.c */
public interface C20355c {

    /* renamed from: com.ss.android.ugc.asve.context.c$a */
    public static final class C20356a {
        /* renamed from: a */
        public static C20331k m50407a(C20355c cVar) {
            return C20331k.AS_CAMERA_LENS_FRONT;
        }

        /* renamed from: b */
        public static C20323e m50408b(C20355c cVar) {
            return C20323e.AS_CAMERA_1;
        }

        /* renamed from: c */
        public static C20318a m50409c(C20355c cVar) {
            return C20318a.AS_HW_CHECK_LEVEL_LIMITED;
        }

        /* renamed from: e */
        public static int[] m50411e(C20355c cVar) {
            return new int[0];
        }

        /* renamed from: d */
        public static byte m50410d(C20355c cVar) {
            return C20336o.AS_OPTION_FLAG_PICTURE_SIZE.getOption();
        }
    }

    /* renamed from: a */
    C20331k mo43109a();

    /* renamed from: b */
    C20323e mo43110b();

    /* renamed from: c */
    C20318a mo43111c();

    /* renamed from: d */
    boolean mo43112d();

    /* renamed from: e */
    byte mo43113e();

    /* renamed from: f */
    boolean mo43114f();

    /* renamed from: g */
    int mo43115g();

    /* renamed from: h */
    int[] mo43116h();
}
