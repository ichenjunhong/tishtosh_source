package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1058a.C17417i;
import com.p683ss.android.ugc.aweme.login.utils.C36331b;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactModel */
public class ContactModel {
    @C17950a(mo34824a = false, mo34825b = false)
    public String firstName;
    @C17952c(mo34828a = "invited")
    @C17950a
    public boolean invited;
    @C17950a(mo34824a = false, mo34825b = false)
    public String lastName;
    @C17950a(mo34824a = false, mo34825b = false)
    public String mSection;
    @C17952c(mo34828a = "name")
    @C17950a
    public String name;
    @C17950a(mo34824a = false, mo34825b = false)
    public int originIndex;
    @C17952c(mo34828a = "phone_number")
    @C17950a
    public String phoneNumber;
    @C17950a(mo34824a = false, mo34825b = false)
    public String url;

    public ContactModel() {
    }

    public String nationalNumber() {
        return C36331b.m81966a(this.phoneNumber);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.phoneNumber, this.name});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactModel contactModel = (ContactModel) obj;
        if (!C17417i.m42646a(this.phoneNumber, contactModel.phoneNumber) || !C17417i.m42646a(this.name, contactModel.name)) {
            return false;
        }
        return true;
    }

    public ContactModel(String str, String str2) {
        this.phoneNumber = str;
        this.name = str2;
    }
}
