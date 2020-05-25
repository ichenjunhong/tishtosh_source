package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.experiment.HomeUIOptimizeTitleSize;
import com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.aq */
public final class C30765aq {

    /* renamed from: a */
    DmtTextView f80615a;

    /* renamed from: b */
    TextView f80616b;

    /* renamed from: c */
    Aweme f80617c;

    /* renamed from: d */
    public DataCenter f80618d;

    /* renamed from: e */
    String f80619e = "";

    /* renamed from: f */
    public final Context f80620f;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.aq$a */
    static final class C30766a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30765aq f80621a;

        C30766a(C30765aq aqVar) {
            this.f80621a = aqVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DataCenter dataCenter = this.f80621a.f80618d;
            if (dataCenter != null) {
                dataCenter.mo48228a("title_view_click", (Object) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo63466a() {
        TextView textView = this.f80616b;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingTop());
        }
        C23729p.m58257a((View) this.f80615a, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo63467a(String str) {
        TextView textView = this.f80616b;
        if (textView != null) {
            textView.setPadding(0, textView.getPaddingTop(), 0, 0);
        }
        DmtTextView dmtTextView = this.f80615a;
        if (dmtTextView != null) {
            dmtTextView.setText(str);
        }
        C23729p.m58257a((View) this.f80615a, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo63469c(String str) {
        String str2;
        try {
            if (PlayerRedesignExperiment.m70953a() == 0) {
                Context context = this.f80620f;
                Object[] objArr = new Object[1];
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                objArr[0] = str2;
                String string = context.getString(R.string.b21, objArr);
                C52711k.m112236a((Object) string, "mContext.getString(R.str…g.feed_title, name ?: \"\")");
                return string;
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Throwable unused) {
            if (str == null) {
                str = "";
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo63468b(String str) {
        if (PlayerRedesignExperiment.m70953a() == 0) {
            StringBuilder sb = new StringBuilder("· ");
            String string = this.f80620f.getString(R.string.zk);
            C52711k.m112236a((Object) string, "mContext.getString(R.string.challenge_view_count)");
            String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{str}, 1));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            sb.append(a);
            return sb.toString();
        }
        String string2 = this.f80620f.getString(R.string.zk);
        C52711k.m112236a((Object) string2, "mContext.getString(R.string.challenge_view_count)");
        String a2 = C2240a.m6772a(string2, Arrays.copyOf(new Object[]{str}, 1));
        C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
        return a2;
    }

    public C30765aq(View view, OnTouchListener onTouchListener, Context context) {
        DmtTextView dmtTextView;
        C52711k.m112240b(context, "mContext");
        this.f80620f = context;
        TextView textView = null;
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.ddv);
        } else {
            dmtTextView = null;
        }
        this.f80615a = dmtTextView;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.title);
        }
        this.f80616b = textView;
        TextView textView2 = this.f80616b;
        if (textView2 != null) {
            textView2.setOnTouchListener(onTouchListener);
        }
        if (HomeUIOptimizeTitleSize.m70949a()) {
            DmtTextView dmtTextView2 = this.f80615a;
            if (dmtTextView2 != null) {
                dmtTextView2.setTextSize(2, 17.0f);
            }
            TextView textView3 = this.f80616b;
            if (textView3 != null) {
                textView3.setTextSize(2, 17.0f);
            }
        }
    }
}
