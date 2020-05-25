package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p2425e.C48545a;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.music.ui.s */
public final class C37643s {

    /* renamed from: a */
    public String f95988a;

    /* renamed from: b */
    public MusicWaveBean f95989b;

    /* renamed from: c */
    public Integer f95990c;

    /* renamed from: d */
    public C48545a f95991d;

    /* renamed from: e */
    public Effect f95992e;

    /* renamed from: f */
    public Integer f95993f;

    /* renamed from: g */
    public C48649d f95994g;

    public C37643s() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f95994g, (java.lang.Object) r3.f95994g) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.music.p1978ui.C37643s
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.music.ui.s r3 = (com.p683ss.android.ugc.aweme.music.p1978ui.C37643s) r3
            java.lang.String r0 = r2.f95988a
            java.lang.String r1 = r3.f95988a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean r0 = r2.f95989b
            com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean r1 = r3.f95989b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.f95990c
            java.lang.Integer r1 = r3.f95990c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.e.a r0 = r2.f95991d
            com.ss.android.ugc.e.a r1 = r3.f95991d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r2.f95992e
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r3.f95992e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r2.f95993f
            java.lang.Integer r1 = r3.f95993f
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.effectmanager.common.g.d r0 = r2.f95994g
            com.ss.android.ugc.effectmanager.common.g.d r3 = r3.f95994g
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.p1978ui.C37643s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f95988a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicWaveBean musicWaveBean = this.f95989b;
        int hashCode2 = (hashCode + (musicWaveBean != null ? musicWaveBean.hashCode() : 0)) * 31;
        Integer num = this.f95990c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        C48545a aVar = this.f95991d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Effect effect = this.f95992e;
        int hashCode5 = (hashCode4 + (effect != null ? effect.hashCode() : 0)) * 31;
        Integer num2 = this.f95993f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        C48649d dVar = this.f95994g;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicAndEffectResult(musicFile=");
        sb.append(this.f95988a);
        sb.append(", waveBean=");
        sb.append(this.f95989b);
        sb.append(", musicStatus=");
        sb.append(this.f95990c);
        sb.append(", musicDownloadException=");
        sb.append(this.f95991d);
        sb.append(", effect=");
        sb.append(this.f95992e);
        sb.append(", effectStatus=");
        sb.append(this.f95993f);
        sb.append(", effectExceptionResult=");
        sb.append(this.f95994g);
        sb.append(")");
        return sb.toString();
    }

    public C37643s(String str, MusicWaveBean musicWaveBean, Integer num, C48545a aVar, Effect effect, Integer num2, C48649d dVar) {
        this.f95988a = str;
        this.f95989b = musicWaveBean;
        this.f95990c = num;
        this.f95991d = aVar;
        this.f95992e = effect;
        this.f95993f = num2;
        this.f95994g = dVar;
    }

    public /* synthetic */ C37643s(String str, MusicWaveBean musicWaveBean, Integer num, C48545a aVar, Effect effect, Integer num2, C48649d dVar, int i, C52707g gVar) {
        String str2;
        MusicWaveBean musicWaveBean2;
        Integer num3;
        C48545a aVar2;
        Effect effect2;
        Integer num4;
        C48649d dVar2;
        if ((i & 1) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 2) != 0) {
            musicWaveBean2 = null;
        } else {
            musicWaveBean2 = musicWaveBean;
        }
        if ((i & 4) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 8) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i & 16) != 0) {
            effect2 = null;
        } else {
            effect2 = effect;
        }
        if ((i & 32) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 64) != 0) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        this(str2, musicWaveBean2, num3, aVar2, effect2, num4, dVar2);
    }
}
