package com.p683ss.android.ugc.aweme.sticker.types.multi;

import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.ViewStubCompat;
import android.view.View;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45814b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.types.multi.p2331a.C46593a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.c */
public final class C46598c implements C46592a {

    /* renamed from: a */
    C46593a f117568a;

    /* renamed from: b */
    List<Effect> f117569b;

    /* renamed from: c */
    private RecyclerView f117570c;

    /* renamed from: d */
    private AppCompatActivity f117571d;

    /* renamed from: e */
    private C46600e f117572e;

    /* renamed from: f */
    private LinearLayoutManager f117573f = new LinearLayoutManager(this.f117570c.getContext(), 0, false);

    /* renamed from: c */
    public final void mo93168c() {
    }

    /* renamed from: a */
    public final void mo93166a() {
        this.f117570c.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo93167b() {
        this.f117570c.setVisibility(8);
    }

    /* renamed from: a */
    private void m101152a(int i) {
        int j = this.f117573f.mo4749j();
        int l = this.f117573f.mo4751l();
        if (i <= j || i > l) {
            this.f117570c.mo4814b(i);
            return;
        }
        this.f117570c.scrollBy(0, this.f117570c.getChildAt(i - j).getTop());
    }

    /* renamed from: a */
    public final void mo93388a(Effect effect, int i) {
        this.f117568a.f117558b = i;
        m101152a(i);
    }

    public C46598c(AppCompatActivity appCompatActivity, View view, C46354l lVar, C45814b bVar, boolean z, C46600e eVar) {
        this.f117571d = appCompatActivity;
        this.f117570c = (RecyclerView) ((ViewStubCompat) view.findViewById(R.id.cua)).mo5425a();
        this.f117572e = eVar;
        this.f117568a = new C46593a(lVar, bVar, z);
        lVar.mo92989g().mo93019e().observe(this.f117571d, new C46599d(this));
        this.f117570c.setLayoutManager(this.f117573f);
        this.f117570c.setAdapter(this.f117568a);
    }
}
