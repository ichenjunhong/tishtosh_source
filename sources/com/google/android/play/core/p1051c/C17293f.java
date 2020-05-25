package com.google.android.play.core.p1051c;

import android.content.Intent;
import com.google.android.play.core.p1053e.C17353r;
import com.google.android.play.core.splitcompat.C17383a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.core.c.f */
final class C17293f implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ List f48773a;

    /* renamed from: b */
    private final /* synthetic */ C17353r f48774b;

    /* renamed from: c */
    private final /* synthetic */ C17291d f48775c;

    C17293f(C17291d dVar, List list, C17353r rVar) {
        this.f48775c = dVar;
        this.f48773a = list;
        this.f48774b = rVar;
    }

    public final void run() {
        boolean z;
        try {
            C17253ac acVar = this.f48775c.f48769b;
            Iterator it = this.f48773a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!acVar.f48725a.mo33695a(((Intent) it.next()).getStringExtra("split_id")).exists()) {
                    z = false;
                    break;
                }
            }
            if (z) {
                C17291d dVar = this.f48775c;
                C17353r rVar = this.f48774b;
                try {
                    if (!C17383a.m42571a(C17295h.m42356a(dVar.f48768a), true)) {
                        rVar.mo33627a(-12);
                    } else {
                        rVar.mo33626a();
                    }
                } catch (Exception unused) {
                    rVar.mo33627a(-12);
                }
            } else {
                C17291d dVar2 = this.f48775c;
                List list = this.f48773a;
                C17353r rVar2 = this.f48774b;
                Integer a = dVar2.mo33591a(list);
                if (a != null) {
                    if (a.intValue() == 0) {
                        rVar2.mo33628b();
                        return;
                    }
                    rVar2.mo33627a(a.intValue());
                }
            }
        } catch (Exception unused2) {
            this.f48774b.mo33627a(-11);
        }
    }
}
