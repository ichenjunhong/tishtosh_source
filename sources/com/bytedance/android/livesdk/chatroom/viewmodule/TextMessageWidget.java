package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.os.Looper;
import android.os.Message;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1338k;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5159ae;
import com.bytedance.android.livesdk.chatroom.event.C5185e;
import com.bytedance.android.livesdk.chatroom.event.C5188h;
import com.bytedance.android.livesdk.chatroom.event.C5203v;
import com.bytedance.android.livesdk.chatroom.interact.C5277ak;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.chatroom.p325ui.C6141ej;
import com.bytedance.android.livesdk.chatroom.p325ui.C6195fd;
import com.bytedance.android.livesdk.chatroom.p325ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.presenter.C5854cd;
import com.bytedance.android.livesdk.chatroom.presenter.C5854cd.C5858a;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C7808am;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class TextMessageWidget extends LiveRecyclableWidget implements C0199s<KVData>, C5858a, C9382a {

    /* renamed from: g */
    private static final String f17561g = "TextMessageWidget";

    /* renamed from: a */
    public LiveMessageRecyclerView f17562a;

    /* renamed from: b */
    public SmoothLinearLayoutManager f17563b;

    /* renamed from: c */
    public C5854cd f17564c;

    /* renamed from: d */
    public int f17565d;

    /* renamed from: e */
    public int f17566e;

    /* renamed from: f */
    public boolean f17567f;

    /* renamed from: h */
    private int f17568h = 100;

    /* renamed from: i */
    private View f17569i;

    /* renamed from: j */
    private TextView f17570j;

    /* renamed from: k */
    private C6141ej f17571k;

    /* renamed from: l */
    private C6406a f17572l = C6406a.NORMAL;

    /* renamed from: m */
    private Room f17573m;

    /* renamed from: n */
    private boolean f17574n;

    /* renamed from: o */
    private final C9381g f17575o = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget$a */
    enum C6406a {
        NORMAL,
        FOCUS
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
        return R.layout.aon;
    }

    public void onClear() {
        super.onClear();
        this.f17562a.setAdapter(null);
        this.f17575o.removeCallbacksAndMessages(null);
    }

    public void onUnload() {
        m13810a("onUnload");
        this.dataCenter.removeObserver(this);
        if (this.f17564c != null) {
            this.f17564c.mo8247a();
        }
    }

    /* renamed from: a */
    public final void mo11730a(int i) {
        this.f17571k.notifyItemRangeRemoved(0, 70);
    }

    public void handleMsg(Message message) {
        if (message != null && 1 == message.what) {
            this.f17574n = true;
        }
    }

    public void onEvent(C5203v vVar) {
        this.f17572l = C6406a.NORMAL;
        mo12533a(C6406a.NORMAL);
    }

    /* renamed from: a */
    private <T> void m13809a(Class<T> cls) {
        C4495a.m10823a().mo10300a(cls).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C5185e) {
                    TextMessageWidget.this.onEvent((C5185e) t);
                } else if (t instanceof C5203v) {
                    TextMessageWidget.this.onEvent((C5203v) t);
                } else {
                    if (t instanceof C5277ak) {
                        TextMessageWidget.this.onEvent((C5277ak) t);
                    }
                }
            }
        });
    }

    public void onEvent(C5277ak akVar) {
        this.f17572l = C6406a.NORMAL;
        mo12533a(C6406a.NORMAL);
    }

    /* renamed from: a */
    private void m13810a(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "TEXT_MESSAGE_WIDGET_STATUS");
        hashMap.put("reason", str);
        String str3 = "view_status";
        if (this.contentView.getVisibility() == 0) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        hashMap.put(str3, str2);
        C8064d.m16005b().mo9199b("ttlive_msg", (Map<String, ?>) hashMap);
    }

    /* renamed from: b */
    public final void mo12534b(int i) {
        String str;
        if (isViewValid()) {
            if (C6406a.NORMAL == this.f17572l || i <= 0) {
                this.f17569i.setVisibility(4);
                this.f17565d = 0;
                return;
            }
            this.f17565d = i;
            if (i < 100) {
                str = String.valueOf(i);
            } else {
                str = "99+";
            }
            this.f17570j.setText(this.context.getResources().getString(R.string.e4u, new Object[]{str}));
            if (this.f17569i.getVisibility() != 0) {
                C8068g.m16014a(this.context);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(100);
                this.f17569i.startAnimation(translateAnimation);
            }
            this.f17569i.setVisibility(0);
        }
    }

    public void onEvent(C5185e eVar) {
        T t = eVar.f13888a;
        if (t != null && "6".equals(t.f21751f)) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_do_send_message", new C5188h(t.f21750e));
            if (this.f17564c != null) {
                C5854cd cdVar = this.f17564c;
                if (cdVar.mo8518c() != null) {
                    for (int i = 0; i < cdVar.f15329e.size(); i++) {
                        if (t == ((C5084b) cdVar.f15329e.get(i)).f13643a) {
                            cdVar.f15329e.remove(i);
                            ((C5858a) cdVar.mo8518c()).mo11731a(i, true);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12533a(C6406a aVar) {
        if (this.f17572l != aVar) {
            this.f17572l = aVar;
            if (C6406a.NORMAL == aVar) {
                mo12534b(0);
                this.f17563b.f15577a = 1.0f;
                this.f17562a.mo4833d(this.f17571k.getItemCount() - 1);
                this.f17566e = this.f17571k.getItemCount() - 1;
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1833053846) {
                if (hashCode != -1548871708) {
                    if (hashCode == -1357019912 && key.equals("data_pre_show_keyboard")) {
                        c = 2;
                    }
                } else if (key.equals("cmd_hide_in_douyin_commerce")) {
                    c = 1;
                }
            } else if (key.equals("data_normal_gift_end_event")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    C5159ae aeVar = (C5159ae) kVData.getData();
                    if (isViewValid() && aeVar != null) {
                        User user = aeVar.f13826a;
                        String str = aeVar.f13827b;
                        long j = aeVar.f13828c;
                        if (!(str == null || user == null)) {
                            C7808am amVar = new C7808am();
                            amVar.f21485a = user;
                            amVar.f21487c = str;
                            amVar.f21486b = j;
                            amVar.f21488d = ((Long) this.dataCenter.get("data_room_id")).longValue();
                            amVar.baseMessage = aeVar.f13829d;
                            if (this.f17564c != null) {
                                this.f17564c.onMessage(amVar);
                            }
                            return;
                        }
                    }
                case 1:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                    }
                    m13810a("onChanged");
                    return;
                case 2:
                    this.f17562a.clearFocus();
                    break;
            }
        }
    }

    public void onInit(Object... objArr) {
        if (((Boolean) LiveSettingKeys.ENABLE_LIVE_TEXT_SCROLL_OPTIMIZE.mo9431a()).booleanValue()) {
            this.f17568h = ((Integer) LiveSettingKeys.LIVE_TEXT_WIDGET_SCROLL_SPEED.mo9431a()).intValue();
        }
        this.f17562a = (LiveMessageRecyclerView) this.contentView.findViewById(R.id.blk);
        this.f17569i = this.contentView.findViewById(R.id.bli);
        this.f17570j = (TextView) this.contentView.findViewById(R.id.blj);
        this.f17571k = new C6141ej();
        this.f17563b = new SmoothLinearLayoutManager(this.context, 1, false);
        this.f17563b.f15577a = 1.0f;
        this.f17562a.setLayoutManager(this.f17563b);
        this.f17562a.mo4798a((C1331h) new C6195fd(1, (int) C9432q.m18687b(this.context, 4.0f)));
        C1506w wVar = new C1506w();
        wVar.f4728i = 0;
        wVar.f4730k = 0;
        wVar.f4729j = 0;
        this.f17562a.setItemAnimator(null);
        this.f17562a.setAdapter(this.f17571k);
        this.f17562a.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    TextMessageWidget.this.f17567f = false;
                    return;
                }
                if (i == 0 && TextMessageWidget.this.f17567f) {
                    TextMessageWidget.this.mo12533a(C6406a.NORMAL);
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (!recyclerView.canScrollVertically(1)) {
                    TextMessageWidget.this.mo12533a(C6406a.NORMAL);
                } else if (!TextMessageWidget.this.f17567f) {
                    int l = TextMessageWidget.this.f17563b.mo4751l();
                    if (l > TextMessageWidget.this.f17566e) {
                        TextMessageWidget.this.mo12534b(TextMessageWidget.this.f17565d - (l - TextMessageWidget.this.f17566e));
                        TextMessageWidget.this.f17566e = l;
                    }
                }
            }
        });
        this.f17562a.setOnTouchListener(new C6570eu(this));
        this.f17562a.setOnFlingListener(new C1338k() {
            /* renamed from: a */
            public final boolean mo5078a(int i, int i2) {
                if (i2 == 0) {
                    if (!TextMessageWidget.this.f17562a.canScrollVertically(1)) {
                        TextMessageWidget.this.mo12533a(C6406a.NORMAL);
                    } else {
                        TextMessageWidget.this.mo12533a(C6406a.FOCUS);
                        int l = TextMessageWidget.this.f17563b.mo4751l();
                        if (l > TextMessageWidget.this.f17566e) {
                            TextMessageWidget.this.mo12534b(TextMessageWidget.this.f17565d - (l - TextMessageWidget.this.f17566e));
                            TextMessageWidget.this.f17566e = l;
                        }
                    }
                }
                return false;
            }
        });
        this.f17569i.setOnClickListener(new C6571ev(this));
    }

    public void onLoad(Object... objArr) {
        if (this.dataCenter.get("data_room_id") != null) {
            this.f17564c = new C5854cd(((Long) this.dataCenter.get("data_room_id")).longValue());
            this.f17573m = (Room) this.dataCenter.get("data_room");
            this.f17571k.f16472a = LayoutInflater.from(this.context);
            this.f17571k.f16473b = this.f17564c.f15329e;
            this.f17571k.f16474c = this.f17573m;
            this.f17571k.notifyDataSetChanged();
            this.f17562a.mo4833d(this.f17571k.getItemCount());
            this.f17564c.mo8520a((C5858a) this);
            m13809a(C5185e.class);
            m13809a(C5203v.class);
            m13809a(C5277ak.class);
            this.dataCenter.observeForever("data_normal_gift_end_event", this).observeForever("cmd_hide_in_douyin_commerce", this).observe("data_pre_show_keyboard", this);
            mo12534b(0);
            this.f17573m.getOrientation();
            if (this.f17573m.getStreamType().isStreamingBackground) {
                this.dataCenter.lambda$put$1$DataCenter("data_room_text_message_presenter", this.f17564c);
            }
            this.f17574n = true;
            m13810a("onLoad");
            this.dataCenter.lambda$put$1$DataCenter("text_msg_widget_ready", "");
        }
    }

    /* renamed from: a */
    public final void mo11732a(C7869cj cjVar) {
        if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_screen_message", cjVar);
        }
    }

    /* renamed from: c */
    public final void mo11734c(int i, boolean z) {
        float f;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f17563b;
        if (this.f17574n) {
            f = (float) this.f17568h;
        } else {
            f = 1.0f;
        }
        smoothLinearLayoutManager.f15577a = f;
        this.f17571k.notifyItemChanged(i);
        if (C6406a.NORMAL == this.f17572l || this.f17567f) {
            this.f17567f = true;
            this.f17562a.mo4833d(this.f17571k.getItemCount() - 1);
            this.f17566e = this.f17571k.getItemCount() - 1;
        }
    }

    /* renamed from: a */
    public final void mo11731a(int i, boolean z) {
        this.f17571k.notifyItemRemoved(i);
        if (i != this.f17571k.getItemCount()) {
            C6141ej ejVar = this.f17571k;
            ejVar.notifyItemRangeChanged(i, ejVar.getItemCount() - i);
        }
        if (z) {
            this.f17562a.mo4833d(this.f17571k.getItemCount() - 1);
            this.f17566e = this.f17571k.getItemCount() - 1;
        }
    }

    /* renamed from: b */
    public final void mo11733b(int i, boolean z) {
        float f;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f17563b;
        if (this.f17574n) {
            f = (float) this.f17568h;
        } else {
            f = 1.0f;
        }
        smoothLinearLayoutManager.f15577a = f;
        this.f17571k.notifyItemInserted(i);
        mo12534b(this.f17565d + 1);
        if (this.f17565d >= 300) {
            this.f17572l = C6406a.NORMAL;
            mo12534b(0);
            this.f17563b.f15577a = 1.0f;
            this.f17562a.mo4833d(this.f17571k.getItemCount());
            this.f17566e = this.f17571k.getItemCount() - 1;
        }
        if (C6406a.NORMAL == this.f17572l || this.f17567f) {
            this.f17567f = true;
            this.f17562a.mo4833d(this.f17571k.getItemCount() - 1);
            this.f17566e = this.f17571k.getItemCount() - 1;
        }
    }
}
