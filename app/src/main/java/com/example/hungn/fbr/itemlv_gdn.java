package com.example.hungn.fbr;

/**
 * Created by hungn on 4/12/2017.
 */

public class itemlv_gdn {
    public String getChuto_gdn() {
        return chuto_gdn;
    }

    public void setChuto_gdn(String chuto_gdn) {
        this.chuto_gdn = chuto_gdn;
    }

    public String getChunho_gdn() {
        return chunho_gdn;
    }

    public void setChunho_gdn(String chunho_gdn) {
        this.chunho_gdn = chunho_gdn;
    }

    public int getAnh_gdn() {
        return anh_gdn;
    }

    public void setAnh_gdn(int anh_gdn) {
        this.anh_gdn = anh_gdn;
    }

    public itemlv_gdn(String chuto_gdn, String chunho_gdn, int anh_gdn) {
        this.chuto_gdn = chuto_gdn;
        this.chunho_gdn = chunho_gdn;
        this.anh_gdn = anh_gdn;
    }

    private String chuto_gdn;
    private String chunho_gdn;
    private int anh_gdn;
}
