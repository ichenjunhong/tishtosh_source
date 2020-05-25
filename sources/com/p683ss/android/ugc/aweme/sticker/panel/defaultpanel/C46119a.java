package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1337j;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.common.utility.C9414h;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.shortvideo.RetakeViewModel;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2285i.C45924b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46036g;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46053c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46054d;
import com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel.p2305a.C46124a;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.panel.search.SearchStickerViewModel;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46353k;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.a */
public class C46119a extends C46164n {

    /* renamed from: a */
    public C46086b f116376a;

    /* renamed from: b */
    public C46124a f116377b;

    /* renamed from: c */
    protected String f116378c;

    /* renamed from: d */
    protected String f116379d;

    /* renamed from: e */
    protected CategoryEffectModel f116380e;

    /* renamed from: f */
    public C1337j f116381f;

    /* renamed from: g */
    public int f116382g;

    /* renamed from: s */
    private C46053c f116383s;

    /* renamed from: t */
    private List<StickerWrapper> f116384t = new ArrayList();

    /* renamed from: u */
    private Effect f116385u;

    /* renamed from: v */
    private boolean f116386v = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo92811a() {
        m100207a(this.f116379d).observe(this, new C46150e(this));
    }

    /* renamed from: d */
    public final void mo92819d() {
        HashSet hashSet = (HashSet) this.f116494j.mo92973a().mo92537i().mo92539a().get(this.f116378c);
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f116383s != null) {
            C46053c cVar = this.f116383s;
            cVar.f116193a.mo4818b((C1340m) cVar);
            cVar.f116193a.removeOnAttachStateChangeListener(cVar);
            cVar.f116193a.mo4816b((C1337j) cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo92817b() {
        if (this.f116380e == null || C9414h.m18630a(this.f116380e.getEffects())) {
            this.f116502r.mo98097c();
            m100208b(1);
            return;
        }
        this.f116502r.mo98093a();
        List effects = this.f116380e.getEffects();
        FragmentActivity activity = getActivity();
        if (!C9414h.m18630a(effects) && activity != null) {
            C46124a aVar = this.f116377b;
            C46354l lVar = this.f116494j;
            String str = this.f116379d;
            C52711k.m112240b(lVar, "$this$findCategoryIndex");
            C52711k.m112240b(str, "category");
            int i = 0;
            Iterator it = C45924b.m99852a(lVar.mo92973a().mo92537i()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (C52711k.m112239a((Object) ((EffectCategoryModel) it.next()).getKey(), (Object) str)) {
                    break;
                } else {
                    i++;
                }
            }
            aVar.f116391a = i;
            C0013i.m18a((Callable<TResult>) new C46151f<TResult>(this, effects), C0013i.f25b).mo20a((C0011g<TResult, TContinuationResult>) new C46152g<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: c */
    public final void mo92818c() {
        String str;
        if (this.f116500p != null && this.f116377b != null) {
            int j = this.f116500p.mo4749j();
            int l = this.f116500p.mo4751l();
            HashSet hashSet = (HashSet) this.f116494j.mo92973a().mo92537i().mo92539a().get(this.f116378c);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f116494j.mo92973a().mo92537i().mo92539a().put(this.f116378c, hashSet);
            }
            while (true) {
                j++;
                if (j >= l + 1) {
                    break;
                }
                StickerWrapper stickerWrapper = (StickerWrapper) this.f116377b.mo92831c(j);
                if (stickerWrapper != null && !hashSet.contains(stickerWrapper.f115779a.getEffectId())) {
                    String effectId = stickerWrapper.f115779a.getEffectId();
                    C45889c cVar = this.f116496l;
                    Effect effect = stickerWrapper.f115779a;
                    if (this.f116378c == null) {
                        str = "";
                    } else {
                        str = this.f116378c;
                    }
                    cVar.mo92481a(effect, str, "click_main_panel", -1);
                    hashSet.add(effectId);
                }
            }
            if (this.f116377b.mo92825b() != null && this.f116377b.mo92825b().size() > 0) {
                m100208b(3);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ List mo92810a(List list) throws Exception {
        return C46036g.m100020a(list, this.f116378c);
    }

    /* renamed from: a */
    private LiveData<C37721a<CategoryEffectModel>> m100207a(String str) {
        return this.f116494j.mo92973a().mo92537i().mo92538a(str, true);
    }

    /* renamed from: b */
    private void m100208b(int i) {
        if (this.f116494j.mo92987e() != -1) {
            this.f116496l.mo92480a(System.currentTimeMillis() - this.f116494j.mo92987e(), i);
            this.f116494j.mo92976a(-1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo92809a(C0013i iVar) throws Exception {
        List<StickerWrapper> list = (List) iVar.mo34e();
        if (!C9414h.m18630a(list)) {
            this.f116384t = list;
            this.f116377b.mo64318a(this.f116384t);
            if (!TextUtils.equals("xssticker", this.f116498n)) {
                m100208b(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo92812a(int i) {
        String str;
        HashSet hashSet = (HashSet) this.f116494j.mo92973a().mo92537i().mo92539a().get(this.f116378c);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f116494j.mo92973a().mo92537i().mo92539a().put(this.f116378c, hashSet);
        }
        StickerWrapper stickerWrapper = (StickerWrapper) this.f116377b.mo92831c(i + 1);
        if (stickerWrapper != null && !hashSet.contains(stickerWrapper.f115779a.getEffectId())) {
            C45889c cVar = this.f116496l;
            Effect effect = stickerWrapper.f115779a;
            if (this.f116378c == null) {
                str = "";
            } else {
                str = this.f116378c;
            }
            cVar.mo92481a(effect, str, "click_main_panel", i);
            hashSet.add(stickerWrapper.f115779a.getEffectId());
        }
    }

    public void setUserVisibleHint(boolean z) {
        int i;
        super.setUserVisibleHint(z);
        if (z) {
            mo92818c();
            if (!this.f116386v) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    TabSelectViewModel tabSelectViewModel = (TabSelectViewModel) C0214z.m440a(activity).mo359a(TabSelectViewModel.class);
                    Integer num = (Integer) tabSelectViewModel.mo93422c(this.f116498n).getValue();
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (this.f116492h == i) {
                        tabSelectViewModel.mo93419a(this.f116498n, (EffectCategoryModel) tabSelectViewModel.mo93418a(this.f116498n).getValue(), i);
                        this.f116386v = true;
                    }
                }
            }
            return;
        }
        mo92819d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92813a(C37721a aVar) {
        if (aVar != null) {
            this.f116501q = aVar.f96126b;
            this.f116380e = (CategoryEffectModel) aVar.f96125a;
            C37722a aVar2 = this.f116501q;
            Throwable th = aVar.f96128d;
            if (aVar2 == C37722a.LOADING) {
                this.f116502r.mo98095b();
            } else if (aVar2 == C37722a.ERROR) {
                mo92816a(th);
            } else {
                if (aVar2 == C37722a.SUCCESS) {
                    mo92817b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92814a(C46353k kVar) {
        if (kVar != null) {
            Effect effect = kVar.f116947a;
            Effect effect2 = kVar.f116948b;
            int a = this.f116377b.mo92822a(effect);
            int a2 = this.f116377b.mo92822a(effect2);
            if (a >= 0) {
                this.f116377b.notifyItemChanged(a + 1, this.f116494j.mo92973a().mo92532d().mo92510a(effect, this.f116378c));
            }
            if (a2 >= 0) {
                this.f116377b.notifyItemChanged(a2 + 1, this.f116494j.mo92973a().mo92532d().mo92510a(effect2, this.f116378c));
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && this.f116494j != null) {
            EffectCategoryModel effectCategoryModel = (EffectCategoryModel) C45924b.m99852a(this.f116494j.mo92973a().mo92537i()).get(this.f116492h);
            this.f116378c = effectCategoryModel.getName();
            this.f116379d = effectCategoryModel.getKey();
            if (!this.f116494j.mo92973a().mo92537i().mo92539a().containsKey(this.f116378c)) {
                this.f116494j.mo92973a().mo92537i().mo92539a().put(this.f116378c, new HashSet());
            }
            if (this.f116499o.getAdapter() == null) {
                this.f116377b = new C46124a(this.f116497m, this.f116494j, this.f116495k, this.f116376a);
                this.f116499o.setAdapter(this.f116377b);
                this.f116499o.mo4801a((C1340m) new C1340m() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        super.onScrollStateChanged(recyclerView, i);
                        switch (i) {
                            case 0:
                                if (C13771c.m27875c().mo26195d()) {
                                    C13771c.m27875c().mo26193c();
                                    break;
                                }
                                break;
                            case 1:
                                if (C46119a.this.f116382g != 2) {
                                    if (C13771c.m27875c().mo26195d()) {
                                        C13771c.m27875c().mo26193c();
                                        break;
                                    }
                                } else {
                                    C13771c.m27875c().mo26190b();
                                    break;
                                }
                                break;
                            case 2:
                                C13771c.m27875c().mo26190b();
                                break;
                        }
                        C46119a.this.f116382g = i;
                    }
                });
                this.f116377b.mo97992c(false);
            } else {
                this.f116377b = (C46124a) this.f116499o.getAdapter();
            }
            if (this.f116379d == null) {
                this.f116502r.mo98095b();
            } else {
                mo92811a();
            }
            this.f116494j.mo92989g().mo93018d().observe(this, new C46133b(this));
            ((RetakeViewModel) C0214z.m440a(getActivity()).mo359a(RetakeViewModel.class)).f107019a.observe(getActivity(), new C46148c(this));
            if (this.f116492h == 1) {
                ((SearchStickerViewModel) C0214z.m440a(activity).mo359a(SearchStickerViewModel.class)).f116710a.observe(this, new C46149d(this));
            }
            this.f116499o.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    C46119a.this.f116499o.mo4816b(C46119a.this.f116381f);
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        C46119a.this.mo92818c();
                    }
                }
            });
            this.f116499o.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                    C46119a.this.mo92819d();
                }

                public final void onViewAttachedToWindow(View view) {
                    if (C46119a.this.getUserVisibleHint()) {
                        C46119a.this.mo92818c();
                    }
                }
            });
            this.f116381f = new C1337j() {
                /* renamed from: b */
                public final void mo5077b(View view) {
                }

                /* renamed from: a */
                public final void mo5076a(View view) {
                    if (C46119a.this.getUserVisibleHint()) {
                        C46119a.this.mo92812a(RecyclerView.m4275f(view));
                    }
                }
            };
            this.f116499o.mo4799a(this.f116381f);
            C46053c cVar = new C46053c(this.f116498n, this.f116379d, this, this.f116499o, this.f116500p, this.f116377b, (C46054d) this.f116497m.mo23374b(C46054d.class));
            this.f116383s = cVar;
            C46053c cVar2 = this.f116383s;
            cVar2.f116193a.mo4801a((C1340m) cVar2);
            cVar2.f116193a.addOnAttachStateChangeListener(cVar2);
            cVar2.f116193a.mo4799a((C1337j) cVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92815a(Effect effect) {
        if (effect == null) {
            return;
        }
        if (C9414h.m18630a(this.f116384t) || !effect.equals(((StickerWrapper) this.f116384t.get(0)).f115779a)) {
            int a = this.f116377b.mo92822a(effect);
            if (a != -1) {
                this.f116384t.remove(a);
                this.f116377b.notifyItemRemoved(a + 1);
            }
            if (this.f116385u != null) {
                this.f116384t.set(0, this.f116494j.mo92973a().mo92532d().mo92510a(effect, this.f116379d));
                this.f116377b.notifyItemChanged(1);
            } else {
                this.f116384t.add(0, this.f116494j.mo92973a().mo92532d().mo92510a(effect, this.f116379d));
                this.f116377b.notifyItemInserted(1);
            }
            C46124a aVar = this.f116377b;
            aVar.mo92827b(aVar.f116392b);
            this.f116499o.mo4833d(0);
            this.f116385u = effect;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo92816a(Throwable th) {
        this.f116502r.mo98098d();
        m100208b(1);
    }
}
