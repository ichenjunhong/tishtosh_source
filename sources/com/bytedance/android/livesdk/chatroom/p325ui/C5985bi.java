package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5387a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5387a.C5388a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5538f;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5567g;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p330f.C6768c;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bi */
public final class C5985bi extends C6768c implements OnClickListener, C5388a {

    /* renamed from: a */
    public C5696e f15865a;

    /* renamed from: b */
    public C5387a f15866b;

    /* renamed from: c */
    private DataCenter f15867c;

    /* renamed from: d */
    private Room f15868d = ((Room) this.f15867c.get("data_room"));

    /* renamed from: e */
    private Context f15869e;

    /* renamed from: f */
    private C8548h f15870f;

    /* renamed from: j */
    private TextView f15871j;

    /* renamed from: k */
    private TextView f15872k;

    /* renamed from: l */
    private TextView f15873l;

    /* renamed from: m */
    private TextView f15874m;

    /* renamed from: n */
    private TextView f15875n;

    /* renamed from: o */
    private TextView f15876o;

    /* renamed from: a */
    public final void mo11295a() {
        m13068d();
        dismiss();
    }

    /* renamed from: b */
    public final void mo11297b() {
        m13068d();
        dismiss();
    }

    /* renamed from: c */
    public final void mo11299c() {
        m13068d();
        dismiss();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15866b.mo8520a(this);
    }

    public final void onDetachedFromWindow() {
        this.f15866b.mo8247a();
        super.onDetachedFromWindow();
    }

    /* renamed from: d */
    private void m13068d() {
        if (this.f15870f != null && this.f15870f.isShowing()) {
            this.f15870f.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo11296a(Throwable th) {
        m13068d();
        C4602l.m11047a(getContext(), th, (int) R.string.ek4);
    }

    /* renamed from: b */
    public final void mo11298b(Throwable th) {
        m13068d();
        C4602l.m11047a(getContext(), th, (int) R.string.ek6);
    }

    /* renamed from: c */
    public final void mo11300c(Throwable th) {
        m13068d();
        C4602l.m11047a(getContext(), th, (int) R.string.ek8);
    }

    /* renamed from: a */
    public final void mo11974a(int i) {
        if (this.f15870f == null) {
            this.f15870f = new C8552a(getContext(), 2).mo15008c(i).mo14996a(false).mo15001b();
        }
        if (!this.f15870f.isShowing()) {
            this.f15870f.show();
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.cog) {
            mo11974a((int) R.string.eq5);
            this.f15866b.mo11291a(this.f15865a.f14953d.getId());
        } else if (id == R.id.qi) {
            mo11974a((int) R.string.eq8);
            this.f15866b.mo11294b(this.f15865a.f14953d.getId());
        } else if (id == R.id.a63) {
            new C8552a(this.f15869e).mo15008c((int) R.string.eq0).mo14996a(false).mo15003b(0, (int) R.string.e59, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    C5985bi.this.mo11974a((int) R.string.ejz);
                    C5387a aVar = C5985bi.this.f15866b;
                    long id = C5985bi.this.f15865a.f14953d.getId();
                    String secUid = C5985bi.this.f15865a.f14953d.getSecUid();
                    if (!aVar.f14343b) {
                        aVar.f14343b = true;
                        aVar.f14342a.mo6181a(((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).kickOut(aVar.f14346e.getId(), id, secUid).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5538f<Object>(aVar), (C1710e<? super Throwable>) new C5567g<Object>(aVar)));
                    }
                }
            }).mo15003b(1, (int) R.string.e45, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo15011d();
        } else if (id == R.id.cl8) {
            dismiss();
            if (this.f15867c != null) {
                this.f15867c.lambda$put$1$DataCenter("cmd_send_gift", this.f15865a.f14953d);
            }
        } else if (id == R.id.co9) {
            dismiss();
            C4495a.m10823a().mo10301a((Object) new UserProfileEvent(this.f15865a.f14953d));
        } else {
            if (id == R.id.q7) {
                dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.aii, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        this.f15871j = (TextView) findViewById(R.id.cog);
        this.f15872k = (TextView) findViewById(R.id.qi);
        this.f15873l = (TextView) findViewById(R.id.a63);
        this.f15874m = (TextView) findViewById(R.id.cl8);
        this.f15875n = (TextView) findViewById(R.id.co9);
        this.f15876o = (TextView) findViewById(R.id.q7);
        this.f15871j.setOnClickListener(this);
        this.f15872k.setOnClickListener(this);
        this.f15873l.setOnClickListener(this);
        this.f15874m.setOnClickListener(this);
        this.f15875n.setOnClickListener(this);
        this.f15876o.setOnClickListener(this);
        if (this.f15865a.f14961l == 0) {
            this.f15871j.setVisibility(0);
            this.f15872k.setVisibility(8);
        } else if (this.f15865a.f14961l == 1) {
            this.f15871j.setVisibility(8);
            this.f15872k.setVisibility(8);
        } else {
            if (this.f15865a.f14961l == 2) {
                this.f15871j.setVisibility(8);
                this.f15872k.setVisibility(0);
            }
        }
    }

    public C5985bi(Context context, DataCenter dataCenter, C5696e eVar, C5387a aVar) {
        super(context, true);
        this.f15867c = dataCenter;
        this.f15869e = context;
        this.f15865a = eVar;
        this.f15866b = aVar;
    }
}
