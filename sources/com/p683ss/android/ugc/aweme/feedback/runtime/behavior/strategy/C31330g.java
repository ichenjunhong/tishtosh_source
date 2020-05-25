package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.settings.PublishLogMaxLength;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31327d;
import com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g */
public final class C31330g extends C31312f {

    /* renamed from: b */
    public static final C31331a f82091b = new C31331a(null);

    /* renamed from: c */
    private int f82092c = -1;

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g$a */
    public static final class C31331a {
        private C31331a() {
        }

        public /* synthetic */ C31331a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.g$b */
    public static final class C31332b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((PublishBehaviorModel) t2).timeStamp), Long.valueOf(((PublishBehaviorModel) t).timeStamp));
        }
    }

    /* renamed from: a */
    public final String mo64209a() {
        return "publish_log";
    }

    /* renamed from: c */
    public final String mo64212c() {
        List list;
        boolean z;
        String str;
        String str2;
        if (this.f82092c <= 0) {
            this.f82092c = C10193n.m20607a().mo18200a(PublishLogMaxLength.class, "publish_log_max_length", C10181b.m20511a().mo18175c().getPublishLogMaxLength(), 500);
        }
        if (this.f82092c <= 0) {
            StringBuilder sb = new StringBuilder("Null maxTextLength:");
            sb.append(this.f82092c);
            return sb.toString();
        }
        C31327d d = mo64214d();
        List<C31315c> list2 = d.f82086a;
        Iterable b = C52575l.m112130b(C52575l.m112133c(d.f82088c, d.f82089d), 4);
        Collection arrayList = new ArrayList(C52575l.m112104a(b, 10));
        int i = 0;
        for (Object next : b) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            C31315c cVar = (C31315c) next;
            cVar.mo64216a(i);
            arrayList.add(cVar);
            i = i2;
        }
        Iterable<C31315c> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (C31315c cVar2 : iterable) {
            C52575l.m112108a(arrayList2, (Iterable) cVar2.f82074g);
        }
        List e = C52575l.m112139e((Collection<? extends T>) (List) arrayList2);
        if (this.f82092c > 500) {
            Iterable<C31315c> iterable2 = list2;
            Collection arrayList3 = new ArrayList();
            for (C31315c cVar3 : iterable2) {
                C52575l.m112108a(arrayList3, (Iterable) cVar3.f82074g);
            }
            list = (List) arrayList3;
        } else {
            list = C52575l.m112097a();
        }
        e.addAll(list);
        Iterable<PublishBehaviorModel> a = C52575l.m112122a((Iterable<? extends T>) e, (Comparator<? super T>) new C31332b<Object>());
        Collection arrayList4 = new ArrayList(C52575l.m112104a(a, 10));
        for (PublishBehaviorModel publishBehaviorModel : a) {
            if (C52830p.m112402a(publishBehaviorModel.code)) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder(" ");
                sb2.append(publishBehaviorModel.code);
                str = sb2.toString();
            }
            if (C52830p.m112402a(publishBehaviorModel.info)) {
                str2 = "";
            } else {
                StringBuilder sb3 = new StringBuilder(" ");
                sb3.append(publishBehaviorModel.info);
                str2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(publishBehaviorModel.getSimpleTime());
            sb4.append(' ');
            sb4.append(publishBehaviorModel.idIndex);
            sb4.append(' ');
            sb4.append(publishBehaviorModel.stage);
            sb4.append(' ');
            sb4.append(publishBehaviorModel.type.getSimpleName());
            sb4.append(str);
            sb4.append(str2);
            arrayList4.add(sb4.toString());
        }
        String str3 = "";
        for (String str4 : (List) arrayList4) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str3);
            sb5.append('|');
            sb5.append(str4);
            str3 = sb5.toString();
        }
        int i3 = this.f82092c;
        C52711k.m112240b(str3, "$this$take");
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str3.substring(0, C52753d.m112322d(i3, str3.length()));
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        StringBuilder sb6 = new StringBuilder("Requested character count ");
        sb6.append(i3);
        sb6.append(" is less than zero.");
        throw new IllegalArgumentException(sb6.toString().toString());
    }
}
