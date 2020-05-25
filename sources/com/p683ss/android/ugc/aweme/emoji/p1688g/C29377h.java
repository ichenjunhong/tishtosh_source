package com.p683ss.android.ugc.aweme.emoji.p1688g;

import com.p683ss.android.ugc.aweme.emoji.utils.C29472b;
import com.p683ss.android.ugc.aweme.emoji.utils.EmojiApi;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.emoji.g.h */
final /* synthetic */ class C29377h implements Runnable {

    /* renamed from: a */
    private final C29368b f76952a;

    /* renamed from: b */
    private final long f76953b;

    /* renamed from: c */
    private final String f76954c;

    /* renamed from: d */
    private final String f76955d;

    /* renamed from: e */
    private final long f76956e;

    /* renamed from: f */
    private final int f76957f;

    C29377h(C29368b bVar, long j, String str, String str2, long j2, int i) {
        this.f76952a = bVar;
        this.f76953b = j;
        this.f76954c = str;
        this.f76955d = str2;
        this.f76956e = j2;
        this.f76957f = i;
    }

    public final void run() {
        C29368b bVar = this.f76952a;
        long j = this.f76953b;
        String str = this.f76954c;
        String str2 = this.f76955d;
        long j2 = this.f76956e;
        int i = this.f76957f;
        EmojiApi a = C29472b.m69540a();
        StringBuilder sb = new StringBuilder("[");
        sb.append(j);
        sb.append("]");
        a.rxCollectEmoji(1, sb.toString(), str, str2, j2, i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6541d((C1711f<? super T, ? extends R>) new C29378i<Object,Object>(bVar)).mo6505a((C1710e<? super T>) new C29379j<Object>(bVar), (C1710e<? super Throwable>) new C29372c<Object>(bVar));
    }
}
