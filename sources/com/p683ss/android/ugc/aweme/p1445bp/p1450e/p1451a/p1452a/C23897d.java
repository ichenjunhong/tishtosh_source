package com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.p1452a;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.e.a.a.d */
public final class C23897d extends C23895b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo49501a() {
        String str;
        String str2;
        PhotoMovieContext photoMovieContext = this.f63565a.f76145c;
        String str3 = null;
        if (photoMovieContext != null) {
            str = photoMovieContext.mFinalVideoTmpPath;
        } else {
            str = null;
        }
        long a = m58613a(str) + 0;
        PhotoMovieContext photoMovieContext2 = this.f63565a.f76145c;
        if (photoMovieContext2 != null) {
            str2 = photoMovieContext2.mOutputVideoPath;
        } else {
            str2 = null;
        }
        long a2 = a + m58613a(str2);
        PhotoMovieContext photoMovieContext3 = this.f63565a.f76145c;
        if (photoMovieContext3 != null) {
            str3 = photoMovieContext3.mInputAudioPath;
        }
        return a2 + m58613a(str3);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo49502b() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.draft.model.c r0 = r6.f63565a
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r0.f76145c
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.mMusicPath
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            long r2 = m58613a(r0)
            r4 = 0
            long r2 = r2 + r4
            com.ss.android.ugc.aweme.draft.model.c r0 = r6.f63565a
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r0.f76145c
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.mFilterPath
            if (r0 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r0 = ""
        L_0x001e:
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.bp.e.b.a.b r4 = new com.ss.android.ugc.aweme.bp.e.b.a.b
            r5 = 3
            r4.<init>(r1, r1, r5, r1)
            com.ss.android.ugc.aweme.bp.e.b.a r1 = new com.ss.android.ugc.aweme.bp.e.b.a
            r1.<init>()
            r5 = r4
            com.ss.android.ugc.aweme.bp.e.b.a.c r5 = (com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1453b.p1454a.C23905c) r5
            r1.mo49505a(r5)
            r1.mo49507a(r0)
            long r0 = r4.f63571a
            long r2 = r2 + r0
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.p1452a.C23897d.mo49502b():long");
    }

    public C23897d(C29059c cVar) {
        C52711k.m112240b(cVar, "draft");
        super(cVar);
    }
}
