package com.p683ss.android.ugc.aweme.infoSticker;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p683ss.android.ugc.tools.utils.KeyboardUtils;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.SearchInfoStickerPresenter */
public class SearchInfoStickerPresenter implements C0183j, C0184k, OnClickListener, OnEditorActionListener {

    /* renamed from: a */
    FragmentActivity f91360a;

    /* renamed from: b */
    public C35574ap f91361b;

    /* renamed from: c */
    public C35548a f91362c;

    /* renamed from: d */
    boolean f91363d;

    /* renamed from: e */
    public C2180b<String> f91364e;

    /* renamed from: f */
    int f91365f;

    /* renamed from: g */
    int f91366g;

    /* renamed from: h */
    boolean f91367h = true;

    /* renamed from: i */
    private C0185l f91368i;

    /* renamed from: j */
    private List<C35558ae> f91369j;

    /* renamed from: k */
    private TextWatcher f91370k = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            C35574ap apVar = SearchInfoStickerPresenter.this.f91361b;
            if (C9431p.m18664a(obj)) {
                apVar.f91430d.setVisibility(8);
            } else {
                apVar.f91430d.setVisibility(0);
            }
            SearchInfoStickerPresenter.this.f91364e.onNext(obj);
            if (C9431p.m18664a(obj)) {
                SearchInfoStickerPresenter.this.mo73940a(0);
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.SearchInfoStickerPresenter$a */
    interface C35548a {
        /* renamed from: a */
        void mo73930a();
    }

    public C0176h getLifecycle() {
        return this.f91368i;
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onActivityDestroy() {
        this.f91368i.mo333a(C0178b.DESTROYED);
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_STOP)
    public void onActivityStop() {
        this.f91368i.mo333a(C0178b.CREATED);
    }

    public void dismiss() {
        this.f91363d = false;
        C35574ap apVar = this.f91361b;
        apVar.mo73965a();
        apVar.f91436j.mo2225a().mo2177a((Fragment) apVar.f91434h).mo2189b();
        apVar.f91440n = true;
        apVar.f91431e.setVisibility(8);
        KeyboardUtils.m108325b(apVar.f91429c, apVar.f91435i);
        if (apVar.f91441o != null) {
            apVar.f91441o.mo93877a();
        }
        if (this.f91362c != null) {
            this.f91362c.mo73930a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo73943a(boolean z) {
        C0178b bVar;
        C0185l lVar = this.f91368i;
        if (z) {
            bVar = C0178b.RESUMED;
        } else {
            bVar = C0178b.CREATED;
        }
        lVar.mo333a(bVar);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.dfd) {
            dismiss();
            return;
        }
        if (view.getId() == R.id.nh) {
            this.f91361b.mo73965a();
            mo73940a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo73940a(int i) {
        if (!C9414h.m18630a(this.f91369j)) {
            ((SearchInfoStickerViewModel) C0214z.m440a(this.f91360a).mo359a(SearchInfoStickerViewModel.class)).f91373a.setValue(Boolean.valueOf(false));
            this.f91361b.mo73967a(this.f91369j, false);
            return;
        }
        C35635v.m80462a(this.f91360a).mo73933a("giphy", 0, 30).observe(this, new C35570al(this));
    }

    /* renamed from: a */
    public final void mo73942a(String str) {
        if (C9431p.m18664a(str)) {
            C50275d.m108538b((Context) this.f91360a, (int) R.string.f5w).mo98174a();
        } else {
            C35635v.m80462a(this.f91360a).mo73936b(str, "giphy", 0, 30).observe(this, new C35572an(this));
        }
    }

    SearchInfoStickerPresenter(View view, FragmentActivity fragmentActivity) {
        this.f91360a = fragmentActivity;
        this.f91369j = new ArrayList();
        fragmentActivity.getLifecycle().mo324a(this);
        this.f91368i = new C0185l(fragmentActivity);
        this.f91361b = new C35574ap(view, this.f91360a, this.f91370k);
        this.f91364e = C2180b.m6534l();
        this.f91364e.mo6534c(600, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C35568aj<Object>(this));
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo73942a(this.f91361b.mo73968b());
        return true;
    }

    /* renamed from: a */
    private void m80326a(ProviderEffectModel providerEffectModel, boolean z, boolean z2) {
        ((SearchInfoStickerViewModel) C0214z.m440a(this.f91360a).mo359a(SearchInfoStickerViewModel.class)).f91373a.setValue(Boolean.valueOf(z));
        List a = C35558ae.m80353a(providerEffectModel.getStickerList());
        this.f91367h = providerEffectModel.hasMore();
        if (z) {
            this.f91366g = providerEffectModel.getCursor();
        } else {
            this.f91365f = providerEffectModel.getCursor();
            this.f91369j.addAll(a);
        }
        this.f91361b.mo73967a(a, z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo73944b(C37722a aVar, ProviderEffectModel providerEffectModel, boolean z) {
        switch (aVar) {
            case LOADING:
                this.f91361b.mo73969b(0);
                return;
            case ERROR:
                this.f91361b.mo73969b(2);
                return;
            case SUCCESS:
                if (!C9414h.m18630a(providerEffectModel.getStickerList())) {
                    this.f91361b.mo73969b(-1);
                    m80326a(providerEffectModel, z, true);
                    break;
                } else {
                    this.f91361b.mo73969b(1);
                    return;
                }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo73941a(C37722a aVar, ProviderEffectModel providerEffectModel, boolean z) {
        switch (aVar) {
            case LOADING:
                C35574ap apVar = this.f91361b;
                apVar.f91433g.setVisibility(4);
                apVar.f91432f.mo98095b();
                return;
            case ERROR:
                this.f91361b.mo73966a(2);
                return;
            case SUCCESS:
                this.f91361b.mo73969b(-1);
                if (!C9414h.m18630a(providerEffectModel.getStickerList())) {
                    this.f91361b.mo73966a(-1);
                    m80326a(providerEffectModel, z, false);
                    break;
                } else {
                    this.f91361b.mo73966a(1);
                    return;
                }
        }
    }
}
