package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

public final class bye {

    /* renamed from: com.google.android.gms.internal.ads.bye$a */
    public static final class C15742a extends axz<C15742a, C15743a> implements azl {
        static final C15742a zzcev = new C15742a();
        private static volatile azv<C15742a> zzdu;

        /* renamed from: com.google.android.gms.internal.ads.bye$a$a */
        public static final class C15743a extends C15671a<C15742a, C15743a> implements azl {
            /* synthetic */ C15743a(byf byf) {
                this();
            }

            private C15743a() {
                super(C15742a.zzcev);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.bye$a$b */
        public enum C15744b implements ayc {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
            AD_FAILED_TO_LOAD_NETWORK_ERROR(BaseNotice.HASHTAG),
            AD_FAILED_TO_LOAD_TIMEOUT(102),
            AD_FAILED_TO_LOAD_CANCELLED(103),
            AD_FAILED_TO_LOAD_NO_ERROR(104),
            AD_FAILED_TO_LOAD_NOT_FOUND(105),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(BaseNotice.CHECK_PROFILE),
            REQUEST_FAILED_TO_BUILD_URL(BaseNotice.COMMENT_REPLY_WITH_VIDEO),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
            REQUEST_FAILED_TO_RENDER(1007),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002),
            OFFLINE_UPLOAD(10003);
            

            /* renamed from: y */
            private static final ayd<C15744b> f44570y = null;

            /* renamed from: z */
            private final int f44571z;

            public final int zzac() {
                return this.f44571z;
            }

            private C15744b(int i) {
                this.f44571z = i;
            }

            static {
                f44570y = new byg();
            }
        }

        private C15742a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo28773a(int i, Object obj, Object obj2) {
            switch (byf.f44572a[i - 1]) {
                case 1:
                    return new C15742a();
                case 2:
                    return new C15743a(null);
                case 3:
                    return m34713a((azj) zzcev, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzcev;
                case 5:
                    azv<C15742a> azv = zzdu;
                    if (azv == null) {
                        synchronized (C15742a.class) {
                            azv = zzdu;
                            if (azv == null) {
                                azv = new C15672b<>(zzcev);
                                zzdu = azv;
                            }
                        }
                    }
                    return azv;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            axz.m34715a(C15742a.class, zzcev);
        }
    }
}
