package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

final class bhd extends Handler {

    /* renamed from: a */
    private final /* synthetic */ bhc f42351a;

    bhd(bhc bhc) {
        this.f42351a = bhc;
    }

    public final void handleMessage(Message message) {
        bhc bhc = this.f42351a;
        switch (message.what) {
            case 1:
                bhc.f42346c = message.arg1;
                Iterator it = bhc.f42344a.iterator();
                while (it.hasNext()) {
                    ((bhb) it.next()).mo28977a(bhc.f42345b, bhc.f42346c);
                }
                return;
            case 2:
                bhc.f42347d--;
                if (bhc.f42347d == 0) {
                    Iterator it2 = bhc.f42344a.iterator();
                    while (it2.hasNext()) {
                        ((bhb) it2.next()).mo28975a();
                    }
                    return;
                }
                break;
            case 3:
                bgy bgy = (bgy) message.obj;
                Iterator it3 = bhc.f42344a.iterator();
                while (it3.hasNext()) {
                    ((bhb) it3.next()).mo28976a(bgy);
                }
                break;
        }
    }
}
