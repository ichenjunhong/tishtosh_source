package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.p230g.C3896j;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5511eg;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5511eg.C5512a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.p325ui.C6000bv.C6004b;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.widget.C8543d;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bj */
public final class C5988bj extends C8543d implements C5512a, C6004b {

    /* renamed from: a */
    C5511eg f15879a;

    /* renamed from: b */
    C6000bv f15880b;

    /* renamed from: c */
    Room f15881c;

    /* renamed from: d */
    private long f15882d;

    /* renamed from: e */
    private String f15883e;

    /* renamed from: f */
    private TextView f15884f;

    /* renamed from: h */
    private TextView f15885h;

    /* renamed from: i */
    private View f15886i;

    /* renamed from: j */
    private RecyclerView f15887j;

    /* renamed from: k */
    private C8548h f15888k;

    /* renamed from: l */
    private ToggleButton f15889l;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.aij;
    }

    /* renamed from: d */
    public final void mo11431d() {
        mo11984f();
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: b */
    public final void mo11428b() {
        mo11984f();
        this.f15879a.mo11411a(this.f15882d, this.f15883e);
        this.f15882d = 0;
        this.f15883e = null;
    }

    /* renamed from: c */
    public final void mo11430c() {
        mo11984f();
        this.f15882d = 0;
        this.f15883e = null;
        C4575an.m10983a(getContext(), (int) R.string.ek5);
    }

    /* renamed from: e */
    public final void mo11432e() {
        mo11984f();
        this.f15889l.setChecked(true);
        C4575an.m10983a(getContext(), (int) R.string.emj);
    }

    /* renamed from: f */
    public final void mo11984f() {
        if (this.f15888k != null && this.f15888k.isShowing()) {
            this.f15888k.dismiss();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15879a.f14555n = null;
        if (this.f15888k != null && this.f15888k.isShowing()) {
            this.f15888k.dismiss();
        }
    }

    /* renamed from: g */
    private void m13076g() {
        this.f15884f.setText(C3896j.m9851a(R.string.gzg, Integer.valueOf(this.f15880b.mo11999b())));
        int a = 2 - this.f15880b.mo11997a();
        if (a < 0) {
            a = 0;
        }
        this.f15885h.setText(C3896j.m9851a(R.string.gzf, Integer.valueOf(a)));
        if (this.f15880b.getItemCount() > 0) {
            this.f15886i.setVisibility(8);
            this.f15887j.setVisibility(0);
            return;
        }
        this.f15886i.setVisibility(0);
        this.f15887j.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo11429b(long j) {
        mo11984f();
        this.f15880b.mo11998a(j);
        m13076g();
    }

    /* renamed from: a */
    public final void mo11427a(Throwable th) {
        mo11984f();
        C4602l.m11047a(getContext(), th, (int) R.string.ek4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11981a(int i) {
        if (this.f15888k == null) {
            this.f15888k = new C8552a(getContext(), 2).mo15008c(i).mo14996a(false).mo15001b();
        }
        if (!this.f15888k.isShowing()) {
            this.f15888k.show();
        }
    }

    /* renamed from: a */
    public final void mo11425a(long j) {
        mo11984f();
        C6000bv bvVar = this.f15880b;
        int size = bvVar.f15911b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C5696e eVar = (C5696e) bvVar.f15911b.get(i);
            if (eVar != null && eVar.f14953d != null && eVar.f14953d.getId() == j) {
                eVar.f14955f = 2;
                eVar.f14954e = System.currentTimeMillis() / 1000;
                break;
            }
            i++;
        }
        bvVar.notifyItemChanged(i);
        m13076g();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15887j = (RecyclerView) findViewById(R.id.caf);
        this.f15887j.mo4798a((C1331h) new C5948aw());
        this.f15887j.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f15887j.setAdapter(this.f15880b);
        this.f15889l = (ToggleButton) findViewById(R.id.d1t);
        this.f15889l.setOnCheckedChangeListener(new C5989bk(this));
        this.f15884f = (TextView) findViewById(R.id.title);
        this.f15885h = (TextView) findViewById(R.id.a4m);
        this.f15886i = findViewById(R.id.aa2);
        m13076g();
    }

    /* renamed from: a */
    public final void mo11426a(long j, Throwable th) {
        mo11984f();
        C4602l.m11047a(getContext(), th, (int) R.string.ek5);
    }

    /* renamed from: b */
    public final void mo11983b(long j, String str) {
        if (this.f23427g) {
            new C8552a(getContext(), 0).mo15012d((int) R.string.gyl).mo15008c((int) R.string.gyk).mo15003b(0, (int) R.string.gyi, (OnClickListener) new C5990bl(this, j, str)).mo15003b(1, (int) R.string.e45, C5991bm.f15894a).mo15011d();
        }
    }

    /* renamed from: a */
    public final void mo11982a(long j, String str) {
        if (this.f23427g) {
            C4563ad.m10956a(this.f15881c, "click_agree_connection", "agree_connection", true);
            mo11981a((int) R.string.ek9);
            if (!this.f15879a.f14550i) {
                this.f15879a.mo11419d();
                this.f15882d = j;
                this.f15883e = str;
                return;
            }
            this.f15879a.mo11411a(j, str);
        }
    }

    public C5988bj(Context context, Room room, List<C5696e> list, C5511eg egVar) {
        super(context);
        this.f15881c = room;
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5696e eVar = (C5696e) it.next();
            if (eVar == null || eVar.f14953d == null || 1 == eVar.f14957h) {
                it.remove();
            }
        }
        this.f15880b = new C6000bv(this, list, 0);
        this.f15879a = egVar;
        this.f15879a.f14555n = this;
    }
}
