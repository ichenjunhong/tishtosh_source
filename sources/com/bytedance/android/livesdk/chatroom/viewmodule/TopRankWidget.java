package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.chatroom.event.C5198q;
import com.bytedance.android.livesdk.chatroom.model.C5763r;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8012v;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.rank.C8123a;
import com.bytedance.android.livesdk.rank.C8213m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class TopRankWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: a */
    public View f17589a;

    /* renamed from: b */
    public TextView f17590b;

    /* renamed from: c */
    public View f17591c;

    /* renamed from: d */
    public View f17592d;

    /* renamed from: e */
    public View f17593e;

    /* renamed from: f */
    public View f17594f;

    /* renamed from: g */
    public Animator f17595g;

    /* renamed from: h */
    public Animator f17596h;

    /* renamed from: i */
    private TextView f17597i;

    /* renamed from: j */
    private TextView f17598j;

    /* renamed from: k */
    private ImageView f17599k;

    /* renamed from: l */
    private ImageView f17600l;

    /* renamed from: m */
    private TextView f17601m;

    /* renamed from: n */
    private Animator f17602n;

    /* renamed from: o */
    private AnimatorSet f17603o;

    /* renamed from: p */
    private AnimatorSet f17604p;

    /* renamed from: q */
    private AnimatorSet f17605q;

    /* renamed from: r */
    private Animator f17606r;

    /* renamed from: s */
    private IMessageManager f17607s;

    /* renamed from: t */
    private Room f17608t;

    /* renamed from: u */
    private int f17609u;

    /* renamed from: v */
    private boolean f17610v;

    /* renamed from: w */
    private boolean f17611w;

    /* renamed from: x */
    private C1689b f17612x;

    public int getLayoutId() {
        return R.layout.apa;
    }

    public void onUnload() {
        if (this.f17607s != null) {
            this.f17607s.removeMessageListener(this);
        }
        if (this.f17602n != null && this.f17602n.isRunning()) {
            this.f17602n.cancel();
        }
        if (this.f17595g != null && this.f17595g.isRunning()) {
            this.f17595g.cancel();
        }
        if (this.f17603o != null && this.f17603o.isRunning()) {
            this.f17603o.cancel();
        }
        if (this.f17604p != null && this.f17604p.isRunning()) {
            this.f17604p.cancel();
        }
        if (this.f17605q != null && this.f17605q.isRunning()) {
            this.f17605q.cancel();
        }
        if (this.f17606r != null && this.f17606r.isRunning()) {
            this.f17606r.cancel();
        }
        if (this.f17596h != null && this.f17596h.isRunning()) {
            this.f17596h.cancel();
        }
        if (this.f17612x != null) {
            this.f17612x.dispose();
        }
    }

    public void onMessage(IMessage iMessage) {
        if (iMessage.getIntType() == C8629a.DAILY_RANK.getIntType()) {
            C8012v vVar = (C8012v) iMessage;
            if (2 == vVar.f21928f || 3 == vVar.f21928f || 4 == vVar.f21928f) {
                C5007d.INSTANCE.add(vVar);
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f17608t = (Room) this.dataCenter.get("data_room");
        this.f17610v = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17611w = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f17607s = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f17607s != null) {
            this.f17607s.addMessageListener(C8629a.DAILY_RANK.getIntType(), this);
        }
        this.f17612x = new C1689b();
        this.f17612x.mo6181a(C4495a.m10823a().mo10300a(C5198q.class).mo6545f((C1710e<? super T>) new C1710e<C5198q>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C5198q qVar = (C5198q) obj;
                if (qVar != null && qVar.f13912a != null) {
                    C5197p pVar = qVar.f13912a;
                    if (pVar.f13910c == null) {
                        pVar.f13910c = new Bundle();
                    }
                    pVar.f13910c.putInt("back_source", 1);
                    C8123a.m16197b(TopRankWidget.this.dataCenter, pVar.f13910c);
                    C4495a.m10823a().mo10301a((Object) new C5197p(pVar.f13908a, "live_detail", pVar.f13910c));
                }
            }
        }));
    }

    public void onInit(Object... objArr) {
        View view = this.contentView;
        this.f17589a = view.findViewById(R.id.bdy);
        this.f17590b = (TextView) view.findViewById(R.id.bdz);
        this.f17591c = view.findViewById(R.id.bdt);
        this.f17592d = view.findViewById(R.id.bdw);
        this.f17597i = (TextView) view.findViewById(R.id.bdx);
        this.f17598j = (TextView) view.findViewById(R.id.bdv);
        this.f17599k = (ImageView) view.findViewById(R.id.bds);
        this.f17593e = view.findViewById(R.id.bdu);
        boolean z = true;
        if (!C8213m.m16290b(this.f17610v)) {
            C5763r rVar = (C5763r) LiveSettingKeys.LIVE_RANK_CONFIG.mo9431a();
            if (rVar == null || !rVar.f15152b) {
                z = false;
            }
        }
        if (z) {
            this.f17594f = view.findViewById(R.id.bil);
            this.f17601m = (TextView) this.f17594f.findViewById(R.id.bim);
            this.f17600l = (ImageView) this.f17594f.findViewById(R.id.bih);
        } else {
            this.f17594f = view.findViewById(R.id.bik);
            this.f17601m = (TextView) this.f17594f.findViewById(R.id.bim);
            this.f17600l = (ImageView) this.f17594f.findViewById(R.id.bih);
        }
        this.f17609u = view.getWidth();
        if (!this.f17611w) {
            LayoutParams layoutParams = this.f17589a.getLayoutParams();
            layoutParams.width = C3922z.m9899a(400.0f);
            this.f17589a.setLayoutParams(layoutParams);
        }
    }
}
