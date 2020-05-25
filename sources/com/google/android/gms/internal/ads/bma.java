package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;

final class bma extends Handler {

    /* renamed from: a */
    private final /* synthetic */ bly f42902a;

    bma(bly bly, Looper looper) {
        this.f42902a = bly;
        super(looper);
    }

    public final void handleMessage(Message message) {
        bly bly = this.f42902a;
        boolean z = true;
        switch (message.what) {
            case 0:
                bly.f42882g--;
                return;
            case 1:
                bly.f42880e = message.arg1;
                Iterator it = bly.f42877b.iterator();
                while (it.hasNext()) {
                    ((blv) it.next()).mo29057a(bly.f42879d, bly.f42880e);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                bly.f42883h = z;
                Iterator it2 = bly.f42877b.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                return;
            case 3:
                if (bly.f42882g == 0) {
                    bsn bsn = (bsn) message.obj;
                    bly.f42878c = true;
                    bly.f42886k = bsn.f43779a;
                    bly.f42887l = bsn.f43780b;
                    bly.f42876a.mo30658a(bsn.f43781c);
                    Iterator it3 = bly.f42877b.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    return;
                }
                break;
            case 4:
                int i = bly.f42881f - 1;
                bly.f42881f = i;
                if (i == 0) {
                    bly.f42889n = (bmd) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = bly.f42877b.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                        return;
                    }
                }
                break;
            case 5:
                if (bly.f42881f == 0) {
                    bly.f42889n = (bmd) message.obj;
                    Iterator it5 = bly.f42877b.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                    return;
                }
                break;
            case 6:
                bmf bmf = (bmf) message.obj;
                bly.f42881f -= bmf.f42965d;
                if (bly.f42882g == 0) {
                    bly.f42884i = bmf.f42962a;
                    bly.f42885j = bmf.f42963b;
                    bly.f42889n = bmf.f42964c;
                    Iterator it6 = bly.f42877b.iterator();
                    while (it6.hasNext()) {
                        it6.next();
                    }
                    return;
                }
                break;
            case 7:
                bml bml = (bml) message.obj;
                if (!bly.f42888m.equals(bml)) {
                    bly.f42888m = bml;
                    Iterator it7 = bly.f42877b.iterator();
                    while (it7.hasNext()) {
                        it7.next();
                    }
                    return;
                }
                break;
            case 8:
                blt blt = (blt) message.obj;
                Iterator it8 = bly.f42877b.iterator();
                while (it8.hasNext()) {
                    ((blv) it8.next()).mo29052a(blt);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
