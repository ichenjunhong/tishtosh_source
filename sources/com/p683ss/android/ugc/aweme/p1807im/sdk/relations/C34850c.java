package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.IndexView.C34783a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34992h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34801c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34826i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c */
public final class C34850c extends C35028j {

    /* renamed from: d */
    public IndexView f89772d;

    /* renamed from: e */
    public LinearLayoutManager f89773e;

    /* renamed from: f */
    public float f89774f;

    /* renamed from: v */
    private View f89775v;

    /* renamed from: w */
    private TextView f89776w;

    /* renamed from: x */
    private C34790a f89777x;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72969e() {
        super.mo72969e();
        this.f90133m.f89641j = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo72970f() {
        super.mo72970f();
        if (this.f90129i) {
            this.f89772d.setVisibility(8);
            return;
        }
        this.f89772d.setIndexLetters(((C34992h) ((C35023g) this.f86289c).f90104b).mo73111i());
        this.f89772d.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo70609a() {
        this.f90135o = (ImTextTitleBar) this.f86288b.findViewById(R.id.d10);
        this.f90132l = (DmtStatusView) this.f86288b.findViewById(R.id.csv);
        this.f90134n = (RecyclerView) this.f86288b.findViewById(R.id.ca2);
        this.f89773e = new LinearLayoutManager(mo70611c());
        this.f90134n.setLayoutManager(this.f89773e);
        this.f90134n.mo4801a((C1340m) new C32461a(this.f86287a) {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                int sectionForPosition = ((C34801c) C34850c.this.f90133m).getSectionForPosition(C34850c.this.f89773e.mo4749j() - C34850c.this.f90133m.mo72919c());
                List i2 = ((C34992h) ((C35023g) C34850c.this.f86289c).f90104b).mo73111i();
                if (i2 != null && i2.size() != 0 && sectionForPosition >= 0 && sectionForPosition < i2.size()) {
                    C34850c.this.f89772d.setCurrentIndex((String) i2.get(sectionForPosition));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (((float) i2) > C9432q.m18687b(C34850c.this.f86287a, 10.0f)) {
                    C26894c.m65021a(C34850c.this.mo70612d(), C34850c.this.f90130j);
                }
            }
        });
        this.f90134n.mo4800a((C1339l) new C1339l() {
            /* renamed from: a */
            public final void mo5079a(boolean z) {
            }

            /* renamed from: b */
            public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            /* renamed from: a */
            public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
                if (motionEvent.getY() < C34850c.this.f89774f) {
                    return true;
                }
                return false;
            }
        });
        this.f89775v = this.f86288b.findViewById(R.id.cje);
        this.f90130j = (EditText) this.f89775v.findViewById(R.id.cj5);
        this.f90130j.setTag("relation_search_tag");
        if (C35279p.m79763a()) {
            this.f90130j.setHint(R.string.bb7);
        }
        this.f90131k = (ImageView) this.f89775v.findViewById(R.id.nh);
        this.f89772d = (IndexView) this.f86288b.findViewById(R.id.ati);
        this.f89776w = (TextView) this.f86288b.findViewById(R.id.atg);
        this.f89772d.setOnLetterTouchListener(new C34783a() {
            /* renamed from: a */
            public final void mo72895a(String str, int i) {
                C34850c.this.f89773e.mo4721a(((C34801c) C34850c.this.f90133m).getPositionForSection(i) + C34850c.this.f90133m.mo72919c(), 0);
                C26890h.onEventV3("index_bar_click");
            }
        });
        this.f89772d.setIndexLetterTv(this.f89776w);
    }

    /* renamed from: a */
    public final void mo72967a(List<IMContact> list) {
        this.f90129i = false;
        List i = ((C34992h) ((C35023g) this.f86289c).f90104b).mo73111i();
        List h = ((C34992h) ((C35023g) this.f86289c).f90104b).mo73110h();
        if (!i.isEmpty() && !h.isEmpty()) {
            int[] iArr = new int[h.size()];
            for (int i2 = 0; i2 < h.size(); i2++) {
                iArr[i2] = ((Integer) h.get(i2)).intValue();
            }
            String[] strArr = new String[i.size()];
            i.toArray(strArr);
            C34826i iVar = new C34826i(strArr, iArr);
            C34801c cVar = (C34801c) this.f90133m;
            cVar.f89665m = iVar;
            cVar.f89666n.f89668a = -1;
            this.f90133m.mo72912a(list);
            if (this.f89777x != null) {
                this.f90134n.mo4815b((C1331h) this.f89777x);
            }
            this.f89777x = new C34790a(this.f86287a, i, h);
            this.f90134n.mo4798a((C1331h) this.f89777x);
            mo72970f();
        }
    }

    /* renamed from: a */
    public final void mo72968a(List<IMContact> list, CharSequence charSequence) {
        this.f90129i = true;
        if (this.f89777x != null) {
            this.f90134n.mo4815b((C1331h) this.f89777x);
        }
        this.f90133m.mo72913a(list, charSequence);
        mo72970f();
    }

    public C34850c(Context context, View view, boolean z) {
        super(context, view, z);
        this.f89774f = C9432q.m18687b(context, 32.0f);
    }
}
