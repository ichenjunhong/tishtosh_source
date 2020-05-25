package com.p683ss.android.deviceregister.p1155b.p1156a.p1157a;

import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.deviceregister.C19047j;
import com.p683ss.android.deviceregister.p1158c.C19030a;

/* renamed from: com.ss.android.deviceregister.b.a.a.b */
public abstract class C19013b {

    /* renamed from: c */
    public C19013b f52346c;

    /* renamed from: com.ss.android.deviceregister.b.a.a.b$a */
    interface C19020a<L> {
        /* renamed from: a */
        L mo38874a();

        /* renamed from: a */
        L mo38875a(L l, L l2, C19013b bVar);

        /* renamed from: a */
        void mo38876a(L l);

        /* renamed from: a */
        boolean mo38877a(L l, L l2);

        /* renamed from: b */
        boolean mo38878b(L l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo38861a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38863a(String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38864a(String str, String[] strArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String[] mo38865b(String str);

    /* renamed from: c */
    public void mo38866c(String str) {
        C19013b bVar = this.f52346c;
        if (bVar != null) {
            bVar.mo38866c(str);
        }
    }

    /* renamed from: b */
    public final String mo38869b(String str, String str2) {
        return (String) m46208a(str, str2, new C19020a<String>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38874a() {
                return C19013b.this.mo38861a("openudid");
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo38878b(Object obj) {
                return C19030a.m46306a((String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38876a(Object obj) {
                C19013b.this.mo38863a("openudid", (String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo38877a(Object obj, Object obj2) {
                return C9431p.m18665a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo38875a(Object obj, Object obj2, C19013b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.mo38869b(str, str2);
            }
        });
    }

    /* renamed from: c */
    public final String mo38870c(String str, String str2) {
        return (String) m46208a(str, str2, new C19020a<String>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38874a() {
                return C19013b.this.mo38861a("clientudid");
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo38878b(Object obj) {
                return C19030a.m46306a((String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38876a(Object obj) {
                C19013b.this.mo38863a("clientudid", (String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo38877a(Object obj, Object obj2) {
                return C9431p.m18665a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo38875a(Object obj, Object obj2, C19013b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.mo38870c(str, str2);
            }
        });
    }

    /* renamed from: d */
    public final String mo38871d(String str, String str2) {
        return (String) m46208a(str, str2, new C19020a<String>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38874a() {
                return C19013b.this.mo38861a("serial_number");
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo38878b(Object obj) {
                if (!TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38876a(Object obj) {
                C19013b.this.mo38863a("serial_number", (String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo38877a(Object obj, Object obj2) {
                return C9431p.m18665a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo38875a(Object obj, Object obj2, C19013b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.mo38871d(str, str2);
            }
        });
    }

    /* renamed from: e */
    public final String mo38872e(String str, String str2) {
        return (String) m46208a(str, str2, new C19020a<String>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38874a() {
                return C19013b.this.mo38861a("udid");
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo38878b(Object obj) {
                return C19030a.m46306a((String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38876a(Object obj) {
                C19013b.this.mo38863a("udid", (String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo38877a(Object obj, Object obj2) {
                return C9431p.m18665a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo38875a(Object obj, Object obj2, C19013b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.mo38872e(str, str2);
            }
        });
    }

    /* renamed from: a */
    public final String[] mo38868a(String[] strArr, String[] strArr2) {
        return (String[]) m46208a(strArr, strArr2, new C19020a<String[]>() {
            /* renamed from: a */
            public final /* synthetic */ Object mo38874a() {
                return C19013b.this.mo38865b("sim_serial_number");
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ boolean mo38878b(Object obj) {
                String[] strArr = (String[]) obj;
                if (strArr == null || strArr.length <= 0) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38876a(Object obj) {
                C19013b.this.mo38864a("sim_serial_number", (String[]) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo38877a(Object obj, Object obj2) {
                String[] strArr = (String[]) obj;
                String[] strArr2 = (String[]) obj2;
                if (strArr != strArr2) {
                    if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
                        return false;
                    }
                    for (String str : strArr) {
                        boolean z = false;
                        for (String a : strArr2) {
                            if (C9431p.m18665a(a, str) || z) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            return false;
                        }
                    }
                }
                return true;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38875a(Object obj, Object obj2, C19013b bVar) {
                String[] strArr = (String[]) obj;
                String[] strArr2 = (String[]) obj2;
                if (bVar == null) {
                    return strArr;
                }
                return bVar.mo38868a(strArr, strArr2);
            }
        });
    }

    /* renamed from: f */
    public final String mo38873f(String str, String str2) {
        C19047j.m46366a().mo38931c();
        String str3 = (String) m46208a(str, str2, new C19020a<String>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo38874a() {
                return C19013b.this.mo38861a("device_id");
            }

            /* renamed from: b */
            public final /* synthetic */ boolean mo38878b(Object obj) {
                if (!TextUtils.isEmpty((String) obj)) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo38876a(Object obj) {
                C19013b.this.mo38863a("device_id", (String) obj);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo38877a(Object obj, Object obj2) {
                return C9431p.m18665a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo38875a(Object obj, Object obj2, C19013b bVar) {
                String str = (String) obj;
                String str2 = (String) obj2;
                if (bVar == null) {
                    return str;
                }
                return bVar.mo38873f(str, str2);
            }
        });
        C19047j.m46366a().mo38928a(str3);
        return str3;
    }

    /* renamed from: a */
    private <T> T m46208a(T t, T t2, C19020a<T> aVar) {
        C19013b bVar = this.f52346c;
        T a = aVar.mo38874a();
        boolean b = aVar.mo38878b(t);
        boolean b2 = aVar.mo38878b(a);
        if (!b && b2) {
            t = a;
        }
        if (bVar != null) {
            T a2 = aVar.mo38875a(t, t2, bVar);
            if (!aVar.mo38877a(a2, a)) {
                aVar.mo38876a(a2);
            }
            return a2;
        }
        boolean z = false;
        if (!b && !b2) {
            z = true;
            t = t2;
        }
        if ((z && aVar.mo38878b(t)) || (b && !aVar.mo38877a(t, a))) {
            aVar.mo38876a(t);
        }
        return t;
    }
}
