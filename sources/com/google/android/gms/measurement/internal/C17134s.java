package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.google.android.gms.measurement.internal.s */
final class C17134s implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f48456a;

    /* renamed from: b */
    private final /* synthetic */ String f48457b;

    /* renamed from: c */
    private final /* synthetic */ Object f48458c;

    /* renamed from: d */
    private final /* synthetic */ Object f48459d;

    /* renamed from: e */
    private final /* synthetic */ Object f48460e;

    /* renamed from: f */
    private final /* synthetic */ C17133r f48461f;

    C17134s(C17133r rVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f48461f = rVar;
        this.f48456a = i;
        this.f48457b = str;
        this.f48458c = obj;
        this.f48459d = obj2;
        this.f48460e = obj3;
    }

    public final void run() {
        C16986af b = this.f48461f.f48052r.mo32923b();
        if (b.mo32979v()) {
            if (this.f48461f.f48454k == 0) {
                if (this.f48461f.mo32856s().mo33281e()) {
                    this.f48461f.f48454k = 'C';
                } else {
                    this.f48461f.f48454k = 'c';
                }
            }
            if (this.f48461f.f48444a < 0) {
                this.f48461f.f48444a = 14710;
            }
            char charAt = "01VDIWEA?".charAt(this.f48456a);
            char a = this.f48461f.f48454k;
            long b2 = this.f48461f.f48444a;
            String a2 = C17133r.m41999a(true, this.f48457b, this.f48458c, this.f48459d, this.f48460e);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(a);
            sb.append(b2);
            sb.append(":");
            sb.append(a2);
            String sb2 = sb.toString();
            boolean z = false;
            if (sb2.length() > 1024) {
                sb2 = this.f48457b.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            C16990aj ajVar = b.f47874c;
            ajVar.f47905d.mo32840c();
            if (ajVar.mo32885b() == 0) {
                ajVar.mo32884a();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            long j = ajVar.f47905d.mo32873f().getLong(ajVar.f47902a, 0);
            if (j <= 0) {
                Editor edit = ajVar.f47905d.mo32873f().edit();
                edit.putString(ajVar.f47903b, sb2);
                edit.putLong(ajVar.f47902a, 1);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            if ((ajVar.f47905d.mo32852o().mo33155g().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                z = true;
            }
            Editor edit2 = ajVar.f47905d.mo32873f().edit();
            if (z) {
                edit2.putString(ajVar.f47903b, sb2);
            }
            edit2.putLong(ajVar.f47902a, j2);
            edit2.apply();
        }
    }
}
