package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34469b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel.C34482a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1849a.C34407b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity */
public final class MediaChooseActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88827a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaChooseActivity.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/viewmodel/MediaChooseViewModel;"))};

    /* renamed from: c */
    public static final C34430a f88828c = new C34430a(null);

    /* renamed from: b */
    public C34439a f88829b;

    /* renamed from: d */
    private final C52668f f88830d = C52732g.m112285a(new C34438i(this));

    /* renamed from: e */
    private HashMap f88831e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$a */
    public static final class C34430a {
        private C34430a() {
        }

        public /* synthetic */ C34430a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$b */
    static final class C34431b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88832a;

        C34431b(MediaChooseActivity mediaChooseActivity) {
            this.f88832a = mediaChooseActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52711k.m112236a((Object) view, "it");
            view.setSelected(!view.isSelected());
            this.f88832a.mo72454a().f88934c = view.isSelected();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$c */
    static final class C34432c extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88833a;

        C34432c(MediaChooseActivity mediaChooseActivity) {
            this.f88833a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88833a.m78374a(true, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$d */
    static final class C34433d<T> implements C0199s<List<C34409a>> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88834a;

        C34433d(MediaChooseActivity mediaChooseActivity) {
            this.f88834a = mediaChooseActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            this.f88834a.mo72456b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$e */
    static final class C34434e extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88835a;

        C34434e(MediaChooseActivity mediaChooseActivity) {
            this.f88835a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88835a.m78374a(false, null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$f */
    static final class C34435f extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88836a;

        C34435f(MediaChooseActivity mediaChooseActivity) {
            this.f88836a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88836a.mo72457c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$g */
    static final class C34436g extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88837a;

        C34436g(MediaChooseActivity mediaChooseActivity) {
            this.f88837a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f88837a.mo72457c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$h */
    static final class C34437h<T> implements C0199s<C34463a> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88838a;

        C34437h(MediaChooseActivity mediaChooseActivity) {
            this.f88838a = mediaChooseActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C34463a aVar = (C34463a) obj;
            if (this.f88838a.f88829b != null) {
                this.f88838a.mo72455a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$i */
    static final class C34438i extends C52712l implements C52670a<MediaChooseViewModel> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f88839a;

        C34438i(MediaChooseActivity mediaChooseActivity) {
            this.f88839a = mediaChooseActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C34482a.m78424a(this.f88839a);
        }
    }

    /* renamed from: a */
    private View m78372a(int i) {
        if (this.f88831e == null) {
            this.f88831e = new HashMap();
        }
        View view = (View) this.f88831e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88831e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MediaChooseViewModel mo72454a() {
        return (MediaChooseViewModel) this.f88830d.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.ej, R.anim.r);
    }

    public final void onBackPressed() {
        setResult(2011, new Intent());
        super.onBackPressed();
    }

    /* renamed from: b */
    public final void mo72456b() {
        boolean z;
        if (isViewValid()) {
            List list = (List) mo72454a().mo72510e().getValue();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtButton dmtButton = (DmtButton) m78372a((int) R.id.p3);
                C52711k.m112236a((Object) dmtButton, "btn_send");
                dmtButton.setText(getResources().getString(R.string.bn5));
                DmtButton dmtButton2 = (DmtButton) m78372a((int) R.id.p3);
                C52711k.m112236a((Object) dmtButton2, "btn_send");
                dmtButton2.setEnabled(false);
                return;
            }
            DmtButton dmtButton3 = (DmtButton) m78372a((int) R.id.p3);
            C52711k.m112236a((Object) dmtButton3, "btn_send");
            dmtButton3.setText(getResources().getString(R.string.bn7, new Object[]{Integer.valueOf(list.size())}));
            DmtButton dmtButton4 = (DmtButton) m78372a((int) R.id.p3);
            C52711k.m112236a((Object) dmtButton4, "btn_send");
            dmtButton4.setEnabled(true);
        }
    }

    /* renamed from: c */
    public final void mo72457c() {
        boolean z;
        Collection collection = (Collection) mo72454a().mo72506a().getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f88829b == null) {
                FragmentActivity fragmentActivity = this;
                FrameLayout frameLayout = (FrameLayout) m78372a((int) R.id.ajf);
                C52711k.m112236a((Object) frameLayout, "fragment_container");
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = (FrameLayout) m78372a((int) R.id.b73);
                C52711k.m112236a((Object) frameLayout2, "layout_bottom");
                this.f88829b = new C34439a(fragmentActivity, height + frameLayout2.getHeight());
            }
            C34439a aVar = this.f88829b;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (aVar.isShowing()) {
                C34439a aVar2 = this.f88829b;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.mo72461a();
                mo72455a(false);
                return;
            }
            C34439a aVar3 = this.f88829b;
            if (aVar3 == null) {
                C52711k.m112234a();
            }
            RelativeLayout relativeLayout = (RelativeLayout) m78372a((int) R.id.d10);
            C52711k.m112236a((Object) relativeLayout, "title_bar");
            aVar3.mo72462a((View) relativeLayout);
            mo72455a(true);
        }
    }

    /* renamed from: a */
    public final void mo72455a(boolean z) {
        float f;
        float f2;
        if (z) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        ((ImageView) m78372a((int) R.id.edx)).startAnimation(rotateAnimation);
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(R.anim.q, R.anim.ej);
        setContentView((int) R.layout.bc_);
        C34004b.m77718b().setupStatusBar(this);
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("extra_choose_parameters");
        } else {
            serializable = null;
        }
        if (serializable instanceof C34469b) {
            MediaChooseViewModel a = mo72454a();
            C34469b bVar = (C34469b) serializable;
            C52711k.m112240b(bVar, "<set-?>");
            a.f88933b = bVar;
            mo72454a().f88934c = bVar.getSendRaw();
            mo72454a().mo72510e().setValue(bVar.getSelectedList());
        }
        DmtTextView dmtTextView = (DmtTextView) m78372a((int) R.id.d70);
        C52711k.m112236a((Object) dmtTextView, "tv_back");
        C34407b.m78359a(dmtTextView, new C34434e(this));
        DmtTextView dmtTextView2 = (DmtTextView) m78372a((int) R.id.f1f);
        C52711k.m112236a((Object) dmtTextView2, "tv_album");
        C34407b.m78359a(dmtTextView2, new C34435f(this));
        ImageView imageView = (ImageView) m78372a((int) R.id.edx);
        C52711k.m112236a((Object) imageView, "iv_album");
        C34407b.m78359a(imageView, new C34436g(this));
        C0184k kVar = this;
        mo72454a().mo72511f().observe(kVar, new C34437h(this));
        C35225a.m79617l().mo73331a((DmtTextView) m78372a((int) R.id.d70), (DmtTextView) m78372a((int) R.id.f1f), (ImageView) m78372a((int) R.id.edx));
        if (mo72454a().f88933b.supportGif()) {
            FrameLayout frameLayout = (FrameLayout) m78372a((int) R.id.b73);
            C52711k.m112236a((Object) frameLayout, "layout_bottom");
            frameLayout.setVisibility(8);
        }
        DmtTextView dmtTextView3 = (DmtTextView) m78372a((int) R.id.e0s);
        C52711k.m112236a((Object) dmtTextView3, "btn_send_raw");
        dmtTextView3.setSelected(mo72454a().f88934c);
        ((DmtTextView) m78372a((int) R.id.e0s)).setOnClickListener(new C34431b(this));
        DmtButton dmtButton = (DmtButton) m78372a((int) R.id.p3);
        C52711k.m112236a((Object) dmtButton, "btn_send");
        C34407b.m78359a(dmtButton, new C34432c(this));
        C35225a.m79617l().mo73331a((DmtTextView) m78372a((int) R.id.e0s), (DmtButton) m78372a((int) R.id.p3));
        mo72454a().mo72510e().observe(kVar, new C34433d(this));
        mo72456b();
        getSupportFragmentManager().mo2225a().mo2192b(R.id.ajf, new C34458d(), "TAG_CONTAINER").mo2195c();
        mo72454a().mo72513l();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onCreate", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m78374a(boolean z, C34472c cVar) {
        Serializable serializable;
        int i;
        Intent intent = new Intent();
        String str = "extra_choose_result";
        if (cVar != null) {
            serializable = cVar;
        } else {
            ArrayList arrayList = new ArrayList();
            List list = (List) mo72454a().mo72510e().getValue();
            if (list != null) {
                arrayList.addAll(list);
            }
            serializable = new C34472c(mo72454a().f88934c, arrayList);
        }
        intent.putExtra(str, serializable);
        if (z) {
            i = 2012;
        } else {
            i = 2011;
        }
        setResult(i, intent);
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        super.onActivityResult(i, i2, intent);
        if (i == 2002) {
            Object obj2 = null;
            if (intent != null) {
                obj = intent.getSerializableExtra("extra_choose_result");
            } else {
                obj = null;
            }
            if (obj instanceof C34472c) {
                obj2 = obj;
            }
            C34472c cVar = (C34472c) obj2;
            if (i2 != 2011) {
                m78374a(true, cVar);
            } else if (cVar != null) {
                DmtTextView dmtTextView = (DmtTextView) m78372a((int) R.id.e0s);
                if (dmtTextView != null) {
                    dmtTextView.setSelected(cVar.getSendRaw());
                }
                mo72454a().f88934c = cVar.getSendRaw();
                mo72454a().mo72510e().setValue(C52575l.m112139e((Collection<? extends T>) cVar.getSelectedList()));
            }
        }
    }
}
