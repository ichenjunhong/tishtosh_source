package com.bytedance.jirafast.p748a;

import android.net.Uri;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jirafast.a.a */
public final class C11992a extends C1322a<C11993a> {

    /* renamed from: a */
    public List<String> f31722a = new ArrayList();

    /* renamed from: com.bytedance.jirafast.a.a$a */
    static class C11993a extends C1352v {

        /* renamed from: a */
        ImageView f31723a;

        /* renamed from: b */
        TextView f31724b;

        public C11993a(View view) {
            super(view);
            this.f31723a = (ImageView) view.findViewById(R.id.egh);
            this.f31724b = (TextView) view.findViewById(R.id.egi);
        }
    }

    public final int getItemCount() {
        return this.f31722a.size();
    }

    /* renamed from: a */
    public final void mo22726a(List<String> list) {
        this.f31722a = list;
        notifyDataSetChanged();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C11993a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjb, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        String str;
        C11993a aVar = (C11993a) vVar;
        File file = new File((String) this.f31722a.get(i));
        if (file.exists()) {
            aVar.f31723a.setImageURI(Uri.fromFile(file));
            long length = file.length();
            if (length < 0) {
                str = "0";
            } else {
                String[] strArr = {"B", "kB", "MB", "GB", "TB"};
                double d = (double) length;
                int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
                StringBuilder sb = new StringBuilder();
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.#");
                double pow = Math.pow(1024.0d, (double) log10);
                Double.isNaN(d);
                sb.append(decimalFormat.format(d / pow));
                sb.append(" ");
                sb.append(strArr[log10]);
                str = sb.toString();
            }
            aVar.f31724b.setText(str);
        }
    }
}
