package com.p683ss.android.ugc.aweme.mobile;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.mobile.EditProfileActivityV2_ViewBinding */
public class EditProfileActivityV2_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditProfileActivityV2 f94791a;

    /* renamed from: b */
    private View f94792b;

    public void unbind() {
        EditProfileActivityV2 editProfileActivityV2 = this.f94791a;
        if (editProfileActivityV2 != null) {
            this.f94791a = null;
            editProfileActivityV2.mAvatar = null;
            editProfileActivityV2.mUsernameEdit = null;
            editProfileActivityV2.mBtnEnterAweme = null;
            editProfileActivityV2.txtExtra = null;
            this.f94792b.setOnClickListener(null);
            this.f94792b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditProfileActivityV2_ViewBinding(final EditProfileActivityV2 editProfileActivityV2, View view) {
        this.f94791a = editProfileActivityV2;
        editProfileActivityV2.mAvatar = (SmartImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'mAvatar'", SmartImageView.class);
        editProfileActivityV2.mUsernameEdit = (EditText) Utils.findRequiredViewAsType(view, R.id.do1, "field 'mUsernameEdit'", EditText.class);
        editProfileActivityV2.mBtnEnterAweme = (Button) Utils.findRequiredViewAsType(view, R.id.ag2, "field 'mBtnEnterAweme'", Button.class);
        editProfileActivityV2.txtExtra = (TextView) Utils.findRequiredViewAsType(view, R.id.cyo, "field 'txtExtra'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.dk9, "method 'editBirthday'");
        this.f94792b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                editProfileActivityV2.editBirthday(view);
            }
        });
    }
}
