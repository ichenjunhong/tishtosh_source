package com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46313c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46579c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46580d;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.g */
public final class C46574g {

    /* renamed from: a */
    public C46570e f117497a;

    /* renamed from: b */
    public HashSet<String> f117498b = new HashSet<>();

    /* renamed from: c */
    public final AppCompatActivity f117499c;

    /* renamed from: d */
    public final String f117500d;

    /* renamed from: e */
    public final C46313c f117501e;

    /* renamed from: f */
    public final C46354l f117502f;

    /* renamed from: g */
    private RecyclerView f117503g;

    /* renamed from: h */
    private TextView f117504h;

    /* renamed from: i */
    private View f117505i;

    /* renamed from: j */
    private View f117506j;

    /* renamed from: a */
    public final void mo93374a() {
        this.f117506j.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo93377b() {
        this.f117506j.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo93375a(int i) {
        this.f117506j.setVisibility(0);
        this.f117497a.mo93369a(i);
    }

    /* renamed from: a */
    public final void mo93376a(List<? extends StickerWrapper> list) {
        C52711k.m112240b(list, "list");
        this.f117497a.mo93370a(list);
        if (list.isEmpty()) {
            this.f117504h.setVisibility(4);
            this.f117505i.setVisibility(4);
        } else {
            this.f117504h.setVisibility(0);
            this.f117505i.setVisibility(0);
        }
        for (StickerWrapper stickerWrapper : list) {
            m101099a(stickerWrapper.f115779a);
        }
    }

    /* renamed from: a */
    private final void m101099a(Effect effect) {
        if (effect != null && !this.f117498b.contains(effect.getEffectId())) {
            this.f117498b.add(effect.getEffectId());
            LiveData b = this.f117502f.mo92989g().mo93014b();
            C0198r b2 = ((TabSelectViewModel) C0214z.m440a((FragmentActivity) this.f117499c).mo359a(TabSelectViewModel.class)).mo93421b(this.f117500d);
            Effect effect2 = (Effect) b.getValue();
            if (effect2 != null) {
                C46313c cVar = this.f117501e;
                C52711k.m112236a((Object) effect2, "this");
                C52711k.m112236a((Object) b2, "curTab");
                String str = (String) b2.getValue();
                if (str == null) {
                    str = "";
                }
                cVar.mo93042a(effect2, str, "click_banner");
            }
        }
    }

    public C46574g(AppCompatActivity appCompatActivity, String str, C46313c cVar, C46354l lVar, View view, final C46580d dVar, C46579c cVar2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(cVar, "mobHelper");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(view, "rootView");
        this.f117499c = appCompatActivity;
        this.f117500d = str;
        this.f117501e = cVar;
        this.f117502f = lVar;
        View findViewById = view.findViewById(R.id.cub);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.…tub_personal_effect_list)");
        this.f117506j = findViewById;
        View findViewById2 = this.f117506j.findViewById(R.id.bxb);
        C52711k.m112236a((Object) findViewById2, "curView.findViewById(R.id.personal_effect)");
        this.f117503g = (RecyclerView) findViewById2;
        View findViewById3 = this.f117506j.findViewById(R.id.sc);
        C52711k.m112236a((Object) findViewById3, "curView.findViewById(R.id.change_effect)");
        this.f117504h = (TextView) findViewById3;
        View findViewById4 = this.f117506j.findViewById(R.id.sd);
        C52711k.m112236a((Object) findViewById4, "curView.findViewById(R.i…change_effect_split_view)");
        this.f117505i = findViewById4;
        C46570e eVar = new C46570e(this.f117499c, this.f117501e, this.f117500d, this.f117502f, dVar, cVar2);
        this.f117497a = eVar;
        this.f117503g.setLayoutManager(new LinearLayoutManager(this.f117503g.getContext(), 0, false));
        this.f117503g.setAdapter(this.f117497a);
        this.f117504h.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C46574g f117507a;

            {
                this.f117507a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C46580d dVar = dVar;
                if (dVar != null) {
                    dVar.mo93056a(this.f117507a.f117497a.f117481b);
                }
                LiveData b = this.f117507a.f117502f.mo92989g().mo93014b();
                C0198r b2 = ((TabSelectViewModel) C0214z.m440a((FragmentActivity) this.f117507a.f117499c).mo359a(TabSelectViewModel.class)).mo93421b(this.f117507a.f117500d);
                Effect effect = (Effect) b.getValue();
                if (effect != null) {
                    C46313c cVar = this.f117507a.f117501e;
                    C52711k.m112236a((Object) effect, "this");
                    C52711k.m112236a((Object) b2, "curTab");
                    String str = (String) b2.getValue();
                    if (str == null) {
                        str = "";
                    }
                    cVar.mo93046d(effect, str, "click_banner");
                }
            }
        });
    }
}
