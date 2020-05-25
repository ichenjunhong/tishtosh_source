package com.p683ss.android.ugc.aweme.feed.panel;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.guide.C30282f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30449f;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.utils.C31217y;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31865b;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.main.C36553cd;
import com.p683ss.android.ugc.aweme.main.p1939c.C36549b;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.o */
public final class C30645o extends C30648q {

    /* renamed from: a */
    public C30282f f80080a;

    /* renamed from: b */
    public C30449f f80081b;

    /* renamed from: c */
    public C30464q f80082c;

    /* renamed from: s */
    private boolean f80083s = true;

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public final void mo62826aA() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo55803d() {
        return super.mo55803d();
    }

    public final void aJ_() {
        super.aJ_();
        C36553cd.m82448d();
        if (mo62963bx()) {
            ScrollSwitchStateManager.m75876a((FragmentActivity) this.f121964aK).mo69863a(false);
        }
        if (this.f79945E != null && this.f79945E.getCount() > 0) {
            if (mo62963bx()) {
                mo62829aD();
            }
            this.f79945E.mo60331a(Collections.emptyList());
            this.f79945E.f78454e = false;
            View ao = mo60526ao();
            if (ao != null) {
                ao.setAlpha(0.0f);
            }
        }
        mo55828p();
        C30282f fVar = this.f80080a;
        if (fVar != null) {
            fVar.mo60632a(this.f79984ab);
        }
        if (this.f80082c != null) {
            this.f80082c.mo56557k();
        }
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        super.onFollowSuccess(followStatus);
        if (followStatus != null && followStatus.followStatus == 0) {
            mo62967b(followStatus.userId);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        super.mo47028c(exc);
        C10691a.m21542b(mo96010bw(), (int) R.string.dnb).mo19066a();
    }

    @C53771m
    public final void onFollowCleanModeChangedEvent(C36549b bVar) {
        boolean z = C36512b.m82421a().f93585b;
        for (int i = 0; i < this.f80030y.getChildCount(); i++) {
            C30016ag f = mo62882f(i);
            if (f != null) {
                f.mo60231d(z);
            }
        }
    }

    @C53771m
    public final void onMaskLayerCancelFollowEvent(C31865b bVar) {
        if (bVar.f83246a != null) {
            mo62860b(bVar.f83246a, bVar.f83247b);
            C31217y.m72906a(bVar.f83246a, "long_press");
        }
    }

    public C30645o(String str, int i) {
        super(str, 1);
    }

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
        if (this.f79945E.getCount() == 0) {
            this.f79945E.mo60331a(list);
        } else {
            this.f79945E.mo60332a(list, i, 1);
            this.f79945E.notifyDataSetChanged();
        }
        if (i >= 0 && i < this.f79945E.getCount()) {
            this.f80030y.setCurrentItem(i);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Aweme> list, boolean z) {
        if (this.f80080a != null) {
            this.f80080a.mo60639c();
        }
        if (this.f121964aK instanceof FragmentActivity) {
            FollowPageFirstFrameViewModel.m103062a((FragmentActivity) this.f121964aK);
        }
        super.mo47018a(list, z);
        if (!this.f80083s) {
            if (!C9376b.m18558a((Collection<T>) list)) {
                mo62885h((Aweme) list.get(0));
            }
            this.f80083s = false;
        }
        if (mo62963bx()) {
            ScrollSwitchStateManager.m75876a((FragmentActivity) this.f121964aK).mo69863a(!C9376b.m18558a((Collection<T>) this.f79945E.mo60286c()));
        }
        C36553cd.m82448d();
        if (this.f80081b == null || !this.f80081b.mo60876h()) {
            C10691a.m21548c((Context) this.f121964aK, (int) R.string.an1).mo19066a();
            if (this.f80082c != null) {
                this.f80082c.mo56557k();
            }
            return;
        }
        final int currentItem = this.f80030y.getCurrentItem();
        final Aweme c = this.f79945E.mo60285c(currentItem);
        this.f80030y.post(new Runnable() {
            public final void run() {
                if (C30645o.this.f80030y != null) {
                    C30645o.this.f79946F = 0;
                    if (currentItem == 0) {
                        C30645o.this.mo62879d(c);
                        C30645o.this.f79948H = false;
                    } else {
                        C30645o.this.f79948H = true;
                        C30645o.this.f80030y.mo55004a(C30645o.this.f79946F, true);
                    }
                    if (C30645o.this.f80082c != null) {
                        C30645o.this.f80082c.mo56557k();
                    }
                }
            }
        });
    }
}
