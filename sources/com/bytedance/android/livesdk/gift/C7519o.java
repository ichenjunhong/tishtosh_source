package com.bytedance.android.livesdk.gift;

import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.i18n.C4132a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.assets.C7209f;
import com.bytedance.android.livesdk.gift.effect.p359b.C7328a;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7509h;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.message.C7792f;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.p399o.p402c.C8063n;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.o */
public final class C7519o {
    /* renamed from: a */
    public static C8063n m15513a(C7514m mVar) {
        int i;
        C7514m mVar2 = mVar;
        C7505d findGiftById = GiftManager.inst().findGiftById(mVar2.f20613e);
        if (findGiftById == null) {
            i = 0;
        } else {
            i = findGiftById.f20545f;
        }
        C8063n nVar = new C8063n(mVar2.f20613e, findGiftById, mVar2.f20620l, mVar2.f20629u, mVar2.f20630v, mVar2.f20618j, mVar2.f20616h, mVar2.f20614f, (long) i);
        return nVar;
    }

    /* renamed from: a */
    public static C7328a m15509a(C7793a aVar) {
        String str;
        if (aVar == null || aVar.getMessageId() == 0) {
            return null;
        }
        String b = C7209f.m14962a("effects").mo13432b(aVar.f21426a);
        Spannable spannableString = new SpannableString("");
        if (aVar.f21427b != null) {
            if (aVar.f21427b.f24155a == null || TextUtils.isEmpty(((C4132a) C4116c.m10249a(C4132a.class)).getI18nString(aVar.f21427b.f24155a))) {
                str = aVar.f21427b.f24156b;
            } else {
                str = ((C4132a) C4116c.m10249a(C4132a.class)).getI18nString(aVar.f21427b.f24155a);
            }
            spannableString = ((C4193l) C4116c.m10249a(C4193l.class)).parsePatternAndGetSpannable(str, aVar.f21427b);
        }
        return new C7328a().mo13578a(aVar.getMessageId()).mo13585b(aVar.f21426a).mo13582a(b).mo13583a(true).mo13580a(aVar.f21431f).mo13586b(aVar.f21430e).mo13588b(aVar.f21428c).mo13590c(aVar.f21429d).mo13579a(spannableString);
    }

    /* renamed from: a */
    public static boolean m15514a(User user, long j) {
        if (user.getId() == j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C7328a m15510a(C7810ao aoVar, User user) {
        String str;
        String str2;
        if (aoVar == null || aoVar.getMessageId() == 0 || aoVar.f21492a == null) {
            return null;
        }
        C7505d findGiftById = GiftManager.inst().findGiftById(aoVar.f21494c);
        if (findGiftById == null) {
            return null;
        }
        String b = C7209f.m14962a("effects").mo13432b(findGiftById.f20558s);
        if (aoVar.f21493b == null || aoVar.f21493b.getId() <= 0 || (user != null && aoVar.f21493b.getId() == user.getId())) {
            str = findGiftById.f20542c;
        } else {
            Resources a = C3922z.m9901a();
            Object[] objArr = new Object[1];
            if (C7792f.m15860a(aoVar.f21493b) == null) {
                str2 = "";
            } else {
                str2 = C7792f.m15860a(aoVar.f21493b);
            }
            objArr[0] = str2;
            str = a.getString(R.string.ecf, objArr);
        }
        return new C7328a().mo13578a(aoVar.getMessageId()).mo13585b(findGiftById.f20558s).mo13577a(findGiftById.f20545f).mo13582a(b).mo13583a(aoVar.f21504m).mo13580a(aoVar.f21493b).mo13586b(aoVar.f21492a).mo13587b(str).mo13581a(aoVar.f21502k).mo13589c(findGiftById.f20543d).mo13584b(aoVar.f21495d);
    }

    /* renamed from: a */
    public static C7810ao m15511a(long j, C7514m mVar, User user) {
        return m15512a(j, mVar, null, user);
    }

    /* renamed from: b */
    public static List<C7810ao> m15515b(long j, C7514m mVar, User user, User user2) {
        ArrayList arrayList = new ArrayList();
        if (mVar == null) {
            return arrayList;
        }
        List<C7509h> list = mVar.f20628t;
        if (list == null) {
            return arrayList;
        }
        for (C7509h hVar : list) {
            C7810ao aoVar = new C7810ao();
            C8845b bVar = new C8845b();
            bVar.f24132c = j;
            bVar.f24133d = hVar.f20585g;
            bVar.f24136g = true;
            bVar.f24135f = hVar.f20580b;
            bVar.f24139j = hVar.f20579a;
            aoVar.baseMessage = bVar;
            C8851g gVar = hVar.f20579a;
            User user3 = null;
            if (gVar != null && !C9376b.m18558a((Collection<T>) gVar.f24158d)) {
                Iterator it = gVar.f24158d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8853i iVar = (C8853i) it.next();
                    if (iVar.f24165d != null && iVar.f24165d.f24174a != null && m15514a(iVar.f24165d.f24174a, ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b())) {
                        user3 = iVar.f24165d.f24174a;
                        break;
                    }
                }
            }
            if (user3 != null) {
                aoVar.f21492a = user3;
            } else if (user2 != null) {
                aoVar.f21492a = user2;
            } else {
                aoVar.f21492a = User.from(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a());
            }
            aoVar.f21495d = hVar.f20583e;
            aoVar.f21496e = mVar.f20610b;
            aoVar.f21494c = hVar.f20581c;
            aoVar.f21493b = user;
            aoVar.f21499h = hVar.f20584f;
            aoVar.f21500i = hVar.f20582d;
            aoVar.f21501j = mVar.f20615g;
            aoVar.f21505n = true;
            aoVar.isLocalInsertMsg = true;
            arrayList.add(aoVar);
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.android.livesdk.message.model.C7810ao m15512a(long r5, com.bytedance.android.livesdk.gift.model.C7514m r7, com.bytedance.android.live.base.model.user.User r8, com.bytedance.android.live.base.model.user.User r9) {
        /*
            com.bytedance.android.livesdk.message.model.ao r0 = new com.bytedance.android.livesdk.message.model.ao
            r0.<init>()
            com.bytedance.android.livesdkapi.message.b r1 = new com.bytedance.android.livesdkapi.message.b
            r1.<init>()
            r1.f24132c = r5
            long r5 = r7.f20619k
            r1.f24133d = r5
            r5 = 1
            r1.f24136g = r5
            java.lang.String r6 = r7.f20612d
            r1.f24135f = r6
            com.bytedance.android.livesdkapi.message.g r6 = r7.f20609a
            r1.f24139j = r6
            r0.baseMessage = r1
            com.bytedance.android.livesdkapi.message.g r6 = r7.f20609a
            if (r6 == 0) goto L_0x0064
            java.util.List<com.bytedance.android.livesdkapi.message.i> r1 = r6.f24158d
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x0064
            java.util.List<com.bytedance.android.livesdkapi.message.i> r6 = r6.f24158d
            java.util.Iterator r6 = r6.iterator()
        L_0x002f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r6.next()
            com.bytedance.android.livesdkapi.message.i r1 = (com.bytedance.android.livesdkapi.message.C8853i) r1
            com.bytedance.android.livesdkapi.message.m r2 = r1.f24165d
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.m r2 = r1.f24165d
            com.bytedance.android.live.base.model.user.User r2 = r2.f24174a
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.m r2 = r1.f24165d
            com.bytedance.android.live.base.model.user.User r2 = r2.f24174a
            java.lang.Class<com.bytedance.android.live.user.a> r3 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.p245d.C4116c.m10249a(r3)
            com.bytedance.android.live.user.a r3 = (com.bytedance.android.live.user.C4282a) r3
            com.bytedance.android.livesdk.user.e r3 = r3.user()
            long r3 = r3.mo14529b()
            boolean r2 = m15514a(r2, r3)
            if (r2 == 0) goto L_0x002f
            com.bytedance.android.livesdkapi.message.m r6 = r1.f24165d
            com.bytedance.android.live.base.model.user.User r6 = r6.f24174a
            goto L_0x0065
        L_0x0064:
            r6 = 0
        L_0x0065:
            if (r6 == 0) goto L_0x006a
            r0.f21492a = r6
            goto L_0x0085
        L_0x006a:
            if (r9 == 0) goto L_0x006f
            r0.f21492a = r9
            goto L_0x0085
        L_0x006f:
            java.lang.Class<com.bytedance.android.live.user.a> r6 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.p245d.C4116c.m10249a(r6)
            com.bytedance.android.live.user.a r6 = (com.bytedance.android.live.user.C4282a) r6
            com.bytedance.android.livesdk.user.e r6 = r6.user()
            com.bytedance.android.live.base.model.user.i r6 = r6.mo14521a()
            com.bytedance.android.live.base.model.user.User r6 = com.bytedance.android.live.base.model.user.User.from(r6)
            r0.f21492a = r6
        L_0x0085:
            int r6 = r7.f20616h
            r0.f21495d = r6
            int r6 = r7.f20610b
            r0.f21496e = r6
            long r1 = r7.f20613e
            r0.f21494c = r1
            r0.f21493b = r8
            int r6 = r7.f20618j
            r0.f21499h = r6
            int r6 = r7.f20614f
            r0.f21500i = r6
            long r6 = r7.f20615g
            r0.f21501j = r6
            r0.f21505n = r5
            r0.isLocalInsertMsg = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.C7519o.m15512a(long, com.bytedance.android.livesdk.gift.model.m, com.bytedance.android.live.base.model.user.User, com.bytedance.android.live.base.model.user.User):com.bytedance.android.livesdk.message.model.ao");
    }
}
