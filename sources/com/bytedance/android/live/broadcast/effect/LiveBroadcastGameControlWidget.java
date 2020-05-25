package com.bytedance.android.live.broadcast.effect;

import android.arch.lifecycle.C0199s;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3279b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458l.C8841c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveBroadcastGameControlWidget extends LiveWidget implements C0199s<KVData>, C2593a, C3044a {

    /* renamed from: a */
    public C8688c f9256a;

    /* renamed from: b */
    public boolean f9257b;

    /* renamed from: c */
    private Room f9258c;

    /* renamed from: d */
    private C3196a f9259d;

    /* renamed from: e */
    private long f9260e;

    /* renamed from: f */
    private C3045b f9261f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.LiveBroadcastGameControlWidget$a */
    public interface C3196a {
        /* renamed from: b */
        void mo8536b();

        /* renamed from: c */
        void mo8537c();
    }

    /* renamed from: a */
    public final void mo8283a(String str, C8688c cVar) {
    }

    /* renamed from: b */
    public final void mo8284b(String str, C8688c cVar) {
    }

    public int getLayoutId() {
        return R.layout.apw;
    }

    public void onDestroy() {
        this.f9260e = 0;
        MessageCenter.removeListener(this);
        this.dataCenter.removeObserver(this);
        super.onDestroy();
    }

    /* renamed from: b */
    private void m8822b() {
        this.f9260e = 0;
        if (this.f9256a != null) {
            C3395f.m9156f().mo8740a().mo8273b("livemoneygame");
            if (this.f9259d != null) {
                this.f9259d.mo8536b();
            }
            this.dataCenter.lambda$put$1$DataCenter("cmd_hide_other_toolbar", Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    public final void mo8535a() {
        if (!this.isDestroyed) {
            if (this.f9256a != null) {
                if (this.f9259d != null) {
                    this.f9259d.mo8537c();
                }
                C3395f.m9156f().mo8740a().mo8268a("livemoneygame", this.f9256a);
                this.dataCenter.lambda$put$1$DataCenter("cmd_hide_other_toolbar", Boolean.valueOf(true));
                this.f9260e = System.currentTimeMillis();
                if (this.f9258c != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(this.f9258c.getOwnerUserId()));
                    hashMap.put("room_id", this.f9258c.getIdStr());
                    hashMap.put("action_type", "click");
                    C8049c.m15979a().mo14202a("livesdk_blinkgame_click", hashMap, new Object[0]);
                }
            } else {
                C4204a.m10421a(this.context, (int) R.string.hpl);
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f9258c = (Room) this.dataCenter.get("data_room");
        final C3279b a = C3395f.m9156f().mo8741b().mo8551a();
        if (a != null) {
            if (this.f9261f == null) {
                this.f9261f = new C3045b() {
                    /* renamed from: a */
                    public final void mo8286a() {
                        C3831a.m9716d("LiveBroadcastGameControlWidget", "onSyncStickersFailed() ");
                    }

                    /* renamed from: a */
                    public final void mo8287a(EffectChannelResponse effectChannelResponse) {
                        if (effectChannelResponse != null) {
                            List allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
                            if (!C9414h.m18630a(allCategoryEffects)) {
                                C8688c a = C3287f.m9010a((Effect) allCategoryEffects.get(0));
                                a.f23760u = a.mo8282a(a);
                                if (!a.f23760u) {
                                    a.mo8281a("livemoneygame", a, (C3044a) LiveBroadcastGameControlWidget.this);
                                    return;
                                }
                                LiveBroadcastGameControlWidget.this.f9256a = a;
                                if (LiveBroadcastGameControlWidget.this.f9257b) {
                                    LiveBroadcastGameControlWidget.this.mo8535a();
                                }
                            }
                        }
                    }
                };
            }
            a.mo8280a("livemoneygame", (C3045b) C8841c.m17358a(this.f9261f));
        }
        MessageCenter.addListener(this);
        this.dataCenter.observeForever("cmd_broadcast_game_click", this).observeForever("data_link_state", this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        boolean z = false;
        if (kVData.getKey() == "data_link_state") {
            if (((Integer) kVData.getData(Integer.valueOf(0))).intValue() == 2) {
                m8822b();
            }
        } else if (kVData.getKey() == "cmd_broadcast_game_click") {
            if (!this.f9257b) {
                C8688c cVar = this.f9256a;
                C3279b a = C3395f.m9156f().mo8741b().mo8551a();
                if (a == null || a.mo8282a(cVar)) {
                    z = true;
                } else {
                    a.mo8281a("livemoneygame", cVar, (C3044a) this);
                }
                if (z) {
                    mo8535a();
                }
            } else {
                m8822b();
            }
            this.f9257b = !this.f9257b;
        }
    }

    /* renamed from: c */
    public final void mo8285c(String str, C8688c cVar) {
        if (str == "livemoneygame") {
            this.f9256a = cVar;
            if (this.f9257b) {
                mo8535a();
            }
        }
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 10101 && i2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!(this.f9258c == null || this.f9260e == 0)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(this.f9258c.getOwnerUserId()));
                    hashMap.put("room_id", this.f9258c.getIdStr());
                    hashMap.put("action_type", "click");
                    hashMap.put("game_score", jSONObject.opt("score").toString());
                    hashMap.put("play_duration", String.valueOf(((float) (System.currentTimeMillis() - this.f9260e)) / 1000.0f));
                    C8049c.m15979a().mo14202a("livesdk_blinkgame_exit", hashMap, new Object[0]);
                    this.f9260e = System.currentTimeMillis();
                }
            } catch (JSONException unused) {
            }
        }
    }
}
