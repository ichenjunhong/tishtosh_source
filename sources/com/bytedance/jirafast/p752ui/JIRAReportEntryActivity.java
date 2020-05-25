package com.bytedance.jirafast.p752ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.jirafast.C11991a;
import com.bytedance.jirafast.p751d.C12015a;
import com.bytedance.jirafast.p751d.C12020d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.bytedance.jirafast.ui.JIRAReportEntryActivity */
public class JIRAReportEntryActivity extends AppCompatActivity implements OnClickListener {

    /* renamed from: a */
    private String f31913a;

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ery) {
            C12020d a = C12020d.m24434a();
            String str = this.f31913a;
            if (a.f31796b != null) {
                a.f31796b.mo22734a(this, str);
            }
            finish();
        } else if (id == R.id.e0z) {
            Intent intent = new Intent(this, JIRACreateIssueActivity.class);
            intent.putExtras(getIntent());
            intent.setFlags(268435456);
            C11991a.m24390a().startActivity(intent);
        } else {
            if (id == R.id.qa) {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.axa);
        ImageView imageView = (ImageView) findViewById(R.id.c49);
        TextView textView = (TextView) findViewById(R.id.ery);
        TextView textView2 = (TextView) findViewById(R.id.e0z);
        findViewById(R.id.qa).setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        if (C12015a.m24416a().mo22758c(C12015a.f31782w)) {
            textView.setVisibility(8);
            textView2.setText("Report an issue");
        }
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("imgfilepath");
        if (!C9376b.m18558a((Collection<T>) stringArrayListExtra)) {
            this.f31913a = (String) stringArrayListExtra.get(0);
            File file = new File(this.f31913a);
            if (file.exists()) {
                imageView.setImageURI(Uri.fromFile(file));
            }
        }
    }
}
