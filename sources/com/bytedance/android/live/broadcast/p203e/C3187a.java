package com.bytedance.android.live.broadcast.p203e;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.broadcast.p198b.C3072h;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.p619a.C10176b;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.e.a */
public final class C3187a extends C10176b<C3188a> implements C9382a {

    /* renamed from: i */
    private static final Spannable f9238i = new SpannableString("");

    /* renamed from: a */
    String f9239a;

    /* renamed from: b */
    public long f9240b;

    /* renamed from: c */
    public C9381g f9241c;

    /* renamed from: d */
    public int f9242d = 1;

    /* renamed from: e */
    public boolean f9243e;

    /* renamed from: f */
    int f9244f;

    /* renamed from: g */
    int f9245g;

    /* renamed from: h */
    public C3072h f9246h;

    /* renamed from: j */
    private int f9247j = 10;

    /* renamed from: k */
    private String f9248k;

    /* renamed from: l */
    private C1690c f9249l;

    /* renamed from: com.bytedance.android.live.broadcast.e.a$a */
    public interface C3188a extends C10175a {
        /* renamed from: a */
        void mo8433a(CharSequence charSequence);

        /* renamed from: a */
        void mo8435a(boolean z);

        /* renamed from: a */
        void mo8436a(boolean z, CharSequence charSequence, CharSequence charSequence2);

        /* renamed from: a */
        void mo8437a(boolean z, CharSequence charSequence, String str);

        /* renamed from: a */
        void mo8438a(boolean z, String str);

        /* renamed from: b */
        void mo8439b(CharSequence charSequence);

        /* renamed from: g */
        void mo8447g();

        /* renamed from: h */
        void mo8448h();

        /* renamed from: i */
        void mo8449i();
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        this.f9241c.removeMessages(1);
        this.f9241c.removeMessages(2);
    }

    /* renamed from: b */
    public final void mo8532b() {
        if (mo8518c() != null) {
            ((C3188a) mo8518c()).mo8447g();
            ((C4193l) C4116c.m10249a(C4193l.class)).roomManager().mo9629a((Handler) this.f9241c, this.f9240b);
        }
    }

    /* renamed from: e */
    public final void mo8534e() {
        this.f9241c.removeMessages(1);
        this.f9241c.removeMessages(2);
        this.f9242d = 1;
        if (this.f9249l != null) {
            this.f9249l.dispose();
            this.f9249l = null;
        }
        if (mo8518c() != null) {
            ((C3188a) mo8518c()).mo8435a(false);
            this.f9243e = false;
            ((C3188a) mo8518c()).mo8436a(false, (CharSequence) null, (CharSequence) null);
        }
        if (this.f9246h != null) {
            this.f9246h.dismiss();
        }
    }

    /* renamed from: d */
    public void mo8533d() {
        SpannableString spannableString;
        if (mo8518c() != null) {
            String a = C3922z.m9903a((int) R.string.eux);
            if (this.f9244f <= 1) {
                spannableString = new SpannableString(C3922z.m9903a((int) R.string.eet));
            } else {
                SpannableString spannableString2 = new SpannableString(C4604n.m11051a(Locale.CHINA, C3922z.m9903a((int) R.string.es5), Integer.valueOf(this.f9245g)));
                spannableString2.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.ah3)), 4, String.valueOf(this.f9245g).length() + 4, 18);
                spannableString = spannableString2;
            }
            ((C3188a) mo8518c()).mo8436a(true, (CharSequence) a, (CharSequence) spannableString);
        }
    }

    /* renamed from: b */
    private static CharSequence m8805b(C7861cb cbVar) {
        C5115z.m11756a(cbVar.f21741d, "");
        return C3922z.m9903a((int) R.string.eex);
    }

    /* renamed from: c */
    private static CharSequence m8806c(C7861cb cbVar) {
        Spannable spannable = f9238i;
        C5115z.m11756a(cbVar.f21742e, "");
        if (cbVar.supportDisplayText()) {
            spannable = C5115z.m11756a(cbVar.baseMessage.f24139j, "");
        }
        if (spannable != f9238i || TextUtils.isEmpty(cbVar.f21738a)) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C3922z.m9903a((int) R.string.f2s));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.ah3)), 8, spannableStringBuilder.length(), 33);
        StringBuilder sb = new StringBuilder();
        sb.append(C3922z.m9903a((int) R.string.eu8));
        sb.append(cbVar.f21738a);
        sb.append("\n");
        spannableStringBuilder.insert(0, sb.toString());
        return spannableStringBuilder;
    }

    public final void handleMsg(Message message) {
        if (mo8518c() != null && this.f9242d != 1) {
            int i = message.what;
            if (i != 25) {
                switch (i) {
                    case 1:
                        ((C3188a) mo8518c()).mo8449i();
                        return;
                    case 2:
                        C3395f.m9156f().mo8742c().mo9020c().getReviewInfo(this.f9240b).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3193f<Object>(this), (C1710e<? super Throwable>) new C3194g<Object>(this));
                        break;
                }
                return;
            }
            if ((message.obj instanceof C2944a) && mo8518c() != null) {
                mo8534e();
            }
        }
    }

    /* renamed from: a */
    public final void mo8531a(C7861cb cbVar) {
        if (mo8518c() != null && cbVar != null) {
            if (2 == cbVar.f21739b && this.f9242d == 1) {
                this.f9242d = 2;
                this.f9247j = 10;
                this.f9248k = cbVar.f21738a;
                ((C3188a) mo8518c()).mo8433a(m8805b(cbVar));
                ((C3188a) mo8518c()).mo8439b(m8806c(cbVar));
                String a = C4604n.m11051a(Locale.CHINA, this.f9239a, Integer.valueOf(this.f9247j));
                ((C3188a) mo8518c()).mo8437a(false, (CharSequence) null, (String) null);
                ((C3188a) mo8518c()).mo8438a(false, a);
                ((C3188a) mo8518c()).mo8435a(true);
                this.f9241c.sendEmptyMessageDelayed(1, 600000);
                if (this.f9249l == null || this.f9249l.isDisposed()) {
                    this.f9249l = C4585b.m11015a(0, 10, 1000, 1000, TimeUnit.MILLISECONDS).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6516a((C1706a) new C3189b(this)).mo6545f((C1710e<? super T>) new C3190c<Object>(this));
                }
                return;
            }
            if (3 == cbVar.f21739b && this.f9242d != 1) {
                if (mo8518c() != null) {
                    ((C3188a) mo8518c()).mo8448h();
                }
                mo8534e();
            }
        }
    }

    public C3187a(long j, Context context) {
        this.f9240b = j;
        this.f9241c = new C9381g(this);
        StringBuilder sb = new StringBuilder();
        sb.append(C3922z.m9903a((int) R.string.eev));
        sb.append("（%ds）");
        this.f9239a = sb.toString();
    }
}
