package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra.Background;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.gg */
public final class C7978gg implements C2888b<Background> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15909a(gVar);
    }

    /* renamed from: a */
    public static Background m15909a(C2895g gVar) throws Exception {
        Background background = new Background();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        background.width = C2896h.m8231b(gVar);
                        break;
                    case 2:
                        background.height = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        if (background.mUrls == null) {
                            background.mUrls = new ArrayList();
                        }
                        background.mUrls.add(C2896h.m8234e(gVar));
                        break;
                    case 4:
                        background.mUri = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return background;
            }
        }
    }
}
