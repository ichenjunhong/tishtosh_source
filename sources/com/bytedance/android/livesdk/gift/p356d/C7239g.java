package com.bytedance.android.livesdk.gift.p356d;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.android.livesdk.widget.CountDownTextView.C8455a;
import com.bytedance.android.livesdk.widget.SendGiftAnimationView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.d.g */
public final class C7239g extends C7230b<C7497h> implements OnClickListener {

    /* renamed from: n */
    private final CountDownTextView f19646n;

    /* renamed from: o */
    private final TextView f19647o;

    /* renamed from: p */
    private View f19648p;

    /* renamed from: q */
    private C7490a f19649q;

    /* renamed from: r */
    private SendGiftAnimationView f19650r;

    /* renamed from: a */
    public final void mo13465a(boolean z) {
    }

    public C7239g(View view) {
        super(view);
        this.f19647o = (TextView) view.findViewById(R.id.d_w);
        this.f19646n = (CountDownTextView) view.findViewById(R.id.dh9);
        this.f19646n.setCountDownListener(new C8455a() {
            /* renamed from: a */
            public final void mo13470a(TextView textView) {
                long j;
                Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                C7649u a = C7649u.m15656a();
                if (currentRoom != null) {
                    j = currentRoom.getId();
                } else {
                    j = 0;
                }
                a.mo14013b(j);
            }
        });
    }

    public final void onClick(View view) {
        Prop prop;
        if (view.getId() == R.id.fk && (view instanceof SendGiftAnimationView)) {
            if (this.f19649q == null || !(this.f19649q.f20516d instanceof Prop)) {
                prop = null;
            } else {
                prop = (Prop) this.f19649q.f20516d;
            }
            if (prop != null && prop.count > 0) {
                ((SendGiftAnimationView) view).mo14854a(0.7f);
                if (this.f19637l != null) {
                    this.f19637l.mo13467a(this, this.f19649q);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo13464a(C7497h hVar) {
        boolean z;
        String str;
        C7497h hVar2 = hVar;
        super.mo13464a(hVar);
        this.f19649q = hVar2;
        this.f19648p = this.f19633h.findViewById(R.id.zn);
        this.f19650r = (SendGiftAnimationView) this.f19633h.findViewById(R.id.fk);
        if (((Prop) hVar2.f20516d).count <= 0) {
            this.f19647o.setVisibility(8);
        } else {
            this.f19647o.setVisibility(0);
            this.f19647o.setText(C3922z.m9905a((int) R.string.ei8, Integer.valueOf(((Prop) hVar2.f20516d).count)));
        }
        if (((Prop) hVar2.f20516d).nextExpire > 0) {
            long currentTimeMillis = ((Prop) hVar2.f20516d).nextExpire - ((System.currentTimeMillis() / 1000) + ((Prop) hVar2.f20516d).getNowTimeDiff());
            if (currentTimeMillis <= 0) {
                str = this.f19630e.getResources().getString(R.string.ei9, new Object[]{"00:00"});
                z = true;
            } else {
                if (currentTimeMillis < 3600) {
                    str = this.f19630e.getResources().getString(R.string.ei9, new Object[]{C4574am.m10978a(currentTimeMillis)});
                    this.f19646n.mo14703a(R.string.ei9, currentTimeMillis, 0);
                } else if (currentTimeMillis < 86400) {
                    int i = (int) (currentTimeMillis / 3600);
                    str = this.f19630e.getResources().getQuantityString(R.plurals.y, i, new Object[]{Integer.valueOf(i)});
                } else {
                    int i2 = (int) (currentTimeMillis / 86400);
                    str = this.f19630e.getResources().getQuantityString(R.plurals.x, i2, new Object[]{Integer.valueOf(i2)});
                }
                z = false;
            }
            this.f19646n.setText(str);
            this.f19646n.setVisibility(0);
        } else {
            this.f19646n.setVisibility(4);
            z = false;
        }
        this.f19634i.setVisibility(4);
        this.f19635j.setVisibility(4);
        if (((Prop) hVar2.f20516d).propType != 4 || ((Prop) hVar2.f20516d).count > 0) {
            this.f19634i.setTextColor(C3922z.m9909b((int) R.color.ags));
        } else {
            this.f19634i.setText(R.string.hsp);
            this.f19634i.setTextColor(C3922z.m9909b((int) R.color.b4i));
            this.f19635j.setVisibility(8);
        }
        if (hVar2.f20515c || ((Prop) hVar2.f20516d).count <= 0 || z) {
            this.f19648p.setAlpha(0.32f);
        } else {
            this.f19648p.setAlpha(1.0f);
        }
        if (((Prop) hVar2.f20516d).propType == 4) {
            HashMap hashMap = new HashMap();
            hashMap.put("cards_left", String.valueOf(((Prop) hVar2.f20516d).count));
            C8049c.m15979a().mo14202a("popular_card_show", hashMap, Room.class);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo13466a(C7491b bVar, List list) {
        C7497h hVar = (C7497h) bVar;
        for (String str : ((Bundle) list.get(0)).keySet()) {
            char c = 65535;
            if (str.hashCode() == 586503955 && str.equals("key_prop_count")) {
                c = 0;
            }
            if (c == 0) {
                this.f19647o.setText(C3922z.m9905a((int) R.string.ei8, Integer.valueOf(((Prop) hVar.f20516d).count)));
                if (((Prop) hVar.f20516d).count <= 0) {
                    hVar.f20514b = false;
                    this.f19648p.setAlpha(0.32f);
                } else {
                    hVar.f20514b = true;
                    this.f19648p.setAlpha(1.0f);
                }
                mo13465a(hVar.f20514b);
            }
        }
    }
}
