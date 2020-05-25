package com.p683ss.android.ugc.aweme.longvideonew;

import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.a */
public final class C36396a {

    /* renamed from: a */
    public final TextView f93206a;

    /* renamed from: b */
    public final Aweme f93207b;

    /* renamed from: a */
    private final long m82128a() {
        if (this.f93207b == null) {
            return 0;
        }
        AwemeStatistics statistics = this.f93207b.getStatistics();
        if (statistics == null) {
            return 0;
        }
        long commentCount = statistics.getCommentCount();
        if (this.f93207b.getAdCommentStruct() != null && commentCount > 0) {
            commentCount++;
        }
        return commentCount;
    }

    /* renamed from: b */
    private void m82129b() {
        if (this.f93206a != null) {
            if (C41626j.m91502b(this.f93207b) || C36330a.m81964a(this.f93207b)) {
                this.f93206a.setText("0");
            } else {
                this.f93206a.setText(C33095b.m76068a(m82128a()));
            }
        }
    }

    @C53771m
    public final void onCommentEvent(C25064a aVar) {
        C52711k.m112240b(aVar, "event");
        int i = aVar.f66393a;
        if (i == 3 || i == 4 || i == 8) {
            Object obj = aVar.f66394b;
            if (obj != null) {
                Object[] objArr = (Object[]) obj;
                if (objArr != null && objArr.length == 2) {
                    if (objArr[0] != null) {
                        m82129b();
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
            }
        }
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        String str;
        if (awVar != null && 14 == awVar.f79228a) {
            Object obj = awVar.f79229b;
            if (obj != null) {
                String str2 = (String) obj;
                Aweme aweme = this.f93207b;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (C9431p.m18665a(str, str2)) {
                    m82129b();
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    public C36396a(TextView textView, Aweme aweme) {
        AwemeStatistics awemeStatistics;
        C52711k.m112240b(textView, "mCommentCountView");
        this.f93206a = textView;
        this.f93207b = aweme;
        C47718bf.m103290c(this);
        this.f93206a.setVisibility(0);
        Aweme aweme2 = this.f93207b;
        if (aweme2 != null) {
            awemeStatistics = aweme2.getStatistics();
        } else {
            awemeStatistics = null;
        }
        if (awemeStatistics == null) {
            this.f93206a.setText("0");
        } else if (C41626j.m91502b(this.f93207b) || C36330a.m81964a(this.f93207b)) {
            this.f93206a.setText("0");
        } else {
            try {
                this.f93206a.setText(C33095b.m76068a(m82128a()));
            } catch (Exception unused) {
                this.f93206a.setText("0");
            }
        }
    }
}
