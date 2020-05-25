package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C16299uq;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.Iterator;
import java.util.TreeSet;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.bm */
public final class C14979bm {
    /* renamed from: a */
    public static String m30907a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            } else if (obj instanceof Bundle) {
                str = m30907a((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
