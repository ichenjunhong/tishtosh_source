package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p683ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50205i;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b */
public final class C43357b {

    /* renamed from: a */
    public static final C43357b f109622a = new C43357b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b$a */
    static final class C43358a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C43358a f109623a = new C43358a();

        C43358a() {
        }

        public final /* synthetic */ Object call() {
            Context a = C11010c.m22280a();
            String str = C43307ea.f109505r;
            C52711k.m112236a((Object) str, "ShortVideoConfig.sAudioEffectDir");
            C50205i.m108368a(a, (int) R.raw.baritone, str);
            String str2 = C43307ea.f109505r;
            C52711k.m112236a((Object) str2, "ShortVideoConfig.sAudioEffectDir");
            C50205i.m108368a(a, (int) R.raw.chipmunk, str2);
            return C52860x.f131107a;
        }
    }

    private C43357b() {
    }

    /* renamed from: a */
    public final void mo88292a() {
        C43367d dVar = (C43367d) C26888e.m65000a(C11010c.m22280a(), C43367d.class);
        int h = C39629l.m88232a().mo58588s().mo74162h();
        if (h != dVar.mo48479a(0)) {
            C39629l.m88232a().mo58584o().mo64331a();
            C0013i.m16a((Callable<TResult>) C43358a.f109623a);
            dVar.mo48480b(h);
        }
    }

    /* renamed from: b */
    public static CategoryPageModel m95082b() {
        int i = 0;
        List b = C52575l.m112099b((Object[]) new String[]{"chipmunk", "baritone"});
        List b2 = C52575l.m112099b((Object[]) new Integer[]{Integer.valueOf(R.drawable.f2), Integer.valueOf(R.drawable.f1)});
        Context a = C11010c.m22280a();
        List b3 = C52575l.m112099b((Object[]) new String[]{a.getString(R.string.or), a.getString(R.string.oq)});
        List b4 = C52575l.m112099b((Object[]) new String[]{"default_1", "default_2"});
        Iterable iterable = b2;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        int i2 = -1;
        for (Object next : iterable) {
            int i3 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            int intValue = ((Number) next).intValue();
            Effect effect = new Effect();
            int i4 = i2 - 1;
            effect.setEffectId(String.valueOf(i2));
            effect.setName((String) b3.get(i));
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(C52575l.m112092a(String.valueOf(intValue)));
            effect.setIconUrl(urlModel);
            StringBuilder sb = new StringBuilder();
            sb.append(C43307ea.f109505r);
            sb.append((String) b.get(i));
            effect.setUnzipPath(sb.toString());
            effect.setTags(C52575l.m112092a(b4.get(i)));
            arrayList.add(effect);
            i = i3;
            i2 = i4;
        }
        List list = (List) arrayList;
        CategoryPageModel categoryPageModel = new CategoryPageModel();
        CategoryEffectModel categoryEffectModel = new CategoryEffectModel();
        categoryEffectModel.setEffects(list);
        categoryPageModel.setCategoryEffects(categoryEffectModel);
        return categoryPageModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m95081a(com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            if (r7 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r7.veAudioEffectParam
            if (r0 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = r0.getChallenge()
            if (r0 == 0) goto L_0x0078
            java.util.List r1 = r7.challenges
            if (r1 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.infosticker.StickerChallenge r1 = r7.stickerChallenge
            r2 = 0
            if (r1 == 0) goto L_0x003e
            java.util.List r1 = r1.getRecordStickerChallengeList()
            if (r1 == 0) goto L_0x003e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r4 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r4
            java.lang.String r5 = r0.challengeName
            java.lang.String r4 = r4.challengeName
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r4)
            if (r4 == 0) goto L_0x0021
            goto L_0x003a
        L_0x0039:
            r3 = r2
        L_0x003a:
            r1 = r3
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r1 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r1
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            com.ss.android.ugc.aweme.shortvideo.dh r3 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            java.lang.String r4 = "PublishManager.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r3 = r3.f109287b
            if (r3 == 0) goto L_0x006c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0052:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r5 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r5
            java.lang.String r5 = r5.challengeName
            java.lang.String r6 = r0.challengeName
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 == 0) goto L_0x0052
            r2 = r4
        L_0x006a:
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r2 = (com.p683ss.android.ugc.aweme.shortvideo.AVChallenge) r2
        L_0x006c:
            if (r1 != 0) goto L_0x0078
            if (r2 != 0) goto L_0x0078
            java.util.List r1 = r7.challenges
            r1.remove(r0)
            r7.removeAudioEffectChallengeFromTitleAndStruct(r0)
        L_0x0078:
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.C43357b.m95081a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}
