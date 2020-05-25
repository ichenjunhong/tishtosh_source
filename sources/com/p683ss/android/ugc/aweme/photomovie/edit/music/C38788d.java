package com.p683ss.android.ugc.aweme.photomovie.edit.music;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.p1591c.C26856a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.p2425e.C48551b;
import com.p683ss.android.ugc.p2425e.C48557d;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.music.d */
final /* synthetic */ class C38788d implements OnClickListener {

    /* renamed from: a */
    private final C38784b f98700a;

    /* renamed from: b */
    private final int f98701b;

    C38788d(C38784b bVar, int i) {
        this.f98700a = bVar;
        this.f98701b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C38784b bVar = this.f98700a;
        if (C38782b.this.f98689a != this.f98701b) {
            if (((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98687d == 1) {
                C38782b.this.mo78745a(bVar.f98694b);
                bVar.mo78747a();
            } else if (((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98687d != 0) {
                String str = ((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98685b;
                if (!TextUtils.isEmpty(str)) {
                    ((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98687d = 0;
                    bVar.mo78748b();
                    int i = bVar.f98694b;
                    if (!TextUtils.isEmpty(str)) {
                        String b = C48551b.m105020b(((C38781a) C38782b.this.f98690b.get(bVar.f98694b)).f98685b);
                        C39629l.m88232a().mo58581l().downloadFile(str, C48557d.m105031a().mo96062b(), b, new C26856a(i, str) {

                            /* renamed from: a */
                            final /* synthetic */ int f98696a;

                            /* renamed from: b */
                            final /* synthetic */ String f98697b;

                            /* renamed from: a */
                            public final void mo54811a(String str, String str2) {
                                ((C38781a) C38782b.this.f98690b.get(this.f98696a)).f98687d = 1;
                                C38782b.this.mo78745a(this.f98696a);
                                C18842a.m45934b(new C38789e(C38784b.this));
                                C23569o.m57776a("photomovie_edit_music_download_error_rate", 0, C23088c.m56631a().mo47819a("tools_use_downloader", Boolean.valueOf(true)).mo47824a("url", str).mo47825b());
                            }

                            {
                                this.f98696a = r2;
                                this.f98697b = r3;
                            }

                            /* renamed from: a */
                            public final void mo54810a(Exception exc, String str, Integer num) {
                                ((C38781a) C38782b.this.f98690b.get(this.f98696a)).f98687d = 2;
                                C18842a.m45934b(new C38790f(C38782b.this));
                                C23569o.m57776a("photomovie_edit_music_download_error_rate", 1, C23088c.m56631a().mo47819a("tools_use_downloader", Boolean.valueOf(true)).mo47824a("url", this.f98697b).mo47825b());
                            }
                        });
                    }
                }
            }
        }
    }
}
