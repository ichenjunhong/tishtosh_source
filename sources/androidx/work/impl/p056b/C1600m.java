package androidx.work.impl.p056b;

import androidx.work.C1531a;
import androidx.work.C1542h;
import androidx.work.C1543i.C1544a;

/* renamed from: androidx.work.impl.b.m */
public final class C1600m {

    /* renamed from: androidx.work.impl.b.m$1 */
    static /* synthetic */ class C16011 {

        /* renamed from: b */
        static final /* synthetic */ int[] f5643b = new int[C1531a.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f5644c = new int[C1542h.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        static {
            /*
                androidx.work.h[] r0 = androidx.work.C1542h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5644c = r0
                r0 = 1
                int[] r1 = f5644c     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.work.h r2 = androidx.work.C1542h.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f5644c     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.work.h r3 = androidx.work.C1542h.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f5644c     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.work.h r4 = androidx.work.C1542h.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f5644c     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.work.h r5 = androidx.work.C1542h.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f5644c     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.work.h r6 = androidx.work.C1542h.METERED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.work.a[] r5 = androidx.work.C1531a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f5643b = r5
                int[] r5 = f5643b     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.work.a r6 = androidx.work.C1531a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r5 = f5643b     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.work.a r6 = androidx.work.C1531a.LINEAR     // Catch:{ NoSuchFieldError -> 0x005d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                androidx.work.i$a[] r5 = androidx.work.C1543i.C1544a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f5642a = r5
                int[] r5 = f5642a     // Catch:{ NoSuchFieldError -> 0x0070 }
                androidx.work.i$a r6 = androidx.work.C1543i.C1544a.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = f5642a     // Catch:{ NoSuchFieldError -> 0x007a }
                androidx.work.i$a r5 = androidx.work.C1543i.C1544a.RUNNING     // Catch:{ NoSuchFieldError -> 0x007a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f5642a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.work.i$a r1 = androidx.work.C1543i.C1544a.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f5642a     // Catch:{ NoSuchFieldError -> 0x008e }
                androidx.work.i$a r1 = androidx.work.C1543i.C1544a.FAILED     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r0 = f5642a     // Catch:{ NoSuchFieldError -> 0x0098 }
                androidx.work.i$a r1 = androidx.work.C1543i.C1544a.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                int[] r0 = f5642a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                androidx.work.i$a r1 = androidx.work.C1543i.C1544a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p056b.C1600m.C16011.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m5638a(C1544a aVar) {
        switch (aVar) {
            case ENQUEUED:
                return 0;
            case RUNNING:
                return 1;
            case SUCCEEDED:
                return 2;
            case FAILED:
                return 3;
            case BLOCKED:
                return 4;
            case CANCELLED:
                return 5;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(aVar);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static C1531a m5642b(int i) {
        switch (i) {
            case 0:
                return C1531a.EXPONENTIAL;
            case 1:
                return C1531a.LINEAR;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(i);
                sb.append(" to BackoffPolicy");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static C1542h m5643c(int i) {
        switch (i) {
            case 0:
                return C1542h.NOT_REQUIRED;
            case 1:
                return C1542h.CONNECTED;
            case 2:
                return C1542h.UNMETERED;
            case 3:
                return C1542h.NOT_ROAMING;
            case 4:
                return C1542h.METERED;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(i);
                sb.append(" to NetworkType");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|(0)|23|24|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[SYNTHETIC, Splitter:B:21:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC, Splitter:B:29:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1536d m5639a(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0049, all -> 0x003d }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0049, all -> 0x003d }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
        L_0x0017:
            if (r6 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            androidx.work.d$a r5 = new androidx.work.d$a     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            r5.<init>(r3, r4)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            java.util.Set<androidx.work.d$a> r3 = r0.f5531a     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            r3.add(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0039 }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            r1.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x004f
        L_0x0039:
            r6 = move-exception
            goto L_0x0040
        L_0x003b:
            r6 = r2
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
            r2 = r6
            r6 = r0
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r6
        L_0x0049:
            if (r6 == 0) goto L_0x0035
            r6.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0035
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p056b.C1600m.m5639a(byte[]):androidx.work.d");
    }

    /* renamed from: a */
    public static C1544a m5640a(int i) {
        switch (i) {
            case 0:
                return C1544a.ENQUEUED;
            case 1:
                return C1544a.RUNNING;
            case 2:
                return C1544a.SUCCEEDED;
            case 3:
                return C1544a.FAILED;
            case 4:
                return C1544a.BLOCKED;
            case 5:
                return C1544a.CANCELLED;
            default:
                StringBuilder sb = new StringBuilder("Could not convert ");
                sb.append(i);
                sb.append(" to State");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|(3:4|5|(5:6|7|(2:10|8)|11|12))|13|14|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC, Splitter:B:21:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[SYNTHETIC, Splitter:B:29:0x0052] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m5641a(androidx.work.C1536d r4) {
        /*
            int r0 = r4.mo5915a()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0050, all -> 0x0045 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0050, all -> 0x0045 }
            int r1 = r4.mo5915a()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.util.Set<androidx.work.d$a> r4 = r4.f5531a     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
        L_0x001f:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            androidx.work.d$a r1 = (androidx.work.C1536d.C1537a) r1     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            android.net.Uri r3 = r1.f5532a     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            boolean r1 = r1.f5533b     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            goto L_0x001f
        L_0x003a:
            r2.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r0.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x0041:
            r4 = move-exception
            goto L_0x0047
        L_0x0043:
            r1 = r2
            goto L_0x0050
        L_0x0045:
            r4 = move-exception
            r2 = r1
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            r0.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r4
        L_0x0050:
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003d
        L_0x0056:
            byte[] r4 = r0.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p056b.C1600m.m5641a(androidx.work.d):byte[]");
    }
}
