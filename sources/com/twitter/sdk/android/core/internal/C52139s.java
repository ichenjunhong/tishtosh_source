package com.twitter.sdk.android.core.internal;

/* renamed from: com.twitter.sdk.android.core.internal.s */
public final class C52139s {

    /* renamed from: com.twitter.sdk.android.core.internal.s$1 */
    public static /* synthetic */ class C521401 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f129779a = new int[C52141a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.twitter.sdk.android.core.internal.s$a[] r0 = com.twitter.sdk.android.core.internal.C52139s.C52141a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f129779a = r0
                int[] r0 = f129779a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.twitter.sdk.android.core.internal.s$a r1 = com.twitter.sdk.android.core.internal.C52139s.C52141a.NORMAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f129779a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.twitter.sdk.android.core.internal.s$a r1 = com.twitter.sdk.android.core.internal.C52139s.C52141a.BIGGER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f129779a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.twitter.sdk.android.core.internal.s$a r1 = com.twitter.sdk.android.core.internal.C52139s.C52141a.MINI     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f129779a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.twitter.sdk.android.core.internal.s$a r1 = com.twitter.sdk.android.core.internal.C52139s.C52141a.ORIGINAL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f129779a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.twitter.sdk.android.core.internal.s$a r1 = com.twitter.sdk.android.core.internal.C52139s.C52141a.REASONABLY_SMALL     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.internal.C52139s.C521401.<clinit>():void");
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.s$a */
    public enum C52141a {
        NORMAL("_normal"),
        BIGGER("_bigger"),
        MINI("_mini"),
        ORIGINAL("_original"),
        REASONABLY_SMALL("_reasonably_small");
        
        public final String suffix;

        private C52141a(String str) {
            this.suffix = str;
        }
    }
}
