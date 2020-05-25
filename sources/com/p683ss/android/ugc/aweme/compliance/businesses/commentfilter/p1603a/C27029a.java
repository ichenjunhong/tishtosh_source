package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1603a;

import android.content.Context;
import android.os.IBinder;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1606d.C27040a;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1606d.C27042b;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1606d.C27048c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.a.a */
public final class C27029a extends C1322a<C1352v> {

    /* renamed from: a */
    public List<String> f71340a = C52575l.m112101c("");

    /* renamed from: b */
    public boolean f71341b;

    /* renamed from: c */
    public int f71342c = -1;

    /* renamed from: d */
    public View f71343d;

    /* renamed from: e */
    public boolean f71344e;

    /* renamed from: f */
    public final Context f71345f;

    /* renamed from: g */
    public final View f71346g;

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.a.a$a */
    public static final class C27030a implements C27048c {

        /* renamed from: a */
        final /* synthetic */ C27029a f71347a;

        /* renamed from: a */
        public final void mo55257a() {
            this.f71347a.f71341b = false;
            this.f71347a.f71342c = -1;
        }

        C27030a(C27029a aVar) {
            this.f71347a = aVar;
        }

        /* renamed from: a */
        public final boolean mo55260a(int i) {
            IBinder iBinder;
            if (!this.f71347a.f71341b && (this.f71347a.f71342c == -1 || this.f71347a.f71342c == i)) {
                return false;
            }
            View view = this.f71347a.f71343d;
            if (view != null) {
                view.clearFocus();
            }
            Object systemService = this.f71347a.f71345f.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view2 = this.f71347a.f71343d;
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                return true;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }

        /* renamed from: b */
        public final void mo55261b(int i) {
            IBinder iBinder;
            View view = this.f71347a.f71343d;
            if (view != null) {
                view.clearFocus();
            }
            this.f71347a.f71341b = false;
            Object systemService = this.f71347a.f71345f.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view2 = this.f71347a.f71343d;
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                this.f71347a.f71340a.remove(i);
                this.f71347a.notifyItemRemoved(i);
                C27029a aVar = this.f71347a;
                aVar.notifyItemRangeChanged(i, aVar.getItemCount() - i);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }

        /* renamed from: a */
        public final void mo55258a(int i, View view) {
            C52711k.m112240b(view, "view");
            this.f71347a.f71343d = view;
            this.f71347a.f71341b = true;
            this.f71347a.f71342c = i;
        }

        /* renamed from: a */
        public final void mo55259a(int i, String str) {
            C52711k.m112240b(str, "word");
            this.f71347a.f71340a.set(i, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.a.a$b */
    static final class C27031b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27029a f71348a;

        C27031b(C27029a aVar) {
            this.f71348a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f71348a.f71340a.size() == 51) {
                C52711k.m112236a((Object) view, "it");
                C10691a.m21549c(view.getContext(), (int) R.string.a8n, 1).mo19066a();
                return;
            }
            this.f71348a.f71340a.add(1, "");
            this.f71348a.notifyItemInserted(1);
            this.f71348a.notifyItemRangeChanged(1, this.f71348a.getItemCount() - 1);
            this.f71348a.f71344e = true;
            this.f71348a.f71341b = false;
            this.f71348a.f71342c = -1;
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final int getItemCount() {
        return this.f71340a.size();
    }

    public C27029a(Context context, View view) {
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(view, "container");
        this.f71345f = context;
        this.f71346g = view;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b7u, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…ords_edit, parent, false)");
            return new C27042b(inflate, new C27030a(this));
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b7t, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…words_add, parent, false)");
        return new C27040a(inflate2, new C27031b(this));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (vVar instanceof C27042b) {
            C27042b bVar = (C27042b) vVar;
            String str = (String) this.f71340a.get(i);
            C52711k.m112240b(str, "s");
            bVar.f71373e = i;
            CharSequence charSequence = str;
            bVar.f71372d.setText(charSequence);
            if (C52711k.m112239a((Object) C52830p.m112457c(charSequence).toString(), (Object) "")) {
                TextView textView = bVar.f71372d;
                Context context = bVar.f71372d.getContext();
                C52711k.m112236a((Object) context, "textView.context");
                textView.setTextColor(context.getResources().getColor(R.color.k));
                bVar.f71372d.setText(bVar.f71372d.getContext().getString(R.string.ffo));
            } else {
                TextView textView2 = bVar.f71372d;
                Context context2 = bVar.f71372d.getContext();
                C52711k.m112236a((Object) context2, "textView.context");
                textView2.setTextColor(context2.getResources().getColor(R.color.a7y));
            }
            bVar.f71371c.setText(charSequence);
            if (this.f71344e && i == 1) {
                bVar.mo55273a();
                this.f71344e = false;
            }
        }
    }
}
