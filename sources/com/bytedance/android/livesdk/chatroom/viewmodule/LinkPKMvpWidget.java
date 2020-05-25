package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0199s;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5554fp;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5554fp.C5555a;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5703l;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d;
import com.bytedance.android.livesdk.chatroom.p307c.C5044e;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.C8716q.C8717a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.KVData;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;

public class LinkPKMvpWidget extends SubWidget implements C0199s<KVData>, C5555a {

    /* renamed from: d */
    public ViewGroup f17182d;

    /* renamed from: e */
    HSImageView f17183e;

    /* renamed from: f */
    TextView f17184f;

    /* renamed from: g */
    List<C6308a> f17185g;

    /* renamed from: h */
    List<C6308a> f17186h;

    /* renamed from: i */
    ObjectAnimator f17187i;

    /* renamed from: j */
    public ObjectAnimator f17188j;

    /* renamed from: k */
    private C1690c f17189k;

    /* renamed from: l */
    private C5038d<LinearLayout> f17190l;

    /* renamed from: m */
    private C5038d<LinearLayout> f17191m;

    /* renamed from: n */
    private C5554fp f17192n;

    /* renamed from: o */
    private C5044e f17193o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkPKMvpWidget$a */
    static class C6308a {

        /* renamed from: a */
        public View f17196a;

        /* renamed from: b */
        public VHeadView f17197b;

        /* renamed from: c */
        View f17198c;

        /* renamed from: d */
        TextView f17199d;

        /* renamed from: e */
        View f17200e;

        private C6308a(View view) {
            this.f17196a = view.findViewById(R.id.b3t);
            this.f17197b = (VHeadView) view.findViewById(R.id.ay2);
            this.f17198c = view.findViewById(R.id.azr);
            this.f17199d = (TextView) view.findViewById(R.id.de_);
            this.f17200e = view.findViewById(R.id.b2r);
        }
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public void onDestroy() {
        if (this.f17188j != null) {
            this.f17188j.cancel();
        }
        if (this.f17187i != null) {
            this.f17187i.cancel();
        }
        this.f17192n.mo8247a();
        this.f17152a.removeObserver(this);
        this.f17193o.mo10906a();
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo11453a() {
        ((LinearLayout) this.f17190l.f13491b).removeAllViews();
        this.f17185g.clear();
        C6308a aVar = new C6308a(LayoutInflater.from(this.context).inflate(R.layout.aqy, (ViewGroup) this.f17190l.f13491b, true));
        aVar.f17196a.setBackgroundResource(R.drawable.bxh);
        aVar.f17197b.setImageResource(R.drawable.bxg);
        this.f17185g.add(aVar);
        ((LinearLayout) this.f17191m.f13491b).removeAllViews();
        this.f17186h.clear();
        C6308a aVar2 = new C6308a(LayoutInflater.from(this.context).inflate(R.layout.aqy, (ViewGroup) this.f17191m.f13491b, true));
        aVar2.f17196a.setBackgroundResource(R.drawable.bxl);
        aVar2.f17197b.setImageResource(R.drawable.bxk);
        this.f17186h.add(aVar2);
    }

    public void onCreate() {
        super.onCreate();
        this.f17182d = (ViewGroup) findViewById(R.id.emj);
        this.f17183e = (HSImageView) this.f17182d.findViewById(R.id.art);
        this.f17184f = (TextView) this.f17182d.findViewById(R.id.d8j);
        this.f17193o = new C5044e(this.f17152a, this.contentView);
        this.f17190l = this.f17193o.mo10905a(R.id.ba5).mo10900a(new C6499cg(this)).mo10901a("data_pk_mvp_list_anchor", new C6500ch(this)).mo10901a("data_pk_state", new C6501ci(this)).mo10902a();
        this.f17191m = this.f17193o.mo10905a(R.id.cco).mo10900a(new C6502cj(this)).mo10901a("data_pk_mvp_list_guest", new C6503ck(this)).mo10901a("data_pk_state", new C6504cl(this)).mo10902a();
        mo11453a();
        this.f17152a.observe("cmd_pk_mvp_show_list", this).observe("cmd_pk_show_interface", this);
        this.f17192n = new C5554fp(this.dataCenter);
        this.f17192n.mo8520a((C5555a) this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 1608385910) {
                if (hashCode == 1619041129 && key.equals("cmd_pk_mvp_show_list")) {
                    c = 0;
                }
            } else if (key.equals("cmd_pk_show_interface")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo12431a(true);
                    return;
                case 1:
                    ((LinearLayout) this.f17190l.f13491b).setVisibility(0);
                    ((LinearLayout) this.f17191m.f13491b).setVisibility(0);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12431a(boolean z) {
        long j;
        long j2;
        if (z) {
            j = this.f17153b.getOwner().getId();
        } else {
            j = this.f17152a.f12614e;
        }
        List list = null;
        C4631c cVar = (C4631c) this.f17152a.get("data_pk_result");
        if (z && cVar == C4631c.LEFT_WON) {
            list = (List) this.f17152a.get("data_pk_mvp_list_anchor");
        } else if (!z && cVar == C4631c.RIGHT_WON) {
            list = (List) this.f17152a.get("data_pk_mvp_list_guest");
        }
        if (!C3914u.m9892a(list)) {
            j2 = ((C8717a) list.get(0)).f23922a;
        } else {
            j2 = -1;
        }
        Builder appendQueryParameter = Uri.parse("https://hotsoon.snssdk.com/hotsoon/in_app/common_live/mvp_rank/").buildUpon().appendQueryParameter("channel_id", String.valueOf(this.f17152a.f12612c)).appendQueryParameter("anchor_id", String.valueOf(j)).appendQueryParameter("room_id", String.valueOf(this.f17153b.getId()));
        if (j2 != -1) {
            appendQueryParameter.appendQueryParameter("mvp_id", String.valueOf(j2));
        }
        int e = (int) C3922z.m9914e(C3922z.m9910c());
        C4104a.m10232a((FragmentActivity) this.context, C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(appendQueryParameter.build().toString()).mo10510a(e).mo10514b((e / 16) * 15).mo10511a(8, 8, 0, 0).mo10520e(80)));
    }

    /* renamed from: a */
    public final void mo11454a(User user, User user2, C5703l lVar) {
        if (this.f17189k != null) {
            this.f17189k.dispose();
        }
        this.f17189k = ((C4002ac) C2201v.m6614b(user2).mo6541d((C1711f<? super T, ? extends R>) new C6505cm<Object,Object>(this, user, lVar)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6506cn<Object>(this, user));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12430a(List<C8717a> list, List<C6308a> list2, LinearLayout linearLayout, boolean z) {
        if (!C9414h.m18630a(list)) {
            while (linearLayout.getChildCount() < list.size()) {
                View inflate = LayoutInflater.from(this.context).inflate(R.layout.aqy, linearLayout, false);
                if (z) {
                    linearLayout.addView(inflate, 0);
                } else {
                    linearLayout.addView(inflate);
                }
                list2.add(new C6308a(inflate));
            }
            C4631c cVar = (C4631c) this.f17152a.get("data_pk_result");
            int i = 0;
            while (i < list.size()) {
                C8717a aVar = (C8717a) list.get(i);
                C6308a aVar2 = (C6308a) list2.get(i);
                int i2 = i + 1;
                aVar2.f17199d.setText(String.valueOf(i2));
                aVar2.f17199d.setVisibility(0);
                C5213c.m11815a((ImageView) aVar2.f17197b, aVar.f23925d, (int) R.drawable.bxg);
                if (z && cVar != C4631c.RIGHT_WON) {
                    aVar2.f17196a.setBackgroundResource(R.drawable.bxh);
                    aVar2.f17199d.setBackgroundResource(R.drawable.blx);
                    if (i == 0) {
                        aVar2.f17198c.setVisibility(0);
                        aVar2.f17198c.setBackgroundResource(R.drawable.bxf);
                    }
                } else if (z || cVar == C4631c.LEFT_WON) {
                    aVar2.f17196a.setBackgroundResource(R.drawable.bxi);
                    aVar2.f17199d.setBackgroundResource(R.drawable.bly);
                    aVar2.f17198c.setVisibility(8);
                } else {
                    aVar2.f17196a.setBackgroundResource(R.drawable.bxl);
                    aVar2.f17199d.setBackgroundResource(R.drawable.blz);
                    if (i == 0) {
                        aVar2.f17198c.setVisibility(0);
                        aVar2.f17198c.setBackgroundResource(R.drawable.bxj);
                    }
                }
                if (i != 0 || ((!z || cVar != C4631c.LEFT_WON) && (z || cVar != C4631c.RIGHT_WON))) {
                    aVar2.f17200e.setVisibility(8);
                } else {
                    aVar2.f17200e.setVisibility(0);
                }
                i = i2;
            }
        }
    }
}
