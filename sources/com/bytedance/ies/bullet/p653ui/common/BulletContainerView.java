package com.bytedance.ies.bullet.p653ui.common;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p630b.C10243a;
import com.bytedance.ies.bullet.p628b.p633e.C10277aa;
import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10386g;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.C10604e.C10606b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10571b;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10576e;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.view.C10614a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView */
public class BulletContainerView extends FrameLayout implements C10604e, C10606b {

    /* renamed from: a */
    public C10606b f28040a;

    /* renamed from: b */
    public boolean f28041b;

    /* renamed from: c */
    Uri f28042c;

    /* renamed from: d */
    public boolean f28043d;

    /* renamed from: e */
    public C10243a f28044e;

    /* renamed from: f */
    private final C10609f f28045f;

    /* renamed from: g */
    private C10290i f28046g;

    /* renamed from: h */
    private View f28047h;

    /* renamed from: i */
    private HashMap f28048i;

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$a */
    public static final class C10554a implements C10386g<Bundle> {

        /* renamed from: a */
        public final Bundle f28049a;

        /* renamed from: b */
        final /* synthetic */ BulletContainerView f28050b;

        /* renamed from: c */
        final /* synthetic */ Bundle f28051c;

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo18459a() {
            return this.f28049a;
        }

        C10554a(BulletContainerView bulletContainerView, Bundle bundle) {
            this.f28050b = bulletContainerView;
            this.f28051c = bundle;
            this.f28049a = bundle;
        }

        /* renamed from: a */
        public final void mo18460a(C10290i iVar, Uri uri, C10423r rVar) {
            C52711k.m112240b(iVar, "instance");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(rVar, "param");
            this.f28050b.mo18698a(iVar, uri, rVar);
            C10606b bVar = this.f28050b.f28040a;
            if (bVar != null) {
                bVar.mo18698a(iVar, uri, rVar);
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$b */
    static final class C10555b extends C52712l implements C52671b<C10326b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f28052a;

        C10555b(BulletContainerView bulletContainerView) {
            this.f28052a = bulletContainerView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C10326b) obj, "it");
            FrameLayout frameLayout = (FrameLayout) this.f28052a.mo18729a((int) R.id.e10);
            C52711k.m112236a((Object) frameLayout, "bullet_container");
            if (frameLayout.getChildCount() != 0) {
                ((FrameLayout) this.f28052a.mo18729a((int) R.id.e10)).removeAllViews();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$c */
    static final class C10556c extends C52712l implements C52671b<C10575d<? extends View>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f28053a;

        C10556c(BulletContainerView bulletContainerView) {
            this.f28053a = bulletContainerView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C10575d dVar = (C10575d) obj;
            C52711k.m112240b(dVar, "it");
            ((FrameLayout) this.f28053a.mo18729a((int) R.id.e10)).addView(dVar.f28092b, dVar.f28093c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$d */
    static final class C10557d extends C52712l implements C52686q<C10290i, List<? extends C10575d<? extends View>>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f28054a;

        /* renamed from: b */
        final /* synthetic */ Uri f28055b;

        C10557d(BulletContainerView bulletContainerView, Uri uri) {
            this.f28054a = bulletContainerView;
            this.f28055b = uri;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            boolean z;
            C10290i iVar = (C10290i) obj;
            List list = (List) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            C52711k.m112240b(iVar, "instance");
            C52711k.m112240b(list, "viewComponents");
            this.f28054a.mo18699a(list, this.f28055b, iVar, booleanValue);
            C10606b bVar = this.f28054a.f28040a;
            if (bVar != null) {
                bVar.mo18699a(list, this.f28055b, iVar, booleanValue);
            }
            C10243a aVar = this.f28054a.f28044e;
            if (aVar != null) {
                if (!aVar.f27637a || !aVar.f27638b) {
                    z = false;
                } else {
                    z = true;
                }
                String str = null;
                if (!z) {
                    aVar = null;
                }
                if (aVar != null) {
                    FrameLayout frameLayout = (FrameLayout) this.f28054a.mo18729a((int) R.id.e10);
                    C52711k.m112236a((Object) frameLayout, "bullet_container");
                    int childCount = frameLayout.getChildCount();
                    DebugTagTextView debugTagTextView = null;
                    for (int i = 1; i < childCount; i++) {
                        View childAt = ((FrameLayout) this.f28054a.mo18729a((int) R.id.e10)).getChildAt(i);
                        if (childAt != null) {
                            if (!(childAt instanceof DebugTagTextView)) {
                                childAt = null;
                            }
                            debugTagTextView = (DebugTagTextView) childAt;
                        }
                        if (debugTagTextView != null) {
                            break;
                        }
                    }
                    if (debugTagTextView == null) {
                        View inflate = LayoutInflater.from(this.f28054a.getContext()).inflate(R.layout.b3l, null);
                        if (!(inflate instanceof DebugTagTextView)) {
                            inflate = null;
                        }
                        debugTagTextView = (DebugTagTextView) inflate;
                        LayoutParams layoutParams = new LayoutParams(-2, -2);
                        layoutParams.gravity = 83;
                        int dimensionPixelSize = this.f28054a.getResources().getDimensionPixelSize(R.dimen.xv);
                        layoutParams.leftMargin = dimensionPixelSize;
                        layoutParams.bottomMargin = dimensionPixelSize;
                        this.f28054a.addView(debugTagTextView, layoutParams);
                    }
                    if (debugTagTextView != null) {
                        if (!(iVar instanceof C10571b)) {
                            iVar = null;
                        }
                        C10571b bVar2 = (C10571b) iVar;
                        if (bVar2 != null) {
                            str = bVar2.mo18670v();
                        }
                        debugTagTextView.setText(String.valueOf(str));
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$e */
    static final class C10558e extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f28056a;

        /* renamed from: b */
        final /* synthetic */ Uri f28057b;

        C10558e(BulletContainerView bulletContainerView, Uri uri) {
            this.f28056a = bulletContainerView;
            this.f28057b = uri;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            this.f28056a.mo18696a(this.f28057b, th);
            C10606b bVar = this.f28056a.f28040a;
            if (bVar != null) {
                bVar.mo18696a(this.f28057b, th);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletContainerView$f */
    public static final class C10559f implements C10576e<View> {

        /* renamed from: a */
        final /* synthetic */ C10575d f28058a;

        /* renamed from: b */
        final /* synthetic */ BulletContainerView f28059b;

        /* renamed from: c */
        final /* synthetic */ C10290i f28060c;

        /* renamed from: a */
        public final void mo18740a(C10575d<View> dVar, Uri uri) {
            C52711k.m112240b(dVar, "viewComponent");
            C52711k.m112240b(uri, "uri");
            this.f28059b.f28041b = false;
        }

        /* renamed from: b */
        public final void mo18742b(C10575d<View> dVar, Uri uri) {
            C52711k.m112240b(dVar, "viewComponent");
            C52711k.m112240b(uri, "uri");
            if (!this.f28059b.f28041b) {
                this.f28059b.f28041b = true;
                this.f28059b.mo18697a((View) dVar.f28092b, uri, this.f28060c);
                C10606b bVar = this.f28059b.f28040a;
                if (bVar != null) {
                    bVar.mo18697a((View) dVar.f28092b, uri, this.f28060c);
                }
            }
            this.f28058a.mo18758a((C10576e<T>) this);
        }

        C10559f(C10575d dVar, BulletContainerView bulletContainerView, C10290i iVar) {
            this.f28058a = dVar;
            this.f28059b = bulletContainerView;
            this.f28060c = iVar;
        }

        /* renamed from: a */
        public final void mo18741a(C10575d<View> dVar, Uri uri, Throwable th) {
            C52711k.m112240b(dVar, "viewComponent");
            C52711k.m112240b(uri, "uri");
            C52711k.m112240b(th, "e");
            if (!this.f28059b.f28041b) {
                this.f28059b.f28041b = true;
                this.f28059b.mo18696a(uri, th);
                C10606b bVar = this.f28059b.f28040a;
                if (bVar != null) {
                    bVar.mo18696a(uri, th);
                }
            }
            this.f28058a.mo18758a((C10576e<T>) this);
        }
    }

    public BulletContainerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BulletContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo18729a(int i) {
        if (this.f28048i == null) {
            this.f28048i = new HashMap();
        }
        View view = (View) this.f28048i.get(Integer.valueOf(R.id.e10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.e10);
        this.f28048i.put(Integer.valueOf(R.id.e10), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo18274a(C10246b bVar) {
        C52711k.m112240b(bVar, "coreProvider");
        this.f28045f.mo18274a(bVar);
        C10243a aVar = (C10243a) bVar.mo18244a().mo18262a().mo18401c(C10243a.class);
        if (aVar != null) {
            this.f28044e = new C10243a(aVar.f27637a, aVar.f27638b);
        }
    }

    /* renamed from: a */
    public void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(rVar, "param");
        if (!(rVar instanceof C10578a)) {
            rVar = null;
        }
        C10578a aVar = (C10578a) rVar;
        if (aVar != null) {
            View view = this.f28047h;
            if (view != null) {
                int i = 0;
                if (!C52711k.m112239a((Object) (Boolean) aVar.f28111p.mo18457b(), (Object) Boolean.valueOf(false)) || !C52711k.m112239a((Object) (Boolean) aVar.f28102I.mo18457b(), (Object) Boolean.valueOf(true))) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        this.f28046g = iVar;
        for (C10575d dVar : list) {
            if (dVar != null) {
                C10576e fVar = new C10559f(dVar, this, iVar);
                C52711k.m112240b(fVar, "delegate");
                dVar.f28091a.add(fVar);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.kit.ViewComponent<android.view.View>");
            }
        }
    }

    /* renamed from: a */
    public final void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        View view2 = this.f28047h;
        if (!(view2 instanceof C10614a)) {
            view2 = null;
        }
        C10614a aVar = (C10614a) view2;
        if (aVar != null) {
            aVar.mo18836b();
        }
    }

    /* renamed from: a */
    public void mo18731a(View view, int i, int i2, int i3, int i4, int i5) {
        C52711k.m112240b(view, "loadingView");
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i3;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        addView(view);
        this.f28047h = view;
    }

    public C10326b getProviderFactory() {
        C10326b b = this.f28045f.mo18752b();
        b.mo18397a(BulletContainerView.class, this);
        return b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f28043d) {
            mo18295a();
        }
    }

    public String getReactId() {
        C10290i iVar = this.f28046g;
        if (iVar != null) {
            C10277aa k_ = iVar.mo18352k_();
            if (k_ != null) {
                String str = k_.f27674a;
                if (str != null) {
                    return str;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo18295a() {
        getProviderFactory().mo18395a(C10577d.class);
        this.f28045f.mo18295a();
    }

    public final void setAutoReleasableWhenDetached(boolean z) {
        this.f28043d = z;
    }

    /* renamed from: a */
    public final <T extends C10284d<?, ?, ?, ?>> C10290i mo18260a(Class<? extends T> cls) {
        C52711k.m112240b(cls, "clazz");
        return this.f28045f.mo18260a(cls);
    }

    public void onEvent(C10276j jVar) {
        C52711k.m112240b(jVar, "event");
        C10290i iVar = this.f28046g;
        if (iVar != null) {
            iVar.onEvent(jVar);
        }
    }

    public void setActivityWrapper(C10577d dVar) {
        C52711k.m112240b(dVar, "activityWrapper");
        getProviderFactory().mo18400b(C10577d.class, dVar);
    }

    public final void setLoadingViewInternal$bullet_ui_common_release(View view) {
        C52711k.m112240b(view, "loadingView");
        view.setVisibility(0);
        addView(view);
        this.f28047h = view;
    }

    /* renamed from: a */
    public final C10290i mo18261a(String str) {
        C52711k.m112240b(str, "sessionId");
        return this.f28045f.mo18261a(str);
    }

    /* renamed from: a */
    public final void mo18695a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        View view = this.f28047h;
        if (!(view instanceof C10614a)) {
            view = null;
        }
        C10614a aVar = (C10614a) view;
        if (aVar != null) {
            aVar.mo18835a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21263a(Uri uri, C10326b bVar) {
        C10609f fVar = this.f28045f;
        if (bVar == null) {
            bVar = new C10326b();
        }
        fVar.mo18751a(uri, bVar, new C10555b(this), new C10556c(this), new C10557d(this, uri), new C10558e(this, uri));
    }

    /* renamed from: a */
    public final void mo18696a(Uri uri, Throwable th) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(th, "e");
        View view = this.f28047h;
        if (!(view instanceof C10614a)) {
            view = null;
        }
        C10614a aVar = (C10614a) view;
        if (aVar != null) {
            aVar.mo18836b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo18732b(Uri uri, Bundle bundle, C10606b bVar) {
        mo18695a(uri);
        this.f28042c = uri;
        this.f28040a = bVar;
        C10606b bVar2 = this.f28040a;
        if (bVar2 != null) {
            bVar2.mo18695a(uri);
        }
        getProviderFactory().mo18397a(C10386g.class, new C10554a(this, bundle));
    }

    public BulletContainerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f28045f = new C10567c(context);
        LayoutInflater.from(context).inflate(R.layout.b3j, this);
    }

    /* renamed from: a */
    public void mo18730a(Uri uri, Bundle bundle, C10606b bVar) {
        C52711k.m112240b(uri, "uri");
        mo18732b(uri, bundle, bVar);
        m21263a(uri, (C10326b) null);
    }

    public /* synthetic */ BulletContainerView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
