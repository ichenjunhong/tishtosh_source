package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class CountDownTextView extends TextView {

    /* renamed from: a */
    public C8455a f22995a;

    /* renamed from: b */
    private C1690c f22996b;

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$a */
    public static abstract class C8455a {
        /* renamed from: a */
        public void mo13470a(TextView textView) {
            C52711k.m112240b(textView, "view");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$b */
    static final class C8456b<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ CountDownTextView f22997a;

        /* renamed from: b */
        final /* synthetic */ int f22998b;

        /* renamed from: c */
        final /* synthetic */ long f22999c;

        /* renamed from: d */
        final /* synthetic */ long f23000d;

        C8456b(CountDownTextView countDownTextView, int i, long j, long j2) {
            this.f22997a = countDownTextView;
            this.f22998b = i;
            this.f22999c = j;
            this.f23000d = j2;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            if (!(l == null || l.longValue() != 0 || this.f22997a.f22995a == null)) {
                C52711k.m112240b(this.f22997a, "view");
            }
            CountDownTextView countDownTextView = this.f22997a;
            Resources resources = this.f22997a.getResources();
            int i = this.f22998b;
            long j = this.f22999c;
            C52711k.m112236a((Object) l, "aLong");
            countDownTextView.setText(resources.getString(i, new Object[]{C4574am.m10978a(j - l.longValue())}));
            if (this.f22997a.f22995a != null) {
                TextView textView = this.f22997a;
                long j2 = this.f22999c;
                l.longValue();
                C52711k.m112240b(textView, "view");
            }
            if (l.longValue() == this.f22999c - this.f23000d) {
                C8455a aVar = this.f22997a.f22995a;
                if (aVar != null) {
                    aVar.mo13470a(this.f22997a);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$c */
    static final class C8457c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C8457c f23001a = new C8457c();

        C8457c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public CountDownTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1690c cVar = this.f22996b;
        if (cVar != null && !cVar.isDisposed()) {
            C1690c cVar2 = this.f22996b;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
    }

    public final void setCountDownListener(C8455a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f22995a = aVar;
    }

    public CountDownTextView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo14703a(int i, long j, long j2) {
        long j3 = (j - 0) + 1;
        if (j3 > 0) {
            C2201v a = C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b(j3).mo6514a(C1667a.m5940a());
            C8456b bVar = new C8456b(this, R.string.ei9, j, 0);
            this.f22996b = a.mo6505a((C1710e<? super T>) bVar, (C1710e<? super Throwable>) C8457c.f23001a);
        }
    }

    public /* synthetic */ CountDownTextView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
