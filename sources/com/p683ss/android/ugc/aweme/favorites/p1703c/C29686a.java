package com.p683ss.android.ugc.aweme.favorites.p1703c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.favorites.c.a */
public final class C29686a extends C26851b<C26832a<BaseResponse>, C29689c> {

    /* renamed from: a */
    public int f77594a;

    /* renamed from: b */
    public int f77595b;

    /* renamed from: c */
    public String f77596c = "";

    /* renamed from: d */
    public boolean f77597d = true;

    public C29686a() {
        mo54799a(new C26832a<BaseResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                C0013i iVar;
                C29686a.this.f77595b = objArr[0].intValue();
                String str = objArr[1];
                C29686a.this.f77594a = objArr[2].intValue();
                switch (C29686a.this.f77595b) {
                    case 1:
                        iVar = UserFavoritesApi.f77586a.collectMusic(str, C29686a.this.f77594a);
                        break;
                    case 2:
                        iVar = UserFavoritesApi.f77586a.collectAweme(str, C29686a.this.f77594a);
                        break;
                    case 3:
                        iVar = UserFavoritesApi.f77586a.collectChallenge(str, C29686a.this.f77594a);
                        break;
                    case 4:
                        iVar = UserFavoritesApi.f77586a.collectPoi(str, C29686a.this.f77594a);
                        break;
                    case 5:
                        iVar = UserFavoritesApi.f77586a.collectMix(str, C29686a.this.f77594a);
                        break;
                    case 6:
                        iVar = UserFavoritesApi.f77586a.collectSeeding(str, C29686a.this.f77594a);
                        break;
                    default:
                        iVar = null;
                        break;
                }
                if (iVar == null) {
                    return false;
                }
                iVar.mo20a((C0011g<TResult, TContinuationResult>) new C29688b<TResult,TContinuationResult>(this), C0013i.f25b);
                return true;
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44838b() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.profile.b.i r0 = new com.ss.android.ugc.aweme.profile.b.i
            r0.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            int r0 = r4.f77595b
            r1 = 1
            r2 = 4
            if (r0 != r2) goto L_0x0017
            int r0 = r4.f77594a
            if (r0 != 0) goto L_0x0058
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            goto L_0x004e
        L_0x0017:
            int r0 = r4.f77595b
            r2 = 6
            r3 = 2
            if (r0 != r2) goto L_0x0026
            int r0 = r4.f77594a
            if (r0 != r3) goto L_0x0058
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            goto L_0x004e
        L_0x0026:
            int r0 = r4.f77595b
            if (r0 != r1) goto L_0x003e
            java.lang.String r0 = r4.f77596c
            java.lang.String r2 = "single_song"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r4.f77596c
            java.lang.String r2 = "similar_song"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0042
        L_0x003e:
            int r0 = r4.f77595b
            if (r0 != r3) goto L_0x0058
        L_0x0042:
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            int r2 = r4.f77594a
            if (r2 != r1) goto L_0x004e
            r2 = 2132541886(0x7f1c01be, float:2.0736861E38)
            goto L_0x0051
        L_0x004e:
            r2 = 2132541885(0x7f1c01bd, float:2.073686E38)
        L_0x0051:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21533a(r0, r2)
            r0.mo19066a()
        L_0x0058:
            com.ss.android.ugc.aweme.common.e r0 = r4.f70701g
            if (r0 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.common.a r0 = r4.f70700f
            if (r0 != 0) goto L_0x0062
            r0 = 0
            goto L_0x006a
        L_0x0062:
            com.ss.android.ugc.aweme.common.a r0 = r4.f70700f
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = (com.p683ss.android.ugc.aweme.base.api.BaseResponse) r0
        L_0x006a:
            com.ss.android.ugc.aweme.common.e r2 = r4.f70701g
            com.ss.android.ugc.aweme.favorites.c.c r2 = (com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c) r2
            r2.mo50568a(r0)
        L_0x0071:
            java.lang.String r0 = "collect"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r2 = "first_favourite_success"
            r3 = 0
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 != 0) goto L_0x008f
            int r0 = r4.f77594a
            if (r0 != r1) goto L_0x008f
            java.lang.String r0 = "collect"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r2 = "first_favourite_success"
            r0.storeBoolean(r2, r1)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a.mo44838b():void");
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        int i = this.f77595b;
        int i2 = R.string.wl;
        if (i == 5) {
            C23459a aVar = (C23459a) exc;
            if (aVar.getErrorCode() == 4) {
                C10691a.m21545b((Context) C11016e.m22312g(), aVar.getErrorMsg()).mo19066a();
            } else {
                Activity g = C11016e.m22312g();
                if (this.f77594a == 1) {
                    i2 = R.string.a48;
                }
                C10691a.m21542b((Context) g, i2).mo19066a();
            }
        } else {
            Activity g2 = C11016e.m22312g();
            if (this.f77594a == 1) {
                i2 = R.string.a48;
            }
            C10691a.m21542b((Context) g2, i2).mo19066a();
        }
        if (this.f70701g != null) {
            ((C29689c) this.f70701g).mo50570a(exc);
        }
    }
}
