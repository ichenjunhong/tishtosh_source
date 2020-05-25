package com.p683ss.android.ugc.aweme.commercialize.p1572im;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.ItemInputMenu */
public class ItemInputMenu extends LinearLayout {
    public ItemInputMenu(Context context) {
        super(context);
    }

    public void setLeftVisible(int i) {
        View findViewById = findViewById(R.id.bl5);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    public void setText(String str) {
        TextView textView = (TextView) findViewById(R.id.bl7);
        if (textView != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    public ItemInputMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemInputMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
