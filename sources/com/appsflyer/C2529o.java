package com.appsflyer;

import com.C2240a;

/* renamed from: com.appsflyer.o */
final class C2529o {

    /* renamed from: ˊ */
    public boolean f7847;

    /* renamed from: ˋ */
    private C2530a f7848;

    /* renamed from: ˎ */
    public String f7849;

    /* renamed from: com.appsflyer.o$a */
    enum C2530a {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: ॱ */
        private int f7853;

        public final String toString() {
            return String.valueOf(this.f7853);
        }

        private C2530a(int i) {
            this.f7853 = i;
        }
    }

    public final String toString() {
        return C2240a.m6772a("%s,%s", new Object[]{this.f7849, Boolean.valueOf(this.f7847)});
    }

    C2529o(C2530a aVar, String str, boolean z) {
        this.f7848 = aVar;
        this.f7849 = str;
        this.f7847 = z;
    }
}
