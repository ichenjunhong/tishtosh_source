package com.p683ss.android.ugc.aweme.commercialize.egg;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25752a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25753b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1557b.C25760c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout */
public final class CommerceEggLayout extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68058a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommerceEggLayout.class), "frescoEggController", "getFrescoEggController()Lcom/ss/android/ugc/aweme/commercialize/egg/controller/CommerceEggController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommerceEggLayout.class), "lottieEggController", "getLottieEggController()Lcom/ss/android/ugc/aweme/commercialize/egg/controller/CommerceEggController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommerceEggLayout.class), "h5EggController", "getH5EggController()Lcom/ss/android/ugc/aweme/commercialize/egg/controller/CommerceEggController;"))};

    /* renamed from: b */
    private final C52668f f68059b;

    /* renamed from: c */
    private final C52668f f68060c;

    /* renamed from: d */
    private final C52668f f68061d;

    /* renamed from: e */
    private boolean f68062e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout$a */
    static final class C25736a extends C52712l implements C52670a<C25753b> {

        /* renamed from: a */
        final /* synthetic */ CommerceEggLayout f68063a;

        C25736a(CommerceEggLayout commerceEggLayout) {
            this.f68063a = commerceEggLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C25753b(this.f68063a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout$b */
    static final class C25737b extends C52712l implements C52670a<C25752a> {

        /* renamed from: a */
        final /* synthetic */ CommerceEggLayout f68064a;

        C25737b(CommerceEggLayout commerceEggLayout) {
            this.f68064a = commerceEggLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C25945k.m62910a(this.f68064a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout$c */
    static final class C25738c extends C52712l implements C52670a<C25760c> {

        /* renamed from: a */
        final /* synthetic */ CommerceEggLayout f68065a;

        C25738c(CommerceEggLayout commerceEggLayout) {
            this.f68065a = commerceEggLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C25760c(this.f68065a);
        }
    }

    public CommerceEggLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceEggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C25752a getFrescoEggController() {
        return (C25752a) this.f68059b.getValue();
    }

    private final C25752a getH5EggController() {
        return (C25752a) this.f68061d.getValue();
    }

    private final C25752a getLottieEggController() {
        return (C25752a) this.f68060c.getValue();
    }

    /* renamed from: a */
    public final void mo52924a(C25751b bVar, C25746b bVar2) {
        mo52925a(bVar, bVar2, 1, true);
    }

    /* renamed from: a */
    public final void mo52923a() {
        if (this.f68062e) {
            getFrescoEggController().mo52953b();
            getLottieEggController().mo52953b();
            getH5EggController().mo52953b();
        }
        removeAllViews();
        setVisibility(8);
    }

    public CommerceEggLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f68059b = C52732g.m112285a(new C25736a(this));
        this.f68060c = C52732g.m112285a(new C25738c(this));
        this.f68061d = C52732g.m112285a(new C25737b(this));
    }

    /* renamed from: a */
    public final void mo52925a(C25751b bVar, C25746b bVar2, int i, boolean z) {
        C25752a aVar;
        if (bVar != null) {
            setVisibility(0);
            bringToFront();
            if (!bVar.f68097d || (bVar.f68097d && bVar.f68098e.get())) {
                String str = bVar.f68095b;
                int hashCode = str.hashCode();
                if (hashCode != 117588) {
                    if (hashCode == 120609 && str.equals("zip")) {
                        aVar = getLottieEggController();
                        aVar.f68104g = i;
                        aVar.f68105h = z;
                        aVar.f68102e = bVar;
                        aVar.f68103f = bVar2;
                        aVar.mo52951a();
                    }
                } else if (str.equals("web")) {
                    aVar = getH5EggController();
                    aVar.f68104g = i;
                    aVar.f68105h = z;
                    aVar.f68102e = bVar;
                    aVar.f68103f = bVar2;
                    aVar.mo52951a();
                }
                aVar = getFrescoEggController();
                aVar.f68104g = i;
                aVar.f68105h = z;
                aVar.f68102e = bVar;
                aVar.f68103f = bVar2;
                aVar.mo52951a();
            } else {
                if (bVar2 != null) {
                    bVar2.mo52930b();
                }
                C25945k.m62932w().mo53030a(bVar, false, "CommerceEggLayout show failed");
            }
            this.f68062e = true;
        }
    }

    public /* synthetic */ CommerceEggLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
