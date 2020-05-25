package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1058a.C17417i;
import com.p683ss.android.ugc.aweme.login.utils.C36331b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactModelV2 */
public class ContactModelV2 {
    @C17952c(mo34828a = "addresses")
    public List<String> addresses;
    @C17952c(mo34828a = "birthday")
    public String birthday;
    @C17952c(mo34828a = "department_name")
    public String department;
    @C17952c(mo34828a = "emails")
    public List<String> emails;
    public String familyName;
    public String givenName;
    @C17952c(mo34828a = "instant_message_addresses")
    public Map<String, String> instantMessageAddresses;
    @C17952c(mo34828a = "job_desc")
    public String jobDesc;
    @C17952c(mo34828a = "image_url")
    public String mImageUrl;
    @C17952c(mo34828a = "modification_date")
    public String modificationDate;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "nick_name")
    public String nickName;
    @C17952c(mo34828a = "note")
    public String note;
    @C17952c(mo34828a = "organization_name")
    public String organization;
    @C17952c(mo34828a = "phone_number")
    public List<String> phoneNumber;
    public String section;
    @C17952c(mo34828a = "urls")
    public List<String> urls;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public String nationalNumber(String str) {
        return C36331b.m81966a(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactModelV2 contactModelV2 = (ContactModelV2) obj;
        if (!C17417i.m42646a(this.phoneNumber, contactModelV2.phoneNumber) || !C17417i.m42646a(this.name, contactModelV2.name)) {
            return false;
        }
        return true;
    }
}
