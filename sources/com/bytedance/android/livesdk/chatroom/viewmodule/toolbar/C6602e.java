package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6433c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.e */
public final class C6602e extends PopupWindow {

    /* renamed from: a */
    protected Context f17950a;

    /* renamed from: b */
    C6609j f17951b = ((C6609j) C6610k.m13986b());

    /* renamed from: a */
    public final void mo12674a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, 85, C3922z.m9899a(8.0f), (C3922z.m9902a((Activity) this.f17950a).heightPixels - iArr[1]) + C3922z.m9899a(8.0f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12675b(View view) {
        C6605h hVar = (C6605h) view.getTag();
        C6601a b = this.f17951b.mo12685b(hVar);
        if (b != null) {
            b.onClick(view);
            if (!(hVar == C6605h.REVERSE_CAMERA || hVar == C6605h.REVERSE_MIRROR)) {
                dismiss();
            }
        }
        C6611l a = C6611l.m13991a();
        C6613a b2 = a.mo12689b(hVar.name());
        if (b2 != null) {
            b2.f17971c = b2.f17970b;
            a.mo12691c();
            if (!a.mo12690b()) {
                C6610k.m13985a().mo12667a(C6605h.MORE, (C6597a) new C6433c(false));
            }
        }
        m13968a(view.findViewById(R.id.cam), hVar.name());
    }

    /* renamed from: a */
    private static void m13968a(View view, String str) {
        int i;
        if (view != null && !TextUtils.isEmpty(str)) {
            if (C6611l.m13991a().mo12688a(str)) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public C6602e(Context context, List<C6605h> list) {
        super(context);
        this.f17950a = context;
        Map<C6605h, View> map = this.f17951b.f17961b;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ahq, null);
        setWidth(-2);
        setHeight(-2);
        setContentView(linearLayout);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setWindowLayoutMode(-2, -2);
        setAnimationStyle(R.style.y5);
        LayoutInflater from = LayoutInflater.from(context);
        for (C6605h hVar : list) {
            View inflate = from.inflate(R.layout.alg, linearLayout, false);
            inflate.setLayoutParams(new LayoutParams(-1, -2));
            inflate.findViewById(R.id.aqa).setBackgroundResource(hVar.getDrawableFolded());
            ((TextView) inflate.findViewById(R.id.bpp)).setText(hVar.getTitleId());
            m13968a(inflate.findViewById(R.id.cam), hVar.name());
            inflate.setTag(hVar);
            linearLayout.addView(inflate);
            map.put(hVar, inflate);
            this.f17951b.mo12683a(hVar, inflate);
            inflate.setOnClickListener(new C6603f(this));
        }
        setOnDismissListener(new C6604g(this));
    }
}
