package com.google.android.play.core.p1053e;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.p1051c.C17254ad;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1051c.C17283be;
import com.google.android.play.core.p1052d.C17315a;
import com.google.android.play.core.p1056f.C17365d;
import com.google.android.play.core.p1056f.C17368f;
import com.google.android.play.core.p1056f.C17374l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.e.ad */
final class C17323ad implements C17338d {

    /* renamed from: a */
    final C17321ab f48799a;

    /* renamed from: b */
    private final C17325af f48800b;

    /* renamed from: c */
    private final C17361z f48801c;

    /* renamed from: d */
    private final C17349n f48802d;

    /* renamed from: e */
    private final Handler f48803e;

    C17323ad(C17325af afVar, Context context) {
        this(afVar, context, context.getPackageName());
    }

    private C17323ad(C17325af afVar, Context context, String str) {
        this.f48803e = new Handler(Looper.getMainLooper());
        this.f48801c = new C17361z(context, str);
        this.f48800b = afVar;
        this.f48799a = C17321ab.m42403a(context);
        this.f48802d = new C17349n(context);
    }

    /* renamed from: a */
    static List<String> m42408a(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            if (VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Set<String> mo33617a() {
        Set<String> b = this.f48801c.mo33654b();
        return b == null ? Collections.emptySet() : b;
    }

    /* renamed from: a */
    public final synchronized void mo33618a(C17343h hVar) {
        this.f48799a.mo33608a((C17315a<StateT>) hVar);
    }

    /* renamed from: a */
    public final boolean mo33619a(C17342g gVar, Activity activity, int i) throws SendIntentException {
        if (gVar.mo33634b() != 8 || gVar.mo33642j() == null) {
            return false;
        }
        activity.startIntentSenderForResult(gVar.mo33642j().getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    /* renamed from: b */
    public final Set<String> mo33621b() {
        return this.f48801c.mo33653a();
    }

    /* renamed from: b */
    public final synchronized void mo33622b(C17343h hVar) {
        this.f48799a.mo33611b(hVar);
    }

    /* renamed from: a */
    public final C17365d<Integer> mo33616a(C17340f fVar) {
        boolean z;
        if (!fVar.f48847b.isEmpty() && VERSION.SDK_INT < 21) {
            return C17368f.m42533a((Exception) new C17318a(-5));
        }
        List<Locale> list = fVar.f48847b;
        Set b = this.f48801c.mo33654b();
        if (b == null) {
            z = true;
        } else {
            HashSet hashSet = new HashSet();
            for (Locale language : list) {
                hashSet.add(language.getLanguage());
            }
            z = b.containsAll(hashSet);
        }
        if (z) {
            if (mo33621b().containsAll(fVar.f48846a) && (VERSION.SDK_INT < 21 || Collections.disjoint(fVar.f48846a, this.f48802d.mo33644a()))) {
                this.f48803e.post(new C17322ac(this, fVar));
                return C17368f.m42534a(Integer.valueOf(0));
            }
        }
        C17325af afVar = this.f48800b;
        List<String> list2 = fVar.f48846a;
        List a = m42408a(fVar.f48847b);
        C17325af.f48805a.mo33685a("startInstall(%s,%s)", list2, a);
        C17374l lVar = new C17374l();
        C17283be<C17254ad> beVar = afVar.f48807b;
        C17326ag agVar = new C17326ag(afVar, lVar, list2, a, lVar);
        beVar.mo33588a((C17281bc) agVar);
        return lVar.f48889a;
    }

    /* renamed from: a */
    public final C17365d<Void> mo33615a(int i) {
        C17325af afVar = this.f48800b;
        C17325af.f48805a.mo33685a("cancelInstall(%d)", Integer.valueOf(i));
        C17374l lVar = new C17374l();
        afVar.f48807b.mo33588a((C17281bc) new C17328ai(afVar, lVar, i, lVar));
        return lVar.f48889a;
    }

    /* renamed from: b */
    public final C17365d<C17342g> mo33620b(int i) {
        C17325af afVar = this.f48800b;
        C17325af.f48805a.mo33685a("getSessionState(%d)", Integer.valueOf(i));
        C17374l lVar = new C17374l();
        afVar.f48807b.mo33588a((C17281bc) new C17327ah(afVar, lVar, i, lVar));
        return lVar.f48889a;
    }
}
