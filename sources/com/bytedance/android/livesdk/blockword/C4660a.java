package com.bytedance.android.livesdk.blockword;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.blockword.p286a.C4669a;
import com.bytedance.android.livesdk.blockword.p286a.C4670b;
import com.bytedance.android.livesdk.blockword.p286a.C4671c;
import com.bytedance.android.livesdk.p270ab.C4514j;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.blockword.a */
public final class C4660a {

    /* renamed from: d */
    public static final C4662b f12723d = new C4662b(null);

    /* renamed from: a */
    public final BlockWordApi f12724a;

    /* renamed from: b */
    public List<C4669a> f12725b = new ArrayList();

    /* renamed from: c */
    public C4661a f12726c;

    /* renamed from: com.bytedance.android.livesdk.blockword.a$a */
    public interface C4661a {
        /* renamed from: a */
        void mo10446a(C4669a aVar, int i);

        /* renamed from: a */
        void mo10447a(Throwable th);

        /* renamed from: a */
        void mo10448a(List<C4669a> list);

        /* renamed from: b */
        void mo10449b(C4669a aVar, int i);

        /* renamed from: b */
        void mo10450b(Throwable th);

        /* renamed from: c */
        void mo10451c(Throwable th);
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$b */
    public static final class C4662b {
        private C4662b() {
        }

        public /* synthetic */ C4662b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$c */
    public static final class C4663c<T> implements C1710e<C4177d<C4670b>> {

        /* renamed from: a */
        final /* synthetic */ C4660a f12727a;

        /* renamed from: b */
        final /* synthetic */ C4669a f12728b;

        public C4663c(C4660a aVar, C4669a aVar2) {
            this.f12727a = aVar;
            this.f12728b = aVar2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = ((C4670b) ((C4177d) obj).data).f12738a;
            if (num != null) {
                this.f12728b.f12736a = num.intValue();
                this.f12727a.f12725b.add(0, this.f12728b);
                C4661a aVar = this.f12727a.f12726c;
                if (aVar != null) {
                    aVar.mo10446a(this.f12728b, 0);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$d */
    public static final class C4664d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4660a f12729a;

        public C4664d(C4660a aVar) {
            this.f12729a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4661a aVar = this.f12729a.f12726c;
            if (aVar != null) {
                C52711k.m112236a((Object) th, "throwable");
                aVar.mo10447a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$e */
    public static final class C4665e<T> implements C1710e<C4177d<Object>> {

        /* renamed from: a */
        final /* synthetic */ C4660a f12730a;

        /* renamed from: b */
        final /* synthetic */ Integer f12731b;

        /* renamed from: c */
        final /* synthetic */ C4669a f12732c;

        public C4665e(C4660a aVar, Integer num, C4669a aVar2) {
            this.f12730a = aVar;
            this.f12731b = num;
            this.f12732c = aVar2;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            if (this.f12731b != null) {
                this.f12730a.f12725b.remove(this.f12731b.intValue());
                C4661a aVar = this.f12730a.f12726c;
                if (aVar != null) {
                    aVar.mo10449b(this.f12732c, this.f12731b.intValue());
                }
            } else {
                this.f12730a.f12725b.remove(this.f12732c);
                C4661a aVar2 = this.f12730a.f12726c;
                if (aVar2 != null) {
                    aVar2.mo10449b(this.f12732c, -1);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$f */
    public static final class C4666f<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4660a f12733a;

        public C4666f(C4660a aVar) {
            this.f12733a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4661a aVar = this.f12733a.f12726c;
            if (aVar != null) {
                C52711k.m112236a((Object) th, "throwable");
                aVar.mo10450b(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$g */
    public static final class C4667g<T> implements C1710e<C4177d<C4671c>> {

        /* renamed from: a */
        final /* synthetic */ C4660a f12734a;

        public C4667g(C4660a aVar) {
            this.f12734a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List<C4669a> list = ((C4671c) ((C4177d) obj).data).f12739a;
            if (list != null) {
                this.f12734a.f12725b.clear();
                this.f12734a.f12725b.addAll(list);
                C4661a aVar = this.f12734a.f12726c;
                if (aVar != null) {
                    aVar.mo10448a(list);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.blockword.a$h */
    public static final class C4668h<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4660a f12735a;

        public C4668h(C4660a aVar) {
            this.f12735a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4661a aVar = this.f12735a.f12726c;
            if (aVar != null) {
                C52711k.m112236a((Object) th, "throwable");
                aVar.mo10451c(th);
            }
        }
    }

    public C4660a() {
        Object a = C4514j.m10883j().mo10321b().mo9550a(BlockWordApi.class);
        C52711k.m112236a(a, "LiveInternalService.inst…BlockWordApi::class.java)");
        this.f12724a = (BlockWordApi) a;
    }
}
