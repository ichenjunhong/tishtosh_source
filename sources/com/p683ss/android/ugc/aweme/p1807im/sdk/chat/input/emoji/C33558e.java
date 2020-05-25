package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33243e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33519b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.C33728a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.e */
public final class C33558e {

    /* renamed from: a */
    public C33519b f86989a;

    /* renamed from: b */
    public C33519b f86990b;

    /* renamed from: c */
    public C33728a f86991c;

    /* renamed from: d */
    public String f86992d;

    /* renamed from: e */
    private ViewGroup f86993e;

    /* renamed from: f */
    private LinearLayout f86994f;

    /* renamed from: g */
    private int f86995g;

    /* renamed from: h */
    private int f86996h;

    /* renamed from: i */
    private int f86997i;

    /* renamed from: j */
    private int f86998j;

    /* renamed from: k */
    private int f86999k;

    /* renamed from: l */
    private int f87000l;

    /* renamed from: m */
    private int f87001m;

    /* renamed from: n */
    private View f87002n;

    /* renamed from: o */
    private Activity f87003o;

    /* renamed from: p */
    private Handler f87004p = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo71019a(List<C29366a> list) {
        int i;
        int i2;
        this.f87004p.removeCallbacksAndMessages(null);
        if (C9376b.m18558a((Collection<T>) list)) {
            if (this.f86991c != null && this.f86991c.isShowing()) {
                this.f86991c.dismiss();
            }
            return;
        }
        C35190af.m79442a();
        C35190af.m79496d(this.f86992d);
        if (list.size() == 1) {
            i2 = this.f86996h;
            i = (C9432q.m18670a(this.f86993e.getContext()) - this.f86996h) - this.f86999k;
        } else if (list.size() == 2) {
            i2 = this.f86997i;
            i = (C9432q.m18670a(this.f86993e.getContext()) - this.f86997i) - this.f86999k;
        } else {
            i2 = this.f86995g;
            i = (C9432q.m18670a(this.f86993e.getContext()) - this.f86995g) - this.f86999k;
        }
        this.f86994f.removeAllViews();
        for (C29366a a : list) {
            this.f86994f.addView(m76956a(this.f86994f.getContext(), a));
        }
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.height = this.f87001m;
        layoutParams.width = i2;
        this.f86993e.setLayoutParams(layoutParams);
        if (this.f86991c == null || !this.f86991c.isShowing()) {
            this.f86991c = new C33728a();
        } else {
            this.f86991c.dismiss();
        }
        this.f86991c.mo71778a(this.f86993e, this.f87003o, layoutParams.width, layoutParams.height);
        this.f86991c.f87495a = 0;
        this.f86991c.mo71777a(this.f87002n, i, -this.f87000l);
        this.f86991c.update(layoutParams.width, layoutParams.height);
        this.f87004p.postDelayed(new Runnable() {
            public final void run() {
                if (C33558e.this.f86991c != null && C33558e.this.f86991c.isShowing()) {
                    C33558e.this.f86991c.dismiss();
                }
            }
        }, 5000);
    }

    /* renamed from: a */
    private View m76956a(Context context, final C29366a aVar) {
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setScaleType(ScaleType.FIT_XY);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(this.f86998j, this.f86998j);
        marginLayoutParams.rightMargin = this.f86999k;
        remoteImageView.setLayoutParams(marginLayoutParams);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("file://");
        sb.append(C29473c.m69544b(aVar));
        arrayList.add(sb.toString());
        urlModel.setUrlList(arrayList);
        StringBuilder sb2 = new StringBuilder("file://");
        sb2.append(C29473c.m69544b(aVar));
        urlModel.setUri(sb2.toString());
        C35234bi.m79644b(remoteImageView, urlModel);
        remoteImageView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C29285a aVar = new C29285a();
                aVar.f76667c = C29298a.m69088b(aVar);
                aVar.f76668d = aVar;
                C33558e.this.f86990b.mo70577a(aVar);
                C33558e.this.f86989a.mo70583b();
                C35190af.m79442a();
                String str = C33558e.this.f86992d;
                String valueOf = String.valueOf(aVar.getId());
                HashMap hashMap = new HashMap();
                hashMap.put("to_user_id", str);
                hashMap.put("emoji_id", valueOf);
                C26890h.m65011a("auto_emoji_click", (Map<String, String>) hashMap);
            }
        });
        return remoteImageView;
    }

    public C33558e(C33519b bVar, View view, String str) {
        this.f86989a = bVar;
        this.f87002n = view;
        this.f86992d = str;
        this.f87003o = (Activity) view.getContext();
        this.f86990b = new C33243e(bVar, this.f87003o);
        this.f86993e = (ViewGroup) LayoutInflater.from(this.f87003o).inflate(R.layout.bfu, null);
        this.f86994f = (LinearLayout) this.f86993e.findViewById(R.id.a_u);
        this.f86996h = (int) C9432q.m18687b(this.f86993e.getContext(), 96.0f);
        this.f86997i = (int) C9432q.m18687b(this.f86993e.getContext(), 181.0f);
        this.f86995g = (int) C9432q.m18687b(this.f86993e.getContext(), 218.0f);
        this.f86998j = (int) C9432q.m18687b(this.f86993e.getContext(), 80.0f);
        this.f86999k = (int) C9432q.m18687b(this.f86993e.getContext(), 5.0f);
        this.f87000l = (int) C9432q.m18687b(this.f86993e.getContext(), 5.0f);
        this.f87001m = (int) C9432q.m18687b(this.f86993e.getContext(), 102.6f);
    }
}
