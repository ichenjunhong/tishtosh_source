package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sticker.data.Address;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.b */
public final class C39118b implements Serializable {
    @C17952c(mo34828a = "address")
    public String address;
    @C17952c(mo34828a = "city")
    public String city;
    @C17952c(mo34828a = "city_code")
    public String cityCode;
    @C17952c(mo34828a = "country")
    public String country;
    @C17952c(mo34828a = "country_code")
    public String countryCode;
    @C17952c(mo34828a = "district")
    public String district;
    @C17952c(mo34828a = "province")
    public String province;
    @C17952c(mo34828a = "simple_addr")
    public String simpleAddr;

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCityCode() {
        return this.cityCode;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getSimpleAddr() {
        return this.simpleAddr;
    }

    public final Address toStickerPoiCard() {
        Address address2 = new Address();
        address2.setProvice(this.province);
        address2.setCity(this.city);
        address2.setDistrict(this.district);
        address2.setAddress(this.address);
        address2.setSimpleAddr(this.simpleAddr);
        return address2;
    }

    public final void setCityCode(String str) {
        this.cityCode = str;
    }

    public final void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }

    public final void fromStickerPoiStruct(Address address2) {
        if (address2 != null) {
            this.province = address2.getProvice();
            this.city = address2.getCity();
            this.district = address2.getDistrict();
            this.address = address2.getAddress();
            this.simpleAddr = address2.getSimpleAddr();
        }
    }
}
