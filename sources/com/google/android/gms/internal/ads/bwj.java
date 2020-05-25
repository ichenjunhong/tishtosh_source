package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@C16299uq
public final class bwj {

    /* renamed from: a */
    private final Object f44132a = new Object();

    /* renamed from: b */
    private int f44133b;

    /* renamed from: c */
    private List<bwi> f44134c = new LinkedList();

    /* renamed from: a */
    public final bwi mo30811a() {
        synchronized (this.f44132a) {
            bwi bwi = null;
            if (this.f44134c.size() == 0) {
                abv.m32792b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f44134c.size() >= 2) {
                int i2 = DynamicTabYellowPointVersion.DEFAULT;
                int i3 = 0;
                for (bwi bwi2 : this.f44134c) {
                    int i4 = bwi2.f44120e;
                    if (i4 > i2) {
                        i = i3;
                        bwi = bwi2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f44134c.remove(i);
                return bwi;
            }
            bwi bwi3 = (bwi) this.f44134c.get(0);
            synchronized (bwi3.f44116a) {
                bwi3.f44120e -= 100;
            }
            return bwi3;
        }
    }

    /* renamed from: a */
    public final boolean mo30812a(bwi bwi) {
        synchronized (this.f44132a) {
            if (this.f44134c.contains(bwi)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo30813b(bwi bwi) {
        synchronized (this.f44132a) {
            Iterator it = this.f44134c.iterator();
            while (it.hasNext()) {
                bwi bwi2 = (bwi) it.next();
                if (!C14963ax.m30834d().mo28595f().mo28636c()) {
                    if (bwi != bwi2 && bwi2.f44121f.equals(bwi.f44121f)) {
                        it.remove();
                        return true;
                    }
                } else if (!C14963ax.m30834d().mo28595f().mo28640e() && bwi != bwi2 && bwi2.f44123h.equals(bwi.f44123h)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo30814c(bwi bwi) {
        synchronized (this.f44132a) {
            if (this.f44134c.size() >= 10) {
                int size = this.f44134c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                abv.m32792b(sb.toString());
                this.f44134c.remove(0);
            }
            int i = this.f44133b;
            this.f44133b = i + 1;
            bwi.f44118c = i;
            this.f44134c.add(bwi);
        }
    }
}
