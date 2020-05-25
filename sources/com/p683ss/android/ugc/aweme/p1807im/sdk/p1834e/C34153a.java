package com.p683ss.android.ugc.aweme.p1807im.sdk.p1834e;

import android.graphics.Paint.FontMetricsInt;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import android.util.Pair;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33684p.C33685a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EPlatformCardContent.LinkItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.e.a */
public final class C34153a {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.e.a$a */
    public static class C34154a implements LineHeightSpan {

        /* renamed from: a */
        int f88262a;

        /* renamed from: b */
        int f88263b;

        /* renamed from: c */
        int f88264c;

        /* renamed from: d */
        int f88265d;

        /* renamed from: e */
        int f88266e;

        C34154a(int i, int i2, int i3) {
            this.f88262a = i;
            this.f88265d = i2;
            this.f88266e = i3;
        }

        public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, FontMetricsInt fontMetricsInt) {
            if (this.f88263b == 0 && this.f88264c == 0) {
                this.f88263b = fontMetricsInt.ascent;
                this.f88264c = fontMetricsInt.ascent - this.f88262a;
            }
            if (i == this.f88265d) {
                fontMetricsInt.ascent = this.f88264c;
            } else {
                fontMetricsInt.ascent = this.f88263b;
            }
        }
    }

    /* renamed from: a */
    public static void m77970a(TextView textView, String str, Map<String, LinkItem> map, String str2, long j, int i) {
        boolean z;
        Map<String, LinkItem> map2 = map;
        if (map2 == null || map.isEmpty()) {
            TextView textView2 = textView;
            String str3 = str;
            ((MarginLayoutParams) textView.getLayoutParams()).bottomMargin = 0;
            textView.setText(str);
            return;
        }
        ((MarginLayoutParams) textView.getLayoutParams()).bottomMargin = (int) C9432q.m18687b(textView.getContext(), 5.0f);
        ArrayList<Pair> arrayList = new ArrayList<>();
        TreeMap treeMap = new TreeMap(C34155b.f88267a);
        for (String str4 : map.keySet()) {
            String str5 = str;
            treeMap.put(Integer.valueOf(str.indexOf(str4)), str4);
        }
        String str6 = str;
        for (String str7 : treeMap.values()) {
            LinkItem linkItem = (LinkItem) map2.get(str7);
            StringBuilder sb = new StringBuilder("{{");
            sb.append(str7);
            sb.append("}}");
            String sb2 = sb.toString();
            int indexOf = str6.indexOf(sb2);
            if (linkItem != null) {
                arrayList.add(new Pair(Integer.valueOf(indexOf), linkItem));
                str6 = str6.replace(sb2, linkItem.name);
            }
        }
        SpannableString spannableString = new SpannableString(str6);
        for (Pair pair : arrayList) {
            if (((LinkItem) pair.second).extraParams == null || !TextUtils.equals(((LinkItem) pair.second).extraParams.showMoreButton, "0")) {
                z = true;
            } else {
                z = false;
            }
            C33685a aVar = new C33685a(textView.getContext(), str2, j, (LinkItem) pair.second, i, z);
            spannableString.setSpan(aVar, ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((LinkItem) pair.second).name.length(), 33);
            spannableString.setSpan(new C34154a((int) C9432q.m18687b(textView.getContext(), 12.0f), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((LinkItem) pair.second).name.length()), ((Integer) pair.first).intValue(), ((Integer) pair.first).intValue() + ((LinkItem) pair.second).name.length(), 33);
        }
        TextView textView3 = textView;
        textView.setText(spannableString);
    }
}
