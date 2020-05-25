package com.p683ss.android.ugc.aweme.tools.beauty.service.p2352a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.beauty.C23785h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46896d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.service.a.a */
public abstract class C46881a {

    /* renamed from: a */
    public final C46896d f118435a;

    /* renamed from: b */
    public final C46894c f118436b;

    /* renamed from: c */
    private boolean f118437c = C23785h.m58373a("2", "3");

    /* renamed from: d */
    private boolean f118438d;

    /* renamed from: a */
    public abstract BeautyMetadata mo94161a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo94162a(C0184k kVar);

    /* renamed from: a */
    public final void mo94163a(final C0184k kVar, boolean z) {
        if (!this.f118436b.mo94155a()) {
            if (z || C39629l.m88232a().mo58590u().mo74222c().booleanValue()) {
                this.f118435a.mo86566a(this.f118435a.mo86584i());
                this.f118435a.mo86573c(this.f118435a.mo86586l());
                this.f118435a.mo86571b(this.f118435a.mo86585k());
                if (this.f118437c) {
                    this.f118435a.mo86578e(this.f118435a.mo86588n());
                    this.f118435a.mo86576d(this.f118435a.mo86587m());
                }
            }
        } else if (!this.f118438d) {
            this.f118436b.mo94154a(false, C46814a.CUR);
            if (this.f118436b.mo94155a()) {
                this.f118436b.mo94158d().mo95074a(kVar, new C0199s<List<ComposerInfo>>() {
                    public final /* synthetic */ void onChanged(Object obj) {
                        List<ComposerInfo> list = (List) obj;
                        try {
                            if (C46881a.this.f118436b.mo94156b().equals("record")) {
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                for (ComposerInfo composerInfo : list) {
                                    arrayList.add(composerInfo.f56151a);
                                    arrayList2.add(composerInfo.f56152b);
                                }
                                int indexOf = arrayList.indexOf("EFFECT_ID_TYPE_FILTER");
                                if (indexOf < 0 || indexOf >= list.size() || C39629l.m88232a().mo58574e().mo83117a(C40796a.DisableFilter)) {
                                    C46881a.this.f118435a.mo86568a(list, 10000);
                                    return;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (int i = 0; i < indexOf; i++) {
                                    arrayList3.add(list.get(i));
                                }
                                final ArrayList arrayList4 = new ArrayList();
                                while (true) {
                                    indexOf++;
                                    if (indexOf >= list.size()) {
                                        break;
                                    }
                                    arrayList4.add(list.get(indexOf));
                                }
                                C46881a.this.f118435a.mo86568a((List<ComposerInfo>) arrayList3, 10000);
                                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                    public final void run() {
                                        C46881a.this.mo94162a(kVar);
                                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                            public final void run() {
                                                C46881a.this.f118435a.mo86574c(arrayList4, 10000);
                                            }
                                        }, 50);
                                    }
                                }, 250);
                            }
                        } catch (Exception e) {
                            C50203g.m108359a((Throwable) e);
                        }
                    }
                });
                this.f118436b.mo94159e().mo95074a(kVar, new C46885b(this));
            }
            this.f118438d = true;
        } else {
            this.f118436b.mo94157c();
        }
    }

    public C46881a(C46896d dVar, boolean z, C46894c cVar) {
        this.f118435a = dVar;
        this.f118436b = cVar;
        dVar.mo86592r();
    }
}
