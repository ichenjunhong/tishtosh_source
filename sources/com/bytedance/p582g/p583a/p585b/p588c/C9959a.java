package com.bytedance.p582g.p583a.p585b.p588c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.p582g.p583a.p585b.p586a.C9954b;
import com.bytedance.p582g.p583a.p585b.p586a.C9955c;
import com.bytedance.p582g.p583a.p591c.C9985a;
import com.bytedance.p582g.p583a.p591c.C9985a.C9986a;
import com.bytedance.p582g.p583a.p591c.C9985a.C9988c;
import com.bytedance.p582g.p583a.p591c.C9990c;
import java.util.List;

/* renamed from: com.bytedance.g.a.b.c.a */
public final class C9959a implements C9963b {

    /* renamed from: a */
    public C9985a f27063a;

    /* renamed from: b */
    volatile long f27064b;

    /* renamed from: c */
    boolean f27065c;

    /* renamed from: d */
    int f27066d;

    /* renamed from: e */
    Context f27067e;

    /* renamed from: f */
    String f27068f;

    /* renamed from: a */
    public final boolean mo17926a() {
        if (this.f27064b == 1800000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo17927a(String str) {
        return this.f27063a.mo17954a(C9990c.m20086a(str));
    }

    public C9959a(Context context, final String str) {
        this.f27068f = str;
        this.f27067e = context;
        final String str2 = str;
        C99623 r0 = new C9985a(context.getApplicationContext(), new C9986a() {
            /* renamed from: a */
            public final String mo17928a() {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("sdk_monitor");
                return sb.toString();
            }

            /* renamed from: b */
            public final List<String> mo17929b() {
                String str = str;
                String str2 = "sdk_monitor";
                if (TextUtils.isEmpty(str) || C9955c.f27036b.get(str) == null) {
                    return C9955c.f27035a.mo17913a(str2);
                }
                return ((C9954b) C9955c.f27036b.get(str)).mo17913a(str2);
            }

            /* renamed from: c */
            public final int mo17930c() {
                String str = str;
                if (TextUtils.isEmpty(str) || C9955c.f27036b.get(str) == null) {
                    return C9955c.f27035a.mo17916d();
                }
                return ((C9954b) C9955c.f27036b.get(str)).mo17916d();
            }

            /* renamed from: d */
            public final long mo17931d() {
                int i;
                String str = str;
                if (TextUtils.isEmpty(str) || C9955c.f27036b.get(str) == null) {
                    i = C9955c.f27035a.mo17917e() * 1000;
                } else {
                    i = ((C9954b) C9955c.f27036b.get(str)).mo17917e() * 1000;
                }
                return (long) i;
            }
        }, new C9988c() {
            /* renamed from: b */
            public final long mo17933b() {
                return C9959a.this.f27064b;
            }

            /* renamed from: c */
            public final boolean mo17934c() {
                return C9959a.this.f27065c;
            }

            /* renamed from: a */
            public final boolean mo17932a() {
                String str = str;
                if (TextUtils.isEmpty(str) || C9955c.f27036b.get(str) == null) {
                    return C9955c.f27035a.mo17919g();
                }
                return ((C9954b) C9955c.f27036b.get(str)).mo17919g();
            }

            /* renamed from: d */
            public final long mo17935d() {
                String str = str;
                if (TextUtils.isEmpty(str) || C9955c.f27036b.get(str) == null) {
                    return C9955c.f27035a.mo17918f();
                }
                return ((C9954b) C9955c.f27036b.get(str)).mo17918f();
            }
        }) {
            /* renamed from: a */
            public final boolean mo17936a(String str, byte[] bArr) {
                if (C9965d.m20050a(str2) != null) {
                    C9966e a = C9965d.m20050a(str2).mo17937a(33554432, str, bArr, 1, "application/json; charset=utf-8");
                    if (a.f27077a > 0) {
                        C9959a.this.f27065c = false;
                        if (a.f27077a == 200 && a.f27078b != null) {
                            if (a.f27078b.optInt("is_crash", 0) == 1) {
                                C9959a.this.f27064b = 1800000;
                                C9959a.this.f27066d = 3;
                                return false;
                            } else if (a.f27078b.opt("message").equals("success")) {
                                C9959a.this.f27066d = 0;
                                C9959a.this.f27064b = 0;
                                return true;
                            }
                        }
                        if (500 <= a.f27077a && a.f27077a <= 600) {
                            if (C9959a.this.f27066d == 0) {
                                C9959a.this.f27064b = 300000;
                                C9959a.this.f27066d++;
                            } else if (C9959a.this.f27066d == 1) {
                                C9959a.this.f27064b = 900000;
                                C9959a.this.f27066d++;
                            } else {
                                int i = C9959a.this.f27066d;
                                C9959a.this.f27064b = 1800000;
                                C9959a.this.f27066d++;
                            }
                            return false;
                        }
                    } else {
                        C9959a.this.f27065c = true;
                    }
                }
                return false;
            }
        };
        this.f27063a = r0;
    }
}
