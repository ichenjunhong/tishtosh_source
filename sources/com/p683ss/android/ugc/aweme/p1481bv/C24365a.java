package com.p683ss.android.ugc.aweme.p1481bv;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2767k;
import com.bytedance.p780m.C12361b;
import com.bytedance.scene.group.C12896b;
import com.bytedance.scene.ktx.C12932b;
import com.bytedance.scene.navigation.C12942d;
import com.p683ss.android.ugc.aweme.base.C23550k;
import com.p683ss.android.ugc.aweme.beauty.C23777a;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.p1437bj.C23854j;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C43844fm;
import com.p683ss.android.ugc.aweme.shortvideo.C45329y;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42501a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43244d;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43875e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2224b.C44451a;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.C44730c;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.tools.C46808ab;
import com.p683ss.android.ugc.aweme.tools.C47093m;
import com.p683ss.android.ugc.aweme.tools.C47347v;
import com.p683ss.android.ugc.gamora.p2457a.C48923a;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49578c;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import com.p683ss.android.ugc.gamora.recorder.p2480n.C49912d;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49951e;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49952f;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.bv.a */
public final class C24365a {

    /* renamed from: a */
    public final C24370b f64679a = new C24370b();

    /* renamed from: b */
    public List<? extends CharSequence> f64680b;

    /* renamed from: c */
    String f64681c;

    /* renamed from: com.ss.android.ugc.aweme.bv.a$a */
    public static final class C24366a {

        /* renamed from: a */
        public final LinkedList<C49971b> f64682a = new LinkedList<>();

        /* renamed from: com.ss.android.ugc.aweme.bv.a$a$a */
        static final class C24367a extends C52712l implements C52670a<Boolean> {

            /* renamed from: a */
            public static final C24367a f64683a = new C24367a();

            C24367a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Boolean.valueOf(true);
            }
        }

        /* renamed from: a */
        public final C24366a mo50169a(C49971b bVar, C52670a<Boolean> aVar) {
            C52711k.m112240b(bVar, "item");
            C52711k.m112240b(aVar, "predict");
            if (!((Boolean) aVar.invoke()).booleanValue()) {
                return this;
            }
            this.f64682a.addLast(bVar);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$aa */
    static final class C24368aa<T> implements C2767k<C49578c> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64684a;

        /* renamed from: b */
        final /* synthetic */ C48923a f64685b;

        /* renamed from: c */
        final /* synthetic */ C24397b f64686c;

        /* renamed from: d */
        final /* synthetic */ C12361b f64687d;

        /* renamed from: com.ss.android.ugc.aweme.bv.a$aa$a */
        static final class C24369a extends C52712l implements C52671b<Boolean, List<C49971b>> {

            /* renamed from: a */
            final /* synthetic */ List f64688a;

            /* renamed from: b */
            final /* synthetic */ List f64689b;

            C24369a(List list, List list2) {
                this.f64688a = list;
                this.f64689b = list2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return this.f64688a;
                }
                return this.f64689b;
            }
        }

        C24368aa(C24365a aVar, C48923a aVar2, C24397b bVar, C12361b bVar2) {
            this.f64684a = aVar;
            this.f64685b = aVar2;
            this.f64686c = bVar;
            this.f64687d = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C49578c cVar = (C49578c) obj;
            C24365a aVar = this.f64684a;
            Activity b = this.f64685b.mo96751b();
            Object obj2 = cVar.f124357c;
            if (obj2 != null) {
                CharSequence charSequence = (CharSequence) obj2;
                if (aVar.f64680b == null) {
                    List<Number> b2 = C52575l.m112099b((Object[]) new Integer[]{Integer.valueOf(C23854j.RECORD_COMBINE.getTagResId()), Integer.valueOf(C23854j.RECORD_COMBINE_15.getTagResId()), Integer.valueOf(C23854j.RECORD_COMBINE_60.getTagResId()), Integer.valueOf(C23854j.PHOTO_SHORT.getTagResId())});
                    List<? extends CharSequence> arrayList = new ArrayList<>();
                    for (Number intValue : b2) {
                        String string = b.getResources().getString(intValue.intValue());
                        C52711k.m112236a((Object) string, "activity.resources.getString(it)");
                        arrayList.add(string);
                    }
                    aVar.f64680b = arrayList;
                    String string2 = b.getResources().getString(C23854j.PHOTO_SHORT.getTagResId());
                    C52711k.m112236a((Object) string2, "activity.resources.getSt…fig.PHOTO_SHORT.tagResId)");
                    aVar.f64681c = string2;
                }
                List<? extends CharSequence> list = aVar.f64680b;
                if (list == null) {
                    C52711k.m112237a("tabs");
                }
                if (list.contains(charSequence)) {
                    C24365a aVar2 = this.f64684a;
                    Object obj3 = cVar.f124357c;
                    if (obj3 != null) {
                        CharSequence charSequence2 = (CharSequence) obj3;
                        String str = aVar2.f64681c;
                        if (str == null) {
                            C52711k.m112237a("liveText");
                        }
                        boolean a = C52711k.m112239a((Object) str, (Object) charSequence2);
                        if (this.f64684a.f64679a.f64690a != a) {
                            boolean V = this.f64685b.mo96755f().mo91316V();
                            this.f64684a.f64679a.f64690a = a;
                            this.f64684a.f64679a.f64692c = this.f64685b.mo96755f().mo91340a(V, a);
                            this.f64684a.f64679a.f64693d = this.f64685b.mo96755f().mo91360d(V);
                            List arrayList2 = new ArrayList();
                            List arrayList3 = new ArrayList();
                            C52671b aVar3 = new C24369a(arrayList2, arrayList3);
                            if (this.f64684a.f64679a.f64690a) {
                                arrayList3.add(this.f64686c.mo50172b());
                                arrayList3.add(this.f64686c.mo50176f());
                                arrayList3.add(this.f64686c.mo50177g());
                                arrayList3.add(this.f64686c.mo50173c());
                                ((List) aVar3.invoke(Boolean.valueOf(this.f64684a.f64679a.f64692c))).add(this.f64686c.mo50179i());
                                ((List) aVar3.invoke(Boolean.valueOf(this.f64684a.f64679a.f64693d))).add(this.f64686c.mo50175e());
                            } else {
                                arrayList2.add(this.f64686c.mo50172b());
                                ((List) aVar3.invoke(Boolean.valueOf(this.f64684a.f64679a.f64694e))).add(this.f64686c.mo50176f());
                                ((List) aVar3.invoke(Boolean.valueOf(this.f64684a.f64679a.f64695f))).add(this.f64686c.mo50177g());
                                arrayList2.add(this.f64686c.mo50173c());
                                ((List) aVar3.invoke(Boolean.valueOf(this.f64684a.f64679a.f64692c))).add(this.f64686c.mo50179i());
                                ((List) aVar3.invoke(Boolean.valueOf(this.f64684a.f64679a.f64693d))).add(this.f64686c.mo50175e());
                            }
                            ((C49951e) this.f64687d.mo23372a(C49951e.class)).mo97758a(arrayList2);
                            ((C49951e) this.f64687d.mo23372a(C49951e.class)).mo97760b(arrayList3);
                            ((C49951e) this.f64687d.mo23372a(C49951e.class)).mo97756a(this.f64684a.mo50167a(this.f64685b, this.f64684a.f64679a));
                            return;
                        }
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$b */
    public static final class C24370b {

        /* renamed from: a */
        public boolean f64690a;

        /* renamed from: b */
        public boolean f64691b;

        /* renamed from: c */
        public boolean f64692c;

        /* renamed from: d */
        public boolean f64693d;

        /* renamed from: e */
        public boolean f64694e;

        /* renamed from: f */
        public boolean f64695f;

        /* renamed from: g */
        public boolean f64696g;
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$c */
    static final class C24371c extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64697a;

        C24371c(C24365a aVar) {
            this.f64697a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.f64697a.f64679a.f64692c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$d */
    static final class C24372d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64698a;

        /* renamed from: b */
        final /* synthetic */ C12896b f64699b;

        /* renamed from: c */
        final /* synthetic */ C48923a f64700c;

        /* renamed from: d */
        final /* synthetic */ C12361b f64701d;

        /* renamed from: e */
        final /* synthetic */ C24397b f64702e;

        C24372d(C24365a aVar, C12896b bVar, C48923a aVar2, C12361b bVar2, C24397b bVar3) {
            this.f64698a = aVar;
            this.f64699b = bVar;
            this.f64700c = aVar2;
            this.f64701d = bVar2;
            this.f64702e = bVar3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C24365a aVar = this.f64698a;
            C12896b bVar = this.f64699b;
            C48923a aVar2 = this.f64700c;
            C12361b bVar2 = this.f64701d;
            C24397b bVar3 = this.f64702e;
            C12942d x = bVar.mo24479x();
            C52711k.m112236a((Object) x, "parentScene.requireNavigationScene()");
            C0184k kVar = x;
            aVar2.mo96755f().mo91345ae().mo7349a(kVar, new C24385q(bVar3, bVar2));
            aVar2.mo96755f().mo91370q().mo7349a(kVar, new C24391u(aVar, bVar3, bVar2));
            aVar2.mo96755f().mo91369p().mo7349a(kVar, new C24392v(bVar3, bVar2));
            ((C49912d) bVar2.mo23372a(C49912d.class)).mo97722k().mo7349a(kVar, new C24393w(bVar3, bVar2));
            aVar2.mo96755f().mo91371r().mo7349a(kVar, new C24394x(bVar3, bVar2));
            C43244d dVar = (C43244d) bVar2.mo23374b(C43244d.class);
            if (dVar != null) {
                dVar.mo87912a().mo7349a(kVar, new C24383o(x, bVar3, bVar2));
                dVar.mo87914b().mo7349a(kVar, new C24384p(x, bVar3, bVar2));
            }
            aVar2.mo96755f().mo91372s().mo7349a(kVar, new C24395y(bVar3, bVar2));
            ((C49850a) bVar2.mo23372a(C49850a.class)).mo97682e().mo7349a(kVar, new C24396z(bVar3, bVar2));
            ((C49577b) bVar2.mo23372a(C49577b.class)).mo97485e().mo7349a(kVar, new C24368aa(aVar, aVar2, bVar3, bVar2));
            aVar2.mo96755f().mo91365l().mo7349a(kVar, new C24386r(bVar3, bVar2));
            C2762f u = ((C45004a) bVar2.mo23372a(C45004a.class)).mo91374u();
            C24365a aVar3 = aVar;
            C24387s sVar = new C24387s(aVar3, aVar2, bVar3, bVar2, bVar);
            u.mo7349a(kVar, sVar);
            C49607a aVar4 = (C49607a) bVar2.mo23372a(C49607a.class);
            C2762f e = aVar4.mo97521e();
            C12942d dVar2 = x;
            C48923a aVar5 = aVar2;
            C24397b bVar4 = bVar3;
            C12361b bVar5 = bVar2;
            C24381m mVar = new C24381m(aVar3, dVar2, aVar5, bVar4, bVar5);
            e.mo7349a(kVar, mVar);
            C2762f g = aVar4.mo97522g();
            C24382n nVar = new C24382n(aVar3, dVar2, aVar5, bVar4, bVar5);
            g.mo7349a(kVar, nVar);
            ((C42501a) bVar2.mo23372a(C42501a.class)).mo86708b().mo7349a(kVar, new C24390t(bVar3, bVar2));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$e */
    static final class C24373e extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f64703a;

        C24373e(boolean z) {
            this.f64703a = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (!C23777a.m58348a() || this.f64703a) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$f */
    static final class C24374f extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f64704a;

        C24374f(boolean z) {
            this.f64704a = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (!C23777a.m58348a() || (C23777a.m58348a() && this.f64704a)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$g */
    static final class C24375g extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C48923a f64705a;

        C24375g(C48923a aVar) {
            this.f64705a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C43236a.m94873a(this.f64705a.mo96752c()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$h */
    static final class C24376h extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64706a;

        /* renamed from: b */
        final /* synthetic */ C48923a f64707b;

        C24376h(C24365a aVar, C48923a aVar2) {
            this.f64706a = aVar;
            this.f64707b = aVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C24365a.m59761a(this.f64707b.mo96752c()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$i */
    static final class C24377i extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64708a;

        C24377i(C24365a aVar) {
            this.f64708a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.f64708a.f64679a.f64693d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$j */
    static final class C24378j extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64709a;

        /* renamed from: b */
        final /* synthetic */ C48923a f64710b;

        C24378j(C24365a aVar, C48923a aVar2) {
            this.f64709a = aVar;
            this.f64710b = aVar2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            if (!this.f64709a.f64679a.f64694e || this.f64710b.mo96752c().mo86362d()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$k */
    static final class C24379k extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64711a;

        C24379k(C24365a aVar) {
            this.f64711a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.f64711a.f64679a.f64695f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$l */
    static final class C24380l extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64712a;

        C24380l(C24365a aVar) {
            this.f64712a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(!this.f64712a.f64679a.f64691b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$m */
    static final class C24381m<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64713a;

        /* renamed from: b */
        final /* synthetic */ C12942d f64714b;

        /* renamed from: c */
        final /* synthetic */ C48923a f64715c;

        /* renamed from: d */
        final /* synthetic */ C24397b f64716d;

        /* renamed from: e */
        final /* synthetic */ C12361b f64717e;

        C24381m(C24365a aVar, C12942d dVar, C48923a aVar2, C24397b bVar, C12361b bVar2) {
            this.f64713a = aVar;
            this.f64714b = dVar;
            this.f64715c = aVar2;
            this.f64716d = bVar;
            this.f64717e = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f64713a.f64679a.f64694e = true;
            List arrayList = new ArrayList();
            if (!this.f64715c.mo96752c().mo86362d()) {
                arrayList.add(this.f64716d.mo50176f());
            }
            C49951e eVar = (C49951e) this.f64717e.mo23372a(C49951e.class);
            eVar.mo97758a(arrayList);
            eVar.mo97756a(this.f64713a.mo50167a(this.f64715c, this.f64713a.f64679a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$n */
    static final class C24382n<T> implements C2767k<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64718a;

        /* renamed from: b */
        final /* synthetic */ C12942d f64719b;

        /* renamed from: c */
        final /* synthetic */ C48923a f64720c;

        /* renamed from: d */
        final /* synthetic */ C24397b f64721d;

        /* renamed from: e */
        final /* synthetic */ C12361b f64722e;

        C24382n(C24365a aVar, C12942d dVar, C48923a aVar2, C24397b bVar, C12361b bVar2) {
            this.f64718a = aVar;
            this.f64719b = dVar;
            this.f64720c = aVar2;
            this.f64721d = bVar;
            this.f64722e = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52860x xVar = (C52860x) obj;
            this.f64718a.f64679a.f64694e = false;
            List arrayList = new ArrayList();
            arrayList.add(this.f64721d.mo50176f());
            C49951e eVar = (C49951e) this.f64722e.mo23372a(C49951e.class);
            eVar.mo97760b(arrayList);
            eVar.mo97756a(this.f64718a.mo50167a(this.f64720c, this.f64718a.f64679a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$o */
    static final class C24383o<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C12942d f64723a;

        /* renamed from: b */
        final /* synthetic */ C24397b f64724b;

        /* renamed from: c */
        final /* synthetic */ C12361b f64725c;

        C24383o(C12942d dVar, C24397b bVar, C12361b bVar2) {
            this.f64723a = dVar;
            this.f64724b = bVar;
            this.f64725c = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49971b j = this.f64724b.mo50180j();
            j.f125191d = !bool.booleanValue();
            ((C49951e) this.f64725c.mo23372a(C49951e.class)).mo97757a(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$p */
    static final class C24384p<T> implements C2767k<C23550k> {

        /* renamed from: a */
        final /* synthetic */ C12942d f64726a;

        /* renamed from: b */
        final /* synthetic */ C24397b f64727b;

        /* renamed from: c */
        final /* synthetic */ C12361b f64728c;

        C24384p(C12942d dVar, C24397b bVar, C12361b bVar2) {
            this.f64726a = dVar;
            this.f64727b = bVar;
            this.f64728c = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C23550k kVar = (C23550k) obj;
            C49971b j = this.f64727b.mo50180j();
            j.f125190c = kVar;
            ((C49951e) this.f64728c.mo23372a(C49951e.class)).mo97757a(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$q */
    static final class C24385q<T> implements C2767k<C46808ab> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64729a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64730b;

        C24385q(C24397b bVar, C12361b bVar2) {
            this.f64729a = bVar;
            this.f64730b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C46808ab abVar = (C46808ab) obj;
            C49971b g = this.f64729a.mo50177g();
            C52711k.m112236a((Object) abVar, "it");
            if (abVar.f118274b) {
                i = R.drawable.akp;
            } else {
                i = R.drawable.ako;
            }
            g.f125189b = i;
            g.f125191d = !abVar.f118273a;
            ((C49951e) this.f64730b.mo23372a(C49951e.class)).mo97757a(g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$r */
    static final class C24386r<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64731a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64732b;

        C24386r(C24397b bVar, C12361b bVar2) {
            this.f64731a = bVar;
            this.f64732b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49971b a = this.f64731a.mo50171a();
            if ((!C52711k.m112239a((Object) Boolean.valueOf(a.f125191d), (Object) bool)) || (!C52711k.m112239a((Object) Boolean.valueOf(a.f125197j), (Object) bool))) {
                C52711k.m112236a((Object) bool, "it");
                a.f125191d = bool.booleanValue();
                a.f125197j = bool.booleanValue();
                if (bool.booleanValue()) {
                    a.f125193f = false;
                }
                ((C49951e) this.f64732b.mo23372a(C49951e.class)).mo97757a(a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$s */
    static final class C24387s<T> implements C2767k<C47093m> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64733a;

        /* renamed from: b */
        final /* synthetic */ C48923a f64734b;

        /* renamed from: c */
        final /* synthetic */ C24397b f64735c;

        /* renamed from: d */
        final /* synthetic */ C12361b f64736d;

        /* renamed from: e */
        final /* synthetic */ C12896b f64737e;

        /* renamed from: com.ss.android.ugc.aweme.bv.a$s$a */
        static final class C24389a extends C52712l implements C52671b<Boolean, List<C49971b>> {

            /* renamed from: a */
            final /* synthetic */ List f64740a;

            /* renamed from: b */
            final /* synthetic */ List f64741b;

            C24389a(List list, List list2) {
                this.f64740a = list;
                this.f64741b = list2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return this.f64740a;
                }
                return this.f64741b;
            }
        }

        C24387s(C24365a aVar, C48923a aVar2, C24397b bVar, C12361b bVar2, C12896b bVar3) {
            this.f64733a = aVar;
            this.f64734b = aVar2;
            this.f64735c = bVar;
            this.f64736d = bVar2;
            this.f64737e = bVar3;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47093m mVar = (C47093m) obj;
            C24370b bVar = this.f64733a.f64679a;
            C52711k.m112236a((Object) mVar, "it");
            bVar.f64691b = mVar.f118902a;
            this.f64733a.f64679a.f64692c = this.f64734b.mo96755f().mo91340a(this.f64733a.f64679a.f64691b, this.f64733a.f64679a.f64690a);
            this.f64733a.f64679a.f64693d = this.f64734b.mo96755f().mo91360d(this.f64733a.f64679a.f64691b);
            C49971b h = this.f64735c.mo50178h();
            h.f125189b = R.drawable.ak9;
            ((C49951e) this.f64736d.mo23372a(C49951e.class)).mo97757a(h);
            final C49971b a = this.f64735c.mo50171a();
            a.f125193f = mVar.f118903b;
            C12932b.m25977a(this.f64737e, new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C24387s f64738a;

                {
                    this.f64738a = r1;
                }

                public final void run() {
                    ((C49951e) this.f64738a.f64736d.mo23372a(C49951e.class)).mo97757a(a);
                }
            });
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            C52671b aVar = new C24389a(arrayList, arrayList2);
            ((List) aVar.invoke(Boolean.valueOf(this.f64733a.f64679a.f64693d))).add(this.f64735c.mo50175e());
            ((List) aVar.invoke(Boolean.valueOf(!this.f64733a.f64679a.f64691b))).add(this.f64735c.mo50178h());
            ((List) aVar.invoke(Boolean.valueOf(this.f64733a.f64679a.f64692c))).add(this.f64735c.mo50179i());
            ((C49951e) this.f64736d.mo23372a(C49951e.class)).mo97758a(arrayList);
            ((C49951e) this.f64736d.mo23372a(C49951e.class)).mo97760b(arrayList2);
            ((C49951e) this.f64736d.mo23372a(C49951e.class)).mo97756a(this.f64733a.mo50167a(this.f64734b, this.f64733a.f64679a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$t */
    public static final class C24390t implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64742a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64743b;

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Integer num = (Integer) obj;
            if (num != null) {
                C49971b c = this.f64742a.mo50173c();
                if (num.intValue() == 10) {
                    i = R.drawable.akq;
                } else {
                    i = R.drawable.akr;
                }
                c.f125189b = i;
                ((C49951e) this.f64743b.mo23372a(C49951e.class)).mo97757a(c);
            }
        }

        C24390t(C24397b bVar, C12361b bVar2) {
            this.f64742a = bVar;
            this.f64743b = bVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$u */
    static final class C24391u<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24365a f64744a;

        /* renamed from: b */
        final /* synthetic */ C24397b f64745b;

        /* renamed from: c */
        final /* synthetic */ C12361b f64746c;

        C24391u(C24365a aVar, C24397b bVar, C12361b bVar2) {
            this.f64744a = aVar;
            this.f64745b = bVar;
            this.f64746c = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C49971b e = this.f64745b.mo50175e();
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                i = R.drawable.aju;
            } else {
                i = R.drawable.ajt;
            }
            e.f125189b = i;
            ((C49951e) this.f64746c.mo23372a(C49951e.class)).mo97757a(e);
            if (!this.f64744a.f64679a.f64691b) {
                C49971b h = this.f64745b.mo50178h();
                h.f125189b = R.drawable.ak9;
                ((C49951e) this.f64746c.mo23372a(C49951e.class)).mo97757a(h);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$v */
    static final class C24392v<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64747a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64748b;

        C24392v(C24397b bVar, C12361b bVar2) {
            this.f64747a = bVar;
            this.f64748b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C49971b h = this.f64747a.mo50178h();
            if (num != null && num.intValue() == 0) {
                h.f125189b = R.drawable.ak9;
            } else if (num != null && num.intValue() == 5) {
                h.f125191d = false;
            } else if (num != null && num.intValue() == 6) {
                h.f125191d = true;
            } else {
                h.f125189b = R.drawable.ak_;
            }
            ((C49951e) this.f64748b.mo23372a(C49951e.class)).mo97757a(h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$w */
    static final class C24393w<T> implements C2767k<Integer> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64749a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64750b;

        C24393w(C24397b bVar, C12361b bVar2) {
            this.f64749a = bVar;
            this.f64750b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C49971b b = this.f64749a.mo50172b();
            if (num != null && num.intValue() == 0) {
                b.f125189b = R.drawable.aki;
                if (b.f125195h > 0) {
                    b.f125195h = R.string.dli;
                }
            } else {
                b.f125189b = R.drawable.akh;
                if (b.f125195h > 0) {
                    b.f125195h = R.string.dlh;
                }
            }
            ((C49951e) this.f64750b.mo23372a(C49951e.class)).mo97757a(b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$x */
    static final class C24394x<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64751a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64752b;

        C24394x(C24397b bVar, C12361b bVar2) {
            this.f64751a = bVar;
            this.f64752b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C49971b i2 = this.f64751a.mo50179i();
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                i = R.drawable.akk;
            } else {
                i = R.drawable.akj;
            }
            i2.f125189b = i;
            i2.f125195h = R.string.dhc;
            ((C49951e) this.f64752b.mo23372a(C49951e.class)).mo97757a(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$y */
    static final class C24395y<T> implements C2767k<C47347v> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64753a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64754b;

        C24395y(C24397b bVar, C12361b bVar2) {
            this.f64753a = bVar;
            this.f64754b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C47347v vVar = (C47347v) obj;
            C49971b d = this.f64753a.mo50174d();
            C52711k.m112236a((Object) vVar, "it");
            switch (vVar.f119498a) {
                case 1:
                    if (d.f125191d) {
                        d.f125189b = R.drawable.akd;
                        break;
                    }
                    break;
                case 2:
                    if (d.f125191d) {
                        d.f125189b = R.drawable.akc;
                        break;
                    }
                    break;
                case 3:
                    d.f125191d = true;
                    if (d.f125189b != R.drawable.d4_) {
                        if (d.f125189b == R.drawable.d49) {
                            d.f125189b = R.drawable.akc;
                            break;
                        }
                    } else {
                        d.f125189b = R.drawable.akd;
                        break;
                    }
                    break;
                case 4:
                    d.f125191d = false;
                    if (d.f125189b != R.drawable.akd) {
                        if (d.f125189b == R.drawable.akc) {
                            d.f125189b = R.drawable.d49;
                            break;
                        }
                    } else {
                        d.f125189b = R.drawable.d4_;
                        break;
                    }
                    break;
            }
            ((C49951e) this.f64754b.mo23372a(C49951e.class)).mo97757a(d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bv.a$z */
    static final class C24396z<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C24397b f64755a;

        /* renamed from: b */
        final /* synthetic */ C12361b f64756b;

        C24396z(C24397b bVar, C12361b bVar2) {
            this.f64755a = bVar;
            this.f64756b = bVar2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C49971b f = this.f64755a.mo50176f();
            if (!C52711k.m112239a((Object) Boolean.valueOf(f.f125191d), (Object) bool)) {
                C52711k.m112236a((Object) bool, "it");
                f.f125191d = bool.booleanValue();
                ((C49951e) this.f64756b.mo23372a(C49951e.class)).mo97757a(f);
            }
        }
    }

    /* renamed from: a */
    public static boolean m59761a(ShortVideoContext shortVideoContext) {
        if ((!shortVideoContext.mo86366g() || C39618d.f101151O.mo83118b(C40796a.DefaultMicrophoneState) == 3) && !C43236a.m94873a(shortVideoContext) && (!shortVideoContext.mo86362d() || !C44451a.m97278a(shortVideoContext.f107036O))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m59760a(C24366a aVar, boolean z) {
        try {
            Class cls = Class.forName("com.ss.android.ugc.toolbar.IsModeo");
            cls.getDeclaredMethod("addIcons", new Class[]{C24366a.class, Boolean.TYPE}).invoke(cls.newInstance(), new Object[]{aVar, Boolean.valueOf(z)});
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final int mo50167a(C48923a aVar, C24370b bVar) {
        int i;
        ShortVideoContext c = aVar.mo96752c();
        boolean a = m59761a(c);
        boolean a2 = C43236a.m94873a(c);
        if (C23777a.m58348a()) {
            i = 6;
        } else {
            i = 5;
        }
        if (a) {
            i++;
        }
        if (a2) {
            i++;
        }
        if (bVar.f64693d) {
            i++;
        }
        if (bVar.f64694e) {
            i++;
        }
        return i + 1;
    }

    /* renamed from: a */
    public final C49952f mo50168a(C12896b bVar, C12361b bVar2, C48923a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C12361b bVar3 = bVar2;
        C48923a aVar2 = aVar;
        C52711k.m112240b(bVar, "parentScene");
        C52711k.m112240b(bVar3, "objectContainer");
        C52711k.m112240b(aVar2, "recordEnv");
        boolean a = C43844fm.m96281a(aVar.mo96751b());
        C24397b bVar4 = new C24397b(aVar2, bVar3, a);
        if (!C23780d.m58365a() || !C23780d.m58367c()) {
            z = false;
        } else {
            z = true;
        }
        C24370b bVar5 = this.f64679a;
        if (new C43875e().mo89428a() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bVar5.f64691b = z2;
        this.f64679a.f64692c = aVar.mo96755f().mo91340a(this.f64679a.f64691b, this.f64679a.f64690a);
        C24370b bVar6 = this.f64679a;
        C45004a f = aVar.mo96755f();
        if (!f.mo91319Y() || !f.mo91360d(this.f64679a.f64691b)) {
            z3 = false;
        } else {
            z3 = true;
        }
        bVar6.f64693d = z3;
        this.f64679a.f64694e = aVar.mo96752c().mo86361c();
        this.f64679a.f64695f = !C45329y.f114612c.mo91609e();
        if (aVar.mo96752c().mo86362d()) {
            StitchParams stitchParams = aVar.mo96752c().f107036O;
            if (!C44730c.f113238a.getBoolean("stich_microphone_guide", false) && stitchParams.isPGCMusic() && stitchParams.getMusicStart() >= 0) {
                C44730c.f113238a.edit().putBoolean("stich_microphone_guide", true).apply();
                this.f64679a.f64696g = true;
            }
        }
        C24366a aVar3 = new C24366a();
        aVar3.mo50169a(bVar4.mo50171a(), C24367a.f64683a).mo50169a(bVar4.mo50172b(), C24367a.f64683a).mo50169a((C49971b) bVar4.f64758b.getValue(), new C24373e(z)).mo50169a((C49971b) bVar4.f64759c.getValue(), C24367a.f64683a).mo50169a((C49971b) bVar4.f64760d.getValue(), new C24374f(z)).mo50169a(bVar4.mo50173c(), C24367a.f64683a).mo50169a(bVar4.mo50180j(), new C24375g(aVar2)).mo50169a(bVar4.mo50174d(), new C24376h(this, aVar2)).mo50169a(bVar4.mo50175e(), new C24377i(this)).mo50169a(bVar4.mo50176f(), new C24378j(this, aVar2)).mo50169a(bVar4.mo50177g(), new C24379k(this)).mo50169a(bVar4.mo50178h(), new C24380l(this)).mo50169a(bVar4.mo50179i(), new C24371c(this));
        m59760a(aVar3, a);
        if (aVar.mo96752c().mo86365f() || aVar.mo96752c().mo86366g() || aVar.mo96752c().f107101b == 1 || aVar.mo96752c().f107101b == 2) {
            aVar.mo96755f().mo91356b(aVar.mo96752c().f107089ao, true);
        }
        if (aVar.mo96755f().mo91317W()) {
            aVar.mo96755f().mo91352b(5);
        }
        List list = aVar3.f64682a;
        C49971b bVar7 = (C49971b) bVar4.f64761e.getValue();
        C24372d dVar = new C24372d(this, bVar, aVar, bVar2, bVar4);
        C49952f fVar = new C49952f(bVar, bVar2, R.id.c_q, list, bVar7, dVar, mo50167a(aVar2, this.f64679a), null, this.f64679a.f64696g, 128, null);
        return fVar;
    }
}
