package com.p683ss.android.ugc.aweme.sticker.data;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.Address */
public class Address implements Serializable {
    @C17952c(mo34828a = "address")
    public String address;
    @C17952c(mo34828a = "city")
    public String city;
    @C17952c(mo34828a = "district")
    public String district;
    @C17952c(mo34828a = "province")
    public String provice;
    @C17952c(mo34828a = "simple_addr")
    public String simpleAddr;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
