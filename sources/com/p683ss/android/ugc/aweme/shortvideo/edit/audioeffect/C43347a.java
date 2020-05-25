package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a */
public final class C43347a {
    /* renamed from: a */
    public static final int m95068a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !videoPublishEditModel.isFastImport) {
            return 1;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m95069a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r0) {
        /*
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.getEffectId()
            if (r0 == 0) goto L_0x0013
            java.lang.Integer r0 = p2628d.p2650m.C52830p.m112395c(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.intValue()
            goto L_0x0014
        L_0x0013:
            r0 = -1
        L_0x0014:
            if (r0 >= 0) goto L_0x0018
            r0 = 1
            return r0
        L_0x0018:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43347a.m95069a(com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    /* renamed from: b */
    public static final String m95071b(Effect effect) {
        Object obj;
        if (effect != null) {
            List tags = effect.getTags();
            if (tags != null) {
                Iterator it = tags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = (String) obj;
                    boolean z = false;
                    if (str != null && str.length() > 0) {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public static final boolean m95070a(Effect effect, String str) {
        if (str == null) {
            return false;
        }
        Object obj = null;
        if (effect != null) {
            List tags = effect.getTags();
            if (tags != null) {
                Iterator it = tags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C52711k.m112239a((Object) (String) next, (Object) str)) {
                        obj = next;
                        break;
                    }
                }
                obj = (String) obj;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }
}
