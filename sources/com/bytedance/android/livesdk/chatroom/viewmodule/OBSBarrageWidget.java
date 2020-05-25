package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.p301a.C4963a;
import com.bytedance.android.livesdk.chatroom.p301a.p304c.C4984h;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6431a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.ugc.live.barrage.p2602a.C51596a;
import com.p683ss.ugc.live.barrage.p2602a.C51605c;
import com.p683ss.ugc.live.barrage.p2603b.C51607a;
import com.p683ss.ugc.live.barrage.p2603b.C51607a.C51609a;
import com.p683ss.ugc.live.barrage.p2603b.C51615d;
import com.p683ss.ugc.live.barrage.view.BarrageLayout;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class OBSBarrageWidget extends LiveWidget implements C0199s<KVData>, OnMessageListener {

    /* renamed from: a */
    private final List<C8001m> f17393a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private IMessageManager f17394b;

    /* renamed from: c */
    private C51607a f17395c;

    /* renamed from: d */
    private C51607a f17396d;

    /* renamed from: e */
    private BarrageLayout f17397e;

    /* renamed from: f */
    private BarrageLayout f17398f;

    /* renamed from: g */
    private C51609a f17399g = new C51609a() {
        /* renamed from: a */
        public final void mo12308a(C51596a aVar) {
            OBSBarrageWidget.this.mo12493a();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget$2 */
    static /* synthetic */ class C63532 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17401a = new int[C8629a.values().length];

        static {
            try {
                f17401a[C8629a.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget$a */
    class C6354a implements C6601a {

        /* renamed from: b */
        private Dialog f17403b;

        /* renamed from: c */
        private int f17404c;

        /* renamed from: d */
        private View f17405d;

        /* renamed from: e */
        private boolean f17406e = true;

        C6354a() {
        }

        public final void onClick(View view) {
            if (this.f17404c == 1) {
                this.f17406e = !this.f17406e;
                if (this.f17406e) {
                    this.f17405d.setBackgroundResource(R.drawable.e32);
                    C4575an.m10981a((int) R.string.hov);
                    OBSBarrageWidget.this.contentView.setVisibility(0);
                } else {
                    this.f17405d.setBackgroundResource(R.drawable.e31);
                    C4575an.m10981a((int) R.string.hou);
                    OBSBarrageWidget.this.contentView.setVisibility(4);
                }
                C4525b.f12401bQ.mo10346a(Boolean.valueOf(this.f17406e));
                return;
            }
            if (this.f17403b == null && this.f17404c != 1) {
                this.f17403b = new C4963a(OBSBarrageWidget.this.context, new C6549ec(this));
            }
            if (!this.f17403b.isShowing()) {
                this.f17403b.show();
            }
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
            if (!this.f17406e) {
                if (aVar instanceof C6431a) {
                    this.f17406e = ((C6431a) aVar).f17713a;
                }
                if (this.f17406e) {
                    this.f17405d.setBackgroundResource(R.drawable.e32);
                    C4575an.m10981a((int) R.string.hov);
                    OBSBarrageWidget.this.contentView.setVisibility(0);
                    return;
                }
                this.f17405d.setBackgroundResource(R.drawable.e31);
                C4575an.m10981a((int) R.string.hou);
                OBSBarrageWidget.this.contentView.setVisibility(4);
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            if (this.f17403b != null) {
                this.f17403b.dismiss();
            }
            this.f17403b = null;
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f17405d = view;
            Room room = (Room) dataCenter.get("data_room", null);
            this.f17406e = ((Boolean) C4525b.f12401bQ.mo10345a()).booleanValue();
            if (room != null && room.isOfficial()) {
                this.f17404c = 1;
                if (this.f17406e) {
                    view.setBackgroundResource(R.drawable.e32);
                    OBSBarrageWidget.this.contentView.setVisibility(0);
                    return;
                }
                view.setBackgroundResource(R.drawable.e31);
                OBSBarrageWidget.this.contentView.setVisibility(4);
            }
        }
    }

    public int getLayoutId() {
        return R.layout.anm;
    }

    public void onDestroy() {
        if (this.f17394b != null) {
            this.f17394b.removeMessageListener(this);
        }
        if (this.f17397e != null) {
            this.f17397e.mo105556a();
        }
        if (this.f17398f != null) {
            this.f17398f.mo105556a();
        }
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    /* renamed from: a */
    public final void mo12493a() {
        C51607a aVar;
        if (isViewValid() && ((this.f17397e != null || this.f17398f != null) && this.f17395c != null && this.f17396d != null && this.f17395c.mo10736b() + this.f17396d.mo10736b() < 40 && !this.f17393a.isEmpty())) {
            C51605c cVar = new C4984h(LayoutInflater.from(this.context).inflate(R.layout.anb, null), (((Float) C4525b.f12327W.mo10345a()).floatValue() * 12.0f) + 12.0f, (((Float) C4525b.f12326V.mo10345a()).floatValue() * 0.68f) + 0.32f, (C8001m) this.f17393a.remove(0)).f13366a;
            switch (((Integer) C4525b.f12328X.mo10345a()).intValue()) {
                case 0:
                    aVar = this.f17395c;
                    break;
                case 1:
                    aVar = this.f17396d;
                    break;
                case 2:
                    if (new Random().nextInt(2) != 0) {
                        aVar = this.f17396d;
                        break;
                    } else {
                        aVar = this.f17395c;
                        break;
                    }
                default:
                    return;
            }
            aVar.mo105547a((C51596a) cVar, false);
        }
    }

    public void onCreate() {
        int i;
        int i2;
        int i3;
        super.onCreate();
        ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17394b = (IMessageManager) this.dataCenter.get("data_message_manager");
        if (this.f17394b != null) {
            this.f17394b.addMessageListener(C8629a.CHAT.getIntType(), this);
        }
        if (!((Room) this.dataCenter.get("data_room", null)).isOfficial()) {
            i2 = ((C3922z.m9908b() / 2) - C3922z.m9913d(R.dimen.qx)) / C3922z.m9913d(R.dimen.qv);
            i = ((C3922z.m9908b() / 2) - C3922z.m9913d(R.dimen.qw)) / C3922z.m9913d(R.dimen.qv);
        } else {
            i2 = (int) ((((((float) C3922z.m9908b()) * 0.6f) / 2.0f) - ((float) C3922z.m9913d(R.dimen.qx))) / ((float) C3922z.m9913d(R.dimen.qv)));
            i = (int) ((((((float) C3922z.m9908b()) * 0.6f) / 2.0f) - ((float) C3922z.m9913d(R.dimen.qw))) / ((float) C3922z.m9913d(R.dimen.qv)));
        }
        this.f17397e = (BarrageLayout) this.contentView.findViewById(R.id.d2q);
        this.f17395c = new C51615d(this.f17397e, C3922z.m9913d(R.dimen.qv), i2, 7000);
        this.f17395c.mo105548a(this.f17399g);
        this.f17397e.mo105557a(this.f17395c);
        this.f17398f = (BarrageLayout) this.contentView.findViewById(R.id.lr);
        this.f17396d = new C51615d(this.f17398f, C3922z.m9913d(R.dimen.qv), i, 7000);
        this.f17396d.mo105548a(this.f17399g);
        this.f17398f.mo105557a(this.f17396d);
        View view = this.contentView;
        if (((Boolean) C4525b.f12329Y.mo10345a()).booleanValue()) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        view.setVisibility(i3);
        C6610k.m13985a().mo12668a(C6605h.BARRAGE, (C6601a) new C6354a());
        if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo9431a()).intValue() != 1) {
            this.contentView.setVisibility(4);
        }
        this.dataCenter.observe("cmd_barrage_visibility", this);
        if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.mo9431a()).intValue() != 1) {
            this.contentView.setVisibility(4);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null) {
            C9432q.m18691b(this.contentView, ((Integer) kVData.getData()).intValue());
        }
    }

    public void onMessage(IMessage iMessage) {
        if (isViewValid()) {
            C7859c cVar = (C7859c) iMessage;
            if (C63532.f17401a[cVar.getMessageType().ordinal()] == 1) {
                C8001m mVar = (C8001m) cVar;
                if (this.f17393a.size() >= 200) {
                    this.f17393a.remove(0);
                }
                this.f17393a.add(mVar);
                mo12493a();
            }
        }
    }
}
