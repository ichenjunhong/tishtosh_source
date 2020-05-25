package com.bytedance.lobby;

import android.os.Bundle;

/* renamed from: com.bytedance.lobby.c */
public final class C12324c {

    /* renamed from: a */
    public int f32486a;

    /* renamed from: b */
    public String f32487b;

    /* renamed from: c */
    public String f32488c;

    /* renamed from: d */
    public Bundle f32489d;

    /* renamed from: com.bytedance.lobby.c$a */
    public static class C12326a {

        /* renamed from: a */
        public int f32490a = 1;

        /* renamed from: b */
        public String f32491b;

        /* renamed from: c */
        public String f32492c;

        /* renamed from: d */
        public Bundle f32493d;

        /* renamed from: a */
        public final C12324c mo23327a() {
            return new C12324c(this);
        }

        /* renamed from: a */
        public final C12326a mo23325a(int i) {
            this.f32490a = 2;
            return this;
        }

        /* renamed from: a */
        public final C12326a mo23326a(Bundle bundle) {
            this.f32493d = bundle;
            return this;
        }

        C12326a(String str, String str2) {
            this.f32491b = str;
            this.f32492c = str2;
        }
    }

    /* renamed from: com.bytedance.lobby.c$b */
    public static final class C12327b extends C12326a {
        public C12327b(String str) {
            super("facebook", str);
        }
    }

    /* renamed from: com.bytedance.lobby.c$c */
    public static final class C12328c extends C12326a {
        public C12328c(String str) {
            super("google", str);
        }
    }

    /* renamed from: com.bytedance.lobby.c$d */
    public static final class C12329d extends C12326a {
        public C12329d(String str) {
            super("instagram", str);
        }
    }

    /* renamed from: com.bytedance.lobby.c$e */
    public static final class C12330e extends C12326a {
        public C12330e(String str) {
            super("kakaotalk", str);
        }
    }

    /* renamed from: com.bytedance.lobby.c$f */
    public static final class C12331f extends C12326a {
        public C12331f(String str) {
            super("line", str);
        }
    }

    /* renamed from: com.bytedance.lobby.c$g */
    public static final class C12332g extends C12326a {
        public C12332g(String str) {
            super("twitter", str);
        }
    }

    /* renamed from: com.bytedance.lobby.c$h */
    public static final class C12333h extends C12326a {
        public C12333h(String str) {
            super("vk", str);
        }
    }

    private C12324c(C12326a aVar) {
        Bundle bundle;
        this.f32486a = aVar.f32490a;
        this.f32487b = aVar.f32491b;
        this.f32488c = aVar.f32492c;
        if (aVar.f32493d == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f32493d;
        }
        this.f32489d = bundle;
    }
}
