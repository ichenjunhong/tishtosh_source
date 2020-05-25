package com.p683ss.android.download;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.Formatter;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.download.SizeLimitActivity */
public class SizeLimitActivity extends Activity implements OnClickListener {

    /* renamed from: a */
    private Dialog f52530a;

    /* renamed from: b */
    private Queue<Intent> f52531b = new LinkedList();

    /* renamed from: c */
    private Uri f52532c;

    /* renamed from: d */
    private Intent f52533d;

    /* renamed from: b */
    private void m46461b() {
        this.f52530a = null;
        this.f52532c = null;
        m46459a();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            this.f52531b.add(intent);
            setIntent(null);
            m46459a();
        }
        if (this.f52530a != null && !this.f52530a.isShowing()) {
            this.f52530a.show();
        }
    }

    /* renamed from: a */
    private void m46459a() {
        if (this.f52530a == null) {
            if (this.f52531b.isEmpty()) {
                finish();
                return;
            }
            this.f52533d = (Intent) this.f52531b.poll();
            this.f52532c = this.f52533d.getData();
            if (this.f52532c == null) {
                m46461b();
                return;
            }
            Cursor a = C19117g.m46591a(getApplicationContext()).mo39054a(this.f52532c, (String[]) null, (String) null, (String[]) null, (String) null);
            try {
                if (!a.moveToFirst()) {
                    m46461b();
                    if (a != null) {
                        try {
                            a.close();
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                m46460a(a);
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused4) {
                    }
                }
            } finally {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Exception unused5) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* renamed from: a */
    private void m46460a(Cursor cursor) {
        String formatFileSize = Formatter.formatFileSize(this, (long) cursor.getInt(cursor.getColumnIndexOrThrow("total_bytes")));
        String string = getString(R.string.vp);
        boolean z = this.f52533d.getExtras().getBoolean("isWifiRequired");
        C11105a b = C19129n.m46629b((Context) this);
        if (z) {
            b.mo20135a((int) R.string.ffi).mo20146b((CharSequence) getString(R.string.ffh, new Object[]{formatFileSize, string})).mo20136a((int) R.string.vp, (OnClickListener) this).mo20145b((int) R.string.vk, (OnClickListener) this);
        } else {
            b.mo20135a((int) R.string.ffg).mo20146b((CharSequence) getString(R.string.fff, new Object[]{formatFileSize, string})).mo20136a((int) R.string.vq, (OnClickListener) this).mo20145b((int) R.string.vp, (OnClickListener) this);
        }
        this.f52530a = b.mo20137a((OnCancelListener) new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                SizeLimitActivity.this.finish();
            }
        }).mo20148b();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f52533d.getExtras().getBoolean("isWifiRequired");
        if (z && i == -2) {
            C19117g.m46591a(getApplicationContext()).mo39053a(this.f52532c, null, null);
        } else if (!z && i == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("bypass_recommended_size_limit", Boolean.valueOf(true));
            C19117g.m46591a(getApplicationContext()).mo39052a(this.f52532c, contentValues, (String) null, (String[]) null);
        }
        m46461b();
    }
}
