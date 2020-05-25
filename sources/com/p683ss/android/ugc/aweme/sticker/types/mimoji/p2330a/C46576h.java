package com.p683ss.android.ugc.aweme.sticker.types.mimoji.p2330a;

import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.h */
public final class C46576h extends C1352v {

    /* renamed from: a */
    AVDmtImageTextView f117509a;

    /* renamed from: b */
    public final C46569d f117510b;

    /* renamed from: c */
    private final AppCompatActivity f117511c;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.mimoji.a.h$a */
    static final class C46577a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46576h f117512a;

        /* renamed from: b */
        final /* synthetic */ int f117513b;

        C46577a(C46576h hVar, int i) {
            this.f117512a = hVar;
            this.f117513b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f117512a.f117510b.mo93368a(this.f117513b);
        }
    }

    public C46576h(AppCompatActivity appCompatActivity, View view, C46569d dVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(dVar, "listener");
        super(view);
        this.f117511c = appCompatActivity;
        this.f117510b = dVar;
        View findViewById = view.findViewById(R.id.ct2);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.sticker_img_view)");
        this.f117509a = (AVDmtImageTextView) findViewById;
    }
}
