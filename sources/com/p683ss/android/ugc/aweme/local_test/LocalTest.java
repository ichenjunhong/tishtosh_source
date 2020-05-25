package com.p683ss.android.ugc.aweme.local_test;

import android.content.Context;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.local_test.LocalTest */
public final class LocalTest {

    /* renamed from: a */
    private LocalTestApi f92807a;

    /* renamed from: com.ss.android.ugc.aweme.local_test.LocalTest$DefaultLocalTestService */
    public static final class DefaultLocalTestService implements LocalTestApi {
        private static DefaultLocalTestService sInstance;

        public final void checkApi(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        }

        public final String getDefaultRNTestHost() {
            return "";
        }

        public final List<String> getJsbSafeHost() {
            return null;
        }

        public final void openRobustActivity(Context context) {
        }

        public final boolean shouldBulletShowDebugTagView() {
            return true;
        }

        public static DefaultLocalTestService inst() {
            if (sInstance == null) {
                synchronized (DefaultLocalTestService.class) {
                    if (sInstance == null) {
                        sInstance = new DefaultLocalTestService();
                    }
                }
            }
            return sInstance;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.local_test.LocalTest$a */
    static final class C36250a {

        /* renamed from: a */
        public static final LocalTest f92808a = new LocalTest();
    }

    /* renamed from: a */
    public static LocalTestApi m81850a() {
        return C36250a.f92808a.f92807a;
    }

    private LocalTest() {
        if (this.f92807a == null) {
            this.f92807a = DefaultLocalTestService.inst();
        }
    }
}
