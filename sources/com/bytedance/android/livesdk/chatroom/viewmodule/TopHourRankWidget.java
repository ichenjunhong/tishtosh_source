package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.chatroom.event.C5180az;
import com.bytedance.android.livesdk.chatroom.model.C5754k;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j;
import com.bytedance.android.livesdk.chatroom.presenter.C5876j.C5877a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8012v;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.rank.C8127b;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class TopHourRankWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener, C5877a {

    /* renamed from: a */
    private TextView f17582a;

    /* renamed from: b */
    private C5876j f17583b;

    /* renamed from: c */
    private C8127b f17584c;

    /* renamed from: d */
    private Room f17585d;

    /* renamed from: e */
    private boolean f17586e;

    /* renamed from: f */
    private boolean f17587f;

    /* renamed from: g */
    private boolean f17588g;

    /* renamed from: a */
    public final void mo11759a(C5754k kVar) {
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.bxe;
    }

    public void onUnload() {
        this.f17583b.mo8247a();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.f17584c != null) {
            try {
                this.f17584c.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.f17584c = null;
        }
        this.f17588g = false;
    }

    public void onEvent(C5180az azVar) {
        if (isViewValid() && this.f17584c != null) {
            this.f17584c.dismiss();
        }
    }

    public void onInit(Object[] objArr) {
        this.contentView.setOnClickListener(this);
        this.f17582a = (TextView) this.containerView.findViewById(R.id.eb5);
    }

    /* renamed from: a */
    public final void mo11761a(C8214a aVar) {
        if (this.isViewValid && aVar != null) {
            if (aVar.f22423k) {
                C9432q.m18691b((View) this.containerView, 4);
                return;
            }
            if (aVar.f22414b != null) {
                C9432q.m18682a(this.f17582a, (CharSequence) aVar.f22414b.f22447f.replace("\n", ""));
            }
        }
    }

    public void onClick(View view) {
        if (isViewValid()) {
            this.f17583b.mo11758b();
            if (this.f17584c != null) {
                this.f17584c.dismiss();
            } else {
                this.f17584c = C8127b.m16198a(this.f17585d, this.f17586e, this.f17587f, this.dataCenter, 0);
            }
            this.f17584c.f22201h = 0;
            this.f17584c.show(((FragmentActivity) this.context).getSupportFragmentManager(), C8127b.f22192a);
        }
    }

    /* renamed from: a */
    public final void mo11760a(C8012v vVar) {
        if (isViewValid() && vVar != null && vVar.baseMessage != null && !this.f17588g) {
            if (vVar.f21931i != 0) {
                C9432q.m18682a(this.f17582a, (CharSequence) getContext().getResources().getString(R.string.hso, new Object[]{C3890e.m9836d((long) vVar.f21931i)}));
                return;
            }
            C9432q.m18682a(this.f17582a, (CharSequence) vVar.f21932j.replace("\n", ""));
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c = 1;
            }
            switch (c) {
                case 0:
                case 1:
                    if (isViewValid() && this.f17584c != null) {
                        this.f17584c.dismiss();
                        break;
                    }
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f17585d = (Room) this.dataCenter.get("data_room");
        if (this.f17585d != null && this.f17585d.getOwner() != null) {
            this.f17586e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
            this.f17587f = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
            boolean z = true;
            this.f17588g = true;
            this.f17583b = new C5876j();
            this.f17583b.f15384a = this.f17585d.getOwner().getId();
            this.f17583b.f15385b = this.f17585d.getId();
            this.f17583b.mo8520a((C5877a) this);
            this.dataCenter.observe("cmd_send_gift", this);
            this.dataCenter.observe("cmd_dismiss_dialog_end", this);
            C4495a.m10823a().mo10300a(C5180az.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C6572ew<Object>(this));
            if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo9431a()).intValue() == 0) {
                z = false;
            }
            if (z) {
                this.f17583b.mo11758b();
            }
        }
    }
}
