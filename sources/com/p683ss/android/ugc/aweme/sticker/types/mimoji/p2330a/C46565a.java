package com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46313c;
import com.p683ss.android.ugc.aweme.sticker.types.mimoji.C46580d;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.TabSelectViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.a */
public final class C46565a extends C1352v {

    /* renamed from: a */
    final ImageView f117473a;

    /* renamed from: b */
    public final AppCompatActivity f117474b;

    /* renamed from: c */
    public final String f117475c;

    /* renamed from: d */
    public final C46354l f117476d;

    /* renamed from: e */
    public final C46313c f117477e;

    /* renamed from: f */
    public final C46580d f117478f;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.a$a */
    static final class C46566a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46565a f117479a;

        C46566a(C46565a aVar) {
            this.f117479a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C46580d dVar = this.f117479a.f117478f;
            if (dVar != null) {
                dVar.mo93065d();
            }
            LiveData b = this.f117479a.f117476d.mo92989g().mo93014b();
            C0198r b2 = ((TabSelectViewModel) C0214z.m440a((FragmentActivity) this.f117479a.f117474b).mo359a(TabSelectViewModel.class)).mo93421b(this.f117479a.f117475c);
            Effect effect = (Effect) b.getValue();
            if (effect != null) {
                C46313c cVar = this.f117479a.f117477e;
                C52711k.m112236a((Object) effect, "this");
                C52711k.m112236a((Object) b2, "curTab");
                String str = (String) b2.getValue();
                if (str == null) {
                    str = "";
                }
                cVar.mo93045c(effect, str, "click_banner");
            }
        }
    }

    public C46565a(AppCompatActivity appCompatActivity, String str, C46354l lVar, C46313c cVar, View view, C46580d dVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(cVar, "mobHelper");
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f117474b = appCompatActivity;
        this.f117475c = str;
        this.f117476d = lVar;
        this.f117477e = cVar;
        this.f117478f = dVar;
        View findViewById = view.findViewById(R.id.dd);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.add_effect)");
        this.f117473a = (ImageView) findViewById;
    }
}
