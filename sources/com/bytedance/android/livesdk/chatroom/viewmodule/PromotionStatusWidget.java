package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5183c;
import com.bytedance.android.livesdk.chatroom.presenter.C5843bw;
import com.bytedance.android.livesdk.chatroom.presenter.C5843bw.C5844a;
import com.bytedance.android.livesdk.chatroom.presenter.C5843bw.C5845b;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.message.model.C7850bs;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

public class PromotionStatusWidget extends LiveRecyclableWidget implements OnClickListener, C5844a {

    /* renamed from: a */
    private TextView f17515a;

    /* renamed from: b */
    private C5843bw f17516b;

    /* renamed from: c */
    private boolean f17517c;

    /* renamed from: d */
    private Room f17518d;

    /* renamed from: e */
    private boolean f17519e;

    /* renamed from: f */
    private boolean f17520f;

    /* renamed from: g */
    private JSONObject f17521g;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget$a */
    class C6398a implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6398a() {
        }

        public final void onClick(View view) {
            PromotionStatusWidget.this.onClick(view);
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

    public int getLayoutId() {
        return R.layout.ar4;
    }

    public void onUnload() {
        this.f17516b.mo8247a();
    }

    public void onInit(Object... objArr) {
        this.f17520f = false;
        this.f17515a = (TextView) this.contentView.findViewById(R.id.de4);
        this.f17516b = new C5843bw(1);
    }

    /* renamed from: a */
    private void m13772a(String str) {
        int i;
        int i2;
        if (this.f17519e) {
            i = 300;
        } else {
            i = 240;
        }
        if (this.f17519e) {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        } else {
            i2 = 320;
        }
        C4104a.m10232a((FragmentActivity) this.context, C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(str).mo10510a(i).mo10514b(i2).mo10518d(8).mo10512a("promotionCards")));
    }

    public void onClick(View view) {
        C7850bs bsVar = new C7850bs();
        bsVar.f21690a = "buy_card";
        C8845b bVar = new C8845b();
        bVar.f24132c = this.f17518d.getId();
        bsVar.baseMessage = bVar;
        C4495a.m10823a().mo10301a((Object) new C5183c(bsVar));
    }

    public void onEvent(C5183c cVar) {
        C8068g.m16014a(this.context);
        TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        this.f17518d.getId();
        if (isViewValid() && cVar.f13882a != null) {
            String str = cVar.f13882a.f21690a;
            char c = 65535;
            if (str.hashCode() == -984622807 && str.equals("buy_card")) {
                c = 0;
            }
            if (c == 0 && cVar.f13882a.baseMessage != null) {
                m13772a(C4604n.m11051a(Locale.ENGLISH, "https://api.hypstar.com/falcon/live_inroom/page/promotion_card/index.html?type=promotion&room_id=%1$d&is_anchor=%2$s", Long.valueOf(cVar.f13882a.baseMessage.f24132c), String.valueOf(this.f17517c)));
            }
        }
    }

    public void onLoad(Object... objArr) {
        String str;
        this.f17517c = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f17518d = (Room) this.dataCenter.get("data_room");
        this.f17519e = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f17516b.mo8520a((C5844a) this);
        C4495a.m10823a().mo10300a(C5183c.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<C5183c>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                PromotionStatusWidget.this.onEvent((C5183c) obj);
            }
        });
        mo12518a(true);
        C6610k.m13985a().mo12668a(C6605h.PROMOTION_CARD, (C6601a) new C6398a());
        if (C35807d.m80935a(this.context, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        String str2 = (String) this.dataCenter.get("data_enter_source");
        this.f17521g = new JSONObject();
        try {
            this.f17521g.put("source", this.f17518d.getUserFrom());
            this.f17521g.put("live_source", str);
            this.f17521g.put("request_id", this.f17518d.getRequestId());
            this.f17521g.put("log_pb", this.f17518d.getLog_pb());
            this.f17521g.put("enter_from", str2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12518a(boolean z) {
        this.f17520f = !z;
        if (!z) {
            this.f17515a.setVisibility(0);
            this.f17515a.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.byk, 0);
            this.f17515a.setOnClickListener(null);
        } else if (((Boolean) C6718b.f18328Y.mo9431a()).booleanValue() || !this.f17517c) {
            this.f17515a.setVisibility(4);
            this.f17515a.setOnClickListener(null);
        } else {
            this.f17515a.setVisibility(0);
            this.f17515a.setText(R.string.ez1);
            this.f17515a.setCompoundDrawablesWithIntrinsicBounds(R.drawable.byv, 0, R.drawable.byk, 0);
            this.f17515a.setOnClickListener(this);
        }
    }

    /* renamed from: a */
    public final void mo11719a(int i, int i2) {
        if (this.f17515a != null) {
            this.f17515a.setText(this.f17515a.getContext().getString(R.string.ez3, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12517a(View view, long j) {
        m13772a(C4604n.m11051a(Locale.ENGLISH, "https://api.hypstar.com/falcon/live_inroom/page/promotion_card/index.html?type=history&room_id=%1$d&is_anchor=%2$s", Long.valueOf(j), String.valueOf(this.f17517c)));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", this.f17518d.getUserFrom());
            jSONObject.put("request_id", this.f17518d.getRequestId());
            jSONObject.put("log_pb", this.f17518d.getLog_pb());
        } catch (Exception unused) {
        }
        C8068g.m16015a(view);
        this.f17518d.getOwner().getId();
    }

    /* renamed from: a */
    public final void mo11720a(C5845b bVar, long j) {
        if (this.f17515a != null) {
            switch (bVar) {
                case IDLE:
                    mo12518a(true);
                    return;
                case IN_PROGRESS:
                    mo12518a(false);
                    this.f17515a.setText(this.f17515a.getContext().getString(R.string.ez3, new Object[]{Integer.valueOf(0)}));
                    this.f17515a.setOnClickListener(new C6558ei(this, j));
                    return;
                case FINISHED:
                    if (this.f17520f) {
                        this.f17515a.setText(R.string.ez2);
                        this.f17515a.setOnClickListener(new C6559ej(this, j));
                        break;
                    }
                    break;
            }
        }
    }
}
