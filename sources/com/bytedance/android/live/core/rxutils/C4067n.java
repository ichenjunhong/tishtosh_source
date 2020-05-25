package com.bytedance.android.live.core.rxutils;

import android.widget.TextView;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.bytedance.android.live.core.rxutils.n */
public final class C4067n {

    /* renamed from: com.bytedance.android.live.core.rxutils.n$a */
    public static final class C4068a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C1674ab f11219a;

        /* renamed from: b */
        final /* synthetic */ C52671b f11220b;

        public C4068a(C1674ab abVar, C52671b bVar) {
            this.f11219a = abVar;
            this.f11220b = bVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            this.f11220b.invoke(this.f11219a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$b */
    static final class C4069b extends C52712l implements C52671b<T, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52671b f11221a;

        C4069b(C52671b bVar) {
            this.f11221a = bVar;
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            this.f11221a.invoke(obj);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$c */
    static final class C4070c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C52727e f11222a;

        C4070c(C52727e eVar) {
            this.f11222a = eVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52847n a = C52856t.m112465a(this.f11222a.element, obj);
            this.f11222a.element = obj;
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$d */
    public static final class C4071d extends C4075p<T> {

        /* renamed from: a */
        final /* synthetic */ C52671b f11223a;

        C4071d(C52671b bVar) {
            this.f11223a = bVar;
        }

        public final void onNext(T t) {
            this.f11223a.invoke(t);
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$e */
    public static final class C4072e implements C1674ab<T> {

        /* renamed from: a */
        final /* synthetic */ C1674ab[] f11224a;

        public final void onComplete() {
            for (C1674ab onComplete : this.f11224a) {
                onComplete.onComplete();
            }
        }

        public C4072e(C1674ab[] abVarArr) {
            this.f11224a = abVarArr;
        }

        public final void onNext(T t) {
            for (C1674ab onNext : this.f11224a) {
                onNext.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            for (C1674ab onError : this.f11224a) {
                onError.onError(th);
            }
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
            for (C1674ab onSubscribe : this.f11224a) {
                onSubscribe.onSubscribe(cVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.n$f */
    static final class C4073f extends C52712l implements C52671b<CharSequence, C52860x> {

        /* renamed from: a */
        final /* synthetic */ TextView f11225a;

        C4073f(TextView textView) {
            this.f11225a = textView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            C52711k.m112240b(charSequence, "t");
            this.f11225a.setText(charSequence);
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    private static <T> C1674ab<T> m10193b(C52671b<? super T, C52860x> bVar) {
        C52711k.m112240b(bVar, "f");
        return new C4071d<>(bVar);
    }

    /* renamed from: a */
    public static final C1674ab<CharSequence> m10189a(TextView textView) {
        C52711k.m112240b(textView, "view");
        return m10193b(new C4073f(textView));
    }

    /* renamed from: a */
    public static final <T> C1674ab<T> m10190a(C52671b<? super T, C52860x> bVar) {
        C52711k.m112240b(bVar, "$this$asObserver");
        return m10193b(new C4069b(bVar));
    }

    /* renamed from: a */
    public static final <T> C2201v<C52847n<T, T>> m10192a(C2201v<T> vVar) {
        C52711k.m112240b(vVar, "$this$diff");
        C52727e eVar = new C52727e();
        eVar.element = null;
        C2201v<C52847n<T, T>> d = vVar.mo6541d((C1711f<? super T, ? extends R>) new C4070c<Object,Object>(eVar));
        C52711k.m112236a((Object) d, "this.map {\n        val r…     return@map ret\n    }");
        return d;
    }

    /* renamed from: a */
    public static final <S, T> C1690c m10191a(C2201v<S> vVar, C1674ab<T> abVar, C52671b<? super S, ? extends T> bVar) {
        C52711k.m112240b(vVar, "source");
        C52711k.m112240b(abVar, "target");
        C52711k.m112240b(bVar, "transformer");
        C1674ab b = vVar.mo6541d((C1711f<? super T, ? extends R>) new C4074o<Object,Object>(bVar)).mo6514a(C1667a.m5940a()).mo6526b(new C4057f(abVar, null, 2, null));
        C52711k.m112236a((Object) b, "source.map(transformer).…ObserverDelegate(target))");
        return (C1690c) b;
    }
}
