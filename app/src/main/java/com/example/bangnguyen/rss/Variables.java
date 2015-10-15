package com.example.bangnguyen.rss;

import java.util.HashMap;
import java.util.List;



public class Variables {
    public static final String[] PAPERS = { "Vnexpress", "Vietnamnet",
            "Dân trí", "24h" };
    public static final int[] ICONS = {R.drawable.vnexpress,
            R.drawable.vietnamnet, R.drawable.dantri, R.drawable.bao24h };

    // Vnexpress
    public static final String[] VNEXPRESS_CATEGORIES = { "Trang chủ",
            "Xã hội", "Thế giới", "Kinh doanh", "Văn hóa - Đời sống",
            "Thể thao", "Pháp luật", "Khoa học", "Số hóa", "Ô tô - Xe máy",
            "Bạn đọc viết", "Tâm sự", "Cười" };
    public static final String[] VNEXPRESS_LINKS = {
            "http://vnexpress.net/rss/tin-moi-nhat.rss",
            "http://vnexpress.net/rss/xa-hoi.rss",
            "http://vnexpress.net/rss/the-gioi.rss",
            "http://kinhdoanh.vnexpress.net/rss",
            "http://giaitri.vnexpress.net/rss",
            "http://thethao.vnexpress.net/rss/tin-moi-nhat.rss",
            "http://vnexpress.net/rss/phap-luat.rss",
            "http://vnexpress.net/rss/khoa-hoc.rss",
            "http://sohoa.vnexpress.net/rss",
            "http://vnexpress.net/rss/oto-xe-may.rss",
            "http://vnexpress.net/rss/ban-doc-viet.rss",
            "http://vnexpress.net/rss/tam-su.rss",
            "http://vnexpress.net/rss/cuoi.rss" };

    // Vietnamnet
    public static final String[] VNN_CATEGORIES = { "Trang chủ",
            "Tin mới nóng", "Xã hội", "Giáo dục", "Chính trị", "Đời sống",
            "Kinh tế", "Quốc tế", "Văn hóa", "Khoa học", "CNTT - Viễn thông",
            "Bạn đọc" };
    public static final String[] VNN_LINKS = {
            "http://vietnamnet.vn/rss/home.rss",
            "http://vietnamnet.vn/rss/moi-nong.rss",
            "http://vietnamnet.vn/rss/xa-hoi.rss",
            "http://vietnamnet.vn/rss/giao-duc.rss",
            "http://vietnamnet.vn/rss/chinh-tri.rss",
            "http://vietnamnet.vn/rss/doi-song.rss",
            "http://vietnamnet.vn/rss/kinh-te.rss",
            "http://vietnamnet.vn/rss/quoc-te.rss",
            "http://vietnamnet.vn/rss/van-hoa.rss",
            "http://vietnamnet.vn/rss/khoa-hoc.rss",
            "http://vietnamnet.vn/rss/cong-nghe-thong-tin-vien-thong.rss",
            "http://vietnamnet.vn/rss/ban-doc-phap-luat.rss" };

    // Dân trí
    public static final String[] DANTRI_CATEGORIES = { "Trang chủ", "Xã hội",
            "Thế giới", "Thể thao", "Giáo dục - Khuyến học", "Kinh doanh",
            "Văn hóa", "Giải trí", "Pháp luật", "Nhịp sống trẻ",
            "Tình yêu giới tính", "Sức khỏe", "Sức mạnh số", "Ô tô - Xe máy",
            "Bạn đọc", "Chuyện lạ", "Tuyển sinh", "Du học", "Blog",
            "Nghề nghiệp", "Games" };
    public static final String[] DANTRI_LINKS = {
            "http://dantri.com.vn/trangchu.rss",
            "http://dantri.com.vn/xa-hoi.rss",
            "http://dantri.com.vn/Thegioi.rss",
            "http://dantri.com.vn/The-Thao.rss",
            "http://dantri.com.vn/giaoduc-khuyenhoc.rss",
            "http://dantri.com.vn/kinhdoanh.rss",
            "http://dantri.com.vn/van-hoa.rss",
            "http://dantri.com.vn/giaitri.rss",
            "http://dantri.com.vn/skphapluat.rss",
            "http://dantri.com.vn/nhipsongtre.rss",
            "http://dantri.com.vn/tinhyeu-gioitinh.rss",
            "http://dantri.com.vn/suckhoe.rss",
            "http://dantri.com.vn/cong-nghe.rss",
            "http://dantri.com.vn/otoxemay.rss",
            "http://dantri.com.vn/diendan-bandoc.rss",
            "http://dantri.com.vn/chuyen-la.rss",
            "http://dantri.com.vn/tuyen-sinh.rss",
            "http://dantri.com.vn/du-hoc.rss", "http://dantri.com.vn/blog.rss",
            "http://dantri.com.vn/nghe-nghiep.rss",
            "http://dantri.com.vn/games_asp_.rss" };

    // Báo 24h
    public static final String[] BAO24H_CATEGORIES = { "Tin tức trong ngày",
            "Bóng đá", "An ninh - Hình sự", "Thời trang", "Thời trang Hi-tech",
            "Tài chính – Bất động sản", "Ẩm thực", "Làm đẹp", "Phim",
            "Giáo dục - du học", "Bạn trẻ - Cuộc sống", "Ca nhạc - MTV",
            "Thể thao", "Phi thường - kỳ quặc", "Công nghệ thông tin",
            "Ô tô - Xe máy", "Thị trường - Tiêu dùng", "Du lịch",
            "Sức khỏe đời sống", "Cười 24h" };
    public static final String[] BAO24H_LINKS = {
            "http://www.24h.com.vn/upload/rss/tintuctrongngay.rss",
            "http://www.24h.com.vn/upload/rss/bongda.rss",
            "http://www.24h.com.vn/upload/rss/anninhhinhsu.rss",
            "http://www.24h.com.vn/upload/rss/thoitrang.rss",
            "http://www.24h.com.vn/upload/rss/thoitranghitech.rss",
            "http://www.24h.com.vn/upload/rss/taichinhbatdongsan.rss",
            "http://www.24h.com.vn/upload/rss/amthuc.rss",
            "http://www.24h.com.vn/upload/rss/lamdep.rss",
            "http://www.24h.com.vn/upload/rss/phim.rss",
            "http://www.24h.com.vn/upload/rss/giaoducduhoc.rss",
            "http://www.24h.com.vn/upload/rss/bantrecuocsong.rss",
            "http://www.24h.com.vn/upload/rss/canhacmtv.rss",
            "http://www.24h.com.vn/upload/rss/thethao.rss",
            "http://www.24h.com.vn/upload/rss/phithuongkyquac.rss",
            "http://www.24h.com.vn/upload/rss/congnghethongtin.rss",
            "http://www.24h.com.vn/upload/rss/otoxemay.rss",
            "http://www.24h.com.vn/upload/rss/thitruongtieudung.rss",
            "http://www.24h.com.vn/upload/rss/dulich.rss",
            "http://www.24h.com.vn/upload/rss/suckhoedoisong.rss",
            "http://www.24h.com.vn/upload/rss/cuoi24h.rss" };

    // All
    public static final String[][] CATEGORIES = { VNEXPRESS_CATEGORIES,
            VNN_CATEGORIES, DANTRI_CATEGORIES, BAO24H_CATEGORIES };
    public static final String[][] LINKS = { VNEXPRESS_LINKS, VNN_LINKS,
            DANTRI_LINKS, BAO24H_LINKS };

    public static final String PAPER = "paper";
    public static final String CATEGORY = "category";
    public static final String LINK = "link";
    public static HashMap<Integer, List<RssItem>> newsMap = new HashMap<Integer, List<RssItem>>();
}
