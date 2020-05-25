package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5169ao;
import com.bytedance.android.livesdk.chatroom.event.C5205x;
import com.bytedance.android.livesdk.chatroom.model.ChatGuidanceResult;
import com.bytedance.android.livesdk.chatroom.p306bl.C5030v;
import com.bytedance.android.livesdk.chatroom.p306bl.C5031w;
import com.bytedance.android.livesdk.chatroom.presenter.C5873h;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p434b.C8615a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class CommentPromotionWidget extends LiveRecyclableWidget implements C9382a {

    /* renamed from: a */
    public C7862cc f16812a;

    /* renamed from: b */
    private Room f16813b;

    /* renamed from: c */
    private String f16814c;

    /* renamed from: d */
    private C5873h f16815d;

    /* renamed from: e */
    private Handler f16816e;

    public int getLayoutId() {
        return R.layout.ane;
    }

    public void onUnload() {
        dismiss();
    }

    /* renamed from: b */
    private void m13425b() {
        this.f16815d.mo11755a();
        this.f16816e.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: 0000 */
    public void dismiss() {
        m13425b();
        if (this.contentView != null) {
            this.contentView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final C7862cc mo12311a() {
        C7862cc ccVar = new C7862cc();
        ccVar.baseMessage = this.f16812a.baseMessage;
        ccVar.f21750e = this.f16812a.f21750e;
        ccVar.f21753h = this.f16812a.f21753h;
        ccVar.f21751f = this.f16812a.f21751f;
        ccVar.f21754i = this.f16812a.f21754i;
        ccVar.f21747b = this.f16812a.f21747b;
        ccVar.f21746a = this.f16812a.f21746a;
        ccVar.f21749d = this.f16812a.f21749d;
        ccVar.f21756k = this.f16812a.f21756k;
        ccVar.f21755j = this.f16812a.f21755j;
        ccVar.f21752g = this.f16812a.f21752g;
        ccVar.f21748c = this.f16812a.f21748c;
        return ccVar;
    }

    public void onEvent(C5169ao aoVar) {
        dismiss();
    }

    public void onEvent(C5205x xVar) {
        if (xVar.f13928b) {
            dismiss();
        }
    }

    public void onInit(Object... objArr) {
        this.f16815d = new C5873h();
        this.f16816e = new C9381g(this);
    }

    /* renamed from: a */
    private <T> void m13424a(Class<T> cls) {
        C4495a.m10823a().mo10300a(cls).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C8615a) {
                    CommentPromotionWidget.this.onEvent((C8615a) t);
                } else if (t instanceof C5205x) {
                    CommentPromotionWidget.this.onEvent((C5205x) t);
                } else {
                    if (t instanceof C5169ao) {
                        CommentPromotionWidget.this.onEvent((C5169ao) t);
                    }
                }
            }
        });
    }

    public void onEvent(C8615a aVar) {
        C8686a aVar2 = aVar.f23584a;
        if (this.f16813b.getOwner() != null && aVar2.f23732a == this.f16813b.getOwner().getId() && aVar2.mo15140a() != 0) {
            m13425b();
        }
    }

    public void onLoad(Object... objArr) {
        this.f16813b = (Room) this.dataCenter.get("data_room");
        this.f16814c = (String) this.dataCenter.get("data_enter_source");
        this.f16815d = new C5873h();
        this.f16816e = new C9381g(this);
        C5873h hVar = this.f16815d;
        Room room = this.f16813b;
        Handler handler = this.f16816e;
        if (!hVar.f15377b && C5873h.m12790a(room)) {
            long intValue = (long) ((Integer) LiveSettingKeys.COMMENT_PROMOTION_DELAY.mo9431a()).intValue();
            if (intValue > 0) {
                hVar.f15376a.postDelayed(new Runnable(room, handler) {

                    /* renamed from: a */
                    final /* synthetic */ Room f15378a;

                    /* renamed from: b */
                    final /* synthetic */ Handler f15379b;

                    public final void run() {
                        if (!C5873h.m12790a(this.f15378a)) {
                            C5873h.this.mo11755a();
                            return;
                        }
                        Handler handler = this.f15379b;
                        Room room = this.f15378a;
                        String str = null;
                        if (room.isThirdParty) {
                            str = "1";
                        } else if (room.isScreenshot) {
                            str = "2";
                        }
                        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getRoomChatGuidance(new C4605o().mo10399a("room_id", String.valueOf(room.getId())).mo10399a("common_label_list", String.valueOf(room.getLabels())).mo10399a("live_type", str).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5030v<Object>(handler), (C1710e<? super Throwable>) new C5031w<Object>(handler));
                    }

                    {
                        this.f15378a = r2;
                        this.f15379b = r3;
                    }
                }, intValue * 1000);
                hVar.f15377b = true;
            }
        }
        m13424a(C8615a.class);
        m13424a(C5205x.class);
        m13424a(C5169ao.class);
    }

    public void handleMsg(Message message) {
        long j;
        String str;
        if (isViewValid() && 30 == message.what && (message.obj instanceof ChatGuidanceResult)) {
            this.f16812a = ((ChatGuidanceResult) message.obj).getMessage();
            if (this.f16812a != null) {
                this.f16812a.baseMessage.f24132c = this.f16813b.getId();
                C7862cc ccVar = this.f16812a;
                m13425b();
                this.contentView.setVisibility(0);
                TextView textView = (TextView) this.contentView.findViewById(R.id.xh);
                View findViewById = this.contentView.findViewById(R.id.xg);
                try {
                    findViewById.setBackgroundDrawable(getContext().getResources().getDrawable(R.drawable.bft));
                } catch (Exception unused) {
                }
                textView.setText(ccVar.f21750e);
                findViewById.setOnClickListener(new C6593q(this, ccVar));
                this.f16816e.postDelayed(new C6594r(this), 5000);
                Room room = this.f16813b;
                String str2 = this.f16814c;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                if (room != null) {
                    long id = room.getId();
                    String requestId = room.getRequestId();
                    if (room.getOwner() == null) {
                        j = 0;
                    } else {
                        j = room.getOwner().getId();
                    }
                    if (room.isLiveTypeAudio()) {
                        str = "voice_live";
                    } else {
                        str = "video_live";
                    }
                    hashMap2.put("user_id", String.valueOf(j));
                    hashMap2.put("request_id", requestId);
                    hashMap2.put("log_pb", room.getLog_pb());
                    hashMap2.put("room_id", String.valueOf(id));
                    hashMap2.put("live_type", str);
                }
                hashMap.putAll(hashMap2);
                if (ccVar != null) {
                    hashMap.put("prompt", ccVar.f21750e);
                }
                C8049c.m15979a().mo14202a("message_guide_show", hashMap, new C8059j().mo14213a("live_detail").mo14215c("comment").mo14217e(str2));
            }
        }
    }
}
