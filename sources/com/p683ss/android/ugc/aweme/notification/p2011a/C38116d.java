package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.a.d */
public final class C38116d extends BaseMovementMethod {

    /* renamed from: a */
    public static final C52668f f97008a = C52732g.m112285a(C38118b.f97011a);

    /* renamed from: b */
    public static final C38117a f97009b = new C38117a(null);

    /* renamed from: com.ss.android.ugc.aweme.notification.a.d$a */
    public static final class C38117a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f97010a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38117a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/notification/adapter/ClickableMovementMethod;"))};

        private C38117a() {
        }

        public /* synthetic */ C38117a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.a.d$b */
    static final class C38118b extends C52712l implements C52670a<C38116d> {

        /* renamed from: a */
        public static final C38118b f97011a = new C38118b();

        C38118b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C38116d();
        }
    }

    public final boolean canSelectArbitrarily() {
        return false;
    }

    public final void initialize(TextView textView, Spannable spannable) {
        C52711k.m112240b(textView, "widget");
        C52711k.m112240b(spannable, "text");
        Selection.removeSelection(spannable);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z;
        C52711k.m112240b(textView, "widget");
        C52711k.m112240b(spannable, "buffer");
        C52711k.m112240b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
            int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            C52711k.m112236a((Object) clickableSpanArr, "link");
            if (clickableSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (actionMasked == 1) {
                    clickableSpanArr[0].onClick(textView);
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return false;
    }
}
