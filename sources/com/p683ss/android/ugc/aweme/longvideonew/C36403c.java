package com.p683ss.android.ugc.aweme.longvideonew;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.c */
public final class C36403c {

    /* renamed from: a */
    public static final C36403c f93225a = new C36403c();

    private C36403c() {
    }

    /* renamed from: a */
    public static int m82156a(int i) {
        if (i <= 0) {
            return 0;
        }
        return i / 1000;
    }

    /* renamed from: b */
    private static String m82159b(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        StringBuilder sb = new StringBuilder("0");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final CharSequence mo75344a(float f, int i) {
        boolean z;
        int i2 = (int) ((f * ((float) i)) / 100.0f);
        if (i >= 3600) {
            z = true;
        } else {
            z = false;
        }
        return m82157a(i2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m82157a(int i, boolean z) {
        if (i >= 3600) {
            int i2 = i / 3600;
            int i3 = i % 3600;
            StringBuilder sb = new StringBuilder();
            sb.append(m82159b(i2));
            sb.append(':');
            sb.append(m82157a(i3, false));
            return sb.toString();
        } else if (z) {
            StringBuilder sb2 = new StringBuilder("00:");
            sb2.append(m82159b(i / 60));
            sb2.append(':');
            sb2.append(m82159b(i % 60));
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m82159b(i / 60));
            sb3.append(':');
            sb3.append(m82159b(i % 60));
            return sb3.toString();
        }
    }
}
