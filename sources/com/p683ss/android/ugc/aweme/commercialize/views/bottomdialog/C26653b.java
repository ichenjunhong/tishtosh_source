package com.p683ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26427bl;
import com.p683ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b */
public final class C26653b extends C26652a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f70252a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26653b.class), "mDatePickerView", "getMDatePickerView()Lcom/ss/android/ugc/aweme/common/widget/datepicker/DatePicker;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26653b.class), "mConfirmView", "getMConfirmView()Lcom/ss/android/ugc/aweme/commercialize/views/bottomdialog/AdBottomDialogConfirmView;"))};

    /* renamed from: d */
    public static final C26655b f70253d = new C26655b(null);

    /* renamed from: b */
    public C26654a f70254b;

    /* renamed from: c */
    public final C26656c f70255c;

    /* renamed from: e */
    private final C52668f f70256e = C52732g.m112285a(new C26661g(this));

    /* renamed from: f */
    private final C52668f f70257f = C52732g.m112285a(new C26660f(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$a */
    public interface C26654a {
        /* renamed from: a */
        void mo54334a();

        /* renamed from: a */
        void mo54335a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$b */
    public static final class C26655b {
        private C26655b() {
        }

        public /* synthetic */ C26655b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$c */
    public static final class C26656c {

        /* renamed from: a */
        public String f70258a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$c$a */
        public static final class C26657a extends C26427bl<C26656c> {
            public C26657a() {
                super(new C26656c(null, 1, null));
            }
        }

        private C26656c(String str) {
            this.f70258a = str;
        }

        /* synthetic */ C26656c(String str, int i, C52707g gVar) {
            this(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$d */
    static final class C26658d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26653b f70259a;

        C26658d(C26653b bVar) {
            this.f70259a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DatePicker b = this.f70259a.mo42942b();
            if (b != null) {
                C26654a aVar = this.f70259a.f70254b;
                if (aVar != null) {
                    Locale locale = Locale.CHINA;
                    C52711k.m112236a((Object) locale, "Locale.CHINA");
                    String a = C2240a.m6773a(locale, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(b.getYear()), Integer.valueOf(b.getMonth()), Integer.valueOf(b.getDayOfMonth())}, 3));
                    C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                    aVar.mo54335a(a);
                }
                this.f70259a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$e */
    static final class C26659e implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C26653b f70260a;

        C26659e(C26653b bVar) {
            this.f70260a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C26654a aVar = this.f70260a.f70254b;
            if (aVar != null) {
                aVar.mo54334a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$f */
    static final class C26660f extends C52712l implements C52670a<AdBottomDialogConfirmView> {

        /* renamed from: a */
        final /* synthetic */ C26653b f70261a;

        C26660f(C26653b bVar) {
            this.f70261a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AdBottomDialogConfirmView) this.f70261a.findViewById(R.id.yn);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$g */
    static final class C26661g extends C52712l implements C52670a<DatePicker> {

        /* renamed from: a */
        final /* synthetic */ C26653b f70262a;

        C26661g(C26653b bVar) {
            this.f70262a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DatePicker) this.f70262a.findViewById(R.id.e4i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$h */
    static final class C26662h implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C26653b f70263a;

        C26662h(C26653b bVar) {
            this.f70263a = bVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            long j;
            DatePicker b = this.f70263a.mo42942b();
            if (b != null) {
                C26656c cVar = this.f70263a.f70255c;
                if (cVar != null) {
                    str = cVar.f70258a;
                } else {
                    str = null;
                }
                Long a = C26653b.m64473a(str);
                if (a != null) {
                    j = a.longValue();
                } else {
                    j = System.currentTimeMillis();
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                gregorianCalendar.setTimeInMillis(j);
                b.mo55074a(gregorianCalendar.getTime());
            }
        }
    }

    /* renamed from: a */
    public final int mo54484a() {
        return R.layout.b91;
    }

    /* renamed from: b */
    public final DatePicker mo42942b() {
        return (DatePicker) this.f70256e.getValue();
    }

    /* renamed from: a */
    public static Long m64473a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Date parse = simpleDateFormat.parse(str);
            C52711k.m112236a((Object) parse, "format.parse(dateStr)");
            return Long.valueOf(parse.getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DatePicker b = mo42942b();
        if (b != null) {
            b.setStartYear(1900);
            b.setUpperBoundDate(Calendar.getInstance());
        }
        AdBottomDialogConfirmView adBottomDialogConfirmView = (AdBottomDialogConfirmView) this.f70257f.getValue();
        if (adBottomDialogConfirmView != null) {
            adBottomDialogConfirmView.setOnClickListener(new C26658d(this));
            adBottomDialogConfirmView.setClickable(true);
        }
        setOnCancelListener(new C26659e(this));
        setOnShowListener(new C26662h(this));
    }

    public C26653b(Context context, C26656c cVar) {
        super(context);
        this.f70255c = cVar;
    }
}
