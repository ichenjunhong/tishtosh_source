package com.bytedance.android.livesdk.message.model;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5385e;
import com.bytedance.android.livesdkapi.depend.model.live._BattleScorePair_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.ey */
public final class C7942ey implements C2888b<C7829bd> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7829bd bdVar = new C7829bd();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bdVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bdVar.f21563a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        bdVar.f21566d = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        bdVar.f21567e = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bdVar.f21569g = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        bdVar.f21570h = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        bdVar.f21571i = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        bdVar.f21572j = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        bdVar.f21573k = (int) C2896h.m8232c(gVar);
                        break;
                    case 10:
                        bdVar.f21574l = (int) C2896h.m8232c(gVar);
                        break;
                    case 11:
                        bdVar.f21575m = (int) C2896h.m8232c(gVar);
                        break;
                    case 12:
                        bdVar.f21576n = C2896h.m8234e(gVar);
                        break;
                    case 13:
                        bdVar.f21577o = C2896h.m8232c(gVar);
                        break;
                    case 14:
                        bdVar.f21578p = (int) C2896h.m8232c(gVar);
                        break;
                    case 16:
                        bdVar.f21580r = (int) C2896h.m8232c(gVar);
                        break;
                    case 17:
                        if (bdVar.f21581s == null) {
                            bdVar.f21581s = new ArrayList();
                        }
                        bdVar.f21581s.add(_BattleScorePair_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 18:
                        bdVar.f21582t = (int) C2896h.m8232c(gVar);
                        break;
                    case 19:
                        bdVar.f21583u = C2896h.m8230a(gVar);
                        break;
                    case 20:
                        bdVar.f21584v = C2896h.m8234e(gVar);
                        break;
                    case 21:
                        bdVar.f21585w = C2896h.m8232c(gVar);
                        break;
                    case 25:
                        bdVar.f21587y = C2896h.m8234e(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                        bdVar.f21579q = C2896h.m8232c(gVar);
                        break;
                    case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                        bdVar.f21558B = C2896h.m8231b(gVar);
                        break;
                    case 28:
                        bdVar.f21586x = C2896h.m8232c(gVar);
                        break;
                    case 29:
                        bdVar.f21588z = (int) C2896h.m8232c(gVar);
                        break;
                    case 30:
                        bdVar.f21557A = C2896h.m8232c(gVar);
                        break;
                    case 31:
                        bdVar.f21559C = C5385e.m12188a(gVar);
                        break;
                    case 34:
                        bdVar.f21564b = C2896h.m8234e(gVar);
                        break;
                    case MessageCenter.MSG_TYPE_FACE_VERIFY /*35*/:
                        bdVar.f21565c = C2896h.m8234e(gVar);
                        break;
                    case 37:
                        bdVar.f21568f = C2896h.m8234e(gVar);
                        break;
                    case 38:
                        bdVar.f21560D = C2896h.m8232c(gVar);
                        break;
                    case 39:
                        bdVar.f21561E = C2896h.m8232c(gVar);
                        break;
                    case 40:
                        bdVar.f21562F = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bdVar;
            }
        }
    }
}
