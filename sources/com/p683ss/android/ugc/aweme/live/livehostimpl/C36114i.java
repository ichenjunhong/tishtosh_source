package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8794c.C8796b;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23515d.C23520a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.i */
public final class C36114i implements C8794c {
    public C36114i() {
        C4116c.m10251a(C8794c.class, this);
    }

    /* renamed from: a */
    public final void mo15491a(String str) {
        C23515d.m57687b(str);
    }

    /* renamed from: a */
    private static boolean m81506a(Uri uri) {
        return C23515d.m57680a(uri);
    }

    /* renamed from: b */
    public final String mo15495b(String str) {
        return C23515d.m57665a(str);
    }

    /* renamed from: a */
    public final boolean mo15493a(ImageModel imageModel) {
        if (imageModel == null) {
            return false;
        }
        List urls = imageModel.getUrls();
        if (urls == null || urls.isEmpty()) {
            return false;
        }
        int size = urls.size();
        for (int i = 0; i < size; i++) {
            if (m81506a(Uri.parse((String) urls.get(i)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String mo15494b(ImageModel imageModel) {
        if (imageModel == null) {
            return "";
        }
        List urls = imageModel.getUrls();
        if (urls == null || urls.isEmpty()) {
            return "";
        }
        int size = urls.size();
        for (int i = 0; i < size; i++) {
            if (m81506a(Uri.parse((String) urls.get(i)))) {
                return mo15495b((String) urls.get(i));
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo15492a(String str, final C8796b bVar) {
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        C23515d.m57667a(urlModel, (C23520a) new C23520a() {
            /* renamed from: a */
            public final void mo48679a(C13745c<C13715a<C14042c>> cVar) {
                bVar.mo14127b();
            }

            /* renamed from: a */
            public final void mo48680a(Exception exc) {
                bVar.mo14128c();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.host.C8794c.C8795a mo15490a(com.bytedance.android.live.base.model.ImageModel r8, final com.bytedance.android.livesdkapi.host.C8794c.C8797c r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.live.livehostimpl.i$1 r0 = new com.ss.android.ugc.aweme.live.livehostimpl.i$1
            r0.<init>(r9)
            r9 = 0
            if (r8 == 0) goto L_0x0065
            java.util.List r1 = r8.getUrls()
            if (r1 == 0) goto L_0x0065
            java.util.List r1 = r8.getUrls()
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0019
            goto L_0x0065
        L_0x0019:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r8 = r8.getUrls()
            java.util.Iterator r8 = r8.iterator()
        L_0x0026:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r3 != 0) goto L_0x0026
            android.net.Uri r2 = android.net.Uri.parse(r2)
            com.facebook.imagepipeline.o.c r2 = com.facebook.imagepipeline.p975o.C14232c.m29169a(r2)
            com.ss.android.ugc.aweme.live.ILiveHostOuterService r3 = com.p683ss.android.ugc.aweme.live.C36148r.m81573a()
            com.ss.android.ugc.aweme.live.ILiveHostOuterService r3 = (com.p683ss.android.ugc.aweme.live.ILiveHostOuterService) r3
            r3.monitorImageNetwork(r2)
            com.facebook.imagepipeline.o.b r2 = r2.mo26449a()
            r1.add(r2)
            goto L_0x0026
        L_0x0051:
            int r8 = r1.size()
            if (r8 != 0) goto L_0x0058
            goto L_0x0065
        L_0x0058:
            int r8 = r1.size()
            com.facebook.imagepipeline.o.b[] r8 = new com.facebook.imagepipeline.p975o.C14229b[r8]
            java.lang.Object[] r8 = r1.toArray(r8)
            com.facebook.imagepipeline.o.b[] r8 = (com.facebook.imagepipeline.p975o.C14229b[]) r8
            goto L_0x0066
        L_0x0065:
            r8 = r9
        L_0x0066:
            if (r8 == 0) goto L_0x009f
            int r1 = r8.length
            if (r1 != 0) goto L_0x006c
            goto L_0x009f
        L_0x006c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r8.length
            r3 = 0
        L_0x0073:
            if (r3 >= r2) goto L_0x0089
            r4 = r8[r3]
            if (r4 == 0) goto L_0x0086
            com.facebook.imagepipeline.e.h r5 = com.facebook.drawee.p930a.p931a.C13771c.m27875c()
            com.facebook.imagepipeline.o.b$b r6 = com.facebook.imagepipeline.p975o.C14229b.C14231b.FULL_FETCH
            com.facebook.common.d.k r4 = r5.mo26181a(r4, r9, r6)
            r1.add(r4)
        L_0x0086:
            int r3 = r3 + 1
            goto L_0x0073
        L_0x0089:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L_0x0090
            goto L_0x009f
        L_0x0090:
            com.facebook.d.f r8 = com.facebook.p929d.C13749f.m27821a(r1)
            com.facebook.d.c r8 = r8.mo23157b()
            com.facebook.common.b.i r1 = com.facebook.common.p918b.C13670i.m27623a()
            r8.mo25666a(r0, r1)
        L_0x009f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.livehostimpl.C36114i.mo15490a(com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.livesdkapi.host.c$c):com.bytedance.android.livesdkapi.host.c$a");
    }
}
