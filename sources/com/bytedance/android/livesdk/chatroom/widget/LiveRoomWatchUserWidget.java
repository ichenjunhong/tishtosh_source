package com.bytedance.android.livesdk.chatroom.widget;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p325ui.C5919a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6224v;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.presenter.C5866ck;
import com.bytedance.android.livesdk.chatroom.view.C6237c;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4622w;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.C8221n;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.p410c.C8142b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

public class LiveRoomWatchUserWidget extends LiveRecyclableWidget implements C0199s<KVData>, C6237c, C9382a {

    /* renamed from: a */
    static final int f18104a = C3922z.m9899a(34.0f);

    /* renamed from: g */
    private static final String f18105g = "com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget";

    /* renamed from: b */
    Room f18106b;

    /* renamed from: c */
    RecyclerView f18107c;

    /* renamed from: d */
    public C9381g f18108d;

    /* renamed from: e */
    boolean f18109e = true;

    /* renamed from: f */
    public C6637a f18110f;

    /* renamed from: h */
    private final C1689b f18111h = new C1689b();

    /* renamed from: i */
    private boolean f18112i;

    /* renamed from: j */
    private String f18113j;

    /* renamed from: k */
    private TextView f18114k;

    /* renamed from: l */
    private C5919a f18115l;

    /* renamed from: m */
    private C5866ck f18116m;

    /* renamed from: n */
    private FragmentActivity f18117n;

    /* renamed from: o */
    private C8221n f18118o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget$a */
    public interface C6637a {
        /* renamed from: a */
        void mo12730a(int i);

        /* renamed from: a */
        boolean mo12731a();
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
        return R.layout.ao6;
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
        if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) == null) {
        }
    }

    public void onUnload() {
        this.f18111h.mo6180a();
        if (this.f18118o != null) {
            this.f18118o.dismiss();
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.f18116m.mo8247a();
        this.f18115l.mo11850a();
        this.f18118o = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12744a() {
        if (((Integer) LiveSettingKeys.LIVE_USER_RANK.mo9431a()).intValue() == 0) {
            C4575an.m10983a((Context) this.f18117n, (int) R.string.ecr);
            return;
        }
        if (this.f18118o != null && this.f18118o.mo12851g()) {
            this.f18118o.dismiss();
        }
        this.f18118o = null;
        this.f18118o = C8221n.m16298a(this.f18117n, this.f18106b, this.f18112i, this.f18109e, this.f18113j, this.dataCenter);
        this.f18118o.show(this.f18117n.getSupportFragmentManager(), "dialog2");
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "top_tab");
        C8049c.m15979a().mo14203a("audience_list_click", new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_detail").mo14215c("top_tab"));
    }

    /* renamed from: b */
    private void m14028b(int i) {
        this.f18114k.setText(C4622w.m11084a((long) i));
    }

    /* renamed from: a */
    public final void mo12745a(long j) {
        if (this.f18115l != null) {
            this.f18115l.mo11851a(j);
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 0 && this.f18107c != null) {
            this.f18107c.mo4814b(0);
        }
    }

    /* renamed from: a */
    public final void mo12295a(int i) {
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(i));
            m14028b(i);
            if (i == 0 && this.f18115l != null) {
                this.f18115l.mo11850a();
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
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
                    if (isViewValid() && this.f18118o != null) {
                        this.f18118o.dismiss();
                        break;
                    }
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f18114k = (TextView) this.contentView.findViewById(R.id.bun);
        this.f18107c = (RecyclerView) this.contentView.findViewById(R.id.dtz);
        this.f18116m = new C5866ck();
        this.f18115l = new C6224v(this.context, this.dataCenter);
        this.f18115l.setHasStableIds(true);
        this.f18107c.setLayoutManager(new SSLinearLayoutManager(this.context, 0, false));
        this.f18107c.setItemAnimator(null);
        this.f18107c.setAdapter(this.f18115l);
        C9432q.m18683a(true, (View) this.f18114k, (OnClickListener) new C6655am(this));
        this.f18107c.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    LiveRoomWatchUserWidget.this.f18108d.sendMessageDelayed(LiveRoomWatchUserWidget.this.f18108d.obtainMessage(0), 5000);
                    return;
                }
                LiveRoomWatchUserWidget.this.f18108d.removeMessages(0);
            }
        });
        DataCenter dataCenter = this.dataCenter;
    }

    public void onLoad(Object... objArr) {
        this.f18116m.mo8520a((C6237c) this);
        this.f18106b = (Room) this.dataCenter.get("data_room");
        this.f18112i = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f18109e = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f18113j = (String) this.dataCenter.get("log_enter_live_source");
        this.f18115l.mo11854a(this.f18112i);
        this.f18115l.mo11852a(this.dataCenter);
        this.f18117n = (FragmentActivity) this.context;
        if (!this.f18112i) {
            try {
                String[] strArr = {"money", "fans", "nothing", "room_money"};
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(this.f18106b.getOwnerUserId());
                hashMap.put("anchor_id", sb.toString());
                hashMap.put("room_id", this.f18106b.getIdStr());
                hashMap.put("rank_type", strArr[((Integer) LiveSettingKeys.LIVE_ANCHOR_INFO_ABTEST.mo9431a()).intValue()]);
                TTLiveSDKContext.getHostService().mo10311d().mo15567a("livesdk_live_room_info", hashMap);
            } catch (Exception e) {
                C9415i.m18634a((Throwable) e);
            }
        }
        if (isViewValid()) {
            this.dataCenter.lambda$put$1$DataCenter("data_member_count", Integer.valueOf(this.f18106b.getUserCount()));
            m14028b(this.f18106b.getUserCount());
            if (this.f18106b == null || this.f18106b.getRoomAuthStatus() == null || !this.f18106b.getRoomAuthStatus().isEnableRoomContributor()) {
                C9432q.m18691b((View) this.f18114k, 8);
                C9432q.m18691b((View) this.f18107c, 8);
            } else {
                C9432q.m18691b((View) this.f18114k, 0);
                C9432q.m18691b((View) this.f18107c, 0);
            }
        }
        this.f18108d = new C9381g(this.context.getMainLooper(), this);
        this.dataCenter.observeForever("data_anchor_ticket_count", this).observeForever("data_current_room_ticket_count", this).observeForever("data_login_event", this).observe("cmd_send_gift", this).observeForever("data_keyboard_status", this).observe("data_user_in_room", this).observe("cmd_dismiss_dialog_end", this).observe("data_xt_followed_change", this).observe("cmd_wanna_follow_anchor", this);
        if (!(this.f18106b == null || this.f18106b.getOwner() == null)) {
            this.f18116m.mo11749a(this.f18106b.getId(), this.f18106b.getOwner().getId(), 18);
        }
        ((C4002ac) C4495a.m10823a().mo10300a(C8142b.class).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6656an<Object>(this));
    }

    /* renamed from: a */
    public final void mo12296a(List<C8219f> list, List<C8219f> list2) {
        if (isViewValid() && list2 != null) {
            if (this.f18110f == null || !this.f18110f.mo12731a()) {
                if (!C9376b.m18558a((Collection<T>) list)) {
                    for (int i = 0; i < list.size(); i++) {
                        ((C8219f) list.get(i)).f22451j = true;
                        list2.add(i, list.get(i));
                    }
                }
                this.f18115l.mo11853a(list2);
                this.f18107c.post(new C6657ao(this, list2));
                if (this.f18110f != null) {
                    this.f18110f.mo12730a(list2.size());
                }
            }
        }
    }
}
