package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.UploadContactsResult */
public class UploadContactsResult extends BaseResponse {
    @C17952c(mo34828a = "unregistered_contact")
    public List<ContactModel> contacts;
    @C17952c(mo34828a = "registered_user")
    public List<User> users;
}
