package com.p683ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import android.util.Log;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.p683ss.android.ugc.aweme.music.api.MusicDetailApi.DetailApi;
import com.p683ss.android.ugc.aweme.music.model.MusicDetail;
import com.p683ss.android.ugc.aweme.music.presenter.C37424s;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.o */
public class C37416o<V extends C37424s> extends C26851b<C26832a<MusicDetail>, V> {
    public C37416o() {
        mo54799a(new C26832a<MusicDetail>() {
            public final boolean checkParams(Object... objArr) {
                return objArr != null;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length > 0 && TextUtils.isEmpty(objArr[0])) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String stackTraceString = Log.getStackTraceString(new Throwable());
                        if (stackTraceString.length() > 1024) {
                            stackTraceString = stackTraceString.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
                        }
                        jSONObject.put("error_stack", stackTraceString);
                    } catch (Exception unused) {
                    }
                    C23569o.m57779a("music_id_empty", jSONObject);
                }
                C23566n.f62684b.mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        if (objArr.length <= 2 || ((Integer) objArr[2]).intValue() != 1) {
                            String str = (String) objArr[0];
                            int intValue = ((Integer) objArr[1]).intValue();
                            DetailApi detailApi = MusicDetailApi.f95247a;
                            if (str != null) {
                                str = str.trim();
                            }
                            return (MusicDetail) detailApi.queryMusic(str, intValue).get();
                        }
                        return (MusicDetail) MusicDetailApi.f95247a.queryPartnerMusic((String) objArr[0], (String) objArr[1]).get();
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public void mo44838b() {
        if (this.f70701g != null && this.f70700f != null) {
            ((C37424s) this.f70701g).mo74299a((MusicDetail) this.f70700f.getData());
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C37424s) this.f70701g).mo74300d_(exc);
        }
    }
}
