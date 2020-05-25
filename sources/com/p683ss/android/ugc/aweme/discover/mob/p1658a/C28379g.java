package com.p683ss.android.ugc.aweme.discover.mob.p1658a;

import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.a.g */
public class C28379g extends C23231d<C28379g> {

    /* renamed from: A */
    private String f74498A;

    /* renamed from: B */
    private String f74499B;

    /* renamed from: C */
    private String f74500C;

    /* renamed from: D */
    private String f74501D;

    /* renamed from: E */
    private String f74502E;

    /* renamed from: F */
    private Word f74503F;

    /* renamed from: a */
    public final String f74504a;

    /* renamed from: b */
    private String f74505b;

    /* renamed from: c */
    private String f74506c;

    /* renamed from: d */
    private String f74507d;

    /* renamed from: e */
    private Integer f74508e;

    public C28379g() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r1 == null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r1 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47948a() {
        /*
            r3 = this;
            java.lang.String r0 = "group_id"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r3.f74503F
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = r1.getId()
            if (r1 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r1 = r3.f74505b
        L_0x000e:
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "raw_query"
            java.lang.String r1 = r3.f74498A
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "search_id"
            java.lang.String r1 = r3.f74499B
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "impr_id"
            java.lang.String r1 = r3.f74500C
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "log_pb"
            java.lang.String r1 = r3.f74501D
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "rank"
            java.lang.String r1 = "-1"
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "words_content"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r3.f74503F
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r1.getWord()
            if (r1 != 0) goto L_0x004e
        L_0x004c:
            java.lang.String r1 = r3.f74506c
        L_0x004e:
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "words_source"
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r3.f74503F
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r1.getWordSource()
            if (r1 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String r1 = r3.f74507d
        L_0x0061:
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = "words_position"
            java.lang.Integer r1 = r3.f74508e
            if (r1 == 0) goto L_0x0076
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r1 != 0) goto L_0x0084
        L_0x0076:
            com.ss.android.ugc.aweme.discover.model.suggest.Word r1 = r3.f74503F
            if (r1 == 0) goto L_0x0083
            int r1 = r1.getWordPosition()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            com.ss.android.ugc.aweme.aq.d$a r2 = com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a.f62005a
            r3.mo48072a(r0, r1, r2)
            java.lang.String r0 = r3.f74502E
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0098
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r0 = 0
            goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "sug_type"
            java.lang.String r1 = r3.f74502E
            r3.mo48069a(r0, r1)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28379g.mo47948a():void");
    }

    /* renamed from: a */
    public final C28379g mo56802a(Word word) {
        this.f74503F = word;
        return this;
    }

    /* renamed from: b */
    public final C28379g mo56805b(String str) {
        this.f74506c = str;
        return this;
    }

    /* renamed from: c */
    public final C28379g mo56806c(String str) {
        this.f74498A = str;
        return this;
    }

    /* renamed from: d */
    public final C28379g mo56807d(String str) {
        this.f74500C = str;
        return this;
    }

    /* renamed from: e */
    public final C28379g mo56808e(String str) {
        this.f74501D = str;
        return this;
    }

    /* renamed from: f */
    public final C28379g mo56809f(String str) {
        this.f74502E = str;
        return this;
    }

    /* renamed from: a */
    public final C28379g mo56803a(Integer num) {
        this.f74508e = num;
        return this;
    }

    /* renamed from: a */
    public final C28379g mo56804a(String str) {
        this.f74507d = str;
        return this;
    }

    public C28379g(String str) {
        C52711k.m112240b(str, "event");
        super(str);
        this.f74504a = str;
        this.f74508e = Integer.valueOf(0);
    }

    public /* synthetic */ C28379g(String str, int i, C52707g gVar) {
        this("trending_words_show");
    }
}
