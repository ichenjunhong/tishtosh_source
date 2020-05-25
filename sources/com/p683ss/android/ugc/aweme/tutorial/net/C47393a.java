package com.p683ss.android.ugc.aweme.tutorial.net;

import android.arch.lifecycle.C0198r;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e;
import java.io.FileReader;
import java.io.Reader;
import java.util.NoSuchElementException;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.net.a */
public final class C47393a {

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$a */
    static final class C47394a<T, R> implements C1711f<Throwable, C2206z<? extends T>> {

        /* renamed from: a */
        public static final C47394a f119608a = new C47394a();

        C47394a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            return C2201v.m6610b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$b */
    static final class C47395b<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ int f119609a;

        /* renamed from: b */
        final /* synthetic */ int f119610b;

        /* renamed from: c */
        final /* synthetic */ int f119611c;

        C47395b(int i, int i2, int i3) {
            this.f119609a = i;
            this.f119610b = i2;
            this.f119611c = i3;
        }

        public final void subscribe(C2204x<C47378e> xVar) {
            C52711k.m112240b(xVar, "emitter");
            C47403b bVar = C47403b.f119622a;
            Object a = C39629l.m88232a().mo58566D().mo34883a((Reader) new FileReader(C47403b.m102778a(this.f119609a, this.f119610b, this.f119611c)), C47378e.class);
            C52711k.m112236a(a, "CameraClient.getAPI().ge…ListResponse::class.java)");
            C47378e eVar = (C47378e) a;
            if (C9414h.m18631b(eVar.f119565d)) {
                xVar.mo6282a(eVar);
                xVar.mo6273a();
                return;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$c */
    static final class C47396c<T, R> implements C1711f<Throwable, C2206z<? extends C47378e>> {

        /* renamed from: a */
        public static final C47396c f119612a = new C47396c();

        C47396c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            return C2201v.m6610b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$d */
    static final class C47397d<T, R> implements C1711f<Throwable, C2206z<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ C2201v f119613a;

        C47397d(C2201v vVar) {
            this.f119613a = vVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            return this.f119613a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$e */
    public static final class C47398e implements C1674ab<C47378e> {

        /* renamed from: a */
        final /* synthetic */ C0198r f119614a;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        C47398e(C0198r rVar) {
            this.f119614a = rVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f119614a.setValue(C37721a.m84222a(th));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C47378e eVar = (C47378e) obj;
            C52711k.m112240b(eVar, "t");
            this.f119614a.setValue(C37721a.m84221a(eVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$f */
    static final class C47399f<T> implements C2206z<C47378e> {

        /* renamed from: a */
        public static final C47399f f119615a = new C47399f();

        C47399f() {
        }

        /* renamed from: a */
        public final void mo6314a(C1674ab<? super C47378e> abVar) {
            C52711k.m112240b(abVar, "it");
            abVar.onError(new NoSuchElementException());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$g */
    public static final class C47400g implements C1674ab<C47378e> {

        /* renamed from: a */
        final /* synthetic */ int f119616a;

        /* renamed from: b */
        final /* synthetic */ C0198r f119617b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f119617b.setValue(C37721a.m84222a(th));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C47378e eVar = (C47378e) obj;
            C52711k.m112240b(eVar, "t");
            eVar.f119566e = this.f119616a;
            this.f119617b.setValue(C37721a.m84221a(eVar));
        }

        C47400g(int i, C0198r rVar) {
            this.f119616a = i;
            this.f119617b = rVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$h */
    static final class C47401h<T> implements C1710e<C47378e> {

        /* renamed from: a */
        final /* synthetic */ int f119618a;

        /* renamed from: b */
        final /* synthetic */ int f119619b;

        /* renamed from: c */
        final /* synthetic */ int f119620c;

        C47401h(int i, int i2, int i3) {
            this.f119618a = i;
            this.f119619b = i2;
            this.f119620c = i3;
        }

        public final /* synthetic */ void accept(Object obj) {
            C47378e eVar = (C47378e) obj;
            C47403b bVar = C47403b.f119622a;
            C52711k.m112236a((Object) eVar, "it");
            bVar.mo94686a(eVar, this.f119618a, this.f119619b, this.f119620c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$i */
    static final class C47402i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C47402i f119621a = new C47402i();

        C47402i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    private static <T> C2201v<T> m102773a(C2201v<T> vVar, C2201v<T> vVar2) {
        C2201v<T> a = C2201v.m6602a((C2206z<? extends T>) vVar, (C2206z<? extends T>) vVar2.mo6544e((C1711f<? super Throwable, ? extends C2206z<? extends T>>) C47394a.f119608a));
        C52711k.m112236a((Object) a, "Observable.concat(cache,…le.empty<T>()\n        }))");
        return a;
    }

    /* renamed from: b */
    private static <T> C2201v<T> m102775b(C2201v<T> vVar, C2201v<T> vVar2) {
        C2201v<T> e = vVar2.mo6544e((C1711f<? super Throwable, ? extends C2206z<? extends T>>) new C47397d<Object,Object>(vVar));
        C52711k.m112236a((Object) e, "net.onErrorResumeNext(Fu…         cache\n        })");
        return e;
    }

    /* renamed from: a */
    public static C0198r<C37721a<C47378e>> m102772a(int i, int i2, int i3) {
        C0198r<C37721a<C47378e>> rVar = new C0198r<>();
        ((TutorialListRequest) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(TutorialVideoApiManager.f96873a).mo19925a().mo19930a(TutorialListRequest.class)).getTutorialList(i, 0, i3).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C47398e<Object>(rVar));
        return rVar;
    }

    /* renamed from: b */
    private static C2201v<C47378e> m102774b(int i, int i2, int i3) {
        C2201v<C47378e> e = C2201v.m6601a((C2205y<T>) new C47395b<T>(i, i2, i3)).mo6529b(C2168a.m6521b()).mo6544e((C1711f<? super Throwable, ? extends C2206z<? extends T>>) C47396c.f119612a);
        C52711k.m112236a((Object) e, "Observable.create<Tutori…nse>()\n                })");
        return e;
    }

    /* renamed from: a */
    public final C0198r<C37721a<C47378e>> mo94685a(int i, int i2, int i3, int i4) {
        C2201v vVar;
        C0198r<C37721a<C47378e>> rVar = new C0198r<>();
        rVar.setValue(C37721a.m84217a());
        C2201v b = m102774b(i, i2, i3);
        C2201v b2 = ((TutorialListRequest) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(TutorialVideoApiManager.f96873a).mo19925a().mo19930a(TutorialListRequest.class)).getTutorialList(i, i2, i3).mo6529b(C2168a.m6521b());
        C2180b l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create()");
        b2.mo6314a((C1674ab<? super T>) l);
        l.mo6505a((C1710e<? super T>) new C47401h<Object>(i, i2, i3), (C1710e<? super Throwable>) C47402i.f119621a);
        if (i2 == 0) {
            vVar = m102773a(b, l);
        } else {
            vVar = m102775b(b, l);
        }
        vVar.mo6514a(C1667a.m5940a()).mo6537c((C2206z<? extends T>) C47399f.f119615a).mo6314a((C1674ab<? super T>) new C47400g<Object>(i4, rVar));
        return rVar;
    }
}
