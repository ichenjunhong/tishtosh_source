package com.bytedance.lobby.internal;

import android.content.Context;
import com.bytedance.lobby.C12324c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lobby.internal.c */
public final class C12343c {

    /* renamed from: com.bytedance.lobby.internal.c$a */
    public static final class C12345a {

        /* renamed from: a */
        final List<C12324c> f32537a;

        /* renamed from: b */
        final Context f32538b;

        /* renamed from: c */
        public boolean f32539c;

        /* renamed from: com.bytedance.lobby.internal.c$a$a */
        public static class C12346a {

            /* renamed from: a */
            public List<C12324c> f32540a;

            /* renamed from: b */
            public Context f32541b;

            /* renamed from: c */
            public boolean f32542c;

            /* renamed from: a */
            public final C12345a mo23346a() {
                return new C12345a(this);
            }

            /* renamed from: a */
            public final C12346a mo23345a(boolean z) {
                this.f32542c = z;
                return this;
            }

            /* renamed from: a */
            public final C12346a mo23343a(Context context) {
                this.f32541b = context.getApplicationContext();
                return this;
            }

            /* renamed from: a */
            public final C12346a mo23344a(List<C12324c> list) {
                if (this.f32540a == null) {
                    this.f32540a = new ArrayList(list);
                } else {
                    this.f32540a.clear();
                    this.f32540a.addAll(list);
                }
                return this;
            }
        }

        private C12345a(C12346a aVar) {
            this.f32538b = aVar.f32541b;
            this.f32537a = aVar.f32540a;
            this.f32539c = aVar.f32542c;
        }
    }

    /* renamed from: a */
    public static C12347d m24851a() {
        return C12347d.m24857a();
    }

    /* renamed from: a */
    public static void m24852a(C12345a aVar) {
        LobbyCore.initialize(aVar);
    }
}
