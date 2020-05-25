package com.p683ss.android.ugc.aweme.comment;

import android.support.p030v4.content.C0726c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.comment.list.C25260i;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25162a;
import com.p683ss.android.ugc.aweme.p1632di.C27604ar;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.o */
public final class C25273o implements C25260i {

    /* renamed from: a */
    static final Map<String, C25274a> f66858a = new HashMap();

    /* renamed from: b */
    public static final C25273o f66859b = new C25273o();

    /* renamed from: com.ss.android.ugc.aweme.comment.o$a */
    public static final class C25274a {

        /* renamed from: a */
        public final int f66860a;

        /* renamed from: b */
        public final Comment f66861b;

        /* renamed from: c */
        public final int f66862c;

        /* renamed from: d */
        public final C25162a f66863d;

        /* renamed from: e */
        public final int f66864e;

        /* renamed from: f */
        public final Comment f66865f;

        public C25274a() {
            this(0, null, 0, null, 0, null, 63, null);
        }

        /* renamed from: a */
        private static C25274a m61488a(int i, Comment comment, int i2, C25162a aVar, int i3, Comment comment2) {
            C25274a aVar2 = new C25274a(i, comment, i2, aVar, i3, comment2);
            return aVar2;
        }

        /* renamed from: a */
        public static /* synthetic */ C25274a m61489a(C25274a aVar, int i, Comment comment, int i2, C25162a aVar2, int i3, Comment comment2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = aVar.f66860a;
            }
            if ((i4 & 2) != 0) {
                comment = aVar.f66861b;
            }
            Comment comment3 = comment;
            if ((i4 & 4) != 0) {
                i2 = aVar.f66862c;
            }
            int i5 = i2;
            if ((i4 & 8) != 0) {
                aVar2 = aVar.f66863d;
            }
            C25162a aVar3 = aVar2;
            if ((i4 & 16) != 0) {
                i3 = aVar.f66864e;
            }
            int i6 = i3;
            if ((i4 & 32) != 0) {
                comment2 = aVar.f66865f;
            }
            return m61488a(i, comment3, i5, aVar3, i6, comment2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommentPostingStatus(status=");
            sb.append(this.f66860a);
            sb.append(", comment=");
            sb.append(this.f66861b);
            sb.append(", position=");
            sb.append(this.f66862c);
            sb.append(", params=");
            sb.append(this.f66863d);
            sb.append(", requestType=");
            sb.append(this.f66864e);
            sb.append(", replyComment=");
            sb.append(this.f66865f);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = this.f66860a * 31;
            Comment comment = this.f66861b;
            int i4 = 0;
            if (comment != null) {
                i = comment.hashCode();
            } else {
                i = 0;
            }
            int i5 = (((i3 + i) * 31) + this.f66862c) * 31;
            C25162a aVar = this.f66863d;
            if (aVar != null) {
                i2 = aVar.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((i5 + i2) * 31) + this.f66864e) * 31;
            Comment comment2 = this.f66865f;
            if (comment2 != null) {
                i4 = comment2.hashCode();
            }
            return i6 + i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25274a)) {
                return false;
            }
            C25274a aVar = (C25274a) obj;
            if (this.f66860a == aVar.f66860a && !(!C52711k.m112239a((Object) this.f66861b, (Object) aVar.f66861b)) && this.f66862c == aVar.f66862c && !(!C52711k.m112239a((Object) this.f66863d, (Object) aVar.f66863d)) && this.f66864e == aVar.f66864e && !(!C52711k.m112239a((Object) this.f66865f, (Object) aVar.f66865f))) {
                return true;
            }
            return false;
        }

        private C25274a(int i, Comment comment, int i2, C25162a aVar, int i3, Comment comment2) {
            this.f66860a = i;
            this.f66861b = comment;
            this.f66862c = i2;
            this.f66863d = aVar;
            this.f66864e = i3;
            this.f66865f = comment2;
        }

        public /* synthetic */ C25274a(int i, Comment comment, int i2, C25162a aVar, int i3, Comment comment2, int i4, C52707g gVar) {
            int i5;
            Comment comment3;
            int i6;
            C25162a aVar2;
            Comment comment4;
            int i7 = -1;
            if ((i4 & 1) != 0) {
                i5 = -1;
            } else {
                i5 = i;
            }
            if ((i4 & 2) != 0) {
                comment3 = null;
            } else {
                comment3 = comment;
            }
            if ((i4 & 4) != 0) {
                i6 = -1;
            } else {
                i6 = i2;
            }
            if ((i4 & 8) != 0) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            if ((i4 & 16) == 0) {
                i7 = i3;
            }
            if ((i4 & 32) != 0) {
                comment4 = null;
            } else {
                comment4 = comment2;
            }
            this(i5, comment3, i6, aVar2, i7, comment4);
        }
    }

    private C25273o() {
    }

    /* renamed from: b */
    public static C25260i m61473b() {
        if (C27991b.f73428L == null) {
            synchronized (C25260i.class) {
                if (C27991b.f73428L == null) {
                    C27991b.f73428L = C27604ar.m66284c();
                }
            }
        }
        return (C25260i) C27991b.f73428L;
    }

    /* renamed from: a */
    public static String m61470a() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(UUID.randomUUID());
        return sb.toString();
    }

    /* renamed from: g */
    public final void mo51552g(Comment comment) {
        if (comment != null) {
            f66858a.remove(comment.getFakeId());
        }
    }

    /* renamed from: e */
    public final boolean mo51550e(Comment comment) {
        if (comment == null) {
            return false;
        }
        C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
        if (aVar == null || aVar.f66860a != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final int mo51553h(Comment comment) {
        if (comment == null) {
            return -1;
        }
        C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f66862c;
        }
        return -1;
    }

    /* renamed from: i */
    public final int mo51554i(Comment comment) {
        if (comment == null) {
            return -1;
        }
        C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f66864e;
        }
        return -1;
    }

    /* renamed from: k */
    public final Comment mo51556k(Comment comment) {
        if (comment == null) {
            return null;
        }
        C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f66865f;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51548c(com.p683ss.android.ugc.aweme.comment.model.Comment r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.o$a r12 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.o$a r12 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.mo51548c(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51549d(com.p683ss.android.ugc.aweme.comment.model.Comment r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.o$a r12 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.o$a r12 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.mo51549d(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51551f(com.p683ss.android.ugc.aweme.comment.model.Comment r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            com.ss.android.ugc.aweme.comment.o$a r12 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.o$a r12 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            r10 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.mo51551f(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    /* renamed from: b */
    public static boolean m61475b(Comment comment) {
        if (comment == null) {
            return false;
        }
        C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
        if (aVar == null || aVar.f66860a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo51555j(Comment comment) {
        boolean z;
        if (comment != null) {
            C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
            if (aVar != null) {
                Comment comment2 = aVar.f66861b;
                CharSequence replyToUserId = comment.getReplyToUserId();
                boolean z2 = false;
                if (replyToUserId == null || replyToUserId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && comment2 != null) {
                    CharSequence replyToUserId2 = comment2.getReplyToUserId();
                    if (replyToUserId2 == null || replyToUserId2.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        comment.setReplyToUserId(comment2.getReplyToUserId());
                    }
                }
                Map<String, C25274a> map = f66858a;
                String fakeId = comment.getFakeId();
                C52711k.m112236a((Object) fakeId, "comment.fakeId");
                map.put(fakeId, C25274a.m61489a(aVar, 0, comment, 0, null, 0, null, 61, null));
                return;
            }
            Map<String, C25274a> map2 = f66858a;
            String fakeId2 = comment.getFakeId();
            C52711k.m112236a((Object) fakeId2, "comment.fakeId");
            C25274a aVar2 = new C25274a(0, comment, 0, null, 0, null, 61, null);
            map2.put(fakeId2, aVar2);
        }
    }

    /* renamed from: a */
    public final boolean mo51547a(Comment comment) {
        if (comment == null) {
            return false;
        }
        C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
        if (aVar == null) {
            return false;
        }
        int i = aVar.f66860a;
        if (1 <= i && 3 >= i && aVar.f66862c >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m61471a(Comment comment, DmtTextView dmtTextView) {
        if (comment != null && dmtTextView != null) {
            C25274a aVar = (C25274a) f66858a.get(comment.getFakeId());
            if (aVar == null || aVar.f66860a != 2) {
                dmtTextView.setVisibility(8);
                return;
            }
            dmtTextView.setVisibility(0);
            dmtTextView.setTextColor(C0726c.m2098c(C11010c.m22280a(), R.color.ja));
            dmtTextView.setText(R.string.a9i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r11 == null) goto L_0x002c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m61474b(com.p683ss.android.ugc.aweme.comment.model.Comment r11, int r12) {
        /*
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r11.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r11 = r11.getFakeId()
            java.lang.Object r11 = r2.get(r11)
            r2 = r11
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 47
            r10 = 0
            r7 = r12
            com.ss.android.ugc.aweme.comment.o$a r11 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.o$a r11 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 47
            r10 = 0
            r2 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.m61474b(com.ss.android.ugc.aweme.comment.model.Comment, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r11 == null) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m61472a(com.p683ss.android.ugc.aweme.comment.model.Comment r11, com.p683ss.android.ugc.aweme.comment.p1521f.C25162a r12) {
        /*
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            if (r11 != 0) goto L_0x0008
            return
        L_0x0008:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r11.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r11 = r11.getFakeId()
            java.lang.Object r11 = r2.get(r11)
            r2 = r11
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x0031
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 55
            r10 = 0
            r6 = r12
            com.ss.android.ugc.aweme.comment.o$a r11 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x0040
        L_0x0031:
            com.ss.android.ugc.aweme.comment.o$a r11 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 55
            r10 = 0
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0040:
            r0.put(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.m61472a(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.f.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51545a(com.p683ss.android.ugc.aweme.comment.model.Comment r12, int r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 59
            r10 = 0
            r5 = r13
            com.ss.android.ugc.aweme.comment.o$a r12 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.o$a r12 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 59
            r10 = 0
            r2 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.mo51545a(com.ss.android.ugc.aweme.comment.model.Comment, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r12 == null) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51546a(com.p683ss.android.ugc.aweme.comment.model.Comment r12, com.p683ss.android.ugc.aweme.comment.model.Comment r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r0 = f66858a
            java.lang.String r1 = r12.getFakeId()
            java.lang.String r2 = "comment.fakeId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.o$a> r2 = f66858a
            java.lang.String r12 = r12.getFakeId()
            java.lang.Object r12 = r2.get(r12)
            r2 = r12
            com.ss.android.ugc.aweme.comment.o$a r2 = (com.p683ss.android.ugc.aweme.comment.C25273o.C25274a) r2
            if (r2 == 0) goto L_0x002c
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 31
            r10 = 0
            r8 = r13
            com.ss.android.ugc.aweme.comment.o$a r12 = com.p683ss.android.ugc.aweme.comment.C25273o.C25274a.m61489a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003b
        L_0x002c:
            com.ss.android.ugc.aweme.comment.o$a r12 = new com.ss.android.ugc.aweme.comment.o$a
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 31
            r10 = 0
            r2 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x003b:
            r0.put(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.C25273o.mo51546a(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.model.Comment):void");
    }
}
