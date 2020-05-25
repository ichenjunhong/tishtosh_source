package com.bytedance.android.livesdk.p399o.p402c;

/* renamed from: com.bytedance.android.livesdk.o.c.g */
public class C8056g {

    /* renamed from: a */
    public long f22006a;

    /* renamed from: b */
    public long f22007b;

    /* renamed from: c */
    public String f22008c;

    /* renamed from: d */
    public String f22009d;

    /* renamed from: e */
    public String f22010e;

    /* renamed from: f */
    public String f22011f;

    /* renamed from: g */
    public long f22012g;

    /* renamed from: h */
    public String f22013h;

    /* renamed from: i */
    public String f22014i;

    /* renamed from: j */
    public int f22015j;

    /* renamed from: k */
    public String f22016k;

    /* renamed from: a */
    public final C8056g mo14205a(int i) {
        this.f22015j = i;
        return this;
    }

    /* renamed from: b */
    public final C8056g mo14209b(long j) {
        this.f22006a = j;
        return this;
    }

    /* renamed from: c */
    public final C8056g mo14211c(long j) {
        this.f22007b = j;
        return this;
    }

    /* renamed from: a */
    public final C8056g mo14208a(String str) {
        this.f22009d = str;
        return this;
    }

    /* renamed from: b */
    public final C8056g mo14210b(String str) {
        this.f22014i = str;
        return this;
    }

    /* renamed from: c */
    public final C8056g mo14212c(String str) {
        this.f22008c = str;
        return this;
    }

    /* renamed from: a */
    public final C8056g mo14207a(Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = "1";
        } else {
            str = "0";
        }
        this.f22011f = str;
        return this;
    }

    /* renamed from: a */
    public final C8056g mo14206a(long j) {
        String str;
        String[] strArr = {"mutual_follow", "recommend", "recent", "other_follow"};
        int i = ((int) j) - 1;
        if (i >= 4 || i < 0) {
            str = "";
        } else {
            str = strArr[i];
        }
        this.f22010e = str;
        return this;
    }
}
