package com.example.hungn.fbr;

/**
 * Created by hungn on 4/10/2017.
 */

public class itemlv_mtv {
    public String getChuto_mtv() {
        return chuto_mtv;
    }

    public void setChuto_mtv(String chuto_mtv) {
        this.chuto_mtv = chuto_mtv;
    }

    public String getChunho_mtv() {
        return chunho_mtv;
    }

    public void setChunho_mtv(String chunho_mtv) {
        this.chunho_mtv = chunho_mtv;
    }

    public int getAnh_mtv() {
        return anh_mtv;
    }

    public void setAnh_mtv(int anh_mtv) {
        this.anh_mtv = anh_mtv;
    }

    public itemlv_mtv(String chuto_mtv, String chunho_mtv, int anh_mtv) {
        this.chuto_mtv = chuto_mtv;
        this.chunho_mtv = chunho_mtv;
        this.anh_mtv = anh_mtv;
    }

    private String chuto_mtv;
    private String chunho_mtv;
    private int anh_mtv;
}
