package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.api.C4992b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5258d;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5258d.C5262a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5470cy.C5473a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.message.model.C7829bd;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4563ad;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.widget.C8543d;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ba */
public final class C5977ba extends C8543d implements C5262a, C5473a, OnMessageListener {

    /* renamed from: a */
    C5470cy f15841a;

    /* renamed from: b */
    C5258d f15842b;

    /* renamed from: c */
    Room f15843c;

    /* renamed from: d */
    boolean f15844d;

    /* renamed from: e */
    boolean f15845e;

    /* renamed from: f */
    RecyclerView f15846f;

    /* renamed from: h */
    private long f15847h;

    /* renamed from: i */
    private String f15848i;

    /* renamed from: j */
    private boolean f15849j;

    /* renamed from: k */
    private final C1689b f15850k = new C1689b();

    /* renamed from: l */
    private TextView f15851l;

    /* renamed from: m */
    private TextView f15852m;

    /* renamed from: n */
    private View f15853n;

    /* renamed from: o */
    private C8548h f15854o;

    /* renamed from: p */
    private ToggleButton f15855p;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.aj6;
    }

    public final void onPointerCaptureChanged(boolean z) {
    }

    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
    }

    /* renamed from: d */
    public final void mo11390d() {
        m13055g();
        dismiss();
    }

    /* renamed from: g */
    private void m13055g() {
        if (this.f15854o != null && this.f15854o.isShowing()) {
            this.f15854o.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo11387b() {
        m13055g();
        this.f15841a.mo11364a(this.f15847h, this.f15848i);
        this.f15847h = 0;
        this.f15848i = null;
    }

    /* renamed from: c */
    public final void mo11389c() {
        m13055g();
        this.f15855p.setChecked(true);
        C4575an.m10983a(getContext(), (int) R.string.emj);
    }

    /* renamed from: e */
    public final void mo11391e() {
        m13055g();
        this.f15855p.setChecked(true);
        C4575an.m10983a(getContext(), (int) R.string.emj);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15849j = true;
        C4565af.m10958a().addMessageListener(C8629a.LINK_MIC.getIntType(), this);
    }

    public final void onDetachedFromWindow() {
        this.f15849j = false;
        if (C4565af.m10958a() != null) {
            C4565af.m10958a().removeMessageListener(this);
        }
        this.f15841a.f14499q = null;
        this.f15850k.mo6180a();
        if (this.f15854o != null && this.f15854o.isShowing()) {
            this.f15854o.dismiss();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: f */
    private void m13054f() {
        this.f15851l.setText(C3922z.m9905a((int) R.string.ek7, Integer.valueOf(this.f15842b.mo11110b())));
        int a = 8 - this.f15842b.mo11109a();
        if (a < 0) {
            a = 0;
        }
        this.f15852m.setText(C3922z.m9905a((int) R.string.ems, Integer.valueOf(a)));
        if (this.f15842b.getItemCount() > 0) {
            this.f15853n.setVisibility(8);
            this.f15846f.setVisibility(0);
            return;
        }
        this.f15853n.setVisibility(0);
        this.f15846f.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo11386a(Throwable th) {
        m13055g();
        C4602l.m11047a(getContext(), th, (int) R.string.ek4);
    }

    /* renamed from: a */
    static List<C5696e> m13053a(List<C5696e> list) {
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
        return list;
    }

    /* renamed from: b */
    public final void mo11388b(long j) {
        m13055g();
        C5258d dVar = this.f15842b;
        int size = dVar.f14069b.size();
        if (size > 0) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C5696e eVar = (C5696e) dVar.f14069b.get(i2);
                if (eVar != null && eVar.f14953d != null && eVar.f14953d.getId() == j) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0 && i < size) {
                dVar.f14069b.remove(i);
                dVar.notifyItemRemoved(i);
            }
        }
        m13054f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11964a(int i) {
        if (this.f15854o == null) {
            this.f15854o = new C8552a(getContext(), 2).mo15008c(i).mo14996a(false).mo15001b();
        }
        if (!this.f15854o.isShowing()) {
            this.f15854o.show();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15846f = (RecyclerView) findViewById(R.id.caf);
        this.f15846f.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f15846f.setAdapter(this.f15842b);
        this.f15855p = (ToggleButton) findViewById(R.id.d1t);
        this.f15855p.setOnCheckedChangeListener(new C5978bb(this));
        this.f15851l = (TextView) findViewById(R.id.title);
        this.f15852m = (TextView) findViewById(R.id.a4m);
        this.f15853n = findViewById(R.id.aa2);
        m13054f();
    }

    public final void onMessage(IMessage iMessage) {
        if (this.f15849j && ((C7829bd) iMessage).f21563a == 7 && !this.f15844d) {
            this.f15844d = true;
            this.f15850k.mo6181a(C4992b.m11476a((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class), this.f15843c.getId(), 4).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5981be<Object>(this), (C1710e<? super Throwable>) new C5982bf<Object>(this)));
        }
    }

    /* renamed from: a */
    public final void mo11384a(long j) {
        m13055g();
        C5258d dVar = this.f15842b;
        int size = dVar.f14069b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C5696e eVar = (C5696e) dVar.f14069b.get(i);
            if (eVar != null && eVar.f14953d != null && eVar.f14953d.getId() == j) {
                eVar.f14955f = 2;
                eVar.f14954e = System.currentTimeMillis() / 1000;
                break;
            }
            i++;
        }
        dVar.notifyItemChanged(i);
        m13054f();
    }

    /* renamed from: a */
    public final void mo11385a(long j, Throwable th) {
        m13055g();
        C4602l.m11047a(getContext(), th, (int) R.string.ek5);
    }

    /* renamed from: b */
    public final void mo11115b(long j, String str) {
        new C8552a(getContext()).mo15008c((int) R.string.eq0).mo14996a(false).mo15003b(0, (int) R.string.e59, (OnClickListener) new C5979bc(this, j, str)).mo15003b(1, (int) R.string.e45, C5980bd.f15860a).mo15011d();
    }

    /* renamed from: a */
    public final void mo11114a(long j, String str) {
        if (this.f15849j) {
            C4563ad.m10956a(this.f15843c, "click_agree_connection", "agree_connection", true);
            mo11964a((int) R.string.ek9);
            if (!this.f15841a.f14489g) {
                this.f15841a.mo11382o();
                this.f15847h = j;
                this.f15848i = str;
                return;
            }
            this.f15841a.mo11364a(j, this.f15848i);
        }
    }

    public C5977ba(Context context, boolean z, Room room, List<C5696e> list, C5470cy cyVar) {
        super(context);
        this.f15845e = z;
        this.f15843c = room;
        this.f15842b = new C5258d(this, m13053a(list), z);
        this.f15841a = cyVar;
        this.f15841a.f14499q = this;
    }
}
