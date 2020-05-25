package com.p683ss.android.ugc.aweme.color;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.color.a */
public final class C25053a extends C1322a<C25054b> {

    /* renamed from: a */
    boolean f66370a = true;

    /* renamed from: b */
    private final ArrayList<String> f66371b = new ArrayList<>();

    public final int getItemCount() {
        return this.f66371b.size();
    }

    public C25053a(Context context) {
        C52711k.m112240b(context, "context");
        String[] stringArray = context.getResources().getStringArray(R.array.b3);
        Collection collection = this.f66371b;
        C52711k.m112236a((Object) stringArray, "colors");
        C52575l.m112109a(collection, (Object[]) stringArray);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bho, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(p0.c…olor_template, p0, false)");
        return new C25054b(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        String str;
        C25054b bVar = (C25054b) vVar;
        C52711k.m112240b(bVar, "p0");
        Object obj = this.f66371b.get(i);
        C52711k.m112236a(obj, "mData[p1]");
        String str2 = (String) obj;
        boolean z = this.f66370a;
        C52711k.m112240b(str2, "color");
        TextView textView = bVar.f66372a;
        C52711k.m112236a((Object) textView, "mTextView");
        textView.setText(str2);
        View view = bVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        View view2 = bVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        Context context2 = view2.getContext();
        C52711k.m112236a((Object) context2, "itemView.context");
        int identifier = context.getResources().getIdentifier(str2, "color", context2.getPackageName());
        if (identifier != 0) {
            View view3 = bVar.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            Context context3 = view3.getContext();
            C52711k.m112236a((Object) context3, "itemView.context");
            int color = context3.getResources().getColor(identifier);
            bVar.f66373b.setBackgroundColor(color);
            TextView textView2 = bVar.f66374c;
            C52711k.m112236a((Object) textView2, "mRgbView");
            int i2 = (color >> 16) & NormalGiftView.ALPHA_255;
            int i3 = (color >> 8) & NormalGiftView.ALPHA_255;
            int i4 = color & NormalGiftView.ALPHA_255;
            int i5 = (color >> 24) & NormalGiftView.ALPHA_255;
            if (z) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(C25054b.m60900a(i5));
                sb.append(C25054b.m60900a(i2));
                sb.append(C25054b.m60900a(i3));
                sb.append(C25054b.m60900a(i4));
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("#");
                sb2.append(C25054b.m60900a(i2));
                sb2.append(C25054b.m60900a(i3));
                sb2.append(C25054b.m60900a(i4));
                sb2.append(' ');
                double d = (double) i5;
                Double.isNaN(d);
                sb2.append((int) Math.rint((d / 255.0d) * 100.0d));
                sb2.append('%');
                str = sb2.toString();
            }
            textView2.setText(str);
        }
    }
}
