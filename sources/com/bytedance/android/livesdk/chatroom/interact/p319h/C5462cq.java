package com.bytedance.android.livesdk.chatroom.interact.p319h;

import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4629a;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.interact.data.C5358c;
import com.bytedance.android.livesdk.chatroom.interact.p317f.C5375c;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5453cj.C5455a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.p683ss.avframework.livestreamv2.core.Anchor;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.model.CommonType.FrameFormat;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.Config.Character;
import com.p683ss.video.rtc.interact.model.Config.InteractMode;
import com.p683ss.video.rtc.interact.model.Config.Type;
import java.io.File;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.cq */
final /* synthetic */ class C5462cq implements C1710e {

    /* renamed from: a */
    private final C5453cj f14469a;

    C5462cq(C5453cj cjVar) {
        this.f14469a = cjVar;
    }

    public final void accept(Object obj) {
        int i;
        C5453cj cjVar = this.f14469a;
        C4177d dVar = (C4177d) obj;
        cjVar.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.SELF_JOIN_SUCCEED);
        if (cjVar.mo8518c() != null) {
            cjVar.f14450d.f12626q = System.currentTimeMillis();
            cjVar.f14449c.lambda$put$1$DataCenter("cmd_interact_state_change", new C5202u(7));
            if (cjVar.f14450d.f12612c == 0) {
                ((C5455a) cjVar.mo8518c()).mo11361e();
                cjVar.mo11350e_();
            } else {
                VideoQuality videoQuality = cjVar.mo11352h() ? VideoQuality.ANCHOR_HIGH : VideoQuality.ANCHOR_NORMAL;
                cjVar.f14456j = new C5375c(videoQuality);
                String str = null;
                if (TextUtils.equals(TTLiveSDKContext.getHostService().mo10308a().getChannel(), "local_test")) {
                    File externalFilesDir = TTLiveSDKContext.getHostService().mo10308a().context().getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(externalFilesDir.getAbsolutePath());
                        sb.append("/interact_");
                        sb.append(System.currentTimeMillis());
                        sb.append(".log");
                        str = sb.toString();
                        new File(str).exists();
                    }
                }
                boolean z = cjVar.f14450d.f12625p == 1;
                if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue() == 0) {
                    i = cjVar.f14450d.f12622m;
                } else {
                    i = ((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue();
                }
                if ((i & ((Integer) LiveConfigSettingKeys.LIVE_ENABLE_CLIENT_INTERACT_VENDOR.mo9431a()).intValue()) != 0) {
                    z = true;
                }
                InteractConfig mixStreamRtmpUrl = new InteractConfig().setStreamMixer(cjVar.f14456j).setBackgroundColor("#303342").setMixStreamRtmpUrl(cjVar.f14447a.getStreamUrl().mo15381a());
                mixStreamRtmpUrl.setContext(TTLiveSDKContext.getHostService().mo10308a().context()).setAgoraAppId(C5358c.m12166a()).setAgoraAppKey(cjVar.f14450d.f12623n).setZegoAppId(4120036982L).setZegoSignature(C5358c.m12168c()).setZegoThirdPartyToken(cjVar.f14450d.f12623n).setByteAppId(C5358c.m12167b()).setByteToken(cjVar.f14450d.f12623n).setUserId(TTLiveSDKContext.getHostService().mo10315h().mo14529b()).setInteractId(String.valueOf(cjVar.f14450d.f12624o)).setVideoQuality(videoQuality).setVendor(cjVar.mo11353i()).setChannelName(String.valueOf(cjVar.f14450d.f12612c)).setCharacter(Character.ANCHOR).setFrameFormat(FrameFormat.TEXTURE_2D).setTest(false).setLogReportInterval(5).setProjectKey(((C4139d) C4116c.m10249a(C4139d.class)).getProjectKey()).setInteractMode(InteractMode.PK).setLogFile(str).setSeiVersion(2).setType(Type.VIDEO).enableMixStream().setClientMixStream(z);
                cjVar.f14456j.mo11286a(mixStreamRtmpUrl);
                cjVar.f14455i = (Anchor) cjVar.f14457k.mo9036a(mixStreamRtmpUrl, Boolean.valueOf(false));
                cjVar.f14455i.setListener(cjVar.f14460n);
                cjVar.f14455i.start();
                cjVar.f14450d.lambda$put$1$DataCenter("data_link_state", C4629a.TURN_ON_ENGINE);
                cjVar.mo11353i();
            }
            cjVar.f14451e = ((C4002ac) C2201v.m6592a((long) ((Integer) LiveConfigSettingKeys.LIVE_INTERACT_MAX_TIMEOUT.mo9431a()).intValue(), TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) cjVar.mo11752q())).mo9406a(new C5460co(cjVar), new C5461cp(cjVar));
        }
    }
}
