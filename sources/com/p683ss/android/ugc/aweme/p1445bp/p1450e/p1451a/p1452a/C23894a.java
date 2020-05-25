package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.p1452a;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.draft.model.C29070h;
import com.p683ss.android.ugc.aweme.effect.EffectListModel;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.C23899b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.C23900a;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23903b;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e.a.a.a */
public final class C23894a extends C23895b {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo49503c() {
        String str;
        long a = m58613a(this.f63565a.mo58803m()) + 0;
        C23289b R = this.f63565a.mo58741R();
        if (R != null) {
            ArrayList<String> arrayList = R.selectMediaList;
            if (arrayList != null) {
                List<String> b = C52575l.m112128b((Iterable<? extends T>) arrayList);
                if (b != null) {
                    for (String a2 : b) {
                        a += m58613a(a2);
                    }
                }
            }
        }
        C23289b R2 = this.f63565a.mo58741R();
        if (R2 != null) {
            str = R2.videoCoverImgPath;
        } else {
            str = null;
        }
        return a + m58613a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo49501a() {
        long a = m58613a(this.f63565a.f76142T.f76048O) + 0;
        EditPreviewInfo e = C29061d.m68500e(this.f63565a);
        if (e != null) {
            String[] reverseAudioArray = e.getReverseAudioArray();
            if (reverseAudioArray != null) {
                long j = a;
                for (String a2 : reverseAudioArray) {
                    j += m58613a(a2);
                }
                a = j;
            }
            String[] reverseVideoArray = e.getReverseVideoArray();
            if (reverseVideoArray != null) {
                long j2 = a;
                for (String a3 : reverseVideoArray) {
                    j2 += m58613a(a3);
                }
                a = j2;
            }
            String[] tempVideoArray = e.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String a4 : tempVideoArray) {
                    a += m58613a(a4);
                }
            }
            List<EditVideoSegment> videoList = e.getVideoList();
            if (videoList != null) {
                for (EditVideoSegment editVideoSegment : videoList) {
                    a = a + m58613a(editVideoSegment.getAudioPath()) + m58613a(editVideoSegment.getVideoPath());
                }
            }
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo49502b() {
        Object obj;
        String str = null;
        C23903b bVar = new C23903b(null, null, 3, null);
        long j = 0;
        if (this.f63565a.f76153k != 0) {
            String str2 = C39629l.m88232a().mo58584o().mo64333c().mo64346b(this.f63565a.f76153k).f82332i;
            C23900a aVar = new C23900a();
            aVar.mo49505a((C23905c) bVar);
            aVar.mo49507a(str2);
            j = 0 + bVar.f63571a;
        }
        C29070h ag = this.f63565a.mo58770ag();
        if (ag != null) {
            obj = ag.f76194d;
        } else {
            obj = null;
        }
        if (C23899b.m58625a(obj)) {
            bVar.mo49509a();
            String str3 = this.f63565a.mo58770ag().f76194d;
            C23900a aVar2 = new C23900a();
            aVar2.mo49505a((C23905c) bVar);
            aVar2.mo49507a(str3);
            j += bVar.f63571a;
        }
        long a = j + m58613a(this.f63565a.f76149g);
        EffectListModel effectListModel = this.f63565a.f76125C;
        if (effectListModel != null) {
            ArrayList effectPointModels = effectListModel.getEffectPointModels();
            if (effectPointModels != null) {
                List b = C52575l.m112128b((Iterable<? extends T>) effectPointModels);
                if (b != null) {
                    Iterable iterable = b;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (C23899b.m58625a((Object) ((EffectPointModel) next).getResDir())) {
                            arrayList.add(next);
                        }
                    }
                    for (EffectPointModel effectPointModel : (List) arrayList) {
                        bVar.mo49509a();
                        C23900a aVar3 = new C23900a();
                        aVar3.mo49505a((C23905c) bVar);
                        aVar3.mo49507a(effectPointModel.getResDir());
                        a += bVar.f63571a;
                    }
                }
            }
        }
        C23289b R = this.f63565a.mo58741R();
        if (R != null) {
            str = R.mvResUnzipPath;
        }
        if (!C23899b.m58625a((Object) str)) {
            return a;
        }
        String str4 = this.f63565a.mo58741R().mvResUnzipPath;
        bVar.mo49509a();
        C23900a aVar4 = new C23900a();
        aVar4.mo49505a((C23905c) bVar);
        aVar4.mo49507a(str4);
        return a + bVar.f63571a;
    }

    public C23894a(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        super(cVar);
    }
}
