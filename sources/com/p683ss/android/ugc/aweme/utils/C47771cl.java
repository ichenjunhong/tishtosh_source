package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.utils.C47865ew.C47867a;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.cl */
public final class C47771cl {

    /* renamed from: a */
    public static final C47771cl f120290a = new C47771cl();

    /* renamed from: com.ss.android.ugc.aweme.utils.cl$a */
    static final class C47772a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f120291a;

        C47772a(String str) {
            this.f120291a = str;
        }

        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("email", this.f120291a);
            return C47809dg.f120359a.mo95052b("https://awemelark.bytedance.com/api/invoke/email2Uid", jSONObject, "application/json", null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.cl$b */
    static final class C47773b<TTaskResult, TContinuationResult> implements C0011g<String, Void> {

        /* renamed from: a */
        final /* synthetic */ C47867a f120292a;

        C47773b(C47867a aVar) {
            this.f120292a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            boolean z;
            C52711k.m112236a((Object) iVar, "it");
            CharSequence charSequence = (CharSequence) iVar.mo34e();
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C47867a aVar = this.f120292a;
                if (aVar != null) {
                    aVar.mo95085b();
                }
            } else {
                C47867a aVar2 = this.f120292a;
                if (aVar2 != null) {
                    aVar2.mo95084a();
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.cl$c */
    static final class C47774c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f120293a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f120294b;

        C47774c(String str, JSONObject jSONObject) {
            this.f120293a = str;
            this.f120294b = jSONObject;
        }

        public final /* synthetic */ Object call() {
            C47809dg.f120359a.mo95052b(this.f120293a, this.f120294b, "application/json", null);
            return null;
        }
    }

    private C47771cl() {
    }

    /* renamed from: a */
    static void m103401a(JSONObject jSONObject, String str, String str2) {
        boolean z;
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jSONObject.put(str, str2);
        }
    }
}
