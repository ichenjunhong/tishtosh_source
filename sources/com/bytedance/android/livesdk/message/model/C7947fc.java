package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fc */
public final class C7947fc implements C2888b<LotteryEventMessage> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        LotteryEventMessage lotteryEventMessage = new LotteryEventMessage();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lotteryEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        lotteryEventMessage.lotteryId = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        lotteryEventMessage.lotteryStatus = C2896h.m8231b(gVar);
                        break;
                    case 4:
                        lotteryEventMessage.lotteryStartTime = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        lotteryEventMessage.lotteryDrawTime = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        lotteryEventMessage.lotteryCurrentTime = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        lotteryEventMessage.lotteryRulePageScheme = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return lotteryEventMessage;
            }
        }
    }
}
