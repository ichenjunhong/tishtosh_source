package com.bytedance.android.live.broadcast.dutygift;

import android.arch.lifecycle.C0199s;
import android.content.DialogInterface;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p194a.C3034a.C3035a;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.dutygift.C3171a.C3172a;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3895i;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.p306bl.C5005b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu;
import com.bytedance.android.livesdk.chatroom.p325ui.C6164eu.C6169a;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6464az;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7512k;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

public class DutyGiftControlWidget extends LiveWidget implements C0199s<KVData>, C3044a, C3172a {

    /* renamed from: a */
    public C3170a f9199a;

    /* renamed from: b */
    public C8688c f9200b;

    /* renamed from: c */
    C3185n f9201c;

    /* renamed from: d */
    public DutyGiftInfo f9202d;

    /* renamed from: e */
    Room f9203e;

    /* renamed from: f */
    String f9204f;

    /* renamed from: g */
    long f9205g;

    /* renamed from: h */
    int f9206h;

    /* renamed from: i */
    public C6164eu f9207i;

    /* renamed from: j */
    private C3171a f9208j;

    /* renamed from: com.bytedance.android.live.broadcast.dutygift.DutyGiftControlWidget$a */
    public class C3170a implements OnClickListener, C6601a {

        /* renamed from: a */
        public C3183l f9213a;

        /* renamed from: b */
        final /* synthetic */ DutyGiftControlWidget f9214b;

        /* renamed from: c */
        private View f9215c;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8510a(int i) {
            if (this.f9215c != null) {
                this.f9215c.setVisibility(i);
            }
        }

        public final void onClick(View view) {
            boolean z;
            if (view.getId() == R.id.akx) {
                DutyGiftControlWidget dutyGiftControlWidget = this.f9214b;
                StringBuilder sb = new StringBuilder("onStartGameClick mSticker: ");
                sb.append(dutyGiftControlWidget.f9200b);
                C3831a.m9716d("DutyGiftControlWidget", sb.toString());
                if (dutyGiftControlWidget.f9200b != null) {
                    dutyGiftControlWidget.f9201c.mo8526a(dutyGiftControlWidget.f9200b);
                } else {
                    C4204a.m10421a(dutyGiftControlWidget.context, (int) R.string.ei3);
                }
                this.f9213a.dismiss();
                return;
            }
            if (((Integer) LinkCrossRoomDataHolder.m11103a().get("data_link_model", Integer.valueOf(0))).intValue() != 0) {
                C4204a.m10421a(this.f9214b.context, (int) R.string.ei6);
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.f9213a == null) {
                    this.f9213a = new C3183l(this.f9214b.context, this);
                    this.f9213a.setOnDismissListener(C3182k.f9230a);
                }
                if (!this.f9213a.isShowing()) {
                    this.f9213a.show();
                    DutyGiftControlWidget dutyGiftControlWidget2 = this.f9214b;
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_id", String.valueOf(dutyGiftControlWidget2.f9203e.getId()));
                    hashMap.put("anchor_id", String.valueOf(dutyGiftControlWidget2.f9203e.getOwner().getId()));
                    C8049c.m15979a().mo14202a("effect_game_click", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
                }
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            this.f9215c = view;
            mo8510a(8);
        }
    }

    /* renamed from: a */
    public final void mo8283a(String str, C8688c cVar) {
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    /* renamed from: b */
    public final void mo8284b(String str, C8688c cVar) {
    }

    public int getLayoutId() {
        return R.layout.apw;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f9208j.mo8247a();
    }

    /* renamed from: a */
    public final void mo8498a() {
        if (this.f9201c != null && this.f9200b != null) {
            this.f9201c.mo8529b(this.f9200b);
        }
    }

    public void onCreate() {
        super.onCreate();
        C6610k.m13985a().mo12668a(C6605h.DUTY_GIFT, (C6601a) this.f9199a);
        this.f9203e = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observeForever("receiver_effect_message", this).observe("cmd_stop_duty_gift", this);
        this.f9208j = new C3171a(this.f9203e, this.dataCenter);
        this.f9208j.mo8520a((C3035a) this);
    }

    /* renamed from: c */
    private void m8766c() {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f9203e.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f9203e.getOwner().getId()));
        if (this.f9202d != null) {
            hashMap.put("effectgame_id", String.valueOf(this.f9202d.getDutyId()));
            hashMap.put("effectgame_gift_id", String.valueOf(this.f9202d.getGiftId()));
            hashMap.put("effectgame_gift_cnt", String.valueOf(this.f9206h));
            C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(this.f9202d.getGiftId());
            if (findGiftById != null) {
                hashMap.put("effectgame_gift_money", String.valueOf(this.f9206h * findGiftById.f20545f));
            }
            hashMap.put("time", String.valueOf((int) ((System.currentTimeMillis() - this.f9205g) / 1000)));
            hashMap.put("is_success", String.valueOf(this.f9202d.isSuccess()));
        }
        C8049c.m15979a().mo14202a("effect_game_end", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
    }

    /* renamed from: b */
    private void m8765b(boolean z) {
        if (this.f9208j != null) {
            this.f9208j.mo8514a(z);
        }
    }

    /* renamed from: b */
    public final void mo8249b(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            this.f9206h = (int) dutyGiftInfo.getScore();
            mo8499a(m8764a((int) dutyGiftInfo.getTargetScore(), this.f9206h));
        }
    }

    /* renamed from: a */
    public final void mo8248a(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo == null || dutyGiftInfo.getStatus() <= 0) {
            this.f9199a.mo8510a(8);
            return;
        }
        this.f9199a.mo8510a(0);
        final C3277a a = this.f9201c.mo8524a();
        if (a != null) {
            a.mo8280a("livegame", new C3045b() {
                /* renamed from: a */
                public final void mo8286a() {
                    C3831a.m9716d("DutyGiftControlWidget", "onSyncStickersFailed() ");
                }

                /* renamed from: a */
                public final void mo8287a(EffectChannelResponse effectChannelResponse) {
                    if (effectChannelResponse != null) {
                        List allCategoryEffects = effectChannelResponse.getAllCategoryEffects();
                        if (!C9414h.m18630a(allCategoryEffects)) {
                            C8688c a = C3287f.m9010a((Effect) allCategoryEffects.get(0));
                            a.f23760u = a.mo8282a(a);
                            if (!a.f23760u) {
                                a.mo8281a("livegame", a, (C3044a) DutyGiftControlWidget.this);
                            } else {
                                DutyGiftControlWidget.this.f9200b = a;
                            }
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8499a(C3184m mVar) {
        if (mVar != null && this.f9201c != null) {
            this.f9201c.mo8528b(mVar);
        }
    }

    /* renamed from: a */
    public final void mo8501a(boolean z) {
        if (this.f9202d != null && this.f9202d.getStatus() > 0) {
            mo8498a();
            m8765b(true);
            m8766c();
            this.f9202d = null;
        }
    }

    /* renamed from: d */
    public final void mo8504d(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            dutyGiftInfo.setSuccess(this.f9202d.isSuccess());
            if (dutyGiftInfo.isSuccess() == 1 && dutyGiftInfo.getMvpUser() != null) {
                String nickName = dutyGiftInfo.getMvpUser().getNickName();
                C7512k kVar = new C7512k();
                if (TextUtils.isEmpty(nickName)) {
                    nickName = C3922z.m9903a((int) R.string.efk);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C3287f.m9013a(C3922z.m9915e()));
                sb.append(File.separator);
                sb.append(C9395d.m18571a(nickName));
                sb.append(".png");
                String sb2 = sb.toString();
                if (!C3895i.m9849a(sb2)) {
                    if (nickName.length() > 6) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(nickName.substring(0, 6));
                        sb3.append("...");
                        nickName = sb3.toString();
                    }
                    kVar.f20601d = nickName;
                    kVar.f20599b = 119;
                    kVar.f20600c = 16;
                    kVar.f20606i = sb2;
                    kVar.f20603f = "#ff7452";
                    kVar.f20602e = 14;
                    kVar.f20605h = "center";
                    C5005b.m11491a(kVar);
                }
                if (C3895i.m9849a(sb2)) {
                    if (this.f9201c != null) {
                        this.f9201c.mo8527a("user_name_icon", sb2, false);
                    }
                    C3184m mVar = new C3184m();
                    mVar.f9232a = MessageCenter.MSG_CLINET_TO_SDK_FINISH_GAME;
                    mVar.f9233b = 2;
                    mo8499a(mVar);
                }
            }
        } else {
            mo8498a();
        }
        this.f9202d = null;
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getData() != null) {
            if ("receiver_effect_message".equals(kVData.getKey())) {
                C3184m mVar = (C3184m) kVData.getData();
                StringBuilder sb = new StringBuilder("onChanged message.what: ");
                sb.append(mVar.f9232a);
                C3831a.m9716d("DutyGiftControlWidget", sb.toString());
                if (mVar.f9232a == 4099) {
                    if (mVar.f9233b != 0 && mVar.f9233b != 1) {
                        C4525b.f12414bl.mo10346a(Integer.valueOf(mVar.f9234c));
                        mo8498a();
                    } else if (this.f9202d != null) {
                        this.f9202d.setSuccess(mVar.f9233b);
                        m8765b(false);
                        m8766c();
                    }
                } else if (mVar.f9232a == 4104) {
                    this.f9208j.mo8517b();
                }
            } else if ("cmd_stop_duty_gift".equals(kVData.getKey()) && (this.f9207i == null || !this.f9207i.isShowing())) {
                if (this.f9207i == null) {
                    C6169a aVar = new C6169a(getContext(), 2);
                    aVar.f16565a.f16568c = R.layout.ahv;
                    this.f9207i = aVar.mo12210a(false).mo12212b((int) R.string.ei2).mo12209a(C3922z.m9903a((int) R.string.ei1), new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            if (DutyGiftControlWidget.this.f9202d != null) {
                                DutyGiftControlWidget.this.mo8501a(true);
                            } else {
                                DutyGiftControlWidget.this.mo8498a();
                            }
                        }
                    }).mo12214b(C3922z.m9903a((int) R.string.ei0), new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).mo12211a();
                }
                this.f9207i.show();
            }
        }
    }

    /* renamed from: c */
    public final void mo8503c(DutyGiftInfo dutyGiftInfo) {
        String str;
        if (dutyGiftInfo != null) {
            long giftId = dutyGiftInfo.getGiftId();
            C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(giftId);
            StringBuilder sb = new StringBuilder("downloadGiftImage giftId: ");
            sb.append(giftId);
            sb.append(", gift: ");
            sb.append(findGiftById);
            C3831a.m9716d("DutyGiftControlWidget", sb.toString());
            if (findGiftById != null) {
                this.f9202d = dutyGiftInfo;
                ImageModel imageModel = findGiftById.f20541b;
                File externalCacheDir = this.context.getExternalCacheDir();
                if (externalCacheDir != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(externalCacheDir.getAbsolutePath());
                    sb2.append("/dutyGift");
                    str = sb2.toString();
                } else {
                    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(absolutePath);
                    sb3.append("/Android/data/");
                    sb3.append(this.context.getPackageName());
                    sb3.append("/cache/dutyGift");
                    str = sb3.toString();
                }
                C5213c.m11812a(imageModel).mo6541d((C1711f<? super T, ? extends R>) new C3180i<Object,Object>(str, String.valueOf(giftId))).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C3181j<Object>(this));
            }
            return;
        }
        this.f9202d = null;
        mo8498a();
    }

    /* renamed from: a */
    static C3184m m8764a(int i, int i2) {
        C3184m mVar = new C3184m();
        mVar.f9232a = MessageCenter.MSG_CLIENT_TO_SDK_CHALLENGE_GAME;
        mVar.f9233b = i2;
        mVar.f9234c = i;
        return mVar;
    }

    /* renamed from: c */
    public final void mo8285c(String str, C8688c cVar) {
        StringBuilder sb = new StringBuilder("onDownloadSuccess panel: ");
        sb.append(str);
        sb.append(", sticker: ");
        sb.append(cVar);
        C3831a.m9716d("DutyGiftControlWidget", sb.toString());
        if (str == "livegame") {
            this.f9200b = cVar;
        }
    }
}
