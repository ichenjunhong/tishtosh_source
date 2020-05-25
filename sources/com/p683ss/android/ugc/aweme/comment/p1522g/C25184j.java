package com.p683ss.android.ugc.aweme.comment.p1522g;

import com.bytedance.p125a.C2667b;
import com.p683ss.android.ugc.aweme.comment.list.C25258g;
import com.p683ss.android.ugc.aweme.comment.list.C25269r;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25224d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.vcd.C50503c;

/* renamed from: com.ss.android.ugc.aweme.comment.g.j */
public final class C25184j extends C26876b<C25182h> implements C25258g {

    /* renamed from: a */
    public boolean f66753a;

    /* renamed from: a */
    public final /* synthetic */ C26875a mo51438a() {
        return (C26875a) super.mo54803n();
    }

    /* renamed from: e */
    public final int mo51441e() {
        return ((CommentItemList) ((C25182h) mo54803n()).getData()).replyStyle;
    }

    /* renamed from: f */
    public final long mo51442f() {
        if (this.f70700f == null) {
            return 0;
        }
        return ((C25182h) this.f70700f).mo51436b();
    }

    /* renamed from: b */
    public final void mo44838b() {
        String str;
        StringBuilder sb = new StringBuilder("CommentFetchPresenter: onSuccess(): aid = ");
        if (this.f70700f == null) {
            str = null;
        } else {
            str = ((C25182h) this.f70700f).f66737b;
        }
        sb.append(str);
        sb.append(" logPb: impr_id = ");
        sb.append(m61228a((C25182h) this.f70700f));
        C2667b.m7667b("comment", "info", 0);
        this.f66753a = true;
        if (!(this.f70700f == null || ((C25182h) this.f70700f).getData() == null || !(this.f70701g instanceof C50503c))) {
            ((C50503c) this.f70701g).mo51917a(((CommentItemList) ((C25182h) this.f70700f).getData()).hasMore, ((CommentItemList) ((C25182h) this.f70700f).getData()).hotsoonHasMore, ((CommentItemList) ((C25182h) this.f70700f).getData()).hotsoonText);
        }
        super.mo44838b();
        if (this.f70700f != null) {
            C25224d.m61330a(((C25182h) this.f70700f).f66737b, ((C25182h) this.f70700f).mo51436b());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51440a(C26877c cVar) {
        super.mo54800a(cVar);
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        return super.mo44934a_(objArr);
    }

    /* renamed from: a */
    public final void mo51439a(C25269r rVar) {
        ((C25182h) mo54803n()).f66740e = rVar;
    }

    /* renamed from: a */
    private static String m61228a(C25182h hVar) {
        if (hVar == null || hVar.getData() == null || ((CommentItemList) hVar.getData()).logPd == null) {
            return null;
        }
        return ((CommentItemList) hVar.getData()).logPd.getImprId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* renamed from: c_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44840c_(java.lang.Exception r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CommentFetchPresenter: onFailed() => aid = "
            r0.<init>(r1)
            com.ss.android.ugc.aweme.common.a r1 = r10.f70700f
            r2 = 0
            if (r1 != 0) goto L_0x000e
            r1 = r2
            goto L_0x0014
        L_0x000e:
            com.ss.android.ugc.aweme.common.a r1 = r10.f70700f
            com.ss.android.ugc.aweme.comment.g.h r1 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25182h) r1
            java.lang.String r1 = r1.f66737b
        L_0x0014:
            r0.append(r1)
            java.lang.String r1 = " logPb: impr_id = "
            r0.append(r1)
            com.ss.android.ugc.aweme.common.a r1 = r10.f70700f
            com.ss.android.ugc.aweme.comment.g.h r1 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25182h) r1
            java.lang.String r1 = m61228a(r1)
            r0.append(r1)
            java.lang.String r1 = " exceptionType = "
            r0.append(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            int r1 = com.bytedance.ies.p621b.p622a.C10201a.m20660a(r1, r11)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r11.getMessage()
            r0.append(r1)
            java.lang.String r0 = "comment"
            java.lang.String r1 = "info"
            r3 = 0
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            int r4 = com.bytedance.ies.p621b.p622a.C10201a.m20660a(r4, r11)
            com.bytedance.p125a.C2667b.m7664a(r0, r1, r3, r4)
            com.ss.android.ugc.aweme.common.a r0 = r10.f70700f
            if (r0 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.common.a r0 = r10.f70700f
            com.ss.android.ugc.aweme.comment.g.h r0 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25182h) r0
            boolean r0 = r0.mo51435a()
            if (r0 == 0) goto L_0x00b3
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            boolean r0 = com.p683ss.android.ugc.aweme.comment.p1522g.C25185k.m61237a(r0)
            if (r0 == 0) goto L_0x00b3
            com.ss.android.ugc.aweme.common.a r0 = r10.f70700f
            com.ss.android.ugc.aweme.comment.g.h r0 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25182h) r0
            java.lang.String r3 = r0.f66738c
            com.ss.android.ugc.aweme.common.a r0 = r10.f70700f
            com.ss.android.ugc.aweme.comment.g.h r0 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25182h) r0
            java.lang.String r4 = r0.f66737b
            com.ss.android.ugc.aweme.common.a r0 = r10.f70700f
            com.ss.android.ugc.aweme.comment.g.h r0 = (com.p683ss.android.ugc.aweme.comment.p1522g.C25182h) r0
            long r5 = r0.f66741f
            com.ss.android.ugc.aweme.comment.i.c$a r0 = com.p683ss.android.ugc.aweme.comment.p1524i.C25209c.f66791e
            if (r11 == 0) goto L_0x008d
            java.lang.Class r0 = r11.getClass()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x008f
        L_0x008d:
            java.lang.String r0 = ""
        L_0x008f:
            r8 = r0
            if (r11 == 0) goto L_0x00a1
            java.lang.Throwable r0 = r11.getCause()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r2 = r0
            goto L_0x00a7
        L_0x00a1:
            if (r11 == 0) goto L_0x00a7
            java.lang.String r2 = r11.getMessage()
        L_0x00a7:
            if (r2 != 0) goto L_0x00ad
            java.lang.String r0 = ""
            r9 = r0
            goto L_0x00ae
        L_0x00ad:
            r9 = r2
        L_0x00ae:
            r7 = 201(0xc9, float:2.82E-43)
            com.p683ss.android.ugc.aweme.comment.p1524i.C25209c.C25210a.m61314a(r3, r4, r5, r7, r8, r9)
        L_0x00b3:
            r0 = 1
            r10.f66753a = r0
            super.mo44840c_(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1522g.C25184j.mo44840c_(java.lang.Exception):void");
    }
}
