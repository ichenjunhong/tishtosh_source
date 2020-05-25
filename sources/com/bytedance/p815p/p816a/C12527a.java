package com.bytedance.p815p.p816a;

import android.content.Context;
import com.bytedance.p815p.p816a.p818b.C12545c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.p.a.a */
public final class C12527a {

    /* renamed from: a */
    public List<String> f32892a;

    /* renamed from: b */
    public Context f32893b;

    /* renamed from: c */
    public C12531c f32894c;

    /* renamed from: d */
    public C12532d f32895d;

    /* renamed from: e */
    public C12530b f32896e;

    /* renamed from: f */
    public C12545c f32897f;

    /* renamed from: g */
    public List<C12536b> f32898g;

    /* renamed from: h */
    Map<String, Long> f32899h;

    /* renamed from: com.bytedance.p.a.a$a */
    public static class C12529a {

        /* renamed from: a */
        private final List<String> f32900a = new ArrayList();

        /* renamed from: b */
        private Context f32901b;

        /* renamed from: c */
        private C12531c f32902c;

        /* renamed from: d */
        private C12532d f32903d;

        /* renamed from: e */
        private C12530b f32904e;

        /* renamed from: f */
        private C12545c f32905f;

        /* renamed from: a */
        public final C12527a mo23582a() {
            C12527a aVar = new C12527a();
            aVar.f32893b = this.f32901b;
            aVar.f32897f = this.f32905f;
            aVar.f32894c = this.f32902c;
            aVar.f32896e = this.f32904e;
            aVar.f32895d = this.f32903d;
            aVar.f32892a = this.f32900a;
            return aVar;
        }

        /* renamed from: a */
        public final C12529a mo23579a(Context context) {
            this.f32901b = context;
            return this;
        }

        /* renamed from: a */
        public final C12529a mo23578a(byte b) {
            this.f32905f = C12546c.m25172a(2);
            return this;
        }

        /* renamed from: a */
        public final C12529a mo23580a(C12531c cVar) {
            this.f32902c = cVar;
            return this;
        }

        /* renamed from: a */
        public final C12529a mo23581a(String str) {
            if (!this.f32900a.contains(str)) {
                this.f32900a.add(str);
            }
            return this;
        }
    }

    /* renamed from: com.bytedance.p.a.a$b */
    public interface C12530b {
    }

    /* renamed from: com.bytedance.p.a.a$c */
    public interface C12531c {
        /* renamed from: a */
        void mo10402a();

        /* renamed from: b */
        void mo10403b();

        /* renamed from: c */
        boolean mo10404c();
    }

    /* renamed from: com.bytedance.p.a.a$d */
    public interface C12532d {
    }

    private C12527a() {
        this.f32898g = new ArrayList();
        this.f32899h = new HashMap();
    }

    /* renamed from: a */
    public final byte mo23577a() {
        byte b = 0;
        for (C12536b bVar : this.f32898g) {
            b = (byte) (b | bVar.f32908a);
        }
        if ((b & 1) == 1) {
            return 1;
        }
        if ((b & 4) == 4) {
            return 4;
        }
        return 2;
    }
}
