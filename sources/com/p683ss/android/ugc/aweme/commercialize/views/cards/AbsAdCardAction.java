package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction */
public abstract class AbsAdCardAction extends AbsHalfWebPageAction {

    /* renamed from: a */
    protected int f70309a;

    /* renamed from: i */
    private int f70310i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$a */
    public static class C26685a {

        /* renamed from: a */
        int f70311a;

        public C26685a(int i) {
            this.f70311a = i;
        }
    }

    /* renamed from: a */
    public void mo54506a(C26690d dVar) {
    }

    /* renamed from: a */
    public final boolean mo54507a() {
        if (this.f70310i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
    }

    /* access modifiers changed from: 0000 */
    public void onCreate() {
        boolean z;
        super.onCreate();
        C47718bf.m103290c(this);
        CardStruct s = C26512f.m64076s(this.f70314c);
        if (s == null || 4 == s.getCardType()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f70309a = R.drawable.aim;
        }
        this.f70315d.mo54556a(this.f70309a);
    }

    @C53771m
    public void onEvent(C26690d dVar) {
        if (this.f70315d.mo54564f() != null && this.f70315d.mo54564f().hashCode() == dVar.f70337d) {
            this.f70310i = dVar.f70334a;
            StringBuilder sb = new StringBuilder("render success: ");
            sb.append(mo54507a());
            mo54519c(sb.toString());
            mo54506a(dVar);
            if (dVar.f70336c == 1) {
                if (mo54507a()) {
                    C26072c.m63171a(this.f70314c, 0);
                    return;
                }
                C26072c.m63171a(this.f70314c, 1);
            }
        }
    }

    public AbsAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
    }
}
