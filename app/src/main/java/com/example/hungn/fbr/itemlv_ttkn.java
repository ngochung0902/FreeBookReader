package com.example.hungn.fbr;

/**
 * Created by hungn on 4/14/2017.
 */

public class itemlv_ttkn {
    private String chuto_ttkn;
    private String chunho_ttkn;
    private int anh_ttkn;

    public itemlv_ttkn(String chuto_ttkn, String chunho_ttkn, int anh_ttkn) {
        this.chuto_ttkn = chuto_ttkn;
        this.chunho_ttkn = chunho_ttkn;
        this.anh_ttkn = anh_ttkn;
    }

    public String getChuto_ttkn() {
        return chuto_ttkn;
    }

    public void setChuto_ttkn(String chuto_ttkn) {
        this.chuto_ttkn = chuto_ttkn;
    }

    public String getChunho_ttkn() {
        return chunho_ttkn;
    }

    public void setChunho_ttkn(String chunho_ttkn) {
        this.chunho_ttkn = chunho_ttkn;
    }

    public int getAnh_ttkn() {
        return anh_ttkn;
    }

    public void setAnh_ttkn(int anh_ttkn) {
        this.anh_ttkn = anh_ttkn;
    }
}
