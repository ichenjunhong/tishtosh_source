package com.p683ss.android.ugc.aweme.tools.p2346a;

import android.content.Intent;
import com.p683ss.android.ugc.aweme.tools.p2346a.p2347a.C46799a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.tools.a.g */
public final class C46806g {

    /* renamed from: a */
    public static Map<C46805f, C46802c> f118266a = new ConcurrentHashMap();

    /* renamed from: b */
    public static boolean f118267b;

    /* renamed from: c */
    private static final C46802c f118268c = new C46799a();

    /* renamed from: a */
    private static C46802c m101649a(C46805f fVar) {
        C46802c cVar = (C46802c) f118266a.get(fVar);
        if (cVar == null) {
            return f118268c;
        }
        return cVar;
    }

    /* renamed from: a */
    public static void m101651a(Intent intent, C46798a aVar) {
        C46805f[] values;
        for (C46805f fVar : C46805f.values()) {
            aVar.mo78696a(fVar, intent.getStringExtra(fVar.intentKey));
        }
    }

    /* renamed from: a */
    public static void m101650a(Intent intent, Intent intent2, C46804e eVar, C46804e eVar2) {
        C46805f[] values;
        for (C46805f fVar : C46805f.values()) {
            intent2.putExtra(fVar.intentKey, m101649a(fVar).mo94029a(intent.getStringExtra(fVar.intentKey), eVar, eVar2));
        }
    }

    /* renamed from: a */
    public static void m101652a(Intent intent, C46801b bVar, C46804e eVar, C46804e eVar2) {
        C46805f[] values;
        for (C46805f fVar : C46805f.values()) {
            intent.putExtra(fVar.intentKey, m101649a(fVar).mo94029a(bVar.mo78695a(fVar), eVar, eVar2));
        }
    }

    /* renamed from: a */
    public static void m101653a(C46801b bVar, C46798a aVar, C46804e eVar, C46804e eVar2) {
        C46805f[] values;
        for (C46805f fVar : C46805f.values()) {
            aVar.mo78696a(fVar, m101649a(fVar).mo94029a(bVar.mo78695a(fVar), eVar, eVar2));
        }
    }
}
