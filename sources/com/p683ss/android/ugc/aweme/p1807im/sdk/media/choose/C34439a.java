package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34463a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel.C34482a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a */
public final class C34439a extends PopupWindow {

    /* renamed from: a */
    MediaChooseViewModel f88840a = C34482a.m78424a(this.f88844e);

    /* renamed from: b */
    private RecyclerView f88841b;

    /* renamed from: c */
    private C34446b f88842c = new C34446b(new C34442b(this));

    /* renamed from: d */
    private Animator f88843d;

    /* renamed from: e */
    private final FragmentActivity f88844e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a$a */
    public static final class C34440a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C34439a f88845a;

        /* renamed from: b */
        final /* synthetic */ boolean f88846b;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a$a$a */
        static final class C34441a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C34440a f88847a;

            C34441a(C34440a aVar) {
                this.f88847a = aVar;
            }

            public final void run() {
                this.f88847a.f88845a.dismiss();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            View contentView = this.f88845a.getContentView();
            if (!(!this.f88846b)) {
                contentView = null;
            }
            if (contentView != null) {
                contentView.postDelayed(new C34441a(this), 10);
            }
        }

        C34440a(C34439a aVar, boolean z) {
            this.f88845a = aVar;
            this.f88846b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a$b */
    static final /* synthetic */ class C34442b extends C52710j implements C52671b<C34463a, C52860x> {
        C34442b(C34439a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "openAlbum";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C34439a.class);
        }

        public final String getSignature() {
            return "openAlbum(Lcom/ss/android/ugc/aweme/im/sdk/media/choose/model/MediaAlbum;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C34463a aVar = (C34463a) obj;
            C52711k.m112240b(aVar, "p1");
            C34439a aVar2 = (C34439a) this.receiver;
            MediaChooseViewModel mediaChooseViewModel = aVar2.f88840a;
            if (mediaChooseViewModel == null) {
                C52711k.m112237a("viewModel");
            }
            mediaChooseViewModel.mo72511f().setValue(aVar);
            aVar2.mo72461a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo72461a() {
        m78379a(false);
    }

    /* renamed from: a */
    private final void m78379a(boolean z) {
        float f;
        Animator animator = this.f88843d;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.f88843d;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        float f2 = 0.0f;
        if (z) {
            f = -((float) getHeight());
        } else {
            f = 0.0f;
        }
        if (!z) {
            f2 = -((float) getHeight());
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getContentView(), "translationY", new float[]{f, f2});
        ofFloat.addListener(new C34440a(this, z));
        C52711k.m112236a((Object) ofFloat, "animator");
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(500);
        ofFloat.start();
        this.f88843d = ofFloat;
    }

    /* renamed from: a */
    public final boolean mo72462a(View view) {
        boolean z;
        C52711k.m112240b(view, "anchorView");
        if (this.f88844e.isFinishing() || isShowing()) {
            return false;
        }
        MediaChooseViewModel mediaChooseViewModel = this.f88840a;
        if (mediaChooseViewModel == null) {
            C52711k.m112237a("viewModel");
        }
        List list = (List) mediaChooseViewModel.mo72506a().getValue();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C10691a.m21542b((Context) this.f88844e, (int) R.string.beh).mo19066a();
            return false;
        }
        C34446b bVar = this.f88842c;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        C52711k.m112240b(list, "items");
        bVar.mo72466a().clear();
        bVar.mo72466a().addAll(collection);
        bVar.notifyDataSetChanged();
        showAtLocation(view, 8388659, 0, this.f88844e.getResources().getDimensionPixelSize(R.dimen.it) + C11065a.m22390a((Context) this.f88844e));
        m78379a(true);
        return true;
    }

    public C34439a(FragmentActivity fragmentActivity, int i) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f88844e = fragmentActivity;
        setContentView(LayoutInflater.from(this.f88844e).inflate(R.layout.bgm, null, false));
        setWidth(-1);
        setHeight(i);
        View findViewById = getContentView().findViewById(R.id.bc2);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.list_view)");
        this.f88841b = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f88841b;
        if (recyclerView == null) {
            C52711k.m112237a("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f88844e, 1, false));
        RecyclerView recyclerView2 = this.f88841b;
        if (recyclerView2 == null) {
            C52711k.m112237a("recyclerView");
        }
        C34446b bVar = this.f88842c;
        if (bVar == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView2.setAdapter(bVar);
    }
}
