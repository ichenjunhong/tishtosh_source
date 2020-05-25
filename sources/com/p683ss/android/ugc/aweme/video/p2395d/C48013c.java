package com.p683ss.android.ugc.aweme.video.p2395d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.video.d.c */
public final class C48013c {

    /* renamed from: a */
    public ViewGroup f120680a;

    /* renamed from: b */
    public TableLayout f120681b;

    /* renamed from: c */
    private Context f120682c;

    /* renamed from: com.ss.android.ugc.aweme.video.d.c$a */
    static class C48015a {

        /* renamed from: a */
        public TextView f120683a;

        /* renamed from: b */
        public TextView f120684b;

        private C48015a() {
        }

        /* renamed from: a */
        public final void mo95241a(String str) {
            if (this.f120684b != null) {
                this.f120684b.setText(str);
            }
        }
    }

    public C48013c(Context context) {
        this(context, R.layout.afm);
    }

    /* renamed from: a */
    private static C48015a m103928a(View view) {
        C48015a aVar = (C48015a) view.getTag();
        if (aVar != null) {
            return aVar;
        }
        C48015a aVar2 = new C48015a();
        aVar2.f120683a = (TextView) view.findViewById(R.id.bpp);
        aVar2.f120684b = (TextView) view.findViewById(R.id.do9);
        view.setTag(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public final void mo95240a(View view, String str) {
        m103928a(view).mo95241a(str);
    }

    /* renamed from: a */
    public final View mo95239a(int i, String str) {
        return m103927a(this.f120682c.getString(i), str);
    }

    private C48013c(Context context, int i) {
        this.f120682c = context;
        this.f120680a = (ViewGroup) LayoutInflater.from(this.f120682c).inflate(R.layout.afm, null);
        this.f120681b = (TableLayout) this.f120680a.findViewById(R.id.cx8);
    }

    /* renamed from: a */
    private View m103927a(String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f120682c).inflate(R.layout.afo, this.f120681b, false);
        C48015a a = m103928a(viewGroup);
        if (a.f120683a != null) {
            a.f120683a.setText(str);
        }
        a.mo95241a(str2);
        this.f120681b.addView(viewGroup);
        return viewGroup;
    }
}
