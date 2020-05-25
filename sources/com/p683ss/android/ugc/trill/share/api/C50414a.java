package com.p683ss.android.ugc.trill.share.api;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.share.C42204k;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.api.a */
public final class C50414a extends C26851b<C26832a<AutoShare>, C42204k> {
    public C50414a() {
        mo54799a(new C26832a<AutoShare>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 10) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        String str3 = (String) objArr[2];
                        String str4 = (String) objArr[3];
                        String str5 = (String) objArr[4];
                        String str6 = (String) objArr[5];
                        String str7 = (String) objArr[6];
                        String str8 = (String) objArr[7];
                        String str9 = (String) objArr[8];
                        String str10 = (String) objArr[9];
                        HashMap hashMap = new HashMap();
                        hashMap.put("platform_type", str);
                        hashMap.put("share_url", str2);
                        hashMap.put("share_message", str3);
                        if (!TextUtils.isEmpty(str4)) {
                            hashMap.put("fb_access_token", str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            hashMap.put("twitter_access_token", str5);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            hashMap.put("access_token_secret", str6);
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            hashMap.put("youtube_code", str7);
                        }
                        if (!TextUtils.isEmpty(str8)) {
                            hashMap.put("item_id", str8);
                        }
                        if (!TextUtils.isEmpty(str9)) {
                            hashMap.put("youtube_title", str9);
                        }
                        if (!TextUtils.isEmpty(str10)) {
                            hashMap.put("youtube_desc", str10);
                        }
                        return (AutoShare) ShareApi.f126403a.autoShare(hashMap).execute().f33552b;
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        AutoShare autoShare;
        if (this.f70700f == null) {
            autoShare = null;
        } else {
            autoShare = (AutoShare) this.f70700f.getData();
        }
        if (autoShare != null && this.f70701g != null) {
            ((C42204k) this.f70701g).mo86074a();
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C42204k) this.f70701g).mo86075b();
        }
    }
}
