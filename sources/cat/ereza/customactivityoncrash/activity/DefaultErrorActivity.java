package cat.ereza.customactivityoncrash.activity;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cat.ereza.customactivityoncrash.C2207a;
import cat.ereza.customactivityoncrash.C2207a.C2210a;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;

public final class DefaultErrorActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        final C2210a aVar;
        super.onCreate(bundle);
        setContentView(R.layout.iu);
        Button button = (Button) findViewById(R.id.a2z);
        final Class b = C2207a.m6684b(getIntent());
        Serializable serializableExtra = getIntent().getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER");
        if (serializableExtra == null || !(serializableExtra instanceof C2210a)) {
            aVar = null;
        } else {
            aVar = (C2210a) serializableExtra;
        }
        if (b != null) {
            button.setText(R.string.ane);
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C2207a.m6678a(DefaultErrorActivity.this, new Intent(DefaultErrorActivity.this, b), aVar);
                }
            });
        } else {
            button.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C2207a.m6679a((Activity) DefaultErrorActivity.this, aVar);
                }
            });
        }
        Button button2 = (Button) findViewById(R.id.a2y);
        if (getIntent().getBooleanExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", true)) {
            button2.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ((TextView) new Builder(DefaultErrorActivity.this).setTitle(R.string.anc).setMessage(C2207a.m6673a((Context) DefaultErrorActivity.this, DefaultErrorActivity.this.getIntent())).setPositiveButton(R.string.an_, null).setNeutralButton(R.string.anb, new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DefaultErrorActivity defaultErrorActivity = DefaultErrorActivity.this;
                            String a = C2207a.m6673a((Context) defaultErrorActivity, defaultErrorActivity.getIntent());
                            if (VERSION.SDK_INT >= 11) {
                                ((ClipboardManager) defaultErrorActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(R.string.an9), a));
                            } else {
                                ((android.text.ClipboardManager) defaultErrorActivity.getSystemService("clipboard")).setText(a);
                            }
                            Toast makeText = Toast.makeText(DefaultErrorActivity.this, R.string.ana, 0);
                            if (VERSION.SDK_INT == 25) {
                                C47905fy.m103630a(makeText);
                            }
                            makeText.show();
                        }
                    }).show().findViewById(16908299)).setTextSize(0, DefaultErrorActivity.this.getResources().getDimension(R.dimen.f6));
                }
            });
        } else {
            button2.setVisibility(8);
        }
        int intExtra = getIntent().getIntExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", 2131952803);
        ImageView imageView = (ImageView) findViewById(R.id.a2x);
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageDrawable(getResources().getDrawable(intExtra, getTheme()));
        } else {
            imageView.setImageDrawable(getResources().getDrawable(intExtra));
        }
    }
}
